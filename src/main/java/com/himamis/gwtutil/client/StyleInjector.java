package com.himamis.gwtutil.client;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLLinkElement;
import elemental2.dom.HTMLStyleElement;

import java.util.ArrayList;
import java.util.List;

/** Injects stylesheets to the parent document */
public class StyleInjector {

  public static final String CLASSNAME = "ggw_resource";

  private static final List<String> stylesInLoading = new ArrayList<>();
  private static final List<Runnable> onStylesReady = new ArrayList<>();
  private final String moduleBaseUrl;

  public StyleInjector(String moduleBaseURL) {
    this.moduleBaseUrl = devModeFix(moduleBaseURL);
  }

  /**
   * @param baseUrl (relative or absolute) base url of css file
   * @param name name of the css file, without extension
   * @return this for chaining
   */
  public StyleInjector inject(String baseUrl, String name) {
    // to avoid conflicts with other elements on the page with this id
    String prefixedName = "ggbstyle_" + name;
    if (DomGlobal.document.getElementById(prefixedName) == null) {
      HTMLLinkElement element = (HTMLLinkElement) DomGlobal.document.createElement("link");

      stylesInLoading.add(name);
      element.onload =
          (e) -> {
            stylesInLoading.remove(name);
            checkIfAllStylesLoaded();
          };

      element.className = CLASSNAME;
      element.id = prefixedName;
      element.rel = "stylesheet";
      element.type = "text/css";
      element.href = moduleBaseUrl + "../" + baseUrl + "/" + name + ".css";
      DomGlobal.document.head.appendChild(element);
    }
    return this;
  }

  private static String devModeFix(String moduleBaseURL) {
    // when localhost:8888/dev is used as codebase, the styles are one level above
    return moduleBaseURL.replace(":8888/dev", ":8888");
  }

  private static void checkIfAllStylesLoaded() {
    if (stylesInLoading.isEmpty()) {
      for (Runnable r : onStylesReady) {
        r.run();
      }
      onStylesReady.clear();
    }
  }

  /**
   * @param style stylesheet content
   * @return HTML style element
   */
  public static HTMLStyleElement injectStyleSheet(String style) {
    HTMLStyleElement element = (HTMLStyleElement) DomGlobal.document.createElement("style");
    element.className = CLASSNAME;
    element.innerHTML = style;
    return element;
  }

  /** @param runnable callback to run after all styles are loaded */
  public static void onStylesLoaded(Runnable runnable) {
    onStylesReady.add(runnable);
    checkIfAllStylesLoaded();
  }
}

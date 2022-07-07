/**
 * This file is part of the ReTeX library - https://github.com/himamis/ReTeX
 *
 * <p>Copyright (C) 2015 Balazs Bencze
 *
 * <p>This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * <p>This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * <p>A copy of the GNU General Public License can be found in the file LICENSE.txt provided with
 * the source distribution of this program (see the META-INF directory in the source jar). This
 * license can also be found on the GNU website at http://www.gnu.org/licenses/gpl.html.
 *
 * <p>If you did not receive a copy of the GNU General Public License along with this program,
 * contact the lead developer, or write to the Free Software Foundation, Inc., 51 Franklin Street,
 * Fifth Floor, Boston, MA 02110-1301, USA.
 *
 * <p>Linking this library statically or dynamically with other modules is making a combined work
 * based on this library. Thus, the terms and conditions of the GNU General Public License cover the
 * whole combination.
 *
 * <p>As a special exception, the copyright holders of this library give you permission to link this
 * library with independent modules to produce an executable, regardless of the license terms of
 * these independent modules, and to copy and distribute the resulting executable under terms of
 * your choice, provided that you also meet, for each linked independent module, the terms and
 * conditions of the license of that module. An independent module is a module which is not derived
 * from or based on this library. If you modify this library, you may extend this exception to your
 * version of the library, but you are not obliged to do so. If you do not wish to do so, delete
 * this exception statement from your version.
 */
package com.himamis.retex.renderer.share.platform.parser;

public interface Node {

  // NodeType
  /** The node is an <code>Element</code>. */
  short ELEMENT_NODE = 1;
  /** The node is an <code>Attr</code>. */
  short ATTRIBUTE_NODE = 2;
  /** The node is a <code>Text</code> node. */
  short TEXT_NODE = 3;
  /** The node is a <code>CDATASection</code>. */
  short CDATA_SECTION_NODE = 4;
  /** The node is an <code>EntityReference</code>. */
  short ENTITY_REFERENCE_NODE = 5;
  /** The node is an <code>Entity</code>. */
  short ENTITY_NODE = 6;
  /** The node is a <code>ProcessingInstruction</code>. */
  short PROCESSING_INSTRUCTION_NODE = 7;
  /** The node is a <code>Comment</code>. */
  short COMMENT_NODE = 8;
  /** The node is a <code>Document</code>. */
  short DOCUMENT_NODE = 9;
  /** The node is a <code>DocumentType</code>. */
  short DOCUMENT_TYPE_NODE = 10;
  /** The node is a <code>DocumentFragment</code>. */
  short DOCUMENT_FRAGMENT_NODE = 11;
  /** The node is a <code>Notation</code>. */
  short NOTATION_NODE = 12;

  short getNodeType();

  Element castToElement();

  Attr castToAttr();
}

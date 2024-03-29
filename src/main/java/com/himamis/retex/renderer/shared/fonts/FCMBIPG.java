package com.himamis.retex.renderer.shared.fonts;

import com.himamis.retex.renderer.shared.UniFontInfo;

final class FCMBIPG extends UniFontInfo {

  FCMBIPG(final String ttfPath) {
    super(204, ttfPath, 451, 355, 1000, 0);
  }

  @Override
  protected final void initMetrics() {
    setMetrics(32, 355, 0);

    setMetrics(168, 255, 644, 0, 216);

    setMetrics(884, 224, 714, 0, 144);

    setMetrics(885, 224, 5, 215);

    setMetrics(890, 128, -32, 211, 64);

    setMetrics(900, 192, 714, 0, 150);
    setKern(913, -128, 927, -64, 937, -32, 8124, -128, 8188, -32);

    setMetrics(901, 319, 714, 0, 206);

    setMetrics(903, 319, 446, 0, 21);

    setMetrics(912, 287, 714, 6, 188);
    setKern(
        947, -80, 951, -19, 952, -38, 954, -64, 957, -64, 959, -32, 962, -32, 963, -32, 964, -96,
        967, -64, 972, -32, 993, -192, 8000, -32, 8001, -32, 8004, -32, 8005, -32, 8056, -32);

    setMetrics(913, 869, 700);
    setKern(920, -96, 927, -96, 932, -96, 933, -160, 934, -96, 936, -141, 939, -160, 957, -112);

    setMetrics(914, 818, 689, 0, 46);

    setMetrics(915, 691, 681, 0, 102);
    setKern(913, -153, 916, -128, 923, -141, 8124, -153);

    setMetrics(916, 958, 699);
    setKern(927, -38, 933, -160, 939, -160);

    setMetrics(917, 755, 681, 0, 86);

    setMetrics(918, 703, 688, 0, 115);

    setMetrics(919, 900, 687, 0, 144);

    setMetrics(920, 894, 699, 11, 40);
    setKern(913, -96, 933, -96, 939, -96, 8124, -96);

    setMetrics(921, 436, 687, 0, 150);

    setMetrics(922, 901, 687, 0, 119);
    setKern(927, -96);

    setMetrics(923, 805, 699);
    setKern(927, -38, 933, -115, 939, -115);

    setMetrics(924, 1091, 688, 0, 143);

    setMetrics(925, 900, 687, 0, 144);
    setKern(913, -96, 8124, -96);

    setMetrics(926, 766, 676, 0, 117);

    setMetrics(927, 864, 699, 11, 41);
    setKern(913, -96, 931, -64, 8124, -96);

    setMetrics(928, 900, 681, 0, 142);

    setMetrics(929, 786, 687, 0, 73);
    setKern(913, -192, 8124, -192);

    setMetrics(931, 830, 688, 0, 89);
    setKern(913, -32, 8124, -32);

    setMetrics(932, 800, 676, 0, 118);
    setKern(913, -96, 8124, -96);

    setMetrics(933, 805, 687, 0, 166);
    setKern(913, -160, 916, -160, 923, -160, 8124, -160);

    setMetrics(934, 830, 687, 0, 31);
    setKern(913, -96, 8124, -96);

    setMetrics(935, 869, 687, 0, 101);

    setMetrics(936, 894, 687, 0, 77);
    setKern(913, -141, 8124, -141);

    setMetrics(937, 830, 698, 0, 65);

    setMetrics(938, 436, 893, 0, 219);

    setMetrics(939, 805, 893, 0, 166);
    setKern(913, -160, 916, -160, 923, -160, 8124, -160);

    setMetrics(940, 639, 714, 6);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(941, 447, 714, 6, 55);
    setKern(
        940, -32, 945, -32, 948, -32, 963, -32, 965, -32, 967, -10, 973, -32, 993, -192, 8048, -32,
        8058, -32, 8114, -32, 8115, -32, 8116, -32, 8118, -32, 8119, -32, 8166, -32);

    setMetrics(942, 594, 713, 214, 26);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(943, 287, 714, 6, 101);
    setKern(
        947, -80, 951, -19, 952, -38, 954, -64, 957, -64, 959, -32, 962, -32, 963, -32, 964, -96,
        967, -64, 972, -32, 993, -192, 8000, -32, 8001, -32, 8004, -32, 8005, -32, 8056, -32);

    setMetrics(944, 575, 738, 5, 70);
    setKern(952, -32, 956, -13, 957, -45, 967, -32, 968, 32, 993, -192);

    setMetrics(945, 639, 452, 6);
    setKern(
        947, -96, 952, -96, 957, -109, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 993, -255, 8016, -96, 8018, -96, 8020, -96, 8021, -96, 8022, -96, 8023,
        -96, 8056, -32, 8058, -96, 8166, -96);

    setMetrics(946, 511, 702, 212, 82);
    setKern(
        941, 32, 943, 32, 949, 32, 953, 32, 959, 32, 964, 32, 966, 32, 967, -32, 968, 64, 972, 32,
        993, -64, 8050, 32, 8054, 32, 8056, 32, 8150, 32);

    setMetrics(947, 575, 460, 224, 58);
    setKern(967, 19, 993, -192);

    setMetrics(948, 537, 702, 5, 29);
    setKern(
        940, -32, 945, -32, 947, -96, 956, -51, 957, -45, 960, -32, 965, -32, 967, -19, 973, -32,
        993, -192, 8048, -32, 8058, -32, 8114, -32, 8115, -32, 8116, -32, 8118, -32, 8119, -32,
        8166, -32);

    setMetrics(949, 447, 451, 6, 51);
    setKern(
        940, -32, 945, -32, 948, -32, 963, -32, 965, -32, 967, -10, 973, -32, 993, -192, 8048, -32,
        8058, -32, 8114, -32, 8115, -32, 8116, -32, 8118, -32, 8119, -32, 8166, -32);

    setMetrics(950, 479, 696, 188, 60);
    setKern(
        940, -96, 941, -96, 942, -96, 945, -96, 947, -128, 948, -64, 949, -96, 951, -96, 952, -64,
        956, -64, 957, -102, 959, -96, 960, -96, 963, -96, 964, -96, 965, -96, 966, -96, 967, -96,
        968, -32, 969, -96, 972, -96, 973, -96, 974, -96, 993, -64, 8048, -96, 8050, -96, 8052, -96,
        8056, -96, 8058, -96, 8060, -96, 8114, -96, 8115, -96, 8116, -96, 8118, -96, 8119, -96,
        8130, -96, 8131, -96, 8132, -96, 8134, -96, 8135, -96, 8166, -96, 8178, -96, 8179, -96,
        8180, -96, 8182, -96, 8183, -96);

    setMetrics(951, 594, 452, 214, 26);
    setKern(957, -32, 965, -32, 973, -32, 993, -192, 8058, -32, 8166, -32);

    setMetrics(952, 591, 702, 6, 75);
    setKern(941, 32, 943, 32, 949, 32, 953, 32, 968, 32, 993, -64, 8050, 32, 8054, 32, 8150, 32);

    setMetrics(953, 287, 445, 6, 11);
    setKern(
        947, -80, 951, -19, 952, -38, 954, -64, 957, -64, 959, -32, 962, -32, 963, -32, 964, -96,
        967, -64, 972, -32, 993, -192, 8000, -32, 8001, -32, 8004, -32, 8005, -32, 8056, -32);

    setMetrics(954, 607, 458, 6, 63);
    setKern(946, 32, 957, -32, 993, -192);

    setMetrics(955, 517, 701, 6, 14);
    setKern(
        940, -16, 945, -16, 947, -160, 952, -51, 956, 16, 957, -96, 963, -32, 964, -32, 965, -64,
        967, -64, 973, -64, 993, -192, 8048, -16, 8058, -64, 8114, -16, 8115, -16, 8116, -16, 8118,
        -16, 8119, -16, 8166, -64);

    setMetrics(956, 575, 445, 235, 1);
    setKern(
        940, -64, 945, -64, 947, -96, 950, -32, 952, -70, 957, -96, 959, -32, 960, -32, 963, -32,
        965, -64, 966, -32, 967, -67, 969, -32, 972, -32, 973, -64, 974, -32, 993, -255, 8048, -64,
        8056, -32, 8058, -64, 8060, -32, 8114, -64, 8115, -64, 8116, -64, 8118, -64, 8119, -64,
        8166, -64, 8178, -32, 8179, -32, 8180, -32, 8182, -32, 8183, -32);

    setMetrics(957, 479, 451, 10, 60);
    setKern(
        940, -26, 945, -26, 955, -51, 957, -32, 959, -32, 961, -6, 969, 10, 972, -32, 974, 10, 993,
        -192, 8048, -26, 8056, -32, 8060, 10, 8114, -26, 8115, -26, 8116, -26, 8118, -26, 8119, -26,
        8178, 10, 8179, 10, 8180, 10, 8182, 10, 8183, 10);

    setMetrics(958, 479, 696, 188, 31);
    setKern(
        940, -32, 941, -64, 945, -32, 947, -45, 949, -64, 959, -64, 963, -64, 964, -32, 965, -32,
        966, -45, 967, -32, 972, -64, 973, -32, 993, -64, 8048, -32, 8050, -64, 8056, -64, 8058,
        -32, 8114, -32, 8115, -32, 8116, -32, 8118, -32, 8119, -32, 8166, -32);

    setMetrics(959, 543, 452, 6, 19);
    setKern(
        947, -32, 955, -32, 956, -13, 957, -45, 964, -38, 965, -64, 967, -32, 973, -64, 993, -192,
        8058, -64, 8166, -64);

    setMetrics(960, 655, 452, 6, 76);
    setKern(
        943, 32, 953, 32, 954, 32, 959, -64, 968, 32, 972, -64, 993, -192, 8054, 32, 8056, -64,
        8150, 32);

    setMetrics(961, 543, 451, 212, 22);
    setKern(
        943, 32, 947, -64, 950, 32, 953, 32, 957, -57, 959, 32, 963, 32, 967, -13, 968, 19, 972, 32,
        993, -192, 8054, 32, 8056, 32, 8150, 32);

    setMetrics(962, 479, 452, 159, 34);

    setMetrics(963, 575, 476, 5, 76);
    setKern(
        940, -51, 945, -51, 959, -32, 961, -32, 969, -32, 972, -32, 974, -32, 993, -192, 8048, -51,
        8056, -32, 8060, -32, 8114, -51, 8115, -51, 8116, -51, 8118, -51, 8119, -51, 8164, -32,
        8165, -32, 8178, -32, 8179, -32, 8180, -32, 8182, -32, 8183, -32);

    setMetrics(964, 527, 484, 5, 74);
    setKern(
        940, -32, 941, -32, 945, -32, 949, -32, 959, -32, 967, -32, 969, -32, 972, -32, 974, -32,
        993, -192, 8048, -32, 8050, -32, 8056, -32, 8060, -32, 8114, -32, 8115, -32, 8116, -32,
        8118, -32, 8119, -32, 8178, -32, 8179, -32, 8180, -32, 8182, -32, 8183, -32);

    setMetrics(965, 594, 462, 5, 18);
    setKern(952, -32, 956, -13, 957, -45, 967, -32, 968, 32, 993, -192);

    setMetrics(966, 671, 452, 218, 31);
    setKern(
        942, -32, 947, -64, 951, -32, 956, -45, 957, -45, 964, -32, 965, -64, 967, -13, 973, -64,
        993, -192, 8052, -32, 8058, -64, 8130, -32, 8131, -32, 8132, -32, 8134, -64, 8135, -64,
        8166, -64);

    setMetrics(967, 543, 452, 217, 22);
    setKern(
        940, -77, 941, -32, 942, -67, 943, -32, 945, -77, 947, -51, 948, -77, 949, -32, 951, -67,
        952, -64, 953, -32, 954, -64, 955, -77, 957, -96, 958, -51, 959, -96, 960, -51, 961, -51,
        963, -45, 964, -51, 965, -51, 966, -96, 968, -32, 969, -77, 972, -96, 973, -51, 974, -77,
        993, -192, 8048, -77, 8050, -32, 8052, -67, 8054, -32, 8056, -96, 8058, -51, 8060, -77,
        8114, -77, 8115, -77, 8116, -77, 8118, -77, 8119, -77, 8130, -67, 8131, -67, 8132, -67,
        8134, -67, 8135, -67, 8150, -32, 8166, -51, 8178, -77, 8179, -77, 8180, -77, 8182, -77,
        8183, -77);

    setMetrics(968, 639, 454, 213, 42);
    setKern(947, -45, 965, -64, 967, -6, 973, -64, 993, -192, 8058, -64, 8166, -64);

    setMetrics(969, 766, 446, 6);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 993, -192, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(970, 287, 638, 6, 192);
    setKern(
        947, -80, 951, -19, 952, -38, 954, -64, 957, -64, 959, -32, 962, -32, 963, -32, 964, -96,
        967, -64, 972, -32, 993, -192, 8000, -32, 8001, -32, 8004, -32, 8005, -32, 8056, -32);

    setMetrics(971, 575, 638, 5, 71);
    setKern(952, -32, 956, -13, 957, -45, 967, -32, 968, 32, 993, -192);

    setMetrics(972, 543, 714, 6, 19);
    setKern(
        947, -32, 955, -32, 956, -13, 957, -45, 964, -38, 965, -64, 967, -32, 973, -64, 993, -192,
        8058, -64, 8166, -64);

    setMetrics(973, 575, 713, 5, 37);
    setKern(952, -32, 956, -13, 957, -45, 967, -32, 968, 32, 993, -192);

    setMetrics(974, 766, 713, 6);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(984, 575, 694, 3, 96);

    setMetrics(985, 575, 451, 222, 3);
    setKern(993, -255);

    setMetrics(986, 894, 677, 0, 118);

    setMetrics(987, 575, 504, 106, 80);
    setKern(993, -192);

    setMetrics(988, 723, 681, 0, 102);

    setMetrics(989, 575, 696, 0, 140);

    setMetrics(991, 447, 696, 211, 47);
    setKern(993, -192);

    setMetrics(992, 881, 705);

    setMetrics(993, 830, 701, 28);
    setKern(993, -192);

    setMetrics(7936, 639, 695, 6);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(7937, 639, 696, 6);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(7938, 639, 713, 6);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(7939, 639, 713, 6);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(7940, 639, 713, 6);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(7941, 639, 714, 6);
    setKern(
        947, -96, 952, -96, 957, -51, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(7942, 639, 724, 6, 37);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(7943, 639, 724, 6, 37);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(7952, 447, 695, 6, 51);
    setKern(
        940, -32, 945, -32, 948, -32, 963, -32, 965, -32, 967, -10, 973, -32, 993, -192, 8048, -32,
        8058, -32, 8114, -32, 8115, -32, 8116, -32, 8118, -32, 8119, -32, 8166, -32);

    setMetrics(7953, 447, 696, 6, 51);
    setKern(
        940, -32, 945, -32, 948, -32, 963, -32, 965, -32, 967, -10, 973, -32, 993, -192, 8048, -32,
        8058, -32, 8114, -32, 8115, -32, 8116, -32, 8118, -32, 8119, -32, 8166, -32);

    setMetrics(7954, 447, 713, 6, 61);
    setKern(
        940, -32, 945, -32, 948, -32, 963, -32, 965, -32, 967, -10, 973, -32, 993, -192, 8048, -32,
        8058, -32, 8114, -32, 8115, -32, 8116, -32, 8118, -32, 8119, -32, 8166, -32);

    setMetrics(7955, 447, 714, 6, 61);
    setKern(
        940, -32, 945, -32, 948, -32, 963, -32, 965, -32, 967, -10, 973, -32, 993, -192, 8048, -32,
        8058, -32, 8114, -32, 8115, -32, 8116, -32, 8118, -32, 8119, -32, 8166, -32);

    setMetrics(7956, 447, 714, 6, 102);
    setKern(
        940, -32, 945, -32, 948, -32, 963, -32, 965, -32, 967, -10, 973, -32, 993, -192, 8048, -32,
        8058, -32, 8114, -32, 8115, -32, 8116, -32, 8118, -32, 8119, -32, 8166, -32);

    setMetrics(7957, 447, 713, 6, 102);
    setKern(
        940, -32, 945, -32, 948, -32, 963, -32, 965, -32, 967, -10, 973, -32, 993, -192, 8048, -32,
        8058, -32, 8114, -32, 8115, -32, 8116, -32, 8118, -32, 8119, -32, 8166, -32);

    setMetrics(7968, 594, 695, 214, 26);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(7969, 594, 696, 214, 26);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(7970, 594, 713, 214, 26);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(7971, 594, 714, 214, 26);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(7972, 594, 714, 214, 26);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(7973, 594, 713, 214, 26);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(7974, 594, 723, 214, 66);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(7975, 594, 723, 214, 66);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(7984, 287, 695, 6, 102);
    setKern(
        947, -80, 951, -19, 952, -38, 954, -64, 957, -64, 959, -32, 962, -32, 963, -32, 964, -96,
        967, -64, 972, -32, 993, -192, 8000, -32, 8001, -32, 8004, -32, 8005, -32, 8056, -32);

    setMetrics(7985, 287, 696, 6, 72);
    setKern(
        947, -80, 951, -19, 952, -38, 954, -64, 957, -64, 959, -32, 962, -32, 963, -32, 964, -96,
        967, -64, 972, -32, 993, -192, 8000, -32, 8001, -32, 8004, -32, 8005, -32, 8056, -32);

    setMetrics(7986, 287, 713, 6, 108);

    setMetrics(7987, 287, 714, 6, 108);

    setMetrics(7988, 287, 714, 6, 149);
    setKern(
        947, -80, 951, -19, 952, -38, 954, -64, 957, -64, 959, -32, 962, -32, 963, -32, 964, -96,
        967, -64, 972, -32, 993, -192, 8000, -32, 8001, -32, 8004, -32, 8005, -32, 8056, -32);

    setMetrics(7989, 287, 713, 6, 149);
    setKern(
        947, -80, 951, -19, 952, -38, 954, -64, 957, -64, 959, -32, 962, -32, 963, -32, 964, -96,
        967, -64, 972, -32, 993, -192, 8000, -32, 8001, -32, 8004, -32, 8005, -32, 8056, -32);

    setMetrics(7990, 287, 724, 6, 200);
    setKern(
        947, -80, 951, -19, 952, -38, 954, -64, 957, -64, 959, -32, 962, -32, 963, -32, 964, -96,
        967, -64, 972, -32, 993, -192, 8000, -32, 8001, -32, 8004, -32, 8005, -32, 8056, -32);

    setMetrics(7991, 287, 724, 6, 200);
    setKern(
        947, -80, 951, -19, 952, -38, 954, -64, 957, -64, 959, -32, 962, -32, 963, -32, 964, -96,
        967, -64, 972, -32, 993, -192, 8000, -32, 8001, -32, 8004, -32, 8005, -32, 8056, -32);

    setMetrics(8000, 543, 695, 6, 24);
    setKern(
        947, -32, 955, -32, 956, -13, 957, -45, 964, -38, 965, -64, 967, -32, 973, -64, 993, -192,
        8058, -64, 8166, -64);

    setMetrics(8001, 543, 696, 6, 19);
    setKern(
        947, -32, 955, -32, 956, -13, 957, -45, 964, -38, 965, -64, 967, -32, 973, -64, 993, -192,
        8058, -64, 8166, -64);

    setMetrics(8002, 543, 713, 6, 19);
    setKern(
        947, -32, 955, -32, 956, -13, 957, -45, 964, -38, 965, -64, 967, -32, 973, -64, 993, -192,
        8058, -64, 8166, -64);

    setMetrics(8003, 543, 714, 6, 19);
    setKern(
        947, -32, 955, -32, 956, -13, 957, -45, 964, -38, 965, -64, 967, -32, 973, -64, 993, -192,
        8058, -64, 8166, -64);

    setMetrics(8004, 543, 714, 6, 54);
    setKern(
        947, -32, 955, -32, 956, -13, 957, -45, 964, -38, 965, -64, 967, -32, 973, -64, 993, -192,
        8058, -64, 8166, -64);

    setMetrics(8005, 543, 713, 6, 54);
    setKern(
        947, -32, 955, -32, 956, -13, 957, -45, 964, -38, 965, -64, 967, -32, 973, -64, 993, -192,
        8058, -64, 8166, -64);

    setMetrics(8016, 575, 695, 5, 37);
    setKern(952, -32, 956, -13, 957, -45, 967, -32, 968, 32, 993, -192);

    setMetrics(8017, 575, 696, 5, 37);
    setKern(952, -32, 956, -13, 957, -45, 967, -32, 968, 32, 993, -192);

    setMetrics(8018, 575, 714, 5, 37);
    setKern(952, -32, 956, -13, 957, -45, 967, -32, 968, 32, 993, -192);

    setMetrics(8019, 575, 714, 5, 37);
    setKern(952, -32, 956, -13, 957, -45, 967, -32, 968, 32, 993, -192);

    setMetrics(8020, 575, 713, 5, 37);
    setKern(952, -32, 956, -13, 957, -45, 967, -32, 968, 32, 993, -192);

    setMetrics(8021, 575, 714, 5, 37);
    setKern(952, -32, 956, -13, 957, -45, 967, -32, 968, 32, 993, -192);

    setMetrics(8022, 575, 724, 5, 81);
    setKern(952, -32, 956, -13, 957, -45, 967, -32, 968, 32, 993, -192);

    setMetrics(8023, 575, 724, 5, 81);
    setKern(952, -32, 956, -13, 957, -45, 967, -32, 968, 32, 993, -192);

    setMetrics(8032, 766, 695, 6);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8033, 766, 696, 6);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8034, 766, 713, 6);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8035, 766, 714, 6);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8036, 766, 714, 6);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8037, 766, 714, 6);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8038, 766, 724, 6, 27);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8039, 766, 724, 6, 27);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8048, 639, 713, 6);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(8050, 447, 714, 6, 51);
    setKern(
        940, -32, 945, -32, 948, -32, 963, -32, 965, -32, 967, -10, 973, -32, 993, -192, 8048, -32,
        8058, -32, 8114, -32, 8115, -32, 8116, -32, 8118, -32, 8119, -32, 8166, -32);

    setMetrics(8052, 594, 714, 214, 26);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(8054, 287, 714, 6, 18);
    setKern(
        947, -80, 951, -19, 952, -38, 954, -64, 957, -64, 959, -32, 962, -32, 963, -32, 964, -96,
        967, -64, 972, -32, 993, -192, 8000, -32, 8001, -32, 8004, -32, 8005, -32, 8056, -32);

    setMetrics(8056, 543, 714, 6, 19);
    setKern(
        947, -32, 955, -32, 956, -13, 957, -45, 964, -38, 965, -64, 967, -32, 973, -64, 993, -192,
        8058, -64, 8166, -64);

    setMetrics(8058, 575, 714, 5, 37);
    setKern(952, -32, 956, -13, 957, -45, 967, -32, 968, 32, 993, -192);

    setMetrics(8060, 766, 714, 6);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8064, 639, 695, 211);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(8065, 639, 696, 211);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(8066, 639, 713, 211);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(8067, 639, 713, 211);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(8068, 639, 713, 211);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(8069, 639, 714, 211);
    setKern(
        947, -96, 952, -96, 957, -51, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(8070, 639, 724, 211, 37);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(8071, 639, 724, 211, 37);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(8080, 594, 695, 214, 26);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(8081, 594, 696, 214, 26);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(8082, 594, 713, 214, 26);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(8083, 594, 714, 214, 26);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(8084, 594, 714, 214, 26);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(8085, 594, 713, 214, 26);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(8086, 594, 723, 214, 66);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(8087, 594, 723, 214, 66);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(8096, 766, 695, 211);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8097, 766, 696, 211);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8098, 766, 713, 211);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8099, 766, 714, 211);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8100, 766, 714, 211);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8101, 766, 714, 211);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8102, 766, 724, 211, 27);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8103, 766, 724, 211, 27);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8114, 639, 713, 211);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(8115, 639, 452, 211);
    setKern(
        947, -96, 952, -96, 957, -109, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 993, -255, 8016, -96, 8018, -96, 8020, -96, 8021, -96, 8022, -96, 8023,
        -96, 8056, -32, 8058, -96, 8166, -96);

    setMetrics(8116, 639, 714, 211);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(8118, 639, 636, 6, 11);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(8119, 639, 636, 211, 11);
    setKern(
        947, -96, 952, -96, 957, -96, 959, -32, 960, -51, 964, -96, 965, -96, 967, -96, 968, -32,
        972, -32, 973, -96, 8056, -32, 8058, -96);

    setMetrics(8124, 869, 700, 211);
    setKern(920, -96, 927, -96, 932, -96, 933, -160, 934, -96, 936, -141, 939, -160, 957, -112);

    setMetrics(8126, 255, 157, 155, 6);

    setMetrics(8127, 255, 695, 0, 168);
    setKern(913, -160, 927, -64, 937, -32, 8124, -160, 8188, -32);

    setMetrics(8128, 383, 635, 0, 160);
    setKern(913, -128, 8124, -128);

    setMetrics(8129, 511, 723, 0, 122);

    setMetrics(8130, 594, 714, 214, 26);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(8131, 594, 452, 214, 26);
    setKern(957, -32, 965, -32, 973, -32, 993, -192, 8058, -32, 8166, -32);

    setMetrics(8132, 594, 713, 214, 26);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(8134, 594, 636, 214, 40);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(8135, 594, 636, 214, 40);
    setKern(957, -32, 965, -32, 973, -32, 8058, -32, 8166, -32);

    setMetrics(8140, 900, 687, 211, 144);

    setMetrics(8141, 319, 713, 0, 125);
    setKern(913, -96, 927, -32, 8124, -96);

    setMetrics(8142, 319, 714, 0, 166);
    setKern(913, -96, 927, -32, 8124, -96);

    setMetrics(8143, 383, 724, 0, 186);
    setKern(913, -128, 8124, -128);

    setMetrics(8146, 287, 714, 6, 188);
    setKern(
        947, -80, 951, -19, 952, -38, 954, -64, 957, -64, 959, -32, 962, -32, 963, -32, 964, -96,
        967, -64, 972, -32, 993, -192, 8000, -32, 8001, -32, 8004, -32, 8005, -32, 8056, -32);

    setMetrics(8150, 287, 636, 6, 174);
    setKern(
        947, -80, 951, -19, 952, -38, 954, -64, 957, -64, 959, -32, 962, -32, 963, -32, 964, -96,
        967, -64, 972, -32, 993, -192, 8000, -32, 8001, -32, 8004, -32, 8005, -32, 8056, -32);

    setMetrics(8151, 287, 724, 6, 200);
    setKern(
        947, -80, 951, -19, 952, -38, 954, -64, 957, -64, 959, -32, 962, -32, 963, -32, 964, -96,
        967, -64, 972, -32, 993, -192, 8000, -32, 8001, -32, 8004, -32, 8005, -32, 8056, -32);

    setMetrics(8157, 319, 714, 0, 125);
    setKern(913, -96, 927, -32, 8124, -96);

    setMetrics(8158, 319, 713, 0, 166);
    setKern(913, -96, 927, -32, 8124, -96);

    setMetrics(8159, 383, 724, 0, 186);
    setKern(913, -128, 8124, -128);

    setMetrics(8162, 575, 739, 5, 70);
    setKern(952, -32, 956, -13, 957, -45, 967, -32, 968, 32, 993, -192);

    setMetrics(8164, 543, 695, 212, 24);
    setKern(
        943, 32, 947, -64, 950, 32, 953, 32, 957, -57, 959, 32, 963, 32, 967, -13, 968, 19, 972, 32,
        993, -192, 8054, 32, 8056, 32, 8150, 32);

    setMetrics(8165, 543, 696, 212, 22);
    setKern(
        943, 32, 947, -64, 950, 32, 953, 32, 957, -57, 959, 32, 963, 32, 967, -13, 968, 19, 972, 32,
        993, -192, 8054, 32, 8056, 32, 8150, 32);

    setMetrics(8166, 575, 636, 5, 55);
    setKern(952, -32, 956, -13, 957, -45, 967, -32, 968, 32, 993, -192);

    setMetrics(8167, 575, 724, 5, 81);
    setKern(952, -32, 956, -13, 957, -45, 967, -32, 968, 32, 993, -192);

    setMetrics(8173, 319, 714, 0, 206);

    setMetrics(8175, 192, 714, 0, 131);
    setKern(913, -128, 927, -64, 937, -32, 8124, -128, 8188, -32);

    setMetrics(8178, 766, 714, 211);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8179, 766, 446, 211);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 993, -192, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8180, 766, 713, 211);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8182, 766, 635, 6, 1);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8183, 766, 635, 211, 1);
    setKern(
        941, 32, 947, -128, 949, 32, 956, -32, 957, -32, 958, 32, 964, -54, 965, -32, 967, -32, 973,
        -32, 8050, 32, 8058, -32, 8166, -32);

    setMetrics(8188, 830, 698, 211, 65);

    setMetrics(8190, 255, 696, 0, 106);
    setKern(913, -192, 927, -64, 937, -32, 8124, -192, 8188, -32);

    setMetrics(8217, 319, 696, 0, 95);

    setMetrics(9001, 473, 751, 250, 91);

    setMetrics(9002, 473, 751, 250);
  }
}

load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "bookmarkController",
    srcs = ["BookmarkController.java"],
    main_class = "src/com/thrillio/controllers/BookmarkController.java",
    deps = ["//src/com/thrillio/entities:bookmark","//src/com/thrillio/entities:user",
        "//src/com/thrillio/constants:kidFriendlyStatus",
        "//src/com/thrillio/managers:bookmarkManager",
        "//src/com/thrillio/managers:userManager",
        "//:servlet"
    ],
    visibility = ["//src/com/thrillio:__pkg__"]
)

java_binary(
    name = "loginController",
    srcs = ["LoginController.java"],
    main_class = "src/com/thrillio/controllers/LoginController.java",
    deps = [
        "//src/com/thrillio/managers:userManager",
        "//src/com/thrillio/controllers:bookmarkController",
        "//:servlet"
    ],
)


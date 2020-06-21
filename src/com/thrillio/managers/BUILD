load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "bookmarkManager",
    srcs = ["BookmarkManager.java"],
    main_class = "src/com/thrillio/managers/BookmarkManager.java",
    visibility = ["//src/com/thrillio/controllers:__pkg__","//src/com/thrillio:__pkg__"],
    deps = [
        "//src/com/thrillio/constants:bookGenre",
        "//src/com/thrillio/constants:movieGenre",
        "//src/com/thrillio/constants:kidFriendlyStatus",
        "//src/com/thrillio/entities:book",
        "//src/com/thrillio/entities:bookmark",
        "//src/com/thrillio/entities:movie",
        "//src/com/thrillio/entities:user",
        "//src/com/thrillio/entities:userBookmark",
        "//src/com/thrillio/entities:weblink",
        "//src/com/thrillio/dao:bookmarkDao",
        "//src/com/thrillio/partners:sharable",
        "//src/com/thrillio/utils:IOUtil",
        "//src/com/thrillio/utils:httpConnect",
    ]
)

java_binary(
    name = "userManager",
    srcs = ["UserManager.java"],
    main_class = "src/com/thrillio/managers/UserManager.java",
    visibility = ["//src/com/thrillio/controllers:__pkg__","//src/com/thrillio:__pkg__"],
    deps = [
        "//src/com/thrillio/constants:bookGenre",
        "//src/com/thrillio/constants:gender",
        "//src/com/thrillio/constants:usertype",
        "//src/com/thrillio/constants:movieGenre",
        "//src/com/thrillio/constants:kidFriendlyStatus",
        "//src/com/thrillio/entities:book",
        "//src/com/thrillio/entities:bookmark",
        "//src/com/thrillio/entities:movie",
        "//src/com/thrillio/entities:user",
        "//src/com/thrillio/entities:userBookmark",
        "//src/com/thrillio/entities:weblink",
        "//src/com/thrillio/dao:bookmarkDao",
        "//src/com/thrillio/dao:userDao",
    ]
)

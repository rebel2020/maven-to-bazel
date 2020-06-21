load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "datastore",
    srcs = ["DataStore.java"],
    main_class = "src/com/thrillio/DataStore.java",
    visibility = ["//src/com/thrillio/dao:__pkg__"],
    deps = [
        "//src/com/thrillio/constants:bookGenre",
        "//src/com/thrillio/constants:gender",
        "//src/com/thrillio/constants:movieGenre",
        "//src/com/thrillio/constants:kidFriendlyStatus",
        "//src/com/thrillio/entities:bookmark",
        "//src/com/thrillio/entities:user",
        "//src/com/thrillio/entities:userBookmark",
        "//src/com/thrillio/utils:IOUtil",
        "//src/com/thrillio/constants:usertype",
        "//src/com/thrillio/entities:book",
        "//src/com/thrillio/entities:weblink",
        "//src/com/thrillio/entities:movie",
    ]
)

java_binary(
    name = "launch",
    srcs = ["Launch.java"],
    main_class = "src/com/thrillio/Launch.java",
    visibility = ["//src/com/thrillio/dao:__pkg__"],
    deps = [
        "//src/com/thrillio:datastore",
        "//src/com/thrillio:view",
        "//src/com/thrillio/constants:bookGenre",
        "//src/com/thrillio/constants:gender",
        "//src/com/thrillio/constants:movieGenre",
        "//src/com/thrillio/constants:kidFriendlyStatus",
        "//src/com/thrillio/entities:bookmark",
        "//src/com/thrillio/entities:user",
        "//src/com/thrillio/entities:userBookmark",
        "//src/com/thrillio/utils:IOUtil",
        "//src/com/thrillio/constants:usertype",
        "//src/com/thrillio/entities:book",
        "//src/com/thrillio/entities:weblink",
        "//src/com/thrillio/entities:movie",
        "//src/com/thrillio/bgjobs:downloadWeblinks",
        "//src/com/thrillio/managers:bookmarkManager",
        "//src/com/thrillio/managers:userManager",
    ]
)
java_binary(
    name = "view",
    srcs = ["View.java"],
    main_class = "src/com/thrillio/view.java",
    visibility = ["//src/com/thrillio/dao:__pkg__"],
    deps = [
        "//src/com/thrillio:datastore",
        "//src/com/thrillio/constants:bookGenre",
        "//src/com/thrillio/constants:gender",
        "//src/com/thrillio/constants:movieGenre",
        "//src/com/thrillio/constants:kidFriendlyStatus",
        "//src/com/thrillio/entities:bookmark",
        "//src/com/thrillio/entities:user",
        "//src/com/thrillio/entities:userBookmark",
        "//src/com/thrillio/utils:IOUtil",
        "//src/com/thrillio/constants:usertype",
        "//src/com/thrillio/entities:book",
        "//src/com/thrillio/entities:weblink",
        "//src/com/thrillio/entities:movie",
        "//src/com/thrillio/bgjobs:downloadWeblinks",
        "//src/com/thrillio/managers:bookmarkManager",
        "//src/com/thrillio/managers:userManager",
        "//src/com/thrillio/controllers:bookmarkController"
    ]
)

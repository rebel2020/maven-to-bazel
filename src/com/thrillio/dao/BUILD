load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "bookmarkDao",
    srcs = ["BookmarkDao.java"],
    main_class = "src/com/thrillio/controllers/BookmarkDao.java",
    visibility = ["//src/com/thrillio/managers:__pkg__","//src/com/thrillio/bgjobs:__pkg__",],
    deps = [
        "//src/com/thrillio/constants:bookGenre",
        "//src/com/thrillio/constants:kidFriendlyStatus",
        "//src/com/thrillio/entities:book",
        "//src/com/thrillio/entities:user",
        "//src/com/thrillio/entities:bookmark",
        "//src/com/thrillio/entities:movie",
        "//src/com/thrillio/entities:userBookmark",
        "//src/com/thrillio/entities:weblink",
        "//src/com/thrillio/partners:sharable",
        "//src/com/thrillio:datastore",
    ]
)

java_binary(
    name = "userDao",
    srcs = ["UserDao.java"],
    main_class = "src/com/thrillio/controllers/UserDao.java",
    visibility = ["//src/com/thrillio/managers:__pkg__"],
    deps = [
        "//src/com/thrillio/constants:bookGenre",
        "//src/com/thrillio/constants:usertype",
        "//src/com/thrillio/constants:gender",
        "//src/com/thrillio/constants:kidFriendlyStatus",
        "//src/com/thrillio/entities:book",
        "//src/com/thrillio/entities:user",
        "//src/com/thrillio/entities:bookmark",
        "//src/com/thrillio/entities:movie",
        "//src/com/thrillio/entities:userBookmark",
        "//src/com/thrillio/entities:weblink",
        "//src/com/thrillio/partners:sharable",
        "//src/com/thrillio:datastore",
    ]
)

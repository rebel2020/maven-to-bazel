load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "bookmark",
    srcs = ["Bookmark.java"],
    main_class = "src/com/thrillio/entities/Bookmark.java",
    visibility = ["//src/com/thrillio/controllers:__pkg__","//src/com/thrillio/managers:__pkg__","//src/com/thrillio/dao:__pkg__","//src/com/thrillio:__pkg__","//src/com/thrillio/bgjobs:__pkg__",],
    deps = ["//src/com/thrillio/constants:kidFriendlyStatus","//src/com/thrillio/entities:user"],
)

java_binary(
    name = "user",
    srcs = ["User.java"],
    main_class = "src/com/thrillio/entities/User.java",
    visibility = ["//src/com/thrillio/controllers:__pkg__","//src/com/thrillio/managers:__pkg__","//src/com/thrillio/dao:__pkg__","//src/com/thrillio:__pkg__",],
    deps = ["//src/com/thrillio/constants:gender","//src/com/thrillio/constants:usertype"],
)

java_binary(
    name = "book",
    srcs = ["Book.java"],
    main_class = "src/com/thrillio/entities/Book.java",
    visibility = ["//src/com/thrillio/managers:__pkg__","//src/com/thrillio/dao:__pkg__","//src/com/thrillio:__pkg__",],
    deps = ["//src/com/thrillio/constants:bookGenre","//src/com/thrillio/partners:sharable","//:apacheCommonsLang","//src/com/thrillio/entities:bookmark"],
)
java_binary(
    name = "movie",
    srcs = ["Movie.java"],
    main_class = "src/com/thrillio/entities/Movie.java",
    visibility = ["//src/com/thrillio/managers:__pkg__","//src/com/thrillio/dao:__pkg__","//src/com/thrillio:__pkg__",],
    deps = ["//src/com/thrillio/constants:movieGenre","//src/com/thrillio/entities:bookmark"],
)
java_binary(
    name = "weblink",
    srcs = ["Weblink.java"],
    main_class = "src/com/thrillio/entities/Weblink.java",
    visibility = ["//src/com/thrillio/managers:__pkg__","//src/com/thrillio/dao:__pkg__","//src/com/thrillio:__pkg__","//src/com/thrillio/bgjobs:__pkg__",],
    deps = ["//src/com/thrillio/partners:sharable","//src/com/thrillio/entities:bookmark"],
)

java_binary(
    name = "userBookmark",
    srcs = ["UserBookmark.java"],
    main_class = "src/com/thrillio/entities/UserBookmark.java",
    visibility = ["//src/com/thrillio/managers:__pkg__","//src/com/thrillio/dao:__pkg__","//src/com/thrillio:__pkg__",],
    deps = ["//src/com/thrillio/constants:gender","//src/com/thrillio/constants:usertype","//src/com/thrillio/entities:user","//src/com/thrillio/entities:bookmark",],
)

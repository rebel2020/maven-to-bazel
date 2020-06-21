load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "downloadWeblinks",
    srcs = ["DownloadWeblinks.java"],
    main_class = "//src/com/thrillio/bgjobs:DownloadWeblinks.java",
    visibility = ["//src/com/thrillio:__pkg__"],
    deps = [
        "//src/com/thrillio/dao:bookmarkDao",
        "//src/com/thrillio/entities:weblink",
        "//src/com/thrillio/utils:httpConnect",
        "//src/com/thrillio/utils:IOUtil",
        "//src/com/thrillio/entities:bookmark",

    ]
)
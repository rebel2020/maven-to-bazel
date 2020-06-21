load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "IOUtil",
    srcs = ["IOUtil.java"],
    main_class = "src/com/thrillio/utils/IOUtil.java",
    visibility = ["//src/com/thrillio/controllers:__pkg__","//src/com/thrillio:__pkg__","//src/com/thrillio/managers:__pkg__","//src/com/thrillio/bgjobs:__pkg__",],
)
java_binary(
    name = "httpConnect",
    srcs = ["HttpConnect.java"],
    main_class = "src/com/thrillio/utils/HttpConnect.java",
    visibility = ["//src/com/thrillio/controllers:__pkg__","//src/com/thrillio:__pkg__","//src/com/thrillio/managers:__pkg__","//src/com/thrillio/bgjobs:__pkg__",],
    deps = ["//src/com/thrillio/utils:IOUtil"]
)
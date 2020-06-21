load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "kidFriendlyStatus",
    srcs = ["KidFriendlyStatus.java"],
    visibility = ["//src/com/thrillio/controllers:__pkg__","//src/com/thrillio/entities:__pkg__","//src/com/thrillio/managers:__pkg__","//src/com/thrillio/dao:__pkg__","//src/com/thrillio:__pkg__",],
)

java_binary(
    name = "gender",
    srcs = ["Gender.java"],
    visibility = [
        "//src/com/thrillio/entities:__pkg__",
        "//src/com/thrillio:__pkg__",
        "//src/com/thrillio/dao:__pkg__",
        "//src/com/thrillio/managers:__pkg__",
        ],
)

java_binary(
    name = "usertype",
    srcs = ["Usertype.java"],
    visibility = [
        "//src/com/thrillio/entities:__pkg__","//src/com/thrillio/entities:__pkg__",
        "//src/com/thrillio:__pkg__",    
        "//src/com/thrillio/dao:__pkg__",
        "//src/com/thrillio/managers:__pkg__",
    ],
)

java_binary(
    name = "bookGenre",
    srcs = ["BookGenre.java"],
    visibility = [
        "//src/com/thrillio/managers:__pkg__","//src/com/thrillio/entities:__pkg__",
        "//src/com/thrillio:__pkg__",
        "//src/com/thrillio/dao:__pkg__",
        ],
)
java_binary(
    name = "movieGenre",
    srcs = ["MovieGenre.java"],
    visibility = [
        "//src/com/thrillio/managers:__pkg__","//src/com/thrillio/entities:__pkg__",
        "//src/com/thrillio:__pkg__",
        "//src/com/thrillio/dao:__pkg__",
        ],
)

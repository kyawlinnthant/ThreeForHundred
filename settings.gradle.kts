@file:Suppress("UnstableApiUsage")

include(":dispatchers")


pluginManagement {
    repositories {
        includeBuild("build-logic")
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "ThreeForHundred"
include(":app")
include(":database")
include(":network")
include(":model")


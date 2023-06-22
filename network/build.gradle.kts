@file:Suppress("UnstableApiUsage")

import java.util.Properties

plugins {
    id("com.kyawlinnthant.library")
    id("com.kyawlinnthant.hilt")
}
android {
    namespace = "com.kyawlinnthant.network"
    buildFeatures {
        buildConfig = true
    }
    defaultConfig {
        buildConfigField(
            type = "String",
            name = "BASE_URL",
            value = "\"https://famous-quotes4.p.rapidapi.com\""
        )
        val properties = Properties()
        properties.load(project.rootProject.file("local.properties").inputStream())
        buildConfigField(
            type = "String",
            name = "API_KEY",
            value = "\"${properties.getProperty("API_KEY")}\""
        )
    }
}
dependencies {
    api(project(":model"))
    api(libs.bundles.network)
}

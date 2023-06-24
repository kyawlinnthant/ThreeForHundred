@file:Suppress("UnstableApiUsage")

import java.util.Properties
@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("com.kyawlinnthant.library")
    id("com.kyawlinnthant.hilt")
    alias(libs.plugins.kotlin.serialization)
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
        buildConfigField(
            type = "String",
            name = "HOST_KEY",
            value = "\"${properties.getProperty("HOST_KEY")}\""
        )
    }
}
dependencies {
    api(project(":model"))
    api(libs.bundles.network)
    api(libs.kotlinx.serialization)

    testApi(project(":testrule"))
    testImplementation(libs.mock.web.server)
}
@file:Suppress("UnstableApiUsage")

plugins {
    id("com.kyawlinnthant.application")
    id("com.kyawlinnthant.compose.application")
}

android {
    namespace = "com.kyawlinnthant.threeforhundred"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.kyawlinnthant.threeforhundred"
        versionCode = 1
        versionName = "0.0.1" // X.Y.Z ( Major.Minor.Patch)
        multiDexEnabled = true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro",
            )
        }
    }
}

dependencies {

    implementation(libs.bundles.androidx.compose)
    debugImplementation(libs.bundles.androidx.compose.debug)
}
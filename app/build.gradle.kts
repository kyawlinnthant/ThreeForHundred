@file:Suppress("UnstableApiUsage")

plugins {
    id("com.kyawlinnthant.application")
    id("com.kyawlinnthant.compose.application")
    id("com.kyawlinnthant.hilt")
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

    implementation(project(":theme"))
    implementation(project(":navigation"))
    implementation(project(":dispatchers"))
    implementation(project(":network"))
    implementation(project(":database"))
}
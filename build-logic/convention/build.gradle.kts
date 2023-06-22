plugins {
    `kotlin-dsl`
}
group = "com.kyawlinnthant.threeforhundred.buildlogic"
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
dependencies {
    compileOnly(libs.android.gradle.plugin)
    compileOnly(libs.kotlin.gradle.plugin)
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "com.kyawlinnthant.application"
            implementationClass = "AndroidApplicationPlugin"
        }
        register("androidLibrary") {
            id = "com.kyawlinnthant.library"
            implementationClass = "AndroidLibraryPlugin"
        }
        register("androidApplicationCompose") {
            id = "com.kyawlinnthant.compose.application"
            implementationClass = "ComposeApplicationPlugin"
        }
        register("androidLibraryCompose") {
            id = "com.kyawlinnthant.compose.library"
            implementationClass = "ComposeLibraryPlugin"
        }
        register("androidDaggerHilt") {
            id = "com.kyawlinnthant.hilt"
            implementationClass = "DaggerHiltPlugin"
        }
    }
}
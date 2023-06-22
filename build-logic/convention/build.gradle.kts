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
            implementationClass = "ApplicationPlugin"
        }
        register("androidApplicationCompose") {
            id = "com.kyawlinnthant.compose.application"
            implementationClass = "ApplicationComposePlugin"
        }
        register("androidDaggerHilt") {
            id = "com.kyawlinnthant.hilt"
            implementationClass = "HiltPlugin"
        }
        register("androidLibrary"){
            id = "com.kyawlinnthant.library"
            implementationClass = "LibraryPlugin"
        }
        register("androidLibraryCompose") {
            id = "com.kyawlinnthant.compose.library"
            implementationClass = "LibraryComposePlugin"
        }
    }
}
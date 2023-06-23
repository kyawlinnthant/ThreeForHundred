plugins {
    id("com.kyawlinnthant.library")
    id("com.kyawlinnthant.compose.library")
    id("com.kyawlinnthant.hilt")
}

android {
    namespace = "com.kyawlinnthant.navigation"
}
dependencies {
    api(libs.compose.navigation)
    api(libs.hilt.navigation)
}
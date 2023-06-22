plugins {
    id("com.kyawlinnthant.library")
    id("com.kyawlinnthant.compose.library")
    id("com.kyawlinnthant.hilt")
}

android {
    namespace = "com.kyawlinnthant.theme"
}
dependencies {
    api(libs.bundles.androidx.compose)
    debugApi(libs.bundles.androidx.compose.debug)
}
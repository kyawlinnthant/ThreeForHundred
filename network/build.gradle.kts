plugins {
    id("com.kyawlinnthant.library")
    id("com.kyawlinnthant.hilt")
}
android {
    namespace = "com.kyawlinnthant.network"
}
dependencies {
    api(libs.bundles.network)
}

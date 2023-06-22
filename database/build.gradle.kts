plugins {
    id("com.kyawlinnthant.library")
    id("com.kyawlinnthant.hilt")
}
android {
    namespace = "com.kyawlinnthant.database"
}
dependencies {
    api(libs.bundles.room)
}
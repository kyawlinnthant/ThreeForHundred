plugins {
    id("com.kyawlinnthant.library")
    id("com.kyawlinnthant.hilt")
}
android {
    namespace = "com.kyawlinnthant.database"
}
dependencies {
    api(project(":model"))
    api(libs.bundles.room)
    kapt(libs.room.compiler)
}
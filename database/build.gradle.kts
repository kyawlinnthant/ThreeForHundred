plugins {
    id("com.kyawlinnthant.library")
    id("com.kyawlinnthant.hilt")
}
android {
    namespace = "com.kyawlinnthant.database"
    defaultConfig {
        testInstrumentationRunner = "com.kyawlinnthant.database.DbTestRunner"
    }
}
dependencies {
    api(project(":model"))
    androidTestApi(project(":testrule"))
    api(libs.bundles.room)
    androidTestApi(libs.test.android.runner)
    kapt(libs.room.compiler)
}
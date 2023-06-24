@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("com.kyawlinnthant.library")
    id("com.kyawlinnthant.hilt")
    alias(libs.plugins.kotlin.ksp)
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
    ksp(libs.room.compiler)
}
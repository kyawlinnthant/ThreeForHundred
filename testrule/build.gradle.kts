plugins {
    id("kotlin")
}
group = "com.kyawlinnthant.testrule"
dependencies {
    api(libs.coroutines.test)
    api(libs.test.unit.junit)
}
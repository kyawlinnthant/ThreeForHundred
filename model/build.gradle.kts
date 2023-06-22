@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    id("kotlin")
    alias(libs.plugins.kotlin.serialization)
}
group = "com.kyawlinnthant.model"
dependencies {
    api(libs.kotlinx.serialization)
}
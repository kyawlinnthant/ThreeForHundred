import com.android.build.api.dsl.ApplicationExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

class AndroidApplicationPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }
            extensions.configure<ApplicationExtension> {
                configureKotlin(this)
                defaultConfig.targetSdk = 34
            }
            val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
            dependencies {
                "implementation"(libs.findLibrary("androidx.core.ktx").get())
                "implementation"(libs.findLibrary("androidx.lifecycle.ktx").get())
                "implementation"(libs.findLibrary("androidx.multidex").get())
                "implementation"(libs.findLibrary("androidx.splash").get())

                "testImplementation"(libs.findLibrary("test.unit.junit").get())
                "androidTestImplementation"(libs.findLibrary("test.android.junit").get())
            }
        }
    }
}
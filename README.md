# Project Structure
App is structured with 2 screens, Home Screen with Random Quote and List Screen with Quotes.
Offline support with data from https://rapidapi.com/saicoder/api/famous-quotes4/ 
Make your API key and add in your `local.properties`,
`API_KEY=yourapikey`
`HOST_KEY=famous-quotes4.p.rapidapi.com`

![Home Screen](https://github.com/kyawlinnthant/ThreeForHundred/assets/24668175/d632dd03-029e-460e-9f89-a07a84c2acb4)

### Tech
- Gradle build with Kotlin Script and [Gradle Version Catalog](https://developer.android.com/build/migrate-to-catalogs)
- Seperate Build module with custom Gradle plugin in `build-logic` module
- Reactive programming with [Kotlin coroutines](https://developer.android.com/kotlin/coroutines)
- Stream with [Kotlin Flow](https://developer.android.com/kotlin/flow)
- Networking with [Retrofit and OkHttp](https://square.github.io/retrofit/)
- Json parsing with [Kotlinx Serialization](https://kotlinlang.org/docs/serialization.html)
- Persistence data and caching with [Room](https://developer.android.com/training/data-storage/room)
- UI with Jetpack Compose and [Material3](https://developer.android.com/jetpack/androidx/releases/compose-material3)
- Dependency Injection framework with [Hilt](https://developer.android.com/training/dependency-injection/hilt-android)
- UI transation with [Compose navigation](https://developer.android.com/jetpack/compose/navigation)
- [ksp](https://kotlinlang.org/docs/ksp-overview.html)
- Code formatting optimization with [Ktlint](https://github.com/JLLeitschuh/ktlint-gradle)
- Code smell optimization with [Detekt](https://plugins.gradle.org/plugin/io.gitlab.arturbosch.detekt)
- Github Action (Android CI)
- MVVM 

### Multimodule Structure

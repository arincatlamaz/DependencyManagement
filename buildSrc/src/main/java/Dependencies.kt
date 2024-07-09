import org.gradle.api.artifacts.dsl.DependencyHandler

object Dependencies {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"


    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
}

fun DependencyHandler.hilt() {
    implementation(Dependencies.hilt)
    kapt(Dependencies.hiltCompiler)
}
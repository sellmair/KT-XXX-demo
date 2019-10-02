plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.multiplatform") version "1.3.50"
}

repositories {
    mavenCentral()
    google()
}

group = "io.sellmair"
version = "0.0.1"

android {
    compileSdkVersion(28)
}

kotlin {
    android("android")
    iosX64("ios")
}

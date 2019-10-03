plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.multiplatform") version "1.3.50"
}

repositories {
    mavenCentral()
    google()
}


android {
    compileSdkVersion(28)
}

kotlin {
    android("android")
    iosX64("ios")

    sourceSets["commonMain"].dependencies {
        /*
        Adding this dependency will fail the IDE to import the Gradle project.
         */
        implementation(project(":libA"))
    }
}

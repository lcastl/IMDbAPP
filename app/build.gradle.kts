plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.imdbapp"
    compileSdk = Android.compileSdk

    defaultConfig {
        applicationId = Android.applicationId
        minSdk = Android.minSdk
        targetSdk = Android.targetSdk
        versionCode = Android.versionCode
        versionName = Android.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Kotlin.compileExtVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(Modules.core))
    implementation(project(Modules.loginDomain))

    implementation(AndroidX.coreKtx)
    implementation(AndroidX.lifeCycleRuntimeKtx)
    implementation(Compose.activity)
    implementation(Compose.ui)
    implementation(Compose.toolingPreview)
    implementation(Compose.material)
    testImplementation(Junit.junit4)
    androidTestImplementation(AndroidXTest.junit)
    androidTestImplementation(AndroidXTest.espresso)
    androidTestImplementation(ComposeTest.uiTestJunit4)
    debugImplementation(Compose.tooling)
    debugImplementation(ComposeTest.uiTestManifest)
    implementation(Compose.navigation)
    implementation(Compose.icons)
    implementation(Compose.hiltNavigation)
    implementation(Hilt.android)
    kapt(Hilt.compiler)
}

kapt {
    correctErrorTypes = true
}
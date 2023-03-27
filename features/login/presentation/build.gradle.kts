apply {
    from("$rootDir/android-library-build.gradle")
}

dependencies {
    "implementation"(project(Modules.loginDomain))
    "implementation"(project(Modules.core))
}
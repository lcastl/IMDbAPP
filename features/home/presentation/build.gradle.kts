apply {
    from("$rootDir/android-library-build.gradle")
}

dependencies {
    "implementation"(project(Modules.homeDomain))
    "implementation"(project(Modules.core))
}
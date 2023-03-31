apply {
    from("$rootDir/android-library-ui-build.gradle")
}

dependencies {
    "implementation"(project(Modules.loginDomain))
    "implementation"(project(Modules.core))
}
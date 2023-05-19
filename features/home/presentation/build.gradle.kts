apply {
    from("$rootDir/android-library-ui-build.gradle")
}

dependencies {
    "implementation"(project(Modules.homeDomain))
    "implementation"(project(Modules.core))
    "implementation"(project(Modules.components))
}
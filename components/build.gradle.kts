apply {
    from("$rootDir/android-library-ui-build.gradle")
}

dependencies {
    "implementation"(project(Modules.core))
}
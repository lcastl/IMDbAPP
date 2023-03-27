object Compose {
    private const val activityComposeVersion = "1.7.0"
    const val activity = "androidx.activity:activity-compose:$activityComposeVersion"

    const val composeVersion = "1.3.3"
    const val composeMaterialVersion = "1.3.1"
    const val ui = "androidx.compose.ui:ui:$composeVersion"
    const val material = "androidx.compose.material:material:$composeMaterialVersion"
    const val tooling = "androidx.compose.ui:ui-tooling:$composeVersion"
    const val toolingPreview = "androidx.compose.ui:ui-tooling-preview:$composeVersion"
    const val icons = "androidx.compose.material:material-icons-extended:$composeMaterialVersion"

    private const val navigationVersion = "2.5.3"
    const val navigation = "androidx.navigation:navigation-compose:$navigationVersion"

    private const val hiltNavigationComposeVersion = "1.0.0"
    const val hiltNavigation = "androidx.hilt:hilt-navigation-compose:$hiltNavigationComposeVersion"
}

object ComposeTest {
    const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4:${Compose.composeVersion}"
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:${Compose.composeMaterialVersion}"
}
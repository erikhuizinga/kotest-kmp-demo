Run

```sh
./gradlew testDebugUnitTest iosSimulatorArm64Test --rerun-tasks --info | grep "kotest demo"
```

to run tests and filter on the demo test standard output.
You should see something like this:

```
    ℹ️ kotest demo example unit test running on Android 0
    ℹ️ kotest demo example fun spec test running on Android 0
    ℹ️ kotest demo example property test running on Android 0
    ℹ️ kotest demo example fun spec test running on iOS 26.0
    ℹ️ kotest demo example property test running on iOS 26.0
    ℹ️ kotest demo example unit test running on iOS 26.0
```

See the files in composeApp/src/commonTest/kotlin/com/example/kotest/kmp/demo for the source of this
output.

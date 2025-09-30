# Kotest KMP Demo

## Overview

This repository demonstrates how to use Kotest in a Kotlin Multiplatform (KMP) project with Android
and iOS targets. Unit tests and Kotest tests run on both platforms. On Android the run using a JUnit
5 runner for Kotest and JUnit 4 for unit tests.

## Getting Started

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

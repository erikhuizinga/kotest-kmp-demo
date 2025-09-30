# Kotest KMP Demo

## Overview

This repository demonstrates how to use Kotest specs and unit tests in a Kotlin Multiplatform (KMP)
project with Android and iOS targets. On Android, Kotest specs run using Kotest's JUnit 5 runner,
while unit tests run using JUnit 4.

## Getting Started

Run

```sh
./gradlew testDebugUnitTest iosSimulatorArm64Test --rerun-tasks --info | grep "kotest demo"
```

to run tests and filter on the demo test standard output.
You should see something like this:

```
    ℹ️ kotest demo example unit test 11 running on Android 0
    ℹ️ kotest demo example unit test 12 running on Android 0
    ℹ️ kotest demo example unit test 21 running on Android 0
    ℹ️ kotest demo example unit test 22 running on Android 0
    ℹ️ kotest demo example fun spec test running on Android 0
    ℹ️ kotest demo example property test running on Android 0
    ℹ️ kotest demo example fun spec test running on iOS 26.0
    ℹ️ kotest demo example property test running on iOS 26.0
    ℹ️ kotest demo example unit test 11 running on iOS 26.0
    ℹ️ kotest demo example unit test 12 running on iOS 26.0
    ℹ️ kotest demo example unit test 21 running on iOS 26.0
    ℹ️ kotest demo example unit test 22 running on iOS 26.0
```

See the files in
[composeApp/src/commonTest/kotlin/com/example/kotest/kmp/demo](https://github.com/erikhuizinga/kotest-kmp-demo/tree/main/composeApp/src/commonTest/kotlin/com/example/kotest/kmp/demo)
for the source of this output.

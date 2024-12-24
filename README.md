# sentry-kmp-demo

Simple Demo project to demonstrate that `initWithPlatformOptions` doesn't work.

Look into `initializeSentry.kt` file. 

- When `Sentry.init` is used everything works well both swift and kotlin errors reported and visible in sentry issues.
- When `Sentry.initWithPlatformOptions` nothing is reported to Sentry


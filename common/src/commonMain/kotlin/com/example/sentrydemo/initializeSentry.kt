package com.example.sentrydemo

import io.sentry.kotlin.multiplatform.Sentry
import io.sentry.kotlin.multiplatform.PlatformOptionsConfiguration

fun initializeSentry() {
  println("initializeSentry()")
//  Working!!!
//  Sentry.init { options ->
//    options.dsn = "https://a78e2747ae6ebc8f5125867aa4de6bdf@o4508516143398912.ingest.us.sentry.io/4508516147003392"
//  }

// Not Working
  Sentry.initWithPlatformOptions(platformOptionsConfiguration())
}

fun testSentry() {
  val sentryId = Sentry.captureException(IllegalArgumentException("Test Error Kotlin"))
  println("testSentry(): $sentryId")
}

expect fun platformOptionsConfiguration(): PlatformOptionsConfiguration

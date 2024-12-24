package com.example.sentrydemo

import io.sentry.kotlin.multiplatform.PlatformOptionsConfiguration

actual fun platformOptionsConfiguration(): PlatformOptionsConfiguration = {
    it.dsn = "https://a78e2747ae6ebc8f5125867aa4de6bdf@o4508516143398912.ingest.us.sentry.io/4508516147003392"
}
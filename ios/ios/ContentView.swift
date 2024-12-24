import SwiftUI
import common

struct ContentView: View {
	let greet = Greeting().greet()

	var body: some View {
		Text(greet)
        Button("Swift Error", action: { Sentry.shared.captureError(error: NSError(domain: "Swift Error", code: 99))})
        Button("Kotlin Error", action: { InitializeSentryKt.testSentry() })
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}

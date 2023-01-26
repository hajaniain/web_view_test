package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the WebView element in the layout
        val webView = findViewById<WebView>(R.id.w_view)

        // Enable JavaScript
        webView.settings.javaScriptEnabled = true

        // Set a WebViewClient to handle page navigation
        webView.webViewClient = WebViewClient()

        // Clear cache
        webView.clearCache(true)

        // Load the desired URL
        webView.loadUrl("https://google.com")
    }
}

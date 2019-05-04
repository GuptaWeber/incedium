package com.incedium.incedium

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    var mWebView : WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mWebView = findViewById<View>(R.id.webview) as WebView
        mWebView!!.loadUrl("http://www.incedium.com")


    }

    override fun onBackPressed() {
        if(mWebView!!.canGoBack()){
            mWebView!!.goBack()
        }else{
            super.onBackPressed()
        }
    }
}













































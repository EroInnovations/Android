package com.elite.qel_medistore;
import android.webkit.WebSettings;
import android.webkit.WebView;
public class WebViewFileAccess {
    public static void enableFileAccess(WebView webView) {
        WebSettings webSettings = webView.getSettings();
        webSettings.setAllowFileAccess(true);
        webSettings.setAllowContentAccess(true);
        webSettings.setAllowFileAccessFromFileURLs(true);
        webSettings.setAllowUniversalAccessFromFileURLs(true);
    }
}
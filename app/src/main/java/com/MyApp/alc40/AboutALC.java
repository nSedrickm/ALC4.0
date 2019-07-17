package com.MyApp.alc40;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutALC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        WebView webView = (WebView) findViewById(R.id.about_alc_webView);

        webView.loadUrl("https://andela.com/alc/");
    }
}


package com.example.weplayapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webb = (WebView)findViewById(R.id.wb1);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("192.168.0.255:8000");
    }
}

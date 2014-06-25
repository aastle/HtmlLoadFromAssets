package com.aastle.htmlloadfromassets;

import android.app.Activity;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

import java.io.IOException;
import java.io.InputStream;


public class main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView)findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setSaveFormData(false);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(false);

        webView.setWebChromeClient(new WebChromeClient());


       // webView.addJavascriptInterface(new DemoJavaScriptInterface(), "demo");
        String text = "";
        InputStream input;
        AssetManager assetManager = this.getAssets();
        try {
            input = assetManager.open("test.html");
            int size = input.available();
            byte[] buffer = new byte[size];
            input.read(buffer);
            input.close();

            // byte buffer into a string
            text = new String(buffer);

            webView.loadData(text,"text/html","UTF-8");


        }catch (IOException io){
            io.printStackTrace();
        }
        //
    }


}

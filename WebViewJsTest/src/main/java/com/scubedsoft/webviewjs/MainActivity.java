package com.scubedsoft.webviewjs;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public void onResume() {
        super.onResume();
        WebView wv = (WebView)findViewById(R.id.main);
        wv.loadUrl("http://hube.github.io/WebViewJsTest/test.html");
    }
}

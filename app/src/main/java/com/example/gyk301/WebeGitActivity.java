package com.example.gyk301;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class WebeGitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webe_git);

        WebView vw=(WebView)findViewById(R.id.webview);
        vw.getSettings().getJavaScriptEnabled();
        vw.loadUrl("https://gelecegiyazanlar.turkcell.com.tr");

        final ProgressDialog progress = ProgressDialog.show(this,"Geleceği Yazanlar","Yükleniyor...",true);
        progress.show();

        vw.setWebViewClient(new WebViewClient()

                            {
                                @Override
                                public void onPageFinished(WebView view, String url) {
                                    super.onPageFinished(view, url);
                                    Toast.makeText(getApplicationContext(),"Sayfa yüklendi.",Toast.LENGTH_SHORT).show();
                                    progress.dismiss();
                                }

                                @Override
                                public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                                    super.onReceivedError(view, request, error);
                                    Toast.makeText(getApplicationContext(),"Bir hata oluştu..",Toast.LENGTH_SHORT).show();
                                    progress.dismiss();
                                }
                            }


        );
    }
}

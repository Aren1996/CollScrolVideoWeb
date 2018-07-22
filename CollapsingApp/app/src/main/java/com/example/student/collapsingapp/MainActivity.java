package com.example.student.collapsingapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        setUpVidyoView();
        setWebView();
    }

//    private void setUpVidyoView() {
//        final VideoView videoView = (VideoView) findViewById(R.id.video_view);
//        videoView.setVideoURI(Uri.parse("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"));
//        videoView.setMediaController(new MediaController(this));
//        MediaController mediaController = new MediaController(this);
//        mediaController.setAnchorView(videoView);
//        videoView.setMediaController(mediaController);
//        videoView.start();
//    }

    private  void setWebView(){
        final WebView webView = (WebView) findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://stackoverflow.com/questions/51463248/identityserver4-and-net-mvc-client");
        webView.setWebViewClient( new MyWebViewClient());
    }

    private  class  MyWebViewClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}

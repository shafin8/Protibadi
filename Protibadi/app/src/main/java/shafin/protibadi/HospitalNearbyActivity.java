package shafin.protibadi;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class HospitalNearbyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_nearby);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //Get the bundle
        Bundle bundle = getIntent().getExtras();

        //Extract the data…
        String latitude = bundle.getString("chatname");
        String longitude = bundle.getString("id");

        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("http://www.google.com/maps/search/hospital/@"+latitude+","+longitude+",16z");

    }
}

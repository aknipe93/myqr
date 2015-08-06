package com.qrscan.qrcodescanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class contentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        Bundle extrasBundle = getIntent().getExtras();
        if (!extrasBundle.isEmpty()) {
            String content = extrasBundle.getString("content");
            TextView contentView = (TextView)findViewById(R.id.contentView);

//in your OnCreate() method
            contentView.setText(content);
        }
    }


}

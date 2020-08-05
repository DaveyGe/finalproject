package com.example.inline_app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OfficeDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_details);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView Info;
            Info = (TextView) findViewById(R.id.info);
            Info.setText(extras.getString("key1"));

        }
    }
}
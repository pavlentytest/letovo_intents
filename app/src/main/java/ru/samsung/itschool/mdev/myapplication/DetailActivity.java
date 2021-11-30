package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tv = findViewById(R.id.textView2);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {
            tv.setText(bundle.getString("val"));
        }

    }
}
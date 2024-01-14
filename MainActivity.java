package com.example.demo;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle; import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity { Button start, stop;
    TextView m; @SuppressLint("WrongViewCast") @Override
    protected void onCreate(Bundle savedInstanceState)
    { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        m = findViewById(R.id.marquee);
        start = findViewById(R.id.btnStart);
        stop = findViewById(R.id.btnStop);
        start.setOnClickListener(v -> m.setSelected(true));
        stop.setOnClickListener(v -> m.setSelected(false));
    }
}
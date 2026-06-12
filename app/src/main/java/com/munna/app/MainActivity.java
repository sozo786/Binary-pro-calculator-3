package com.munna.app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Simple UI code se banayenge
        TextView textView = new TextView(this);
        textView.setText("MUNNA KI APP CHAL GAYI! 🔥");
        textView.setTextSize(24);
        textView.setPadding(50, 300, 50, 50);

        Button button = new Button(this);
        button.setText("Daba Mujhe");
        button.setOnClickListener(v -> {
            Toast.makeText(this, "MUNNA BHAI ZINDABAD 💪", Toast.LENGTH_SHORT).show();
        });

        android.widget.LinearLayout layout = new android.widget.LinearLayout(this);
        layout.setOrientation(android.widget.LinearLayout.VERTICAL);
        layout.addView(textView);
        layout.addView(button);
        
        setContentView(layout);
    }
}

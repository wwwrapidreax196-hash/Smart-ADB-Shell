package io.github.devforge.quickshell;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView statusText = findViewById(R.id.textViewStatus);

        // Smart version check
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) { // Android 11+
            statusText.setText("Welcome to QuickShell!\nYour device supports wireless debugging.");
            // TODO: Start smart setup logic here
        } else {
            statusText.setText("Sorry!\nWireless debugging requires Android 11 or newer.\nPlease use USB debugging with a computer.");
            // TODO: Disable all wireless features
        }
    }
}
package com.example.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar seekBar = findViewById(R.id.seekBar2);
            
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    Toast.makeText(getApplicationContext(),"seekbar progress", Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                    
                    Toast.makeText(getApplicationContext(),"seekbar touch started!", Toast.LENGTH_SHORT).show();

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                    Toast.makeText(MainActivity.this, "seek touch stopped", Toast.LENGTH_SHORT).show();
                }
            });
    }
}

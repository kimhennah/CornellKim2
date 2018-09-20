package com.cornell.kim.cornellkim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.design.widget.Snackbar;

public class MainActivity extends AppCompatActivity {

    protected Button Back, Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Back = findViewById(R.id.backButton);
    Back.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "KIM", Toast.LENGTH_SHORT).show();
        }
    });

    Next = findViewById(R.id.nextButton);
    Next.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Snackbar.make(v, "K I M !", Snackbar.LENGTH_SHORT).show();
        }
    });

    }

    protected void onStart(){
        super.onStart();
        Log.d("4ITG", "onStart() has started");
    }

    protected void onResume(){
        super.onResume();
        Log.d("4ITG", "onResume() has started");
    }

    protected void onPause(){
        super.onPause();
        Log.d("4ITG", "onPause() has started");
    }

    protected void onStop(){
        super.onStop();
        Log.d("4ITG", "onStop() has started");
    }

    protected void onRestart(){
        super.onRestart();
        Log.d("4ITG", "onRestart() has started");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("4ITG", "onDestroy() has started");
    }

}

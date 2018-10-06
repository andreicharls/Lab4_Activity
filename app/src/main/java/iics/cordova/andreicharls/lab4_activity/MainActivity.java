package iics.cordova.andreicharls.lab4_activity;

import android.nfc.Tag;
import android.os.Message;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String Tag = "4ITI Lab Act. 4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Tag, "onCreate() called");
        setContentView(R.layout.activity_main);
        displayContent();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Tag, "onStart() called");
    }

    @Override
    protected void onResume () {
        super.onResume();
        Log.d(Tag, "onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Tag, "onPause() called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Tag, "onRestart() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Tag, "onStop() called");
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.d(Tag, "onDestroy() called");
    }

    public void displayContent() {
        Button backButton = (Button) findViewById(R.id.backButton);
        Button nextButton = (Button) findViewById(R.id.nextButton);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Back button message";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = findViewById(R.id.mainLayoutId);
                String message = "Next button message";
                int duration = Snackbar.LENGTH_SHORT;
                Snackbar.make(view, message, duration).show();
            }
        });
    }

}

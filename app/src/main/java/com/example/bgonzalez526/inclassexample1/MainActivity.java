package com.example.bgonzalez526.inclassexample1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // saves everything that was running on the app
        setContentView(R.layout.activity_main); //R for resource loads the file

        Button btnNext1 = findViewById(R.id.idButtonNext);

        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // when button is clicked
                Intent in1 = new Intent(MainActivity.this, Main2Activity.class); // going from activity 1 to activity2
                startActivity(in1); // starting the activity
            }
        });


    }
}

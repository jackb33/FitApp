package com.fitapp.jack.fitapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Switch;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button newMealButton = (Button) findViewById(R.id.newMealButton);
        newMealButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button dailyStatButton = (Button) findViewById(R.id.dailyStatButton);
        dailyStatButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button createFoodButton = (Button) findViewById(R.id.createFoodButton);
        createFoodButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button calculatorButton = (Button) findViewById(R.id.calculatorButton);
        calculatorButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button unitTableButton = (Button) findViewById(R.id.unitTableButton);
        unitTableButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button recipesButton = (Button) findViewById(R.id.recipesButton);
        recipesButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Switch noctModeSwitch = (Switch) findViewById(R.id.noctModeSwitch);
        noctModeSwitch.setOnDragListener(new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                return false;
            }
        });

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
}

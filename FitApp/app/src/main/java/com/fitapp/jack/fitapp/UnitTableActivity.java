package com.fitapp.jack.fitapp;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;

public class UnitTableActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_table);

        Button backToMainButton = (Button) findViewById(R.id.backToMainButton);
        backToMainButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backToMainIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(backToMainIntent);
            }
        });
    }

}

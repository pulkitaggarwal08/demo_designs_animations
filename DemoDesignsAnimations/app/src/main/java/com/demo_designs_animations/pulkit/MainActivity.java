package com.demo_designs_animations.pulkit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.demo_designs_animations.pulkit.activities.AnimateBottomToTopActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnBottomToTop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findIds();
        init();

    }

    private void findIds() {

        btnBottomToTop = findViewById(R.id.btn_bottom_to_top);

    }

    private void init() {

        btnBottomToTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), AnimateBottomToTopActivity.class);
                startActivity(intent);
            }
        });

    }

}

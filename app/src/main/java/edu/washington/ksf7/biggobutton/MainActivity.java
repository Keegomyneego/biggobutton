package edu.washington.ksf7.biggobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private int pushCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setPushButtonClickListener();
    }

    private void setPushButtonClickListener() {
        final Button pushButton = (Button) findViewById(R.id.push_button);

        pushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Update push count
                pushCount++;

                // Update button text
                pushButton.setText("You have pushed me " + pushCount + " times!");
            }
        });
    }
}

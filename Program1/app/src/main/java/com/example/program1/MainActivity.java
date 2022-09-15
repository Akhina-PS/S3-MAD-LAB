package com.example.program1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    TextView t1, t2, t3, t4;
    int f, s, r;
    Button b;
    EditText e;
    Random rand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rand = new Random();
        t1 = (TextView) findViewById(R.id.textView2);
        t2 = (TextView) findViewById(R.id.textView3);
        t4 = (TextView) findViewById(R.id.textView4);
        t3 = (TextView) findViewById(R.id.textView5);
        b = (Button) findViewById(R.id.button);
        e = (EditText) findViewById(R.id.editTextTextPersonName);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f = Integer.parseInt(t1.getText().toString());
                s = Integer.parseInt(t2.getText().toString());
                r = Integer.parseInt(e.getText().toString());
                if (f + s == r) {
                    t3.setText("Passed");
                    t1.setText("" + rand.nextInt(50));
                    t2.setText("" + rand.nextInt(50));
                } else {
                    t3.setText("Failed");
                }
            }
        });
    }
}
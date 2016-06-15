package com.scottkvitberg.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {

    // Declare view variables
    private TextView mFactsTextView;
    private Button mShowFactButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views from the layout to the corresponding variables
        mFactsTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The button was clicked -> Update the fact TextView with a new fact
                String fact = "bla blab bla bla";
                mFactsTextView.setText(fact);
            }
        };
        mShowFactButton.setOnClickListener(listener);
    }
}

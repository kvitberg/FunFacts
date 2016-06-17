package com.scottkvitberg.funfacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends AppCompatActivity {

    // Declare view variables
    private TextView mQuoteTextView;
    private Button mShowQuoteButton;

    private QuotesBook mQuotesBook = new QuotesBook();
    private ColorWheel mColorWheel = new ColorWheel();

    private RelativeLayout mRelativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views from the layout to the corresponding variables
        mQuoteTextView = (TextView) findViewById(R.id.quoteTextView);
        mShowQuoteButton = (Button) findViewById(R.id.showQuoteButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mQuotesBook.getQuote();
                int color = mColorWheel.getColors();
                //Update screen with
                mQuoteTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mShowQuoteButton.setTextColor(color);
            }
        };
        mShowQuoteButton.setOnClickListener(listener);
    }
}

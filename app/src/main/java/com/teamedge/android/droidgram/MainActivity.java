package com.teamedge.android.droidgram;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method displays the likes on the screen.
     */
    private void displayLikes(int number) {
        TextView likesTextView = (TextView) findViewById(R.id.likes_text_view);
        likesTextView.setText("Likes: " + number);
    }
}

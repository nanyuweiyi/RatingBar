package com.willy.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.willy.ratingbar.BaseRatingBar;
import com.willy.ratingbar.RotationRatingBar;
import com.willy.ratingbar.ScaleRatingBar;

/**
 * Created by willy on 2017/10/13.
 */

public class EntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        final BaseRatingBar baseRatingBar = (BaseRatingBar) findViewById(R.id.baseratingbar_main);
        final ScaleRatingBar scaleRatingBar = (ScaleRatingBar) findViewById(R.id.scaleRatingBar);
        final RotationRatingBar rotationRatingBar = (RotationRatingBar) findViewById(R.id.rotationratingbar_main);

        baseRatingBar.setOnRatingChangeListener(new BaseRatingBar.OnRatingChangeListener() {
            @Override
            public void onRatingChange(BaseRatingBar ratingBar, float rating) {
                Log.d("-----" , "BaseRatingBar:"+rating);
            }
        });

        scaleRatingBar.setOnRatingChangeListener(new BaseRatingBar.OnRatingChangeListener() {
            @Override
            public void onRatingChange(BaseRatingBar ratingBar, float rating) {
                Log.d("------", "ScaleRatingBar:" + rating);
            }
        });

        rotationRatingBar.setOnRatingChangeListener(new BaseRatingBar.OnRatingChangeListener() {
            @Override
            public void onRatingChange(BaseRatingBar ratingBar, float rating) {
                Log.d("-------", "RotationRatingBar:" + rating);
            }
        });

        Button addRatingButton = (Button) findViewById(R.id.button_main_add_rating);
        addRatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float currentRating = baseRatingBar.getRating();
                baseRatingBar.setRating(currentRating + 0.25f);

                currentRating = scaleRatingBar.getRating();
                scaleRatingBar.setRating(currentRating + 0.25f);

                currentRating = rotationRatingBar.getRating();
                rotationRatingBar.setRating(currentRating + 0.25f);
            }
        });
    }
}

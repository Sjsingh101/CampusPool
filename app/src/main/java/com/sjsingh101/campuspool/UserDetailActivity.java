package com.sjsingh101.campuspool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.RatingBar;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserDetailActivity extends AppCompatActivity {

    ImageButton fab;
    Intent intent;
    TextView tv1;
    RatingBar rbar;
    CircleImageView cview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        fab = findViewById(R.id.fab_add);
        fab.setImageResource(R.drawable.ic_checked);
        rbar = findViewById(R.id.ratingbar);
        intent = getIntent();
        tv1 = findViewById(R.id.name);
       // cview.setImageResource(intent.getIntExtra("Thumbnail",0));
        tv1.setText(intent.getStringExtra("Name"));
        rbar.setRating(intent.getIntExtra("Ratings",1));
    }
}

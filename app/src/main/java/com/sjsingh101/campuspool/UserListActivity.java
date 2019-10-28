package com.sjsingh101.campuspool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class UserListActivity extends AppCompatActivity {

    List<User> lstBook ;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Active Users");

        lstBook = new ArrayList<>();
        lstBook.add(new User("Deepanshu",4,"Mohali",R.drawable.ic_boy));
        lstBook.add(new User("Gurleen",4,"Mohali",R.drawable.ic_girl));
        lstBook.add(new User("Pulkit",4,"Mohali",R.drawable.ic_man));
        lstBook.add(new User("Kartik",4,"Mohali",R.drawable.ic_boy));
        lstBook.add(new User("Himanshi",4,"Mohali",R.drawable.ic_girl));
        lstBook.add(new User("Simranjeet",4,"Mohali",R.drawable.ic_man));
        lstBook.add(new User("Piyush",4,"Mohali",R.drawable.ic_boy));
        lstBook.add(new User("Pranjal",4,"Mohali",R.drawable.ic_girl));
        lstBook.add(new User("Jagrit",4,"Mohali",R.drawable.ic_man));
        lstBook.add(new User("Piyush",4,"Mohali",R.drawable.ic_boy));
        lstBook.add(new User("Pranjal",4,"Mohali",R.drawable.ic_girl));
        lstBook.add(new User("Jagrit",4,"Mohali",R.drawable.ic_man));






        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        UserProfileAdapter myAdapter = new UserProfileAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }
}

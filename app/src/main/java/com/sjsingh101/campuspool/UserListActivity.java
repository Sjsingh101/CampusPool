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
        lstBook.add(new User("Deepanshu",4,"Mohali",R.drawable.ic_boy));
        lstBook.add(new User("Deepanshu",4,"Mohali",R.drawable.ic_boy));
        lstBook.add(new User("Deepanshu",4,"Mohali",R.drawable.ic_boy));
        lstBook.add(new User("Deepanshu",4,"Mohali",R.drawable.ic_boy));
        lstBook.add(new User("Deepanshu",4,"Mohali",R.drawable.ic_boy));
        lstBook.add(new User("Deepanshu",4,"Mohali",R.drawable.ic_boy));
        lstBook.add(new User("Deepanshu",4,"Mohali",R.drawable.ic_boy));
        lstBook.add(new User("Deepanshu",4,"Mohali",R.drawable.ic_boy));
        lstBook.add(new User("Deepanshu",4,"Mohali",R.drawable.ic_boy));
        lstBook.add(new User("Deepanshu",4,"Mohali",R.drawable.ic_boy));
        lstBook.add(new User("Deepanshu",4,"Mohali",R.drawable.ic_boy));




        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        UserProfileAdapter myAdapter = new UserProfileAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }
}

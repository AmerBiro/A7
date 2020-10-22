package com.example.a6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;
import java.util.List;

public class MyViewPager2 extends AppCompatActivity {

    ViewPager2 ViewPager2;
    List<User> userList;
    UserAdapter userAdapter;

    MaterialButton materialButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager2);

        ViewPager2 = findViewById(R.id.viewPager2);
        materialButton = findViewById(R.id.buttonmaterial);
        textView = findViewById(R.id.text_view);


        userList = new ArrayList<>();
        userList.add(new User(R.id.button_favorite, "Kim", "22"));
        userList.add(new User(R.id.button_share, "Sam", "24"));
        userList.add(new User(R.id.button_account, "Zye", "27"));

        userAdapter = new UserAdapter(this, userList);
        ViewPager2.setAdapter(userAdapter);
    }
}
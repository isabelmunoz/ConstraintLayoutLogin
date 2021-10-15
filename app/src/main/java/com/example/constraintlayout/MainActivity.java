package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView ivAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        loadImage();
    }

    private void initWidgets() {
        ivAvatar=findViewById(R.id.iv_avatar);
    }

    private void loadImage() {
        Picasso.get()
                .load("https://static.wikia.nocookie.net/eswikia/images/d/df/Pok%C3%A9mon.png/revision/latest?cb=20170308220152")
                .into(ivAvatar);
    }
}
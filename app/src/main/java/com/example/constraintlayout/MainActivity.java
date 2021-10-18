package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.constraintlayout.databinding.ActivityMainBinding;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

private ActivityMainBinding binding;
public static final String URL_IMAGE="https://static.wikia.nocookie.net/eswikia/images/d/df/Pok%C3%A9mon.png/revision/latest?cb=20170308220152";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBindings();
        setContentView(binding.getRoot());
        loadImage();

    }

    private void initBindings() {
       binding=ActivityMainBinding.inflate(getLayoutInflater());
    }

    private void loadImage() {
        Picasso.get()
                .load(URL_IMAGE)
                .into(binding.ivAvatar);
    }
}
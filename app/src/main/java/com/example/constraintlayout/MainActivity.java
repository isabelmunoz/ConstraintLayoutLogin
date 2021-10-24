package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.constraintlayout.databinding.ActivityMainBinding;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

private ActivityMainBinding binding;
public static final String URL_IMAGE="https://static.wikia.nocookie.net/eswikia/images/d/df/Pok%C3%A9mon.png/revision/latest?cb=20170308220152";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initBindings();
        setContentView(binding.getRoot());
        loadImage();
        createListener();

    }

    private void createListener() {
        binding.btnSaludo.setOnClickListener(this);
    }

    private void initBindings() {

        binding=ActivityMainBinding.inflate(getLayoutInflater());
    }

    private void loadImage() {
        Picasso.get()
                .load(URL_IMAGE)
                .into(binding.ivAvatar);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Hola Mundo", Toast.LENGTH_LONG).show();
    }
}
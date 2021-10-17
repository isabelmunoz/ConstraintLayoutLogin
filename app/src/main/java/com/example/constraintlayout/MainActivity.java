package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private ImageView ivAvatar;
    private EditText etNombre;
    private EditText etApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        loadImage();
        loadName();
        loadApellido();
    }

    private void loadApellido() {
        etApellido.setText("Muñoz");
    }

    private void loadName() {
        etNombre.setText("Isabel");
    }

    private void initWidgets() {
        ivAvatar=findViewById(R.id.iv_avatar);
        etNombre=findViewById(R.id.et_nombre);
        etApellido=findViewById(R.id.et_apellido);
    }

    private void loadImage() {
        Picasso.get()
                .load("https://static.wikia.nocookie.net/eswikia/images/d/df/Pok%C3%A9mon.png/revision/latest?cb=20170308220152")
                .into(ivAvatar);
    }
}
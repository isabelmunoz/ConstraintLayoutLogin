package com.example.constraintlayout.componentsart.button;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

import timber.log.Timber;

public class ButtonCustom extends AppCompatTextView {

    public ButtonCustom(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Timber.d("CustomTextView, onTouchEvent call");
        decorateBottom();
        return super.onTouchEvent(event);
    }

    private void decorateBottom() {
        setBackgroundColor(Color.RED);
        setTextColor(Color.BLUE);
    }

}



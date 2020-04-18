package com.example.nishant225.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;


import androidx.appcompat.widget.AppCompatRadioButton;

import com.example.nishant225.R;


public class CustomRadioButton extends AppCompatRadioButton {
    public String Text;
    public boolean enableColor;
    public CustomRadioButton(Context context) {
        super(context);
    }

    public CustomRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray=context.obtainStyledAttributes(attrs, R.styleable.customRadioButton);
        try {
            Text =typedArray.getString(R.styleable.customRadioButton_settext);
            if(Text ==null)
            {
                setText("Default Text ");
            }else {
                setChecked(true);
                setText(Text);
                setTextColor(Color.WHITE);
                setTextSize(24);

            }
            enableColor =typedArray.getBoolean(R.styleable.customRadioButton_enableColor,false);
            if(enableColor ==true)
            {
                setBackgroundColor(Color.parseColor("#00BF9A"));
            }
        }
        finally {
            typedArray.recycle();
        }
    }

    public CustomRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}

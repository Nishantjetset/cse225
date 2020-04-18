package com.example.nishant225.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatCheckBox;

import com.example.nishant225.R;

public class CustomCheckBox extends AppCompatCheckBox {
    private boolean enableSwitch;
     String Text;


    public CustomCheckBox(Context context) {
        super(context);

    }

    public CustomCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray=context.obtainStyledAttributes(attrs, R.styleable.CustomCheckbox);
        try {

            enableSwitch =typedArray.getBoolean(R.styleable.CustomCheckbox_enableSwitch,false);
            Text=typedArray.getString(R.styleable.CustomCheckbox_setText1);
            if(enableSwitch ==true)
            {
                setChecked(true);
                setText(Text);
                setTextSize(24);
                setTextColor(Color.WHITE);
                setBackgroundColor(Color.parseColor("#00BF9A"));
            }else
            {
                setChecked(false);
                setText("Switch Not enabled");
                setTextColor(Color.WHITE);
            }
        }
        finally {
            typedArray.recycle();
        }
    }

    public CustomCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}


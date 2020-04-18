package com.example.nishant225.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;

import androidx.appcompat.widget.AppCompatButton;

import com.example.nishant225.R;

public class CustomButton extends AppCompatButton {
    private String Text;
    private boolean setcolor;
    public CustomButton(Context context) {
        super(context);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray=context.obtainStyledAttributes(attrs,R.styleable.buttonCustom);
        try {
            Text=typedArray.getString(R.styleable.buttonCustom_setText);
            if(Text==null)
            {
                setText("DEFAULT TEXT");
            }else {
                setText(Text);
                setTextColor(Color.WHITE);

            }
            setcolor=typedArray.getBoolean(R.styleable.buttonCustom_setButtonColor,false);
            if(setcolor==true)
            {
                setBackgroundColor(Color.parseColor("#00BF9A"));



            }
        }
        finally {
            typedArray.recycle();
        }
    }

    public CustomButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}


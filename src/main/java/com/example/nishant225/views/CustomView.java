package com.example.nishant225.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.example.nishant225.R;


public class CustomView extends View {

    Rect rect;
    Paint paint;
    Paint paintCircle;

    int SquareColor;
    int SquareSize;

    public CustomView(Context context) {
        super(context);
        init(null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }


    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }






    private void init(AttributeSet set){


        rect=new Rect();
        paint=new Paint(Paint.ANTI_ALIAS_FLAG);
        paintCircle=new Paint(Paint.ANTI_ALIAS_FLAG);
        paintCircle.setColor(Color.parseColor("#D81B60"));


        rect.left=20;
        rect.top=20;




        if(set==null) return;



        TypedArray ta=getContext().obtainStyledAttributes(set, R.styleable.CustomView);


        SquareColor=ta.getColor(R.styleable.CustomView_square_color, Color.GREEN);
        SquareSize=ta.getDimensionPixelSize(R.styleable.CustomView_square_size, 200);
        paint.setColor(SquareColor);

        rect.bottom=20+SquareSize;
        rect.right=20+SquareSize;



        ta.recycle();




    }

    public void swapColor(){
        if( paint.getColor()==SquareColor)
        { paint.setColor(Color.BLUE);
            paintCircle.setColor(Color.BLUE);}

        else{paint.setColor(SquareColor);
            paintCircle.setColor(SquareColor);}

        postInvalidate();

    }

    @Override
    protected void onDraw(Canvas canvas) {


        float cx;
        float cy;
        float radius=100f;

        cx= getWidth()-radius-50f;
        cy=rect.top+(SquareSize/2);




        canvas.drawRect(rect,paint);
        canvas.drawCircle(cx,cy,radius,paintCircle);

    }
}


package com.example.mycoordinatorlayouttest.ViewOffsetBehavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.example.mycoordinatorlayouttest.behavior.ViewOffsetBehavior;

public class CustomViewOffsetBehavior extends ViewOffsetBehavior {

    public CustomViewOffsetBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);

        setLeftAndRightOffset(100);
        setTopAndBottomOffset(400);
    }


}

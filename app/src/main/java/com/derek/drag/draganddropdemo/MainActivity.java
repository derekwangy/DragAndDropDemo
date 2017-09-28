package com.derek.drag.draganddropdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jmedeisis.draglinearlayout.DragLinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drag_activity);

        DragLinearLayout dragDropAndroidLinearLayout = (DragLinearLayout) findViewById(R.id.drag_drop_layout);
        for (int i = 0; i < dragDropAndroidLinearLayout.getChildCount(); i++) {
            View child = dragDropAndroidLinearLayout.getChildAt(i);
            dragDropAndroidLinearLayout.setViewDraggable(child, child);
        }
    }
}

package com.dd.transition;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by xmuSistone on 2016/9/18.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btStack;
    private Button btGallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();
    }

    private void initView() {
        btStack = findViewById(R.id.bt_stack);
        btGallery = findViewById(R.id.bt_gallery);
    }

    private void initEvent() {
        btStack.setOnClickListener(this);
        btGallery.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_gallery:
                startActivity(new Intent(MainActivity.this, GalleryViewPagerActivity.class));
                break;
            case R.id.bt_stack:
                startActivity(new Intent(MainActivity.this, StackViewPagerActivity.class));
                break;
            default:
                break;
        }
    }
}

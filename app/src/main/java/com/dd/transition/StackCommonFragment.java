package com.dd.transition;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;

/**
 * Created by xmuSistone on 2016/9/18.
 */
public class StackCommonFragment extends Fragment implements DragLayout.GotoDetailListener {
    private ImageView imageView;
    private String imageUrl;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_stack_common, null);
        imageView = (ImageView)rootView.findViewById(R.id.image);
        ImageLoader.getInstance().displayImage(imageUrl, imageView);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initEvent();
    }

    private void initEvent() {
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoDetail();
            }
        });
    }

    @Override
    public void gotoDetail() {
        Intent intent = new Intent(getContext(), DetailActivity.class);
        startActivity(intent);
    }

    public void bindData(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

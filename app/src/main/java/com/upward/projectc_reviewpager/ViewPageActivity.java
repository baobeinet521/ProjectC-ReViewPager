package com.upward.projectc_reviewpager;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.upward.projectc_reviewpager.adapter.GalleryAdapter;
import com.upward.projectc_reviewpager.util.DataUtil;

import java.util.List;

public class ViewPageActivity extends AppCompatActivity {

    private ViewPager mViewpager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_page_layout);

        mViewpager = findViewById(R.id.view_page_gallery);

        List<String> imageStr = DataUtil.mockAvatarList();
        GalleryAdapter mGalleryAdapter = new GalleryAdapter(this, imageStr);

        mViewpager.setAdapter(mGalleryAdapter);

//        mViewpager.setCurrentItem(0);
        //设置viewpager的切换动画
        mViewpager.setOffscreenPageLimit(5);
        mViewpager.setPageTransformer(true, new MyTransformation());
    }
}

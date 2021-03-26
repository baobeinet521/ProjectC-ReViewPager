package com.upward.projectc_reviewpager;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.upward.animation.ZoomOutPageTransformer;
import com.upward.data.LevelInfo;
import com.upward.projectc_reviewpager.adapter.GalleryAdapter;
import com.upward.projectc_reviewpager.adapter.TabAdapter;
import com.upward.projectc_reviewpager.util.DataUtil;

import java.util.List;

public class ViewPageActivity extends AppCompatActivity {

    private ViewPager mViewpager;
    private RecyclerView mRecycleView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_page_layout);

        mViewpager = findViewById(R.id.view_page_gallery);
        mRecycleView = findViewById(R.id.tab_recycleView);

        mViewpager.setClipChildren(false);
        List<String> imageStr = DataUtil.mockAvatarList();
        GalleryAdapter mGalleryAdapter = new GalleryAdapter(this, imageStr);

        mViewpager.setAdapter(mGalleryAdapter);

        mViewpager.setCurrentItem(1);
        //设置viewpager的切换动画
        mViewpager.setOffscreenPageLimit(5);
        mViewpager.setPageMargin(10);
        mViewpager.setPageTransformer(true, new ZoomOutPageTransformer());


        List<LevelInfo> mInfo = DataUtil.getLevelInfo();

        LinearLayoutManager mLinearLayoutManager =new LinearLayoutManager(this);
        mLinearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mRecycleView.setLayoutManager(mLinearLayoutManager);
        new LinearSnapHelper().attachToRecyclerView(mRecycleView);

        TabAdapter mTabAdapter = new TabAdapter(this,mInfo);

        mRecycleView.setAdapter(mTabAdapter);

    }
}

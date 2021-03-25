package com.upward.projectc_reviewpager.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Gallery;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.upward.projectc_reviewpager.R;

import java.util.ArrayList;
import java.util.List;

public class GalleryAdapter extends PagerAdapter {
    private Context mContext;
    private List<String> mImageList = new ArrayList<>();

    public GalleryAdapter(Context context, List<String> imageAddress) {
        this.mContext = context;
        this.mImageList = imageAddress;
    }

    @Override
    public int getCount() {
        if (mImageList == null) {
            return 0;
        } else {
            return mImageList.size();
        }

    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.view_page_item_layout, null);
        SimpleDraweeView mSimpleDraweeView = view.findViewById(R.id.image_item);
        loadImage(mImageList.get(position), mSimpleDraweeView);
        container.addView(view);
        return view;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }


    public void loadImage(String url, SimpleDraweeView simpleDraweeView) {
        Uri uri = Uri.parse(url);
//        sdv.setImageURI(uri);

        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setAutoPlayAnimations(true)
                .build();
        simpleDraweeView.setController(controller);
    }
}

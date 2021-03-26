package com.upward.projectc_reviewpager.adapter;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.upward.data.LevelInfo;
import com.upward.projectc_reviewpager.R;

import java.util.List;

public class TabAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private List<LevelInfo> mDatas;

    public TabAdapter(Context context, List<LevelInfo> datas) {
        this.mContext = context;
        this.mDatas = datas;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.tab_item_layout, null);
        return new TabItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof TabItemViewHolder){
            ((TabItemViewHolder) holder).mLevelText.setText(mDatas.get(position).getLevel());
            ((TabItemViewHolder) holder).mGradeText.setText(mDatas.get(position).getGrade());
        }
    }

    @Override
    public int getItemCount() {
        if (mDatas == null) {
            return 0;
        } else {
            return mDatas.size();
        }
    }

    class TabItemViewHolder extends RecyclerView.ViewHolder {

        LinearLayout mLevelLayout;
        TextView mLevelText;
        TextView mGradeText;

        public TabItemViewHolder(@NonNull View itemView) {
            super(itemView);
            mLevelLayout = itemView.findViewById(R.id.level_layout);
            mLevelText = itemView.findViewById(R.id.level_text);
            mGradeText = itemView.findViewById(R.id.grade_text);
        }
    }
}

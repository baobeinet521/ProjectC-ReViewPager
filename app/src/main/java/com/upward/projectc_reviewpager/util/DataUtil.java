package com.upward.projectc_reviewpager.util;

import com.upward.data.LevelInfo;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {
    public static List<String> mockAvatarList() {
        List<String> avatarList = new ArrayList<>();
        avatarList.add("https://b-ssl.duitang.com/uploads/item/201811/04/20181104223950_vygmz.thumb.700_0.jpeg");
        avatarList.add("https://b-ssl.duitang.com/uploads/item/201807/11/20180711091152_FakCJ.thumb.700_0.jpeg");
        avatarList.add("https://b-ssl.duitang.com/uploads/item/201811/04/20181104223952_zfhli.thumb.700_0.jpeg");
        avatarList.add("https://b-ssl.duitang.com/uploads/item/201810/30/20181030153225_mixve.thumb.700_0.jpg");
        avatarList.add("https://b-ssl.duitang.com/uploads/item/201807/08/20180708095827_SYPL3.thumb.700_0.jpeg");
        avatarList.add("https://b-ssl.duitang.com/uploads/item/201811/01/20181101093301_u2NKu.thumb.700_0.jpeg");
        avatarList.add("https://b-ssl.duitang.com/uploads/item/201811/04/20181104223950_vygmz.thumb.700_0.jpeg");
        avatarList.add("https://b-ssl.duitang.com/uploads/item/201807/11/20180711091152_FakCJ.thumb.700_0.jpeg");
        avatarList.add("https://b-ssl.duitang.com/uploads/item/201811/04/20181104223952_zfhli.thumb.700_0.jpeg");
        return avatarList;
    }

    public static List<LevelInfo> getLevelInfo(){
        List<LevelInfo> mLevelDatas = new ArrayList<>();
        mLevelDatas.add(new LevelInfo(1, "冷板凳学员", ""));
        mLevelDatas.add(new LevelInfo(2, "初级练习生", "一年级"));
        mLevelDatas.add(new LevelInfo(3, "初级练习生", "二年级"));
        mLevelDatas.add(new LevelInfo(4, "初级练习生", "三年级"));
        mLevelDatas.add(new LevelInfo(5, "初级练习生", "四年级"));
        mLevelDatas.add(new LevelInfo(6, "初级练习生", "五年级"));

        mLevelDatas.add(new LevelInfo(7, "中级练习生", "一年级"));
        mLevelDatas.add(new LevelInfo(8, "中级练习生", "二年级"));
        mLevelDatas.add(new LevelInfo(9, "中级练习生", "三年级"));
        mLevelDatas.add(new LevelInfo(10, "中级练习生", "四年级"));

        mLevelDatas.add(new LevelInfo(11, "高级练习生", "一年级"));
        mLevelDatas.add(new LevelInfo(12, "高级练习生", "二年级"));
        mLevelDatas.add(new LevelInfo(13, "高级练习生", "三年级"));

        mLevelDatas.add(new LevelInfo(14, "选秀赛", "初级生"));
        mLevelDatas.add(new LevelInfo(15, "选秀赛", "晋级生"));
        mLevelDatas.add(new LevelInfo(16, "选秀赛", "人气生"));

        mLevelDatas.add(new LevelInfo(17, "初入星路", "C位出道"));
        mLevelDatas.add(new LevelInfo(18, "初入星路", "清纯担当"));
        mLevelDatas.add(new LevelInfo(19, "初入星路", "Rap担当"));
        mLevelDatas.add(new LevelInfo(20, "初入星路", "身材担当"));
        mLevelDatas.add(new LevelInfo(21, "初入星路", "主唱担当"));
        mLevelDatas.add(new LevelInfo(22, "初入星路", "队长担当"));

        mLevelDatas.add(new LevelInfo(23, "当红艺人", "MTV主演"));
        mLevelDatas.add(new LevelInfo(24, "当红艺人", "专辑发行"));
        mLevelDatas.add(new LevelInfo(25, "当红艺人", "访谈节目"));
        mLevelDatas.add(new LevelInfo(26, "当红艺人", "全球巡演"));
        mLevelDatas.add(new LevelInfo(27, "当红艺人", "真人秀"));

        mLevelDatas.add(new LevelInfo(28, "流量明星", "最佳新人奖"));
        mLevelDatas.add(new LevelInfo(29, "流量明星", "最佳着装奖"));
        mLevelDatas.add(new LevelInfo(30, "流量明星", "最佳人气奖"));

        mLevelDatas.add(new LevelInfo(31, "顶级明星", "最佳女配角"));
        mLevelDatas.add(new LevelInfo(32, "顶级明星", "最佳女主角"));
        mLevelDatas.add(new LevelInfo(33, "顶级明星", "Bazza封面"));
        mLevelDatas.add(new LevelInfo(34, "顶级明星", "Channel代言"));

        mLevelDatas.add(new LevelInfo(35, "全球巨星", "年度影后"));
        mLevelDatas.add(new LevelInfo(36, "全球巨星", "嘎纳影后"));
        mLevelDatas.add(new LevelInfo(37, "全球巨星", "奥斯卡影后"));

        return mLevelDatas;
    }
}

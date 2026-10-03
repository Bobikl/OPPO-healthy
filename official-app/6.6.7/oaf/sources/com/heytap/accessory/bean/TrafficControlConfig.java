package com.heytap.accessory.bean;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class TrafficControlConfig {
    private static final int DEFAULT_MAX_WINDOW_SIZE = 3000000;
    public static final String KEY_BAN_CHANNEL_TYPE = "key_ban_channel_type";
    public static final String KEY_BAN_TRANSPORT_TYPE = "key_ban_transport_type";
    public static final String KEY_MAX_WINDOW_SIZE = "key_max_window_size";
    public static final String KEY_SHOW_LOG = "key_show_log";
    public static final String KEY_TC_DELAY_TIME = "key_tc_delay_time";
    public static final String KEY_TC_STRATEGY = "key_tc_strategy";
    public static final String KEY_TC_SWITCH = "key_tc_switch";
    private boolean mEnable;
    private int mHandleMsgTime;
    private boolean mShowLog;
    private int mStrategy;
    private int mMaxWindowSize = DEFAULT_MAX_WINDOW_SIZE;

    @NonNull
    private ArrayList<Integer> mTransportTypeBanList = new ArrayList<>();

    @NonNull
    private ArrayList<Integer> mChannelTypeBanList = new ArrayList<>();

    @Nullable
    public static TrafficControlConfig createFromBundle(Bundle bundle) {
        int i = bundle.getInt(KEY_TC_DELAY_TIME);
        boolean z = bundle.getBoolean(KEY_TC_SWITCH);
        int i2 = bundle.getInt(KEY_TC_STRATEGY);
        int i3 = bundle.getInt(KEY_MAX_WINDOW_SIZE);
        boolean z2 = bundle.getBoolean(KEY_SHOW_LOG);
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(KEY_BAN_TRANSPORT_TYPE);
        ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList(KEY_BAN_CHANNEL_TYPE);
        TrafficControlConfig trafficControlConfig = new TrafficControlConfig();
        trafficControlConfig.setHandleMsgTime(i);
        trafficControlConfig.setEnable(z);
        trafficControlConfig.setStrategy(i2);
        trafficControlConfig.setMaxWindowSize(i3);
        trafficControlConfig.setShowLog(z2);
        trafficControlConfig.setTransportTypeBanList(integerArrayList);
        trafficControlConfig.setChannelTypeBanList(integerArrayList2);
        return trafficControlConfig;
    }

    private ArrayList<Integer> getChannelTypeBanList() {
        return this.mChannelTypeBanList;
    }

    private ArrayList<Integer> getTransportTypeBanList() {
        return this.mTransportTypeBanList;
    }

    private void setChannelTypeBanList(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.mChannelTypeBanList = arrayList;
    }

    private void setTransportTypeBanList(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.mTransportTypeBanList = arrayList;
    }

    public TrafficControlConfig banChannelType(int i) {
        this.mChannelTypeBanList.add(Integer.valueOf(i));
        return this;
    }

    public TrafficControlConfig banTransportType(int i) {
        this.mTransportTypeBanList.add(Integer.valueOf(i));
        return this;
    }

    public void clearBanList() {
        this.mChannelTypeBanList.clear();
        this.mTransportTypeBanList.clear();
    }

    public Bundle getBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_TC_DELAY_TIME, this.mHandleMsgTime);
        bundle.putBoolean(KEY_TC_SWITCH, this.mEnable);
        bundle.putInt(KEY_TC_STRATEGY, this.mStrategy);
        bundle.putInt(KEY_MAX_WINDOW_SIZE, this.mMaxWindowSize);
        bundle.putBoolean(KEY_SHOW_LOG, this.mShowLog);
        bundle.putIntegerArrayList(KEY_BAN_TRANSPORT_TYPE, this.mTransportTypeBanList);
        bundle.putIntegerArrayList(KEY_BAN_CHANNEL_TYPE, this.mChannelTypeBanList);
        return bundle;
    }

    public int getHandleMsgTime() {
        return this.mHandleMsgTime;
    }

    public int getMaxWindowSize() {
        return this.mMaxWindowSize;
    }

    public int getStrategy() {
        return this.mStrategy;
    }

    public boolean hasChannelTypeBanned(int i) {
        return this.mChannelTypeBanList.contains(Integer.valueOf(i));
    }

    public boolean hasTransportTypeBanned(int i) {
        return this.mTransportTypeBanList.contains(Integer.valueOf(i));
    }

    public boolean isEnable() {
        return this.mEnable;
    }

    public boolean isShowLog() {
        return this.mShowLog;
    }

    public void setEnable(boolean z) {
        this.mEnable = z;
    }

    public void setHandleMsgTime(int i) {
        this.mHandleMsgTime = i;
    }

    public void setMaxWindowSize(int i) {
        this.mMaxWindowSize = i;
    }

    public void setShowLog(boolean z) {
        this.mShowLog = z;
    }

    public void setStrategy(int i) {
        this.mStrategy = i;
    }

    public String toString() {
        return "TrafficControlConfig{mHandleMsgTime=" + this.mHandleMsgTime + ", mEnable=" + this.mEnable + ", mStrategy=" + this.mStrategy + ", mMaxWindowSize=" + this.mMaxWindowSize + ", mShowLog=" + this.mShowLog + ", banChannel=" + this.mChannelTypeBanList + ", banTransport=" + this.mTransportTypeBanList + '}';
    }
}

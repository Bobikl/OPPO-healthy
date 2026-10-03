package com.heytap.store.base.core.util.statistics.bean;

import androidx.annotation.NonNull;
import com.heytap.store.base.core.util.statistics.StatisticsUtil;

/* JADX INFO: loaded from: classes3.dex */
public class StatisticsBean {
    public static final int ENTER_TYPE_FOR_BACKGROUND = 4;
    public static final int ENTER_TYPE_FOR_BROWSE_MODE = 5;
    public static final int ENTER_TYPE_FOR_CLICK = 2;
    public static final int ENTER_TYPE_FOR_LAUNCHER = 1;
    public static final int ENTER_TYPE_FOR_LINK = 3;
    private String dp_url;
    private String mAdId;
    private String mCardCode;
    private String mCardPos;
    private String mEnterId;
    private String mEnterType;
    private String mEventId;
    private String mItemId;
    private String mItemPos;
    private String mLogTag;
    private String mModuleId;
    private String mOptObj;
    private String mPageCode;
    private String mPageId;
    private String mTime;
    private String mUserStatus;

    public StatisticsBean() {
    }

    public StatisticsBean enterId(String str) {
        this.mEnterId = str;
        return this;
    }

    public StatisticsBean eventId(String str) {
        this.mEventId = str;
        return this;
    }

    public String getAdId() {
        return this.mAdId;
    }

    public String getCardCode() {
        return this.mCardCode;
    }

    public String getCardPos() {
        return this.mCardPos;
    }

    public String getDp_url() {
        return this.dp_url;
    }

    public String getEnterId() {
        return this.mEnterId;
    }

    public String getEnterType() {
        return this.mEnterType;
    }

    public String getEventId() {
        return this.mEventId;
    }

    public String getItemId() {
        return this.mItemId;
    }

    public String getItemPos() {
        return this.mItemPos;
    }

    public String getLogTag() {
        return this.mLogTag;
    }

    public String getModuleId() {
        return this.mModuleId;
    }

    public String getOptObj() {
        return this.mOptObj;
    }

    public String getPageCode() {
        return this.mPageCode;
    }

    public String getPageId() {
        return this.mPageId;
    }

    public String getTime() {
        return this.mTime;
    }

    public String getUserStatus() {
        return this.mUserStatus;
    }

    public StatisticsBean logTag(String str) {
        this.mLogTag = str;
        return this;
    }

    public StatisticsBean optObj(String str) {
        this.mOptObj = str;
        return this;
    }

    public StatisticsBean pageId(String str) {
        this.mPageId = str;
        return this;
    }

    public StatisticsBean setAdId(String str) {
        this.mAdId = str;
        return this;
    }

    public StatisticsBean setCardCode(String str) {
        this.mCardCode = str;
        return this;
    }

    public StatisticsBean setCardPos(String str) {
        this.mCardPos = str;
        return this;
    }

    public StatisticsBean setDp_url(String str) {
        this.dp_url = str;
        return this;
    }

    public StatisticsBean setEnterType(String str) {
        this.mEnterType = str;
        return this;
    }

    public StatisticsBean setItemId(String str) {
        this.mItemId = str;
        return this;
    }

    public StatisticsBean setItemPos(String str) {
        this.mItemPos = str;
        return this;
    }

    public StatisticsBean setModuleId(String str) {
        this.mModuleId = str;
        return this;
    }

    public StatisticsBean setPageCode(String str) {
        this.mPageCode = str;
        return this;
    }

    public StatisticsBean setUserStatus(String str) {
        this.mUserStatus = str;
        return this;
    }

    public void statistics() {
        StatisticsUtil.statistics(this);
    }

    public StatisticsBean time(String str) {
        this.mTime = str;
        return this;
    }

    public String toString() {
        return "StatisticsBean{mEventId='" + this.mEventId + "', mLogTag='" + this.mLogTag + "', mEnterId='" + this.mEnterId + "', mPageId='" + this.mPageId + "', mOptObj='" + this.mOptObj + "', mPageCode='" + this.mPageCode + "', mCardCode='" + this.mCardCode + "', mCardPos='" + this.mCardPos + "', mItemId='" + this.mItemId + "', mAdId='" + this.mAdId + "', mModuleId='" + this.mModuleId + "', mEnterType='" + this.mEnterType + "', mUserStatus='" + this.mUserStatus + "'}";
    }

    public StatisticsBean(@NonNull String str, @NonNull String str2) {
        this.mLogTag = str;
        this.mEventId = str2;
    }
}

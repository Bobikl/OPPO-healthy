package com.coloros.sceneservice.dataprovider.bean.scene;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.coloros.sceneservice.m.f;
import java.util.Calendar;

/* JADX INFO: loaded from: classes13.dex */
@Keep
public abstract class SceneData implements Parcelable {
    public static final int DATA_CHANGED = 1;
    public static final int DATA_CHANGED_NO = 0;
    public static final String DATA_TIME_FORMAT = "MM月dd日 HH:mm";
    public static final long DISAPPEAR_TIME_STAMP = -1;
    public static final long INVALID_TIME_STAMP = 0;
    public static final String KEY_ADDRESS_LIST = "AddressList";
    public static final String KEY_ARRIVE_TIME_STAMP = "TravelArriveTime";
    public static final String KEY_DETAIL_TYPE = "DetailType";
    public static final String KEY_MANUAL_ADD_RESULT = "ManualAddResult";
    public static final String KEY_MATCH_KEY = "MatchKey";
    public static final String KEY_NAV_DESTINATION = "NavDestination";
    public static final String KEY_OCCUR_TIME = "OccurTime";
    public static final String KEY_ORDER_INFO = "OrderInfo";
    public static final String KEY_RECEIVED_TIME = "ReceivedTime";
    public static final String KEY_SUCCESS_ONLINE = "SuccessOnline";
    public static final String KEY_TIME_STAMP = "TimeStamp";
    public static final int PROCESSED_NO = 0;
    public static final int PROCESSED_YES = 1;
    public static final int SCENE_DELETED = 1;
    public static final int SCENE_NO_DELETED = 0;
    public static final int SCENE_SOURCE_AI = 2;
    public static final int SCENE_SOURCE_EVENT = 5;
    public static final int SCENE_SOURCE_NONE = -1;
    public static final int SCENE_SOURCE_ONLINE = 3;
    public static final int SCENE_SOURCE_SMS = 0;
    public static final int SCENE_SOURCE_SUB_TYPE_SMS = 1;
    public static final int SCENE_SOURCE_USER = 1;
    public static final String TAG = "SceneData";
    public Bundle mContent;
    public Bundle mData2;
    public String mData3;
    public int mDataChangedState;
    public long mExpireTime;
    public String mExpireTimezone;
    public String mId;
    public boolean mIsDeleted;
    public String mLang;
    public long mLastOnlineTime;
    public int mLastUpdateSource;
    public String mMatchKey;
    public long mOccurTime;
    public String mOccurTimezone;
    public int mProcessStep;
    public boolean mProcessed;
    public int mSource;
    public String mSourceDataKey;
    public int mState;
    public String mSubtractId;
    public String mTargetTel;
    public int mType;

    public SceneData() {
        this.mContent = new Bundle();
        this.mLang = "zh-rCN";
        this.mOccurTime = 0L;
        this.mExpireTime = 0L;
        this.mLastOnlineTime = 0L;
        this.mIsDeleted = false;
        this.mLastUpdateSource = -1;
        this.mDataChangedState = 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getArriveTimeStamp() {
        String string = this.mContent.getString(KEY_ARRIVE_TIME_STAMP);
        if (!TextUtils.isEmpty(string)) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
                f.e(TAG, "getReceivedTime strRet str = " + string);
            }
        }
        return 0L;
    }

    public Bundle getContent() {
        return this.mContent;
    }

    public Bundle getData2() {
        return this.mData2;
    }

    public String getData3() {
        return this.mData3;
    }

    public int getDataChangedState() {
        return this.mDataChangedState;
    }

    public long getDefaultExpireTime() {
        return 0L;
    }

    public abstract String getDefaultMatchKey();

    public int getDetailType() {
        try {
            return Integer.parseInt(this.mContent.getString(KEY_DETAIL_TYPE));
        } catch (NumberFormatException e2) {
            f.e(TAG, "getDetailType e = " + e2);
            return -1;
        }
    }

    public long getExpireTime() {
        long j2 = this.mExpireTime;
        return j2 == 0 ? getDefaultExpireTime() : j2;
    }

    public String getExpireTimezone() {
        return this.mExpireTimezone;
    }

    public String getId() {
        return this.mId;
    }

    public final String getLanguage() {
        return this.mLang;
    }

    public long getLastOnlineTime() {
        return this.mLastOnlineTime;
    }

    public int getLastUpdateSource() {
        return this.mLastUpdateSource;
    }

    public String getManualAddResult() {
        return this.mContent.getString(KEY_MANUAL_ADD_RESULT);
    }

    public final String getMatchKey() {
        return TextUtils.isEmpty(this.mMatchKey) ? getDefaultMatchKey() : this.mMatchKey;
    }

    public final String getNavDestination() {
        return this.mContent.getString(KEY_NAV_DESTINATION);
    }

    public final long getOccurTime() {
        return this.mOccurTime;
    }

    public final String getOccurTimezone() {
        return this.mOccurTimezone;
    }

    public String getOnlineKey() {
        return null;
    }

    public String getOrderInfo() {
        return this.mContent.getString(KEY_ORDER_INFO);
    }

    public int getProcessStep() {
        return this.mProcessStep;
    }

    public long getReceivedTime() {
        String string = this.mContent.getString(KEY_RECEIVED_TIME);
        if (!TextUtils.isEmpty(string)) {
            try {
                return Long.parseLong(string);
            } catch (NumberFormatException unused) {
                f.e(TAG, "getReceivedTime strRet str = " + string);
            }
        }
        return 0L;
    }

    public int getSource() {
        return this.mSource;
    }

    public final String getSourceKey() {
        return this.mSourceDataKey;
    }

    public int getState() {
        return this.mState;
    }

    public String getSubtractId() {
        return this.mSubtractId;
    }

    public String getTargetTel() {
        return this.mTargetTel;
    }

    public int getType() {
        return this.mType;
    }

    public boolean isDeleted() {
        return this.mIsDeleted;
    }

    public final boolean isExpired() {
        return Calendar.getInstance().getTimeInMillis() - getExpireTime() > 0;
    }

    public boolean isOnlineConvertSuccess() {
        return this.mContent.getBoolean(KEY_SUCCESS_ONLINE);
    }

    public boolean isProcessed() {
        return this.mProcessed;
    }

    public boolean isUsable() {
        return true;
    }

    public boolean isValid() {
        return false;
    }

    public void setArriveTimeStamp(long j2) {
        this.mContent.putString(KEY_ARRIVE_TIME_STAMP, String.valueOf(j2));
    }

    public void setContent(Bundle bundle) {
        if (bundle == null) {
            this.mContent = new Bundle();
        } else {
            this.mContent = bundle;
        }
    }

    public void setData2(Bundle bundle) {
        this.mData2 = bundle;
    }

    public void setData3(String str) {
        this.mData3 = str;
    }

    public void setDataChangedState(int i) {
        this.mDataChangedState = i;
    }

    public void setDeleted(boolean z) {
        this.mIsDeleted = z;
    }

    public void setDetailType(int i) {
        this.mContent.putString(KEY_DETAIL_TYPE, String.valueOf(i));
    }

    public void setExpireTime(long j2) {
        this.mExpireTime = j2;
    }

    public void setExpireTimezone(String str) {
        this.mExpireTimezone = str;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public final void setLanguage(String str) {
        this.mLang = str;
    }

    public void setLastOnlineTime(long j2) {
        this.mLastOnlineTime = j2;
    }

    public void setLastUpdateSource(int i) {
        this.mLastUpdateSource = i;
    }

    public void setManualAddResult(String str) {
        this.mContent.putString(KEY_MANUAL_ADD_RESULT, str);
    }

    public final void setMatchKey(String str) {
        this.mMatchKey = str;
    }

    public final void setNavDestination(String str) {
        this.mContent.putString(KEY_NAV_DESTINATION, str);
    }

    public final void setOccurTime(long j2) {
        this.mOccurTime = j2;
    }

    public final void setOccurTimezone(String str) {
        this.mOccurTimezone = str;
    }

    public void setOnlineConvertSuccess(boolean z) {
        this.mContent.putBoolean(KEY_SUCCESS_ONLINE, z);
    }

    public void setOrderInfo(String str) {
        this.mContent.putString(KEY_ORDER_INFO, str);
    }

    public void setProcessStep(int i) {
        this.mProcessStep = i;
    }

    public void setProcessed(boolean z) {
        this.mProcessed = z;
    }

    public void setReceivedTime(long j2) {
        this.mContent.putString(KEY_RECEIVED_TIME, String.valueOf(j2));
    }

    public void setSource(int i) {
        this.mSource = i;
    }

    public final void setSourceDataKey(String str) {
        this.mSourceDataKey = str;
    }

    public void setState(int i) {
        this.mState = i;
    }

    public void setSubtractId(String str) {
        this.mSubtractId = str;
    }

    public void setTargetTel(String str) {
        this.mTargetTel = str;
    }

    public void setTimeStamp(long j2) {
        this.mContent.putString("TimeStamp", String.valueOf(j2));
    }

    public void setType(int i) {
        this.mType = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SceneData {");
        sb.append("mId:" + getId());
        sb.append(", mType:" + getType());
        sb.append(", mMatchKey:" + getMatchKey());
        sb.append(", mOccurTime:" + getOccurTime());
        sb.append(", mExpireTime:" + getExpireTime());
        sb.append(", mLastOnlineTime:" + getLastOnlineTime());
        sb.append(", mIsOnlineConvertSuccess:" + isOnlineConvertSuccess());
        sb.append(", mIsDeleted:" + isDeleted());
        sb.append(",mSource:" + this.mSource);
        sb.append(", mProcessed:" + isProcessed());
        sb.append(", mProcessStep:" + getProcessStep());
        sb.append(", mSource:" + getSource());
        sb.append(", mContent:" + this.mContent);
        sb.append(", DATA2:" + this.mData2);
        sb.append(", DATA3:" + this.mData3);
        sb.append(", TARGET_TEL:" + this.mTargetTel);
        sb.append(", mOccurTimezone:" + getOccurTimezone());
        sb.append(", mExpireTimezone:" + getExpireTimezone());
        sb.append(", mDataChangedState:" + getDataChangedState());
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mMatchKey);
        parcel.writeString(this.mLang);
        parcel.writeLong(this.mOccurTime);
        parcel.writeString(this.mOccurTimezone);
        parcel.writeBundle(this.mContent);
    }

    public SceneData(Parcel parcel) {
        this.mContent = new Bundle();
        this.mLang = "zh-rCN";
        this.mOccurTime = 0L;
        this.mExpireTime = 0L;
        this.mLastOnlineTime = 0L;
        this.mIsDeleted = false;
        this.mLastUpdateSource = -1;
        this.mDataChangedState = 0;
        this.mMatchKey = parcel.readString();
        this.mLang = parcel.readString();
        this.mOccurTime = parcel.readLong();
        this.mOccurTimezone = parcel.readString();
        this.mContent.putAll(parcel.readBundle(getClass().getClassLoader()));
    }
}

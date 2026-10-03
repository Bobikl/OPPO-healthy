package com.ted.number.entrys;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public class RequestData implements Parcelable {
    public static final Parcelable.Creator<RequestData> CREATOR = new Parcelable.Creator<RequestData>() { // from class: com.ted.number.entrys.RequestData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RequestData createFromParcel(Parcel parcel) {
            return new RequestData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RequestData[] newArray(int i) {
            return new RequestData[i];
        }
    };
    private int mDataType;
    private int mDuration;
    private long mLastTime;
    private String mMsgBody;
    private boolean mNetAccessable;
    private String mNumber;
    private int mOperationType;
    private long mRecordTime;
    private int mRingTime;
    private int mSceneType;
    private String mShopId;
    private int mSlotId;
    private long mTimeout;

    public static class Builder {
        private int mDataType;
        private int mDuration;
        private long mLastTime;
        private String mMsgBody;
        private boolean mNetAccessable;
        private String mNumber;
        private int mOperationType;
        private long mRecordTime;
        private int mRingTime;
        private int mSceneType;
        private String mShopId;
        private int mSlotId;
        private long mTimeout;

        public RequestData build() {
            return new RequestData(this);
        }

        public Builder setDataType(int i) {
            this.mDataType = i;
            return this;
        }

        public Builder setDuration(int i) {
            this.mDuration = i;
            return this;
        }

        public Builder setLastTime(long j2) {
            this.mLastTime = j2;
            return this;
        }

        public Builder setMsgBody(String str) {
            this.mMsgBody = str;
            return this;
        }

        public Builder setNetAccessable(boolean z) {
            this.mNetAccessable = z;
            return this;
        }

        public Builder setNumber(String str) {
            this.mNumber = str;
            return this;
        }

        public Builder setOperationType(int i) {
            this.mOperationType = i;
            return this;
        }

        public Builder setRecordTime(long j2) {
            this.mRecordTime = j2;
            return this;
        }

        public Builder setRingTime(int i) {
            this.mRingTime = i;
            return this;
        }

        public Builder setSceneType(int i) {
            this.mSceneType = i;
            return this;
        }

        public Builder setShopId(String str) {
            this.mShopId = str;
            return this;
        }

        public Builder setSlotId(int i) {
            this.mSlotId = i;
            return this;
        }

        public Builder setTimeout(long j2) {
            this.mTimeout = j2;
            return this;
        }
    }

    public RequestData(Builder builder) {
        this.mNumber = builder.mNumber;
        this.mDataType = builder.mDataType;
        this.mOperationType = builder.mOperationType;
        this.mDuration = builder.mDuration;
        this.mMsgBody = builder.mMsgBody;
        this.mNetAccessable = builder.mNetAccessable;
        this.mTimeout = builder.mTimeout;
        this.mRingTime = builder.mRingTime;
        this.mRecordTime = builder.mRecordTime;
        this.mSlotId = builder.mSlotId;
        this.mShopId = builder.mShopId;
        this.mLastTime = builder.mLastTime;
        this.mSceneType = builder.mSceneType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mNumber);
        parcel.writeInt(this.mDataType);
        parcel.writeInt(this.mOperationType);
        parcel.writeInt(this.mDuration);
        parcel.writeString(this.mMsgBody);
        parcel.writeByte(this.mNetAccessable ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.mTimeout);
        parcel.writeInt(this.mRingTime);
        parcel.writeLong(this.mRecordTime);
        parcel.writeInt(this.mSlotId);
        parcel.writeString(this.mShopId);
        parcel.writeLong(this.mLastTime);
        parcel.writeInt(this.mSceneType);
    }

    public RequestData(Parcel parcel) {
        this.mNumber = parcel.readString();
        this.mDataType = parcel.readInt();
        this.mOperationType = parcel.readInt();
        this.mDuration = parcel.readInt();
        this.mMsgBody = parcel.readString();
        this.mNetAccessable = parcel.readByte() != 0;
        this.mTimeout = parcel.readLong();
        this.mRingTime = parcel.readInt();
        this.mRecordTime = parcel.readLong();
        this.mSlotId = parcel.readInt();
        this.mShopId = parcel.readString();
        this.mLastTime = parcel.readLong();
        this.mSceneType = parcel.readInt();
    }
}

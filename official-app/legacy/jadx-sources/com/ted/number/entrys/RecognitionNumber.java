package com.ted.number.entrys;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class RecognitionNumber implements Parcelable {
    public static final Parcelable.Creator<RecognitionNumber> CREATOR = new Parcelable.Creator<RecognitionNumber>() { // from class: com.ted.number.entrys.RecognitionNumber.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RecognitionNumber createFromParcel(Parcel parcel) {
            return new RecognitionNumber(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RecognitionNumber[] newArray(int i) {
            return new RecognitionNumber[i];
        }
    };
    private String mAddress;
    private String mLogo;
    private MarkerData mMarkerData;
    private String mName;

    public static class MarkerData implements Parcelable {
        public static final Parcelable.Creator<MarkerData> CREATOR = new Parcelable.Creator<MarkerData>() { // from class: com.ted.number.entrys.RecognitionNumber.MarkerData.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MarkerData createFromParcel(Parcel parcel) {
                return new MarkerData(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MarkerData[] newArray(int i) {
                return new MarkerData[i];
            }
        };
        private final String mClassify;
        private final int mCounter;
        private final boolean mIsCustomMark;
        private final boolean mIsNoMark;
        private final boolean mIsUploaded;
        private final int mRiskLevel;
        private final int mTagType;

        public MarkerData(Parcel parcel) {
            this.mCounter = parcel.readInt();
            this.mTagType = parcel.readInt();
            this.mClassify = parcel.readString();
            this.mRiskLevel = parcel.readInt();
            this.mIsNoMark = parcel.readByte() != 0;
            this.mIsUploaded = parcel.readByte() != 0;
            this.mIsCustomMark = parcel.readByte() != 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public String getClassify() {
            return this.mClassify;
        }

        public int getCounter() {
            return this.mCounter;
        }

        public int getRiskLevel() {
            return this.mRiskLevel;
        }

        public int getTagType() {
            return this.mTagType;
        }

        public int hashCode() {
            return super.hashCode();
        }

        public boolean isCustomMark() {
            return this.mIsCustomMark;
        }

        public boolean isNoMark() {
            return this.mIsNoMark;
        }

        public boolean isUploaded() {
            return this.mIsUploaded;
        }

        @NonNull
        public String toString() {
            return "MarkerData{mCounter=" + this.mCounter + ", mTagType=" + this.mTagType + ", mClassify='" + this.mClassify + "', mRiskLevel=" + this.mRiskLevel + ", mIsNoMark=" + this.mIsNoMark + ", mIsUploaded=" + this.mIsUploaded + ", mIsCustomMark=" + this.mIsCustomMark + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mCounter);
            parcel.writeInt(this.mTagType);
            parcel.writeString(this.mClassify);
            parcel.writeInt(this.mRiskLevel);
            parcel.writeByte(this.mIsNoMark ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.mIsUploaded ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.mIsCustomMark ? (byte) 1 : (byte) 0);
        }
    }

    public RecognitionNumber() {
    }

    private void readFromParcel(Parcel parcel) {
        this.mName = parcel.readString();
        this.mLogo = parcel.readString();
        this.mAddress = parcel.readString();
        this.mMarkerData = ((MarkerData[]) parcel.createTypedArray(MarkerData.CREATOR))[0];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getAddress() {
        return this.mAddress;
    }

    public String getLogo() {
        return this.mLogo;
    }

    public MarkerData getMarkerData() {
        return this.mMarkerData;
    }

    public String getName() {
        return this.mName;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public void setAddress(String str) {
        this.mAddress = str;
    }

    public void setLogo(String str) {
        this.mLogo = str;
    }

    public void setMarkerData(MarkerData markerData) {
        this.mMarkerData = markerData;
    }

    public void setName(String str) {
        this.mName = str;
    }

    @NonNull
    public String toString() {
        return "RecognitionNumber{mName='" + this.mName + "', mLogo='" + this.mLogo + "', mAddress='" + this.mAddress + "', mMarkerData=" + this.mMarkerData + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mName);
        parcel.writeString(this.mLogo);
        parcel.writeString(this.mAddress);
        parcel.writeTypedArray(new MarkerData[]{this.mMarkerData}, 0);
    }

    public RecognitionNumber(Parcel parcel) {
        readFromParcel(parcel);
    }
}

package com.heytap.health.watch.notification.impl.breeno.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class MovieData implements Parcelable {
    public static final Parcelable.Creator<MovieData> CREATOR = new a();
    private static final String KEY_CINEMA = "Cinema";
    private static final String KEY_CINEMA_ADDRESS = "CinemaAdress";
    private static final String KEY_DATE_TIME = "Date";
    private static final String KEY_DURATION = "duration";
    private static final String KEY_HALL = "Hall";
    private static final String KEY_NAME = "Name";
    private static final String KEY_OCCUR_TIME = "OccurTime";
    private static final String KEY_PICK_CODE = "Code";
    private static final String KEY_SEAT_NUM = "Seat";
    private static final String KEY_VERIFICATION = "Verification";
    private static final String TIP_STEP = "tipStep";
    private static final String TRIP_ID = "mTripId";
    private static final String VERSION_CODE = "versionCode";
    public String mCinema;
    public String mCinemaAddress;
    public String mDateTime;
    public int mDuration;
    public String mHall;
    public String mMovieName;
    public long mOccurTime;
    public String mPickCode;
    public String mSeatNum;
    public long mTripId;
    public String mTripStep;
    public String mVerification;
    public int mVersionCode;

    public class a implements Parcelable.Creator<MovieData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MovieData createFromParcel(Parcel parcel) {
            return new MovieData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MovieData[] newArray(int i) {
            return new MovieData[i];
        }
    }

    public MovieData(Bundle bundle) {
        this.mVersionCode = -1;
        this.mTripId = -1L;
        if (bundle == null) {
            return;
        }
        this.mVersionCode = bundle.getInt("versionCode", -1);
        this.mTripId = bundle.getLong(TRIP_ID, -1L);
        this.mTripStep = bundle.getString("tipStep");
        this.mCinema = bundle.getString("Cinema");
        this.mDateTime = bundle.getString("Date");
        this.mMovieName = bundle.getString("Name");
        this.mSeatNum = bundle.getString("Seat");
        this.mPickCode = bundle.getString("Code");
        this.mVerification = bundle.getString("Verification");
        this.mHall = bundle.getString("Hall");
        this.mCinemaAddress = bundle.getString("CinemaAdress");
        this.mDuration = bundle.getInt("duration");
        this.mOccurTime = bundle.getLong("OccurTime");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mDuration);
        parcel.writeInt(this.mVersionCode);
        parcel.writeLong(this.mTripId);
        parcel.writeString(this.mTripStep);
        parcel.writeString(this.mCinema);
        parcel.writeString(this.mDateTime);
        parcel.writeString(this.mMovieName);
        parcel.writeString(this.mSeatNum);
        parcel.writeString(this.mPickCode);
        parcel.writeString(this.mVerification);
        parcel.writeString(this.mHall);
        parcel.writeString(this.mCinemaAddress);
        parcel.writeLong(this.mOccurTime);
    }

    public MovieData(Parcel parcel) {
        this.mVersionCode = -1;
        this.mTripId = -1L;
        this.mDuration = parcel.readInt();
        this.mVersionCode = parcel.readInt();
        this.mTripId = parcel.readLong();
        this.mTripStep = parcel.readString();
        this.mCinema = parcel.readString();
        this.mDateTime = parcel.readString();
        this.mMovieName = parcel.readString();
        this.mSeatNum = parcel.readString();
        this.mPickCode = parcel.readString();
        this.mVerification = parcel.readString();
        this.mHall = parcel.readString();
        this.mCinemaAddress = parcel.readString();
        this.mOccurTime = parcel.readLong();
    }
}

package com.heytap.health.watch.notification.impl.breeno.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class TrainData implements Parcelable {
    public static final String AD_DEEPLINK_URL = "adDeeplinkUrl";
    public static final String AD_INSTANT_URL = "adInstantUrl";
    public static final String AD_TARGET_URL = "adTargetUrl";
    private static final String ARRIVE_CODE = "arriveCode";
    private static final String ARRIVE_DATE = "arriveDate";
    private static final String ARRIVE_TIME = "arriveTime";
    private static final String ARRIVE_TIME_INMILLS = "arriveTimeInMills";
    public static final Parcelable.Creator<TrainData> CREATOR = new a();
    private static final String DEPART_CODE = "departCode";
    public static final String DETAIL_DEEPLINK_URL = "detailDeepLinkUrl";
    public static final String DETAIL_H5_URL = "detailH5Url";
    public static final String DETAIL_INSTANT_URL = "detailInstantUrl";
    private static final String END_PLACE = "endPlace";
    private static final String EXPIRE_TIME = "expireTime";
    private static final String LIFE_TIME = "card_life_time";
    private static final String MATCH_KEY = "MatchKey";
    private static final String NAV_DESTINATION = "navDestination";
    private static final String NAV_DURATION = "navDuration";
    private static final String PASSENGER_NAME = "passengerName";
    private static final String SEAT = "seat";
    private static final String START_PLACE = "startPlace";
    private static final String TAKEOFF_DATE = "takeOffDate";
    private static final String TAKEOFF_LATITUDE = "takeOffLatitude";
    private static final String TAKEOFF_LAT_LONG_TYPE = "takeOffLatLongType";
    private static final String TAKEOFF_LONGITUDE = "takeOffLongitude";
    private static final String TAKEOFF_TIME = "takeOffTime";
    private static final String TAKEOFF_TIMEZONE = "takeOffTimeZone";
    private static final String TAKEOFF_TIME_INMILLS = "takeOffTimeInMills";
    private static final String TERMINUS = "terminus";
    private static final String TICKET_GATE = "ticketGate";
    private static final String TIP_STEP = "tipStep";
    private static final String TRAIN_NUMBER = "trainNumber";
    private static final String TRIP_ID = "tripId";
    private static final String TRIP_TYPE = "trip_type";
    private static final String VERSION_CODE = "versionCode";
    public String mAdDeeplinkUrl;
    public String mAdInstantUrl;
    public String mAdTargetUrl;
    public String mArriveCode;
    public String mArriveDate;
    public String mArriveTime;
    public long mArriveTimeInMills;
    public String mDepartCode;
    public String mDetailDeepLink;
    public String mDetailInstantLink;
    public String mDetailWebLink;
    public String mEndPlace;
    public long mExpireTime;
    public long mLifeTime;
    public String mMatchKey;
    public String mNavDestination;
    public long mNavDuration;
    public String mPassengerName;
    private String mSceneId;
    public String mSeat;
    private String mServiceId;
    public String mStartPlace;
    public String mTakeOffDate;
    public String mTakeOffLatLongType;
    public double mTakeOffLatitude;
    public double mTakeOffLongitude;
    public String mTakeOffTime;
    public long mTakeOffTimeInMills;
    public String mTakeOffTimeZone;
    public String mTerminus;
    public String mTicketGate;
    public String mTrainNumber;
    public long mTripId;
    public String mTripStep;
    public int mType;
    public int mVersionCode;

    public class a implements Parcelable.Creator<TrainData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainData createFromParcel(Parcel parcel) {
            return new TrainData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrainData[] newArray(int i) {
            return new TrainData[i];
        }
    }

    public TrainData() {
        this.mTakeOffTimeInMills = -1L;
        this.mTakeOffLatitude = -1.0d;
        this.mTakeOffLongitude = -1.0d;
        this.mArriveTimeInMills = -1L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void initData(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.mVersionCode = bundle.getInt("versionCode", -1);
        this.mType = bundle.getInt("trip_type", -1);
        this.mMatchKey = bundle.getString("MatchKey", null);
        this.mTripId = bundle.getLong("tripId", -1L);
        this.mTripStep = bundle.getString("tipStep", null);
        this.mAdInstantUrl = bundle.getString("adInstantUrl", null);
        this.mAdTargetUrl = bundle.getString("adTargetUrl", null);
        this.mAdDeeplinkUrl = bundle.getString("adDeeplinkUrl", null);
        this.mDetailDeepLink = bundle.getString("detailDeepLinkUrl", null);
        this.mDetailInstantLink = bundle.getString("detailInstantUrl", null);
        this.mDetailWebLink = bundle.getString("detailH5Url", null);
        this.mTakeOffTimeInMills = bundle.getLong(TAKEOFF_TIME_INMILLS, -1L);
        this.mTakeOffDate = bundle.getString(TAKEOFF_DATE, null);
        this.mTakeOffTime = bundle.getString(TAKEOFF_TIME, null);
        this.mTakeOffTimeZone = bundle.getString(TAKEOFF_TIMEZONE, null);
        this.mTakeOffLatitude = bundle.getDouble(TAKEOFF_LATITUDE, -1.0d);
        this.mTakeOffLongitude = bundle.getDouble(TAKEOFF_LONGITUDE, -1.0d);
        this.mTakeOffLatLongType = bundle.getString(TAKEOFF_LAT_LONG_TYPE, null);
        this.mNavDestination = bundle.getString(NAV_DESTINATION, null);
        this.mTerminus = bundle.getString(TERMINUS, null);
        this.mStartPlace = bundle.getString(START_PLACE, null);
        this.mEndPlace = bundle.getString(END_PLACE, null);
        this.mDepartCode = bundle.getString(DEPART_CODE, null);
        this.mArriveCode = bundle.getString(ARRIVE_CODE, null);
        this.mArriveTimeInMills = bundle.getLong(ARRIVE_TIME_INMILLS, -1L);
        this.mArriveDate = bundle.getString(ARRIVE_DATE, null);
        this.mArriveTime = bundle.getString(ARRIVE_TIME, null);
        this.mPassengerName = bundle.getString(PASSENGER_NAME, null);
        this.mTrainNumber = bundle.getString(TRAIN_NUMBER, null);
        this.mTicketGate = bundle.getString(TICKET_GATE, null);
        this.mSeat = bundle.getString(SEAT, null);
        this.mNavDuration = bundle.getInt(NAV_DURATION, -1);
        this.mExpireTime = bundle.getLong(EXPIRE_TIME, -1L);
        this.mLifeTime = bundle.getLong("card_life_time", -1L);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mVersionCode);
        parcel.writeInt(this.mType);
        parcel.writeString(this.mMatchKey);
        parcel.writeLong(this.mTripId);
        parcel.writeString(this.mSceneId);
        parcel.writeString(this.mServiceId);
        parcel.writeString(this.mTripStep);
        parcel.writeString(this.mAdInstantUrl);
        parcel.writeString(this.mAdTargetUrl);
        parcel.writeString(this.mAdDeeplinkUrl);
        parcel.writeString(this.mDetailDeepLink);
        parcel.writeString(this.mDetailInstantLink);
        parcel.writeString(this.mDetailWebLink);
        parcel.writeLong(this.mTakeOffTimeInMills);
        parcel.writeString(this.mTakeOffDate);
        parcel.writeString(this.mTakeOffTime);
        parcel.writeString(this.mTakeOffTimeZone);
        parcel.writeDouble(this.mTakeOffLatitude);
        parcel.writeDouble(this.mTakeOffLongitude);
        parcel.writeString(this.mTakeOffLatLongType);
        parcel.writeString(this.mNavDestination);
        parcel.writeString(this.mTerminus);
        parcel.writeString(this.mStartPlace);
        parcel.writeString(this.mEndPlace);
        parcel.writeString(this.mDepartCode);
        parcel.writeString(this.mArriveCode);
        parcel.writeLong(this.mArriveTimeInMills);
        parcel.writeString(this.mArriveDate);
        parcel.writeString(this.mArriveTime);
        parcel.writeString(this.mPassengerName);
        parcel.writeString(this.mTicketGate);
        parcel.writeString(this.mSeat);
        parcel.writeString(this.mTrainNumber);
        parcel.writeLong(this.mNavDuration);
        parcel.writeLong(this.mExpireTime);
        parcel.writeLong(this.mLifeTime);
    }

    public TrainData(Parcel parcel) {
        this.mTakeOffTimeInMills = -1L;
        this.mTakeOffLatitude = -1.0d;
        this.mTakeOffLongitude = -1.0d;
        this.mArriveTimeInMills = -1L;
        this.mVersionCode = parcel.readInt();
        this.mType = parcel.readInt();
        this.mMatchKey = parcel.readString();
        this.mTripId = parcel.readLong();
        this.mSceneId = parcel.readString();
        this.mServiceId = parcel.readString();
        this.mTripStep = parcel.readString();
        this.mAdInstantUrl = parcel.readString();
        this.mAdTargetUrl = parcel.readString();
        this.mAdDeeplinkUrl = parcel.readString();
        this.mDetailDeepLink = parcel.readString();
        this.mDetailInstantLink = parcel.readString();
        this.mDetailWebLink = parcel.readString();
        this.mTakeOffTimeInMills = parcel.readLong();
        this.mTakeOffDate = parcel.readString();
        this.mTakeOffTime = parcel.readString();
        this.mTakeOffTimeZone = parcel.readString();
        this.mTakeOffLatitude = parcel.readDouble();
        this.mTakeOffLongitude = parcel.readDouble();
        this.mTakeOffLatLongType = parcel.readString();
        this.mNavDestination = parcel.readString();
        this.mTerminus = parcel.readString();
        this.mStartPlace = parcel.readString();
        this.mEndPlace = parcel.readString();
        this.mDepartCode = parcel.readString();
        this.mArriveCode = parcel.readString();
        this.mArriveTimeInMills = parcel.readLong();
        this.mArriveDate = parcel.readString();
        this.mArriveTime = parcel.readString();
        this.mPassengerName = parcel.readString();
        this.mTicketGate = parcel.readString();
        this.mSeat = parcel.readString();
        this.mTrainNumber = parcel.readString();
        this.mNavDuration = parcel.readLong();
        this.mExpireTime = parcel.readLong();
        this.mLifeTime = parcel.readLong();
    }
}

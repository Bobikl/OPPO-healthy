package com.heytap.health.watch.notification.impl.breeno.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class FlightData implements Parcelable {
    public static final String AD_DEEPLINK_URL = "adDeeplinkUrl";
    public static final String AD_INSTANT_URL = "adInstantUrl";
    public static final String AD_TARGET_URL = "adTargetUrl";
    private static final String ARRIVE_DATE = "arriveDate";
    private static final String ARRIVE_LATITUDE = "arriveLatitude";
    private static final String ARRIVE_LONGITUDE = "arriveLongitude";
    private static final String ARRIVE_TIME = "arriveTime";
    private static final String ARRIVE_TIME_IN_MILLS = "arriveTimeInMills";
    private static final String BAGGAGE_CAROUSEL = "baggageCarousel";
    private static final String BOARDING_GATE = "boardingGate";
    public static final String CHECK_IN_DEEPLINK_URL = "checkInDeepLinkUrl";
    public static final String CHECK_IN_H5_URL = "checkInH5Url";
    public static final String CHECK_IN_INSTANT_URL = "checkInInstantUrl";
    private static final String CHECK_IN_OFFICE = "checkInOffice";
    public static final Parcelable.Creator<FlightData> CREATOR = new a();
    public static final String DETAIL_DEEPLINK_URL = "detailDeepLinkUrl";
    public static final String DETAIL_H5_URL = "detailH5Url";
    public static final String DETAIL_INSTANT_URL = "detailInstantUrl";
    private static final String END_PLACE = "endPlace";
    private static final String END_PLACE_CODE = "endPlaceCode";
    private static final String EXPIRE_TIME = "expireTime";
    private static final String FLIGHT_COMPANY_LOGO_URL = "logoUrl";
    private static final String FLIGHT_COMPANY_NAME = "flightCompanyName";
    public static final String FLIGHT_DURATION = "flightDuration";
    private static final String FLIGHT_NUMBER = "flightNumber";
    private static final String FLIGHT_STATUS = "flightStatus";
    private static final String LIFE_TIME = "card_life_time";
    private static final String MATCH_KEY = "MatchKey";
    private static final String NAV_DESTINATION = "navDestination";
    private static final String NAV_DURATION = "navDuration";
    private static final String ORIGIN = "origin";
    private static final String PASSENGER_NAME = "passengerName";
    private static final String SEAT_NUM = "seatNum";
    private static final String START_PLACE = "startPlace";
    private static final String START_PLACE_CODE = "startPlaceCode";
    private static final String TAKEOFF_DATE = "takeOffDate";
    private static final String TAKEOFF_LATITUDE = "takeOffLatitude";
    private static final String TAKEOFF_LONGITUDE = "takeOffLongitude";
    private static final String TAKEOFF_TIME = "takeOffTime";
    private static final String TAKEOFF_TIMEZONE = "takeOffTimeZone";
    private static final String TAKEOFF_TIME_IN_MILLS = "takeOffTimeInMills";
    private static final String TERMINUS = "terminus";
    private static final String TIP_STEP = "tipStep";
    private static final String TRIP_ID = "tripId";
    public static final String TRIP_TYPE = "trip_type";
    private static final String VERSION_CODE = "versionCode";
    public String mAdDeeplinkUrl;
    public String mAdInstantUrl;
    public String mAdTargetUrl;
    public String mArriveDate;
    public double mArriveLatitude;
    public double mArriveLongitude;
    public String mArriveTime;
    public long mArriveTimeInMills;
    public String mBaggageCarousel;
    public String mBoardingGate;
    public String mCheckInDeepLinkUrl;
    public String mCheckInH5Url;
    public String mCheckInInstantUrl;
    public String mCheckInOffice;
    public String mDetailDeepLink;
    public String mDetailInstantLink;
    public String mDetailWebLink;
    public String mEndPlace;
    public String mEndPlaceCode;
    public long mExpireTime;
    public String mFlightCompanyName;
    public long mFlightDuration;
    public String mFlightNumber;
    public String mFlightStatus;
    public long mLifeTime;
    public String mLogoUrl;
    public String mMatchKey;
    public String mNavDestination;
    public long mNavDuration;
    public String mOrigin;
    public String mPassengerName;
    public String mSeatNum;
    public String mStartPlace;
    public String mStartPlaceCode;
    public String mTakeOffDate;
    public double mTakeOffLatitude;
    public double mTakeOffLongitude;
    public String mTakeOffTime;
    public long mTakeOffTimeInMills;
    public String mTakeOffTimeZone;
    public String mTerminus;
    public long mTripId;
    public String mTripStep;
    public int mType;
    public int mVersionCode;

    public class a implements Parcelable.Creator<FlightData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FlightData createFromParcel(Parcel parcel) {
            return new FlightData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FlightData[] newArray(int i) {
            return new FlightData[i];
        }
    }

    public FlightData() {
        this.mTakeOffTimeInMills = -1L;
        this.mTakeOffLatitude = -1.0d;
        this.mTakeOffLongitude = -1.0d;
        this.mArriveTimeInMills = -1L;
        this.mArriveLatitude = -1.0d;
        this.mArriveLongitude = -1.0d;
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
        this.mCheckInH5Url = bundle.getString(CHECK_IN_H5_URL, null);
        this.mCheckInDeepLinkUrl = bundle.getString(CHECK_IN_DEEPLINK_URL, null);
        this.mCheckInInstantUrl = bundle.getString(CHECK_IN_INSTANT_URL, null);
        this.mDetailDeepLink = bundle.getString("detailDeepLinkUrl", null);
        this.mDetailInstantLink = bundle.getString("detailInstantUrl", null);
        this.mDetailWebLink = bundle.getString("detailH5Url", null);
        this.mTakeOffTimeInMills = bundle.getLong(TAKEOFF_TIME_IN_MILLS, -1L);
        this.mTakeOffDate = bundle.getString(TAKEOFF_DATE, null);
        this.mTakeOffTime = bundle.getString(TAKEOFF_TIME, null);
        this.mTakeOffTimeZone = bundle.getString(TAKEOFF_TIMEZONE, null);
        this.mTakeOffLatitude = bundle.getDouble(TAKEOFF_LATITUDE, -1.0d);
        this.mTakeOffLongitude = bundle.getDouble(TAKEOFF_LONGITUDE, -1.0d);
        this.mNavDestination = bundle.getString(NAV_DESTINATION, null);
        this.mOrigin = bundle.getString(ORIGIN, null);
        this.mTerminus = bundle.getString(TERMINUS, null);
        this.mStartPlace = bundle.getString(START_PLACE, null);
        this.mEndPlace = bundle.getString(END_PLACE, null);
        this.mStartPlaceCode = bundle.getString(START_PLACE_CODE, null);
        this.mEndPlaceCode = bundle.getString(END_PLACE_CODE, null);
        this.mArriveTimeInMills = bundle.getLong(ARRIVE_TIME_IN_MILLS, -1L);
        this.mArriveDate = bundle.getString(ARRIVE_DATE, null);
        this.mArriveTime = bundle.getString(ARRIVE_TIME, null);
        this.mArriveLatitude = bundle.getDouble("arriveLatitude", -1.0d);
        this.mArriveLongitude = bundle.getDouble("arriveLongitude", -1.0d);
        this.mPassengerName = bundle.getString(PASSENGER_NAME, null);
        this.mCheckInOffice = bundle.getString(CHECK_IN_OFFICE, null);
        this.mFlightCompanyName = bundle.getString(FLIGHT_COMPANY_NAME, null);
        this.mFlightNumber = bundle.getString(FLIGHT_NUMBER, null);
        this.mFlightStatus = bundle.getString(FLIGHT_STATUS, null);
        this.mBoardingGate = bundle.getString(BOARDING_GATE, null);
        this.mSeatNum = bundle.getString(SEAT_NUM, null);
        this.mFlightDuration = bundle.getLong(FLIGHT_DURATION, -1L);
        this.mBaggageCarousel = bundle.getString(BAGGAGE_CAROUSEL, null);
        this.mLogoUrl = bundle.getString(FLIGHT_COMPANY_LOGO_URL, null);
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
        parcel.writeString(this.mTripStep);
        parcel.writeString(this.mAdInstantUrl);
        parcel.writeString(this.mAdTargetUrl);
        parcel.writeString(this.mAdDeeplinkUrl);
        parcel.writeString(this.mCheckInH5Url);
        parcel.writeString(this.mCheckInDeepLinkUrl);
        parcel.writeString(this.mCheckInInstantUrl);
        parcel.writeString(this.mDetailDeepLink);
        parcel.writeString(this.mDetailInstantLink);
        parcel.writeString(this.mDetailWebLink);
        parcel.writeLong(this.mTakeOffTimeInMills);
        parcel.writeString(this.mTakeOffDate);
        parcel.writeString(this.mTakeOffTime);
        parcel.writeString(this.mTakeOffTimeZone);
        parcel.writeDouble(this.mTakeOffLatitude);
        parcel.writeDouble(this.mTakeOffLongitude);
        parcel.writeString(this.mNavDestination);
        parcel.writeString(this.mOrigin);
        parcel.writeString(this.mTerminus);
        parcel.writeString(this.mStartPlace);
        parcel.writeString(this.mEndPlace);
        parcel.writeString(this.mStartPlaceCode);
        parcel.writeString(this.mEndPlaceCode);
        parcel.writeLong(this.mArriveTimeInMills);
        parcel.writeString(this.mArriveDate);
        parcel.writeString(this.mArriveTime);
        parcel.writeDouble(this.mArriveLatitude);
        parcel.writeDouble(this.mArriveLongitude);
        parcel.writeString(this.mPassengerName);
        parcel.writeString(this.mCheckInOffice);
        parcel.writeString(this.mFlightCompanyName);
        parcel.writeString(this.mFlightNumber);
        parcel.writeString(this.mFlightStatus);
        parcel.writeString(this.mBoardingGate);
        parcel.writeString(this.mSeatNum);
        parcel.writeLong(this.mFlightDuration);
        parcel.writeString(this.mBaggageCarousel);
        parcel.writeString(this.mLogoUrl);
        parcel.writeLong(this.mNavDuration);
        parcel.writeLong(this.mExpireTime);
        parcel.writeLong(this.mLifeTime);
    }

    public FlightData(Parcel parcel) {
        this.mTakeOffTimeInMills = -1L;
        this.mTakeOffLatitude = -1.0d;
        this.mTakeOffLongitude = -1.0d;
        this.mArriveTimeInMills = -1L;
        this.mArriveLatitude = -1.0d;
        this.mArriveLongitude = -1.0d;
        this.mVersionCode = parcel.readInt();
        this.mType = parcel.readInt();
        this.mMatchKey = parcel.readString();
        this.mTripId = parcel.readLong();
        this.mTripStep = parcel.readString();
        this.mAdInstantUrl = parcel.readString();
        this.mAdTargetUrl = parcel.readString();
        this.mAdDeeplinkUrl = parcel.readString();
        this.mCheckInH5Url = parcel.readString();
        this.mCheckInDeepLinkUrl = parcel.readString();
        this.mCheckInInstantUrl = parcel.readString();
        this.mDetailDeepLink = parcel.readString();
        this.mDetailInstantLink = parcel.readString();
        this.mDetailWebLink = parcel.readString();
        this.mTakeOffTimeInMills = parcel.readLong();
        this.mTakeOffDate = parcel.readString();
        this.mTakeOffTime = parcel.readString();
        this.mTakeOffTimeZone = parcel.readString();
        this.mTakeOffLatitude = parcel.readDouble();
        this.mTakeOffLongitude = parcel.readDouble();
        this.mNavDestination = parcel.readString();
        this.mOrigin = parcel.readString();
        this.mTerminus = parcel.readString();
        this.mStartPlace = parcel.readString();
        this.mEndPlace = parcel.readString();
        this.mStartPlaceCode = parcel.readString();
        this.mEndPlaceCode = parcel.readString();
        this.mArriveTimeInMills = parcel.readLong();
        this.mArriveDate = parcel.readString();
        this.mArriveTime = parcel.readString();
        this.mArriveLatitude = parcel.readDouble();
        this.mArriveLongitude = parcel.readDouble();
        this.mPassengerName = parcel.readString();
        this.mCheckInOffice = parcel.readString();
        this.mFlightCompanyName = parcel.readString();
        this.mFlightNumber = parcel.readString();
        this.mFlightStatus = parcel.readString();
        this.mBoardingGate = parcel.readString();
        this.mSeatNum = parcel.readString();
        this.mFlightDuration = parcel.readLong();
        this.mBaggageCarousel = parcel.readString();
        this.mLogoUrl = parcel.readString();
        this.mNavDuration = parcel.readLong();
        this.mExpireTime = parcel.readLong();
        this.mLifeTime = parcel.readLong();
    }
}

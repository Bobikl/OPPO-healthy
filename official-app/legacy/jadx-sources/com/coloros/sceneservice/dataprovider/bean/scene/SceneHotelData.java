package com.coloros.sceneservice.dataprovider.bean.scene;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.coloros.sceneservice.d.d;
import java.util.Calendar;

/* JADX INFO: loaded from: classes13.dex */
@Keep
public class SceneHotelData extends SceneData {
    public static final Parcelable.Creator CREATOR = new d();
    public static final int DEFAULT_DEAD_TIME_DELAY_IN_HOUR = 24;
    public static final int DEFAULT_EXPIRE_DELAY_IN_HOUR = 24;
    public static final String KEY_ADDRESS = "Address";
    public static final String KEY_CITY_INFO = "city_info";
    public static final String KEY_HOTEL_NAME = "Name";
    public static final String KEY_IN_DATE = "InDate";
    public static final String KEY_OUT_DATE = "OutDate";
    public static final String KEY_ROOM_TYPE = "RoomType";
    public static final String TIP_STEP = "tipStep";
    public static final String TRIP_ID = "tripId";
    public static final String TRIP_TYPE = "trip_type";
    public static final String VERSION_CODE = "versionCode";

    public SceneHotelData() {
        setType(4);
    }

    public String getAddress() {
        return this.mContent.getString(KEY_ADDRESS);
    }

    public String getCityInfo() {
        return this.mContent.getString(KEY_CITY_INFO);
    }

    @Override // com.coloros.sceneservice.dataprovider.bean.scene.SceneData
    public long getDefaultExpireTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(getOccurTime());
        calendar.add(10, 24);
        return calendar.getTimeInMillis();
    }

    @Override // com.coloros.sceneservice.dataprovider.bean.scene.SceneData
    public String getDefaultMatchKey() {
        return this.mContent.getString("Name") + this.mContent.getString(KEY_IN_DATE);
    }

    public String getHotelName() {
        return this.mContent.getString("Name");
    }

    public String getInDate() {
        return this.mContent.getString(KEY_IN_DATE);
    }

    @Override // com.coloros.sceneservice.dataprovider.bean.scene.SceneData
    public String getOnlineKey() {
        return this.mContent.getString("Name");
    }

    public String getOutDate() {
        return this.mContent.getString(KEY_OUT_DATE);
    }

    public String getRoomType() {
        return this.mContent.getString(KEY_ROOM_TYPE);
    }

    @Override // com.coloros.sceneservice.dataprovider.bean.scene.SceneData
    public boolean isValid() {
        return (TextUtils.isEmpty(this.mContent.getString("Name")) || TextUtils.isEmpty(this.mContent.getString(KEY_IN_DATE))) ? false : true;
    }

    public void setAddress(String str) {
        this.mContent.putString(KEY_ADDRESS, str);
    }

    public void setCityInfo(String str) {
        this.mContent.putString(KEY_CITY_INFO, str);
    }

    public void setHotelName(String str) {
        this.mContent.putString("Name", str);
    }

    public void setInDate(String str) {
        this.mContent.putString(KEY_IN_DATE, str);
    }

    public void setOutDate(String str) {
        this.mContent.putString(KEY_OUT_DATE, str);
    }

    public void setRoomType(String str) {
        this.mContent.putString(KEY_ROOM_TYPE, str);
    }

    public SceneHotelData(Parcel parcel) {
        super(parcel);
    }
}

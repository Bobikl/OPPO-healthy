package com.coloros.sceneservice.dataprovider.bean.scene;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.coloros.sceneservice.d.e;
import com.coloros.sceneservice.m.g;
import java.util.Calendar;

/* JADX INFO: loaded from: classes13.dex */
@Keep
public class SceneMovieData extends SceneData {
    public static final Parcelable.Creator CREATOR = new e();
    public static final int DEFAULT_DEAD_TIME_DELAY_IN_HOUR = 3;
    public static final String KEY_CINEMA = "Cinema";
    public static final String KEY_CINEMA_ADDRESS = "CinemaAdress";
    public static final String KEY_DATE_TIME = "Date";
    public static final String KEY_DURATION = "duration";
    public static final String KEY_HALL = "Hall";
    public static final String KEY_MOVIE_PIC_URL = "MoviePicUrl";
    public static final String KEY_NAME = "Name";
    public static final String KEY_PICK_CODE = "Code";
    public static final String KEY_SEAT_NUM = "Seat";
    public static final String KEY_VERIFICATION = "Verification";
    public static final String TIP_STEP = "tipStep";
    public static final String TRIP_ID = "tripId";
    public static final String TRIP_TYPE = "trip_type";
    public static final int VERSION = 1;
    public static final String VERSION_CODE = "versionCode";

    public SceneMovieData() {
        setType(8);
    }

    public String getCinema() {
        return this.mContent.getString(KEY_CINEMA);
    }

    public String getCinemaAddress() {
        return this.mContent.getString(KEY_CINEMA_ADDRESS);
    }

    public String getDateTime() {
        return this.mContent.getString("Date");
    }

    @Override // com.coloros.sceneservice.dataprovider.bean.scene.SceneData
    public long getDefaultExpireTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(getOccurTime());
        calendar.add(10, 3);
        return calendar.getTimeInMillis();
    }

    @Override // com.coloros.sceneservice.dataprovider.bean.scene.SceneData
    public String getDefaultMatchKey() {
        return this.mContent.getString("Name") + this.mContent.getString("Date");
    }

    public int getDuration() {
        return g.parseInt(this.mContent.getString("duration"), 0);
    }

    public String getHall() {
        return this.mContent.getString(KEY_HALL);
    }

    public String getMovieName() {
        return this.mContent.getString("Name");
    }

    public String getMoviePicUrl() {
        return this.mContent.getString(KEY_MOVIE_PIC_URL);
    }

    @Override // com.coloros.sceneservice.dataprovider.bean.scene.SceneData
    public String getOnlineKey() {
        return this.mContent.getString("Name");
    }

    public String getPickCode() {
        return this.mContent.getString(KEY_PICK_CODE);
    }

    public String getSeatNum() {
        return this.mContent.getString("Seat");
    }

    public String getVerificationCode() {
        return this.mContent.getString(KEY_VERIFICATION);
    }

    @Override // com.coloros.sceneservice.dataprovider.bean.scene.SceneData
    public boolean isValid() {
        return (TextUtils.isEmpty(this.mContent.getString("Name")) || TextUtils.isEmpty(this.mContent.getString("Date"))) ? false : true;
    }

    public void setCinema(String str) {
        this.mContent.putString(KEY_CINEMA, str);
    }

    public void setCinemaAddress(String str) {
        this.mContent.putString(KEY_CINEMA_ADDRESS, str);
    }

    public void setDateTime(String str) {
        this.mContent.putString("Date", str);
    }

    public void setDuration(int i) {
        this.mContent.putString("duration", String.valueOf(i));
    }

    public void setHall(String str) {
        this.mContent.putString(KEY_HALL, str);
    }

    public void setMoviePicUrl(String str) {
        this.mContent.putString(KEY_MOVIE_PIC_URL, str);
    }

    public void setName(String str) {
        this.mContent.putString("Name", str);
    }

    public void setPickCode(String str) {
        this.mContent.putString(KEY_PICK_CODE, str);
    }

    public void setSeatNum(String str) {
        this.mContent.putString("Seat", str);
    }

    public void setVerificationCode(String str) {
        this.mContent.putString(KEY_VERIFICATION, str);
    }

    public SceneMovieData(Parcel parcel) {
        super(parcel);
    }
}

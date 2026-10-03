package com.heytap.databaseengine.model.hrnewdaycard;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.HeartRate;
import com.heytap.databaseengine.model.HeartRateDataStat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class HeartRateReadNewDayCard implements Parcelable {
    public static final Parcelable.Creator<HeartRateReadNewDayCard> CREATOR = new a();
    private List<HeartRate> curveHalfAnHour;
    private List<HeartRateDataStat> histogramHalfAnHour;
    private List<HeartRate> restHR;
    private List<HeartRate> walkAvgAndSleepBaseHR;

    public class a implements Parcelable.Creator<HeartRateReadNewDayCard> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HeartRateReadNewDayCard createFromParcel(Parcel parcel) {
            return new HeartRateReadNewDayCard(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HeartRateReadNewDayCard[] newArray(int i) {
            return new HeartRateReadNewDayCard[i];
        }
    }

    public HeartRateReadNewDayCard() {
        this.curveHalfAnHour = new ArrayList();
        this.restHR = new ArrayList();
        this.histogramHalfAnHour = new ArrayList();
        this.walkAvgAndSleepBaseHR = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<HeartRate> getCurveHalfAnHour() {
        return this.curveHalfAnHour;
    }

    public List<HeartRateDataStat> getHistogramHalfAnHour() {
        return this.histogramHalfAnHour;
    }

    public List<HeartRate> getRestHR() {
        return this.restHR;
    }

    public List<HeartRate> getWalkAvgAndSleepBaseHR() {
        return this.walkAvgAndSleepBaseHR;
    }

    public void setCurveHalfAnHour(List<HeartRate> list) {
        this.curveHalfAnHour = list;
    }

    public void setHistogramHalfAnHour(List<HeartRateDataStat> list) {
        this.histogramHalfAnHour = list;
    }

    public void setRestHR(List<HeartRate> list) {
        this.restHR = list;
    }

    public void setWalkAvgAndSleepBaseHR(List<HeartRate> list) {
        this.walkAvgAndSleepBaseHR = list;
    }

    public String toString() {
        return "HeartRateReadNewDayCard{curveHalfAnHour=" + this.curveHalfAnHour + ", restHR=" + this.restHR + ", histogramHalfAnHour=" + this.histogramHalfAnHour + ", walkAvgAndSleepBaseHR=" + this.walkAvgAndSleepBaseHR + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.curveHalfAnHour);
        parcel.writeTypedList(this.restHR);
        parcel.writeTypedList(this.histogramHalfAnHour);
        parcel.writeTypedList(this.walkAvgAndSleepBaseHR);
    }

    public HeartRateReadNewDayCard(Parcel parcel) {
        this.curveHalfAnHour = new ArrayList();
        this.restHR = new ArrayList();
        this.histogramHalfAnHour = new ArrayList();
        this.walkAvgAndSleepBaseHR = new ArrayList();
        Parcelable.Creator<HeartRate> creator = HeartRate.CREATOR;
        this.curveHalfAnHour = parcel.createTypedArrayList(creator);
        this.restHR = parcel.createTypedArrayList(creator);
        this.histogramHalfAnHour = parcel.createTypedArrayList(HeartRateDataStat.CREATOR);
        this.walkAvgAndSleepBaseHR = parcel.createTypedArrayList(creator);
    }
}

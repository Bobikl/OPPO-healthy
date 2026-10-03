package com.heytap.health.sleep.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SleepBloodDayBean implements Parcelable {
    public static final Parcelable.Creator<SleepBloodDayBean> CREATOR = new a();
    private int averageBlood;
    private List<TimeStampedData> bloodOxDataList;

    public class a implements Parcelable.Creator<SleepBloodDayBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SleepBloodDayBean createFromParcel(Parcel parcel) {
            return new SleepBloodDayBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SleepBloodDayBean[] newArray(int i) {
            return new SleepBloodDayBean[i];
        }
    }

    public SleepBloodDayBean() {
        this.bloodOxDataList = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAverageBlood() {
        return this.averageBlood;
    }

    public List<TimeStampedData> getBloodOxDataList() {
        return this.bloodOxDataList;
    }

    public boolean isEmptyData() {
        List<TimeStampedData> list = this.bloodOxDataList;
        return list == null || list.size() == 0;
    }

    public void setAverageBlood(int i) {
        this.averageBlood = i;
    }

    public void setBloodOxDataList(List<TimeStampedData> list) {
        this.bloodOxDataList = list;
    }

    public String toString() {
        return "SleepBloodDayBean{averageBlood=" + this.averageBlood + ", bloodOxDataList=" + this.bloodOxDataList + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.averageBlood);
        parcel.writeTypedList(this.bloodOxDataList);
    }

    public SleepBloodDayBean(Parcel parcel) {
        this.bloodOxDataList = new ArrayList();
        this.averageBlood = parcel.readInt();
        this.bloodOxDataList = parcel.createTypedArrayList(TimeStampedData.CREATOR);
    }
}
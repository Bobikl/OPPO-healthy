package com.heytap.databaseengineservice.sync.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class PullLastPhysicalFitRspBean implements Parcelable {
    public static final Parcelable.Creator<PullLastPhysicalFitRspBean> CREATOR = new a();
    private List<GoMoreData> data;
    private String last_workout_time_end;
    private String prev_aerobic_ptc;
    private String prev_anaerobic_ptc;
    private String status;

    public class a implements Parcelable.Creator<PullLastPhysicalFitRspBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PullLastPhysicalFitRspBean createFromParcel(Parcel parcel) {
            return new PullLastPhysicalFitRspBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PullLastPhysicalFitRspBean[] newArray(int i) {
            return new PullLastPhysicalFitRspBean[i];
        }
    }

    public PullLastPhysicalFitRspBean() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<GoMoreData> getData() {
        return this.data;
    }

    public String getLast_workout_time_end() {
        return this.last_workout_time_end;
    }

    public String getPrev_aerobic_ptc() {
        return this.prev_aerobic_ptc;
    }

    public String getPrev_anaerobic_ptc() {
        return this.prev_anaerobic_ptc;
    }

    public String getStatus() {
        return this.status;
    }

    public void setData(List<GoMoreData> list) {
        this.data = list;
    }

    public void setLast_workout_time_end(String str) {
        this.last_workout_time_end = str;
    }

    public void setPrev_aerobic_ptc(String str) {
        this.prev_aerobic_ptc = str;
    }

    public void setPrev_anaerobic_ptc(String str) {
        this.prev_anaerobic_ptc = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.status);
        parcel.writeString(this.last_workout_time_end);
        parcel.writeString(this.prev_aerobic_ptc);
        parcel.writeString(this.prev_anaerobic_ptc);
        parcel.writeTypedList(this.data);
    }

    public PullLastPhysicalFitRspBean(Parcel parcel) {
        this.status = parcel.readString();
        this.last_workout_time_end = parcel.readString();
        this.prev_aerobic_ptc = parcel.readString();
        this.prev_anaerobic_ptc = parcel.readString();
        this.data = parcel.createTypedArrayList(GoMoreData.CREATOR);
    }
}

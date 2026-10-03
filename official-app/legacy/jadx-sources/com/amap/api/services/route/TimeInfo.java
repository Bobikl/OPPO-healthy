package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class TimeInfo implements Parcelable {
    public static final Parcelable.Creator<TimeInfo> CREATOR = new a();
    private long a;
    private List<TimeInfosElement> b;

    public static class a implements Parcelable.Creator<TimeInfo> {
        public static TimeInfo a(Parcel parcel) {
            return new TimeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TimeInfo createFromParcel(Parcel parcel) {
            return a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TimeInfo[] newArray(int i) {
            return null;
        }
    }

    public TimeInfo(Parcel parcel) {
        this.b = new ArrayList();
        this.a = parcel.readInt();
        this.b = parcel.createTypedArrayList(TimeInfosElement.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<TimeInfosElement> getElements() {
        return this.b;
    }

    public long getStartTime() {
        return this.a;
    }

    public void setElements(List<TimeInfosElement> list) {
        this.b = list;
    }

    public void setStartTime(long j2) {
        this.a = j2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeTypedList(this.b);
    }

    public TimeInfo() {
        this.b = new ArrayList();
    }
}

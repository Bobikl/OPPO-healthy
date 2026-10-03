package com.heytap.health.health.familymode.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class FriendStatData implements Parcelable {
    public static final Parcelable.Creator<FriendStatData> CREATOR = new a();
    private String friendSsoid;
    private List<Integer> stepsDateList;
    private List<Integer> summaryDateList;

    public class a implements Parcelable.Creator<FriendStatData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public FriendStatData createFromParcel(Parcel parcel) {
            return new FriendStatData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public FriendStatData[] newArray(int i) {
            return new FriendStatData[i];
        }
    }

    public FriendStatData() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getFriendSsoid() {
        return this.friendSsoid;
    }

    public List<Integer> getStepsDateList() {
        return this.stepsDateList;
    }

    public List<Integer> getSummaryDateList() {
        return this.summaryDateList;
    }

    public void setFriendSsoid(String str) {
        this.friendSsoid = str;
    }

    public void setStepsDateList(List<Integer> list) {
        this.stepsDateList = list;
    }

    public void setSummaryDateList(List<Integer> list) {
        this.summaryDateList = list;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.friendSsoid);
        parcel.writeList(this.stepsDateList);
        parcel.writeList(this.summaryDateList);
    }

    public FriendStatData(Parcel parcel) {
        this.friendSsoid = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.stepsDateList = arrayList;
        parcel.readList(arrayList, Integer.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.summaryDateList = arrayList2;
        parcel.readList(arrayList2, Integer.class.getClassLoader());
    }
}

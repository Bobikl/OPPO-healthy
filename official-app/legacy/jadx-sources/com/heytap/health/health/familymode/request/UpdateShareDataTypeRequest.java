package com.heytap.health.health.familymode.request;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class UpdateShareDataTypeRequest implements Parcelable {
    public static final Parcelable.Creator<UpdateShareDataTypeRequest> CREATOR = new a();
    private String friendSsoid;
    private int groupType;
    private List<Integer> sharedDataTypeList;

    public class a implements Parcelable.Creator<UpdateShareDataTypeRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UpdateShareDataTypeRequest createFromParcel(Parcel parcel) {
            return new UpdateShareDataTypeRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UpdateShareDataTypeRequest[] newArray(int i) {
            return new UpdateShareDataTypeRequest[i];
        }
    }

    public UpdateShareDataTypeRequest() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getFriendSsoid() {
        return this.friendSsoid;
    }

    public int getGroupType() {
        return this.groupType;
    }

    public List<Integer> getSharedDataTypeList() {
        return this.sharedDataTypeList;
    }

    public void setFriendSsoid(String str) {
        this.friendSsoid = str;
    }

    public void setGroupType(int i) {
        this.groupType = i;
    }

    public void setSharedDataTypeList(ArrayList<Integer> arrayList) {
        this.sharedDataTypeList = arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.groupType);
        parcel.writeString(this.friendSsoid);
        parcel.writeList(this.sharedDataTypeList);
    }

    public UpdateShareDataTypeRequest(Parcel parcel) {
        this.groupType = parcel.readInt();
        this.friendSsoid = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.sharedDataTypeList = arrayList;
        parcel.readList(arrayList, Integer.class.getClassLoader());
    }
}

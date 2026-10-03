package com.heytap.health.bodyfat.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.databaseengine.model.weight.FamilyMemberInfo;

/* JADX INFO: loaded from: classes15.dex */
public class BodyFatFamilySelectBean implements Parcelable {
    public static final Parcelable.Creator<BodyFatFamilySelectBean> CREATOR = new a();
    private FamilyMemberInfo family;
    private boolean isSelected;

    public class a implements Parcelable.Creator<BodyFatFamilySelectBean> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BodyFatFamilySelectBean createFromParcel(Parcel parcel) {
            return new BodyFatFamilySelectBean(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BodyFatFamilySelectBean[] newArray(int i) {
            return new BodyFatFamilySelectBean[i];
        }
    }

    public BodyFatFamilySelectBean(FamilyMemberInfo familyMemberInfo, boolean z) {
        this.family = familyMemberInfo;
        this.isSelected = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public FamilyMemberInfo getFamilyMemberInfo() {
        return this.family;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setFamilyMemberInfo(FamilyMemberInfo familyMemberInfo) {
        this.family = familyMemberInfo;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.family, i);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    public BodyFatFamilySelectBean(Parcel parcel) {
        this.family = (FamilyMemberInfo) parcel.readParcelable(getClass().getClassLoader());
        this.isSelected = parcel.readInt() == 1;
    }
}

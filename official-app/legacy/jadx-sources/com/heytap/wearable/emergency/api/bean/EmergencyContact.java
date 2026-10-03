package com.heytap.wearable.emergency.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.oplus.aiunit.vision.j1j;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class EmergencyContact implements Parcelable {
    public static final Parcelable.Creator<EmergencyContact> CREATOR = new a();
    private static final int MAX_NAME_CODE_POINT_COUNT = 45;
    private String contactUniqueId;
    private String customRelationship;
    private String mobile;
    private String name;

    @Deprecated
    private String number;
    private String relationship;
    private Integer relationshipType;

    public class a implements Parcelable.Creator<EmergencyContact> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EmergencyContact createFromParcel(Parcel parcel) {
            return new EmergencyContact(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EmergencyContact[] newArray(int i) {
            return new EmergencyContact[i];
        }
    }

    public EmergencyContact() {
        this.name = "";
        this.number = "";
        this.mobile = "";
        this.relationship = "";
        this.customRelationship = "";
    }

    public void checkValid() {
        if (TextUtils.isEmpty(this.contactUniqueId)) {
            this.contactUniqueId = UUID.randomUUID().toString().replace("-", "");
        }
        if (TextUtils.isEmpty(this.mobile)) {
            this.mobile = this.number;
        }
        this.name = j1j.d(this.name, 45);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getContactUniqueId() {
        return this.contactUniqueId;
    }

    public String getCustomRelationship() {
        return this.customRelationship;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getName() {
        return this.name;
    }

    public String getRelationship() {
        return this.relationship;
    }

    public Integer getRelationshipType() {
        return this.relationshipType;
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(this.mobile);
    }

    public void setContactUniqueId(String str) {
        this.contactUniqueId = str;
    }

    public void setCustomRelationship(String str) {
        this.customRelationship = str;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRelationship(String str) {
        this.relationship = str;
    }

    public void setRelationshipType(Integer num) {
        this.relationshipType = num;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.contactUniqueId);
        parcel.writeString(this.name);
        parcel.writeString(this.number);
        parcel.writeString(this.mobile);
        parcel.writeString(this.relationship);
        parcel.writeSerializable(this.relationshipType);
        parcel.writeString(this.customRelationship);
    }

    public EmergencyContact(EmergencyContact emergencyContact) {
        this.name = "";
        this.number = "";
        this.mobile = "";
        this.relationship = "";
        this.customRelationship = "";
        this.contactUniqueId = emergencyContact.contactUniqueId;
        this.name = emergencyContact.name;
        this.number = emergencyContact.number;
        this.mobile = emergencyContact.mobile;
        this.relationship = emergencyContact.relationship;
        this.relationshipType = emergencyContact.relationshipType;
        this.customRelationship = emergencyContact.customRelationship;
    }

    public EmergencyContact(Parcel parcel) {
        this.name = "";
        this.number = "";
        this.mobile = "";
        this.relationship = "";
        this.customRelationship = "";
        this.contactUniqueId = parcel.readString();
        this.name = parcel.readString();
        this.number = parcel.readString();
        this.mobile = parcel.readString();
        this.relationship = parcel.readString();
        this.relationshipType = (Integer) parcel.readSerializable();
        this.customRelationship = parcel.readString();
    }
}

package com.heytap.health.health.familymode.response;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class InviteResponse implements Parcelable {
    public static final Parcelable.Creator<InviteResponse> CREATOR = new a();
    private int errorCode;
    private long invitationEndTime;
    private int status;

    public class a implements Parcelable.Creator<InviteResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InviteResponse createFromParcel(Parcel parcel) {
            return new InviteResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InviteResponse[] newArray(int i) {
            return new InviteResponse[i];
        }
    }

    public InviteResponse() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public long getInvitationEndTime() {
        return this.invitationEndTime;
    }

    public int getStatus() {
        return this.status;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public void setInvitationEndTime(long j2) {
        this.invitationEndTime = j2;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.status);
        parcel.writeLong(this.invitationEndTime);
    }

    public InviteResponse(Parcel parcel) {
        this.status = parcel.readInt();
        this.invitationEndTime = parcel.readLong();
    }
}

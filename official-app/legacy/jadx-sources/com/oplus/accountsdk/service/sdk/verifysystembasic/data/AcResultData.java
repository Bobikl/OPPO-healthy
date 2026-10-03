package com.oplus.accountsdk.service.sdk.verifysystembasic.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.accountsdk.service.common.constants.AcConstants;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AcResultData implements Parcelable {
    public static final Parcelable.Creator<AcResultData> CREATOR = new a();
    public String businessId;
    public String code;
    public String msg;
    public String originalCode;
    public String requestCode;
    public String ticket;

    public class a implements Parcelable.Creator<AcResultData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AcResultData createFromParcel(Parcel parcel) {
            return new AcResultData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AcResultData[] newArray(int i) {
            return new AcResultData[i];
        }
    }

    public AcResultData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.code = str;
        this.originalCode = str2;
        this.msg = str3;
        this.ticket = str4;
        this.businessId = str5;
        this.requestCode = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBusinessId() {
        return this.businessId;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getOriginalCode() {
        return this.originalCode;
    }

    public String getRequestCode() {
        return this.requestCode;
    }

    public String getTicket() {
        return this.ticket;
    }

    public String toString() {
        return "VerifyResultData(code=" + this.code + ", originalCode=" + this.originalCode + ", msg=" + this.msg + ", ticket=" + this.ticket + ", businessId=" + this.businessId + ", requestCode=" + this.requestCode + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.code);
        parcel.writeString(this.originalCode);
        parcel.writeString(this.msg);
        parcel.writeString(this.ticket);
        parcel.writeString(this.businessId);
        parcel.writeString(this.requestCode);
    }

    public AcResultData(Parcel parcel) {
        this.code = AcConstants.c.VERIFY_RESULT_CODE_FAILED;
        this.originalCode = AcConstants.c.VERIFY_RESULT_CODE_FAILED;
        this.msg = "";
        this.ticket = null;
        this.businessId = null;
        this.requestCode = null;
        this.code = parcel.readString();
        this.originalCode = parcel.readString();
        this.msg = parcel.readString();
        this.ticket = parcel.readString();
        this.businessId = parcel.readString();
        this.requestCode = parcel.readString();
    }
}

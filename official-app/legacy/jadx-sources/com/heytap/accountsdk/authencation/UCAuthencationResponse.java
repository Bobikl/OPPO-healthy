package com.heytap.accountsdk.authencation;

import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes14.dex */
@Keep
public class UCAuthencationResponse implements Parcelable {
    public static final Parcelable.Creator<UCAuthencationResponse> CREATOR = new a();
    public static final int MSG_WHAT_AUTHENCATION = 194;
    public String errorCode;
    public String errorMsg;
    public boolean isSuccess;
    public String requestTag;
    public String ticketNo;

    @Keep
    public interface UCAuthencationError {
        public static final String AUTHENCATION_ERROR_AUTHTYPE_INVALIDATE = "authencation_error_authtype_invalidate";
        public static final String AUTHENCATION_ERROR_CANCLE = "authencation_error_cancle";
        public static final String AUTHENCATION_ERROR_NETWORK = "authencation_error_network";
        public static final String AUTHENCATION_ERROR_PARAM_INVALIDATE = "authencation_error_param_invalidate";
        public static final String AUTHENCATION_ERROR_TOKEN_INVALIDATE = "authencation_error_token_invalidate";
        public static final String AUTHENCATION_ERROR_USER_INVALIDATE = "authencation_error_user_invalidate";
        public static final String AUTHENCATION_SUCCESS = "authencation_success";
    }

    public class a implements Parcelable.Creator<UCAuthencationResponse> {
        @Override // android.os.Parcelable.Creator
        public UCAuthencationResponse createFromParcel(Parcel parcel) {
            return new UCAuthencationResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public UCAuthencationResponse[] newArray(int i) {
            return new UCAuthencationResponse[i];
        }
    }

    public UCAuthencationResponse() {
    }

    public static void sendErrorResult(UCAuthencationRequest uCAuthencationRequest, String str, String str2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 194;
        messageObtain.obj = new UCAuthencationResponse(uCAuthencationRequest.requestTag, false, str, str2);
        try {
            uCAuthencationRequest.callback.send(messageObtain);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    public static void sendSuccessResult(UCAuthencationRequest uCAuthencationRequest, String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 194;
        messageObtain.obj = new UCAuthencationResponse(uCAuthencationRequest.requestTag, true, str);
        try {
            uCAuthencationRequest.callback.send(messageObtain);
        } catch (RemoteException e2) {
            e2.printStackTrace();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "UCAuthencationResponse{requestTag='" + this.requestTag + "', isSuccess=" + this.isSuccess + ", ticketNo='" + this.ticketNo + "', errorCode='" + this.errorCode + "', errorMsg='" + this.errorMsg + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.requestTag);
        parcel.writeByte(this.isSuccess ? (byte) 1 : (byte) 0);
        parcel.writeString(this.ticketNo);
        parcel.writeString(this.errorCode);
        parcel.writeString(this.errorMsg);
    }

    public UCAuthencationResponse(String str, boolean z, String str2) {
        this.isSuccess = z;
        this.ticketNo = str2;
        this.requestTag = str;
    }

    public UCAuthencationResponse(String str, boolean z, String str2, String str3) {
        this.isSuccess = z;
        this.errorCode = str2;
        this.errorMsg = str3;
        this.requestTag = str;
    }

    public UCAuthencationResponse(Parcel parcel) {
        this.requestTag = parcel.readString();
        this.isSuccess = parcel.readByte() != 0;
        this.ticketNo = parcel.readString();
        this.errorCode = parcel.readString();
        this.errorMsg = parcel.readString();
    }
}

package com.oplus.epona;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class Response implements Parcelable {
    public static final Parcelable.Creator<Response> CREATOR = new a();
    private static final String EXCEPTION_INFO = "epona_exception_info";
    private Object data;
    private Bundle mBundle;
    private final int mCode;
    private final String mMessage;
    private ParcelableException mParcelableException;

    public class a implements Parcelable.Creator<Response> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Response createFromParcel(Parcel parcel) {
            return new Response(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Response[] newArray(int i) {
            return new Response[i];
        }
    }

    public /* synthetic */ Response(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static Response defaultErrorResponse() {
        return new Response(ResponseCode.FAILED.getCode(), "somethings not yet...");
    }

    public static Response errorResponse(ResponseCode responseCode, String str) {
        return new Response(responseCode.getCode(), str);
    }

    public static Response newResponse(Bundle bundle) {
        Response response = new Response(ResponseCode.SUCCESS.getCode(), "");
        response.setBundle(bundle);
        return response;
    }

    private void setBundle(Bundle bundle) {
        this.mBundle = bundle;
    }

    public <T extends Throwable> void checkThrowable(Class<T> cls) throws Throwable {
        Bundle bundle = this.mBundle;
        if (bundle == null) {
            return;
        }
        if (this.mParcelableException == null) {
            ExceptionInfo exceptionInfo = (ExceptionInfo) bundle.getParcelable(EXCEPTION_INFO);
            if (exceptionInfo == null) {
                return;
            } else {
                this.mParcelableException = ParcelableException.create(exceptionInfo);
            }
        }
        this.mParcelableException.maybeRethrow(cls);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getBundle() {
        return this.mBundle;
    }

    public int getCode() {
        return this.mCode;
    }

    public Object getData() {
        return this.data;
    }

    public String getMessage() {
        return this.mMessage;
    }

    public boolean isSuccessful() {
        return this.mCode == ResponseCode.SUCCESS.getCode();
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    @NonNull
    public String toString() {
        return "Successful=" + isSuccessful() + ", Message=" + this.mMessage;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mCode);
        parcel.writeString(this.mMessage);
        parcel.writeBundle(this.mBundle);
    }

    private Response(int i, String str) {
        this.mCode = i;
        this.mMessage = str;
        this.mBundle = new Bundle();
    }

    public static Response errorResponse(String str) {
        return new Response(ResponseCode.FAILED.getCode(), str);
    }

    public static Response errorResponse(Exception exc) {
        Response response = new Response(ResponseCode.FAILED.getCode(), "response has exception");
        response.getBundle().putParcelable(EXCEPTION_INFO, new ExceptionInfo(exc));
        return response;
    }

    private Response(Parcel parcel) {
        this.mCode = parcel.readInt();
        this.mMessage = parcel.readString();
        this.mBundle = parcel.readBundle(getClass().getClassLoader());
    }
}

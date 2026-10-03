package com.heytap.accessory.stream.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class CancelRequest implements Parcelable {
    public static final Parcelable.Creator<CancelRequest> CREATOR = new a();
    public String a;
    public int b;
    public int c;
    public long d;

    public class a implements Parcelable.Creator<CancelRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CancelRequest[] newArray(int i) {
            return new CancelRequest[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CancelRequest createFromParcel(Parcel parcel) {
            return new CancelRequest(parcel.readInt(), parcel.readInt());
        }
    }

    public CancelRequest() {
    }

    public long a() {
        return this.d;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.b;
    }

    public JSONObject d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgId", this.a);
        jSONObject.put("transId", this.b);
        jSONObject.put("reason", this.c);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
        parcel.writeLong(this.d);
    }

    public CancelRequest(int i, int i2) {
        this.a = "streamtransfer-cancel-req";
        this.b = i;
        this.c = i2;
    }

    public void a(long j) {
        this.d = j;
    }

    public void a(JSONObject jSONObject) throws JSONException {
        this.a = jSONObject.getString("msgId");
        this.b = jSONObject.getInt("transId");
        this.c = jSONObject.getInt("reason");
    }
}

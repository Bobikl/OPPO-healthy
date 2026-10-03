package com.heytap.accessory.file.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class CancelRequest implements Parcelable {
    public static final Parcelable.Creator<CancelRequest> CREATOR = new a();
    public String a;
    public String b;
    public int c;
    public int d;
    public long e;

    public class a implements Parcelable.Creator<CancelRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CancelRequest[] newArray(int i) {
            return new CancelRequest[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CancelRequest createFromParcel(Parcel parcel) {
            return new CancelRequest(parcel.readInt(), parcel.readInt(), parcel.readString());
        }
    }

    public CancelRequest() {
    }

    public long a() {
        return this.e;
    }

    public String b() {
        return this.a;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgId", this.b);
        jSONObject.put("transId", this.c);
        jSONObject.put("reason", this.d);
        jSONObject.put("fileName", this.a);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.a);
        parcel.writeLong(this.e);
    }

    public CancelRequest(int i, int i2, String str) {
        this.b = "filetransfer-cancel-req";
        this.c = i;
        this.d = i2;
        this.a = str;
    }

    public void a(long j) {
        this.e = j;
    }

    public void a(JSONObject jSONObject) throws JSONException {
        this.b = jSONObject.getString("msgId");
        this.c = jSONObject.getInt("transId");
        this.d = jSONObject.getInt("reason");
        if (jSONObject.has("fileName")) {
            this.a = jSONObject.getString("fileName");
        }
    }
}

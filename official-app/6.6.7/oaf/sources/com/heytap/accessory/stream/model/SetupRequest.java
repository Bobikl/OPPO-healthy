package com.heytap.accessory.stream.model;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class SetupRequest implements Parcelable {
    public static final Parcelable.Creator<SetupRequest> CREATOR = new a();
    public long a;
    public String b;
    public String c;
    public String d;
    public int e;
    public long f;
    public int g;
    public ParcelFileDescriptor h;

    public class a implements Parcelable.Creator<SetupRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SetupRequest[] newArray(int i) {
            return new SetupRequest[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SetupRequest createFromParcel(Parcel parcel) {
            return new SetupRequest(parcel.readLong(), parcel.readInt(), parcel.readFileDescriptor());
        }
    }

    public SetupRequest() {
        this.g = -1;
    }

    public long a() {
        return this.a;
    }

    public void b(long j) {
        this.f = j;
    }

    public long c() {
        return this.f;
    }

    public String d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.d;
    }

    public int f() {
        return this.e;
    }

    public JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgId", this.c);
        jSONObject.put("transId", this.e);
        jSONObject.put("peerId", this.d);
        jSONObject.put("containerId", this.b);
        jSONObject.put("channelId", String.valueOf(this.g));
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f);
        parcel.writeInt(this.g);
        parcel.writeParcelable(this.h, 0);
    }

    public void a(long j) {
        this.a = j;
    }

    public int b() {
        return this.g;
    }

    public SetupRequest(long j, int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.c = "streamtransfer-setup-req";
        this.h = parcelFileDescriptor;
        this.f = j;
        this.g = i;
    }

    public static SetupRequest a(JSONObject jSONObject) throws JSONException {
        SetupRequest setupRequest = new SetupRequest();
        try {
            setupRequest.c = jSONObject.getString("msgId");
            setupRequest.e = jSONObject.getInt("transId");
            setupRequest.d = jSONObject.getString("peerId");
            setupRequest.b = jSONObject.getString("containerId");
            setupRequest.g = Integer.parseInt(jSONObject.getString("channelId"));
            return setupRequest;
        } catch (Exception e) {
            throw new JSONException(e);
        }
    }

    public SetupRequest(int i, long j, String str, String str2, int i2) {
        this.c = "streamtransfer-setup-req";
        this.e = i;
        this.a = j;
        this.b = str;
        this.d = str2;
        this.g = i2;
    }
}

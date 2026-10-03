package com.heytap.accessory.file.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.speech.engine.constant.EngineConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class CancelRequest implements Parcelable {
    public static final Parcelable.Creator<CancelRequest> CREATOR = new a();
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2558c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2559e;

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
        return this.f2559e;
    }

    public String b() {
        return this.a;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.f2558c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgId", this.b);
        jSONObject.put("transId", this.f2558c);
        jSONObject.put(EngineConstant.REASON, this.d);
        jSONObject.put(LogSenderConst.FILENAME, this.a);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2558c);
        parcel.writeInt(this.d);
        parcel.writeString(this.a);
        parcel.writeLong(this.f2559e);
    }

    public CancelRequest(int i, int i2, String str) {
        this.b = "filetransfer-cancel-req";
        this.f2558c = i;
        this.d = i2;
        this.a = str;
    }

    public void a(long j2) {
        this.f2559e = j2;
    }

    public void a(JSONObject jSONObject) throws JSONException {
        this.b = jSONObject.getString("msgId");
        this.f2558c = jSONObject.getInt("transId");
        this.d = jSONObject.getInt(EngineConstant.REASON);
        if (jSONObject.has(LogSenderConst.FILENAME)) {
            this.a = jSONObject.getString(LogSenderConst.FILENAME);
        }
    }
}

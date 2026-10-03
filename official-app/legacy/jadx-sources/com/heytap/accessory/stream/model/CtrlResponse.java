package com.heytap.accessory.stream.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.speech.engine.constant.EngineConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class CtrlResponse implements Parcelable {
    public static final Parcelable.Creator<CtrlResponse> CREATOR = new a();
    public String a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2728c;
    public c d;

    public class a implements Parcelable.Creator<CtrlResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CtrlResponse createFromParcel(Parcel parcel) {
            return new CtrlResponse(parcel.readString(), parcel.readInt(), c.a(parcel.readInt()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CtrlResponse[] newArray(int i) {
            return new CtrlResponse[i];
        }
    }

    public CtrlResponse() {
    }

    public String a() {
        return this.a;
    }

    public void b(int i) {
        this.b = i;
    }

    public c c() {
        return this.d;
    }

    public int d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgId", this.a);
        jSONObject.put("transId", this.b);
        jSONObject.put("result", this.d.ordinal());
        jSONObject.put(EngineConstant.REASON, this.f2728c);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.d.ordinal());
        parcel.writeInt(this.f2728c);
    }

    public CtrlResponse(String str, int i, c cVar, int i2) {
        this.a = str;
        this.b = i;
        this.d = cVar;
        this.f2728c = i2;
    }

    public void a(String str) {
        this.a = str;
    }

    public int b() {
        return this.f2728c;
    }

    public void a(int i) {
        this.f2728c = i;
    }

    public void a(c cVar) {
        this.d = cVar;
    }

    public static CtrlResponse a(JSONObject jSONObject) throws JSONException {
        CtrlResponse ctrlResponse = new CtrlResponse();
        ctrlResponse.a = jSONObject.getString("msgId");
        ctrlResponse.b = jSONObject.getInt("transId");
        if (jSONObject.has("result")) {
            ctrlResponse.d = c.a(jSONObject.getInt("result"));
        }
        if (jSONObject.has(EngineConstant.REASON)) {
            ctrlResponse.f2728c = jSONObject.getInt(EngineConstant.REASON);
        }
        return ctrlResponse;
    }
}

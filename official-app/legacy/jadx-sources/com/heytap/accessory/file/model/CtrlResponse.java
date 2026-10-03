package com.heytap.accessory.file.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.speech.engine.constant.EngineConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class CtrlResponse implements Parcelable {
    public static final Parcelable.Creator<CtrlResponse> CREATOR = new a();
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2561c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f2562e;

    public class a implements Parcelable.Creator<CtrlResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CtrlResponse createFromParcel(Parcel parcel) {
            return new CtrlResponse(parcel.readString(), parcel.readInt(), c.a(parcel.readInt()), parcel.readInt(), parcel.readString());
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

    public String b() {
        return this.b;
    }

    public int c() {
        return this.d;
    }

    public String d() {
        int i = this.d;
        switch (i) {
            case 0:
                return "ERROR_NONE(" + this.d + ")";
            case 1:
                return "ERROR_CHANNEL_IO(" + this.d + ")";
            case 2:
                return "ERROR_FILE_IO(" + this.d + ")";
            case 3:
                return "ERROR_CMD_DROPPED(" + this.d + ")";
            case 4:
                return "ERROR_ACTION_TIMEOUT(" + this.d + ")";
            case 5:
                return "ERROR_SERVICE_CONN_FAILED(" + this.d + ")";
            case 6:
                return "ERROR_FILE_NOT_FOUND(" + this.d + ")";
            case 7:
                return "ERROR_PROVIDER_BUSY(" + this.d + ")";
            case 8:
                return "ERROR_PEER_AGENT_BUSY(" + this.d + ")";
            case 9:
                return "ERROR_USER_CANCELLED(" + this.d + ")";
            case 10:
                return "ERROR_FT_SERVICE_BUSY(" + this.d + ")";
            case 11:
                return "ERROR_FT_SPACE_NOT_AVAILABLE(" + this.d + ")";
            case 12:
                return "ERROR_FT_FRAMEWORK_OLD(" + this.d + ")";
            case 13:
                return "ERROR_TRANSACTION_NOT_FOUND(" + this.d + ")";
            default:
                return String.valueOf(i);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public c e() {
        return this.f2562e;
    }

    public int f() {
        return this.f2561c;
    }

    public JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgId", this.b);
        jSONObject.put("transId", this.f2561c);
        jSONObject.put("result", this.f2562e.ordinal());
        jSONObject.put(EngineConstant.REASON, this.d);
        jSONObject.put(LogSenderConst.FILENAME, this.a);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.f2561c);
        parcel.writeInt(this.f2562e.ordinal());
        parcel.writeString(this.a);
        parcel.writeInt(this.d);
    }

    public CtrlResponse(String str, int i, c cVar, int i2, String str2) {
        this.b = str;
        this.f2561c = i;
        this.f2562e = cVar;
        this.d = i2;
        this.a = str2;
    }

    public void a(String str) {
        this.b = str;
    }

    public void b(int i) {
        this.f2561c = i;
    }

    public void a(int i) {
        this.d = i;
    }

    public void a(c cVar) {
        this.f2562e = cVar;
    }

    public static CtrlResponse a(JSONObject jSONObject) throws JSONException {
        CtrlResponse ctrlResponse = new CtrlResponse();
        ctrlResponse.b = jSONObject.getString("msgId");
        ctrlResponse.f2561c = jSONObject.getInt("transId");
        if (jSONObject.has("result")) {
            ctrlResponse.f2562e = c.a(jSONObject.getInt("result"));
        }
        if (jSONObject.has(EngineConstant.REASON)) {
            ctrlResponse.d = jSONObject.getInt(EngineConstant.REASON);
        }
        if (jSONObject.has(LogSenderConst.FILENAME)) {
            ctrlResponse.a = jSONObject.getString(LogSenderConst.FILENAME);
        }
        return ctrlResponse;
    }
}

package com.heytap.accessory.stream.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.speech.engine.constant.EngineConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class SetupResponse extends CtrlResponse {
    public static final Parcelable.Creator<SetupResponse> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f2731e;
    public int f;

    public /* synthetic */ SetupResponse(String str, int i, c cVar, int i2, long j2, int i3, a aVar) {
        this(str, i, cVar, i2, j2, i3);
    }

    public static SetupResponse b(JSONObject jSONObject) throws JSONException {
        SetupResponse setupResponse = new SetupResponse();
        setupResponse.a(jSONObject.getString("msgId"));
        setupResponse.b(jSONObject.getInt("transId"));
        setupResponse.a(c.a(jSONObject.getInt("result")));
        setupResponse.a(jSONObject.getInt(EngineConstant.REASON));
        if (jSONObject.has("maxWindowSize")) {
            setupResponse.f2731e = jSONObject.getInt("maxWindowSize");
        }
        if (jSONObject.has("key_traffic_control_flag")) {
            setupResponse.f = jSONObject.getInt("key_traffic_control_flag");
        }
        return setupResponse;
    }

    @Override // com.heytap.accessory.stream.model.CtrlResponse, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.heytap.accessory.stream.model.CtrlResponse
    public JSONObject e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgId", a());
        jSONObject.put("transId", d());
        jSONObject.put("result", c().ordinal());
        jSONObject.put(EngineConstant.REASON, b());
        jSONObject.put("maxWindowSize", this.f2731e);
        jSONObject.put("key_traffic_control_flag", this.f);
        return jSONObject;
    }

    public int f() {
        return this.f;
    }

    public long g() {
        return this.f2731e;
    }

    @Override // com.heytap.accessory.stream.model.CtrlResponse, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(a());
        parcel.writeInt(d());
        parcel.writeInt(c().ordinal());
        parcel.writeInt(b());
        parcel.writeLong(this.f2731e);
        parcel.writeInt(this.f);
    }

    public SetupResponse() {
    }

    public class a implements Parcelable.Creator<SetupResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SetupResponse createFromParcel(Parcel parcel) {
            return new SetupResponse(parcel.readString(), parcel.readInt(), c.a(parcel.readInt()), parcel.readInt(), parcel.readLong(), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SetupResponse[] newArray(int i) {
            return new SetupResponse[i];
        }
    }

    public SetupResponse(int i, long j2, int i2) {
        this("streamtransfer-setup-rsp", i, c.RESULT_SUCCESS, -1, j2, i2);
    }

    public SetupResponse(int i, c cVar, int i2) {
        this("streamtransfer-setup-rsp", i, cVar, i2, 0L, 0);
    }

    public SetupResponse(String str, int i, c cVar, int i2, long j2, int i3) {
        super(str, i, cVar, i2);
        this.f2731e = j2;
    }
}

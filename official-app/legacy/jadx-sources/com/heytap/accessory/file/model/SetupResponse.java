package com.heytap.accessory.file.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.speech.engine.constant.EngineConstant;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class SetupResponse extends CtrlResponse {
    public static final Parcelable.Creator<SetupResponse> CREATOR = new a();
    public long f;
    public int g;

    public /* synthetic */ SetupResponse(String str, int i, c cVar, int i2, String str2, long j2, int i3, a aVar) {
        this(str, i, cVar, i2, str2, j2, i3);
    }

    public static SetupResponse b(JSONObject jSONObject) throws JSONException {
        SetupResponse setupResponse = new SetupResponse();
        setupResponse.a(jSONObject.getString("msgId"));
        setupResponse.b(jSONObject.getInt("transId"));
        setupResponse.a(c.a(jSONObject.getInt("result")));
        setupResponse.a(jSONObject.getInt(EngineConstant.REASON));
        if (jSONObject.has(LogSenderConst.FILENAME)) {
            setupResponse.a = jSONObject.getString(LogSenderConst.FILENAME);
        }
        if (jSONObject.has("maxWindowSize")) {
            setupResponse.f = jSONObject.getLong("maxWindowSize");
        }
        if (jSONObject.has("flowControlFlag")) {
            setupResponse.c(jSONObject.getInt("flowControlFlag"));
        }
        return setupResponse;
    }

    public void c(int i) {
        this.g = i;
    }

    @Override // com.heytap.accessory.file.model.CtrlResponse, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.heytap.accessory.file.model.CtrlResponse
    public JSONObject g() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgId", b());
        jSONObject.put("transId", f());
        jSONObject.put("result", e().ordinal());
        jSONObject.put(EngineConstant.REASON, c());
        jSONObject.put("maxWindowSize", this.f);
        jSONObject.put("flowControlFlag", this.g);
        jSONObject.put(LogSenderConst.FILENAME, this.a);
        return jSONObject;
    }

    public int h() {
        return this.g;
    }

    public long i() {
        return this.f;
    }

    @Override // com.heytap.accessory.file.model.CtrlResponse, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(b());
        parcel.writeInt(f());
        parcel.writeInt(e().ordinal());
        parcel.writeString(a());
        parcel.writeInt(c());
        parcel.writeLong(this.f);
        parcel.writeInt(this.g);
    }

    public SetupResponse() {
    }

    public class a implements Parcelable.Creator<SetupResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SetupResponse createFromParcel(Parcel parcel) {
            return new SetupResponse(parcel.readString(), parcel.readInt(), c.a(parcel.readInt()), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SetupResponse[] newArray(int i) {
            return new SetupResponse[i];
        }
    }

    public SetupResponse(int i, String str, long j2, int i2) {
        this("filetransfer-setup-rsp", i, c.RESULT_SUCCESS, -1, str, j2, i2);
    }

    public SetupResponse(int i, c cVar, int i2, String str) {
        this("filetransfer-setup-rsp", i, cVar, i2, str, 0L, 0);
    }

    public SetupResponse(String str, int i, c cVar, int i2, String str2, long j2, int i3) {
        super(str, i, cVar, i2, str2);
        this.f = j2;
        this.g = i3;
    }
}

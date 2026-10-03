package com.heytap.accessory.file.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class CtrlRequest implements Parcelable {
    public static final Parcelable.Creator<CtrlRequest> CREATOR = new a();
    public String a;
    public String b;
    public int c;

    public class a implements Parcelable.Creator<CtrlRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CtrlRequest[] newArray(int i) {
            return new CtrlRequest[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CtrlRequest createFromParcel(Parcel parcel) {
            return new CtrlRequest(parcel.readString(), parcel.readInt(), parcel.readString());
        }
    }

    public CtrlRequest() {
    }

    public int a() {
        return this.c;
    }

    public JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgId", this.b);
        jSONObject.put("transId", this.c);
        jSONObject.put("fileName", this.a);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.a);
    }

    public CtrlRequest(String str, int i, String str2) {
        this.b = str;
        this.c = i;
        this.a = str2;
    }

    public void a(JSONObject jSONObject) throws JSONException {
        this.b = jSONObject.getString("msgId");
        this.c = jSONObject.getInt("transId");
        if (jSONObject.has("fileName")) {
            this.a = jSONObject.getString("fileName");
        }
    }
}

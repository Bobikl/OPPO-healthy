package com.heytap.accessory.stream.model;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class CompleteRequest implements Parcelable {
    public static final Parcelable.Creator<CompleteRequest> CREATOR = new a();
    public String a;
    public int b;
    public long c;

    public class a implements Parcelable.Creator<CompleteRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CompleteRequest[] newArray(int i) {
            return new CompleteRequest[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CompleteRequest createFromParcel(Parcel parcel) {
            return new CompleteRequest(parcel.readString(), parcel.readInt(), parcel.readLong());
        }
    }

    public CompleteRequest() {
    }

    public long a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgId", this.a);
        jSONObject.put("transId", this.b);
        jSONObject.put("totalSize", this.c);
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
    }

    public CompleteRequest(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public void a(JSONObject jSONObject) throws JSONException {
        this.a = jSONObject.getString("msgId");
        this.b = jSONObject.getInt("transId");
        this.c = jSONObject.getLong("totalSize");
    }
}

package com.heytap.accessory.file.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class SetupRequest implements Parcelable {
    public static final Parcelable.Creator<SetupRequest> CREATOR = new a();
    public long a;
    public String b;
    public String c;
    public String d;
    public Date e;
    public String f;
    public long g;
    public String h;
    public String i;
    public String j;
    public int k;
    public long l;
    public int m;
    public String n;
    public String o;

    public class a implements Parcelable.Creator<SetupRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SetupRequest[] newArray(int i) {
            return new SetupRequest[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SetupRequest createFromParcel(Parcel parcel) {
            return new SetupRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), (Date) parcel.readValue(Date.class.getClassLoader()), (String) parcel.readValue(String.class.getClassLoader()), 0L, Integer.parseInt(parcel.readString()));
        }
    }

    public SetupRequest() {
        this.m = -1;
    }

    public long a() {
        return this.a;
    }

    public void b(long j) {
        this.l = j;
    }

    public long c() {
        return this.l;
    }

    public String d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof SetupRequest) && ((SetupRequest) obj).k().equalsIgnoreCase(k());
    }

    public String f() {
        return this.n;
    }

    public String g() {
        return this.f;
    }

    public long h() {
        return this.g;
    }

    public int hashCode() {
        int iHashCode = (((this.h.hashCode() + 527) * 31) + this.f.hashCode()) * 31;
        long j = this.g;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }

    public String i() {
        return this.o;
    }

    public String j() {
        return this.i;
    }

    public String k() {
        return this.j;
    }

    public int l() {
        return this.k;
    }

    public JSONObject m() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgId", this.h);
        jSONObject.put("transId", this.k);
        jSONObject.put("fileName", this.f);
        jSONObject.put("filePath", this.c);
        jSONObject.put(Constant.FILE_SIZE, this.g);
        jSONObject.put("peerId", this.i);
        jSONObject.put("containerId", this.b);
        jSONObject.put("channelId", String.valueOf(this.m));
        Date date = this.e;
        if (date != null) {
            jSONObject.put("fileLastModified", date.getTime());
        }
        String str = this.d;
        if (str != null) {
            jSONObject.put("fileAuthor", str);
        }
        String str2 = this.n;
        if (str2 != null) {
            jSONObject.put("fileInfo", str2);
        }
        String str3 = this.o;
        if (str3 != null) {
            jSONObject.put("md5", str3);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f);
        parcel.writeString(this.j);
        parcel.writeValue(this.c);
        parcel.writeLong(this.g);
        parcel.writeValue(this.e);
        parcel.writeValue(this.d);
        parcel.writeString(String.valueOf(this.m));
    }

    public void a(String str) {
        this.c = str;
    }

    public int b() {
        return this.m;
    }

    public SetupRequest(int i, String str, String str2, String str3, String str4, long j, long j2, String str5, String str6, int i2, String str7) {
        this.h = "filetransfer-setup-req";
        this.k = i;
        this.f = str;
        this.j = str2;
        this.c = str3;
        this.n = str4;
        this.g = j;
        this.a = j2;
        this.b = str5;
        this.i = str6;
        this.m = i2;
        this.o = str7;
    }

    public void a(long j) {
        this.a = j;
    }

    public static SetupRequest a(JSONObject jSONObject) throws JSONException {
        SetupRequest setupRequest = new SetupRequest();
        setupRequest.h = jSONObject.getString("msgId");
        setupRequest.k = jSONObject.getInt("transId");
        if (jSONObject.has("fileName")) {
            setupRequest.f = jSONObject.getString("fileName");
        }
        setupRequest.j = jSONObject.getString("filePath");
        setupRequest.c = jSONObject.getString("filePath");
        setupRequest.g = jSONObject.getLong(Constant.FILE_SIZE);
        setupRequest.i = jSONObject.getString("peerId");
        setupRequest.b = jSONObject.getString("containerId");
        setupRequest.m = Integer.parseInt(jSONObject.getString("channelId"));
        if (jSONObject.has("fileLastModified")) {
            setupRequest.e = new Date(jSONObject.getLong("fileLastModified"));
        }
        if (jSONObject.has("fileAuthor")) {
            setupRequest.d = jSONObject.getString("fileAuthor");
        }
        if (jSONObject.has("fileInfo")) {
            setupRequest.n = jSONObject.getString("fileInfo");
        }
        if (jSONObject.has("md5")) {
            setupRequest.o = jSONObject.getString("md5");
        }
        return setupRequest;
    }

    public SetupRequest(String str, String str2, String str3, long j, Date date, String str4, long j2, int i) {
        this.h = "filetransfer-setup-req";
        this.f = str;
        this.j = str2;
        this.c = str3;
        this.g = j;
        this.e = date;
        this.d = str4;
        this.l = j2;
        this.m = i;
    }
}

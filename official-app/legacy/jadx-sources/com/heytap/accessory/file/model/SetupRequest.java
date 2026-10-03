package com.heytap.accessory.file.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.log.consts.LogSenderConst;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class SetupRequest implements Parcelable {
    public static final Parcelable.Creator<SetupRequest> CREATOR = new a();
    public long a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2563c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Date f2564e;
    public String f;
    public long g;
    public String h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f2565j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f2566l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f2567n;
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

    public void b(long j2) {
        this.f2566l = j2;
    }

    public long c() {
        return this.f2566l;
    }

    public String d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f2563c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof SetupRequest) && ((SetupRequest) obj).k().equalsIgnoreCase(k());
    }

    public String f() {
        return this.f2567n;
    }

    public String g() {
        return this.f;
    }

    public long h() {
        return this.g;
    }

    public int hashCode() {
        int iHashCode = (((this.h.hashCode() + 527) * 31) + this.f.hashCode()) * 31;
        long j2 = this.g;
        return iHashCode + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String i() {
        return this.o;
    }

    public String j() {
        return this.i;
    }

    public String k() {
        return this.f2565j;
    }

    public int l() {
        return this.k;
    }

    public JSONObject m() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgId", this.h);
        jSONObject.put("transId", this.k);
        jSONObject.put(LogSenderConst.FILENAME, this.f);
        jSONObject.put("filePath", this.f2563c);
        jSONObject.put(Constant.FILE_SIZE, this.g);
        jSONObject.put("peerId", this.i);
        jSONObject.put("containerId", this.b);
        jSONObject.put("channelId", String.valueOf(this.m));
        Date date = this.f2564e;
        if (date != null) {
            jSONObject.put("fileLastModified", date.getTime());
        }
        String str = this.d;
        if (str != null) {
            jSONObject.put("fileAuthor", str);
        }
        String str2 = this.f2567n;
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
        parcel.writeString(this.f2565j);
        parcel.writeValue(this.f2563c);
        parcel.writeLong(this.g);
        parcel.writeValue(this.f2564e);
        parcel.writeValue(this.d);
        parcel.writeString(String.valueOf(this.m));
    }

    public void a(String str) {
        this.f2563c = str;
    }

    public int b() {
        return this.m;
    }

    public SetupRequest(int i, String str, String str2, String str3, String str4, long j2, long j3, String str5, String str6, int i2, String str7) {
        this.h = "filetransfer-setup-req";
        this.k = i;
        this.f = str;
        this.f2565j = str2;
        this.f2563c = str3;
        this.f2567n = str4;
        this.g = j2;
        this.a = j3;
        this.b = str5;
        this.i = str6;
        this.m = i2;
        this.o = str7;
    }

    public void a(long j2) {
        this.a = j2;
    }

    public static SetupRequest a(JSONObject jSONObject) throws JSONException {
        SetupRequest setupRequest = new SetupRequest();
        setupRequest.h = jSONObject.getString("msgId");
        setupRequest.k = jSONObject.getInt("transId");
        if (jSONObject.has(LogSenderConst.FILENAME)) {
            setupRequest.f = jSONObject.getString(LogSenderConst.FILENAME);
        }
        setupRequest.f2565j = jSONObject.getString("filePath");
        setupRequest.f2563c = jSONObject.getString("filePath");
        setupRequest.g = jSONObject.getLong(Constant.FILE_SIZE);
        setupRequest.i = jSONObject.getString("peerId");
        setupRequest.b = jSONObject.getString("containerId");
        setupRequest.m = Integer.parseInt(jSONObject.getString("channelId"));
        if (jSONObject.has("fileLastModified")) {
            setupRequest.f2564e = new Date(jSONObject.getLong("fileLastModified"));
        }
        if (jSONObject.has("fileAuthor")) {
            setupRequest.d = jSONObject.getString("fileAuthor");
        }
        if (jSONObject.has("fileInfo")) {
            setupRequest.f2567n = jSONObject.getString("fileInfo");
        }
        if (jSONObject.has("md5")) {
            setupRequest.o = jSONObject.getString("md5");
        }
        return setupRequest;
    }

    public SetupRequest(String str, String str2, String str3, long j2, Date date, String str4, long j3, int i) {
        this.h = "filetransfer-setup-req";
        this.f = str;
        this.f2565j = str2;
        this.f2563c = str3;
        this.g = j2;
        this.f2564e = date;
        this.d = str4;
        this.f2566l = j3;
        this.m = i;
    }
}

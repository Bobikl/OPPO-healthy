package com.oplus.oms.split.full.splitdownload;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.w7i;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();
    private static final String i = "DownloadRequest";
    private final String a;
    private final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20012c;
    private final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f20013e;
    private final Map<String, String> f;
    private final String g;
    private final String h;

    public class a implements Parcelable.Creator<DownloadRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    }

    public static class b {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20014c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f20015e;
        public Map<String, String> f;
        public String g;
        public String h;

        public DownloadRequest c() {
            return new DownloadRequest(this, (a) null);
        }

        public b e(String str) {
            this.b = str;
            return this;
        }

        public b h(Map<String, String> map) {
            this.f = map;
            return this;
        }

        public b l(String str) {
            this.d = str;
            return this;
        }

        public b m(String str) {
            this.a = str;
            return this;
        }

        public b n(String str) {
            this.h = str;
            return this;
        }

        public b o(String str) {
            this.g = str;
            return this;
        }

        public b p(long j2) {
            this.f20015e = j2;
            return this;
        }

        public b q(String str) {
            this.f20014c = str;
            return this;
        }
    }

    public /* synthetic */ DownloadRequest(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static b newBuilder() {
        return new b();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCurrentVersion() {
        return this.b;
    }

    public Map<String, String> getExtra() {
        return this.f;
    }

    public String getMd5() {
        return this.d;
    }

    public String getModuleName() {
        return this.a;
    }

    public String getSaveFileName() {
        return this.h;
    }

    public String getSavePath() {
        return this.g;
    }

    public long getSize() {
        return this.f20013e;
    }

    public String getUrl() {
        return this.f20012c;
    }

    public String toString() {
        return "DownloadRequest{mModuleName='" + this.a + "', currentVersion='" + this.b + "', url='" + this.f20012c + "', mMd5='" + this.d + "', size=" + this.f20013e + ", extra=" + this.f + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        if (parcel == null) {
            w7i.i(i, "Parcel is null", new Object[0]);
            return;
        }
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.f20012c);
        parcel.writeString(this.d);
        parcel.writeLong(this.f20013e);
        parcel.writeMap(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }

    public /* synthetic */ DownloadRequest(b bVar, a aVar) {
        this(bVar);
    }

    public String getExtra(String str) {
        return this.f.get(str);
    }

    private DownloadRequest(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.f20012c = parcel.readString();
        this.d = parcel.readString();
        this.f20013e = parcel.readLong();
        this.f = parcel.readHashMap(DownloadRequest.class.getClassLoader());
        this.g = parcel.readString();
        this.h = parcel.readString();
    }

    private DownloadRequest(b bVar) {
        this.a = bVar.a;
        this.f20012c = bVar.f20014c;
        this.d = bVar.d;
        this.f20013e = bVar.f20015e;
        this.f = bVar.f;
        this.b = bVar.b;
        this.g = bVar.g;
        this.h = bVar.h;
    }
}

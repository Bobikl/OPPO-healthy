package com.heytap.accessory.security;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class AuthFalseCount implements Parcelable {
    public static final Parcelable.Creator<AuthFalseCount> CREATOR = new a();
    public int a;
    public long b;

    public class a implements Parcelable.Creator<AuthFalseCount> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthFalseCount createFromParcel(Parcel parcel) {
            return new AuthFalseCount(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthFalseCount[] newArray(int i) {
            return new AuthFalseCount[i];
        }
    }

    public AuthFalseCount() {
        this.a = 0;
        this.b = 0L;
    }

    public static AuthFalseCount a(String str) {
        AuthFalseCount authFalseCount = new AuthFalseCount();
        if (TextUtils.isEmpty(str)) {
            return authFalseCount;
        }
        String[] strArrSplit = str.split(";");
        if (strArrSplit.length != 2) {
            return authFalseCount;
        }
        try {
            authFalseCount.a = Integer.parseInt(strArrSplit[0]);
            authFalseCount.b = Long.parseLong(strArrSplit[1]);
        } catch (Exception unused) {
            com.heytap.accessory.base.logging.a.e("AuthFalseCount", "createByStoreValue Exception");
        }
        return authFalseCount;
    }

    public String b() {
        return this.a + ";" + this.b;
    }

    public void c() {
        int i = this.a;
        if (i < 5) {
            this.a = i + 1;
        }
        this.b = System.currentTimeMillis();
    }

    public boolean d() {
        return this.a >= 5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return System.currentTimeMillis() - this.b < 300000;
    }

    public void f() {
        this.a = 0;
        this.b = 0L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
    }

    public AuthFalseCount(Parcel parcel) {
        this.a = 0;
        this.b = 0L;
        this.a = parcel.readInt();
        this.b = parcel.readLong();
    }

    public int a() {
        return this.a;
    }
}

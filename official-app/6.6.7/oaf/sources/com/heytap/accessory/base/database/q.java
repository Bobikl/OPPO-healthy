package com.heytap.accessory.base.database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Entity(tableName = "ServiceDescription")
public class q {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    public int a;
    public long b;

    @NonNull
    public String c;

    @NonNull
    public String d;

    @NonNull
    public String e;

    @NonNull
    public String f;
    public long g;
    public int h;
    public int i;
    public int j;
    public int k;

    @NonNull
    public String l;

    @NonNull
    public String m;
    public int n;
    public int o;
    public int p;
    public int q;

    @ColumnInfo(name = "awakenable")
    public int r;

    public q(String str, int i, String str2, String str3, long j, String str4, String str5, int i2, int i3, int i4, int i5, long j2, int i6, int i7, String str6, int i8, int i9) {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.l = "";
        this.m = "";
        this.e = str == null ? "" : str;
        this.i = i;
        this.c = str2 == null ? "" : str2;
        this.d = str3 == null ? "" : str3;
        this.b = j;
        this.m = str4 == null ? "" : str4;
        this.l = str5 == null ? "" : str5;
        this.n = i2;
        this.h = i3;
        this.j = i4;
        this.k = i5;
        this.g = j2;
        this.o = i6;
        this.p = i7;
        this.f = str6 != null ? str6 : "";
        this.q = i8;
        this.r = i9;
    }

    public void a(int i) {
        this.a = i;
    }

    @NonNull
    public String b() {
        return this.f;
    }

    @NonNull
    public String c() {
        return this.d;
    }

    @NonNull
    public String d() {
        return this.c;
    }

    @NonNull
    public String e() {
        return this.m;
    }

    public int f() {
        return this.r;
    }

    public int g() {
        return this.p;
    }

    public long h() {
        return this.b;
    }

    public int i() {
        return this.a;
    }

    public int j() {
        return this.j;
    }

    @NonNull
    public String k() {
        return this.l;
    }

    public int l() {
        return this.n;
    }

    @NonNull
    public String m() {
        return this.e;
    }

    public int n() {
        return this.h;
    }

    public int o() {
        return this.q;
    }

    public int p() {
        return this.o;
    }

    public int q() {
        return this.k;
    }

    public int r() {
        return this.i;
    }

    public String toString() {
        return "ServiceDescriptionDbBean{id=" + this.a + ", deviceId=" + this.b + ", appName='" + this.c + "', agentId=" + this.g + ", profileId='" + this.e + "', awakenable='" + this.r + "', agentImplClass='" + this.f + "'}";
    }

    public long a() {
        return this.g;
    }

    public void a(long j) {
        this.g = j;
    }

    @Ignore
    public q() {
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.l = "";
        this.m = "";
    }
}

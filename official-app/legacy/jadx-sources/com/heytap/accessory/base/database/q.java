package com.heytap.accessory.base.database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes14.dex */
@Entity(tableName = "ServiceDescription")
public class q {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    public int a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public String f2456c;

    @NonNull
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public String f2457e;

    @NonNull
    public String f;
    public long g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2458j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    public String f2459l;

    @NonNull
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2460n;
    public int o;
    public int p;
    public int q;

    @ColumnInfo(name = "awakenable")
    public int r;

    public q(String str, int i, String str2, String str3, long j2, String str4, String str5, int i2, int i3, int i4, int i5, long j3, int i6, int i7, String str6, int i8, int i9) {
        this.f2456c = "";
        this.d = "";
        this.f2457e = "";
        this.f = "";
        this.f2459l = "";
        this.m = "";
        this.f2457e = str == null ? "" : str;
        this.i = i;
        this.f2456c = str2 == null ? "" : str2;
        this.d = str3 == null ? "" : str3;
        this.b = j2;
        this.m = str4 == null ? "" : str4;
        this.f2459l = str5 == null ? "" : str5;
        this.f2460n = i2;
        this.h = i3;
        this.f2458j = i4;
        this.k = i5;
        this.g = j3;
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
        return this.f2456c;
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
        return this.f2458j;
    }

    @NonNull
    public String k() {
        return this.f2459l;
    }

    public int l() {
        return this.f2460n;
    }

    @NonNull
    public String m() {
        return this.f2457e;
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
        return "ServiceDescriptionDbBean{id=" + this.a + ", deviceId=" + this.b + ", appName='" + this.f2456c + "', agentId=" + this.g + ", profileId='" + this.f2457e + "', awakenable='" + this.r + "', agentImplClass='" + this.f + "'}";
    }

    public long a() {
        return this.g;
    }

    public void a(long j2) {
        this.g = j2;
    }

    @Ignore
    public q() {
        this.f2456c = "";
        this.d = "";
        this.f2457e = "";
        this.f = "";
        this.f2459l = "";
        this.m = "";
    }
}

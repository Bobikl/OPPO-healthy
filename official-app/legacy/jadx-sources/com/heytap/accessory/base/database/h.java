package com.heytap.accessory.base.database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes14.dex */
@Entity(tableName = "Device")
public class h {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f2447c;

    @ColumnInfo(name = "uuidType")
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public String f2448e = "";
    public int f;

    public h() {
    }

    public void a(@NonNull String str) {
        this.f2448e = str;
    }

    public void b(int i) {
        this.a = i;
    }

    public int c() {
        return this.a;
    }

    public String d() {
        return this.f2447c;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.d;
    }

    public String toString() {
        return "DeviceDbBean{id=" + this.a + ", transportId=" + this.b + ", transportAddress='" + this.f2447c + "', uuidType=" + this.d + ", deviceName='" + this.f2448e + "', checkSum=" + this.f + '}';
    }

    public int a() {
        return this.f;
    }

    public void b(String str) {
        this.f2447c = str;
    }

    public void c(int i) {
        this.b = i;
    }

    public void d(int i) {
        this.d = i;
    }

    public h(int i, String str, int i2) {
        this.b = i;
        this.f2447c = str;
        this.d = i2;
    }

    public void a(int i) {
        this.f = i;
    }

    @NonNull
    public String b() {
        return this.f2448e;
    }
}

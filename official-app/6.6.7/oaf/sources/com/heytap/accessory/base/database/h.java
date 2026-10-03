package com.heytap.accessory.base.database;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Entity(tableName = "Device")
public class h {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    public int a;
    public int b;
    public String c;

    @ColumnInfo(name = "uuidType")
    public int d;

    @NonNull
    public String e = "";
    public int f;

    public h() {
    }

    public void a(@NonNull String str) {
        this.e = str;
    }

    public void b(int i) {
        this.a = i;
    }

    public int c() {
        return this.a;
    }

    public String d() {
        return this.c;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.d;
    }

    public String toString() {
        return "DeviceDbBean{id=" + this.a + ", transportId=" + this.b + ", transportAddress='" + this.c + "', uuidType=" + this.d + ", deviceName='" + this.e + "', checkSum=" + this.f + '}';
    }

    public int a() {
        return this.f;
    }

    public void b(String str) {
        this.c = str;
    }

    public void c(int i) {
        this.b = i;
    }

    public void d(int i) {
        this.d = i;
    }

    public h(int i, String str, int i2) {
        this.b = i;
        this.c = str;
        this.d = i2;
    }

    public void a(int i) {
        this.f = i;
    }

    @NonNull
    public String b() {
        return this.e;
    }
}

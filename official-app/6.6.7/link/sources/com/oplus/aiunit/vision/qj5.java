package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Entity(indices = {@Index(unique = true, value = {"node_id"})}, tableName = fi5.TABLE_DEVICE_INFO)
public class qj5 {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    public int a;

    @ColumnInfo(name = "node_id")
    public String b;

    @ColumnInfo(name = "product_type")
    public int c;

    @ColumnInfo(name = "main_mac")
    public String d;

    @ColumnInfo(name = "main_type")
    public int e;

    @ColumnInfo(name = "stub_mac")
    public String f;

    @ColumnInfo(name = "stub_type")
    public int g;

    @ColumnInfo(name = "encrypt_key")
    public String h;

    public String a() {
        return this.h;
    }

    public int b() {
        return this.a;
    }

    public String c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qj5 qj5Var = (qj5) obj;
        return this.c == qj5Var.c && this.e == qj5Var.e && this.g == qj5Var.g && TextUtils.equals(this.b, qj5Var.b) && TextUtils.equals(this.d, qj5Var.d) && TextUtils.equals(this.f, qj5Var.f) && TextUtils.equals(this.h, qj5Var.h);
    }

    public int f() {
        return this.c;
    }

    public String g() {
        return this.f;
    }

    public int h() {
        return this.g;
    }

    public void i(String str) {
        this.h = str;
    }

    public void j(int i) {
        this.a = i;
    }

    public void k(String str) {
        this.d = str;
    }

    public void l(int i) {
        this.e = i;
    }

    public void m(String str) {
        this.b = str;
    }

    public void n(int i) {
        this.c = i;
    }

    public void o(String str) {
        this.f = str;
    }

    public void p(int i) {
        this.g = i;
    }

    public String toString() {
        return "DeviceInfoT{mId=" + this.a + ", mProductType=" + this.c + ", mNodeId='" + this.b + "', mMainMac='" + this.d + "', mMainType=" + this.e + ", mStubMac='" + this.f + "', mStubType=" + this.g + ", mEncryptKey='" + this.h + "'}";
    }
}

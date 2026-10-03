package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes5.dex */
@Entity(indices = {@Index(unique = true, value = {"node_id"})}, tableName = "device_info")
public class ui5 {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    public int a;

    @ColumnInfo(name = "node_id")
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @ColumnInfo(name = "product_type")
    public int f17475c;

    @ColumnInfo(name = "main_mac")
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @ColumnInfo(name = "main_type")
    public int f17476e;

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
        return this.f17476e;
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
        ui5 ui5Var = (ui5) obj;
        return this.f17475c == ui5Var.f17475c && this.f17476e == ui5Var.f17476e && this.g == ui5Var.g && TextUtils.equals(this.b, ui5Var.b) && TextUtils.equals(this.d, ui5Var.d) && TextUtils.equals(this.f, ui5Var.f) && TextUtils.equals(this.h, ui5Var.h);
    }

    public int f() {
        return this.f17475c;
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
        this.f17476e = i;
    }

    public void m(String str) {
        this.b = str;
    }

    public void n(int i) {
        this.f17475c = i;
    }

    public void o(String str) {
        this.f = str;
    }

    public void p(int i) {
        this.g = i;
    }

    public String toString() {
        return "DeviceInfoT{mId=" + this.a + ", mProductType=" + this.f17475c + ", mNodeId='" + this.b + "', mMainMac='" + this.d + "', mMainType=" + this.f17476e + ", mStubMac='" + this.f + "', mStubType=" + this.g + ", mEncryptKey='" + this.h + "'}";
    }
}

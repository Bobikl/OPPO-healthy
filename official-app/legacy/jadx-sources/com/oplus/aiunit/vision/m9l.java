package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class m9l {
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13995c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13996e;
    public String f;
    public List<hgl> g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13997j;

    public int a() {
        return this.i;
    }

    public String b() {
        return this.f13995c;
    }

    public String c() {
        return this.d;
    }

    public int d() {
        return this.b;
    }

    public String e() {
        return this.f;
    }

    public int f() {
        return this.h;
    }

    public String g() {
        return this.f13996e;
    }

    public int h() {
        return this.f13997j;
    }

    public List<hgl> i() {
        return this.g;
    }

    public void j(int i) {
        this.i = i;
    }

    public void k(String str) {
        this.f13995c = str;
    }

    public void l(String str) {
        this.d = str;
    }

    public void m(int i) {
        this.b = i;
    }

    public void n(String str) {
        this.f = str;
    }

    public void o(int i) {
        this.h = i;
    }

    public void p(String str) {
        this.f13996e = str;
    }

    public void q(int i) {
        this.a = i;
    }

    public void r(int i) {
        this.f13997j = i;
    }

    public void s(List<hgl> list) {
        this.g = list;
    }

    @NonNull
    public String toString() {
        return "WatchEuiccInfo{resultCode=" + this.a + ", deviceType=" + this.b + ", deviceIMEI='" + this.f13995c + "', deviceSerialNumber='" + this.d + "', productName='" + this.f13996e + "', eID='" + this.f + "', mSimInfoList=" + this.g + ", netWorkStatus=" + this.h + ", deviceBattery=" + this.i + ", supportEncrypt=" + this.f13997j + '}';
    }
}

package com.heytap.health.linkage.ui;

import android.view.View;
import androidx.annotation.StringRes;
import com.oplus.aiunit.vision.txa;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class a {
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<txa> f4923c;

    @StringRes
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @StringRes
    public int f4924e;
    public int f;
    public String g;
    public String h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4925j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4926l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4927n;
    public View.OnClickListener o;
    public View.OnClickListener p;

    /* JADX INFO: renamed from: com.heytap.health.linkage.ui.a$a, reason: collision with other inner class name */
    public interface InterfaceC0470a {
    }

    public a(int i) {
        this.a = i;
    }

    public a A(View.OnClickListener onClickListener) {
        this.o = onClickListener;
        return this;
    }

    public a B(String str) {
        this.h = str;
        return this;
    }

    public a C(int i) {
        this.d = i;
        return this;
    }

    public a D(int i) {
        this.f4924e = i;
        return this;
    }

    public int a() {
        return this.f;
    }

    public int b() {
        return this.b;
    }

    public String c() {
        return this.i;
    }

    public String d() {
        return this.f4925j;
    }

    public List<txa> e() {
        return this.f4923c;
    }

    public String f() {
        return this.g;
    }

    public View.OnClickListener g() {
        return this.p;
    }

    public View.OnClickListener h() {
        return this.o;
    }

    public String i() {
        return this.h;
    }

    public int j() {
        return this.d;
    }

    public InterfaceC0470a k() {
        return null;
    }

    public int l() {
        return this.f4924e;
    }

    public int m() {
        return this.a;
    }

    public boolean n() {
        return this.f4927n;
    }

    public boolean o() {
        return this.k;
    }

    public boolean p() {
        return this.f4926l;
    }

    public boolean q() {
        return this.m;
    }

    public a r(int i) {
        this.f = i;
        return this;
    }

    public a s(int i) {
        this.b = i;
        return this;
    }

    public a t(boolean z) {
        this.f4927n = z;
        return this;
    }

    public String toString() {
        return "DeviceDetailsBean{type=" + this.a + ", connectStatus=" + this.b + ", title=" + this.f4924e + ", skuCode='" + this.h + "', icon2dUrl='" + this.i + "', load3d=" + this.k + '}';
    }

    public a u(String str) {
        this.i = str;
        return this;
    }

    public a v(String str) {
        this.f4925j = str;
        return this;
    }

    public a w(List<txa> list) {
        this.f4923c = list;
        return this;
    }

    public void x(boolean z) {
        this.k = z;
    }

    public void y(String str) {
        this.g = str;
    }

    public a z(View.OnClickListener onClickListener) {
        this.p = onClickListener;
        return this;
    }
}

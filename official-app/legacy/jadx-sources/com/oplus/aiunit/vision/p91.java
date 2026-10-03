package com.oplus.aiunit.vision;

import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes16.dex */
public abstract class p91 {
    public AppCompatActivity a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15271c;
    public a d;

    public interface a {
        default void M2() {
        }

        default void N6(int i) {
        }

        default void U1() {
        }

        default void d6() {
        }

        default void i5() {
        }

        void s1();
    }

    public p91(AppCompatActivity appCompatActivity) {
        this.a = appCompatActivity;
    }

    public abstract void a(String str, String str2);

    public void b(a aVar) {
        this.d = aVar;
    }

    public void c(String str, String str2) {
        d(str, str2, false);
    }

    public abstract void d(String str, String str2, boolean z);

    public abstract void e(String str, String str2, boolean z, boolean z2);
}

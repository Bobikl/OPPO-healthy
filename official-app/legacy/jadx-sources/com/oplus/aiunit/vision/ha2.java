package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class ha2 {
    public static final int ERROR_CMD_RUN_FAIL = 1;
    public static final int ERROR_EXCEPTION = 2;
    public static final int ERROR_PARSE_FAIL = 4;
    public static final int ERROR_UNSUPPORT = 3;
    public static final int RESULT_CODE_SUC = 0;
    public int a;
    public Bundle b;

    public ha2() {
        this.a = 0;
        this.b = new Bundle();
    }

    public boolean a(int i) {
        return this.b.containsKey("rst_cd_ky_" + i);
    }

    public int b(int i) {
        return this.b.getInt("rst_cd_ky_" + i);
    }

    @SuppressLint({"HealthLint_DeprecatedBundleGetter"})
    public <T extends Parcelable> T c(int i) {
        return (T) this.b.getParcelable("rst_cd_ky_" + i);
    }

    public <T extends Parcelable> ArrayList<T> d(int i) {
        return this.b.getParcelableArrayList("rst_cd_ky_" + i);
    }

    public String e(int i) {
        return this.b.getString("rst_cd_ky_" + i);
    }

    public boolean f() {
        return this.a == 0;
    }

    public void g(int i, int i2) {
        this.b.putInt("rst_cd_ky_" + i, i2);
    }

    public void h(int i, Parcelable parcelable) {
        this.b.putParcelable("rst_cd_ky_" + i, parcelable);
    }

    public void i(int i, ArrayList<? extends Parcelable> arrayList) {
        this.b.putParcelableArrayList("rst_cd_ky_" + i, arrayList);
    }

    public void j(int i, String str) {
        this.b.putString("rst_cd_ky_" + i, str);
    }

    public ha2(int i) {
        this.a = i;
    }
}

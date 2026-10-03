package com.oplus.aiunit.vision;

import android.bluetooth.le.ScanRecord;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public class st1 {
    public static final int ERROR_ROLE = -1;
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScanRecord f16739c;
    public int d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16740e;
    public int f;

    public st1(String str, String str2, int i, ScanRecord scanRecord) {
        this.a = str;
        this.b = str2;
        this.f16740e = i;
        this.f16739c = scanRecord;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public int c() {
        return this.d;
    }

    @Nullable
    public ScanRecord d() {
        return this.f16739c;
    }

    public void e(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        st1 st1Var = (st1) obj;
        return Objects.equals(this.a, st1Var.a) && Objects.equals(this.b, st1Var.b);
    }

    public void f(int i) {
        this.d = i;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public String toString() {
        return "BluetoothDeviceWrapper{mDeviceMac='" + gdb.a(this.a) + "', mDeviceName='" + this.b + "'}";
    }

    public st1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}

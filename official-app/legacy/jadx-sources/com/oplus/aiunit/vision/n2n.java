package com.oplus.aiunit.vision;

import android.os.Build;

/* JADX INFO: loaded from: classes10.dex */
public final class n2n implements Cloneable {
    public static final n2n f = new n2n();
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f14320j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f14321l = Build.BRAND;
    public String m = Build.MODEL;

    public static n2n a() {
        return f;
    }

    public final String toString() {
        return "TrackerEventDevice{deviceId='" + this.i + "', platform='Android', osVersionName='" + this.f14320j + "', osVersionCode=" + this.k + ", deviceAbi='null', deviceLevel=0, deviceBrand='" + this.f14321l + "', deviceModel='" + this.m + "'}";
    }
}

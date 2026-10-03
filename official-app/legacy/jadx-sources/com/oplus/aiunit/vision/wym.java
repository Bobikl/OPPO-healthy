package com.oplus.aiunit.vision;

import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class wym implements Cloneable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wym f18446e = new wym();
    public final String i = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18447j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18448l;

    public static wym a() {
        return f18446e;
    }

    public final String toString() {
        return "TrackerEventApp{appIdBiz=" + this.f18447j + ", appVersionName='" + this.k + "', appVersionCode=" + this.f18448l + ", channel='null', appAbi='null', startId='" + this.i + "'}";
    }
}

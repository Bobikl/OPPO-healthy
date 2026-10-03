package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.drs.base.util.NetworkUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class toc {
    @NonNull
    public j38 a() {
        return !b() ? j38.a("Network", "network not ready") : j38.e();
    }

    public boolean b() {
        return NetworkUtils.k();
    }

    public boolean c() {
        return NetworkUtils.m();
    }

    @NonNull
    public String d() {
        return "NetworkGate{networkReady=" + b() + ", isWifi=" + c() + "}";
    }
}

package com.oplus.statistics.strategy;

import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseTracker {
    public static final int FLAG_SEND_TO_ATOM = 2;
    public static final int FLAG_SEND_TO_DCS = 1;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20120c;
    public String d;
    public Map<String, String> a = new ArrayMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20121e = 1;

    public BaseTracker(String str, String str2) {
        this.b = str;
        this.f20120c = str2;
    }

    public BaseTracker add(Map<String, String> map) {
        this.a.putAll(map);
        return this;
    }

    public abstract void commit();

    public BaseTracker setAppId(String str) {
        this.d = str;
        return this;
    }

    public BaseTracker setSendFlag(int i) {
        this.f20121e = i;
        return this;
    }

    public BaseTracker add(String str, int i) {
        this.a.put(str, String.valueOf(i));
        return this;
    }

    public BaseTracker add(String str, boolean z) {
        this.a.put(str, String.valueOf(z));
        return this;
    }

    public BaseTracker add(String str, String str2) {
        this.a.put(str, String.valueOf(str2));
        return this;
    }

    public BaseTracker add(String str, long j2) {
        this.a.put(str, String.valueOf(j2));
        return this;
    }
}

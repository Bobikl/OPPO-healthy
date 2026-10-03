package com.oplus.aiunit.vision;

import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class qzm {
    public static final AtomicInteger h = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16003c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16004e;
    public int f;
    public final String a = UUID.randomUUID().toString();
    public final long b = System.currentTimeMillis() + 0;
    public final int d = h.getAndIncrement();
    public HashMap g = new HashMap();

    public static final class a {
        public int a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16005c;
        public final HashMap d = new HashMap();

        public final a a(String str, String str2) {
            this.d.put(str, str2);
            return this;
        }
    }

    public final String toString() {
        return "TrackerEventDetail{eventId='" + this.a + "', eventTime=" + this.b + ", eventType=" + g1n.b(this.f16003c) + ", eventSeq=" + this.d + ", pointId=" + this.f16004e + ", eventKey='null', bizPageName='null', bizModule='null', bizAction=" + jdm.b(this.f) + ", dataMap=" + this.g + '}';
    }
}

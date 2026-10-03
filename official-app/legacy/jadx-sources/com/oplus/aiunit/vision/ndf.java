package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes16.dex */
public class ndf {
    public final int a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rl4.b f14459c;

    public ndf(rl4.b bVar) {
        this.f14459c = bVar;
        this.a = -1;
        this.b = -1;
    }

    public boolean a(MessageEvent messageEvent) {
        int i = this.a;
        if (i != -1 && i != messageEvent.getServiceId()) {
            return false;
        }
        int i2 = this.b;
        return i2 == -1 || i2 == messageEvent.getCommandId();
    }

    public ndf(rl4.b bVar, int i, int i2) {
        this.f14459c = bVar;
        this.a = i;
        this.b = i2;
    }
}

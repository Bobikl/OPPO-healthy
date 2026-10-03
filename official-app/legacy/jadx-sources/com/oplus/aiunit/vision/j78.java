package com.oplus.aiunit.vision;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes17.dex */
public class j78 {
    public static final AtomicInteger a = new AtomicInteger(0);

    public static int a() {
        return a.getAndIncrement();
    }
}

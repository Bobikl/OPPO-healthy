package com.oplus.aiunit.vision;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes12.dex */
public class zw2 extends CountDownLatch {
    public zw2(int i) {
        super(i);
    }

    public void a() {
        while (getCount() > 0) {
            countDown();
        }
    }
}

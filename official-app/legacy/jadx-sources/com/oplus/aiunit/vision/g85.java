package com.oplus.aiunit.vision;

import androidx.work.impl.background.systemalarm.DelayMetCommandHandler;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class g85 implements Runnable {
    public final /* synthetic */ DelayMetCommandHandler i;

    public /* synthetic */ g85(DelayMetCommandHandler delayMetCommandHandler) {
        this.i = delayMetCommandHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.startWork();
    }
}

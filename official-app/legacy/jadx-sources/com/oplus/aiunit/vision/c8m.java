package com.oplus.aiunit.vision;

import androidx.camera.core.SafeCloseImageReaderProxy;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c8m implements Runnable {
    public final /* synthetic */ SafeCloseImageReaderProxy i;

    @Override // java.lang.Runnable
    public final void run() {
        this.i.safeClose();
    }
}

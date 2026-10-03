package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes8.dex */
public class n9m implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(@NonNull Runnable runnable) {
        Thread thread = new Thread(runnable, j9m.h);
        thread.setDaemon(false);
        return thread;
    }
}

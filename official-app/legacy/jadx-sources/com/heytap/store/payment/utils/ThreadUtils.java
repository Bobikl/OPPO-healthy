package com.heytap.store.payment.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
public class ThreadUtils {
    public static ExecutorService getSinglePool() {
        return Executors.newSingleThreadExecutor();
    }
}

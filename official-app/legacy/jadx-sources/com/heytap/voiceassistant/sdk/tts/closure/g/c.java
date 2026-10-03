package com.heytap.voiceassistant.sdk.tts.closure.g;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes19.dex */
public class c {
    public static final ExecutorService a = new ThreadPoolExecutor(5, 10, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(10), new a(), new ThreadPoolExecutor.DiscardPolicy());

    public class a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sbA = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("TtsTask #");
            sbA.append(this.a.getAndIncrement());
            Thread thread = new Thread(runnable, sbA.toString());
            thread.setPriority(5);
            return thread;
        }
    }
}

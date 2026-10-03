package com.platform.usercenter.jsbridge;

import android.os.Process;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes9.dex */
public class AsyncTaskThreadFactory implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread thread = new Thread(new Runnable() { // from class: com.platform.usercenter.jsbridge.AsyncTaskThreadFactory.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Process.setThreadPriority(10);
                } catch (Throwable th) {
                    UCLogUtil.e(th.toString());
                }
                runnable.run();
            }
        }, "JsBridge AsyncTaskExecutor");
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}

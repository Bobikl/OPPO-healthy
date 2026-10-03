package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public class c1n {
    public static final Executor a = new a();

    public static final class a implements Executor {
        public final Handler i = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.i.post(runnable);
        }
    }
}

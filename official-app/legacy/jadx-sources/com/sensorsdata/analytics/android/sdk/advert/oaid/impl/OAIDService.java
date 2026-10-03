package com.sensorsdata.analytics.android.sdk.advert.oaid.impl;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.sensorsdata.analytics.android.sdk.util.ThreadUtils;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes10.dex */
class OAIDService implements ServiceConnection {
    public static final LinkedBlockingQueue<IBinder> BINDER_QUEUE = new LinkedBlockingQueue<>(1);

    public class Task implements Runnable {
        final IBinder binder;

        public Task(IBinder iBinder) {
            this.binder = iBinder;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                LinkedBlockingQueue<IBinder> linkedBlockingQueue = OAIDService.BINDER_QUEUE;
                if (linkedBlockingQueue.size() > 0) {
                    linkedBlockingQueue.clear();
                }
                linkedBlockingQueue.put(this.binder);
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ThreadUtils.getSinglePool().execute(new Task(iBinder));
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}

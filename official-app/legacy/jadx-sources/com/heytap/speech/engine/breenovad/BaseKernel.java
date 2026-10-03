package com.heytap.speech.engine.breenovad;

import android.content.Context;
import com.heytap.speech.engine.breenovad.closure.a.c;
import com.heytap.speech.engine.breenovad.closure.b.a;
import com.oplus.aiunit.vision.t7b;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes2.dex */
public class BaseKernel implements Runnable {
    private String TAG;
    public Context context;
    private BaseListener mListener;
    private Thread mPool;
    private LinkedBlockingQueue<c> mQueue = new LinkedBlockingQueue<>();

    public BaseKernel(Context context, String str, BaseListener baseListener) {
        this.TAG = "BaseKernel";
        this.TAG = str;
        this.context = context;
        this.mListener = baseListener;
        Thread thread = new Thread(this);
        this.mPool = thread;
        thread.setName(this.TAG);
        this.mPool.start();
    }

    private void releaseMessage() {
        LinkedBlockingQueue<c> linkedBlockingQueue = this.mQueue;
        if (linkedBlockingQueue != null) {
            linkedBlockingQueue.clear();
            this.mQueue = null;
        }
    }

    public void cancelKernel() {
        t7b.INSTANCE.b(this.TAG, "cancelKernel");
        sendMessage(new c(4));
    }

    public void clearMessage() {
        t7b.INSTANCE.b(this.TAG, "clear message in queue");
        LinkedBlockingQueue<c> linkedBlockingQueue = this.mQueue;
        if (linkedBlockingQueue != null) {
            linkedBlockingQueue.clear();
        }
    }

    public void feed(byte[] bArr) {
        sendMessage(new c(9, bArr));
    }

    public String getNewConf() {
        return "";
    }

    public String getStartConf() {
        return "";
    }

    public synchronized int getValueOf(String str) {
        return -1;
    }

    public void innerRelease() {
        releaseMessage();
    }

    public void newKernel(a aVar) {
        t7b.INSTANCE.b(this.TAG, "newKernel");
        sendMessage(new c(1, aVar));
    }

    public void releaseKernel() {
        t7b.INSTANCE.b(this.TAG, "releaseKernel");
        sendMessage(new c(7));
        Thread thread = this.mPool;
        if (thread != null) {
            thread.interrupt();
            this.mPool = null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
    }

    public void sendMessage(c cVar) {
        this.mQueue.offer(cVar);
    }

    public void set(String str) {
        sendMessage(new c(19, str));
    }

    public void startKernel(com.heytap.speech.engine.breenovad.closure.c.a aVar) {
        t7b.INSTANCE.b(this.TAG, "startKernel");
        sendMessage(new c(2, aVar));
    }

    public void stopKernel() {
        t7b.INSTANCE.b(this.TAG, "stopKernel");
        sendMessage(new c(3));
    }

    public void update(String str) {
        t7b.INSTANCE.b(this.TAG, "updateKernel");
        sendMessage(new c(21, str));
    }

    public void updateVocab(String str) {
        t7b.INSTANCE.b(this.TAG, "updateVocab");
        sendMessage(new c(22, str));
    }

    public c waitMessage() throws InterruptedException {
        return this.mQueue.take();
    }
}

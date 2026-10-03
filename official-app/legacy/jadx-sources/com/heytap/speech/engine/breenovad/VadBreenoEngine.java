package com.heytap.speech.engine.breenovad;

import com.oplus.aiunit.vision.t7b;

/* JADX INFO: loaded from: classes2.dex */
public class VadBreenoEngine {
    private static final String TAG = "breeno_vad";
    private static long sHandle;
    public boolean mIsStarted = false;

    public interface VadCallback {
        void logPrint(int i, String str);

        void run(int i, byte[] bArr, int i2);
    }

    static {
        System.loadLibrary(TAG);
        sHandle = 0L;
    }

    private VadBreenoEngine(long j2) {
        sHandle = j2;
    }

    public static VadBreenoEngine createVadEngine(String str, int i, VadCallback vadCallback) {
        long jVadInit = vadInit(str, i, vadCallback);
        if (jVadInit != -1) {
            return new VadBreenoEngine(jVadInit);
        }
        sHandle = 0L;
        t7b.INSTANCE.b(TAG, "createVadEngine fail");
        return null;
    }

    private static native int vadFeed(long j2, byte[] bArr, int i);

    private static native long vadInit(String str, int i, VadCallback vadCallback);

    private static native int vadRelease(long j2);

    private static native int vadStart(long j2, String str);

    private static native int vadStop(long j2);

    public void feed(byte[] bArr, int i) {
        t7b t7bVar;
        String str;
        long j2 = sHandle;
        if (j2 == 0) {
            t7bVar = t7b.INSTANCE;
            str = "engine 0 feed return";
        } else if (this.mIsStarted) {
            vadFeed(j2, bArr, i);
            return;
        } else {
            t7bVar = t7b.INSTANCE;
            str = "start false feed return";
        }
        t7bVar.b(TAG, str);
    }

    public void release() {
        long j2 = sHandle;
        if (j2 == 0) {
            t7b.INSTANCE.b(TAG, "release return");
            return;
        }
        vadRelease(j2);
        this.mIsStarted = false;
        sHandle = 0L;
    }

    public int start(String str) {
        long j2 = sHandle;
        if (j2 == 0) {
            t7b.INSTANCE.b(TAG, "start return");
            return -1;
        }
        int iVadStart = vadStart(j2, str);
        this.mIsStarted = iVadStart == 0;
        return iVadStart;
    }

    public void stop() {
        long j2 = sHandle;
        if (j2 == 0) {
            t7b.INSTANCE.b(TAG, "stop return");
        } else {
            vadStop(j2);
            this.mIsStarted = false;
        }
    }
}

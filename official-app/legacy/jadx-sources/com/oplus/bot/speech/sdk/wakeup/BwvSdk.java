package com.oplus.bot.speech.sdk.wakeup;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.Keep;
import com.oplus.bot.speech.sdk.wakeup.BwvSdk;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class BwvSdk {
    public static final int INITED = 2;
    public static final int INIT_ERR = 4;
    public static final int RUNNING = 3;
    public static final int UNAUTHED = 0;
    public static final int UNINITED = 1;
    public static final int VP_DRIVE_TEST = 5;
    public static final int VP_DRIVE_TEST_AEC = 6;
    public static final int VP_NONE = 0;
    public static final int VP_REGISTER = 1;
    public static final int VP_STREAM_TEST = 8;
    public static final int VP_STREAM_TEST_AEC = 9;
    public static final int VP_TEST = 3;
    public static final int VP_TEST_AEC = 4;
    public static final int VP_UNREGISTER = 7;
    public static final int VP_UPDATE = 2;
    public static final int WU_STREAM_TEST = 10;
    public static final int WU_STREAM_TEST_AEC = 11;
    public static final int WU_TEST = 12;
    public static final int WU_TEST_AEC = 13;
    public static final int WU_TWO_STAGE_STREAM_TEST = 14;
    public static final int WU_TWO_STAGE_STREAM_TEST_AEC = 15;
    private static final ExecutorService mWorker = Executors.newSingleThreadExecutor();
    private static volatile long nInstance;
    private static volatile BwvSdk sInstance;
    private final Handler mMainHandler;
    private volatile BwvSdkListener mCallback = null;
    private final BwvSdkListener mMainThreadCallBack = new AnonymousClass1();

    /* JADX INFO: renamed from: com.oplus.bot.speech.sdk.wakeup.BwvSdk$1, reason: invalid class name */
    public class AnonymousClass1 implements BwvSdkListener {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onError$2(String str) {
            BwvSdk.this.mCallback.onError(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onInit$0(String str) {
            BwvSdk.this.mCallback.onInit(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResult$1(String str) {
            BwvSdk.this.mCallback.onResult(str);
        }

        @Override // com.oplus.bot.speech.sdk.wakeup.BwvSdkListener
        public void onError(final String str) {
            if (BwvSdk.this.mCallback != null) {
                BwvSdk.this.mMainHandler.post(new Runnable() { // from class: com.oplus.bot.speech.sdk.wakeup.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.lambda$onError$2(str);
                    }
                });
            }
        }

        @Override // com.oplus.bot.speech.sdk.wakeup.BwvSdkListener
        public void onInit(final String str) {
            if (BwvSdk.this.mCallback != null) {
                BwvSdk.this.mMainHandler.post(new Runnable() { // from class: com.oplus.bot.speech.sdk.wakeup.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.lambda$onInit$0(str);
                    }
                });
            }
        }

        @Override // com.oplus.bot.speech.sdk.wakeup.BwvSdkListener
        public void onResult(final String str) {
            if (BwvSdk.this.mCallback != null) {
                BwvSdk.this.mMainHandler.post(new Runnable() { // from class: com.oplus.bot.speech.sdk.wakeup.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.lambda$onResult$1(str);
                    }
                });
            }
        }
    }

    static {
        System.loadLibrary("bwvsdkjni");
    }

    private BwvSdk(Context context) {
        this.mMainHandler = new Handler(context.getMainLooper());
        nInstance = nGetInstance();
    }

    private static int getFutureInteger(Future<Integer> future) {
        try {
            return future.get().intValue();
        } catch (InterruptedException | ExecutionException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public static synchronized BwvSdk getInstance(Context context) {
        if (sInstance == null) {
            synchronized (BwvSdk.class) {
                if (sInstance == null) {
                    sInstance = new BwvSdk(context);
                }
            }
        }
        Log.d("BwvSDK", "getInstance: " + nInstance);
        return sInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$bindCpu$16(int i, int i2) {
        nBindCpu(nInstance, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$feedData$17(byte[] bArr, int i) {
        nFeedData(nInstance, bArr, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$getStatus$2() throws Exception {
        return Integer.valueOf(nInstanceStatus(nInstance));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$getVprintMode$3() throws Exception {
        return Integer.valueOf(nVprintMode(nInstance));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(String str) {
        nSetListener(nInstance, this.mMainThreadCallBack);
        nInitInstance(nInstance, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$queryModel$4() throws Exception {
        return Integer.valueOf(nQueryModel(nInstance));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$releaseInstance$0() throws Exception {
        nReleaseInstance(nInstance);
        nInstance = 0L;
        sInstance = null;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$setVprintCompareSpeakerMode$9() throws Exception {
        return Integer.valueOf(nSetVprintCompareSpeakerMode(nInstance));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$setVprintRegisterMode$6(int i, HyperParams hyperParams) throws Exception {
        return Integer.valueOf(nSetVprintRegisterMode(nInstance, i, hyperParams));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$setVprintRegisterVpmMode$8(String str, int i) throws Exception {
        return Integer.valueOf(nSetVprintRegisterVpmMode(nInstance, str, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$setVprintStreamTestMode$11(HyperParams hyperParams) throws Exception {
        return Integer.valueOf(nSetVprintStreamTestMode(nInstance, hyperParams));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$setVprintTestMode$10(HyperParams hyperParams) throws Exception {
        return Integer.valueOf(nSetVprintTestMode(nInstance, hyperParams));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$setVprintUnregisterMode$15() throws Exception {
        return Integer.valueOf(nSetVprintUnregisterMode(nInstance));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$setVprintUpdateMode$7(HyperParams hyperParams) throws Exception {
        return Integer.valueOf(nSetVprintUpdateMode(nInstance, hyperParams));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$setWakeupStreamTestMode$13(HyperParams hyperParams) throws Exception {
        return Integer.valueOf(nSetWakeupStreamTestMode(nInstance, hyperParams));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$setWakeupTestMode$12(HyperParams hyperParams) throws Exception {
        return Integer.valueOf(nSetWakeupTestMode(nInstance, hyperParams));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$setWakeupTwoStageStreamTestMode$14(HyperParams hyperParams) throws Exception {
        return Integer.valueOf(nSetWakeupTwoStageStreamTestMode(nInstance, hyperParams));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$stopFeed$18() {
        nStopFeed(nInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$stopInstance$5() throws Exception {
        return Integer.valueOf(nStopInstance(nInstance));
    }

    private static native int nBindCpu(long j2, int i, int i2);

    private static native int nFeedData(long j2, byte[] bArr, int i);

    private static native long nGetInstance();

    private static native int nInitInstance(long j2, String str);

    private static native int nInstanceStatus(long j2);

    private static native int nQueryModel(long j2);

    private static native void nReleaseInstance(long j2);

    private static native int nSetEngineParams(long j2, EngineParams engineParams);

    private static native void nSetListener(long j2, BwvSdkListener bwvSdkListener);

    private static native int nSetVprintCompareSpeakerMode(long j2);

    private static native int nSetVprintRegisterMode(long j2, int i, HyperParams hyperParams);

    private static native int nSetVprintRegisterVpmMode(long j2, String str, int i);

    private static native int nSetVprintStreamTestMode(long j2, HyperParams hyperParams);

    private static native int nSetVprintTestMode(long j2, HyperParams hyperParams);

    private static native int nSetVprintUnregisterMode(long j2);

    private static native int nSetVprintUpdateMode(long j2, HyperParams hyperParams);

    private static native int nSetWakeupStreamTestMode(long j2, HyperParams hyperParams);

    private static native int nSetWakeupTestMode(long j2, HyperParams hyperParams);

    private static native int nSetWakeupTwoStageStreamTestMode(long j2, HyperParams hyperParams);

    private static native int nStopFeed(long j2);

    private static native int nStopInstance(long j2);

    private static native String nVersion(long j2);

    private static native int nVprintMode(long j2);

    public static synchronized void releaseInstance() {
        if (sInstance != null) {
            getFutureInteger(mWorker.submit(new Callable() { // from class: com.oplus.aiunit.vision.uc2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return BwvSdk.lambda$releaseInstance$0();
                }
            }));
        }
    }

    public synchronized int SetEngineParams(EngineParams engineParams) {
        return nSetEngineParams(nInstance, engineParams);
    }

    public synchronized int bindCpu(final int i, final int i2) {
        mWorker.execute(new Runnable() { // from class: com.oplus.aiunit.vision.gc2
            @Override // java.lang.Runnable
            public final void run() {
                BwvSdk.lambda$bindCpu$16(i, i2);
            }
        });
        return 0;
    }

    public synchronized int feedData(byte[] bArr, final int i) {
        final byte[] bArr2 = (byte[]) bArr.clone();
        mWorker.execute(new Runnable() { // from class: com.oplus.aiunit.vision.tc2
            @Override // java.lang.Runnable
            public final void run() {
                BwvSdk.lambda$feedData$17(bArr2, i);
            }
        });
        return 0;
    }

    public synchronized int getStatus() {
        return getFutureInteger(mWorker.submit(new Callable() { // from class: com.oplus.aiunit.vision.fc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BwvSdk.lambda$getStatus$2();
            }
        }));
    }

    public synchronized String getVersion() {
        return nVersion(nInstance);
    }

    public synchronized int getVprintMode() {
        return getFutureInteger(mWorker.submit(new Callable() { // from class: com.oplus.aiunit.vision.dc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BwvSdk.lambda$getVprintMode$3();
            }
        }));
    }

    public synchronized int init(final String str, BwvSdkListener bwvSdkListener) {
        this.mCallback = bwvSdkListener;
        mWorker.execute(new Runnable() { // from class: com.oplus.aiunit.vision.lc2
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$init$1(str);
            }
        });
        return 0;
    }

    public synchronized int queryModel() {
        return getFutureInteger(mWorker.submit(new Callable() { // from class: com.oplus.aiunit.vision.oc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BwvSdk.lambda$queryModel$4();
            }
        }));
    }

    public synchronized int setVprintCompareSpeakerMode(BwvSdkListener bwvSdkListener) {
        if (getStatus() == 3) {
            stopInstance();
        }
        this.mCallback = bwvSdkListener;
        return getFutureInteger(mWorker.submit(new Callable() { // from class: com.oplus.aiunit.vision.hc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BwvSdk.lambda$setVprintCompareSpeakerMode$9();
            }
        }));
    }

    public synchronized int setVprintRegisterMode(BwvSdkListener bwvSdkListener, final int i, final HyperParams hyperParams) {
        if (getStatus() == 3) {
            stopInstance();
        }
        this.mCallback = bwvSdkListener;
        return getFutureInteger(mWorker.submit(new Callable() { // from class: com.oplus.aiunit.vision.cc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BwvSdk.lambda$setVprintRegisterMode$6(i, hyperParams);
            }
        }));
    }

    public synchronized int setVprintRegisterVpmMode(BwvSdkListener bwvSdkListener, final String str, final int i) {
        if (getStatus() == 3) {
            stopInstance();
        }
        this.mCallback = bwvSdkListener;
        return getFutureInteger(mWorker.submit(new Callable() { // from class: com.oplus.aiunit.vision.qc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BwvSdk.lambda$setVprintRegisterVpmMode$8(str, i);
            }
        }));
    }

    public synchronized int setVprintStreamTestMode(BwvSdkListener bwvSdkListener, final HyperParams hyperParams) {
        if (getStatus() == 3) {
            stopInstance();
        }
        this.mCallback = bwvSdkListener;
        return getFutureInteger(mWorker.submit(new Callable() { // from class: com.oplus.aiunit.vision.rc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BwvSdk.lambda$setVprintStreamTestMode$11(hyperParams);
            }
        }));
    }

    public synchronized int setVprintTestMode(BwvSdkListener bwvSdkListener, final HyperParams hyperParams) {
        if (getStatus() == 3) {
            stopInstance();
        }
        this.mCallback = bwvSdkListener;
        return getFutureInteger(mWorker.submit(new Callable() { // from class: com.oplus.aiunit.vision.kc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BwvSdk.lambda$setVprintTestMode$10(hyperParams);
            }
        }));
    }

    public synchronized int setVprintUnregisterMode(BwvSdkListener bwvSdkListener) {
        if (getStatus() == 3) {
            stopInstance();
        }
        this.mCallback = bwvSdkListener;
        return getFutureInteger(mWorker.submit(new Callable() { // from class: com.oplus.aiunit.vision.mc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BwvSdk.lambda$setVprintUnregisterMode$15();
            }
        }));
    }

    public synchronized int setVprintUpdateMode(BwvSdkListener bwvSdkListener, final HyperParams hyperParams) {
        if (getStatus() == 3) {
            stopInstance();
        }
        this.mCallback = bwvSdkListener;
        return getFutureInteger(mWorker.submit(new Callable() { // from class: com.oplus.aiunit.vision.jc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BwvSdk.lambda$setVprintUpdateMode$7(hyperParams);
            }
        }));
    }

    public synchronized int setWakeupStreamTestMode(BwvSdkListener bwvSdkListener, final HyperParams hyperParams) {
        if (getStatus() == 3) {
            stopInstance();
        }
        this.mCallback = bwvSdkListener;
        return getFutureInteger(mWorker.submit(new Callable() { // from class: com.oplus.aiunit.vision.pc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BwvSdk.lambda$setWakeupStreamTestMode$13(hyperParams);
            }
        }));
    }

    public synchronized int setWakeupTestMode(BwvSdkListener bwvSdkListener, final HyperParams hyperParams) {
        if (getStatus() == 3) {
            stopInstance();
        }
        this.mCallback = bwvSdkListener;
        return getFutureInteger(mWorker.submit(new Callable() { // from class: com.oplus.aiunit.vision.ec2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BwvSdk.lambda$setWakeupTestMode$12(hyperParams);
            }
        }));
    }

    public synchronized int setWakeupTwoStageStreamTestMode(BwvSdkListener bwvSdkListener, final HyperParams hyperParams) {
        if (getStatus() == 3) {
            stopInstance();
        }
        this.mCallback = bwvSdkListener;
        return getFutureInteger(mWorker.submit(new Callable() { // from class: com.oplus.aiunit.vision.sc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BwvSdk.lambda$setWakeupTwoStageStreamTestMode$14(hyperParams);
            }
        }));
    }

    public synchronized int stopFeed() {
        mWorker.execute(new Runnable() { // from class: com.oplus.aiunit.vision.ic2
            @Override // java.lang.Runnable
            public final void run() {
                BwvSdk.lambda$stopFeed$18();
            }
        });
        return 0;
    }

    public synchronized int stopInstance() {
        return getFutureInteger(mWorker.submit(new Callable() { // from class: com.oplus.aiunit.vision.nc2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return BwvSdk.lambda$stopInstance$5();
            }
        }));
    }

    public static class EngineParams {
        public boolean enableKpsDetect;
        public boolean enableVprintVerfication;
        public int numMicphones;

        public EngineParams() {
            this.enableKpsDetect = true;
            this.enableVprintVerfication = true;
            this.numMicphones = 1;
        }

        public EngineParams(boolean z, boolean z2, int i) {
            this.enableKpsDetect = z;
            this.enableVprintVerfication = z2;
            this.numMicphones = i;
        }
    }

    public static class HyperParams {
        public int bits;
        public boolean driveMode;
        public boolean enableAec;
        public int micphones;
        public int sampleRate;
        public int speakers;
        public String user;
        public int vprintType;

        public HyperParams() {
            this.vprintType = 0;
            this.enableAec = false;
            this.driveMode = false;
            this.user = "";
            this.micphones = 2;
            this.speakers = 2;
            this.bits = 16;
            this.sampleRate = 16000;
        }

        public HyperParams(int i, boolean z, boolean z2, String str, int i2, int i3, int i4, int i5) {
            this.vprintType = i;
            this.enableAec = z;
            this.driveMode = z2;
            this.user = str;
            this.micphones = i2;
            this.speakers = i3;
            this.bits = i4;
            this.sampleRate = i5;
        }
    }
}

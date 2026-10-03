package com.oplus.bot.speech.sdk.frontend;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class BwvFeSdk {
    static {
        System.loadLibrary("bwvsdkjni");
    }

    private static native long nAgcInit(String str);

    private static native byte[] nAgcProcess(long j2, byte[] bArr, int i, boolean z);

    private static native void nAgcRelease(long j2);

    private static native void nAgcReset(long j2);

    private static native double nComputeTotalAmplitude(byte[] bArr, int i);

    private static native long nNNAecInit(String str);

    private static native byte[] nNNAecProcess(long j2, byte[] bArr, int i, boolean z);

    private static native void nNNAecRelease(long j2);

    private static native void nNNAecReset(long j2);

    private static native long nRemixInit(String str);

    private static native byte[] nRemixProcess(long j2, byte[] bArr, int i, boolean z);

    private static native void nRemixRelease(long j2);

    private static native void nRemixReset(long j2);

    private static native byte[] nSoftAecGet(long j2, int i);

    private static native long nSoftAecInit(String str);

    private static native int nSoftAecPut(long j2, byte[] bArr, int i, boolean z);

    private static native int nSoftAecReady(long j2);

    private static native void nSoftAecRelease(long j2);

    private static native void nSoftAecReset(long j2);

    public synchronized byte[] FeSoftAecGet(long j2, int i) {
        return nSoftAecGet(j2, i);
    }

    public synchronized int FeSoftAecPut(long j2, byte[] bArr, int i, boolean z) {
        return nSoftAecPut(j2, bArr, i, z);
    }

    public synchronized int FeSoftAecReady(long j2) {
        return nSoftAecReady(j2);
    }

    public synchronized void FeSoftAecRelease(long j2) {
        nSoftAecRelease(j2);
    }

    public synchronized void FeSoftAecReset(long j2) {
        nSoftAecReset(j2);
    }

    public synchronized long feAgcInit(String str) {
        return nAgcInit(str);
    }

    public synchronized byte[] feAgcProcess(long j2, byte[] bArr, int i, boolean z) {
        return nAgcProcess(j2, (byte[]) bArr.clone(), i, z);
    }

    public synchronized void feAgcRelease(long j2) {
        nAgcRelease(j2);
    }

    public synchronized void feAgcReset(long j2) {
        nAgcReset(j2);
    }

    public synchronized double feComputeTotalAmplitude(byte[] bArr, int i) {
        return nComputeTotalAmplitude((byte[]) bArr.clone(), i);
    }

    public synchronized long feNNAecInit(String str) {
        return nNNAecInit(str);
    }

    public synchronized byte[] feNNAecProcess(long j2, byte[] bArr, int i, boolean z) {
        return nNNAecProcess(j2, (byte[]) bArr.clone(), i, z);
    }

    public synchronized void feNNAecRelease(long j2) {
        nNNAecRelease(j2);
    }

    public synchronized void feNNAecReset(long j2) {
        nNNAecReset(j2);
    }

    public synchronized long feRemixInit(String str) {
        return nRemixInit(str);
    }

    public synchronized byte[] feRemixProcess(long j2, byte[] bArr, int i, boolean z) {
        return nRemixProcess(j2, (byte[]) bArr.clone(), i, z);
    }

    public synchronized void feRemixRelease(long j2) {
        nRemixRelease(j2);
    }

    public synchronized void feRemixReset(long j2) {
        nRemixReset(j2);
    }

    public synchronized long feSoftAecInit(String str) {
        return nSoftAecInit(str);
    }
}

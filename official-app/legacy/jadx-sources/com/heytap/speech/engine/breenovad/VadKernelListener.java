package com.heytap.speech.engine.breenovad;

/* JADX INFO: loaded from: classes2.dex */
public interface VadKernelListener extends BaseListener {
    void logPrint(int i, String str);

    void onBufferReceived(byte[] bArr, int i);

    void onRmsChanged(float f);

    void onVadEnd();

    void onVadStart();

    void onVadTimeOut();
}

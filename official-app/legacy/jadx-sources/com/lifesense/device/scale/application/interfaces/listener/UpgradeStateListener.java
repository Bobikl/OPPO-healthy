package com.lifesense.device.scale.application.interfaces.listener;

/* JADX INFO: loaded from: classes4.dex */
public interface UpgradeStateListener {
    void onFinish(boolean z, int i, String str);

    void onProgress(int i);

    void onStart();
}

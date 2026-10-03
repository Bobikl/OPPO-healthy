package com.oplus.onet.onboarding;

import android.util.Log;
import com.oplus.onet.obcommon.IServerCallback;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends IServerCallback.Stub {

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final /* synthetic */ WifiClient.b f151do;

    public b(WifiClient.b bVar) {
        this.f151do = bVar;
    }

    @Override // com.oplus.onet.obcommon.IServerCallback
    public final void onServerInitialized(int i, byte[] bArr) {
        if (i == 2) {
            Log.d(WifiClient.h, "onServerResult");
            if (WifiClient.this.d != null) {
                WifiClient.this.d.onSuccess();
            }
        }
    }
}

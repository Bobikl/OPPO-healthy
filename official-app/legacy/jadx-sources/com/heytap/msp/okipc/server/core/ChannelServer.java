package com.heytap.msp.okipc.server.core;

import android.os.Bundle;
import com.heytap.msp.okipc.aidl.IChannel;
import com.heytap.msp.okipc.server.a;

/* JADX INFO: loaded from: classes19.dex */
public class ChannelServer extends IChannel.Stub {
    @Override // com.heytap.msp.okipc.aidl.IChannel
    public void call(Bundle bundle) {
        if (bundle != null) {
            a.e(bundle);
        }
    }
}

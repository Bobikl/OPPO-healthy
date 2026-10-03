package com.opos.process.bridge.provider;

import android.content.Context;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;

/* JADX INFO: loaded from: classes9.dex */
public interface IBridgeHandler {

    public interface Factory {
        IBridgeHandler getInstance(Context context, IBridgeTargetIdentify iBridgeTargetIdentify);
    }
}

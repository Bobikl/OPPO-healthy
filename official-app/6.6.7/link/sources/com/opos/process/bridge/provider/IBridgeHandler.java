package com.opos.process.bridge.provider;

import android.content.Context;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface IBridgeHandler {

    public interface Factory {
        IBridgeHandler getInstance(Context context, IBridgeTargetIdentify iBridgeTargetIdentify);
    }
}

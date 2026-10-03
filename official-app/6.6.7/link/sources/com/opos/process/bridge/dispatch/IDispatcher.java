package com.opos.process.bridge.dispatch;

import android.content.Context;
import android.os.Bundle;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public interface IDispatcher {
    Bundle dispatch(Context context, String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object[] objArr);
}

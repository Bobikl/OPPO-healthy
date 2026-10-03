package com.opos.process.bridge.dispatch;

import android.content.Context;
import android.os.Bundle;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;

/* JADX INFO: loaded from: classes9.dex */
public interface IDispatcher {
    Bundle dispatch(Context context, String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object[] objArr);
}

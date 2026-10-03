package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.xingin.xhssharesdk.XhsSdkInject;
import com.xingin.xhssharesdk.core.XhsShareSdk;

/* JADX INFO: loaded from: classes10.dex */
public final class rzm implements xum.a {
    public final String a() {
        String uid;
        if (TextUtils.isEmpty(XhsShareSdk.b)) {
            if (TextUtils.isEmpty(XhsSdkInject.getUid())) {
                uid = "" + System.currentTimeMillis();
            } else {
                uid = XhsSdkInject.getUid();
            }
            XhsShareSdk.b = uid;
        }
        return XhsShareSdk.b;
    }
}

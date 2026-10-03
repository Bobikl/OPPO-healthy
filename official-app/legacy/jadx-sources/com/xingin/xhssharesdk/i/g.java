package com.xingin.xhssharesdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.oplus.aiunit.vision.omm;
import com.oplus.aiunit.vision.wim;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import com.xingin.xhssharesdk.core.XhsShareSdk;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends BroadcastReceiver {
    public final omm a;

    public g(omm ommVar) {
        this.a = ommVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if (intent == null || !TextUtils.equals(intent.getAction(), "com.xingin.xhs.action.VOLLEY_SHARE_RESULT")) {
            return;
        }
        wim wimVar = new wim(intent.getBooleanExtra("success", false), intent.getIntExtra("error_code", 1), intent.getStringExtra("error_message"), intent.getStringExtra("session_id"));
        XhsShareSdk.b("XhsShare_XhsShareResultReceiver", "Receive the share result, the result is " + wimVar);
        omm ommVar = this.a;
        if (ommVar != null) {
            ommVar.a(wimVar);
        }
    }
}

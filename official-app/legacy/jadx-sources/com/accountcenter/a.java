package com.accountcenter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.platform.sdk.center.deprecated.AcStatisticsHelper;
import com.platform.sdk.center.pay.PayTaskCallback;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends BroadcastReceiver {
    public final /* synthetic */ PayTaskCallback a;

    public a(PayTaskCallback payTaskCallback) {
        this.a = payTaskCallback;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        JSONObject jSONObject;
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        try {
            stringExtra = intent.getStringExtra(AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE);
        } catch (Exception e2) {
            UCLogUtil.e("VipAgentWrapper", e2);
            stringExtra = "";
        }
        new AcStatisticsHelper.StatBuilder().logTag("106").eventId("payResultCallback").putInfo(AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, stringExtra).statistics();
        if (TextUtils.isEmpty(stringExtra)) {
            this.a.onPayTaskReusult(false, null, null);
            return;
        }
        try {
            jSONObject = new JSONObject(stringExtra);
        } catch (JSONException e3) {
            UCLogUtil.e("VipAgentWrapper", e3);
            jSONObject = null;
        }
        this.a.onPayTaskReusult(true, jSONObject, null);
        try {
            context.unregisterReceiver(this);
            UCLogUtil.i("VipAgentWrapper", "unregisterReceiver");
        } catch (Exception e4) {
            UCLogUtil.e("VipAgentWrapper", e4);
        }
    }
}

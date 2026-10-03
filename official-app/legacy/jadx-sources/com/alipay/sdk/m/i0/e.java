package com.alipay.sdk.m.i0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.fam;
import com.oplus.aiunit.vision.fvm;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends BroadcastReceiver {
    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        fam famVar;
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if (context == null || intent == null) {
            return;
        }
        boolean zContains = false;
        int intExtra = intent.getIntExtra("openIdNotifyFlag", 0);
        fvm.e("shouldUpdateId, notifyFlag : ".concat(String.valueOf(intExtra)));
        if (intExtra == 1) {
            if (TextUtils.equals(intent.getStringExtra("openIdPackage"), context.getPackageName())) {
                zContains = true;
            }
        } else if (intExtra == 2) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("openIdPackageList");
            if (stringArrayListExtra != null) {
                zContains = stringArrayListExtra.contains(context.getPackageName());
            }
        } else if (intExtra == 0) {
            zContains = true;
        }
        if (zContains) {
            String stringExtra = intent.getStringExtra("openIdType");
            fvm fvmVarB = fvm.b();
            if ("oaid".equals(stringExtra)) {
                famVar = fvmVarB.b;
            } else if ("vaid".equals(stringExtra)) {
                famVar = fvmVarB.d;
            } else if ("aaid".equals(stringExtra)) {
                famVar = fvmVarB.f11524c;
            } else {
                famVar = HttpConst.UDID.equals(stringExtra) ? fvmVarB.a : null;
            }
            if (famVar == null) {
                return;
            }
            famVar.e();
        }
    }
}

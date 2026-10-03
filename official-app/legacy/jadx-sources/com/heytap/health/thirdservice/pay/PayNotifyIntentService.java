package com.heytap.health.thirdservice.pay;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.heytap.health.base.base.BaseIntentService;
import com.oplus.aiunit.vision.a7b;

/* JADX INFO: loaded from: classes18.dex */
public class PayNotifyIntentService extends BaseIntentService {
    public static final String BROADCAST_PAYINFO_CHANGED = "com.heytap.action.broadcast.PAYINFO_CHANGED";
    public static final String PAY_STATUS_INFO = "pay_status_info";
    public static final String TAG = "PayNotifyIntentService";
    public final Context i;

    public PayNotifyIntentService() {
        super(TAG);
        this.i = getBaseContext();
    }

    public static void b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) PayNotifyIntentService.class);
        intent.putExtra("bundle_type", 1);
        intent.putExtra("bundle_info", str);
        try {
            context.startService(intent);
        } catch (Exception e2) {
            a7b.b(TAG, "[sendPayResult] --> error=" + e2.getMessage());
        }
    }

    public final void a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("notifyPayStatus info:");
        sb.append(str);
        Intent intent = new Intent(BROADCAST_PAYINFO_CHANGED);
        intent.putExtra(PAY_STATUS_INFO, str);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    @Override // android.app.IntentService
    public void onHandleIntent(@Nullable Intent intent) {
        if (intent == null || intent.getIntExtra("bundle_type", 0) != 1) {
            return;
        }
        String stringExtra = intent.getStringExtra("bundle_info");
        StringBuilder sb = new StringBuilder();
        sb.append("[onHandleIntent] called with: info = ");
        sb.append(stringExtra);
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        a(this.i, stringExtra);
    }
}

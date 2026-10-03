package com.oplus.drs.core.reconciliation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.oplus.aiunit.vision.vv4;
import com.oplus.aiunit.vision.w56;
import com.oplus.aiunit.vision.z6b;
import com.oplus.drs.core.upload.upload.UploadPipelineV2;
import com.oplus.weatherservicesdk.data.Weather;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;

/* JADX INFO: loaded from: classes6.dex */
public class DebugHelperReceiver extends BroadcastReceiver {
    public static void f(Context context) {
        if (context == null) {
            z6b.u("ReconciliationDebugReceiver", "Cannot register ReconciliationDebugReceiver: context is null");
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.oplus.drs.DEBUG_TRIGGER_RECONCILIATION");
            intentFilter.addAction("com.oplus.drs.DEBUG_RECONCILIATION_STATS");
            intentFilter.addAction("com.oplus.drs.DEBUG_TRIGGER_UPLOAD");
            intentFilter.addAction("com.oplus.drs.DEBUG_TRIGGER_RT_UPLOAD");
            intentFilter.addAction("com.oplus.drs.DEBUG_TRIGGER_NR_UPLOAD");
            DebugHelperReceiver debugHelperReceiver = new DebugHelperReceiver();
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(debugHelperReceiver, intentFilter, 2);
            } else {
                context.registerReceiver(debugHelperReceiver, intentFilter);
            }
            z6b.q("ReconciliationDebugReceiver", "ReconciliationDebugReceiver registered successfully");
            z6b.q("ReconciliationDebugReceiver", "Available commands:");
            z6b.q("ReconciliationDebugReceiver", "  [Reconciliation]");
            z6b.q("ReconciliationDebugReceiver", "    - Trigger reconciliation: adb shell am broadcast -a com.oplus.drs.DEBUG_TRIGGER_RECONCILIATION");
            z6b.q("ReconciliationDebugReceiver", "    - Show stats: adb shell am broadcast -a com.oplus.drs.DEBUG_RECONCILIATION_STATS");
            z6b.q("ReconciliationDebugReceiver", "    - Show stats (filtered): adb shell am broadcast -a com.oplus.drs.DEBUG_RECONCILIATION_STATS --es appId <id>");
            z6b.q("ReconciliationDebugReceiver", "  [Event Upload]");
            z6b.q("ReconciliationDebugReceiver", "    - Trigger upload: adb shell am broadcast -a com.oplus.drs.DEBUG_TRIGGER_UPLOAD");
            z6b.q("ReconciliationDebugReceiver", "    - Trigger RT upload: adb shell am broadcast -a com.oplus.drs.DEBUG_TRIGGER_RT_UPLOAD");
            z6b.q("ReconciliationDebugReceiver", "    - Trigger NR upload: adb shell am broadcast -a com.oplus.drs.DEBUG_TRIGGER_NR_UPLOAD");
        } catch (Exception e2) {
            z6b.p("ReconciliationDebugReceiver", "Failed to register ReconciliationDebugReceiver", e2);
        }
    }

    public final void a(Context context, Intent intent) {
        z6b.q("ReconciliationDebugReceiver", "==============================================");
        z6b.q("ReconciliationDebugReceiver", "Reconciliation Statistics Report");
        z6b.q("ReconciliationDebugReceiver", "==============================================");
        try {
            String stringExtra = intent.getStringExtra("appId");
            if (stringExtra == null || stringExtra.isEmpty()) {
                z6b.q("ReconciliationDebugReceiver", "Showing stats for all apps");
            } else {
                z6b.q("ReconciliationDebugReceiver", "AppID filter: " + stringExtra);
            }
            for (String str : vv4.t(context).u(stringExtra).split(Weather.SEPARATOR)) {
                z6b.q("ReconciliationDebugReceiver", str);
            }
            z6b.q("ReconciliationDebugReceiver", "==============================================");
            z6b.q("ReconciliationDebugReceiver", "Tip: Use '--es appId <id>' to filter by specific app");
        } catch (Exception e2) {
            z6b.p("ReconciliationDebugReceiver", "Failed to get reconciliation statistics", e2);
        }
    }

    public final void b(Context context) {
        z6b.q("ReconciliationDebugReceiver", "==============================================");
        z6b.q("ReconciliationDebugReceiver", "Triggering NR (Non-Realtime) event upload...");
        z6b.q("ReconciliationDebugReceiver", "NOTE: This forces upload via non-realtime channel.");
        z6b.q("ReconciliationDebugReceiver", "==============================================");
        try {
            Context contextH = w56.h();
            if (contextH != null) {
                context = contextH;
            }
            UploadPipelineV2.getInstance(context).debugForceNonRealtimeUpload();
            z6b.q("ReconciliationDebugReceiver", "NR upload triggered successfully!");
            z6b.q("ReconciliationDebugReceiver", "Check logcat for detailed upload progress:");
            z6b.q("ReconciliationDebugReceiver", "  adb logcat | grep -i \"non-realtime\\|upload\"");
        } catch (Exception e2) {
            z6b.p("ReconciliationDebugReceiver", "Failed to trigger NR upload", e2);
        }
    }

    public final void c(Context context) {
        z6b.q("ReconciliationDebugReceiver", "==============================================");
        z6b.q("ReconciliationDebugReceiver", "Triggering Reconciliation data upload...");
        z6b.q("ReconciliationDebugReceiver", "NOTE: This bypasses the normal daily schedule.");
        z6b.q("ReconciliationDebugReceiver", "==============================================");
        try {
            vv4.t(context).W(context);
            z6b.q("ReconciliationDebugReceiver", "Reconciliation upload triggered successfully!");
            z6b.q("ReconciliationDebugReceiver", "Check logcat for detailed upload progress:");
            z6b.q("ReconciliationDebugReceiver", "  adb logcat | grep -i \"reconciliation\"");
        } catch (Exception e2) {
            z6b.p("ReconciliationDebugReceiver", "Failed to trigger reconciliation upload", e2);
        }
    }

    public final void d(Context context) {
        z6b.q("ReconciliationDebugReceiver", "==============================================");
        z6b.q("ReconciliationDebugReceiver", "Triggering RT (Realtime) event upload...");
        z6b.q("ReconciliationDebugReceiver", "NOTE: This forces upload via realtime channel.");
        z6b.q("ReconciliationDebugReceiver", "==============================================");
        try {
            Context contextH = w56.h();
            if (contextH != null) {
                context = contextH;
            }
            UploadPipelineV2.getInstance(context).debugForceRealtimeUpload();
            z6b.q("ReconciliationDebugReceiver", "RT upload triggered successfully!");
            z6b.q("ReconciliationDebugReceiver", "Check logcat for detailed upload progress:");
            z6b.q("ReconciliationDebugReceiver", "  adb logcat | grep -i \"realtime\\|upload\"");
        } catch (Exception e2) {
            z6b.p("ReconciliationDebugReceiver", "Failed to trigger RT upload", e2);
        }
    }

    public final void e(Context context) {
        z6b.q("ReconciliationDebugReceiver", "==============================================");
        z6b.q("ReconciliationDebugReceiver", "Triggering normal event upload (all channels)...");
        z6b.q("ReconciliationDebugReceiver", "==============================================");
        try {
            Context contextH = w56.h();
            if (contextH != null) {
                context = contextH;
            }
            UploadPipelineV2.getInstance(context).trigger();
            z6b.q("ReconciliationDebugReceiver", "Event upload triggered successfully!");
            z6b.q("ReconciliationDebugReceiver", "Check logcat for detailed upload progress:");
            z6b.q("ReconciliationDebugReceiver", "  adb logcat | grep -i upload");
        } catch (Exception e2) {
            z6b.p("ReconciliationDebugReceiver", "Failed to trigger event upload", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        byte b;
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if (context == null || intent == null || (action = intent.getAction()) == null) {
            return;
        }
        z6b.q("ReconciliationDebugReceiver", "Received broadcast: " + action);
        try {
            switch (action.hashCode()) {
                case -63622934:
                    if (!action.equals("com.oplus.drs.DEBUG_RECONCILIATION_STATS")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 385923982:
                    if (!action.equals("com.oplus.drs.DEBUG_TRIGGER_NR_UPLOAD")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 796396401:
                    if (!action.equals("com.oplus.drs.DEBUG_TRIGGER_RECONCILIATION")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 936694096:
                    if (!action.equals("com.oplus.drs.DEBUG_TRIGGER_RT_UPLOAD")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 1667810447:
                    if (!action.equals("com.oplus.drs.DEBUG_TRIGGER_UPLOAD")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                c(context);
                return;
            }
            if (b == 1) {
                a(context, intent);
                return;
            }
            if (b == 2) {
                e(context);
                return;
            }
            if (b == 3) {
                d(context);
                return;
            }
            if (b == 4) {
                b(context);
                return;
            }
            z6b.u("ReconciliationDebugReceiver", "Unknown action: " + action);
        } catch (Exception e2) {
            z6b.p("ReconciliationDebugReceiver", "Error handling broadcast: " + action, e2);
        }
    }
}

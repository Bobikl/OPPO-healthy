package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.heytap.health.R;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.home.RankService$RankPage;
import com.heytap.health.main.MainActivity;
import com.heytap.health.oobe.LaunchActivity;
import com.heytap.health.operation.operation.OperationWebViewActivity;
import com.heytap.health.operations.thirdbinding.ThirdBindingService;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
public class w1h {
    public static final String TAG = "ShortCutUtils";

    public static /* synthetic */ void c(Context context) {
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
        intent.setAction("android.intent.action.VIEW");
        ShortcutInfoCompat.Builder builderE = e(context, true, false, intent, intent);
        ShortcutInfoCompat.Builder builderJ = j(context, true, false, intent, intent);
        ShortcutInfoCompat.Builder builderL = l(context, true, false, intent, intent);
        ShortcutInfoCompat.Builder builderK = k(context, true, false, intent, intent);
        arrayList.add(builderE.build());
        arrayList.add(builderL.build());
        arrayList.add(builderJ.build());
        arrayList.add(builderK.build());
        ShortcutManagerCompat.setDynamicShortcuts(context.getApplicationContext(), arrayList);
    }

    public static ShortcutInfoCompat.Builder e(Context context, boolean z, boolean z2, Intent intent, Intent intent2) {
        ShortcutInfoCompat.Builder icon = new ShortcutInfoCompat.Builder(context, "RedPacketId").setShortLabel(context.getResources().getString(R.string.app_launcher_red_envelope)).setLongLabel(context.getResources().getString(R.string.app_launcher_red_envelope)).setIcon(IconCompat.createWithResource(context, R.drawable.ic_app_launcher_red_packet));
        Intent intent3 = new Intent("android.intent.action.VIEW");
        intent3.setComponent(new ComponentName(context.getPackageName(), OperationWebViewActivity.class.getName()));
        intent3.putExtra("jumpUrl", "HealthRedPacket/index.html#/");
        if (z2) {
            return z ? icon.setIntent(intent) : icon.setIntents(new Intent[]{intent, intent3});
        }
        return icon.setIntent(intent2);
    }

    public static void f() {
        a7b.f(TAG, "remove all DynamicShortcuts!");
        ShortcutManagerCompat.removeAllDynamicShortcuts(b78.a());
        try {
            ShortcutManagerCompat.removeLongLivedShortcuts(b78.a(), Arrays.asList("StartRunId", "SyncWxStepId", "RedPacketId", "StepRankId"));
        } catch (Exception e2) {
            a7b.b(TAG, "removeLongLivedShortcuts error: " + e2.getMessage());
        }
    }

    public static void g(final Context context) {
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.u1h
            @Override // java.lang.Runnable
            public final void run() {
                w1h.c(context);
            }
        });
    }

    public static void h(final Context context) {
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.v1h
            @Override // java.lang.Runnable
            public final void run() {
                w1h.i(context);
            }
        });
    }

    public static void i(Context context) {
        if (ShortcutManagerCompat.isRequestPinShortcutSupported(context.getApplicationContext()) && m3k.h()) {
            ArrayList arrayList = new ArrayList();
            boolean zI = m3k.i();
            boolean z = false;
            boolean z2 = m3k.h() || m3k.k();
            if (zI && z2) {
                z = true;
            }
            boolean zX = g3k.x();
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtra("fromShort", true);
            intent.setAction("android.intent.action.VIEW");
            Intent intent2 = new Intent(context, (Class<?>) LaunchActivity.class);
            intent2.setAction("android.intent.action.VIEW");
            ShortcutInfoCompat.Builder builderE = e(context, zX, z, intent, intent2);
            ShortcutInfoCompat.Builder builderJ = j(context, zX, z, intent, intent2);
            ShortcutInfoCompat.Builder builderL = l(context, zX, z, intent, intent2);
            ShortcutInfoCompat.Builder builderK = k(context, zX, z, intent, intent2);
            arrayList.add(builderE.build());
            arrayList.add(builderL.build());
            arrayList.add(builderJ.build());
            arrayList.add(builderK.build());
            ShortcutManagerCompat.setDynamicShortcuts(context.getApplicationContext(), arrayList);
        }
    }

    public static ShortcutInfoCompat.Builder j(Context context, boolean z, boolean z2, Intent intent, Intent intent2) {
        Intent intent3 = new Intent("android.intent.action.VIEW");
        intent3.setComponent(new ComponentName(context.getPackageName(), "com.heytap.health.main.MainActivity"));
        intent3.putExtra("tab", "2");
        intent3.putExtra(pfg.SUB_TAB, String.valueOf(0));
        ShortcutInfoCompat.Builder icon = new ShortcutInfoCompat.Builder(context, "StartRunId").setShortLabel(context.getResources().getString(R.string.app_launcher_start_run)).setLongLabel(context.getResources().getString(R.string.app_launcher_start_run)).setIcon(IconCompat.createWithResource(context, R.drawable.ic_app_launcher_start_run));
        if (!z2) {
            return icon.setIntent(intent2);
        }
        Intent intent4 = new Intent(context, (Class<?>) MainActivity.class);
        intent4.setAction("android.intent.action.VIEW");
        return icon.setIntents(new Intent[]{intent4, intent3});
    }

    public static ShortcutInfoCompat.Builder k(Context context, boolean z, boolean z2, Intent intent, Intent intent2) {
        Intent intent3 = new Intent("android.intent.action.VIEW");
        intent3.setComponent(new ComponentName(context.getPackageName(), ((RankService$RankPage) x0.d().b("/home/RankService").navigation()).K2()));
        ShortcutInfoCompat.Builder icon = new ShortcutInfoCompat.Builder(context, "StepRankId").setShortLabel(context.getResources().getString(R.string.app_launcher_step_rank)).setLongLabel(context.getResources().getString(R.string.app_launcher_step_rank)).setIcon(IconCompat.createWithResource(context, R.drawable.ic_app_launcher_step_rank));
        if (z2) {
            return z ? icon.setIntent(intent) : icon.setIntents(new Intent[]{intent, intent3});
        }
        return icon.setIntent(intent2);
    }

    public static ShortcutInfoCompat.Builder l(Context context, boolean z, boolean z2, Intent intent, Intent intent2) {
        Intent intent3 = new Intent("android.intent.action.VIEW");
        intent3.setComponent(new ComponentName(context.getPackageName(), ((ThirdBindingService) x0.d().b("/settings/third").navigation()).c1()));
        ShortcutInfoCompat.Builder icon = new ShortcutInfoCompat.Builder(context, "SyncWxStepId").setShortLabel(context.getResources().getString(R.string.app_launcher_sync_wx_step)).setLongLabel(context.getResources().getString(R.string.app_launcher_sync_wx_step)).setIcon(IconCompat.createWithResource(context, R.drawable.ic_app_launcher_sync_wx_step));
        if (z2) {
            return z ? icon.setIntent(intent) : icon.setIntents(new Intent[]{intent, intent3});
        }
        return icon.setIntent(intent2);
    }
}

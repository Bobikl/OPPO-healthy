package com.oplus.nearx.cloudconfig.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.oplus.aiunit.vision.bo9;
import com.oplus.aiunit.vision.d7b;
import com.oplus.aiunit.vision.eh5;
import com.oplus.aiunit.vision.gt5;
import com.oplus.aiunit.vision.v7b;
import com.oplus.nearx.cloudconfig.CloudConfigCtrl;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import io.protostuff.MapSchema;
import java.util.Map;
import java.util.WeakHashMap;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002R\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001d¨\u0006!"}, d2 = {"Lcom/oplus/nearx/cloudconfig/receiver/NetStateReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "", "networkType", "Lcom/oplus/aiunit/vision/gt5;", "dirConfig", "Lcom/oplus/nearx/cloudconfig/CloudConfigCtrl;", "cloudConfigCtrl", MapSchema.FIELD_NAME_ENTRY, "a", "Ljava/lang/String;", "TAG", "Landroid/content/IntentFilter;", "b", "Landroid/content/IntentFilter;", "intentFilter", "Ljava/util/WeakHashMap;", "c", "Ljava/util/WeakHashMap;", "weakHashMap", "d", "currNetworkType", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "checkRunnable", "<init>", "()V", "com.oplus.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public final class NetStateReceiver extends BroadcastReceiver {
    public static final NetStateReceiver INSTANCE = new NetStateReceiver();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final IntentFilter intentFilter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final WeakHashMap<CloudConfigCtrl, gt5> weakHashMap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static String currNetworkType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Runnable checkRunnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 16})
    public static final class a implements Runnable {
        public static final a INSTANCE = new a();

        @Override // java.lang.Runnable
        public final void run() {
            NetStateReceiver netStateReceiver = NetStateReceiver.INSTANCE;
            WeakHashMap weakHashMapD = NetStateReceiver.d(netStateReceiver);
            if (weakHashMapD == null || weakHashMapD.isEmpty()) {
                return;
            }
            for (Map.Entry entry : NetStateReceiver.d(netStateReceiver).entrySet()) {
                try {
                    CloudConfigCtrl cloudConfigCtrl = (CloudConfigCtrl) entry.getKey();
                    gt5 dirConfig = (gt5) entry.getValue();
                    d7b d7bVar = d7b.INSTANCE;
                    NetStateReceiver netStateReceiver2 = NetStateReceiver.INSTANCE;
                    d7b.b(d7bVar, NetStateReceiver.c(netStateReceiver2), "工作任务检查  " + cloudConfigCtrl.i() + "  ", null, new Object[0], 4, null);
                    String strB = NetStateReceiver.b(netStateReceiver2);
                    Intrinsics.checkExpressionValueIsNotNull(dirConfig, "dirConfig");
                    Intrinsics.checkExpressionValueIsNotNull(cloudConfigCtrl, "cloudConfigCtrl");
                    netStateReceiver2.e(strB, dirConfig, cloudConfigCtrl);
                } catch (Exception e2) {
                    d7b.b(d7b.INSTANCE, NetStateReceiver.c(NetStateReceiver.INSTANCE), "工作任务检查出现问题  " + e2.getMessage() + "  ", null, new Object[0], 4, null);
                }
            }
        }
    }

    static {
        String simpleName = NetStateReceiver.class.getSimpleName();
        Intrinsics.checkExpressionValueIsNotNull(simpleName, "NetStateReceiver::class.java.simpleName");
        TAG = simpleName;
        intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        weakHashMap = new WeakHashMap<>();
        currNetworkType = bo9.a();
        checkRunnable = a.INSTANCE;
    }

    private NetStateReceiver() {
    }

    public static final /* synthetic */ String b(NetStateReceiver netStateReceiver) {
        return currNetworkType;
    }

    public static final /* synthetic */ String c(NetStateReceiver netStateReceiver) {
        return TAG;
    }

    public static final /* synthetic */ WeakHashMap d(NetStateReceiver netStateReceiver) {
        return weakHashMap;
    }

    public final void e(String networkType, gt5 dirConfig, CloudConfigCtrl cloudConfigCtrl) {
        int networkChangeState = dirConfig.getNetworkChangeState();
        if (networkChangeState == -2) {
            cloudConfigCtrl.d();
            v7b.a(null, TAG, "配置项未下载....开始更新", null, null, 12, null);
            cloudConfigCtrl.a(true);
            return;
        }
        if (networkChangeState == 0) {
            if (!Intrinsics.areEqual(networkType, LanConstants.OPERATOR_UNKNOWN)) {
                cloudConfigCtrl.d();
                v7b.a(null, TAG, "配置项设置全网络状态下载.....切换[" + networkType + "]...开始更新", null, null, 12, null);
                cloudConfigCtrl.a(true);
                return;
            }
            return;
        }
        if (networkChangeState != 1) {
            cloudConfigCtrl.d();
            v7b.a(null, TAG, "当前网络更新类型：" + dirConfig.getNetworkChangeState(), null, null, 12, null);
            return;
        }
        if (Intrinsics.areEqual(networkType, "WIFI")) {
            cloudConfigCtrl.d();
            v7b.a(null, TAG, "配置项设置仅WIFI状态下载.....切换[" + networkType + "]...开始更新", null, null, 12, null);
            cloudConfigCtrl.a(true);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        String strB;
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        if (Intrinsics.areEqual("android.net.conn.CONNECTIVITY_CHANGE", intent != null ? intent.getAction() : null)) {
            if (context == null || (strB = eh5.INSTANCE.b(context)) == null) {
                strB = "";
            }
            d7b d7bVar = d7b.INSTANCE;
            String str = TAG;
            d7b.b(d7bVar, str, "   收到网络状态变化广播 ,  当前网络状态是 " + strB + "  上一次网络状态是 " + currNetworkType, null, new Object[0], 4, null);
            if (!Intrinsics.areEqual(currNetworkType, strB)) {
                currNetworkType = strB;
                d7b.b(d7bVar, str, "  10s后启动更新检查任务  ", null, new Object[0], 4, null);
                Handler handler = new Handler();
                Runnable runnable = checkRunnable;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 10000L);
            }
        }
    }
}

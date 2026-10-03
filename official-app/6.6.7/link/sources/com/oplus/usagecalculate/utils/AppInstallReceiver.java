package com.oplus.usagecalculate.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.oplus.aiunit.vision.zp2;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/usagecalculate/utils/AppInstallReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", TraceConstants.KEY_ACTION, "", "onReceive", "<init>", "()V", "Companion", "a", "usagecalculate_release"}, k = 1, mv = {1, 6, 0})
public final class AppInstallReceiver extends BroadcastReceiver {

    @NotNull
    public static final String DATA_SCHEME_PACKAGE = "package";

    @NotNull
    public static final String OPLUS_PACKAGE_ADDED = "oplus.intent.action.PACKAGE_ADDED";

    @NotNull
    public static final String OPLUS_PACKAGE_REMOVED = "oplus.intent.action.PACKAGE_REMOVED";

    @NotNull
    public static final String OPPO_PACKAGE_ADDED = "oppo.intent.action.PACKAGE_ADDED";

    @NotNull
    public static final String TAG = "AppInstallReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        Unit unitLaunch$default;
        PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
        Unit unit = null;
        if (intent != null) {
            String action = intent.getAction();
            Uri data = intent.getData();
            String schemeSpecificPart = data == null ? null : data.getSchemeSpecificPart();
            if (TextUtils.equals(action, OPLUS_PACKAGE_ADDED) || TextUtils.equals(action, "android.intent.action.PACKAGE_ADDED")) {
                zp2.a(TAG, Intrinsics.stringPlus("install pkgname = ", schemeSpecificPart));
                unitLaunch$default = BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new AppInstallReceiver$onReceive$1$1(schemeSpecificPart, context, null), 2, (Object) null);
            } else if (TextUtils.equals(action, OPLUS_PACKAGE_REMOVED) || TextUtils.equals(action, "android.intent.action.PACKAGE_REMOVED")) {
                zp2.a(TAG, Intrinsics.stringPlus("remove pkgname = ", schemeSpecificPart));
                unitLaunch$default = BuildersKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), (CoroutineStart) null, new AppInstallReceiver$onReceive$1$2(schemeSpecificPart, context, null), 2, (Object) null);
            } else {
                zp2.f(TAG, "action is error.");
                unitLaunch$default = Unit.INSTANCE;
            }
            unit = unitLaunch$default;
        }
        if (unit == null) {
            zp2.f(TAG, "intent is null, deal failed.");
        }
    }
}

package com.oplus.pay.opensdk.taskwall.util;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import com.oplus.aiunit.vision.dde;
import com.oplus.aiunit.vision.j5a;
import com.oplus.aiunit.vision.mn;
import com.oplus.aiunit.vision.p5h;
import com.oplus.aiunit.vision.pce;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pay.opensdk.taskwall.R$string;
import com.oplus.pay.opensdk.taskwall.util.ShortcutHelper;
import com.oplus.smartenginehelper.ParserTag;
import com.oplusos.sau.common.utils.SauAarConstants;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b%\u0010&J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004J:\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ:\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J<\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003J\u001a\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/oplus/pay/opensdk/taskwall/util/ShortcutHelper;", "", "Landroid/content/Context;", "context", "", "packageName", "", "j", "shortcutId", "l", "Landroid/app/Activity;", ParserTag.TAG_ACTIVITY, "iconUrl", "shortLabel", "Lcom/oplus/pay/opensdk/taskwall/util/ShortcutHelper$a;", "callback", "", "c", dde.TARGET_PACKAGE_NAME, "f", "i", "k", "d", "Landroid/content/BroadcastReceiver;", "receiver", "g", "Landroid/content/Intent;", "h", "m", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "shortcutCallbackTimeoutHandler", "Ljava/lang/Runnable;", "b", "Ljava/lang/Runnable;", "shortcutCallbackTimeoutRunnable", "<init>", "()V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nShortcutHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutHelper.kt\ncom/oplus/pay/opensdk/taskwall/util/ShortcutHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,388:1\n288#2,2:389\n*S KotlinDebug\n*F\n+ 1 ShortcutHelper.kt\ncom/oplus/pay/opensdk/taskwall/util/ShortcutHelper\n*L\n59#1:389,2\n*E\n"})
public final class ShortcutHelper {

    @NotNull
    public static final ShortcutHelper INSTANCE = new ShortcutHelper();

    @NotNull
    public static Handler a = new Handler(Looper.getMainLooper());

    @Nullable
    public static Runnable b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lcom/oplus/pay/opensdk/taskwall/util/ShortcutHelper$a;", "", "", "shortcutId", "", "onSuccess", "error", "onFailure", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void onFailure(@NotNull String error);

        void onSuccess(@NotNull String shortcutId);
    }

    public static final void e(Activity activity, ShortcutHelper$addShortcutModern$receiver$1 shortcutHelper$addShortcutModern$receiver$1) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(shortcutHelper$addShortcutModern$receiver$1, "$receiver");
        pce.b("ShortcutHelper BroadcastReceiver timeout - user probably cancelled");
        INSTANCE.g(activity, shortcutHelper$addShortcutModern$receiver$1);
    }

    public final void c(@NotNull Activity activity, @NotNull String iconUrl, @NotNull String packageName, @NotNull String shortcutId, @NotNull String shortLabel, @Nullable a callback) {
        Intrinsics.checkNotNullParameter(activity, ParserTag.TAG_ACTIVITY);
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(shortcutId, "shortcutId");
        Intrinsics.checkNotNullParameter(shortLabel, "shortLabel");
        if (!l(activity, shortcutId)) {
            f(activity, iconUrl, shortcutId, packageName, shortLabel, callback);
        } else if (callback != null) {
            callback.onFailure("快捷方式已存在");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.content.BroadcastReceiver, com.oplus.pay.opensdk.taskwall.util.ShortcutHelper$addShortcutModern$receiver$1] */
    @RequiresApi(26)
    public final void d(final Activity activity, final String shortcutId, String targetPackageName, final String shortLabel, String iconUrl, final a callback) {
        Object systemService = activity.getSystemService("shortcut");
        final ShortcutManager shortcutManager = systemService instanceof ShortcutManager ? (ShortcutManager) systemService : null;
        if (shortcutManager == null) {
            if (callback != null) {
                callback.onFailure("unable to get shortcutManager");
                return;
            }
            return;
        }
        final ?? r0 = new BroadcastReceiver() { // from class: com.oplus.pay.opensdk.taskwall.util.ShortcutHelper$addShortcutModern$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@NotNull Context context, @NotNull Intent intent) {
                PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
                pce.b("ShortcutHelper BroadcastReceiver onReceive start");
                ShortcutHelper.INSTANCE.g(activity, this);
                pce.b("ShortcutHelper BroadcastReceiver onReceive success " + intent.getIntExtra("android.intent.extra.shortcut.RESULT", 1));
                ShortcutHelper.a aVar = callback;
                if (aVar != null) {
                    aVar.onSuccess(shortcutId);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter("com.oplus.pay.taskwall.SHORTCUT_RESULT_" + shortcutId);
        if (Build.VERSION.SDK_INT >= 33) {
            activity.registerReceiver(r0, intentFilter, 2);
        } else {
            activity.registerReceiver(r0, intentFilter);
        }
        Runnable runnable = new Runnable() { // from class: com.oplus.aiunit.vision.q5h
            @Override // java.lang.Runnable
            public final void run() {
                ShortcutHelper.e(activity, r0);
            }
        };
        b = runnable;
        a.postDelayed(runnable, 10000L);
        Intent intent = new Intent("com.oplus.pay.taskwall.SHORTCUT_RESULT_" + shortcutId);
        int i = 67108864 | SauAarConstants.M;
        int iHashCode = shortcutId.hashCode();
        PushAutoTrackHelper.hookIntentGetBroadcast(activity, iHashCode, intent, i);
        final PendingIntent broadcast = PendingIntent.getBroadcast(activity, iHashCode, intent, i);
        PushAutoTrackHelper.hookPendingIntentGetBroadcast(broadcast, activity, iHashCode, intent, i);
        final Intent intentH = h(activity, targetPackageName);
        if (intentH != null) {
            j5a.INSTANCE.a(activity, iconUrl, new Function1<Bitmap, Unit>() { // from class: com.oplus.pay.opensdk.taskwall.util.ShortcutHelper$addShortcutModern$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Bitmap) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull Bitmap bitmap) {
                    Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                    try {
                        ShortcutInfo shortcutInfoBuild = new ShortcutInfo.Builder(activity, shortcutId).setShortLabel(shortLabel).setIcon(Icon.createWithBitmap(bitmap)).setIntent(intentH).build();
                        Intrinsics.checkNotNullExpressionValue(shortcutInfoBuild, "Builder(activity, shortc…                 .build()");
                        if (shortcutManager.requestPinShortcut(shortcutInfoBuild, broadcast.getIntentSender())) {
                            pce.b("ShortcutHelper requestPinShortcut success");
                        } else {
                            pce.c("ShortcutHelper requestPinShortcut failure");
                            ShortcutHelper.a aVar = callback;
                            if (aVar != null) {
                                aVar.onFailure("refuses to add shortcuts");
                            }
                        }
                    } catch (Exception e) {
                        ShortcutHelper.a aVar2 = callback;
                        if (aVar2 != null) {
                            aVar2.onFailure("创建快捷方式失败: " + e.getMessage());
                        }
                    }
                }
            }, new Function0<Unit>() { // from class: com.oplus.pay.opensdk.taskwall.util.ShortcutHelper$addShortcutModern$3$2
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    ShortcutHelper.a aVar = callback;
                    if (aVar != null) {
                        aVar.onFailure("Icon loading fail");
                    }
                }
            });
        } else if (callback != null) {
            callback.onFailure("create shortcutIntent fail:" + targetPackageName);
        }
    }

    public final void f(@NotNull Activity activity, @NotNull String iconUrl, @NotNull String shortcutId, @NotNull String targetPackageName, @NotNull String shortLabel, @Nullable a callback) {
        Intrinsics.checkNotNullParameter(activity, ParserTag.TAG_ACTIVITY);
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(shortcutId, "shortcutId");
        Intrinsics.checkNotNullParameter(targetPackageName, dde.TARGET_PACKAGE_NAME);
        Intrinsics.checkNotNullParameter(shortLabel, "shortLabel");
        if (m(activity)) {
            d(activity, shortcutId, targetPackageName, shortLabel, iconUrl, callback);
            return;
        }
        String string = activity.getString(R$string.opay_pay_sdk_not_support_device);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(R.str…y_sdk_not_support_device)");
        Toast.makeText(activity, string, 0).show();
        if (callback != null) {
            callback.onFailure(string);
        }
    }

    public final void g(Activity activity, BroadcastReceiver receiver) {
        if (receiver != null) {
            try {
                activity.unregisterReceiver(receiver);
            } catch (Exception e) {
                pce.c("ShortcutHelper Error unregistering receiver: " + e.getMessage());
            }
        }
        Runnable runnable = b;
        if (runnable != null) {
            a.removeCallbacks(runnable);
        }
    }

    public final Intent h(Context context, String targetPackageName) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(targetPackageName);
        if (launchIntentForPackage == null) {
            return null;
        }
        launchIntentForPackage.setFlags(335544320);
        return launchIntentForPackage;
    }

    @NotNull
    public final String i(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        return "shortId_" + packageName;
    }

    public final boolean j(@NotNull Context context, @NotNull String packageName) {
        Object next;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            List listD = mn.d(packageManager, intent, 0);
            Intrinsics.checkNotNullExpressionValue(listD, "packageManager.queryInte…vities(launcherIntent, 0)");
            Iterator it = listD.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((ResolveInfo) next).activityInfo.packageName, packageName));
            ResolveInfo resolveInfo = (ResolveInfo) next;
            if (resolveInfo == null) {
                return false;
            }
            if (!resolveInfo.activityInfo.enabled) {
                pce.b("ShortcutHelper Package " + packageName + " has LAUNCHER activity but it's disabled");
                return false;
            }
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "packageManager.getApplicationInfo(packageName, 0)");
            if (!applicationInfo.enabled) {
                pce.b("ShortcutHelper Package " + packageName + " application is disabled");
                return false;
            }
            if (k(packageName)) {
                pce.b("ShortcutHelper Package " + packageName + " is in OPPO hide icon config");
                return false;
            }
            if (packageManager.getLaunchIntentForPackage(packageName) == null) {
                pce.b("ShortcutHelper Package " + packageName + " cannot get launch intent");
                return false;
            }
            pce.b("ShortcutHelper Package " + packageName + " has desktop icon");
            return true;
        } catch (Exception e) {
            pce.c("ShortcutHelper Error checking desktop icon for " + packageName + ": " + e.getMessage());
            return false;
        }
    }

    public final boolean k(String packageName) {
        try {
            Class<?> cls = Class.forName("android.content.pm.OplusPackageManager");
            Object objNewInstance = cls.newInstance();
            Method declaredMethod = cls.getDeclaredMethod("inUninstallableAppConfig", Integer.TYPE, String.class);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "clazz.getDeclaredMethod(…:class.java\n            )");
            Object objInvoke = declaredMethod.invoke(objNewInstance, 4, packageName);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            boolean zBooleanValue = ((Boolean) objInvoke).booleanValue();
            pce.b("ShortcutHelper OPPO hide icon check for " + packageName + ": " + zBooleanValue);
            return zBooleanValue;
        } catch (Throwable th) {
            pce.b("ShortcutHelper OPPO hide icon check not available: " + th.getMessage());
            return false;
        }
    }

    public final boolean l(@NotNull Context context, @NotNull String shortcutId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(shortcutId, "shortcutId");
        return p5h.INSTANCE.b(context, shortcutId);
    }

    public final boolean m(Context context) {
        return p5h.INSTANCE.a(context);
    }
}

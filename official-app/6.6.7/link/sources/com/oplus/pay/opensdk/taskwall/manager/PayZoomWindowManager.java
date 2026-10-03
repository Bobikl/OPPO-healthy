package com.oplus.pay.opensdk.taskwall.manager;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.oplus.aiunit.vision.h94;
import com.oplus.aiunit.vision.l2a;
import com.oplus.aiunit.vision.p2m;
import com.oplus.aiunit.vision.pce;
import com.oplus.aiunit.vision.us9;
import com.oplus.os.OplusBuild;
import com.oplus.pay.opensdk.taskwall.manager.PayZoomWindowManager;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.zoomwindow.IOplusZoomWindowObserver;
import com.oplus.zoomwindow.OplusZoomWindowInfo;
import com.oplus.zoomwindow.OplusZoomWindowManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\b\u0007*\u0002\u0013\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\b\u0010\f\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/oplus/pay/opensdk/taskwall/manager/PayZoomWindowManager;", "", "", "f", "Lcom/oplus/zoomwindow/OplusZoomWindowInfo;", "d", "Landroidx/fragment/app/FragmentActivity;", ParserTag.TAG_ACTIVITY, "", "packageName", "", "g", "e", "Lcom/oplus/aiunit/vision/us9;", "fragment", "h", "a", "Lcom/oplus/aiunit/vision/us9;", "mFragment", "com/oplus/pay/opensdk/taskwall/manager/PayZoomWindowManager$a", "b", "Lcom/oplus/pay/opensdk/taskwall/manager/PayZoomWindowManager$a;", "defaultListener", "com/oplus/pay/opensdk/taskwall/manager/PayZoomWindowManager$zoomWindowObserver$1", "c", "Lcom/oplus/pay/opensdk/taskwall/manager/PayZoomWindowManager$zoomWindowObserver$1;", "zoomWindowObserver", "<init>", "()V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
public final class PayZoomWindowManager {

    @Nullable
    public static us9 a;

    @NotNull
    public static final PayZoomWindowManager INSTANCE = new PayZoomWindowManager();

    @NotNull
    public static final a b = new a();

    @NotNull
    public static final PayZoomWindowManager$zoomWindowObserver$1 c = new IOplusZoomWindowObserver.Stub() { // from class: com.oplus.pay.opensdk.taskwall.manager.PayZoomWindowManager$zoomWindowObserver$1
        public void onInputMethodChanged(boolean b2) {
            pce.b("PayZoomWindowManager onInputMethodChanged: " + b2);
        }

        public void onZoomWindowDied(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "s");
            pce.b("PayZoomWindowManager onZoomWindowDied: " + s);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x008f  */
        @RequiresApi(24)
        public void onZoomWindowHide(@NotNull OplusZoomWindowInfo oplusZoomWindowInfo) {
            FragmentActivity activity;
            Window window;
            FragmentActivity activity2;
            FragmentActivity activity3;
            Intrinsics.checkNotNullParameter(oplusZoomWindowInfo, "oplusZoomWindowInfo");
            pce.b("PayZoomWindowManager onZoomWindowHide: info = " + oplusZoomWindowInfo);
            Rect rect = oplusZoomWindowInfo.zoomRect;
            int iWidth = rect.width();
            int iHeight = rect.height();
            pce.b("PayZoomWindowManager zoom window: " + rect);
            boolean z = true;
            Boolean boolValueOf = null;
            if (Build.VERSION.SDK_INT >= 30) {
                us9 us9Var = PayZoomWindowManager.a;
                Object systemService = (us9Var == null || (activity3 = us9Var.getActivity()) == null) ? null : activity3.getSystemService("window");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                WindowMetrics windowMetricsA = h94.a((WindowManager) systemService);
                Intrinsics.checkNotNullExpressionValue(windowMetricsA, "windowManager.currentWindowMetrics");
                Rect rectA = p2m.a(windowMetricsA);
                Intrinsics.checkNotNullExpressionValue(rectA, "currentWindowMetrics.bounds");
                pce.b("PayZoomWindowManager current window: " + rectA);
                if (iWidth != rectA.width() && iHeight != rectA.height()) {
                    z = false;
                }
            } else {
                us9 us9Var2 = PayZoomWindowManager.a;
                View decorView = (us9Var2 == null || (activity = us9Var2.getActivity()) == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
                StringBuilder sb = new StringBuilder();
                sb.append("PayZoomWindowManager,current window: width = ");
                sb.append(decorView != null ? Integer.valueOf(decorView.getWidth()) : null);
                sb.append(", height = ");
                sb.append(decorView != null ? Integer.valueOf(decorView.getHeight()) : null);
                pce.b(sb.toString());
                if (!(decorView != null && iWidth == decorView.getWidth())) {
                    if (!(decorView != null && iHeight == decorView.getHeight())) {
                        z = false;
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PayZoomWindowManager,isFull = ");
            sb2.append(z);
            sb2.append(", isInMultiWindowMode = ");
            us9 us9Var3 = PayZoomWindowManager.a;
            if (us9Var3 != null && (activity2 = us9Var3.getActivity()) != null) {
                boolValueOf = Boolean.valueOf(activity2.isInMultiWindowMode());
            }
            sb2.append(boolValueOf);
            pce.b(sb2.toString());
            PayZoomWindowManager.a aVar = PayZoomWindowManager.b;
            String str = oplusZoomWindowInfo.zoomPkg;
            Intrinsics.checkNotNullExpressionValue(str, "oplusZoomWindowInfo.zoomPkg");
            aVar.c(str, z);
        }

        public void onZoomWindowShow(@NotNull OplusZoomWindowInfo oplusZoomWindowInfo) {
            Intrinsics.checkNotNullParameter(oplusZoomWindowInfo, "oplusZoomWindowInfo");
            pce.b("PayZoomWindowManager onZoomWindowShow: info = " + oplusZoomWindowInfo);
            PayZoomWindowManager.a aVar = PayZoomWindowManager.b;
            String str = oplusZoomWindowInfo.zoomPkg;
            Intrinsics.checkNotNullExpressionValue(str, "oplusZoomWindowInfo.zoomPkg");
            aVar.e(str);
        }
    };

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/oplus/pay/opensdk/taskwall/manager/PayZoomWindowManager$a", "", "", "packageName", "", "e", "", "isFull", "c", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {
        public static final void d(String str, boolean z) throws JSONException {
            l2a webView;
            l2a webView2;
            View webView3;
            Intrinsics.checkNotNullParameter(str, "$packageName");
            us9 us9Var = PayZoomWindowManager.a;
            boolean z2 = false;
            if (us9Var != null && (webView2 = us9Var.getWebView()) != null && (webView3 = webView2.getWebView()) != null && webView3.isAttachedToWindow()) {
                z2 = true;
            }
            if (z2) {
                pce.b("PayZoomWindowManager onZoomWindowHide " + str + "，isFull " + z);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("packageName", str);
                jSONObject.put("isFull", z);
                pce.b("JSMethodConst, onZoomWindowHide " + jSONObject);
                us9 us9Var2 = PayZoomWindowManager.a;
                if (us9Var2 == null || (webView = us9Var2.getWebView()) == null) {
                    return;
                }
                webView.e("onZoomWindowHide(" + jSONObject + ')', null);
            }
        }

        public static final void f(String str) throws JSONException {
            l2a webView;
            l2a webView2;
            View webView3;
            Intrinsics.checkNotNullParameter(str, "$packageName");
            us9 us9Var = PayZoomWindowManager.a;
            boolean z = false;
            if (us9Var != null && (webView2 = us9Var.getWebView()) != null && (webView3 = webView2.getWebView()) != null && webView3.isAttachedToWindow()) {
                z = true;
            }
            if (z) {
                pce.b("PayZoomWindowManager onZoomWindowShow " + str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("packageName", str);
                pce.b("JSMethodConst, onZoomWindowShow " + jSONObject);
                us9 us9Var2 = PayZoomWindowManager.a;
                if (us9Var2 == null || (webView = us9Var2.getWebView()) == null) {
                    return;
                }
                webView.e("onZoomWindowShow(" + jSONObject + ')', null);
            }
        }

        public void c(@NotNull final String packageName, final boolean isFull) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.oplus.aiunit.vision.oee
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    PayZoomWindowManager.a.d(packageName, isFull);
                }
            });
        }

        public void e(@NotNull final String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.oplus.aiunit.vision.nee
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    PayZoomWindowManager.a.f(packageName);
                }
            });
        }
    }

    @JvmStatic
    @Nullable
    public static final OplusZoomWindowInfo d() {
        OplusZoomWindowInfo currentZoomWindowState = OplusZoomWindowManager.getInstance().getCurrentZoomWindowState();
        pce.b("PayZoomWindowManager " + currentZoomWindowState);
        return currentZoomWindowState;
    }

    @JvmStatic
    public static final void e() {
        pce.b("PayZoomWindowManager hideZoomWindow");
        OplusZoomWindowManager.getInstance().hideZoomWindow(2);
    }

    @JvmStatic
    public static final boolean f() {
        try {
            return OplusBuild.getOplusOSVERSION() >= 19;
        } catch (Throwable th) {
            pce.c("PayZoomWindowManager isSupport error: " + th.getMessage());
            return false;
        }
    }

    @JvmStatic
    public static final void g(@Nullable FragmentActivity activity, @NotNull String packageName) throws Throwable {
        Intent launchIntentForPackage;
        Context applicationContext;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        pce.b("PayZoomWindowManager openZoomWindow: pkg = " + packageName);
        PackageManager packageManager = (activity == null || (applicationContext = activity.getApplicationContext()) == null) ? null : applicationContext.getPackageManager();
        if (packageManager == null || (launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName)) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("android.activity.windowingMode", 100);
        Context applicationContext2 = activity.getApplicationContext();
        if (applicationContext2 != null) {
            applicationContext2.startActivity(launchIntentForPackage, bundle);
        }
        OplusZoomWindowManager.getInstance().registerZoomWindowObserver(c);
    }

    @JvmStatic
    public static final void h(@NotNull us9 fragment) {
        FragmentActivity activity;
        Lifecycle lifecycle;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        a = fragment;
        if (fragment == null || (activity = fragment.getActivity()) == null || (lifecycle = activity.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.oplus.aiunit.vision.mee
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                PayZoomWindowManager.i(lifecycleOwner, event);
            }
        });
    }

    public static final void i(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            OplusZoomWindowManager.getInstance().unregisterZoomWindowObserver(c);
            a = null;
        }
    }
}

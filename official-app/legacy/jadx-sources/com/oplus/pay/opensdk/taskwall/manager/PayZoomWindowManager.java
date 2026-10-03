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
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.e1a;
import com.oplus.aiunit.vision.or9;
import com.oplus.aiunit.vision.qae;
import com.oplus.os.OplusBuild;
import com.oplus.pay.opensdk.taskwall.manager.PayZoomWindowManager;
import com.oplus.zoomwindow.IOplusZoomWindowObserver;
import com.oplus.zoomwindow.OplusZoomWindowInfo;
import com.oplus.zoomwindow.OplusZoomWindowManager;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\b\u0007*\u0002\u0013\u0017\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\b\u0010\f\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/oplus/pay/opensdk/taskwall/manager/PayZoomWindowManager;", "", "", "f", "Lcom/oplus/zoomwindow/OplusZoomWindowInfo;", "d", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "packageName", "", b2n.f, MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/aiunit/vision/or9;", "fragment", b2n.g, "a", "Lcom/oplus/aiunit/vision/or9;", "mFragment", "com/oplus/pay/opensdk/taskwall/manager/PayZoomWindowManager$a", "b", "Lcom/oplus/pay/opensdk/taskwall/manager/PayZoomWindowManager$a;", "defaultListener", "com/oplus/pay/opensdk/taskwall/manager/PayZoomWindowManager$zoomWindowObserver$1", "c", "Lcom/oplus/pay/opensdk/taskwall/manager/PayZoomWindowManager$zoomWindowObserver$1;", "zoomWindowObserver", "<init>", "()V", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
public final class PayZoomWindowManager {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static or9 mFragment;

    @NotNull
    public static final PayZoomWindowManager INSTANCE = new PayZoomWindowManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final a defaultListener = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final PayZoomWindowManager$zoomWindowObserver$1 zoomWindowObserver = new IOplusZoomWindowObserver.Stub() { // from class: com.oplus.pay.opensdk.taskwall.manager.PayZoomWindowManager$zoomWindowObserver$1
        public void onInputMethodChanged(boolean b) {
            qae.b("PayZoomWindowManager onInputMethodChanged: " + b);
        }

        public void onZoomWindowDied(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "s");
            qae.b("PayZoomWindowManager onZoomWindowDied: " + s);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x008f  */
        @RequiresApi(24)
        public void onZoomWindowHide(@NotNull OplusZoomWindowInfo oplusZoomWindowInfo) {
            FragmentActivity activity;
            Window window;
            FragmentActivity activity2;
            FragmentActivity activity3;
            Intrinsics.checkNotNullParameter(oplusZoomWindowInfo, "oplusZoomWindowInfo");
            qae.b("PayZoomWindowManager onZoomWindowHide: info = " + oplusZoomWindowInfo);
            Rect rect = oplusZoomWindowInfo.zoomRect;
            int iWidth = rect.width();
            int iHeight = rect.height();
            qae.b("PayZoomWindowManager zoom window: " + rect);
            boolean z = true;
            Boolean boolValueOf = null;
            if (Build.VERSION.SDK_INT >= 30) {
                or9 or9Var = PayZoomWindowManager.mFragment;
                Object systemService = (or9Var == null || (activity3 = or9Var.getActivity()) == null) ? null : activity3.getSystemService("window");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                WindowMetrics currentWindowMetrics = ((WindowManager) systemService).getCurrentWindowMetrics();
                Intrinsics.checkNotNullExpressionValue(currentWindowMetrics, "windowManager.currentWindowMetrics");
                Rect bounds = currentWindowMetrics.getBounds();
                Intrinsics.checkNotNullExpressionValue(bounds, "currentWindowMetrics.bounds");
                qae.b("PayZoomWindowManager current window: " + bounds);
                if (iWidth != bounds.width() && iHeight != bounds.height()) {
                    z = false;
                }
            } else {
                or9 or9Var2 = PayZoomWindowManager.mFragment;
                View decorView = (or9Var2 == null || (activity = or9Var2.getActivity()) == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
                StringBuilder sb = new StringBuilder();
                sb.append("PayZoomWindowManager,current window: width = ");
                sb.append(decorView != null ? Integer.valueOf(decorView.getWidth()) : null);
                sb.append(", height = ");
                sb.append(decorView != null ? Integer.valueOf(decorView.getHeight()) : null);
                qae.b(sb.toString());
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
            or9 or9Var3 = PayZoomWindowManager.mFragment;
            if (or9Var3 != null && (activity2 = or9Var3.getActivity()) != null) {
                boolValueOf = Boolean.valueOf(activity2.isInMultiWindowMode());
            }
            sb2.append(boolValueOf);
            qae.b(sb2.toString());
            PayZoomWindowManager.a aVar = PayZoomWindowManager.defaultListener;
            String str = oplusZoomWindowInfo.zoomPkg;
            Intrinsics.checkNotNullExpressionValue(str, "oplusZoomWindowInfo.zoomPkg");
            aVar.c(str, z);
        }

        public void onZoomWindowShow(@NotNull OplusZoomWindowInfo oplusZoomWindowInfo) {
            Intrinsics.checkNotNullParameter(oplusZoomWindowInfo, "oplusZoomWindowInfo");
            qae.b("PayZoomWindowManager onZoomWindowShow: info = " + oplusZoomWindowInfo);
            PayZoomWindowManager.a aVar = PayZoomWindowManager.defaultListener;
            String str = oplusZoomWindowInfo.zoomPkg;
            Intrinsics.checkNotNullExpressionValue(str, "oplusZoomWindowInfo.zoomPkg");
            aVar.e(str);
        }
    };

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"com/oplus/pay/opensdk/taskwall/manager/PayZoomWindowManager$a", "", "", "packageName", "", MapSchema.FIELD_NAME_ENTRY, "", "isFull", "c", "paysdk_taskwall_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {
        public static final void d(String packageName, boolean z) throws JSONException {
            e1a webView;
            e1a webView2;
            View webView3;
            Intrinsics.checkNotNullParameter(packageName, "$packageName");
            or9 or9Var = PayZoomWindowManager.mFragment;
            boolean z2 = false;
            if (or9Var != null && (webView2 = or9Var.getWebView()) != null && (webView3 = webView2.getWebView()) != null && webView3.isAttachedToWindow()) {
                z2 = true;
            }
            if (z2) {
                qae.b("PayZoomWindowManager onZoomWindowHide " + packageName + "，isFull " + z);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("packageName", packageName);
                jSONObject.put("isFull", z);
                qae.b("JSMethodConst, onZoomWindowHide " + jSONObject);
                or9 or9Var2 = PayZoomWindowManager.mFragment;
                if (or9Var2 == null || (webView = or9Var2.getWebView()) == null) {
                    return;
                }
                webView.e("onZoomWindowHide(" + jSONObject + ')', null);
            }
        }

        public static final void f(String packageName) throws JSONException {
            e1a webView;
            e1a webView2;
            View webView3;
            Intrinsics.checkNotNullParameter(packageName, "$packageName");
            or9 or9Var = PayZoomWindowManager.mFragment;
            boolean z = false;
            if (or9Var != null && (webView2 = or9Var.getWebView()) != null && (webView3 = webView2.getWebView()) != null && webView3.isAttachedToWindow()) {
                z = true;
            }
            if (z) {
                qae.b("PayZoomWindowManager onZoomWindowShow " + packageName);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("packageName", packageName);
                qae.b("JSMethodConst, onZoomWindowShow " + jSONObject);
                or9 or9Var2 = PayZoomWindowManager.mFragment;
                if (or9Var2 == null || (webView = or9Var2.getWebView()) == null) {
                    return;
                }
                webView.e("onZoomWindowShow(" + jSONObject + ')', null);
            }
        }

        public void c(@NotNull final String packageName, final boolean isFull) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.oplus.aiunit.vision.pce
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    PayZoomWindowManager.a.d(packageName, isFull);
                }
            });
        }

        public void e(@NotNull final String packageName) {
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.oplus.aiunit.vision.oce
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
        qae.b("PayZoomWindowManager " + currentZoomWindowState);
        return currentZoomWindowState;
    }

    @JvmStatic
    public static final void e() {
        qae.b("PayZoomWindowManager hideZoomWindow");
        OplusZoomWindowManager.getInstance().hideZoomWindow(2);
    }

    @JvmStatic
    public static final boolean f() {
        try {
            return OplusBuild.getOplusOSVERSION() >= 19;
        } catch (Throwable th) {
            qae.c("PayZoomWindowManager isSupport error: " + th.getMessage());
            return false;
        }
    }

    @JvmStatic
    public static final void g(@Nullable FragmentActivity activity, @NotNull String packageName) throws Throwable {
        Intent launchIntentForPackage;
        Context applicationContext;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        qae.b("PayZoomWindowManager openZoomWindow: pkg = " + packageName);
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
        OplusZoomWindowManager.getInstance().registerZoomWindowObserver(zoomWindowObserver);
    }

    @JvmStatic
    public static final void h(@NotNull or9 fragment) {
        FragmentActivity activity;
        Lifecycle lifecycle;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        mFragment = fragment;
        if (fragment == null || (activity = fragment.getActivity()) == null || (lifecycle = activity.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.oplus.aiunit.vision.nce
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                PayZoomWindowManager.i(lifecycleOwner, event);
            }
        });
    }

    public static final void i(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            OplusZoomWindowManager.getInstance().unregisterZoomWindowObserver(zoomWindowObserver);
            mFragment = null;
        }
    }
}

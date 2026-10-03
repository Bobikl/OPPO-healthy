package com.oplus.pay.opensdk.web.ui;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.oplus.aiunit.vision.hrl;
import com.oplus.aiunit.vision.rri;
import com.oplus.pay.opensdk.web.R$color;
import com.oplus.pay.opensdk.web.ui.PayWebToolbarActivity;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.web.container.webview.core.WebContainerActivity;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\bH\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¨\u0006\u0013"}, d2 = {"Lcom/oplus/pay/opensdk/web/ui/PayWebToolbarActivity;", "Lcom/oplus/web/container/webview/core/WebContainerActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", "context", "", "k7", "l7", "n7", "result", "p7", "", Node.I_KEY, "j7", "<init>", "()V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
public final class PayWebToolbarActivity extends WebContainerActivity {
    public static final void m7(PayWebToolbarActivity payWebToolbarActivity) {
        Intrinsics.checkNotNullParameter(payWebToolbarActivity, "this$0");
        payWebToolbarActivity.n7();
    }

    public static final WindowInsetsCompat o7(View view, View view2, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "$root");
        Intrinsics.checkNotNullParameter(view2, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "insets");
        int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
        return windowInsetsCompat;
    }

    public final String j7(Context context, String key) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 128).applicationInfo.metaData.getString(key);
        } catch (Exception e) {
            hrl.b("updateWindowFlagsForLockScreen failed: " + e);
            return null;
        }
    }

    public final boolean k7(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l7() {
        View decorView;
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            window.getDecorView().setSystemUiVisibility(1792);
            window.setNavigationBarContrastEnforced(false);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(R$color.opay_pay_sdk_web_color_transparent_background_light);
        }
        Window window3 = getWindow();
        if (window3 != null && (decorView = window3.getDecorView()) != null) {
            decorView.post(new Runnable() { // from class: com.oplus.aiunit.vision.kee
                @Override // java.lang.Runnable
                public final void run() {
                    PayWebToolbarActivity.m7(this.i);
                }
            });
        }
        if (k7(this)) {
            rri.c(this, true);
        } else {
            rri.c(this, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n7() {
        View decorView;
        Window window = getWindow();
        final View viewFindViewById = (window == null || (decorView = window.getDecorView()) == null) ? null : decorView.findViewById(R.id.content);
        if (viewFindViewById != null) {
            ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new OnApplyWindowInsetsListener() { // from class: com.oplus.aiunit.vision.lee
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return PayWebToolbarActivity.o7(viewFindViewById, view, windowInsetsCompat);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.oplus.web.container.webview.core.WebContainerActivity, com.oplus.web.container.webview.core.AbstractWebExtActivity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "this.applicationContext");
        String strJ7 = j7(applicationContext, "KEY_COIN_PARTNER");
        if (strJ7 == null) {
            strJ7 = "";
        }
        p7(Intrinsics.areEqual(strJ7, "VALUE_LOCK_SCREEN"));
        l7();
        setRequestedOrientation(12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p7(boolean result) {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            setShowWhenLocked(result);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            hrl.b("updateWindowFlagsForLockScreen failed: " + th2);
        }
    }
}

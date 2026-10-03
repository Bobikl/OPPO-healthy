package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.nearme.game_sdk_pluginagent.AppCompatPluginActivity;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pay.opensdk.web.ui.PaySdkWebActivity;
import com.oplus.pay.opensdk.web.ui.PayWebContainerFragment;
import com.oplus.pay.opensdk.web.ui.PayWebToolbarActivity;
import com.oplusos.sau.common.utils.SauAarConstants;
import com.opuls.pay.web.ui.PayWebToolbarFragment;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJÍ\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2(\b\u0002\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00102(\b\u0002\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00102\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0013\"\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018JÍ\u0001\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r2(\b\u0002\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00102(\b\u0002\u0010\u0012\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fj\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00102\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u0013\"\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0004J\u0016\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0004¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/frl;", "", "Landroid/content/Context;", "context", "", rde.KEY_COUNTRY_CODE, qmm.a.l, "userInfoJsonStr", "Lcom/oplus/aiunit/vision/n2a;", "webViewCallback", "preToken", "appPackage", "traceID", "", "ignoreCheckHost", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "generalExtParam", "offlineExtParam", "", "Lcom/oplus/aiunit/vision/ws9;", "interceptorList", "", "c", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/oplus/aiunit/vision/n2a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/HashMap;Ljava/util/HashMap;[Lcom/oplus/aiunit/vision/ws9;)V", "d", TraceConstants.KEY_PKG_NAME, "a", "downloadUrl", "b", "<init>", "()V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWebContainerUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebContainerUseCase.kt\ncom/oplus/pay/opensdk/web/usecase/WebContainerUseCase\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,199:1\n13579#2,2:200\n13579#2,2:202\n*S KotlinDebug\n*F\n+ 1 WebContainerUseCase.kt\ncom/oplus/pay/opensdk/web/usecase/WebContainerUseCase\n*L\n96#1:200,2\n145#1:202,2\n*E\n"})
public final class frl {

    @NotNull
    public static final frl INSTANCE = new frl();

    public final boolean a(@NotNull Context context, @NotNull String pkgName) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pkgName, TraceConstants.KEY_PKG_NAME);
        if (TextUtils.isEmpty(pkgName)) {
            return false;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(pkgName, 0);
        } catch (Throwable unused) {
            Log.d("WebContainerUseCase", "Not Installed : " + pkgName);
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public final boolean b(@NotNull Context context, @NotNull String downloadUrl) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(downloadUrl));
            intent.addFlags(SauAarConstants.L);
            context.startActivity(intent);
            return true;
        } catch (Throwable th) {
            hrl.b("openBrowserDownload#" + th.getMessage());
            return false;
        }
    }

    public final void c(@NotNull Context context, @NotNull String countryCode, @NotNull String url, @Nullable String userInfoJsonStr, @Nullable n2a webViewCallback, @Nullable String preToken, @Nullable String appPackage, @Nullable String traceID, @Nullable Boolean ignoreCheckHost, @Nullable HashMap<String, String> generalExtParam, @Nullable HashMap<String, String> offlineExtParam, @NotNull ws9... interceptorList) {
        boolean zAreEqual;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(countryCode, rde.KEY_COUNTRY_CODE);
        Intrinsics.checkNotNullParameter(url, qmm.a.l);
        Intrinsics.checkNotNullParameter(interceptorList, "interceptorList");
        ihb ihbVar = ihb.INSTANCE;
        ihbVar.g(preToken, appPackage);
        ihbVar.h(preToken, traceID);
        try {
            zAreEqual = Intrinsics.areEqual("true", String.valueOf(Uri.parse(url).getQueryParameter("thirdPart")));
        } catch (Exception e) {
            hrl.e("json parse error: " + e.getMessage());
            zAreEqual = false;
        }
        Pair pair = zAreEqual ? new Pair(PayWebToolbarFragment.class, PayWebToolbarActivity.class) : new Pair(PayWebContainerFragment.class, PaySdkWebActivity.class);
        drl drlVar = new drl();
        drlVar.j(Uri.parse(url)).b("$web_container_ignore_check_host", ignoreCheckHost != null ? ignoreCheckHost.booleanValue() : true).i((Class) pair.getFirst(), (Class) pair.getSecond()).g(countryCode).d(offlineExtParam).a("GeneralExtParamKey", generalExtParam).c(new ice(userInfoJsonStr)).c(new xbe()).c(new oce(countryCode, userInfoJsonStr, preToken, appPackage, ignoreCheckHost, generalExtParam, offlineExtParam, webViewCallback)).k(webViewCallback);
        for (ws9 ws9Var : interceptorList) {
            drlVar.c(ws9Var);
        }
        drlVar.m(context);
    }

    public final void d(@NotNull Context context, @NotNull String countryCode, @NotNull String url, @Nullable String userInfoJsonStr, @Nullable n2a webViewCallback, @Nullable String preToken, @Nullable String appPackage, @Nullable String traceID, @Nullable Boolean ignoreCheckHost, @Nullable HashMap<String, String> generalExtParam, @Nullable HashMap<String, String> offlineExtParam, @NotNull ws9... interceptorList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(countryCode, rde.KEY_COUNTRY_CODE);
        Intrinsics.checkNotNullParameter(url, qmm.a.l);
        Intrinsics.checkNotNullParameter(interceptorList, "interceptorList");
        hrl.e("startPluginOpenWebContainer#context:" + context + "     " + (context instanceof AppCompatPluginActivity));
        Objects.requireNonNull((AppCompatPluginActivity) context);
        ihb ihbVar = ihb.INSTANCE;
        ihbVar.g(preToken, appPackage);
        ihbVar.h(preToken, traceID);
        drl drlVar = new drl();
        drlVar.j(Uri.parse(url)).b("$web_container_ignore_check_host", ignoreCheckHost != null ? ignoreCheckHost.booleanValue() : true).g(countryCode).c(new ice(userInfoJsonStr)).c(new xbe()).h(false).a("GeneralExtParamKey", generalExtParam).d(offlineExtParam).c(new oce(countryCode, userInfoJsonStr, preToken, appPackage, ignoreCheckHost, generalExtParam, offlineExtParam, webViewCallback)).k(webViewCallback);
        for (ws9 ws9Var : interceptorList) {
            drlVar.c(ws9Var);
        }
        drlVar.l(context, new vg1(new SoftReference(context)));
    }
}

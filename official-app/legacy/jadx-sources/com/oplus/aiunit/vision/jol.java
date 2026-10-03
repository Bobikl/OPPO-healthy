package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.net.UrlQuerySanitizer;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.ColorInt;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.platform.account.webview.constant.Constants;
import io.netty.util.internal.StringUtil;
import io.protostuff.MapSchema;
import java.math.BigDecimal;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#JL\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\nJ\u001a\u0010\u0015\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0006H\u0002J \u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0002R\"\u0010!\u001a\n \u001d*\u0004\u0018\u00010\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lcom/oplus/aiunit/vision/jol;", "", "", "previousUa", "Landroid/content/Context;", "context", "", "primaryAttr", "Landroid/util/ArrayMap;", "attrMap", "", "isOpenSDK", "openBrand", "Lcom/oplus/aiunit/vision/aol;", "d", "Landroid/webkit/WebView;", "mWebView", "systemFit", "", "f", "url", MapSchema.FIELD_NAME_ENTRY, "attr", "b", "c", "color", b2n.f, "defaultColor", "a", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "getCUR_BRAND$account_app_sdk_webview_release", "()Ljava/lang/String;", "CUR_BRAND", "<init>", "()V", "account-app-sdk-webview_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWebViewHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewHelper.kt\ncom/platform/account/webview/util/WebViewHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,155:1\n1855#2,2:156\n*S KotlinDebug\n*F\n+ 1 WebViewHelper.kt\ncom/platform/account/webview/util/WebViewHelper\n*L\n92#1:156,2\n*E\n"})
public final class jol {

    @NotNull
    public static final jol INSTANCE = new jol();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String CUR_BRAND = iek.g("@mq|ix");

    public final int a(Context context, int attr, int defaultColor) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{attr});
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.theme.obtainStyledAttributes(colorAttr)");
        int color = typedArrayObtainStyledAttributes.getColor(0, defaultColor);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public final String b(Context context, int attr) {
        return g(a(context, attr, 0));
    }

    public final String c(Context context, int attr) {
        return g(a(context, attr, 0));
    }

    @NotNull
    public final aol d(@Nullable String previousUa, @Nullable Context context, int primaryAttr, @NotNull ArrayMap<String, Integer> attrMap, boolean isOpenSDK, @Nullable String openBrand) {
        Intrinsics.checkNotNullParameter(attrMap, "attrMap");
        Intrinsics.checkNotNull(context);
        aol builder = aol.p(context, previousUa).g();
        if (isOpenSDK) {
            builder.b("isThird", "1");
            if (TextUtils.isEmpty(openBrand)) {
                builder.c(CUR_BRAND);
            } else {
                builder.c(openBrand);
            }
        } else {
            builder.b("isThird", "0");
            builder.c(m52.a(context));
        }
        builder.b("hardwareType", lek.a(context));
        builder.b("isMagicWindow", t8.b(context) ? "1" : "0");
        builder.i("2");
        builder.e("UserCenter");
        builder.k(a80.a(context));
        builder.l("1");
        builder.j("1");
        builder.h("1");
        builder.b(Constants.HEADER_UA_TALKBACKSTATE, jek.c(context) ? "1" : "0");
        if (bvk.g()) {
            builder.f(b(context, primaryAttr), c(context, primaryAttr));
            Set<String> setKeySet = attrMap.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "attrMap.keys");
            for (String str : setKeySet) {
                Integer value = attrMap.get(str);
                if (value != null) {
                    jol jolVar = INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    builder.b(str, jolVar.g(jolVar.a(context, value.intValue(), 0)));
                }
            }
        }
        Intrinsics.checkNotNullExpressionValue(builder, "builder");
        return builder;
    }

    public final void e(@Nullable WebView mWebView, @Nullable String url) {
        if (TextUtils.isEmpty(url)) {
            return;
        }
        try {
            boolean zEquals = StringsKt__StringsJVMKt.equals(SpeechConstant.TRUE_STR, new UrlQuerySanitizer(url).getValue("isHTSystemDarkMode"), true);
            if (bvk.f()) {
                f(mWebView, zEquals);
            }
        } catch (Exception unused) {
        }
    }

    public final void f(@Nullable WebView mWebView, boolean systemFit) {
        if (!bvk.f() || mWebView == null) {
            return;
        }
        mWebView.setBackgroundColor(0);
        mWebView.setForceDarkAllowed(systemFit);
        WebSettings settings = mWebView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "mWebView.settings");
        settings.setForceDark(systemFit ? 1 : 0);
    }

    public final String g(@ColorInt int color) {
        return "rgba(" + Color.red(color) + StringUtil.COMMA + Color.green(color) + StringUtil.COMMA + Color.blue(color) + StringUtil.COMMA + new BigDecimal(((double) Color.alpha(color)) / 255.0d).setScale(2, 4).floatValue() + ')';
    }
}

package com.oplus.aiunit.vision;

import android.webkit.WebView;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007J(\u0010\u0010\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eJ&\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/os2;", "", "Landroid/webkit/WebView;", "webView", "", "moduleName", "funcName", "", "params", "", "a", "method", "", "code", "Lcom/google/gson/JsonElement;", "data", "b", "c", "Ljava/lang/String;", "TAG", "<init>", "()V", "lib_webservice_release"}, k = 1, mv = {1, 8, 0})
public final class os2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "CallJsUtils";

    public final void a(@NotNull WebView webView, @NotNull String moduleName, @NotNull String funcName, @NotNull List<String> params) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(funcName, "funcName");
        Intrinsics.checkNotNullParameter(params, "params");
        String strC = c(moduleName, funcName, params);
        a7b.f("CallJsUtils", "formatJs:" + strC);
        webView.evaluateJavascript(strC, null);
    }

    public final void b(@Nullable WebView webView, @NotNull String method, int code, @NotNull JsonElement data) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(data, "data");
        HashMap map = new HashMap();
        map.put("code", Integer.valueOf(code));
        map.put("data", data);
        String string = new Gson().toJsonTree(map).getAsJsonObject().toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.toString()");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("if(%s) { %s('%s')}", Arrays.copyOf(new Object[]{"App." + method, "App." + method, string}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String str2 = String.format("javascript:%s", Arrays.copyOf(new Object[]{str}, 1));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        if (webView != null) {
            try {
                webView.evaluateJavascript(str2, null);
            } catch (Throwable th) {
                a7b.b(this.TAG, "evaluateJavascript: error " + th.getMessage());
            }
        }
    }

    public final String c(String moduleName, String funcName, List<String> params) {
        StringBuilder sb = new StringBuilder();
        if (params.isEmpty()) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("javascript:if(window.App.%s){window.App.%s.%s('%s');}", Arrays.copyOf(new Object[]{moduleName, moduleName, funcName, ""}, 4));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        Iterator<String> it = params.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format("javascript:if(window.App.%s){window.App.%s.%s('%s');}", Arrays.copyOf(new Object[]{moduleName, moduleName, funcName, sb.toString()}, 4));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }
}

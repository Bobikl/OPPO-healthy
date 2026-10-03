package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u008b\u0002\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2:\b\u0002\u0010\u0014\u001a4\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000e2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042(\b\u0002\u0010\u0018\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0016j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00172(\b\u0002\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0016j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u00172\u0016\u0010\u001c\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001b0\u001a\"\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/gsl;", "", "Landroid/content/Context;", "context", "", rde.KEY_COUNTRY_CODE, qmm.a.l, "userInfoJsonStr", "Lcom/oplus/aiunit/vision/n2a;", "webViewCallback", "preToken", "appPackage", "", "ignoreCheckHost", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "tipMsg", "realMsg", "", "pluginStartResultFailFunc", "traceID", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "generalExtParam", "offlineExtParam", "", "Lcom/oplus/aiunit/vision/ws9;", "interceptorList", "a", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/oplus/aiunit/vision/n2a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;[Lcom/oplus/aiunit/vision/ws9;)V", "<init>", "()V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
public final class gsl {

    @NotNull
    public static final gsl INSTANCE = new gsl();

    static {
        Object obj;
        t58.a();
        try {
            Result.Companion companion = Result.Companion;
            w58.a();
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(obj) != null) {
            hrl.b("task_wall JsbRegister.init() error");
        }
    }

    public final void a(@NotNull Context context, @NotNull String countryCode, @NotNull String url, @Nullable String userInfoJsonStr, @Nullable n2a webViewCallback, @Nullable String preToken, @Nullable String appPackage, @Nullable Boolean ignoreCheckHost, @Nullable Function2<? super String, ? super String, Unit> pluginStartResultFailFunc, @Nullable String traceID, @Nullable HashMap<String, String> generalExtParam, @Nullable HashMap<String, String> offlineExtParam, @NotNull ws9... interceptorList) {
        ws9[] ws9VarArr;
        Object obj;
        char c;
        Object obj2;
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(countryCode, rde.KEY_COUNTRY_CODE);
        Intrinsics.checkNotNullParameter(url, qmm.a.l);
        Intrinsics.checkNotNullParameter(interceptorList, "interceptorList");
        try {
            Result.Companion companion = Result.Companion;
            ws9VarArr = interceptorList;
            try {
                frl.INSTANCE.d(context, countryCode, url, userInfoJsonStr, webViewCallback, preToken, appPackage, traceID, ignoreCheckHost, generalExtParam, offlineExtParam, (ws9[]) Arrays.copyOf(interceptorList, interceptorList.length));
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                th = th;
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
        } catch (Throwable th2) {
            th = th2;
            ws9VarArr = interceptorList;
        }
        Throwable th3 = Result.exceptionOrNull-impl(obj);
        if (th3 != null) {
            hrl.h("startPluginOpenWebContainer fallback ex:" + th3 + ' ');
            try {
                frl frlVar = frl.INSTANCE;
                ws9[] ws9VarArr2 = (ws9[]) Arrays.copyOf(ws9VarArr, ws9VarArr.length);
                c = ' ';
                try {
                    frlVar.c(context, countryCode, url, userInfoJsonStr, webViewCallback, preToken, appPackage, traceID, ignoreCheckHost, generalExtParam, offlineExtParam, ws9VarArr2);
                    obj2 = Result.constructor-impl(Unit.INSTANCE);
                } catch (Throwable th4) {
                    th = th4;
                    Result.Companion companion3 = Result.Companion;
                    obj2 = Result.constructor-impl(ResultKt.createFailure(th));
                }
            } catch (Throwable th5) {
                th = th5;
                c = ' ';
            }
            Throwable th6 = Result.exceptionOrNull-impl(obj2);
            if (th6 != null) {
                hrl.h("startOpenWebContainer finish ex:" + th6 + c);
                if (pluginStartResultFailFunc != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("not support Plugin and context is:");
                    context2 = context;
                    sb.append(context2);
                    sb.append(c);
                    pluginStartResultFailFunc.invoke(sb.toString(), "context is:" + context2 + c + th6);
                } else {
                    context2 = context;
                }
                Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
                if (activity != null) {
                    activity.finish();
                }
            }
        }
    }
}

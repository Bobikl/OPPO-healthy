package com.oplus.pantanal.seedling.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.oplus.aiunit.vision.d14;
import com.oplus.pantanal.seedling.BuildConfig;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import com.oplus.pantanal.seedling.bean.SeedlingIntent;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pantanal.seedling.convertor.WidgetCodeToSeedlingCardConvertor;
import com.oplus.pantanal.seedling.intelligent.IntelligentData;
import com.oplus.pantanal.seedling.util.ExtsKt;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.wearable.linkservice.sdk.Node;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\u0007\u001a\u001f\u0010\b\u001a\u00020\u00012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\t\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u001a+\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005\"\u00020\u0001¢\u0006\u0002\u0010\u0011\u001a\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0013*\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u001a\u001e\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0013*\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0016\u001a\u001e\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0013*\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016\u001a\n\u0010\u0019\u001a\u00020\u0001*\u00020\u0016\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u0001H\u0000\u001a\u0014\u0010\u001a\u001a\u00020\u001b*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001bH\u0000\u001a\u001a\u0010\u001d\u001a\u00020\r*\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!\u001a\u001a\u0010\"\u001a\u00020\r*\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!\u001a8\u0010#\u001a\u00020\r\"\u0004\b\u0000\u0010$*\u0002H$2\u0006\u0010%\u001a\u00020&2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u00020\r0(¢\u0006\u0002\b)H\u0000¢\u0006\u0002\u0010*¨\u0006+"}, d2 = {"format", "", "prefix", "split", "items", "", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "formatSeedlingCard", "([Ljava/lang/Object;)Ljava/lang/String;", "getInstanceId", "seedlingCardId", "copyValue", "", "Lorg/json/JSONObject;", ParserTag.TAG_TARGET, Node.I_KEY, "(Lorg/json/JSONObject;Lorg/json/JSONObject;[Ljava/lang/String;)V", "genTraceTags", "", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "context", "Landroid/content/Context;", "Lcom/oplus/pantanal/seedling/bean/SeedlingIntent;", "Lcom/oplus/pantanal/seedling/intelligent/IntelligentData;", "getAppVersionName", "parseInt", "", "defaultValue", "registerExportedReceiver", "receiver", "Landroid/content/BroadcastReceiver;", "filter", "Landroid/content/IntentFilter;", "registerNotExportedReceiver", "runOnThread", "T", "executor", "Ljava/util/concurrent/ExecutorService;", "run", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;Lkotlin/jvm/functions/Function1;)V", "seedling-support_manualRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exts.kt\ncom/oplus/pantanal/seedling/util/ExtsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,176:1\n13309#2,2:177\n*S KotlinDebug\n*F\n+ 1 Exts.kt\ncom/oplus/pantanal/seedling/util/ExtsKt\n*L\n65#1:177,2\n*E\n"})
public final class ExtsKt {
    public static final void copyValue(@NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2, @NotNull String... strArr) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(jSONObject2, ParserTag.TAG_TARGET);
        Intrinsics.checkNotNullParameter(strArr, Node.I_KEY);
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            if (jSONObject2.has(str)) {
                jSONObject.put(str, jSONObject2.opt(str));
                sb.append(str + " = " + jSONObject2.opt(str) + d14.SEMICOLON_REGEX);
            }
        }
        Logger.INSTANCE.i(Constants.TAG, "copyValue:" + ((Object) sb));
    }

    @NotNull
    public static final String format(@NotNull String str, @NotNull String str2, @NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(str, "prefix");
        Intrinsics.checkNotNullParameter(str2, "split");
        Intrinsics.checkNotNullParameter(objArr, "items");
        return str + ArraysKt.joinToString$default(objArr, str2, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    @NotNull
    public static final String formatSeedlingCard(@NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "items");
        return format(WidgetCodeToSeedlingCardConvertor.CARD_PREFIX, WidgetCodeToSeedlingCardConvertor.CARD_SPLIT, Arrays.copyOf(objArr, objArr.length));
    }

    @NotNull
    public static final Map<String, String> genTraceTags(@NotNull SeedlingCard seedlingCard, @Nullable Context context) {
        Intrinsics.checkNotNullParameter(seedlingCard, "<this>");
        HashMap map = new HashMap();
        if (context != null) {
            map.put(TraceConstants.KEY_PKG_NAME, context.getPackageName());
        }
        map.put("serviceId", seedlingCard.getServiceId());
        map.put(TraceConstants.SDK_VERSION_NAME, BuildConfig.SEEDLING_VERSION_NAME);
        Logger.INSTANCE.d(Constants.TAG, "genTraceTags tags:" + map);
        return map;
    }

    public static /* synthetic */ Map genTraceTags$default(SeedlingCard seedlingCard, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = null;
        }
        return genTraceTags(seedlingCard, context);
    }

    @NotNull
    public static final String getAppVersionName(@NotNull Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(context.getPackageManager().getPackageInfo(context.getPackageName(), 1).versionName);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 == null) {
            return "";
        }
        Logger.INSTANCE.e(Constants.TAG, "getAppVersionName error:" + th2);
        return "";
    }

    @NotNull
    public static final String getInstanceId(@NotNull String str) {
        Object obj;
        Intrinsics.checkNotNullParameter(str, "seedlingCardId");
        Object obj2 = "";
        try {
            Result.Companion companion = Result.Companion;
            List listSplit$default = StringsKt.split$default(str, new String[]{WidgetCodeToSeedlingCardConvertor.CARD_SPLIT}, false, 0, 6, (Object) null);
            if (listSplit$default.size() - 1 < 9) {
                return "";
            }
            obj2 = listSplit$default.get(9);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(Constants.TAG, "getInstanceId, error: " + th2);
        }
        return (String) obj2;
    }

    public static final int parseInt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return parseInt(str, -1);
    }

    public static final void registerExportedReceiver(@NotNull Context context, @NotNull BroadcastReceiver broadcastReceiver, @NotNull IntentFilter intentFilter) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(broadcastReceiver, "receiver");
        Intrinsics.checkNotNullParameter(intentFilter, "filter");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(broadcastReceiver, intentFilter, 2);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public static final void registerNotExportedReceiver(@NotNull Context context, @NotNull BroadcastReceiver broadcastReceiver, @NotNull IntentFilter intentFilter) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(broadcastReceiver, "receiver");
        Intrinsics.checkNotNullParameter(intentFilter, "filter");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public static final <T> void runOnThread(final T t, @NotNull ExecutorService executorService, @NotNull final Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(executorService, "executor");
        Intrinsics.checkNotNullParameter(function1, "run");
        Logger.INSTANCE.d(Constants.TAG, "runOnCardThread:" + t);
        executorService.submit(new Runnable() { // from class: com.oplus.aiunit.vision.a17
            @Override // java.lang.Runnable
            public final void run() {
                ExtsKt.runOnThread$lambda$2(function1, t);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runOnThread$lambda$2(final Function1 function1, final Object obj) {
        Intrinsics.checkNotNullParameter(function1, "$run");
        UtilsKt.runWithCatch(Constants.TAG, new Function0<Unit>() { // from class: com.oplus.pantanal.seedling.util.ExtsKt$runOnThread$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                function1.invoke(obj);
            }
        });
    }

    @NotNull
    public static final Map<String, String> genTraceTags(@NotNull SeedlingIntent seedlingIntent, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(seedlingIntent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        HashMap map = new HashMap();
        map.put(TraceConstants.KEY_PKG_NAME, context.getPackageName());
        map.put(TraceConstants.KEY_APP_VERSION_NAME, getAppVersionName(context));
        map.put(TraceConstants.KEY_ACTION, seedlingIntent.getAction());
        map.put(TraceConstants.SDK_VERSION_NAME, BuildConfig.SEEDLING_VERSION_NAME);
        Logger.INSTANCE.d(Constants.TAG, "genTraceTags tags:" + map);
        return map;
    }

    public static final int parseInt(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.Companion;
            return Integer.parseInt(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 != null) {
                Logger.INSTANCE.e(Constants.TAG, "parseInt error:" + th2.getMessage());
            }
            return i;
        }
    }

    @NotNull
    public static final Map<String, String> genTraceTags(@NotNull IntelligentData intelligentData, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(intelligentData, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        HashMap map = new HashMap();
        map.put(TraceConstants.KEY_PKG_NAME, context.getPackageName());
        map.put(TraceConstants.KEY_APP_VERSION_NAME, getAppVersionName(context));
        map.put("event", intelligentData.getEvent());
        map.put(TraceConstants.INTELLIGENT_DATA_EVENT_CODE, String.valueOf(intelligentData.getEventCode()));
        map.put(TraceConstants.SDK_VERSION_NAME, BuildConfig.SEEDLING_VERSION_NAME);
        Logger.INSTANCE.d(Constants.TAG, "genTraceTags tags:" + map);
        return map;
    }
}

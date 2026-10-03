package com.oplus.pantanal.seedling.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.oplus.pantanal.seedling.BuildConfig;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import com.oplus.pantanal.seedling.bean.SeedlingIntent;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pantanal.seedling.intelligent.IntelligentData;
import com.oplus.pantanal.seedling.util.ExtsKt;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\u0007\u001a\u001f\u0010\b\u001a\u00020\u00012\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0002\u0010\t\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001\u001a+\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0005\"\u00020\u0001¢\u0006\u0002\u0010\u0011\u001a\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0013*\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u001a\u001e\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0013*\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0016\u001a\u001e\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0013*\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016\u001a\n\u0010\u0019\u001a\u00020\u0001*\u00020\u0016\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u0001H\u0000\u001a\u0014\u0010\u001a\u001a\u00020\u001b*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001bH\u0000\u001a\u001a\u0010\u001d\u001a\u00020\r*\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!\u001a\u001a\u0010\"\u001a\u00020\r*\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!\u001a8\u0010#\u001a\u00020\r\"\u0004\b\u0000\u0010$*\u0002H$2\u0006\u0010%\u001a\u00020&2\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u0002H$\u0012\u0004\u0012\u00020\r0(¢\u0006\u0002\b)H\u0000¢\u0006\u0002\u0010*¨\u0006+"}, d2 = {"format", "", "prefix", "split", "items", "", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "formatSeedlingCard", "([Ljava/lang/Object;)Ljava/lang/String;", "getInstanceId", "seedlingCardId", "copyValue", "", "Lorg/json/JSONObject;", "target", "key", "(Lorg/json/JSONObject;Lorg/json/JSONObject;[Ljava/lang/String;)V", "genTraceTags", "", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "context", "Landroid/content/Context;", "Lcom/oplus/pantanal/seedling/bean/SeedlingIntent;", "Lcom/oplus/pantanal/seedling/intelligent/IntelligentData;", "getAppVersionName", "parseInt", "", "defaultValue", "registerExportedReceiver", "receiver", "Landroid/content/BroadcastReceiver;", "filter", "Landroid/content/IntentFilter;", "registerNotExportedReceiver", "runOnThread", ExifInterface.GPS_DIRECTION_TRUE, "executor", "Ljava/util/concurrent/ExecutorService;", "run", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;Lkotlin/jvm/functions/Function1;)V", "seedling-support_manualRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Exts.kt\ncom/oplus/pantanal/seedling/util/ExtsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,176:1\n13309#2,2:177\n*S KotlinDebug\n*F\n+ 1 Exts.kt\ncom/oplus/pantanal/seedling/util/ExtsKt\n*L\n65#1:177,2\n*E\n"})
public final class ExtsKt {
    public static final void copyValue(@NotNull JSONObject jSONObject, @NotNull JSONObject target, @NotNull String... key) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(key, "key");
        StringBuilder sb = new StringBuilder();
        for (String str : key) {
            if (target.has(str)) {
                jSONObject.put(str, target.opt(str));
                sb.append(str + " = " + target.opt(str) + ";");
            }
        }
        Logger.INSTANCE.i(Constants.TAG, "copyValue:" + ((Object) sb));
    }

    @NotNull
    public static final String format(@NotNull String prefix, @NotNull String split, @NotNull Object... items) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(split, "split");
        Intrinsics.checkNotNullParameter(items, "items");
        return prefix + ArraysKt___ArraysKt.joinToString$default(items, split, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    @NotNull
    public static final String formatSeedlingCard(@NotNull Object... items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return format("card:", "&", Arrays.copyOf(items, items.length));
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
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(context.getPackageManager().getPackageInfo(context.getPackageName(), 1).versionName);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl == null) {
            return "";
        }
        Logger.INSTANCE.e(Constants.TAG, "getAppVersionName error:" + thM5290exceptionOrNullimpl);
        return "";
    }

    @NotNull
    public static final String getInstanceId(@NotNull String seedlingCardId) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(seedlingCardId, "seedlingCardId");
        Object obj = "";
        try {
            Result.Companion companion = Result.INSTANCE;
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) seedlingCardId, new String[]{"&"}, false, 0, 6, (Object) null);
            if (listSplit$default.size() - 1 < 9) {
                return "";
            }
            obj = listSplit$default.get(9);
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            Logger.INSTANCE.e(Constants.TAG, "getInstanceId, error: " + thM5290exceptionOrNullimpl);
        }
        return (String) obj;
    }

    public static final int parseInt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return parseInt(str, -1);
    }

    public static final void registerExportedReceiver(@NotNull Context context, @NotNull BroadcastReceiver receiver, @NotNull IntentFilter filter) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(receiver, filter, 2);
        } else {
            context.registerReceiver(receiver, filter);
        }
    }

    public static final void registerNotExportedReceiver(@NotNull Context context, @NotNull BroadcastReceiver receiver, @NotNull IntentFilter filter) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(filter, "filter");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(receiver, filter, 4);
        } else {
            context.registerReceiver(receiver, filter);
        }
    }

    public static final <T> void runOnThread(final T t, @NotNull ExecutorService executor, @NotNull final Function1<? super T, Unit> run) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(run, "run");
        Logger.INSTANCE.d(Constants.TAG, "runOnCardThread:" + t);
        executor.submit(new Runnable() { // from class: com.oplus.aiunit.vision.zz6
            @Override // java.lang.Runnable
            public final void run() {
                ExtsKt.runOnThread$lambda$2(run, t);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runOnThread$lambda$2(final Function1 run, final Object obj) {
        Intrinsics.checkNotNullParameter(run, "$run");
        UtilsKt.runWithCatch(Constants.TAG, new Function0<Unit>() { // from class: com.oplus.pantanal.seedling.util.ExtsKt$runOnThread$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                run.invoke(obj);
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
        map.put("intent", seedlingIntent.getAction());
        map.put(TraceConstants.SDK_VERSION_NAME, BuildConfig.SEEDLING_VERSION_NAME);
        Logger.INSTANCE.d(Constants.TAG, "genTraceTags tags:" + map);
        return map;
    }

    public static final int parseInt(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            return Integer.parseInt(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            if (thM5290exceptionOrNullimpl != null) {
                Logger.INSTANCE.e(Constants.TAG, "parseInt error:" + thM5290exceptionOrNullimpl.getMessage());
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

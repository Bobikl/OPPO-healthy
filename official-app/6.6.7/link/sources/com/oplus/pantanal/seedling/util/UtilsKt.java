package com.oplus.pantanal.seedling.util;

import android.content.Context;
import com.oplus.pantanal.seedling.BuildConfig;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pantanal.seedling.utrace.UTraceWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001aJ\u0010\u000f\u001a*\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010j\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011`\u00132\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0015H\u0000\u001a\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019\u001a\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0015\u001a\u0006\u0010\u001b\u001a\u00020\u0001\u001a\b\u0010\u001c\u001a\u00020\u000eH\u0000\u001a)\u0010\u001d\u001a\u0004\u0018\u0001H\u001e\"\u0004\b\u0000\u0010\u001e2\u0006\u0010\u001f\u001a\u00020\u00012\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001e0!¢\u0006\u0002\u0010\"\u001a\u000e\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020%\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"#\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\"\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"FIXED_EXECUTOR_NAME", "", "LENGTH_SHORT_UUID", "", "NUM_FIXED_THREADS", "TAG", "fixedExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "getFixedExecutor", "()Ljava/util/concurrent/ExecutorService;", "fixedExecutor$delegate", "Lkotlin/Lazy;", "sIsDebug", "", "deepCopySeedlingCard", "Ljava/util/HashMap;", "", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "Lkotlin/collections/HashMap;", "sourceMap", "", "executeFixedTask", "", "task", "Ljava/lang/Runnable;", "genVersionNameMap", "generateShortUUID", "isAppDebug", "runWithCatch", "T", "tag", "call", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "syncIsDebug", "context", "Landroid/content/Context;", "seedling-support_manualRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncom/oplus/pantanal/seedling/util/UtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1855#2,2:105\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncom/oplus/pantanal/seedling/util/UtilsKt\n*L\n60#1:105,2\n*E\n"})
public final class UtilsKt {

    @NotNull
    private static final String FIXED_EXECUTOR_NAME = "SeedlingSupportFixedExecutor";
    private static final int LENGTH_SHORT_UUID = 6;
    private static final int NUM_FIXED_THREADS = 2;

    @NotNull
    private static final String TAG = "Utils";

    @NotNull
    private static final Lazy fixedExecutor$delegate = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.oplus.pantanal.seedling.util.UtilsKt$fixedExecutor$2
        public final ExecutorService invoke() {
            return Executors.newFixedThreadPool(2, new NamePrefixedThreadFactory("SeedlingSupportFixedExecutor"));
        }
    });
    private static boolean sIsDebug;

    @NotNull
    public static final HashMap<String, List<SeedlingCard>> deepCopySeedlingCard(@NotNull Map<String, ? extends List<SeedlingCard>> map) {
        Intrinsics.checkNotNullParameter(map, "sourceMap");
        HashMap<String, List<SeedlingCard>> map2 = new HashMap<>();
        for (String str : map.keySet()) {
            List<SeedlingCard> list = map.get(str);
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                arrayList.addAll(list);
            }
            map2.put(str, arrayList);
        }
        return map2;
    }

    public static final void executeFixedTask(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "task");
        getFixedExecutor().execute(runnable);
    }

    @NotNull
    public static final Map<String, String> genVersionNameMap() {
        HashMap map = new HashMap();
        map.put(TraceConstants.SDK_VERSION_NAME, BuildConfig.SEEDLING_VERSION_NAME);
        return map;
    }

    @NotNull
    public static final String generateShortUUID() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String strSubstring = StringsKt.replace$default(string, "-", "", false, 4, (Object) null).substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final ExecutorService getFixedExecutor() {
        return (ExecutorService) fixedExecutor$delegate.getValue();
    }

    public static final boolean isAppDebug() {
        return sIsDebug;
    }

    @Nullable
    public static final <T> T runWithCatch(@NotNull String str, @NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(str, "tag");
        Intrinsics.checkNotNullParameter(function0, "call");
        try {
            Result.Companion companion = Result.Companion;
            return (T) function0.invoke();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 == null) {
                return null;
            }
            Logger.INSTANCE.e(str + "_ERR", "run action has error:" + th2.getMessage());
            return null;
        }
    }

    public static final void syncIsDebug(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        sIsDebug = (context.getApplicationInfo() == null || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
        Logger.INSTANCE.i(TAG, "Utils sIsDebug sync ret: " + sIsDebug);
        UTraceWrapper.INSTANCE.setDebbugable(sIsDebug);
    }
}

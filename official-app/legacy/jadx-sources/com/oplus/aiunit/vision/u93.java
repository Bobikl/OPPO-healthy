package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.utrace.lib.PackageNames;
import com.pantanal.server.content.decision.DecisionCenter;
import io.netty.util.internal.StringUtil;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/u93;", "", "Landroid/content/Context;", "context", "", "b", "a", "", TraceConstants.KEY_PKG_NAME, "c", "", "Z", Constants.KEY_IS_SUPPORT_MULTI_INSTANCE, "isMetisSupportMultiInstance", Constants.IS_SUPPORT_MULTI_INSTANCE, "Ljava/util/concurrent/atomic/AtomicBoolean;", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isUmsObtainFinished", MapSchema.FIELD_NAME_ENTRY, "isMetisObtainFinished", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class u93 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static volatile boolean isUmsSupportMultiInstance;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static volatile boolean isMetisSupportMultiInstance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static volatile boolean isSupportMultiInstance;

    @NotNull
    public static final u93 INSTANCE = new u93();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static volatile AtomicBoolean isUmsObtainFinished = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static volatile AtomicBoolean isMetisObtainFinished = new AtomicBoolean(false);

    @JvmStatic
    public static final void a(Context context) {
        Object objM5287constructorimpl;
        if (context == null) {
            f7b.m("CheckSupportMultiInstanceUtil", "[checkMetisMultiInstanceSupported] context is null!");
            isMetisObtainFinished.set(true);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            isMetisSupportMultiInstance = context.getPackageManager().getApplicationInfo(PackageNames.METIS, 128).metaData.getBoolean("supportMultiInstance_V2");
            f7b.h("CheckSupportMultiInstanceUtil", Intrinsics.stringPlus("[checkMetisMultiInstanceSupported] result is : ", Boolean.valueOf(isMetisSupportMultiInstance)));
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            f7b.f("CheckSupportMultiInstanceUtil", Intrinsics.stringPlus("[checkMetisMultiInstanceSupported] error:", thM5290exceptionOrNullimpl.getMessage()));
        }
        isMetisObtainFinished.set(true);
    }

    @JvmStatic
    public static final void b(Context context) {
        Object objM5287constructorimpl;
        if (context == null) {
            f7b.m("CheckSupportMultiInstanceUtil", "[checkUmsMultiInSupported] context is null!");
            isUmsObtainFinished.set(true);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            isUmsSupportMultiInstance = context.getPackageManager().getApplicationInfo("com.oplus.pantanal.ums", 128).metaData.getBoolean("supportMultiInstance_V2");
            f7b.h("CheckSupportMultiInstanceUtil", Intrinsics.stringPlus("[checkUmsMultiInSupported] result is : ", Boolean.valueOf(isUmsSupportMultiInstance)));
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            f7b.f("CheckSupportMultiInstanceUtil", Intrinsics.stringPlus("[checkUmsMultiInSupported] error:", thM5290exceptionOrNullimpl.getMessage()));
        }
        isUmsObtainFinished.set(true);
    }

    @JvmStatic
    public static final void c(@Nullable Context context, @NotNull String pkgName) {
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        if (context == null) {
            f7b.m("CheckSupportMultiInstanceUtil", "observePkgChange(" + pkgName + "), but context is null!");
            return;
        }
        if (Intrinsics.areEqual("com.oplus.pantanal.ums", pkgName)) {
            synchronized (Reflection.getOrCreateKotlinClass(u93.class)) {
                b(context);
                Unit unit = Unit.INSTANCE;
            }
            f7b.h("CheckSupportMultiInstanceUtil", "UMS package changed!");
        }
        if (Intrinsics.areEqual(PackageNames.METIS, pkgName)) {
            synchronized (Reflection.getOrCreateKotlinClass(u93.class)) {
                a(context);
                Unit unit2 = Unit.INSTANCE;
            }
            f7b.h("CheckSupportMultiInstanceUtil", "Metis package changed!");
        }
        boolean z = isUmsSupportMultiInstance && isMetisSupportMultiInstance;
        f7b.h("CheckSupportMultiInstanceUtil", "observePkgChange package:" + pkgName + ", new supportMultiInstance status:" + z + ", old supportMultiInstance status:" + isSupportMultiInstance + StringUtil.SPACE);
        if (z != isSupportMultiInstance) {
            isSupportMultiInstance = z;
            Iterator<Map.Entry<Integer, k7c>> it = DecisionCenter.INSTANCE.j().entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().onChanged(isSupportMultiInstance);
            }
        }
    }
}

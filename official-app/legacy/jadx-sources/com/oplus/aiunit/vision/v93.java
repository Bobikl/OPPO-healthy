package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.utrace.lib.PackageNames;
import com.pantanal.server.content.decision.SceneDecisionCenter;
import com.pantanal.server.content.utils.OSUtils;
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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0003J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/v93;", "", "Landroid/content/Context;", "context", "", "b", "a", "", TraceConstants.KEY_PKG_NAME, "c", "", "Z", "isUmsSupportScene", "isMetisSupportScene", "isMetisSupportSceneOnOS140", "d", "isSupportScene", "Ljava/util/concurrent/atomic/AtomicBoolean;", MapSchema.FIELD_NAME_ENTRY, "Ljava/util/concurrent/atomic/AtomicBoolean;", "isUmsObtainFinished", "f", "isMetisObtainFinished", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class v93 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static volatile boolean isUmsSupportScene;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static volatile boolean isMetisSupportScene;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static volatile boolean isMetisSupportSceneOnOS140;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static volatile boolean isSupportScene;

    @NotNull
    public static final v93 INSTANCE = new v93();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static volatile AtomicBoolean isUmsObtainFinished = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static volatile AtomicBoolean isMetisObtainFinished = new AtomicBoolean(false);

    @JvmStatic
    public static final void a(Context context) {
        Object objM5287constructorimpl;
        if (context == null) {
            f7b.m("CheckSupportSceneUtil", "checkMetisSupported, but context is null!");
            isMetisObtainFinished.set(true);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(PackageNames.METIS, 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.g…T_META_DATA\n            )");
            isMetisSupportScene = applicationInfo.metaData.getBoolean("supportScene");
            isMetisSupportSceneOnOS140 = applicationInfo.metaData.getBoolean("supportSceneOn140");
            f7b.h("CheckSupportSceneUtil", "checkMetisSupported scene result is : " + isMetisSupportScene + ", isMetisSupportSceneOnOS140:" + isMetisSupportSceneOnOS140 + StringUtil.SPACE);
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            f7b.f("CheckSupportSceneUtil", Intrinsics.stringPlus("checkMetisSupported error:", thM5290exceptionOrNullimpl.getMessage()));
        }
        isMetisObtainFinished.set(true);
    }

    @JvmStatic
    public static final void b(Context context) {
        Object objM5287constructorimpl;
        if (context == null) {
            f7b.m("CheckSupportSceneUtil", "checkUmsSupported, but context is null!");
            isUmsObtainFinished.set(true);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            isUmsSupportScene = context.getPackageManager().getApplicationInfo("com.oplus.pantanal.ums", 128).metaData.getBoolean("supportScene");
            f7b.h("CheckSupportSceneUtil", Intrinsics.stringPlus("checkUmsSupported scene result is : ", Boolean.valueOf(isUmsSupportScene)));
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            f7b.f("CheckSupportSceneUtil", Intrinsics.stringPlus("checkUmsSupported error:", thM5290exceptionOrNullimpl.getMessage()));
        }
        isUmsObtainFinished.set(true);
    }

    @JvmStatic
    public static final void c(@Nullable Context context, @NotNull String pkgName) {
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        if (context == null) {
            f7b.m("CheckSupportSceneUtil", "observePkgChange(" + pkgName + "), but context is null!");
            return;
        }
        if (Intrinsics.areEqual("com.oplus.pantanal.ums", pkgName)) {
            synchronized (Reflection.getOrCreateKotlinClass(v93.class)) {
                b(context);
                Unit unit = Unit.INSTANCE;
            }
            f7b.h("CheckSupportSceneUtil", "UMS package changed!");
        }
        if (Intrinsics.areEqual(PackageNames.METIS, pkgName)) {
            synchronized (Reflection.getOrCreateKotlinClass(v93.class)) {
                a(context);
                Unit unit2 = Unit.INSTANCE;
            }
            f7b.h("CheckSupportSceneUtil", "Metis package changed!");
        }
        boolean z = true;
        if (!OSUtils.f() ? !isUmsSupportScene || !isMetisSupportScene : !isUmsSupportScene || !isMetisSupportSceneOnOS140) {
            z = false;
        }
        f7b.h("CheckSupportSceneUtil", "observePkgChange package:" + pkgName + ", new support scene status:" + z + ", old support scene status:" + isSupportScene + StringUtil.SPACE);
        if (z != isSupportScene) {
            isSupportScene = z;
            Iterator<Map.Entry<Integer, veg>> it = SceneDecisionCenter.INSTANCE.n().entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().onChanged(isSupportScene);
            }
        }
    }
}

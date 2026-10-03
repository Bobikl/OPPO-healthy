package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.VisibleForTesting;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.dsl.DSLUtils;
import com.oplus.smartsdk.ErrorCallback;
import com.oplus.smartsdk.ISmartViewApi;
import com.oplus.smartsdk.SmartAPICallback;
import com.oplus.smartsdk.SmartEngineManager;
import io.protostuff.MapSchema;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R*\u0010\u001c\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R0\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0\u001dj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/n90;", "", "Landroid/content/Context;", "appContext", "", "i", "Lcom/oplus/smartsdk/SmartAPICallback;", "callback", "f", "", "cardName", "Lcom/oplus/aiunit/vision/ay9;", MapSchema.FIELD_NAME_ENTRY, LogFieldKey.LEVEL_KEY, "", b2n.g, "a", "Z", "initialed", "Lcom/oplus/smartsdk/SmartEngineManager;", "b", "Lcom/oplus/smartsdk/SmartEngineManager;", "getSmartEngineManager", "()Lcom/oplus/smartsdk/SmartEngineManager;", "setSmartEngineManager", "(Lcom/oplus/smartsdk/SmartEngineManager;)V", "getSmartEngineManager$annotations", "()V", "smartEngineManager", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "c", "Ljava/util/HashMap;", "errorCallbacks", "Lcom/oplus/smartsdk/ErrorCallback;", "d", "Lcom/oplus/smartsdk/ErrorCallback;", "errorCallback", "<init>", "card-smart-engine_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"StaticFieldLeak"})
public final class n90 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static boolean initialed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static SmartEngineManager smartEngineManager;

    @NotNull
    public static final n90 INSTANCE = new n90();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final HashMap<String, ay9> errorCallbacks = new HashMap<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final ErrorCallback errorCallback = new a();

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/n90$a", "Lcom/oplus/smartsdk/ErrorCallback;", "", "cardName", "", "code", "", "onCall", "card-smart-engine_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements ErrorCallback {
        @Override // com.oplus.smartsdk.ErrorCallback
        public void onCall(@NotNull String cardName, int code) {
            Unit unit;
            Intrinsics.checkNotNullParameter(cardName, "cardName");
            t6e t6eVar = t6e.INSTANCE;
            bs9.a.c(t6eVar, "SmartEngineChecker", "onCall: cardName = " + cardName + ", code = " + code, false, null, false, 0, false, null, 252, null);
            ay9 ay9Var = (ay9) n90.errorCallbacks.get(cardName);
            if (ay9Var != null) {
                ay9Var.onCall(cardName, code);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                bs9.a.c(t6eVar, "SmartEngineChecker", "onCall: card not exist", false, null, false, 0, false, null, 252, null);
            }
        }
    }

    public static final void g(SmartAPICallback callback, ISmartViewApi iSmartViewApi) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.onCall(iSmartViewApi);
    }

    public static final void j(ISmartViewApi iSmartViewApi) {
        iSmartViewApi.setCanLog(t6e.INSTANCE.q());
    }

    public static final void k(ISmartViewApi iSmartViewApi) {
        iSmartViewApi.registerErrorCallback(errorCallback);
    }

    public final void e(@NotNull String cardName, @NotNull ay9 callback) {
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        Intrinsics.checkNotNullParameter(callback, "callback");
        bs9.a.c(t6e.INSTANCE, "SmartEngineChecker", "addErrorCallback: cardName = " + cardName, false, null, false, 0, false, null, 252, null);
        errorCallbacks.put(cardName, callback);
    }

    public final void f(@NotNull final SmartAPICallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        SmartEngineManager smartEngineManager2 = smartEngineManager;
        if (smartEngineManager2 != null) {
            if (smartEngineManager2 != null) {
                smartEngineManager2.getSmartApi(new SmartAPICallback() { // from class: com.oplus.aiunit.vision.m90
                    @Override // com.oplus.smartsdk.SmartAPICallback
                    public final void onCall(ISmartViewApi iSmartViewApi) {
                        n90.g(callback, iSmartViewApi);
                    }
                });
                return;
            }
            return;
        }
        try {
            bs9.a.c(t6e.INSTANCE, "SmartEngineChecker", "getSmartApi: get instance local ", false, null, false, 0, false, null, 252, null);
            Object objNewInstance = Class.forName("com.oplus.smartengine.SmartViewImpl").newInstance();
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type com.oplus.smartsdk.ISmartViewApi");
            callback.onCall((ISmartViewApi) objNewInstance);
        } catch (Exception e2) {
            bs9.a.b(t6e.INSTANCE, "SmartEngineChecker", "get SmartViewImpl has error: " + e2.getMessage(), false, null, false, 0, false, null, 252, null);
        }
    }

    @VisibleForTesting
    public final boolean h(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        try {
            PackageManager packageManager = appContext.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "appContext.packageManager");
            return packageManager.getPackageInfo(DSLUtils.SMART_PACKAGE, 0) != null;
        } catch (Exception e2) {
            bs9.a.c(t6e.INSTANCE, "SmartEngineChecker", "hasSmartEngineApk e: " + e2.getMessage(), false, null, false, 0, false, null, 252, null);
        }
    }

    public final void i(@NotNull Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        if (initialed) {
            bs9.a.c(t6e.INSTANCE, "SmartEngineChecker", "Smart Engine already initialzed.", false, null, false, 0, false, null, 252, null);
            return;
        }
        initialed = true;
        if (smartEngineManager == null) {
            boolean zH = h(appContext);
            if (zH) {
                bs9.a.c(t6e.INSTANCE, "SmartEngineChecker", "smartEngine init " + this + " context=" + appContext + ", contextDpi=" + appContext.getResources().getConfiguration().densityDpi + ", applicationContext=" + appContext.getApplicationContext() + ", applicationContextDpi=" + appContext.getApplicationContext().getResources().getConfiguration().densityDpi, false, null, false, 0, false, null, 252, null);
                smartEngineManager = new SmartEngineManager(appContext);
            }
            bs9.a.c(t6e.INSTANCE, "SmartEngineChecker", "init() : hasSmartEngineApk = " + zH, false, null, false, 0, false, null, 252, null);
        }
        f(new SmartAPICallback() { // from class: com.oplus.aiunit.vision.k90
            @Override // com.oplus.smartsdk.SmartAPICallback
            public final void onCall(ISmartViewApi iSmartViewApi) {
                n90.j(iSmartViewApi);
            }
        });
        f(new SmartAPICallback() { // from class: com.oplus.aiunit.vision.l90
            @Override // com.oplus.smartsdk.SmartAPICallback
            public final void onCall(ISmartViewApi iSmartViewApi) {
                n90.k(iSmartViewApi);
            }
        });
    }

    public final void l(@NotNull String cardName) {
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        bs9.a.c(t6e.INSTANCE, "SmartEngineChecker", "removeErrorCallback: cardName = " + cardName, false, null, false, 0, false, null, 252, null);
        errorCallbacks.remove(cardName);
    }
}

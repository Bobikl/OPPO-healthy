package com.oplus.smartsdk.themecard;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.oplus.smartsdk.ISmartViewApi;
import java.lang.reflect.Constructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u00142\u0006\u0010\u0016\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/oplus/smartsdk/themecard/ThemeCardApiLoader;", "Lcom/oplus/smartsdk/themecard/ApiLoader;", "Lcom/oplus/smartsdk/themecard/ThemeCardViewImpl$KeyguardCtrlFactory;", "()V", "engineVersion", "", "keyguardCtrlConstructor", "Ljava/lang/reflect/Constructor;", "themeCardViewApi", "Lcom/oplus/smartsdk/themecard/ThemeCardViewImpl;", "createKeyguardCtrl", "Lcom/oplus/smartsdk/themecard/OplusKeyguardCtrl;", "cardName", "", "getEngineVersion", "context", "Landroid/content/Context;", "isForceLoad", "", "loadApi", "Lkotlin/Pair;", "Lcom/oplus/smartsdk/ISmartViewApi;", "hostContext", "Companion", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ThemeCardApiLoader implements ApiLoader, ThemeCardViewImpl.KeyguardCtrlFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    protected static final String ENGINE_PACKAGE = "com.oplus.uiengine";

    @NotNull
    private static final String TAG = "ThemeCardApiLoader";

    @NotNull
    private static final String UIENGINE_CTRL_CLASS = "com.oplus.uiengine.ctrl.EngineKeyguardCtrl";

    @Nullable
    private Constructor<?> keyguardCtrlConstructor;

    @NotNull
    private final ThemeCardViewImpl themeCardViewApi = new ThemeCardViewImpl(this);
    private long engineVersion = -1;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0084T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/oplus/smartsdk/themecard/ThemeCardApiLoader$Companion;", "", "()V", "ENGINE_PACKAGE", "", "TAG", "UIENGINE_CTRL_CLASS", "isSupportThemeCard", "", "context", "Landroid/content/Context;", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isSupportThemeCard(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(ThemeCardApiLoader.ENGINE_PACKAGE, 128);
                Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.getApplicationInfo(ENGINE_PACKAGE, PackageManager.GET_META_DATA)");
                boolean z = applicationInfo.metaData.getBoolean("theme_card_supported");
                Log.e(ThemeCardApiLoader.TAG, Intrinsics.stringPlus("isSupportThemeCard value=", Boolean.valueOf(z)));
                return z;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e(ThemeCardApiLoader.TAG, Intrinsics.stringPlus("isSupportThemeCard error! e=", e2));
                return false;
            }
        }
    }

    private final long getEngineVersion(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(ENGINE_PACKAGE, 0);
            if (packageInfo != null) {
                return packageInfo.getLongVersionCode();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e(TAG, Intrinsics.stringPlus("getEngineVersion e=", e2));
        }
        return 0L;
    }

    @Override // com.oplus.smartsdk.themecard.ThemeCardViewImpl.KeyguardCtrlFactory
    @Nullable
    public OplusKeyguardCtrl createKeyguardCtrl(@NotNull String cardName) {
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        Constructor<?> constructor = this.keyguardCtrlConstructor;
        if (constructor != null) {
            return new OplusKeyguardCtrl(constructor, cardName);
        }
        Log.w(TAG, Intrinsics.stringPlus("createKeyguardCtrl mKeyguardCtrlConstructor is null! cardName=", cardName));
        return null;
    }

    @Override // com.oplus.smartsdk.themecard.ApiLoader
    public boolean isForceLoad(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        long engineVersion = getEngineVersion(context);
        if (engineVersion <= this.engineVersion) {
            return false;
        }
        this.engineVersion = engineVersion;
        return true;
    }

    @Override // com.oplus.smartsdk.themecard.ApiLoader
    @NotNull
    public Pair<ISmartViewApi, Context> loadApi(@NotNull Context hostContext) throws Throwable {
        Intrinsics.checkNotNullParameter(hostContext, "hostContext");
        if (this.keyguardCtrlConstructor == null || isForceLoad(hostContext)) {
            this.keyguardCtrlConstructor = hostContext.createPackageContext(ENGINE_PACKAGE, 3).getClassLoader().loadClass(UIENGINE_CTRL_CLASS).getConstructor(Context.class, Object.class);
        }
        return new Pair<>(this.themeCardViewApi, hostContext);
    }
}

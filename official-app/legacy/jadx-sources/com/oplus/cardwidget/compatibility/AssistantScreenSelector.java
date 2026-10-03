package com.oplus.cardwidget.compatibility;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.oplus.cardwidget.util.Logger;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/oplus/cardwidget/compatibility/AssistantScreenSelector;", "", "()V", "FLAG_SUPPORT_DEFAULT_CATEGORY", "", "FLAG_SUPPORT_RENDER", "KEY_META_DATA_ASSISTANT_SUPPORT", "", "KEY_META_DATA_ASSISTANT_SUPPORT_DEEPLINK", "KEY_META_DATA_UI_ENGINE_VERSION", "PACKAGE_NAME_ASSISTANT_SCREEN", "PACKAGE_NAME_SMART_ENGINE", "TAG", "getSmartEngineApkVersionCode", "context", "Landroid/content/Context;", "getUIEngineVersion", "isAssistantScreenSupportDeeplink", "", "isSupportCardWidget", "isSupportRender", "isSupportRenderDefaultCategory", "isSupportRequestCard", "queryAssistantMetaData", "Landroid/os/Bundle;", "queryAssistantSupportedFlag", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AssistantScreenSelector {
    private static final int FLAG_SUPPORT_DEFAULT_CATEGORY = 8;
    private static final int FLAG_SUPPORT_RENDER = 4;

    @NotNull
    public static final AssistantScreenSelector INSTANCE = new AssistantScreenSelector();

    @NotNull
    private static final String KEY_META_DATA_ASSISTANT_SUPPORT = "oplus.cardwidget.support";

    @NotNull
    private static final String KEY_META_DATA_ASSISTANT_SUPPORT_DEEPLINK = "oplus.assistantscreen.support.deeplink";

    @NotNull
    private static final String KEY_META_DATA_UI_ENGINE_VERSION = "com.oplus.uiengine.version";

    @NotNull
    private static final String PACKAGE_NAME_ASSISTANT_SCREEN = "com.coloros.assistantscreen";

    @NotNull
    private static final String PACKAGE_NAME_SMART_ENGINE = "com.oplus.smartengine";

    @NotNull
    private static final String TAG = "Compatibility.AssistantScreenSelector";

    private AssistantScreenSelector() {
    }

    private final int getSmartEngineApkVersionCode(Context context) {
        Object objM5287constructorimpl;
        int i = 0;
        try {
            Result.Companion companion = Result.INSTANCE;
            i = context.getPackageManager().getPackageInfo("com.oplus.smartengine", 0).versionCode;
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            Logger.INSTANCE.e(TAG, "getSmartEngineApkVersionCode getPackageInfo err! " + thM5290exceptionOrNullimpl.getMessage());
        }
        Logger.INSTANCE.i(TAG, "get SmartEngine versionCode: " + i);
        return i;
    }

    private final Bundle queryAssistantMetaData(Context context) {
        Object objM5287constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(context.getPackageManager().getApplicationInfo("com.coloros.assistantscreen", 128).metaData);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            Logger.INSTANCE.e(TAG, "queryAssistantMetaData get ast metaData err! " + thM5290exceptionOrNullimpl.getMessage());
        }
        Bundle bundle = new Bundle();
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = bundle;
        }
        return (Bundle) objM5287constructorimpl;
    }

    private final int queryAssistantSupportedFlag(Context context) {
        return queryAssistantMetaData(context).getInt(KEY_META_DATA_ASSISTANT_SUPPORT, 0);
    }

    @NotNull
    public final String getUIEngineVersion(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int smartEngineApkVersionCode = getSmartEngineApkVersionCode(context);
        Logger logger = Logger.INSTANCE;
        logger.d(TAG, "get uiEngine apk versionCode: " + smartEngineApkVersionCode);
        String ret = smartEngineApkVersionCode <= 0 ? queryAssistantMetaData(context).getString(KEY_META_DATA_UI_ENGINE_VERSION, "") : String.valueOf(smartEngineApkVersionCode);
        logger.d(TAG, "get UI Engine final version: " + ret);
        Intrinsics.checkNotNullExpressionValue(ret, "ret");
        return ret;
    }

    public final boolean isAssistantScreenSupportDeeplink(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return queryAssistantMetaData(context).getInt(KEY_META_DATA_ASSISTANT_SUPPORT_DEEPLINK, 0) >= 1;
    }

    public final boolean isSupportCardWidget(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (queryAssistantSupportedFlag(context) & 1) == 1 || getSmartEngineApkVersionCode(context) > 0;
    }

    public final boolean isSupportRender(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        int i = queryAssistantMetaData(context).getInt(KEY_META_DATA_ASSISTANT_SUPPORT, 0);
        Logger.INSTANCE.d(TAG, "isSupportRender, meta: " + i);
        return (i & 4) == 4;
    }

    public final boolean isSupportRenderDefaultCategory(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        int i = queryAssistantMetaData(context).getInt(KEY_META_DATA_ASSISTANT_SUPPORT, 0);
        Logger.INSTANCE.d(TAG, "isSupportRenderDefaultCategory, meta: " + i);
        return (i & 8) == 8;
    }

    public final boolean isSupportRequestCard(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (queryAssistantSupportedFlag(context) & 2) != 0;
    }
}

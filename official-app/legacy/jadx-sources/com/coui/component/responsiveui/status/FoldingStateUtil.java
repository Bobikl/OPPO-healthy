package com.coui.component.responsiveui.status;

import android.content.Context;
import android.database.ContentObserver;
import android.provider.Settings;
import android.util.Log;
import com.coui.component.responsiveui.ResponsiveUILog;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/coui/component/responsiveui/status/FoldingStateUtil;", "", "Landroid/content/Context;", "context", "Landroid/database/ContentObserver;", "observer", "", "registerFoldingStateObserver", "unregisterFoldingStateObserver", "Lcom/coui/component/responsiveui/status/FoldingState;", "getFoldingState", "", "a", "Z", "DEBUG", "<init>", "()V", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0})
public final class FoldingStateUtil {

    @NotNull
    public static final FoldingStateUtil INSTANCE = new FoldingStateUtil();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final boolean DEBUG;

    static {
        ResponsiveUILog responsiveUILog = ResponsiveUILog.INSTANCE;
        DEBUG = responsiveUILog.getLOG_DEBUG() || responsiveUILog.isLoggable("FoldingStateUtil", 3);
    }

    @JvmStatic
    @NotNull
    public static final FoldingState getFoldingState(@NotNull Context context) {
        FoldingState foldingState;
        Intrinsics.checkNotNullParameter(context, "context");
        int i = Settings.Global.getInt(context.getContentResolver(), "oplus_system_folding_mode", -1);
        if (i != 0) {
            foldingState = i != 1 ? FoldingState.UNKNOWN : FoldingState.UNFOLD;
        } else {
            foldingState = FoldingState.FOLD;
        }
        if (DEBUG) {
            Log.d("FoldingStateUtil", "[getFoldingState]: " + foldingState);
        }
        return foldingState;
    }

    @JvmStatic
    public static final void registerFoldingStateObserver(@NotNull Context context, @NotNull ContentObserver observer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(observer, "observer");
        context.getContentResolver().registerContentObserver(Settings.Global.getUriFor("oplus_system_folding_mode"), false, observer);
    }

    @JvmStatic
    public static final void unregisterFoldingStateObserver(@NotNull Context context, @NotNull ContentObserver observer) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(observer, "observer");
        context.getContentResolver().unregisterContentObserver(observer);
    }
}

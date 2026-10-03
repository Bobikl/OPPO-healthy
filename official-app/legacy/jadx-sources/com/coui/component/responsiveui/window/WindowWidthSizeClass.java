package com.coui.component.responsiveui.window;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.coui.component.responsiveui.ResponsiveUILog;
import com.coui.component.responsiveui.breakpoints.Breakpoints;
import com.coui.component.responsiveui.unit.Dp;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/coui/component/responsiveui/window/WindowWidthSizeClass;", "", "", "toString", "a", "Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;)V", "Companion", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0})
public final class WindowWidthSizeClass {

    @JvmField
    @NotNull
    public static final WindowWidthSizeClass Compact;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final WindowWidthSizeClass Expanded;

    @JvmField
    @NotNull
    public static final WindowWidthSizeClass Medium;
    public static final boolean b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String value;

    static {
        ResponsiveUILog responsiveUILog = ResponsiveUILog.INSTANCE;
        b = responsiveUILog.getLOG_DEBUG() || responsiveUILog.isLoggable("WindowSizeClass", 3);
        Compact = new WindowWidthSizeClass("Compact");
        Medium = new WindowWidthSizeClass("Medium");
        Expanded = new WindowWidthSizeClass("Expanded");
    }

    public WindowWidthSizeClass(String str) {
        this.value = str;
    }

    @NotNull
    public String toString() {
        return this.value + " window base-width";
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0010J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/coui/component/responsiveui/window/WindowWidthSizeClass$Companion;", "", "()V", "Compact", "Lcom/coui/component/responsiveui/window/WindowWidthSizeClass;", "DEBUG", "", "Expanded", "Medium", "TAG", "", "fromWidth", "context", "Landroid/content/Context;", Fields.WIDTH_FIELD, "", "Lcom/coui/component/responsiveui/unit/Dp;", "widthDp", "", "_hide_fromWidth", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmName(name = "_hide_fromWidth")
        @NotNull
        public final WindowWidthSizeClass _hide_fromWidth(float widthDp) {
            if (widthDp < Breakpoints.BP_MEDIUM_WINDOW_BASE_WIDTH.getValue()) {
                return WindowWidthSizeClass.Compact;
            }
            return widthDp < Breakpoints.BP_EXPANDED_WINDOW_BASE_WIDTH.getValue() ? WindowWidthSizeClass.Medium : WindowWidthSizeClass.Expanded;
        }

        @NotNull
        public final WindowWidthSizeClass fromWidth(@NotNull Dp width) {
            Intrinsics.checkNotNullParameter(width, "width");
            if (WindowWidthSizeClass.b) {
                Log.d("WindowWidthSizeClass", "[fromWidth] width : " + width);
            }
            if (width.getValue() >= 0.0f) {
                return _hide_fromWidth(width.getValue());
            }
            Log.e("WindowWidthSizeClass", "width :" + width.getValue() + " and Build.VERSION.SDK_INT:" + Build.VERSION.SDK_INT);
            return WindowWidthSizeClass.Compact;
        }

        @NotNull
        public final WindowWidthSizeClass fromWidth(@NotNull Context context, int width) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (WindowWidthSizeClass.b) {
                Log.d("WindowWidthSizeClass", "[fromWidth] width : " + width + " pixel");
            }
            if (width < 0) {
                Log.e("WindowWidthSizeClass", "width :" + width + " and Build.VERSION.SDK_INT:" + Build.VERSION.SDK_INT);
                return WindowWidthSizeClass.Compact;
            }
            return _hide_fromWidth(width / context.getResources().getDisplayMetrics().density);
        }
    }
}

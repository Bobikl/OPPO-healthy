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
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/coui/component/responsiveui/window/WindowTotalSizeClass;", "", "", "toString", "a", "Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;)V", "Companion", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0})
public final class WindowTotalSizeClass {

    @JvmField
    @NotNull
    public static final WindowTotalSizeClass Compact;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @JvmField
    @NotNull
    public static final WindowTotalSizeClass Expanded;

    @JvmField
    @NotNull
    public static final WindowTotalSizeClass ExpandedLandPortrait;

    @JvmField
    @NotNull
    public static final WindowTotalSizeClass ExpandedPortrait;

    @JvmField
    @NotNull
    public static final WindowTotalSizeClass MediumLandScape;

    @JvmField
    @NotNull
    public static final WindowTotalSizeClass MediumPortrait;

    @JvmField
    @NotNull
    public static final WindowTotalSizeClass MediumSquare;
    public static final boolean b;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String value;

    static {
        ResponsiveUILog responsiveUILog = ResponsiveUILog.INSTANCE;
        b = responsiveUILog.getLOG_DEBUG() || responsiveUILog.isLoggable("WindowSizeClass", 3);
        Compact = new WindowTotalSizeClass("Compact");
        MediumLandScape = new WindowTotalSizeClass("MediumLandScape");
        MediumSquare = new WindowTotalSizeClass("MediumSquare");
        MediumPortrait = new WindowTotalSizeClass("MediumPortrait");
        Expanded = new WindowTotalSizeClass("Expanded");
        ExpandedLandPortrait = new WindowTotalSizeClass("ExpandedLandPortrait");
        ExpandedPortrait = new WindowTotalSizeClass("ExpandedPortrait");
    }

    public WindowTotalSizeClass(String str) {
        this.value = str;
    }

    @NotNull
    public String toString() {
        return this.value + " window base-total";
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\tJ\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002R\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/coui/component/responsiveui/window/WindowTotalSizeClass$Companion;", "", "Lcom/coui/component/responsiveui/unit/Dp;", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "Lcom/coui/component/responsiveui/window/WindowTotalSizeClass;", "fromWidthAndHeight", "Landroid/content/Context;", "context", "", "", "widthDp", "heightDp", "a", "", "b", "Compact", "Lcom/coui/component/responsiveui/window/WindowTotalSizeClass;", "DEBUG", "Z", "Expanded", "ExpandedLandPortrait", "ExpandedPortrait", "MediumLandScape", "MediumPortrait", "MediumSquare", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WindowTotalSizeClass a(float widthDp, float heightDp) {
            WindowWidthSizeClass windowWidthSizeClass_hide_fromWidth = WindowWidthSizeClass.INSTANCE._hide_fromWidth(widthDp);
            if (Intrinsics.areEqual(windowWidthSizeClass_hide_fromWidth, WindowWidthSizeClass.Compact)) {
                return WindowTotalSizeClass.Compact;
            }
            if (Intrinsics.areEqual(windowWidthSizeClass_hide_fromWidth, WindowWidthSizeClass.Medium)) {
                WindowHeightSizeClass windowHeightSizeClass_hide_fromHeight = WindowHeightSizeClass.INSTANCE._hide_fromHeight(heightDp);
                if (Intrinsics.areEqual(windowHeightSizeClass_hide_fromHeight, WindowHeightSizeClass.Compact)) {
                    return WindowTotalSizeClass.MediumLandScape;
                }
                return Intrinsics.areEqual(windowHeightSizeClass_hide_fromHeight, WindowHeightSizeClass.Medium) ? WindowTotalSizeClass.MediumSquare : WindowTotalSizeClass.MediumPortrait;
            }
            WindowHeightSizeClass windowHeightSizeClass_hide_fromHeight2 = WindowHeightSizeClass.INSTANCE._hide_fromHeight(heightDp);
            if (Intrinsics.areEqual(windowHeightSizeClass_hide_fromHeight2, WindowHeightSizeClass.Compact)) {
                return WindowTotalSizeClass.ExpandedLandPortrait;
            }
            if (!Intrinsics.areEqual(windowHeightSizeClass_hide_fromHeight2, WindowHeightSizeClass.Medium) && b(widthDp, heightDp)) {
                return WindowTotalSizeClass.ExpandedPortrait;
            }
            return WindowTotalSizeClass.Expanded;
        }

        public final boolean b(float widthDp, float heightDp) {
            return heightDp > widthDp && widthDp < Breakpoints.BP_EXPANDED_WINDOW_MAXIMUM_WIDTH.getValue();
        }

        @NotNull
        public final WindowTotalSizeClass fromWidthAndHeight(@NotNull Dp width, @NotNull Dp height) {
            Intrinsics.checkNotNullParameter(width, "width");
            Intrinsics.checkNotNullParameter(height, "height");
            if (WindowTotalSizeClass.b) {
                Log.d("WindowHeightSizeClass", "[fromWidthAndHeight] width : " + width + ", height : " + height);
            }
            if (width.getValue() >= 0.0f && height.getValue() >= 0.0f) {
                return a(width.getValue(), height.getValue());
            }
            Log.e("WindowHeightSizeClass", "width :" + width.getValue() + " height :" + height.getValue() + " and Build.VERSION.SDK_INT:" + Build.VERSION.SDK_INT);
            return WindowTotalSizeClass.Compact;
        }

        @NotNull
        public final WindowTotalSizeClass fromWidthAndHeight(@NotNull Context context, int width, int height) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (WindowTotalSizeClass.b) {
                Log.d("WindowHeightSizeClass", "[fromWidthAndHeight] width : " + width + " pixel, height : " + height + " pixel");
            }
            if (width >= 0 && height >= 0) {
                float f = context.getResources().getDisplayMetrics().density;
                return a(width / f, height / f);
            }
            Log.e("WindowHeightSizeClass", "width :" + width + " height :" + height + " and Build.VERSION.SDK_INT:" + Build.VERSION.SDK_INT);
            return WindowTotalSizeClass.Compact;
        }
    }
}

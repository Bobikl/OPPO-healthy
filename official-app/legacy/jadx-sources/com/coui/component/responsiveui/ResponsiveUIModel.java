package com.coui.component.responsiveui;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import com.coui.component.responsiveui.layoutgrid.LayoutGridSystem;
import com.coui.component.responsiveui.layoutgrid.MarginType;
import com.coui.component.responsiveui.proxy.ResponsiveUIProxy;
import com.coui.component.responsiveui.status.WindowStatus;
import com.coui.component.responsiveui.unit.Dp;
import com.coui.component.responsiveui.unit.DpKt;
import com.coui.component.responsiveui.window.LayoutGridWindowSize;
import com.coui.component.responsiveui.window.WindowSizeClass;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 @2\u00020\u0001:\u0001@B\u0017\u0012\u0006\u0010/\u001a\u00020*\u0012\u0006\u00106\u001a\u00020\u0004¢\u0006\u0004\b;\u0010<B!\b\u0016\u0012\u0006\u0010=\u001a\u00020*\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b;\u0010>B!\b\u0016\u0012\u0006\u0010=\u001a\u00020*\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b;\u0010?J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u0016\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\nJ\u0006\u0010\u001b\u001a\u00020\nJ\u0006\u0010\u001c\u001a\u00020\u0018J\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010 \u001a\u00020\nJ\u0016\u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\nJ\u000e\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nJ\u0006\u0010&\u001a\u00020\nJ\u0006\u0010(\u001a\u00020'J\u0006\u0010)\u001a\u00020\u0004R\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\"\u00106\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006A"}, d2 = {"Lcom/coui/component/responsiveui/ResponsiveUIModel;", "", "Lcom/coui/component/responsiveui/IResponsiveUI;", "getResponsiveUI", "Lcom/coui/component/responsiveui/window/LayoutGridWindowSize;", "windowSize", "rebuild", "", "totalWidthDp", "totalHeightDp", "", "totalWidthPx", "totalHeightPx", "Landroid/content/res/Configuration;", "newConfig", "", "onConfigurationChanged", "", "showWindowStatusInfo", "showLayoutGridInfo", "layoutGridWindowWidth", "Lcom/coui/component/responsiveui/layoutgrid/MarginType;", "marginType", "chooseMargin", "", "allMargin", "margin", "columnCount", "columnWidth", "", "allColumnWidth", "()[[I", "gutter", "fromColumnIndex", "toColumnIndex", Fields.WIDTH_FIELD, "gridNumber", "calculateGridWidth", "windowOrientation", "Lcom/coui/component/responsiveui/window/WindowSizeClass;", "windowSizeClass", "layoutGridWindowSize", "Landroid/content/Context;", "a", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;", "mContext", "b", "Lcom/coui/component/responsiveui/window/LayoutGridWindowSize;", "getMWindowSize", "()Lcom/coui/component/responsiveui/window/LayoutGridWindowSize;", "setMWindowSize", "(Lcom/coui/component/responsiveui/window/LayoutGridWindowSize;)V", "mWindowSize", "Lcom/coui/component/responsiveui/proxy/ResponsiveUIProxy;", "c", "Lcom/coui/component/responsiveui/proxy/ResponsiveUIProxy;", "mResponsiveUIProxy", "<init>", "(Landroid/content/Context;Lcom/coui/component/responsiveui/window/LayoutGridWindowSize;)V", "context", "(Landroid/content/Context;FF)V", "(Landroid/content/Context;II)V", "Companion", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0})
public final class ResponsiveUIModel {
    public static final boolean d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context mContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public LayoutGridWindowSize mWindowSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ResponsiveUIProxy mResponsiveUIProxy;

    static {
        ResponsiveUILog responsiveUILog = ResponsiveUILog.INSTANCE;
        d = responsiveUILog.getLOG_DEBUG() || responsiveUILog.isLoggable("ResponsiveUIModel", 3);
    }

    public ResponsiveUIModel(@NotNull Context mContext, @NotNull LayoutGridWindowSize mWindowSize) {
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(mWindowSize, "mWindowSize");
        this.mContext = mContext;
        this.mWindowSize = mWindowSize;
        WindowStatus windowStatus = new WindowStatus(mContext.getResources().getConfiguration().orientation, WindowSizeClass.INSTANCE.calculateFromSize(DpKt.pixel2Dp(this.mWindowSize.getWidth(), mContext), DpKt.pixel2Dp(this.mWindowSize.getHeight(), mContext)), new LayoutGridWindowSize(this.mWindowSize));
        LayoutGridSystem layoutGridSystem = new LayoutGridSystem(mContext, windowStatus.windowSizeClass(), this.mWindowSize.getWidth());
        if (d) {
            Log.d("ResponsiveUIModel", "[init]: " + windowStatus);
            Log.d("ResponsiveUIModel", "[init]: " + layoutGridSystem);
        }
        this.mResponsiveUIProxy = new ResponsiveUIProxy(layoutGridSystem, windowStatus);
    }

    @NotNull
    public final int[][] allColumnWidth() {
        return this.mResponsiveUIProxy.allColumnWidth();
    }

    @NotNull
    public final int[] allMargin() {
        return this.mResponsiveUIProxy.allMargin();
    }

    public final int calculateGridWidth(int gridNumber) {
        if (gridNumber > this.mResponsiveUIProxy.columnCount()) {
            if (d) {
                Log.w("ResponsiveUIModel", "calculateGridWidth: requested grid number larger then current grid total number, fill the whole grid");
            }
            gridNumber = this.mResponsiveUIProxy.columnCount();
        }
        int iColumnCount = (this.mResponsiveUIProxy.columnCount() - gridNumber) / 2;
        return this.mResponsiveUIProxy.width(iColumnCount, (gridNumber + iColumnCount) - 1);
    }

    @NotNull
    public final ResponsiveUIModel chooseMargin(@NotNull MarginType marginType) {
        Intrinsics.checkNotNullParameter(marginType, "marginType");
        this.mResponsiveUIProxy.chooseMargin(marginType);
        return this;
    }

    public final int columnCount() {
        return this.mResponsiveUIProxy.columnCount();
    }

    @NotNull
    public final int[] columnWidth() {
        return this.mResponsiveUIProxy.columnWidth();
    }

    @NotNull
    public final Context getMContext() {
        return this.mContext;
    }

    @NotNull
    public final LayoutGridWindowSize getMWindowSize() {
        return this.mWindowSize;
    }

    @NotNull
    public final IResponsiveUI getResponsiveUI() {
        return this.mResponsiveUIProxy;
    }

    public final int gutter() {
        return this.mResponsiveUIProxy.gutter();
    }

    @NotNull
    public final LayoutGridWindowSize layoutGridWindowSize() {
        return this.mResponsiveUIProxy.layoutGridWindowSize();
    }

    public final int layoutGridWindowWidth() {
        return this.mResponsiveUIProxy.getLayoutGridWidthPixel();
    }

    public final int margin() {
        return this.mResponsiveUIProxy.margin();
    }

    public final void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.mWindowSize.setWidth((int) new Dp(newConfig.screenWidthDp).toPixel(this.mContext));
        this.mWindowSize.setHeight((int) new Dp(newConfig.screenWidthDp).toPixel(this.mContext));
        this.mResponsiveUIProxy.rebuild(this.mContext, this.mWindowSize);
    }

    @NotNull
    public final ResponsiveUIModel rebuild(@NotNull LayoutGridWindowSize windowSize) {
        Intrinsics.checkNotNullParameter(windowSize, "windowSize");
        this.mWindowSize = windowSize;
        this.mResponsiveUIProxy.rebuild(this.mContext, windowSize);
        return this;
    }

    public final void setMWindowSize(@NotNull LayoutGridWindowSize layoutGridWindowSize) {
        Intrinsics.checkNotNullParameter(layoutGridWindowSize, "<set-?>");
        this.mWindowSize = layoutGridWindowSize;
    }

    @NotNull
    public final String showLayoutGridInfo() {
        return this.mResponsiveUIProxy.showLayoutGridInfo();
    }

    @NotNull
    public final String showWindowStatusInfo() {
        return this.mResponsiveUIProxy.showWindowStatusInfo();
    }

    public final int width(int fromColumnIndex, int toColumnIndex) {
        return this.mResponsiveUIProxy.width(fromColumnIndex, toColumnIndex);
    }

    public final int windowOrientation() {
        return this.mResponsiveUIProxy.windowOrientation();
    }

    @NotNull
    public final WindowSizeClass windowSizeClass() {
        return this.mResponsiveUIProxy.windowSizeClass();
    }

    @NotNull
    public final ResponsiveUIModel rebuild(float totalWidthDp, float totalHeightDp) {
        this.mWindowSize.setWidth((int) new Dp(totalWidthDp).toPixel(this.mContext));
        this.mWindowSize.setHeight((int) new Dp(totalHeightDp).toPixel(this.mContext));
        this.mResponsiveUIProxy.rebuild(this.mContext, this.mWindowSize);
        return this;
    }

    @NotNull
    public final ResponsiveUIModel rebuild(int totalWidthPx, int totalHeightPx) {
        this.mWindowSize.setWidth(totalWidthPx);
        this.mWindowSize.setHeight(totalHeightPx);
        this.mResponsiveUIProxy.rebuild(this.mContext, this.mWindowSize);
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResponsiveUIModel(@NotNull Context context, float f, float f2) {
        this(context, new LayoutGridWindowSize(context, new Dp(f), new Dp(f2)));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ResponsiveUIModel(@NotNull Context context, int i, int i2) {
        this(context, new LayoutGridWindowSize(i, i2));
        Intrinsics.checkNotNullParameter(context, "context");
    }
}

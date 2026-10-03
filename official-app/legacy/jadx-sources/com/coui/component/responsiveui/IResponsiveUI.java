package com.coui.component.responsiveui;

import android.content.Context;
import com.coui.component.responsiveui.layoutgrid.ILayoutGrid;
import com.coui.component.responsiveui.status.IWindowStatus;
import com.coui.component.responsiveui.window.LayoutGridWindowSize;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&¨\u0006\r"}, d2 = {"Lcom/coui/component/responsiveui/IResponsiveUI;", "Lcom/coui/component/responsiveui/layoutgrid/ILayoutGrid;", "Lcom/coui/component/responsiveui/status/IWindowStatus;", "onConfigurationChanged", "", "context", "Landroid/content/Context;", "windowSize", "Lcom/coui/component/responsiveui/window/LayoutGridWindowSize;", "rebuild", "showLayoutGridInfo", "", "showWindowStatusInfo", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IResponsiveUI extends ILayoutGrid, IWindowStatus {
    void onConfigurationChanged(@NotNull Context context, @NotNull LayoutGridWindowSize windowSize);

    void rebuild(@NotNull Context context, @NotNull LayoutGridWindowSize windowSize);

    @NotNull
    String showLayoutGridInfo();

    @NotNull
    String showWindowStatusInfo();
}

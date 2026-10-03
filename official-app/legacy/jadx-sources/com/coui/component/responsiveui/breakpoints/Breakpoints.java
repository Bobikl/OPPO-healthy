package com.coui.component.responsiveui.breakpoints;

import com.coui.component.responsiveui.unit.Dp;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/coui/component/responsiveui/breakpoints/Breakpoints;", "", "()V", "BP_EXPANDED_WINDOW_BASE_HEIGHT", "Lcom/coui/component/responsiveui/unit/Dp;", "BP_EXPANDED_WINDOW_BASE_WIDTH", "BP_EXPANDED_WINDOW_MAXIMUM_WIDTH", "BP_MEDIUM_WINDOW_BASE_HEIGHT", "BP_MEDIUM_WINDOW_BASE_WIDTH", "toString", "", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBreakpoints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Breakpoints.kt\ncom/coui/component/responsiveui/breakpoints/Breakpoints\n+ 2 Dp.kt\ncom/coui/component/responsiveui/unit/DpKt\n*L\n1#1,42:1\n57#2:43\n57#2:44\n57#2:45\n57#2:46\n57#2:47\n*S KotlinDebug\n*F\n+ 1 Breakpoints.kt\ncom/coui/component/responsiveui/breakpoints/Breakpoints\n*L\n26#1:43\n28#1:44\n30#1:45\n32#1:46\n34#1:47\n*E\n"})
public final class Breakpoints {

    @NotNull
    public static final Breakpoints INSTANCE = new Breakpoints();

    @JvmField
    @NotNull
    public static final Dp BP_MEDIUM_WINDOW_BASE_WIDTH = new Dp(600);

    @JvmField
    @NotNull
    public static final Dp BP_EXPANDED_WINDOW_BASE_WIDTH = new Dp(840);

    @JvmField
    @NotNull
    public static final Dp BP_MEDIUM_WINDOW_BASE_HEIGHT = new Dp(480);

    @JvmField
    @NotNull
    public static final Dp BP_EXPANDED_WINDOW_BASE_HEIGHT = new Dp(900);

    @JvmField
    @NotNull
    public static final Dp BP_EXPANDED_WINDOW_MAXIMUM_WIDTH = new Dp(960);

    @NotNull
    public String toString() {
        return "BreakPoints Base-Width (" + BP_MEDIUM_WINDOW_BASE_WIDTH + ", " + BP_EXPANDED_WINDOW_BASE_WIDTH + "), Base-Height (" + BP_MEDIUM_WINDOW_BASE_HEIGHT + ", " + BP_EXPANDED_WINDOW_BASE_HEIGHT + "), Limited-Width (" + BP_EXPANDED_WINDOW_MAXIMUM_WIDTH + ')';
    }
}

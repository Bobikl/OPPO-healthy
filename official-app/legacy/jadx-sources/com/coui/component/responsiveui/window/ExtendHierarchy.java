package com.coui.component.responsiveui.window;

import android.content.Context;
import com.coui.component.responsiveui.unit.Dp;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/coui/component/responsiveui/window/ExtendHierarchy;", "", "()V", "Companion", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nExtendHierarchy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtendHierarchy.kt\ncom/coui/component/responsiveui/window/ExtendHierarchy\n+ 2 Dp.kt\ncom/coui/component/responsiveui/unit/DpKt\n*L\n1#1,79:1\n57#2:80\n57#2:81\n*S KotlinDebug\n*F\n+ 1 ExtendHierarchy.kt\ncom/coui/component/responsiveui/window/ExtendHierarchy\n*L\n26#1:80\n27#1:81\n*E\n"})
public final class ExtendHierarchy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Dp a = new Dp(280);

    @NotNull
    public static final Dp b = new Dp(360);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004J\u001e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/coui/component/responsiveui/window/ExtendHierarchy$Companion;", "", "()V", "EXPANDED_EXTEND_HIERARCHY_PARENT_WIDTH", "Lcom/coui/component/responsiveui/unit/Dp;", "MEDIUM_EXTEND_HIERARCHY_PARENT_WIDTH", "childWindowWidth", "", "context", "Landroid/content/Context;", "windowWidthSizeClass", "Lcom/coui/component/responsiveui/window/WindowWidthSizeClass;", "windowWidth", "", "parentWindowWidth", "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float childWindowWidth(@NotNull Context context, @NotNull WindowWidthSizeClass windowWidthSizeClass, int windowWidth) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(windowWidthSizeClass, "windowWidthSizeClass");
            return windowWidth - parentWindowWidth(context, windowWidthSizeClass, windowWidth);
        }

        public final float parentWindowWidth(@NotNull Context context, @NotNull WindowWidthSizeClass windowWidthSizeClass, int windowWidth) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(windowWidthSizeClass, "windowWidthSizeClass");
            if (Intrinsics.areEqual(windowWidthSizeClass, WindowWidthSizeClass.Medium)) {
                return ExtendHierarchy.a.toPixel(context);
            }
            return Intrinsics.areEqual(windowWidthSizeClass, WindowWidthSizeClass.Expanded) ? ExtendHierarchy.b.toPixel(context) : windowWidth;
        }

        @NotNull
        public final Dp childWindowWidth(@NotNull WindowWidthSizeClass windowWidthSizeClass, @NotNull Dp windowWidth) {
            Intrinsics.checkNotNullParameter(windowWidthSizeClass, "windowWidthSizeClass");
            Intrinsics.checkNotNullParameter(windowWidth, "windowWidth");
            return windowWidth.minus(parentWindowWidth(windowWidthSizeClass, windowWidth));
        }

        @NotNull
        public final Dp parentWindowWidth(@NotNull WindowWidthSizeClass windowWidthSizeClass, @NotNull Dp windowWidth) {
            Intrinsics.checkNotNullParameter(windowWidthSizeClass, "windowWidthSizeClass");
            Intrinsics.checkNotNullParameter(windowWidth, "windowWidth");
            if (Intrinsics.areEqual(windowWidthSizeClass, WindowWidthSizeClass.Medium)) {
                return ExtendHierarchy.a;
            }
            return Intrinsics.areEqual(windowWidthSizeClass, WindowWidthSizeClass.Expanded) ? ExtendHierarchy.b : windowWidth;
        }
    }
}

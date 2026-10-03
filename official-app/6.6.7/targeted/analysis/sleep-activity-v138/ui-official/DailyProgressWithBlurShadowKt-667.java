package com.heytap.health.daily.view.progress;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import com.heytap.health.daily.R$color;
import com.heytap.store.homemodule.data.HomeResponseData;
import com.oplus.aiunit.vision.c7n;
import io.protostuff.MapSchema;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0099\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a9\u0010\u001c\u001a\u00020\u0014*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001aQ\u0010\"\u001a\u00020\u0014*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u001ae\u0010&\u001a\u00020\u0014*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a2\u0010)\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b0\u0007ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a\u000f\u0010+\u001a\u00020\u0014H\u0007¢\u0006\u0004\b+\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"", "progress", "", MapSchema.FIELD_NAME_KEY, "Landroidx/compose/ui/unit/Dp;", "size", "strokeWidth", "", "Lkotlin/Pair;", "Landroidx/compose/ui/graphics/Color;", "progressColors", "progressBorderColor", "borderWidth", "shadowColor1", "shadowColor2", "", "enableAnimation", "enableShadow", "widthScale", "offsetX", "", "a", "(FFFLjava/util/List;JFJJZZFFLandroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/geometry/Offset;", "center", "radius", "color", c7n.g, "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFJ)V", "strokeWidthPx", "shadowColor", "shadowOffset", "shadowBlurRadius", "j", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFJFF)V", "borderWidthPx", "progressColor", "i", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFFLjava/util/List;J)V", "colorStops", c7n.f, "(FLjava/util/List;)J", "b", "(Landroidx/compose/runtime/Composer;I)V", "daily_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDailyProgressWithBlurShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DailyProgressWithBlurShadow.kt\ncom/heytap/health/daily/view/progress/DailyProgressWithBlurShadowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 7 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,465:1\n154#2:466\n154#2:467\n154#2:468\n154#2:469\n154#2:480\n154#2:500\n154#2:501\n154#2:502\n88#3:470\n88#3:471\n88#3:472\n88#3:481\n25#4:473\n1114#5,6:474\n37#6,2:482\n136#7,5:484\n261#7,11:489\n*S KotlinDebug\n*F\n+ 1 DailyProgressWithBlurShadow.kt\ncom/heytap/health/daily/view/progress/DailyProgressWithBlurShadowKt\n*L\n70#1:466\n71#1:467\n74#1:468\n80#1:469\n105#1:480\n444#1:500\n445#1:501\n458#1:502\n82#1:470\n83#1:471\n84#1:472\n105#1:481\n85#1:473\n85#1:474,6\n256#1:482,2\n287#1:484,5\n287#1:489,11\n*E\n"})
public final class DailyProgressWithBlurShadowKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(float f, float f2, float f3, @NotNull final List<Pair<Float, Color>> progressColors, final long j2, float f4, final long j3, long j4, boolean z, boolean z2, float f5, float f6, @Nullable Composer composer, final int i, final int i2, final int i3) {
        Intrinsics.checkNotNullParameter(progressColors, "progressColors");
        Composer composerStartRestartGroup = composer.startRestartGroup(771732346);
        float f7 = (i3 & 1) != 0 ? 0.75f : f;
        float fM4104constructorimpl = (i3 & 2) != 0 ? Dp.m4104constructorimpl(60) : f2;
        float fM4104constructorimpl2 = (i3 & 4) != 0 ? Dp.m4104constructorimpl(12) : f3;
        float fM4104constructorimpl3 = (i3 & 32) != 0 ? Dp.m4104constructorimpl(1) : f4;
        final long jColor = (i3 & 128) != 0 ? ColorKt.Color(436207616) : j4;
        final boolean z3 = (i3 & 256) != 0 ? true : z;
        final boolean z4 = (i3 & 512) != 0 ? true : z2;
        float f8 = (i3 & 1024) != 0 ? 1.0f : f5;
        float fM4104constructorimpl4 = (i3 & 2048) != 0 ? Dp.m4104constructorimpl(0) : f6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(771732346, i, i2, "com.heytap.health.daily.view.progress.DailyProgressWithBlurShadow (DailyProgressWithBlurShadow.kt:67)");
        }
        final float fM4104constructorimpl5 = Dp.m4104constructorimpl(fM4104constructorimpl * f8);
        final float fM4104constructorimpl6 = Dp.m4104constructorimpl(fM4104constructorimpl2 * f8);
        final float fM4104constructorimpl7 = Dp.m4104constructorimpl(fM4104constructorimpl3 * f8);
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue;
        EffectsKt.LaunchedEffect(Float.valueOf(f7), Boolean.valueOf(z3), new DailyProgressWithBlurShadowKt$DailyProgressWithBlurShadow$1(z3, animatable, f7, null), composerStartRestartGroup, (i & 14) | 512 | ((i >> 21) & 112));
        final float fFloatValue = ((Number) animatable.getValue()).floatValue();
        final long jColorResource = ColorResources_androidKt.colorResource(R$color.health_daily_background, composerStartRestartGroup, 0);
        final boolean z5 = z3;
        final float f9 = f7;
        final boolean z6 = z4;
        final long j5 = jColor;
        final float f10 = f8;
        CanvasKt.Canvas(SizeKt.m469size3ABfNKs(PaddingKt.m426padding3ABfNKs(Modifier.INSTANCE, Dp.m4104constructorimpl(Dp.m4104constructorimpl(5) * f8)), fM4104constructorimpl5), new Function1<DrawScope, Unit>() { // from class: com.heytap.health.daily.view.progress.DailyProgressWithBlurShadowKt$DailyProgressWithBlurShadow$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DrawScope Canvas) {
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                float fMo313toPx0680j_4 = Canvas.mo313toPx0680j_4(fM4104constructorimpl5);
                float fMo313toPx0680j_5 = Canvas.mo313toPx0680j_4(fM4104constructorimpl6);
                float f11 = (fMo313toPx0680j_4 - fMo313toPx0680j_5) / 2.0f;
                float f12 = fMo313toPx0680j_4 / 2.0f;
                long jOffset = OffsetKt.Offset(f12, f12);
                if (z5 || f9 < 1.0f) {
                    DailyProgressWithBlurShadowKt.h(Canvas, jOffset, f11, fMo313toPx0680j_5, jColorResource);
                }
                if (z6 && f9 > 0.0f) {
                    DailyProgressWithBlurShadowKt.j(Canvas, jOffset, f11, fMo313toPx0680j_5, fFloatValue, j5, Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(3)) * f10, Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(7)));
                }
                if (f9 > 0.0f) {
                    DailyProgressWithBlurShadowKt.i(Canvas, jOffset, f11, fMo313toPx0680j_5, Canvas.mo313toPx0680j_4(fM4104constructorimpl7), fFloatValue, progressColors, j2);
                }
            }
        }, composerStartRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final float f11 = f7;
        final float f12 = fM4104constructorimpl;
        final float f13 = fM4104constructorimpl2;
        final float f14 = fM4104constructorimpl3;
        final float f15 = f8;
        final float f16 = fM4104constructorimpl4;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.daily.view.progress.DailyProgressWithBlurShadowKt$DailyProgressWithBlurShadow$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i4) {
                DailyProgressWithBlurShadowKt.a(f11, f12, f13, progressColors, j2, f14, j3, jColor, z3, z4, f15, f16, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
            }
        });
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(showBackground = true)
    public static final void b(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(347707815);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(347707815, i, -1, "com.heytap.health.daily.view.progress.DailyProgressWithBlurShadowPreview (DailyProgressWithBlurShadow.kt:442)");
            }
            a(0.5f, Dp.m4104constructorimpl(60), Dp.m4104constructorimpl(12), CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Float.valueOf(0.0f), Color.m1608boximpl(ColorKt.Color(4293555212L))), TuplesKt.to(Float.valueOf(0.25f), Color.m1608boximpl(ColorKt.Color(4294280483L))), TuplesKt.to(Float.valueOf(0.8f), Color.m1608boximpl(ColorKt.Color(4294880357L))), TuplesKt.to(Float.valueOf(1.0f), Color.m1608boximpl(ColorKt.Color(4293555212L)))}), ColorKt.Color(4294953319L), Dp.m4104constructorimpl(1), ColorKt.Color(1307674669), 0L, false, false, 3.0f, 0.0f, composerStartRestartGroup, 102460854, 6, 2688);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.daily.view.progress.DailyProgressWithBlurShadowKt$DailyProgressWithBlurShadowPreview$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i2) {
                DailyProgressWithBlurShadowKt.b(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    public static final long g(float f, @NotNull List<Pair<Float, Color>> colorStops) {
        Intrinsics.checkNotNullParameter(colorStops, "colorStops");
        float fCoerceIn = RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f);
        int size = colorStops.size() - 1;
        int i = 0;
        while (i < size) {
            Pair<Float, Color> pair = colorStops.get(i);
            float fFloatValue = pair.component1().floatValue();
            long jM1628unboximpl = pair.component2().m1628unboximpl();
            i++;
            Pair<Float, Color> pair2 = colorStops.get(i);
            float fFloatValue2 = pair2.component1().floatValue();
            long jM1628unboximpl2 = pair2.component2().m1628unboximpl();
            if (fFloatValue <= fCoerceIn && fCoerceIn <= fFloatValue2) {
                return ColorKt.m1669lerpjxsXWHM(jM1628unboximpl, jM1628unboximpl2, (fCoerceIn - fFloatValue) / (fFloatValue2 - fFloatValue));
            }
        }
        return ((Color) ((Pair) CollectionsKt___CollectionsKt.last((List) colorStops)).getSecond()).m1628unboximpl();
    }

    public static final void h(DrawScope drawScope, long j2, float f, float f2, long j3) {
        float f3 = 2 * f;
        DrawScope.m2133drawArcyD3GUKo$default(drawScope, j3, -90.0f, 360.0f, false, OffsetKt.Offset(Offset.m1380getXimpl(j2) - f, Offset.m1381getYimpl(j2) - f), androidx.compose.ui.geometry.SizeKt.Size(f3, f3), 0.0f, new Stroke(f2, 0.0f, StrokeCap.INSTANCE.m1962getRoundKaPHkGw(), 0, null, 26, null), null, 0, HomeResponseData.MODEL_CODE_BRAND, null);
    }

    public static final void i(DrawScope drawScope, long j2, float f, float f2, float f3, float f4, List<Pair<Float, Color>> list, long j3) {
        Float fValueOf = Float.valueOf(1.0f);
        float fMin = Math.min(f4, 1.0f) * 360.0f;
        Brush.Companion companion = Brush.INSTANCE;
        Pair[] pairArr = (Pair[]) list.toArray(new Pair[0]);
        Brush brushM1574sweepGradientUv8p0NA$default = Brush.Companion.m1574sweepGradientUv8p0NA$default(companion, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 0L, 2, (Object) null);
        long jM1628unboximpl = ((Color) ((Pair) CollectionsKt___CollectionsKt.first((List) list)).getSecond()).m1628unboximpl();
        float f5 = f2 / 2.0f;
        Float fValueOf2 = Float.valueOf(0.0f);
        if (f4 < 1.0f) {
            float fM1380getXimpl = Offset.m1380getXimpl(j2);
            float fM1381getYimpl = Offset.m1381getYimpl(j2) - f;
            float f6 = 2;
            float f7 = f5 * f6;
            DrawScope.m2132drawArcillE91I$default(drawScope, Brush.Companion.m1572radialGradientP_VxKs$default(companion, new Pair[]{TuplesKt.to(fValueOf2, Color.m1608boximpl(jM1628unboximpl)), TuplesKt.to(Float.valueOf(1 - (f3 / f5)), Color.m1608boximpl(jM1628unboximpl)), TuplesKt.to(fValueOf, Color.m1608boximpl(j3))}, OffsetKt.Offset(fM1380getXimpl, fM1381getYimpl), f2 / f6, 0, 8, (Object) null), -270.0f, 180.0f, true, OffsetKt.Offset(fM1380getXimpl - f5, fM1381getYimpl - f5), androidx.compose.ui.geometry.SizeKt.Size(f7, f7), 0.0f, null, null, 0, 960, null);
        }
        long jMo2152getCenterF1C5BW0 = drawScope.mo2152getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo2078getSizeNHjbRc = drawContext.mo2078getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo2084rotateUv8p0NA(-90.0f, jMo2152getCenterF1C5BW0);
        float f8 = 2;
        float f9 = f * f8;
        DrawScope.m2132drawArcillE91I$default(drawScope, brushM1574sweepGradientUv8p0NA$default, 0.0f, fMin, false, OffsetKt.Offset(Offset.m1380getXimpl(j2) - f, Offset.m1381getYimpl(j2) - f), androidx.compose.ui.geometry.SizeKt.Size(f9, f9), 0.0f, new Stroke(f2, 0.0f, 0, 0, null, 30, null), null, 0, HomeResponseData.MODEL_CODE_BRAND, null);
        drawContext.getCanvas().restore();
        drawContext.mo2079setSizeuvyYCjk(jMo2078getSizeNHjbRc);
        float f10 = f + f5;
        float f11 = f - f5;
        float f12 = f3 / 2.0f;
        float f13 = f10 - f12;
        float f14 = f11 + f12;
        if (f4 > 0.0f) {
            Pair pair = TuplesKt.to(fValueOf2, Color.m1608boximpl(j3));
            float f15 = 1;
            float f16 = f11 + f3;
            Pair pair2 = TuplesKt.to(Float.valueOf(f15 - (f3 / f16)), Color.m1608boximpl(j3));
            Color.Companion companion2 = Color.INSTANCE;
            Brush brushM1572radialGradientP_VxKs$default = Brush.Companion.m1572radialGradientP_VxKs$default(companion, new Pair[]{pair, pair2, TuplesKt.to(fValueOf, Color.m1608boximpl(companion2.m1653getTransparent0d7_KjU()))}, OffsetKt.Offset(Offset.m1380getXimpl(j2), Offset.m1381getYimpl(j2)), f16, 0, 8, (Object) null);
            long jOffset = OffsetKt.Offset(Offset.m1380getXimpl(j2) - f14, Offset.m1381getYimpl(j2) - f14);
            float f17 = f14 * f8;
            DefaultConstructorMarker defaultConstructorMarker = null;
            DrawScope.m2132drawArcillE91I$default(drawScope, brushM1572radialGradientP_VxKs$default, -90.0f, fMin, false, jOffset, androidx.compose.ui.geometry.SizeKt.Size(f17, f17), 0.0f, new Stroke(f3, 0.0f, 0, 0, null, 30, defaultConstructorMarker), null, 0, HomeResponseData.MODEL_CODE_BRAND, null);
            float f18 = f13 * f8;
            DrawScope.m2132drawArcillE91I$default(drawScope, Brush.Companion.m1572radialGradientP_VxKs$default(companion, new Pair[]{TuplesKt.to(fValueOf2, Color.m1608boximpl(companion2.m1653getTransparent0d7_KjU())), TuplesKt.to(Float.valueOf(f15 - (f3 / f10)), Color.m1608boximpl(companion2.m1653getTransparent0d7_KjU())), TuplesKt.to(fValueOf, Color.m1608boximpl(j3))}, OffsetKt.Offset(Offset.m1380getXimpl(j2), Offset.m1381getYimpl(j2)), f10, 0, 8, (Object) null), -90.0f, fMin, false, OffsetKt.Offset(Offset.m1380getXimpl(j2) - f13, Offset.m1381getYimpl(j2) - f13), androidx.compose.ui.geometry.SizeKt.Size(f18, f18), 0.0f, new Stroke(f3, 0.0f, 0, 0, null, 30, defaultConstructorMarker), null, 0, HomeResponseData.MODEL_CODE_BRAND, null);
            float f19 = 360.0f * f4;
            float f20 = f19 - 90.0f;
            if (f4 >= 1.0f) {
                double radians = Math.toRadians((((double) f19) - 90.0d) + ((double) 3));
                float fM1380getXimpl2 = Offset.m1380getXimpl(j2) + (((float) Math.cos(radians)) * f);
                float fM1381getYimpl2 = Offset.m1381getYimpl(j2) + (((float) Math.sin(radians)) * f);
                float f21 = f2 / f8;
                Brush brushM1571radialGradientP_VxKs$default = Brush.Companion.m1571radialGradientP_VxKs$default(companion, CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m1608boximpl(ColorKt.Color(4278190080L)), Color.m1608boximpl(companion2.m1653getTransparent0d7_KjU())}), OffsetKt.Offset(fM1380getXimpl2, fM1381getYimpl2), f21, 0, 8, (Object) null);
                long jOffset2 = OffsetKt.Offset(fM1380getXimpl2 - f21, fM1381getYimpl2 - f21);
                float f22 = f5 * f8;
                DrawScope.m2132drawArcillE91I$default(drawScope, brushM1571radialGradientP_VxKs$default, f20, 180.0f, true, jOffset2, androidx.compose.ui.geometry.SizeKt.Size(f22, f22), 0.0f, null, null, 0, 960, null);
            }
            double radians2 = Math.toRadians((((double) f19) - 90.0d) - ((double) 1));
            float fM1380getXimpl3 = Offset.m1380getXimpl(j2) + (((float) Math.cos(radians2)) * f);
            float fM1381getYimpl3 = Offset.m1381getYimpl(j2) + (((float) Math.sin(radians2)) * f);
            long jG = g(f4 % 1.0f, list);
            float f23 = f2 / f8;
            float f24 = f5 * f8;
            DrawScope.m2132drawArcillE91I$default(drawScope, Brush.Companion.m1572radialGradientP_VxKs$default(companion, new Pair[]{TuplesKt.to(fValueOf2, Color.m1608boximpl(jG)), TuplesKt.to(Float.valueOf(f15 - (f3 / f23)), Color.m1608boximpl(jG)), TuplesKt.to(fValueOf, Color.m1608boximpl(j3))}, OffsetKt.Offset(fM1380getXimpl3, fM1381getYimpl3), f23, 0, 8, (Object) null), f20, 180.0f, true, OffsetKt.Offset(fM1380getXimpl3 - f23, fM1381getYimpl3 - f23), androidx.compose.ui.geometry.SizeKt.Size(f24, f24), 0.0f, null, null, 0, 960, null);
        }
    }

    public static final void j(DrawScope drawScope, long j2, float f, float f2, float f3, long j3, float f4, float f5) {
        float fMin = Math.min(f3, 1.0f) * 360.0f;
        long jOffset = OffsetKt.Offset(Offset.m1380getXimpl(j2) + f4, Offset.m1381getYimpl(j2) + f4);
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas());
        Paint paint = new Paint();
        paint.setColor(ColorKt.m1672toArgb8_81llA(j3));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f2);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setMaskFilter(new BlurMaskFilter(f5, BlurMaskFilter.Blur.NORMAL));
        paint.setAntiAlias(true);
        nativeCanvas.drawArc(Offset.m1380getXimpl(jOffset) - f, Offset.m1381getYimpl(jOffset) - f, Offset.m1380getXimpl(jOffset) + f, Offset.m1381getYimpl(jOffset) + f, -90.0f, fMin, false, paint);
    }

    public static final int k(float f) {
        double d = f;
        int i = 0;
        if (0.0d <= d && d <= 1.0d) {
            i = 600;
        } else if (d > 1.0d) {
            i = (int) (f * 600.0f);
        }
        if (i > 3000) {
            return 3000;
        }
        return i;
    }
}
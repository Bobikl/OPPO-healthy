package com.heytap.health.main.view;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.heytap.health.ui.R$color;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u009f\u0001\u0010\u0015\u001a\u00020\u00142\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"", "", "dataPoints", "Landroidx/compose/ui/unit/Dp;", Fields.HEIGHT_FIELD, "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "gridLineColor", "lineColor", "pointColor", "pointRadius", "pointBorderWidth", "pointBorderColor", "lineWidth", "gridLineWidth", "", "animationDuration", "Landroidx/compose/runtime/MutableState;", "", "startAnimation", "", "a", "(Ljava/util/List;FJJJJFFJFFILandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;III)V", "c", "(Landroidx/compose/runtime/Composer;I)V", "health_impl_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBodyFatLineChartView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BodyFatLineChartView.kt\ncom/heytap/health/main/view/BodyFatLineChartViewKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,284:1\n154#2:285\n154#2:286\n154#2:287\n154#2:288\n154#2:289\n154#2:342\n154#2:343\n154#2:344\n154#2:345\n154#2:346\n154#2:380\n154#2:381\n154#2:382\n154#2:383\n154#2:384\n25#3:290\n460#3,13:316\n473#3,3:330\n25#3:335\n460#3,13:366\n473#3,3:385\n1114#4,6:291\n1114#4,6:336\n67#5,6:297\n73#5:329\n77#5:334\n67#5,6:347\n73#5:379\n77#5:389\n75#6:303\n76#6,11:305\n89#6:333\n75#6:353\n76#6,11:355\n89#6:388\n76#7:304\n76#7:354\n76#8:390\n*S KotlinDebug\n*F\n+ 1 BodyFatLineChartView.kt\ncom/heytap/health/main/view/BodyFatLineChartViewKt\n*L\n53#1:285\n58#1:286\n59#1:287\n61#1:288\n62#1:289\n262#1:342\n263#1:343\n264#1:344\n265#1:345\n266#1:346\n271#1:380\n274#1:381\n275#1:382\n277#1:383\n278#1:384\n71#1:290\n77#1:316,13\n77#1:330,3\n259#1:335\n260#1:366,13\n260#1:385,3\n71#1:291,6\n259#1:336,6\n77#1:297,6\n77#1:329\n77#1:334\n260#1:347,6\n260#1:379\n260#1:389\n77#1:303\n77#1:305,11\n77#1:333\n260#1:353\n260#1:355,11\n260#1:388\n77#1:304\n260#1:354\n72#1:390\n*E\n"})
public final class BodyFatLineChartViewKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@NotNull final List<Float> dataPoints, float f, long j2, long j3, long j4, long j5, float f2, float f3, long j6, float f4, float f5, int i, @NotNull final MutableState<Boolean> startAnimation, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
        Intrinsics.checkNotNullParameter(startAnimation, "startAnimation");
        Composer composerStartRestartGroup = composer.startRestartGroup(1596006503);
        float fM4104constructorimpl = (i4 & 2) != 0 ? Dp.m4104constructorimpl(200) : f;
        long jColor = (i4 & 4) != 0 ? ColorKt.Color(4293325823L) : j2;
        long jM1653getTransparent0d7_KjU = (i4 & 8) != 0 ? Color.INSTANCE.m1653getTransparent0d7_KjU() : j3;
        long jColor2 = (i4 & 16) != 0 ? ColorKt.Color(4278238420L) : j4;
        long jColor3 = (i4 & 32) != 0 ? ColorKt.Color(4278238420L) : j5;
        float fM4104constructorimpl2 = (i4 & 64) != 0 ? Dp.m4104constructorimpl(4) : f2;
        float fM4104constructorimpl3 = (i4 & 128) != 0 ? Dp.m4104constructorimpl(1) : f3;
        long jM1655getWhite0d7_KjU = (i4 & 256) != 0 ? Color.INSTANCE.m1655getWhite0d7_KjU() : j6;
        float fM4104constructorimpl4 = (i4 & 512) != 0 ? Dp.m4104constructorimpl(2) : f4;
        float fM4104constructorimpl5 = (i4 & 1024) != 0 ? Dp.m4104constructorimpl(2) : f5;
        int i5 = (i4 & 2048) != 0 ? 466 : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1596006503, i2, i3, "com.heytap.health.main.view.BodyFatLineChartView (BodyFatLineChartView.kt:50)");
        }
        if (dataPoints.isEmpty()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final float f6 = fM4104constructorimpl;
            final long j7 = jColor;
            final long j8 = jM1653getTransparent0d7_KjU;
            final long j9 = jColor2;
            final int i6 = i5;
            final long j10 = jColor3;
            final float f7 = fM4104constructorimpl2;
            final float f8 = fM4104constructorimpl3;
            final long j11 = jM1655getWhite0d7_KjU;
            final float f9 = fM4104constructorimpl4;
            final float f10 = fM4104constructorimpl5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.main.view.BodyFatLineChartViewKt$BodyFatLineChartView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i7) {
                    BodyFatLineChartViewKt.a(dataPoints, f6, j7, j8, j9, j10, f7, f8, j11, f9, f10, i6, startAnimation, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                }
            });
            return;
        }
        final int i7 = i5;
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        if (composerStartRestartGroup.rememberedValue() == Composer.INSTANCE.getEmpty()) {
            composerStartRestartGroup.updateRememberedValue(startAnimation);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(startAnimation.getValue().booleanValue() ? 1.0f : 0.0f, AnimationSpecKt.tween$default(i7, 0, null, 6, null), 0.0f, null, composerStartRestartGroup, 0, 12);
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM455height3ABfNKs = SizeKt.m455height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), fM4104constructorimpl);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
        ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM455height3ABfNKs);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        composerStartRestartGroup.disableReusing();
        Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composerStartRestartGroup);
        Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m1266setimpl(composerM1259constructorimpl, density, companion2.getSetDensity());
        Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
        Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
        composerStartRestartGroup.enableReusing();
        function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        final float f11 = fM4104constructorimpl2;
        final float f12 = fM4104constructorimpl5;
        final long j12 = jColor;
        final long j13 = jM1653getTransparent0d7_KjU;
        final long j14 = jColor2;
        final float f13 = fM4104constructorimpl;
        final float f14 = fM4104constructorimpl4;
        final float f15 = fM4104constructorimpl3;
        final long j15 = jColor3;
        final long j16 = jM1655getWhite0d7_KjU;
        CanvasKt.Canvas(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), new Function1<DrawScope, Unit>() { // from class: com.heytap.health.main.view.BodyFatLineChartViewKt$BodyFatLineChartView$3$1
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
                float f16;
                float f17;
                DrawScope drawScope;
                float f18;
                float f19;
                BodyFatLineChartViewKt$BodyFatLineChartView$3$1 bodyFatLineChartViewKt$BodyFatLineChartView$3$1 = this;
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                float fM1449getWidthimpl = Size.m1449getWidthimpl(Canvas.mo2153getSizeNHjbRc());
                float fM1446getHeightimpl = Size.m1446getHeightimpl(Canvas.mo2153getSizeNHjbRc());
                float f20 = 2;
                float fMo313toPx0680j_4 = Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(f20));
                float fMo313toPx0680j_5 = Canvas.mo313toPx0680j_4(Dp.m4104constructorimpl(1));
                List<Float> list = dataPoints;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((Number) next).floatValue() > 0.0f) {
                        arrayList.add(next);
                    }
                }
                Float fM6454minOrNull = CollectionsKt___CollectionsKt.m6454minOrNull((Iterable<Float>) arrayList);
                float fFloatValue = fM6454minOrNull != null ? fM6454minOrNull.floatValue() : 0.0f;
                Float fM6446maxOrNull = CollectionsKt___CollectionsKt.m6446maxOrNull((Iterable<Float>) arrayList);
                float fFloatValue2 = fM6446maxOrNull != null ? fM6446maxOrNull.floatValue() : 0.0f;
                float f21 = 0.1f * fFloatValue2;
                float f22 = fFloatValue - f21;
                float f23 = fFloatValue2 + f21;
                if (f22 == f23) {
                    f22 -= 1.0f;
                    f23 += 1.0f;
                }
                float f24 = f22;
                float f25 = f23 > f24 ? f23 - f24 : 1.0f;
                float fMo313toPx0680j_6 = Canvas.mo313toPx0680j_4(f11);
                float f26 = (fM1449getWidthimpl - (fMo313toPx0680j_6 * f20)) - (fMo313toPx0680j_5 * f20);
                float f27 = fM1446getHeightimpl - (3 * fMo313toPx0680j_6);
                float f28 = fMo313toPx0680j_6 + fMo313toPx0680j_5;
                float fMo313toPx0680j_7 = Canvas.mo313toPx0680j_4(f12) / f20;
                ArrayList arrayList2 = new ArrayList();
                for (int i8 = 0; i8 < 7; i8++) {
                    arrayList2.add(Float.valueOf(f28 + ((f26 / 6) * i8)));
                }
                float fFloatValue3 = ((Number) arrayList2.get(0)).floatValue() - fMo313toPx0680j_7;
                if (fFloatValue3 > 0.0f) {
                    DrawScope.m2150drawRoundRectuAw5IA$default(Canvas, j12, OffsetKt.Offset(0.0f, 0.0f), androidx.compose.ui.geometry.SizeKt.Size(fFloatValue3 - 0.0f, fM1446getHeightimpl), CornerRadiusKt.CornerRadius(fMo313toPx0680j_4, fMo313toPx0680j_4), null, 0.0f, null, 0, 240, null);
                }
                ArrayList arrayList3 = arrayList2;
                float fFloatValue4 = ((Number) arrayList3.get(arrayList2.size() - 1)).floatValue() + fMo313toPx0680j_7;
                if (fFloatValue4 < 0.0f + fM1449getWidthimpl) {
                    f16 = fMo313toPx0680j_4;
                    f17 = fM1446getHeightimpl;
                    DrawScope.m2150drawRoundRectuAw5IA$default(Canvas, j12, OffsetKt.Offset(fFloatValue4, 0.0f), androidx.compose.ui.geometry.SizeKt.Size(fM1449getWidthimpl - (fFloatValue4 - 0.0f), fM1446getHeightimpl), CornerRadiusKt.CornerRadius(fMo313toPx0680j_4, fMo313toPx0680j_4), null, 0.0f, null, 0, 240, null);
                } else {
                    f16 = fMo313toPx0680j_4;
                    f17 = fM1446getHeightimpl;
                }
                int i9 = 0;
                int i10 = 6;
                while (i9 < i10) {
                    ArrayList arrayList4 = arrayList3;
                    float fFloatValue5 = ((Number) arrayList4.get(i9)).floatValue() + fMo313toPx0680j_7;
                    int i11 = i9 + 1;
                    float fFloatValue6 = (((Number) arrayList4.get(i11)).floatValue() - fMo313toPx0680j_7) - fFloatValue5;
                    if (fFloatValue6 > 0.0f) {
                        float f29 = f17;
                        float f30 = f16;
                        f18 = f30;
                        f19 = f29;
                        DrawScope.m2150drawRoundRectuAw5IA$default(Canvas, j12, OffsetKt.Offset(fFloatValue5, 0.0f), androidx.compose.ui.geometry.SizeKt.Size(fFloatValue6, f29), CornerRadiusKt.CornerRadius(f30, f30), null, 0.0f, null, 0, 240, null);
                    } else {
                        f18 = f16;
                        f19 = f17;
                    }
                    i10 = i10;
                    f17 = f19;
                    i9 = i11;
                    f16 = f18;
                    arrayList3 = arrayList4;
                    bodyFatLineChartViewKt$BodyFatLineChartView$3$1 = this;
                }
                int i12 = i10;
                float f31 = f17;
                int i13 = 0;
                for (int i14 = 7; i13 < i14; i14 = i14) {
                    float f32 = f28 + ((f26 / i12) * i13);
                    DrawScope.m2140drawLineNGM6Ib0$default(Canvas, j13, OffsetKt.Offset(f32, 0.0f), OffsetKt.Offset(f32, 0.0f + f31), Canvas.mo313toPx0680j_4(f12), 0, null, 0.0f, null, 0, 496, null);
                    i13++;
                    i12 = i12;
                }
                ArrayList arrayList5 = new ArrayList();
                float size = dataPoints.size() > 1 ? f26 / (dataPoints.size() - 1) : 0.0f;
                float f33 = fMo313toPx0680j_6 + f27;
                List<Float> list2 = dataPoints;
                State<Float> state = stateAnimateFloatAsState;
                int i15 = 0;
                for (Object obj : list2) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    float fFloatValue7 = ((Number) obj).floatValue();
                    if (fFloatValue7 > 0.0f) {
                        float f34 = f33 - (((fFloatValue7 - f24) / f25) * f27);
                        arrayList5.add(Offset.m1369boximpl(OffsetKt.Offset(f28 + (i15 * size), f34 + ((f33 - f34) * (1.0f - BodyFatLineChartViewKt.b(state))))));
                    }
                    i15 = i16;
                }
                if (arrayList5.size() > 1) {
                    Path Path = AndroidPath_androidKt.Path();
                    Path.moveTo(Offset.m1380getXimpl(((Offset) arrayList5.get(0)).getPackedValue()), Offset.m1381getYimpl(((Offset) arrayList5.get(0)).getPackedValue()));
                    int size2 = arrayList5.size();
                    for (int i17 = 1; i17 < size2; i17++) {
                        long packedValue = ((Offset) arrayList5.get(i17 - 1)).getPackedValue();
                        long packedValue2 = ((Offset) arrayList5.get(i17)).getPackedValue();
                        float fM1380getXimpl = (Offset.m1380getXimpl(packedValue) + Offset.m1380getXimpl(packedValue2)) / f20;
                        Path.cubicTo(fM1380getXimpl, Offset.m1381getYimpl(packedValue), fM1380getXimpl, Offset.m1381getYimpl(packedValue2), Offset.m1380getXimpl(packedValue2), Offset.m1381getYimpl(packedValue2));
                    }
                    drawScope = Canvas;
                    DrawScope.m2144drawPathLG529CI$default(Canvas, Path, j14, 0.0f, new Stroke(Canvas.mo313toPx0680j_4(f14), 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                } else {
                    drawScope = Canvas;
                }
                float fMo313toPx0680j_8 = drawScope.mo313toPx0680j_4(f11);
                float fMo313toPx0680j_9 = drawScope.mo313toPx0680j_4(f15);
                long j17 = j15;
                long j18 = j16;
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    long packedValue3 = ((Offset) it2.next()).getPackedValue();
                    long j19 = j18;
                    long j20 = j17;
                    DrawScope.m2135drawCircleVaOC9Bg$default(Canvas, j17, fMo313toPx0680j_8, packedValue3, 0.0f, null, null, 0, 120, null);
                    if (fMo313toPx0680j_9 > 0.0f) {
                        DrawScope.m2135drawCircleVaOC9Bg$default(Canvas, j19, fMo313toPx0680j_8, packedValue3, 0.0f, new Stroke(fMo313toPx0680j_9, 0.0f, 0, 0, null, 30, null), null, 0, 104, null);
                    }
                    j18 = j19;
                    j17 = j20;
                }
            }
        }, composerStartRestartGroup, 6);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        final long j17 = jColor;
        final long j18 = jM1653getTransparent0d7_KjU;
        final long j19 = jColor2;
        final long j20 = jColor3;
        final float f16 = fM4104constructorimpl2;
        final float f17 = fM4104constructorimpl3;
        final long j21 = jM1655getWhite0d7_KjU;
        final float f18 = fM4104constructorimpl4;
        final float f19 = fM4104constructorimpl5;
        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.main.view.BodyFatLineChartViewKt$BodyFatLineChartView$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i8) {
                BodyFatLineChartViewKt.a(dataPoints, f13, j17, j18, j19, j20, f16, f17, j21, f18, f19, i7, startAnimation, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
            }
        });
    }

    public static final float b(State<Float> state) {
        return state.getValue().floatValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void c(@Nullable Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1584195480);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1584195480, i, -1, "com.heytap.health.main.view.TestChart (BodyFatLineChartView.kt:254)");
            }
            List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(52.0f), Float.valueOf(55.0f), Float.valueOf(36.0f), Float.valueOf(54.0f), Float.valueOf(86.0f), Float.valueOf(78.0f), Float.valueOf(77.0f)});
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            Modifier modifierM469size3ABfNKs = SizeKt.m469size3ABfNKs(Modifier.INSTANCE, Dp.m4104constructorimpl(158));
            Color.Companion companion = Color.INSTANCE;
            float f = 16;
            float f2 = 1;
            Modifier modifierM430paddingqDBjuR0$default = PaddingKt.m430paddingqDBjuR0$default(PaddingKt.m428paddingVpY3zN4$default(BorderKt.m173borderxT4_qwU(BackgroundKt.m162backgroundbw27NRU(modifierM469size3ABfNKs, companion.m1655getWhite0d7_KjU(), RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(f))), Dp.m4104constructorimpl(f2), companion.m1646getCyan0d7_KjU(), RoundedCornerShapeKt.m700RoundedCornerShape0680j_4(Dp.m4104constructorimpl(f))), Dp.m4104constructorimpl(14), 0.0f, 2, null), 0.0f, Dp.m4104constructorimpl(88), 0.0f, Dp.m4104constructorimpl(34), 5, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM430paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composerStartRestartGroup);
            Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl, density, companion2.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            long jColorResource = ColorResources_androidKt.colorResource(R$color.lib_ui_black_4, composerStartRestartGroup, 0);
            float f3 = 2;
            composer2 = composerStartRestartGroup;
            a(listListOf, Dp.m4104constructorimpl(36), jColorResource, jColorResource, 0L, 0L, Dp.m4104constructorimpl(3), Dp.m4104constructorimpl(f2), companion.m1655getWhite0d7_KjU(), Dp.m4104constructorimpl(f3), Dp.m4104constructorimpl(f3), 0, mutableState, composer2, 920125494, 390, 2096);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.main.view.BodyFatLineChartViewKt$TestChart$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // p010kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer3, int i2) {
                BodyFatLineChartViewKt.c(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}
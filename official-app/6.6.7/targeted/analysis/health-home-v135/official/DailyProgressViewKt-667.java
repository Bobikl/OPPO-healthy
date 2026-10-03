package com.heytap.health.daily.view.progress;

import android.graphics.Typeface;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.heytap.health.daily.R$string;
import com.heytap.health.health_archives.util.DownloadPDFManager;
import com.heytap.health.health_base.R$color;
import com.heytap.store.platform.videoplayer.base.BuildConfig;
import com.oplus.aiunit.model.DailyBean;
import com.oplus.aiunit.model.n04;
import com.oplus.aiunit.model.qva;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes16.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u001a\u000f\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\r\u001a\u00020\u00072\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u001a3\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "composeView", "Landroidx/lifecycle/LiveData;", "Lcom/heytap/health/daily/view/progress/DailyActivityData;", "dataLD", BuildConfig.VERSION_NAME, "isOnePlus", BuildConfig.VERSION_NAME, "g", "i", "(Landroidx/compose/runtime/Composer;I)V", BuildConfig.VERSION_NAME, "widthScale", "b", "(Landroidx/lifecycle/LiveData;FLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/oplus/aiunit/vision/cr4;", "topDailyBean", "bottomDailyBean", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "a", "(Landroidx/compose/ui/Modifier;Lcom/oplus/aiunit/vision/cr4;Lcom/oplus/aiunit/vision/cr4;FLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;II)V", BuildConfig.VERSION_NAME, "weight", "Landroid/graphics/Typeface;", "j", "dailyBean", "c", "(Lcom/oplus/aiunit/vision/cr4;Landroidx/compose/ui/Alignment$Horizontal;FLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/TextUnit;", "fontSize", "Landroidx/compose/ui/text/TextStyle;", "h", "(J)Landroidx/compose/ui/text/TextStyle;", "daily_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDailyProgressView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DailyProgressView.kt\ncom/heytap/health/daily/view/progress/DailyProgressViewKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 12 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,260:1\n154#2:261\n154#2:373\n154#2:375\n154#2:411\n67#3,6:262\n73#3:294\n68#3,5:295\n73#3:326\n77#3:331\n77#3:336\n75#4:268\n76#4,11:270\n75#4:300\n76#4,11:302\n89#4:330\n89#4:335\n75#4:346\n76#4,11:348\n89#4:380\n75#4:384\n76#4,11:386\n89#4:416\n75#4:438\n76#4,11:440\n89#4:474\n76#5:269\n76#5:301\n76#5:347\n76#5:385\n76#5:439\n460#6,13:281\n460#6,13:313\n473#6,3:327\n473#6,3:332\n460#6,13:359\n473#6,3:377\n460#6,13:397\n473#6,3:413\n25#6:418\n25#6:425\n460#6,13:451\n473#6,3:471\n1864#7,3:337\n75#8,6:340\n81#8:372\n85#8:381\n88#9:374\n88#9:376\n88#9:412\n78#10,2:382\n80#10:410\n84#10:417\n74#10,6:432\n80#10:464\n84#10:475\n1114#11,6:419\n1114#11,6:426\n146#12,2:465\n146#12,2:467\n146#12,2:469\n*S KotlinDebug\n*F\n+ 1 DailyProgressView.kt\ncom/heytap/health/daily/view/progress/DailyProgressViewKt\n*L\n81#1:261\n118#1:373\n146#1:375\n189#1:411\n81#1:262,6\n81#1:294\n82#1:295,5\n82#1:326\n82#1:331\n81#1:336\n81#1:268\n81#1:270,11\n82#1:300\n82#1:302,11\n82#1:330\n81#1:335\n108#1:346\n108#1:348,11\n108#1:380\n175#1:384\n175#1:386,11\n175#1:416\n214#1:438\n214#1:440,11\n214#1:474\n81#1:269\n82#1:301\n108#1:347\n175#1:385\n214#1:439\n81#1:281,13\n82#1:313,13\n82#1:327,3\n81#1:332,3\n108#1:359,13\n108#1:377,3\n175#1:397,13\n175#1:413,3\n211#1:418\n212#1:425\n214#1:451,13\n214#1:471,3\n100#1:337,3\n108#1:340,6\n108#1:372\n108#1:381\n118#1:374\n146#1:376\n189#1:412\n175#1:382,2\n175#1:410\n175#1:417\n214#1:432,6\n214#1:464\n214#1:475\n211#1:419,6\n212#1:426,6\n222#1:465,2\n229#1:467,2\n238#1:469,2\n*E\n"})
public final class DailyProgressViewKt {
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x0132  */
    /* JADX WARN: Code duplicated, block: B:74:0x013e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0142  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(@Nullable Modifier modifier, @NotNull final DailyBean dailyBean, @NotNull final DailyBean dailyBean2, float f, @NotNull final Alignment.Horizontal horizontal, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        int i4;
        Modifier modifier3;
        float f3;
        Function0 constructor;
        final Modifier modifier4;
        final float f4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(dailyBean, "topDailyBean");
        Intrinsics.checkNotNullParameter(dailyBean2, "bottomDailyBean");
        Intrinsics.checkNotNullParameter(horizontal, "horizontalAlignment");
        Composer composerStartRestartGroup = composer.startRestartGroup(1822956499);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(dailyBean) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(dailyBean2) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 7168) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
            }
            if ((i2 & 16) != 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                if (composerStartRestartGroup.changed(horizontal)) {
                    i4 = 16384;
                } else {
                    i4 = DownloadPDFManager.DEFAULT_BUFFER_SIZE;
                }
                i3 |= i4;
            }
            if ((46811 & i3) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (i6 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1822956499, i3, -1, "com.heytap.health.daily.view.progress.DailyDataView (DailyProgressView.kt:169)");
                }
                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                int i7 = i3 >> 6;
                int i8 = (i3 & 14) | 48 | (i7 & 896);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                int i9 = i8 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, horizontal, composerStartRestartGroup, (i9 & 112) | (i9 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                constructor = companion.getConstructor();
                Function3 function3MaterializerOf = LayoutKt.materializerOf(modifier3);
                int i10 = ((((i8 << 3) & 112) << 9) & 7168) | 6;
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
                Composer composer2 = Updater.constructor-impl(composerStartRestartGroup);
                Updater.set-impl(composer2, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.set-impl(composer2, density, companion.getSetDensity());
                Updater.set-impl(composer2, layoutDirection, companion.getSetLayoutDirection());
                Updater.set-impl(composer2, viewConfiguration, companion.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i10 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i11 = i3 >> 3;
                int i12 = (i3 >> 9) & 112;
                int i13 = i11 & 896;
                float f5 = f3;
                c(dailyBean, horizontal, f5, null, composerStartRestartGroup, (i11 & 14) | i12 | i13, 8);
                c(dailyBean2, horizontal, f5, PaddingKt.padding-qDBjuR0$default(Modifier.Companion, n04.PROGRESS_ZERO, Dp.constructor-impl(Dp.constructor-impl(12) * f3), n04.PROGRESS_ZERO, n04.PROGRESS_ZERO, 13, (Object) null), composerStartRestartGroup, (i7 & 14) | i12 | i13, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                f4 = f3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                f4 = f2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.daily.view.progress.DailyProgressViewKt$DailyDataView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i14) {
                    DailyProgressViewKt.a(modifier4, dailyBean, dailyBean2, f4, horizontal, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        f2 = f;
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (composerStartRestartGroup.changed(horizontal)) {
                i4 = 16384;
            } else {
                i4 = DownloadPDFManager.DEFAULT_BUFFER_SIZE;
            }
            i3 |= i4;
        }
        if ((46811 & i3) == 9362) {
            if (i5 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (i6 != 0) {
                f3 = 1.0f;
            } else {
                f3 = f2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1822956499, i3, -1, "com.heytap.health.daily.view.progress.DailyDataView (DailyProgressView.kt:169)");
            }
            Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            int i14 = i3 >> 6;
            int i15 = (i3 & 14) | 48 | (i14 & 896);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            int i16 = i15 >> 3;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(spaceBetween2, horizontal, composerStartRestartGroup, (i16 & 112) | (i16 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            constructor = companion2.getConstructor();
            Function3 function3MaterializerOf2 = LayoutKt.materializerOf(modifier3);
            int i17 = ((((i15 << 3) & 112) << 9) & 7168) | 6;
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
            Composer composer3 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.set-impl(composer3, density2, companion2.getSetDensity());
            Updater.set-impl(composer3, layoutDirection2, companion2.getSetLayoutDirection());
            Updater.set-impl(composer3, viewConfiguration2, companion2.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i17 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i18 = i3 >> 3;
            int i19 = (i3 >> 9) & 112;
            int i110 = i18 & 896;
            float f6 = f3;
            c(dailyBean, horizontal, f6, null, composerStartRestartGroup, (i18 & 14) | i19 | i110, 8);
            c(dailyBean2, horizontal, f6, PaddingKt.padding-qDBjuR0$default(Modifier.Companion, n04.PROGRESS_ZERO, Dp.constructor-impl(Dp.constructor-impl(12) * f3), n04.PROGRESS_ZERO, n04.PROGRESS_ZERO, 13, (Object) null), composerStartRestartGroup, (i14 & 14) | i19 | i110, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            f4 = f3;
        } else {
            if (i5 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (i6 != 0) {
                f3 = 1.0f;
            } else {
                f3 = f2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1822956499, i3, -1, "com.heytap.health.daily.view.progress.DailyDataView (DailyProgressView.kt:169)");
            }
            Arrangement.HorizontalOrVertical spaceBetween3 = Arrangement.INSTANCE.getSpaceBetween();
            int i111 = i3 >> 6;
            int i112 = (i3 & 14) | 48 | (i111 & 896);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            int i113 = i112 >> 3;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(spaceBetween3, horizontal, composerStartRestartGroup, (i113 & 112) | (i113 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            constructor = companion3.getConstructor();
            Function3 function3MaterializerOf3 = LayoutKt.materializerOf(modifier3);
            int i114 = ((((i112 << 3) & 112) << 9) & 7168) | 6;
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
            Composer composer4 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer4, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.set-impl(composer4, density3, companion3.getSetDensity());
            Updater.set-impl(composer4, layoutDirection3, companion3.getSetLayoutDirection());
            Updater.set-impl(composer4, viewConfiguration3, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf3.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i114 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            int i115 = i3 >> 3;
            int i116 = (i3 >> 9) & 112;
            int i117 = i115 & 896;
            float f7 = f3;
            c(dailyBean, horizontal, f7, null, composerStartRestartGroup, (i115 & 14) | i116 | i117, 8);
            c(dailyBean2, horizontal, f7, PaddingKt.padding-qDBjuR0$default(Modifier.Companion, n04.PROGRESS_ZERO, Dp.constructor-impl(Dp.constructor-impl(12) * f3), n04.PROGRESS_ZERO, n04.PROGRESS_ZERO, 13, (Object) null), composerStartRestartGroup, (i111 & 14) | i116 | i117, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            f4 = f3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.daily.view.progress.DailyProgressViewKt$DailyDataView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer5, int i118) {
                DailyProgressViewKt.a(modifier4, dailyBean, dailyBean2, f4, horizontal, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x0142  */
    /* JADX WARN: Code duplicated, block: B:52:0x014a  */
    /* JADX WARN: Code duplicated, block: B:55:0x015e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0166  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:67:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:72:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:74:0x0188 A[EDGE_INSN: B:74:0x0188->B:58:0x0188 BREAK  A[LOOP:0: B:48:0x0139->B:57:0x0183], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(LiveData<DailyActivityData> liveData, float f, Composer composer, final int i, final int i2) {
        final float f2;
        LiveData<DailyActivityData> mutableLiveData;
        LiveData<DailyActivityData> liveData2;
        int i3;
        float f3;
        DailyActivityData dailyActivityData;
        List listListOf;
        List listListOf2;
        ArrayList arrayList;
        Iterator it;
        int i4;
        LiveData<DailyActivityData> liveData3;
        Function0 constructor;
        final LiveData<DailyActivityData> liveData4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1261257027);
        int i5 = i2 & 1;
        int i6 = i5 != 0 ? i | 2 : i;
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 112) == 0) {
                f2 = f;
                i6 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
            }
            if (i5 != 1 && (i6 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                liveData4 = liveData;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        mutableLiveData = new MutableLiveData<>(new DailyActivityData(0, 0, 0, 0, 0, 0, 0, 0, 255, null));
                        i6 &= -15;
                    } else {
                        mutableLiveData = liveData;
                    }
                    if (i7 != 0) {
                        liveData2 = mutableLiveData;
                        i3 = i6;
                        f3 = 1.0f;
                    } else {
                        liveData2 = mutableLiveData;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1261257027, i3, -1, "com.heytap.health.daily.view.progress.DailyProgressView (DailyProgressView.kt:90)");
                    }
                    dailyActivityData = (DailyActivityData) LiveDataAdapterKt.observeAsState(liveData2, composerStartRestartGroup, 8).getValue();
                    if (dailyActivityData == null) {
                        dailyActivityData = new DailyActivityData(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
                    }
                    listListOf = CollectionsKt.listOf(new Integer[]{Integer.valueOf(dailyActivityData.getCurrentStep()), Integer.valueOf(dailyActivityData.getCurrentCalorie()), Integer.valueOf(dailyActivityData.getCurrentTime()), Integer.valueOf(dailyActivityData.getCurrentActive())});
                    listListOf2 = CollectionsKt.listOf(new Integer[]{Integer.valueOf(dailyActivityData.getTargetStep()), Integer.valueOf(dailyActivityData.getTargetCalorie()), Integer.valueOf(dailyActivityData.getTargetTime()), Integer.valueOf(dailyActivityData.getTargetActive())});
                    arrayList = new ArrayList();
                    it = listListOf.iterator();
                    i4 = 0;
                    while (true) {
                        liveData3 = liveData2;
                        if (it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        int i8 = i4 + 1;
                        if (i4 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        ((Number) next).intValue();
                        if (((Number) listListOf2.get(i4)).intValue() == 0) {
                            arrayList.add(Float.valueOf(n04.PROGRESS_ZERO));
                        } else {
                            arrayList.add(Float.valueOf(((Number) listListOf.get(i4)).floatValue() / ((Number) listListOf2.get(i4)).intValue()));
                        }
                        liveData2 = liveData3;
                        i4 = i8;
                    }
                    Modifier.Companion companion = Modifier.Companion;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(IntrinsicKt.height(companion, IntrinsicSize.Min), n04.PROGRESS_ZERO, 1, (Object) null);
                    Alignment.Companion companion2 = Alignment.Companion;
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    composerStartRestartGroup.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                    constructor = companion3.getConstructor();
                    Function3 function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxWidth$default);
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
                    Composer composer2 = Updater.constructor-impl(composerStartRestartGroup);
                    Updater.set-impl(composer2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.set-impl(composer2, density, companion3.getSetDensity());
                    Updater.set-impl(composer2, layoutDirection, companion3.getSetLayoutDirection());
                    Updater.set-impl(composer2, viewConfiguration, companion3.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    float f4 = 10;
                    float f5 = 5;
                    int i9 = ((i3 << 6) & 7168) | 24576;
                    a(PaddingKt.padding-qDBjuR0$default(RowScope.weight$default(rowScopeInstance, SizeKt.fillMaxHeight$default(companion, n04.PROGRESS_ZERO, 1, (Object) null), 1.0f, false, 2, (Object) null), n04.PROGRESS_ZERO, Dp.constructor-impl(Dp.constructor-impl(f5) * f3), Dp.constructor-impl(f4), Dp.constructor-impl(Dp.constructor-impl(f5) * f3), 1, (Object) null), new DailyBean(StringResources_androidKt.stringResource(R$string.health_daily_step_count, composerStartRestartGroup, 0), dailyActivityData.getCurrentStep(), StringResources_androidKt.stringResource(R$string.health_daily_activity_step_unit, new Object[]{Integer.valueOf(dailyActivityData.getTargetStep())}, composerStartRestartGroup, 64)), new DailyBean(StringResources_androidKt.stringResource(R$string.health_daily_exercise_time_short, composerStartRestartGroup, 0), dailyActivityData.getCurrentTime(), StringResources_androidKt.stringResource(R$string.health_daily_activity_duration_unit, new Object[]{Integer.valueOf(dailyActivityData.getTargetTime())}, composerStartRestartGroup, 64)), f3, companion2.getEnd(), composerStartRestartGroup, i9, 0);
                    DailyProgressItemKt.b(null, ((Number) arrayList.get(0)).floatValue(), ((Number) arrayList.get(1)).floatValue(), ((Number) arrayList.get(2)).floatValue(), ((Number) arrayList.get(3)).floatValue(), f3, false, false, composerStartRestartGroup, (i3 << 12) & 458752, 193);
                    a(PaddingKt.padding-qDBjuR0$default(RowScope.weight$default(rowScopeInstance, SizeKt.fillMaxHeight$default(companion, n04.PROGRESS_ZERO, 1, (Object) null), 1.0f, false, 2, (Object) null), Dp.constructor-impl(f4), Dp.constructor-impl(Dp.constructor-impl(f5) * f3), n04.PROGRESS_ZERO, Dp.constructor-impl(Dp.constructor-impl(f5) * f3), 4, (Object) null), new DailyBean(StringResources_androidKt.stringResource(R$string.health_daily_card_consumption, composerStartRestartGroup, 0), dailyActivityData.getCurrentCalorie(), StringResources_androidKt.stringResource(R$string.health_daily_activity_consumption_unit, new Object[]{Integer.valueOf(dailyActivityData.getTargetCalorie())}, composerStartRestartGroup, 64)), new DailyBean(StringResources_androidKt.stringResource(R$string.health_daily_sport_times_short, composerStartRestartGroup, 0), dailyActivityData.getCurrentActive(), StringResources_androidKt.stringResource(R$string.health_daily_activity_frequency_unit, new Object[]{Integer.valueOf(dailyActivityData.getTargetActive())}, composerStartRestartGroup, 64)), f3, companion2.getStart(), composerStartRestartGroup, i9, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f2 = f3;
                    liveData4 = liveData3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if (i5 != 0) {
                        i6 &= -15;
                    }
                    liveData2 = liveData;
                }
                i3 = i6;
                f3 = f2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1261257027, i3, -1, "com.heytap.health.daily.view.progress.DailyProgressView (DailyProgressView.kt:90)");
                }
                dailyActivityData = (DailyActivityData) LiveDataAdapterKt.observeAsState(liveData2, composerStartRestartGroup, 8).getValue();
                if (dailyActivityData == null) {
                    dailyActivityData = new DailyActivityData(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
                }
                listListOf = CollectionsKt.listOf(new Integer[]{Integer.valueOf(dailyActivityData.getCurrentStep()), Integer.valueOf(dailyActivityData.getCurrentCalorie()), Integer.valueOf(dailyActivityData.getCurrentTime()), Integer.valueOf(dailyActivityData.getCurrentActive())});
                listListOf2 = CollectionsKt.listOf(new Integer[]{Integer.valueOf(dailyActivityData.getTargetStep()), Integer.valueOf(dailyActivityData.getTargetCalorie()), Integer.valueOf(dailyActivityData.getTargetTime()), Integer.valueOf(dailyActivityData.getTargetActive())});
                arrayList = new ArrayList();
                it = listListOf.iterator();
                i4 = 0;
                while (true) {
                    liveData3 = liveData2;
                    if (it.hasNext()) {
                        break;
                        break;
                    }
                    Object next2 = it.next();
                    int i10 = i4 + 1;
                    if (i4 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ((Number) next2).intValue();
                    if (((Number) listListOf2.get(i4)).intValue() == 0) {
                        arrayList.add(Float.valueOf(n04.PROGRESS_ZERO));
                    } else {
                        arrayList.add(Float.valueOf(((Number) listListOf.get(i4)).floatValue() / ((Number) listListOf2.get(i4)).intValue()));
                    }
                    liveData2 = liveData3;
                    i4 = i10;
                }
                Modifier.Companion companion4 = Modifier.Companion;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(IntrinsicKt.height(companion4, IntrinsicSize.Min), n04.PROGRESS_ZERO, 1, (Object) null);
                Alignment.Companion companion5 = Alignment.Companion;
                Alignment.Vertical centerVertically2 = companion5.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                constructor = companion6.getConstructor();
                Function3 function3MaterializerOf2 = LayoutKt.materializerOf(modifierFillMaxWidth$default2);
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
                Composer composer3 = Updater.constructor-impl(composerStartRestartGroup);
                Updater.set-impl(composer3, measurePolicyRowMeasurePolicy2, companion6.getSetMeasurePolicy());
                Updater.set-impl(composer3, density2, companion6.getSetDensity());
                Updater.set-impl(composer3, layoutDirection2, companion6.getSetLayoutDirection());
                Updater.set-impl(composer3, viewConfiguration2, companion6.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                float f6 = 10;
                float f7 = 5;
                int i11 = ((i3 << 6) & 7168) | 24576;
                a(PaddingKt.padding-qDBjuR0$default(RowScope.weight$default(rowScopeInstance2, SizeKt.fillMaxHeight$default(companion4, n04.PROGRESS_ZERO, 1, (Object) null), 1.0f, false, 2, (Object) null), n04.PROGRESS_ZERO, Dp.constructor-impl(Dp.constructor-impl(f7) * f3), Dp.constructor-impl(f6), Dp.constructor-impl(Dp.constructor-impl(f7) * f3), 1, (Object) null), new DailyBean(StringResources_androidKt.stringResource(R$string.health_daily_step_count, composerStartRestartGroup, 0), dailyActivityData.getCurrentStep(), StringResources_androidKt.stringResource(R$string.health_daily_activity_step_unit, new Object[]{Integer.valueOf(dailyActivityData.getTargetStep())}, composerStartRestartGroup, 64)), new DailyBean(StringResources_androidKt.stringResource(R$string.health_daily_exercise_time_short, composerStartRestartGroup, 0), dailyActivityData.getCurrentTime(), StringResources_androidKt.stringResource(R$string.health_daily_activity_duration_unit, new Object[]{Integer.valueOf(dailyActivityData.getTargetTime())}, composerStartRestartGroup, 64)), f3, companion5.getEnd(), composerStartRestartGroup, i11, 0);
                DailyProgressItemKt.b(null, ((Number) arrayList.get(0)).floatValue(), ((Number) arrayList.get(1)).floatValue(), ((Number) arrayList.get(2)).floatValue(), ((Number) arrayList.get(3)).floatValue(), f3, false, false, composerStartRestartGroup, (i3 << 12) & 458752, 193);
                a(PaddingKt.padding-qDBjuR0$default(RowScope.weight$default(rowScopeInstance2, SizeKt.fillMaxHeight$default(companion4, n04.PROGRESS_ZERO, 1, (Object) null), 1.0f, false, 2, (Object) null), Dp.constructor-impl(f6), Dp.constructor-impl(Dp.constructor-impl(f7) * f3), n04.PROGRESS_ZERO, Dp.constructor-impl(Dp.constructor-impl(f7) * f3), 4, (Object) null), new DailyBean(StringResources_androidKt.stringResource(R$string.health_daily_card_consumption, composerStartRestartGroup, 0), dailyActivityData.getCurrentCalorie(), StringResources_androidKt.stringResource(R$string.health_daily_activity_consumption_unit, new Object[]{Integer.valueOf(dailyActivityData.getTargetCalorie())}, composerStartRestartGroup, 64)), new DailyBean(StringResources_androidKt.stringResource(R$string.health_daily_sport_times_short, composerStartRestartGroup, 0), dailyActivityData.getCurrentActive(), StringResources_androidKt.stringResource(R$string.health_daily_activity_frequency_unit, new Object[]{Integer.valueOf(dailyActivityData.getTargetActive())}, composerStartRestartGroup, 64)), f3, companion5.getStart(), composerStartRestartGroup, i11, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f2 = f3;
                liveData4 = liveData3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.daily.view.progress.DailyProgressViewKt$DailyProgressView$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer4, int i12) {
                    DailyProgressViewKt.b(liveData4, f2, composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i6 |= 48;
        f2 = f;
        if (i5 != 1) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    mutableLiveData = new MutableLiveData<>(new DailyActivityData(0, 0, 0, 0, 0, 0, 0, 0, 255, null));
                    i6 &= -15;
                } else {
                    mutableLiveData = liveData;
                }
                if (i7 != 0) {
                    liveData2 = mutableLiveData;
                    i3 = i6;
                    f3 = 1.0f;
                } else {
                    liveData2 = mutableLiveData;
                    i3 = i6;
                    f3 = f2;
                }
            } else {
                if (i5 != 0) {
                    mutableLiveData = new MutableLiveData<>(new DailyActivityData(0, 0, 0, 0, 0, 0, 0, 0, 255, null));
                    i6 &= -15;
                } else {
                    mutableLiveData = liveData;
                }
                if (i7 != 0) {
                    liveData2 = mutableLiveData;
                    i3 = i6;
                    f3 = 1.0f;
                } else {
                    liveData2 = mutableLiveData;
                    i3 = i6;
                    f3 = f2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261257027, i3, -1, "com.heytap.health.daily.view.progress.DailyProgressView (DailyProgressView.kt:90)");
            }
            dailyActivityData = (DailyActivityData) LiveDataAdapterKt.observeAsState(liveData2, composerStartRestartGroup, 8).getValue();
            if (dailyActivityData == null) {
                dailyActivityData = new DailyActivityData(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
            }
            listListOf = CollectionsKt.listOf(new Integer[]{Integer.valueOf(dailyActivityData.getCurrentStep()), Integer.valueOf(dailyActivityData.getCurrentCalorie()), Integer.valueOf(dailyActivityData.getCurrentTime()), Integer.valueOf(dailyActivityData.getCurrentActive())});
            listListOf2 = CollectionsKt.listOf(new Integer[]{Integer.valueOf(dailyActivityData.getTargetStep()), Integer.valueOf(dailyActivityData.getTargetCalorie()), Integer.valueOf(dailyActivityData.getTargetTime()), Integer.valueOf(dailyActivityData.getTargetActive())});
            arrayList = new ArrayList();
            it = listListOf.iterator();
            i4 = 0;
            while (true) {
                liveData3 = liveData2;
                if (it.hasNext()) {
                    break;
                    break;
                }
                Object next3 = it.next();
                int i12 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ((Number) next3).intValue();
                if (((Number) listListOf2.get(i4)).intValue() == 0) {
                    arrayList.add(Float.valueOf(n04.PROGRESS_ZERO));
                } else {
                    arrayList.add(Float.valueOf(((Number) listListOf.get(i4)).floatValue() / ((Number) listListOf2.get(i4)).intValue()));
                }
                liveData2 = liveData3;
                i4 = i12;
            }
            Modifier.Companion companion7 = Modifier.Companion;
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(IntrinsicKt.height(companion7, IntrinsicSize.Min), n04.PROGRESS_ZERO, 1, (Object) null);
            Alignment.Companion companion8 = Alignment.Companion;
            Alignment.Vertical centerVertically3 = companion8.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion9 = ComposeUiNode.Companion;
            constructor = companion9.getConstructor();
            Function3 function3MaterializerOf3 = LayoutKt.materializerOf(modifierFillMaxWidth$default3);
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
            Composer composer4 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer4, measurePolicyRowMeasurePolicy3, companion9.getSetMeasurePolicy());
            Updater.set-impl(composer4, density3, companion9.getSetDensity());
            Updater.set-impl(composer4, layoutDirection3, companion9.getSetLayoutDirection());
            Updater.set-impl(composer4, viewConfiguration3, companion9.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf3.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            float f8 = 10;
            float f9 = 5;
            int i13 = ((i3 << 6) & 7168) | 24576;
            a(PaddingKt.padding-qDBjuR0$default(RowScope.weight$default(rowScopeInstance3, SizeKt.fillMaxHeight$default(companion7, n04.PROGRESS_ZERO, 1, (Object) null), 1.0f, false, 2, (Object) null), n04.PROGRESS_ZERO, Dp.constructor-impl(Dp.constructor-impl(f9) * f3), Dp.constructor-impl(f8), Dp.constructor-impl(Dp.constructor-impl(f9) * f3), 1, (Object) null), new DailyBean(StringResources_androidKt.stringResource(R$string.health_daily_step_count, composerStartRestartGroup, 0), dailyActivityData.getCurrentStep(), StringResources_androidKt.stringResource(R$string.health_daily_activity_step_unit, new Object[]{Integer.valueOf(dailyActivityData.getTargetStep())}, composerStartRestartGroup, 64)), new DailyBean(StringResources_androidKt.stringResource(R$string.health_daily_exercise_time_short, composerStartRestartGroup, 0), dailyActivityData.getCurrentTime(), StringResources_androidKt.stringResource(R$string.health_daily_activity_duration_unit, new Object[]{Integer.valueOf(dailyActivityData.getTargetTime())}, composerStartRestartGroup, 64)), f3, companion8.getEnd(), composerStartRestartGroup, i13, 0);
            DailyProgressItemKt.b(null, ((Number) arrayList.get(0)).floatValue(), ((Number) arrayList.get(1)).floatValue(), ((Number) arrayList.get(2)).floatValue(), ((Number) arrayList.get(3)).floatValue(), f3, false, false, composerStartRestartGroup, (i3 << 12) & 458752, 193);
            a(PaddingKt.padding-qDBjuR0$default(RowScope.weight$default(rowScopeInstance3, SizeKt.fillMaxHeight$default(companion7, n04.PROGRESS_ZERO, 1, (Object) null), 1.0f, false, 2, (Object) null), Dp.constructor-impl(f8), Dp.constructor-impl(Dp.constructor-impl(f9) * f3), n04.PROGRESS_ZERO, Dp.constructor-impl(Dp.constructor-impl(f9) * f3), 4, (Object) null), new DailyBean(StringResources_androidKt.stringResource(R$string.health_daily_card_consumption, composerStartRestartGroup, 0), dailyActivityData.getCurrentCalorie(), StringResources_androidKt.stringResource(R$string.health_daily_activity_consumption_unit, new Object[]{Integer.valueOf(dailyActivityData.getTargetCalorie())}, composerStartRestartGroup, 64)), new DailyBean(StringResources_androidKt.stringResource(R$string.health_daily_sport_times_short, composerStartRestartGroup, 0), dailyActivityData.getCurrentActive(), StringResources_androidKt.stringResource(R$string.health_daily_activity_frequency_unit, new Object[]{Integer.valueOf(dailyActivityData.getTargetActive())}, composerStartRestartGroup, 64)), f3, companion8.getStart(), composerStartRestartGroup, i13, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f2 = f3;
            liveData4 = liveData3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    mutableLiveData = new MutableLiveData<>(new DailyActivityData(0, 0, 0, 0, 0, 0, 0, 0, 255, null));
                    i6 &= -15;
                } else {
                    mutableLiveData = liveData;
                }
                if (i7 != 0) {
                    liveData2 = mutableLiveData;
                    i3 = i6;
                    f3 = 1.0f;
                } else {
                    liveData2 = mutableLiveData;
                    i3 = i6;
                    f3 = f2;
                }
            } else {
                if (i5 != 0) {
                    mutableLiveData = new MutableLiveData<>(new DailyActivityData(0, 0, 0, 0, 0, 0, 0, 0, 255, null));
                    i6 &= -15;
                } else {
                    mutableLiveData = liveData;
                }
                if (i7 != 0) {
                    liveData2 = mutableLiveData;
                    i3 = i6;
                    f3 = 1.0f;
                } else {
                    liveData2 = mutableLiveData;
                    i3 = i6;
                    f3 = f2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1261257027, i3, -1, "com.heytap.health.daily.view.progress.DailyProgressView (DailyProgressView.kt:90)");
            }
            dailyActivityData = (DailyActivityData) LiveDataAdapterKt.observeAsState(liveData2, composerStartRestartGroup, 8).getValue();
            if (dailyActivityData == null) {
                dailyActivityData = new DailyActivityData(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
            }
            listListOf = CollectionsKt.listOf(new Integer[]{Integer.valueOf(dailyActivityData.getCurrentStep()), Integer.valueOf(dailyActivityData.getCurrentCalorie()), Integer.valueOf(dailyActivityData.getCurrentTime()), Integer.valueOf(dailyActivityData.getCurrentActive())});
            listListOf2 = CollectionsKt.listOf(new Integer[]{Integer.valueOf(dailyActivityData.getTargetStep()), Integer.valueOf(dailyActivityData.getTargetCalorie()), Integer.valueOf(dailyActivityData.getTargetTime()), Integer.valueOf(dailyActivityData.getTargetActive())});
            arrayList = new ArrayList();
            it = listListOf.iterator();
            i4 = 0;
            while (true) {
                liveData3 = liveData2;
                if (it.hasNext()) {
                    break;
                    break;
                }
                Object next4 = it.next();
                int i14 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ((Number) next4).intValue();
                if (((Number) listListOf2.get(i4)).intValue() == 0) {
                    arrayList.add(Float.valueOf(n04.PROGRESS_ZERO));
                } else {
                    arrayList.add(Float.valueOf(((Number) listListOf.get(i4)).floatValue() / ((Number) listListOf2.get(i4)).intValue()));
                }
                liveData2 = liveData3;
                i4 = i14;
            }
            Modifier.Companion companion10 = Modifier.Companion;
            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(IntrinsicKt.height(companion10, IntrinsicSize.Min), n04.PROGRESS_ZERO, 1, (Object) null);
            Alignment.Companion companion11 = Alignment.Companion;
            Alignment.Vertical centerVertically4 = companion11.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically4, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion12 = ComposeUiNode.Companion;
            constructor = companion12.getConstructor();
            Function3 function3MaterializerOf4 = LayoutKt.materializerOf(modifierFillMaxWidth$default4);
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
            Composer composer5 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer5, measurePolicyRowMeasurePolicy4, companion12.getSetMeasurePolicy());
            Updater.set-impl(composer5, density4, companion12.getSetDensity());
            Updater.set-impl(composer5, layoutDirection4, companion12.getSetLayoutDirection());
            Updater.set-impl(composer5, viewConfiguration4, companion12.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf4.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
            float f10 = 10;
            float f11 = 5;
            int i15 = ((i3 << 6) & 7168) | 24576;
            a(PaddingKt.padding-qDBjuR0$default(RowScope.weight$default(rowScopeInstance4, SizeKt.fillMaxHeight$default(companion10, n04.PROGRESS_ZERO, 1, (Object) null), 1.0f, false, 2, (Object) null), n04.PROGRESS_ZERO, Dp.constructor-impl(Dp.constructor-impl(f11) * f3), Dp.constructor-impl(f10), Dp.constructor-impl(Dp.constructor-impl(f11) * f3), 1, (Object) null), new DailyBean(StringResources_androidKt.stringResource(R$string.health_daily_step_count, composerStartRestartGroup, 0), dailyActivityData.getCurrentStep(), StringResources_androidKt.stringResource(R$string.health_daily_activity_step_unit, new Object[]{Integer.valueOf(dailyActivityData.getTargetStep())}, composerStartRestartGroup, 64)), new DailyBean(StringResources_androidKt.stringResource(R$string.health_daily_exercise_time_short, composerStartRestartGroup, 0), dailyActivityData.getCurrentTime(), StringResources_androidKt.stringResource(R$string.health_daily_activity_duration_unit, new Object[]{Integer.valueOf(dailyActivityData.getTargetTime())}, composerStartRestartGroup, 64)), f3, companion11.getEnd(), composerStartRestartGroup, i15, 0);
            DailyProgressItemKt.b(null, ((Number) arrayList.get(0)).floatValue(), ((Number) arrayList.get(1)).floatValue(), ((Number) arrayList.get(2)).floatValue(), ((Number) arrayList.get(3)).floatValue(), f3, false, false, composerStartRestartGroup, (i3 << 12) & 458752, 193);
            a(PaddingKt.padding-qDBjuR0$default(RowScope.weight$default(rowScopeInstance4, SizeKt.fillMaxHeight$default(companion10, n04.PROGRESS_ZERO, 1, (Object) null), 1.0f, false, 2, (Object) null), Dp.constructor-impl(f10), Dp.constructor-impl(Dp.constructor-impl(f11) * f3), n04.PROGRESS_ZERO, Dp.constructor-impl(Dp.constructor-impl(f11) * f3), 4, (Object) null), new DailyBean(StringResources_androidKt.stringResource(R$string.health_daily_card_consumption, composerStartRestartGroup, 0), dailyActivityData.getCurrentCalorie(), StringResources_androidKt.stringResource(R$string.health_daily_activity_consumption_unit, new Object[]{Integer.valueOf(dailyActivityData.getTargetCalorie())}, composerStartRestartGroup, 64)), new DailyBean(StringResources_androidKt.stringResource(R$string.health_daily_sport_times_short, composerStartRestartGroup, 0), dailyActivityData.getCurrentActive(), StringResources_androidKt.stringResource(R$string.health_daily_activity_frequency_unit, new Object[]{Integer.valueOf(dailyActivityData.getTargetActive())}, composerStartRestartGroup, 64)), f3, companion11.getStart(), composerStartRestartGroup, i15, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f2 = f3;
            liveData4 = liveData3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.daily.view.progress.DailyProgressViewKt$DailyProgressView$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer6, int i16) {
                DailyProgressViewKt.b(liveData4, f2, composer6, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00db  */
    /* JADX WARN: Code duplicated, block: B:68:0x0149  */
    /* JADX WARN: Code duplicated, block: B:71:0x0155  */
    /* JADX WARN: Code duplicated, block: B:72:0x0159  */
    /* JADX WARN: Code duplicated, block: B:75:0x0281  */
    /* JADX WARN: Code duplicated, block: B:80:0x028d  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(final DailyBean dailyBean, final Alignment.Horizontal horizontal, float f, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        float f2;
        int i4;
        Modifier modifier2;
        int i5;
        float f3;
        Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Function0 constructor;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1943066917);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(dailyBean) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontal) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 896) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 7168) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i3 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i6 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    if (i4 != 0) {
                        modifier3 = Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1943066917, i3, -1, "com.heytap.health.daily.view.progress.DataItem (DailyProgressView.kt:204)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.Companion;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = j(500);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Typeface typeface = (Typeface) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = j(600);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Typeface typeface2 = (Typeface) objRememberedValue2;
                    int i7 = ((i3 << 3) & 896) | ((i3 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    int i8 = i7 >> 3;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), horizontal, composerStartRestartGroup, (i8 & 112) | (i8 & 14));
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                    constructor = companion2.getConstructor();
                    Function3 function3MaterializerOf = LayoutKt.materializerOf(modifier3);
                    int i9 = ((((i7 << 3) & 112) << 9) & 7168) | 6;
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
                    Composer composer2 = Updater.constructor-impl(composerStartRestartGroup);
                    Updater.set-impl(composer2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.set-impl(composer2, density, companion2.getSetDensity());
                    Updater.set-impl(composer2, layoutDirection, companion2.getSetLayoutDirection());
                    Updater.set-impl(composer2, viewConfiguration, companion2.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i9 >> 3) & 112));
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    String title = dailyBean.getTitle();
                    long jColorResource = ColorResources_androidKt.colorResource(R$color.health_base_8A000000, composerStartRestartGroup, 0);
                    FontFamily FontFamily = AndroidTypeface_androidKt.FontFamily(typeface);
                    long sp = TextUnitKt.getSp(12);
                    TextUnitKt.checkArithmetic--R2X_6o(sp);
                    TextKt.Text--4IGK_g(title, (Modifier) null, jColorResource, 0L, (FontStyle) null, (FontWeight) null, FontFamily, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp), TextUnit.getValue-impl(sp) * f3)), composerStartRestartGroup, 0, 3072, 57274);
                    String strValueOf = String.valueOf(dailyBean.getValue());
                    int i10 = R$color.health_base_D9000000;
                    long jColorResource2 = ColorResources_androidKt.colorResource(i10, composerStartRestartGroup, 0);
                    FontFamily FontFamily2 = AndroidTypeface_androidKt.FontFamily(typeface2);
                    long sp2 = TextUnitKt.getSp(20);
                    TextUnitKt.checkArithmetic--R2X_6o(sp2);
                    TextKt.Text--4IGK_g(strValueOf, (Modifier) null, jColorResource2, 0L, (FontStyle) null, (FontWeight) null, FontFamily2, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getVisible-gIe3tQ8(), false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp2), TextUnit.getValue-impl(sp2) * f3)), composerStartRestartGroup, 0, 3504, 51130);
                    String goal = dailyBean.getGoal();
                    long jColorResource3 = ColorResources_androidKt.colorResource(i10, composerStartRestartGroup, 0);
                    FontWeight fontWeight = new FontWeight(n04.STATUS_DOWNLOAD_FINISH);
                    long sp3 = TextUnitKt.getSp(12);
                    TextUnitKt.checkArithmetic--R2X_6o(sp3);
                    TextKt.Text--4IGK_g(goal, (Modifier) null, jColorResource3, 0L, (FontStyle) null, fontWeight, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp3), TextUnit.getValue-impl(sp3) * f3)), composerStartRestartGroup, 196608, 3072, 57306);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    f3 = f2;
                    modifier4 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                final float f4 = f3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.daily.view.progress.DailyProgressViewKt$DataItem$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer3, int i11) {
                        DailyProgressViewKt.c(dailyBean, horizontal, f4, modifier4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 5851) == 1170) {
                if (i6 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f2;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1943066917, i3, -1, "com.heytap.health.daily.view.progress.DataItem (DailyProgressView.kt:204)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = j(500);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Typeface typeface3 = (Typeface) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = j(600);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Typeface typeface4 = (Typeface) objRememberedValue2;
                int i11 = ((i3 << 3) & 896) | ((i3 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                int i12 = i11 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), horizontal, composerStartRestartGroup, (i12 & 112) | (i12 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                constructor = companion3.getConstructor();
                Function3 function3MaterializerOf2 = LayoutKt.materializerOf(modifier3);
                int i13 = ((((i11 << 3) & 112) << 9) & 7168) | 6;
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
                Composer composer3 = Updater.constructor-impl(composerStartRestartGroup);
                Updater.set-impl(composer3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.set-impl(composer3, density2, companion3.getSetDensity());
                Updater.set-impl(composer3, layoutDirection2, companion3.getSetLayoutDirection());
                Updater.set-impl(composer3, viewConfiguration2, companion3.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf2.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i13 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                String title2 = dailyBean.getTitle();
                long jColorResource4 = ColorResources_androidKt.colorResource(R$color.health_base_8A000000, composerStartRestartGroup, 0);
                FontFamily FontFamily3 = AndroidTypeface_androidKt.FontFamily(typeface3);
                long sp4 = TextUnitKt.getSp(12);
                TextUnitKt.checkArithmetic--R2X_6o(sp4);
                TextKt.Text--4IGK_g(title2, (Modifier) null, jColorResource4, 0L, (FontStyle) null, (FontWeight) null, FontFamily3, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp4), TextUnit.getValue-impl(sp4) * f3)), composerStartRestartGroup, 0, 3072, 57274);
                String strValueOf2 = String.valueOf(dailyBean.getValue());
                int i14 = R$color.health_base_D9000000;
                long jColorResource5 = ColorResources_androidKt.colorResource(i14, composerStartRestartGroup, 0);
                FontFamily FontFamily4 = AndroidTypeface_androidKt.FontFamily(typeface4);
                long sp5 = TextUnitKt.getSp(20);
                TextUnitKt.checkArithmetic--R2X_6o(sp5);
                TextKt.Text--4IGK_g(strValueOf2, (Modifier) null, jColorResource5, 0L, (FontStyle) null, (FontWeight) null, FontFamily4, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getVisible-gIe3tQ8(), false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp5), TextUnit.getValue-impl(sp5) * f3)), composerStartRestartGroup, 0, 3504, 51130);
                String goal2 = dailyBean.getGoal();
                long jColorResource6 = ColorResources_androidKt.colorResource(i14, composerStartRestartGroup, 0);
                FontWeight fontWeight2 = new FontWeight(n04.STATUS_DOWNLOAD_FINISH);
                long sp6 = TextUnitKt.getSp(12);
                TextUnitKt.checkArithmetic--R2X_6o(sp6);
                TextKt.Text--4IGK_g(goal2, (Modifier) null, jColorResource6, 0L, (FontStyle) null, fontWeight2, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp6), TextUnit.getValue-impl(sp6) * f3)), composerStartRestartGroup, 196608, 3072, 57306);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                if (i6 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f2;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1943066917, i3, -1, "com.heytap.health.daily.view.progress.DataItem (DailyProgressView.kt:204)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = j(500);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Typeface typeface5 = (Typeface) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = j(600);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Typeface typeface6 = (Typeface) objRememberedValue2;
                int i15 = ((i3 << 3) & 896) | ((i3 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                int i16 = i15 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), horizontal, composerStartRestartGroup, (i16 & 112) | (i16 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                constructor = companion4.getConstructor();
                Function3 function3MaterializerOf3 = LayoutKt.materializerOf(modifier3);
                int i17 = ((((i15 << 3) & 112) << 9) & 7168) | 6;
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
                Composer composer4 = Updater.constructor-impl(composerStartRestartGroup);
                Updater.set-impl(composer4, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
                Updater.set-impl(composer4, density3, companion4.getSetDensity());
                Updater.set-impl(composer4, layoutDirection3, companion4.getSetLayoutDirection());
                Updater.set-impl(composer4, viewConfiguration3, companion4.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf3.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i17 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                String title3 = dailyBean.getTitle();
                long jColorResource7 = ColorResources_androidKt.colorResource(R$color.health_base_8A000000, composerStartRestartGroup, 0);
                FontFamily FontFamily5 = AndroidTypeface_androidKt.FontFamily(typeface5);
                long sp7 = TextUnitKt.getSp(12);
                TextUnitKt.checkArithmetic--R2X_6o(sp7);
                TextKt.Text--4IGK_g(title3, (Modifier) null, jColorResource7, 0L, (FontStyle) null, (FontWeight) null, FontFamily5, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp7), TextUnit.getValue-impl(sp7) * f3)), composerStartRestartGroup, 0, 3072, 57274);
                String strValueOf3 = String.valueOf(dailyBean.getValue());
                int i18 = R$color.health_base_D9000000;
                long jColorResource8 = ColorResources_androidKt.colorResource(i18, composerStartRestartGroup, 0);
                FontFamily FontFamily6 = AndroidTypeface_androidKt.FontFamily(typeface6);
                long sp8 = TextUnitKt.getSp(20);
                TextUnitKt.checkArithmetic--R2X_6o(sp8);
                TextKt.Text--4IGK_g(strValueOf3, (Modifier) null, jColorResource8, 0L, (FontStyle) null, (FontWeight) null, FontFamily6, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getVisible-gIe3tQ8(), false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp8), TextUnit.getValue-impl(sp8) * f3)), composerStartRestartGroup, 0, 3504, 51130);
                String goal3 = dailyBean.getGoal();
                long jColorResource9 = ColorResources_androidKt.colorResource(i18, composerStartRestartGroup, 0);
                FontWeight fontWeight3 = new FontWeight(n04.STATUS_DOWNLOAD_FINISH);
                long sp9 = TextUnitKt.getSp(12);
                TextUnitKt.checkArithmetic--R2X_6o(sp9);
                TextKt.Text--4IGK_g(goal3, (Modifier) null, jColorResource9, 0L, (FontStyle) null, fontWeight3, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp9), TextUnit.getValue-impl(sp9) * f3)), composerStartRestartGroup, 196608, 3072, 57306);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final float f5 = f3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.daily.view.progress.DailyProgressViewKt$DataItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer5, int i19) {
                    DailyProgressViewKt.c(dailyBean, horizontal, f5, modifier4, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 384;
        f2 = f;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 7168) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i3 & 5851) == 1170) {
                if (i6 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f2;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1943066917, i3, -1, "com.heytap.health.daily.view.progress.DataItem (DailyProgressView.kt:204)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = j(500);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Typeface typeface7 = (Typeface) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = j(600);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Typeface typeface8 = (Typeface) objRememberedValue2;
                int i19 = ((i3 << 3) & 896) | ((i3 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                int i110 = i19 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), horizontal, composerStartRestartGroup, (i110 & 112) | (i110 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                constructor = companion5.getConstructor();
                Function3 function3MaterializerOf4 = LayoutKt.materializerOf(modifier3);
                int i111 = ((((i19 << 3) & 112) << 9) & 7168) | 6;
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
                Composer composer5 = Updater.constructor-impl(composerStartRestartGroup);
                Updater.set-impl(composer5, measurePolicyColumnMeasurePolicy4, companion5.getSetMeasurePolicy());
                Updater.set-impl(composer5, density4, companion5.getSetDensity());
                Updater.set-impl(composer5, layoutDirection4, companion5.getSetLayoutDirection());
                Updater.set-impl(composer5, viewConfiguration4, companion5.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf4.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i111 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                String title4 = dailyBean.getTitle();
                long jColorResource10 = ColorResources_androidKt.colorResource(R$color.health_base_8A000000, composerStartRestartGroup, 0);
                FontFamily FontFamily7 = AndroidTypeface_androidKt.FontFamily(typeface7);
                long sp10 = TextUnitKt.getSp(12);
                TextUnitKt.checkArithmetic--R2X_6o(sp10);
                TextKt.Text--4IGK_g(title4, (Modifier) null, jColorResource10, 0L, (FontStyle) null, (FontWeight) null, FontFamily7, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp10), TextUnit.getValue-impl(sp10) * f3)), composerStartRestartGroup, 0, 3072, 57274);
                String strValueOf4 = String.valueOf(dailyBean.getValue());
                int i112 = R$color.health_base_D9000000;
                long jColorResource11 = ColorResources_androidKt.colorResource(i112, composerStartRestartGroup, 0);
                FontFamily FontFamily8 = AndroidTypeface_androidKt.FontFamily(typeface8);
                long sp11 = TextUnitKt.getSp(20);
                TextUnitKt.checkArithmetic--R2X_6o(sp11);
                TextKt.Text--4IGK_g(strValueOf4, (Modifier) null, jColorResource11, 0L, (FontStyle) null, (FontWeight) null, FontFamily8, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getVisible-gIe3tQ8(), false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp11), TextUnit.getValue-impl(sp11) * f3)), composerStartRestartGroup, 0, 3504, 51130);
                String goal4 = dailyBean.getGoal();
                long jColorResource12 = ColorResources_androidKt.colorResource(i112, composerStartRestartGroup, 0);
                FontWeight fontWeight4 = new FontWeight(n04.STATUS_DOWNLOAD_FINISH);
                long sp12 = TextUnitKt.getSp(12);
                TextUnitKt.checkArithmetic--R2X_6o(sp12);
                TextKt.Text--4IGK_g(goal4, (Modifier) null, jColorResource12, 0L, (FontStyle) null, fontWeight4, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp12), TextUnit.getValue-impl(sp12) * f3)), composerStartRestartGroup, 196608, 3072, 57306);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                if (i6 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f2;
                }
                if (i4 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1943066917, i3, -1, "com.heytap.health.daily.view.progress.DataItem (DailyProgressView.kt:204)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.Companion;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = j(500);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Typeface typeface9 = (Typeface) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = j(600);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Typeface typeface10 = (Typeface) objRememberedValue2;
                int i113 = ((i3 << 3) & 896) | ((i3 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                int i114 = i113 >> 3;
                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), horizontal, composerStartRestartGroup, (i114 & 112) | (i114 & 14));
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                constructor = companion6.getConstructor();
                Function3 function3MaterializerOf5 = LayoutKt.materializerOf(modifier3);
                int i115 = ((((i113 << 3) & 112) << 9) & 7168) | 6;
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
                Composer composer6 = Updater.constructor-impl(composerStartRestartGroup);
                Updater.set-impl(composer6, measurePolicyColumnMeasurePolicy5, companion6.getSetMeasurePolicy());
                Updater.set-impl(composer6, density5, companion6.getSetDensity());
                Updater.set-impl(composer6, layoutDirection5, companion6.getSetLayoutDirection());
                Updater.set-impl(composer6, viewConfiguration5, companion6.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf5.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i115 >> 3) & 112));
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                String title5 = dailyBean.getTitle();
                long jColorResource13 = ColorResources_androidKt.colorResource(R$color.health_base_8A000000, composerStartRestartGroup, 0);
                FontFamily FontFamily9 = AndroidTypeface_androidKt.FontFamily(typeface9);
                long sp13 = TextUnitKt.getSp(12);
                TextUnitKt.checkArithmetic--R2X_6o(sp13);
                TextKt.Text--4IGK_g(title5, (Modifier) null, jColorResource13, 0L, (FontStyle) null, (FontWeight) null, FontFamily9, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp13), TextUnit.getValue-impl(sp13) * f3)), composerStartRestartGroup, 0, 3072, 57274);
                String strValueOf5 = String.valueOf(dailyBean.getValue());
                int i116 = R$color.health_base_D9000000;
                long jColorResource14 = ColorResources_androidKt.colorResource(i116, composerStartRestartGroup, 0);
                FontFamily FontFamily10 = AndroidTypeface_androidKt.FontFamily(typeface10);
                long sp14 = TextUnitKt.getSp(20);
                TextUnitKt.checkArithmetic--R2X_6o(sp14);
                TextKt.Text--4IGK_g(strValueOf5, (Modifier) null, jColorResource14, 0L, (FontStyle) null, (FontWeight) null, FontFamily10, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getVisible-gIe3tQ8(), false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp14), TextUnit.getValue-impl(sp14) * f3)), composerStartRestartGroup, 0, 3504, 51130);
                String goal5 = dailyBean.getGoal();
                long jColorResource15 = ColorResources_androidKt.colorResource(i116, composerStartRestartGroup, 0);
                FontWeight fontWeight5 = new FontWeight(n04.STATUS_DOWNLOAD_FINISH);
                long sp15 = TextUnitKt.getSp(12);
                TextUnitKt.checkArithmetic--R2X_6o(sp15);
                TextKt.Text--4IGK_g(goal5, (Modifier) null, jColorResource15, 0L, (FontStyle) null, fontWeight5, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp15), TextUnit.getValue-impl(sp15) * f3)), composerStartRestartGroup, 196608, 3072, 57306);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            final float f6 = f3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.daily.view.progress.DailyProgressViewKt$DataItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer7, int i117) {
                    DailyProgressViewKt.c(dailyBean, horizontal, f6, modifier4, composer7, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 5851) == 1170) {
            if (i6 != 0) {
                f3 = 1.0f;
            } else {
                f3 = f2;
            }
            if (i4 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1943066917, i3, -1, "com.heytap.health.daily.view.progress.DataItem (DailyProgressView.kt:204)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = j(500);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Typeface typeface11 = (Typeface) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = j(600);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Typeface typeface12 = (Typeface) objRememberedValue2;
            int i117 = ((i3 << 3) & 896) | ((i3 >> 9) & 14);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            int i118 = i117 >> 3;
            MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), horizontal, composerStartRestartGroup, (i118 & 112) | (i118 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
            constructor = companion7.getConstructor();
            Function3 function3MaterializerOf6 = LayoutKt.materializerOf(modifier3);
            int i119 = ((((i117 << 3) & 112) << 9) & 7168) | 6;
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
            Composer composer7 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer7, measurePolicyColumnMeasurePolicy6, companion7.getSetMeasurePolicy());
            Updater.set-impl(composer7, density6, companion7.getSetDensity());
            Updater.set-impl(composer7, layoutDirection6, companion7.getSetLayoutDirection());
            Updater.set-impl(composer7, viewConfiguration6, companion7.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf6.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i119 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
            String title6 = dailyBean.getTitle();
            long jColorResource16 = ColorResources_androidKt.colorResource(R$color.health_base_8A000000, composerStartRestartGroup, 0);
            FontFamily FontFamily11 = AndroidTypeface_androidKt.FontFamily(typeface11);
            long sp16 = TextUnitKt.getSp(12);
            TextUnitKt.checkArithmetic--R2X_6o(sp16);
            TextKt.Text--4IGK_g(title6, (Modifier) null, jColorResource16, 0L, (FontStyle) null, (FontWeight) null, FontFamily11, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp16), TextUnit.getValue-impl(sp16) * f3)), composerStartRestartGroup, 0, 3072, 57274);
            String strValueOf6 = String.valueOf(dailyBean.getValue());
            int i1110 = R$color.health_base_D9000000;
            long jColorResource17 = ColorResources_androidKt.colorResource(i1110, composerStartRestartGroup, 0);
            FontFamily FontFamily12 = AndroidTypeface_androidKt.FontFamily(typeface12);
            long sp17 = TextUnitKt.getSp(20);
            TextUnitKt.checkArithmetic--R2X_6o(sp17);
            TextKt.Text--4IGK_g(strValueOf6, (Modifier) null, jColorResource17, 0L, (FontStyle) null, (FontWeight) null, FontFamily12, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getVisible-gIe3tQ8(), false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp17), TextUnit.getValue-impl(sp17) * f3)), composerStartRestartGroup, 0, 3504, 51130);
            String goal6 = dailyBean.getGoal();
            long jColorResource18 = ColorResources_androidKt.colorResource(i1110, composerStartRestartGroup, 0);
            FontWeight fontWeight6 = new FontWeight(n04.STATUS_DOWNLOAD_FINISH);
            long sp18 = TextUnitKt.getSp(12);
            TextUnitKt.checkArithmetic--R2X_6o(sp18);
            TextKt.Text--4IGK_g(goal6, (Modifier) null, jColorResource18, 0L, (FontStyle) null, fontWeight6, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp18), TextUnit.getValue-impl(sp18) * f3)), composerStartRestartGroup, 196608, 3072, 57306);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        } else {
            if (i6 != 0) {
                f3 = 1.0f;
            } else {
                f3 = f2;
            }
            if (i4 != 0) {
                modifier3 = Modifier.Companion;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1943066917, i3, -1, "com.heytap.health.daily.view.progress.DataItem (DailyProgressView.kt:204)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.Companion;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = j(500);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Typeface typeface13 = (Typeface) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = j(600);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Typeface typeface14 = (Typeface) objRememberedValue2;
            int i1111 = ((i3 << 3) & 896) | ((i3 >> 9) & 14);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            int i1112 = i1111 >> 3;
            MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), horizontal, composerStartRestartGroup, (i1112 & 112) | (i1112 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
            constructor = companion8.getConstructor();
            Function3 function3MaterializerOf7 = LayoutKt.materializerOf(modifier3);
            int i1113 = ((((i1111 << 3) & 112) << 9) & 7168) | 6;
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
            Composer composer8 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer8, measurePolicyColumnMeasurePolicy7, companion8.getSetMeasurePolicy());
            Updater.set-impl(composer8, density7, companion8.getSetDensity());
            Updater.set-impl(composer8, layoutDirection7, companion8.getSetLayoutDirection());
            Updater.set-impl(composer8, viewConfiguration7, companion8.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf7.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i1113 >> 3) & 112));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
            String title7 = dailyBean.getTitle();
            long jColorResource19 = ColorResources_androidKt.colorResource(R$color.health_base_8A000000, composerStartRestartGroup, 0);
            FontFamily FontFamily13 = AndroidTypeface_androidKt.FontFamily(typeface13);
            long sp19 = TextUnitKt.getSp(12);
            TextUnitKt.checkArithmetic--R2X_6o(sp19);
            TextKt.Text--4IGK_g(title7, (Modifier) null, jColorResource19, 0L, (FontStyle) null, (FontWeight) null, FontFamily13, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp19), TextUnit.getValue-impl(sp19) * f3)), composerStartRestartGroup, 0, 3072, 57274);
            String strValueOf7 = String.valueOf(dailyBean.getValue());
            int i1114 = R$color.health_base_D9000000;
            long jColorResource110 = ColorResources_androidKt.colorResource(i1114, composerStartRestartGroup, 0);
            FontFamily FontFamily14 = AndroidTypeface_androidKt.FontFamily(typeface14);
            long sp110 = TextUnitKt.getSp(20);
            TextUnitKt.checkArithmetic--R2X_6o(sp110);
            TextKt.Text--4IGK_g(strValueOf7, (Modifier) null, jColorResource110, 0L, (FontStyle) null, (FontWeight) null, FontFamily14, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.getVisible-gIe3tQ8(), false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp110), TextUnit.getValue-impl(sp110) * f3)), composerStartRestartGroup, 0, 3504, 51130);
            String goal7 = dailyBean.getGoal();
            long jColorResource111 = ColorResources_androidKt.colorResource(i1114, composerStartRestartGroup, 0);
            FontWeight fontWeight7 = new FontWeight(n04.STATUS_DOWNLOAD_FINISH);
            long sp111 = TextUnitKt.getSp(12);
            TextUnitKt.checkArithmetic--R2X_6o(sp111);
            TextKt.Text--4IGK_g(goal7, (Modifier) null, jColorResource111, 0L, (FontStyle) null, fontWeight7, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1) null, h(TextUnitKt.pack(TextUnit.getRawType-impl(sp111), TextUnit.getValue-impl(sp111) * f3)), composerStartRestartGroup, 196608, 3072, 57306);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        final float f7 = f3;
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.daily.view.progress.DailyProgressViewKt$DataItem$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer9, int i1115) {
                DailyProgressViewKt.c(dailyBean, horizontal, f7, modifier4, composer9, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
            }
        });
    }

    public static final void g(@NotNull ComposeView composeView, @NotNull final LiveData<DailyActivityData> liveData, boolean z) {
        Intrinsics.checkNotNullParameter(composeView, "composeView");
        Intrinsics.checkNotNullParameter(liveData, "dataLD");
        final float f = composeView.getResources().getDisplayMetrics().density;
        final float f2 = composeView.getResources().getConfiguration().fontScale;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(46227351, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.daily.view.progress.DailyProgressViewKt$addDailyCard$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(@Nullable Composer composer, int i) {
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(46227351, i, -1, "com.heytap.health.daily.view.progress.addDailyCard.<anonymous> (DailyProgressView.kt:63)");
                }
                float f3 = f;
                float f4 = f2;
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = DensityKt.Density(f3, f4);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                ProvidedValue[] providedValueArr = {CompositionLocalsKt.getLocalDensity().provides((Density) objRememberedValue)};
                final LiveData<DailyActivityData> liveData2 = liveData;
                CompositionLocalKt.CompositionLocalProvider(providedValueArr, ComposableLambdaKt.composableLambda(composer, 2115683031, true, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.daily.view.progress.DailyProgressViewKt$addDailyCard$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i2) {
                        if ((i2 & 11) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2115683031, i2, -1, "com.heytap.health.daily.view.progress.addDailyCard.<anonymous>.<anonymous> (DailyProgressView.kt:66)");
                        }
                        Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Modifier.Companion, n04.PROGRESS_ZERO, 1, (Object) null);
                        Alignment center = Alignment.Companion.getCenter();
                        LiveData<DailyActivityData> liveData3 = liveData2;
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                        Function0 constructor = companion.getConstructor();
                        Function3 function3MaterializerOf = LayoutKt.materializerOf(modifierFillMaxHeight$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composer2.disableReusing();
                        Composer composer3 = Updater.constructor-impl(composer2);
                        Updater.set-impl(composer3, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                        Updater.set-impl(composer3, density, companion.getSetDensity());
                        Updater.set-impl(composer3, layoutDirection, companion.getSetLayoutDirection());
                        Updater.set-impl(composer3, viewConfiguration, companion.getSetViewConfiguration());
                        composer2.enableReusing();
                        function3MaterializerOf.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        DailyProgressViewKt.b(liveData3, n04.PROGRESS_ZERO, composer2, 8, 2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), composer, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    public static final TextStyle h(long j) {
        return new TextStyle(0L, j, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), new LineHeightStyle(LineHeightStyle.Alignment.Companion.getCenter-PIaL0Z0(), LineHeightStyle.Trim.Companion.getNone-EVpEnUU(), (DefaultConstructorMarker) null), (LineBreak) null, (Hyphens) null, 3407869, (DefaultConstructorMarker) null);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 4294967295L, locale = "zh", showBackground = qva.SUPPORT_QUICK_APP)
    public static final void i(@Nullable Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-919687610);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-919687610, i, -1, "com.heytap.health.daily.view.progress.preView (DailyProgressView.kt:79)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier modifier = SizeKt.height-3ABfNKs(companion, Dp.constructor-impl(158));
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            Function0 constructor = companion3.getConstructor();
            Function3 function3MaterializerOf = LayoutKt.materializerOf(modifier);
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
            Composer composer2 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.set-impl(composer2, density, companion3.getSetDensity());
            Updater.set-impl(composer2, layoutDirection, companion3.getSetLayoutDirection());
            Updater.set-impl(composer2, viewConfiguration, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, n04.PROGRESS_ZERO, 1, (Object) null);
            Alignment center = companion2.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor2 = companion3.getConstructor();
            Function3 function3MaterializerOf2 = LayoutKt.materializerOf(modifierFillMaxHeight$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composer3 = Updater.constructor-impl(composerStartRestartGroup);
            Updater.set-impl(composer3, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.set-impl(composer3, density2, companion3.getSetDensity());
            Updater.set-impl(composer3, layoutDirection2, companion3.getSetLayoutDirection());
            Updater.set-impl(composer3, viewConfiguration2, companion3.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf2.invoke(SkippableUpdater.box-impl(SkippableUpdater.constructor-impl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            DailyActivityData dailyActivityData = new DailyActivityData(0, 0, 0, 0, 0, 0, 0, 0, 255, null);
            dailyActivityData.setCurrentStep(10234);
            b(new MutableLiveData(dailyActivityData), 1.0f, composerStartRestartGroup, 56, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.heytap.health.daily.view.progress.DailyProgressViewKt$preView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer4, int i2) {
                DailyProgressViewKt.i(composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }

    public static final Typeface j(int i) {
        Typeface typefaceCreate = Typeface.create(Typeface.create("sans-serif-medium", 0), i, false);
        Intrinsics.checkNotNullExpressionValue(typefaceCreate, "create(Typeface.create(\"…e.NORMAL), weight, false)");
        return typefaceCreate;
    }
}
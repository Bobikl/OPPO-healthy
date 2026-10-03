package com.heytap.health.bodyfat.ui;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.heytap.health.bodyfat.R$string;
import com.oplus.aiunit.vision.ChartXY;
import com.oplus.aiunit.vision.q12;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001aC\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "targetWeightG", "Lkotlin/Pair;", "", "minMax", "unit", "precision", "", "Lcom/heytap/health/bodyfat/ui/ChartDrawableData;", "a", "(Ljava/lang/Integer;Lkotlin/Pair;IILandroidx/compose/runtime/Composer;I)Ljava/util/List;", "bodyfat_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBodyFatChartCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BodyFatChartCompose.kt\ncom/heytap/health/bodyfat/ui/BodyFatChartComposeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,34:1\n1#2:35\n36#3:36\n1114#4,6:37\n*S KotlinDebug\n*F\n+ 1 BodyFatChartCompose.kt\ncom/heytap/health/bodyfat/ui/BodyFatChartComposeKt\n*L\n31#1:36\n31#1:37,6\n*E\n"})
public final class BodyFatChartComposeKt {
    @Composable
    @NotNull
    public static final List<ChartDrawableData> a(@Nullable Integer num, @NotNull Pair<Long, Long> minMax, int i, int i2, @Nullable Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(minMax, "minMax");
        composer.startReplaceableGroup(1819047876);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1819047876, i3, -1, "com.heytap.health.bodyfat.ui.createTargetWeightDrawableData (BodyFatChartCompose.kt:9)");
        }
        if (num != null) {
            Integer num2 = num.intValue() > 0 ? num : null;
            if (num2 != null) {
                float fH = q12.h(num2.intValue() / 1000, i);
                String weightStr = q12.e(fH, i2);
                int i4 = R$string.health_body_fat_chart_target_line_label;
                Intrinsics.checkNotNullExpressionValue(weightStr, "weightStr");
                final String strStringResource = StringResources_androidKt.stringResource(i4, new Object[]{weightStr}, composer, 64);
                long j2 = 2149502413L;
                float f = 0.66f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                long j3 = 16777215;
                List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new ChartXY[]{new ChartXY(minMax.getFirst().longValue(), Float.valueOf(fH)), new ChartXY(minMax.getSecond().longValue(), Float.valueOf(fH))});
                long j4 = 0;
                Pair pair = null;
                composer.startReplaceableGroup(1157296644);
                boolean zChanged = composer.changed(strStringResource);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1<Float, String>() { // from class: com.heytap.health.bodyfat.ui.BodyFatChartComposeKt$createTargetWeightDrawableData$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p010kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ String invoke(Float f4) {
                            return invoke(f4.floatValue());
                        }

                        @NotNull
                        public final String invoke(float f4) {
                            return strStringResource;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                List<ChartDrawableData> listListOf2 = CollectionsKt__CollectionsJVMKt.listOf(new ChartDrawableData(j2, f, f2, f3, j3, listListOf, j4, pair, (Function1) objRememberedValue, 192, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return listListOf2;
            }
        }
        List<ChartDrawableData> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return listEmptyList;
    }
}
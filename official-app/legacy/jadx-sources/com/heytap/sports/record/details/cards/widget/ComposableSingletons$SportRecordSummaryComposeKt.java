package com.heytap.sports.record.details.cards.widget;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.heytap.sports.R$color;
import com.oplus.aiunit.vision.mji;
import com.oplus.drs.core.net.entity.UploadStateAware;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function4;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$SportRecordSummaryComposeKt {

    @NotNull
    public static final ComposableSingletons$SportRecordSummaryComposeKt INSTANCE = new ComposableSingletons$SportRecordSummaryComposeKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function4<Integer, String, Composer, Integer, Unit> f105lambda1 = ComposableLambdaKt.composableLambdaInstance(-1304215793, false, new Function4<Integer, String, Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.cards.widget.ComposableSingletons$SportRecordSummaryComposeKt$lambda-1$1
        @Override // p010kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, String str, Composer composer, Integer num2) {
            invoke(num.intValue(), str, composer, num2.intValue());
            return Unit.INSTANCE;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(int i, @NotNull String str, @Nullable Composer composer, int i2) {
            int i3;
            Intrinsics.checkNotNullParameter(str, "str");
            if ((i2 & 14) == 0) {
                i3 = i2 | (composer.changed(i) ? 4 : 2);
            } else {
                i3 = i2;
            }
            if ((i2 & 112) == 0) {
                i3 |= composer.changed(str) ? 32 : 16;
            }
            int i4 = i3;
            if ((i4 & 731) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1304215793, i4, -1, "com.heytap.sports.record.details.cards.widget.ComposableSingletons$SportRecordSummaryComposeKt.lambda-1.<anonymous> (SportRecordSummaryCompose.kt:97)");
            }
            Painter painterPainterResource = PainterResources_androidKt.painterResource(i, composer, i4 & 14);
            ColorFilter colorFilterM1659tintxETnrds$default = ColorFilter.Companion.m1659tintxETnrds$default(ColorFilter.INSTANCE, ColorResources_androidKt.colorResource(R$color.sports_record_weather_icon, composer, 0), 0, 2, null);
            Modifier.Companion companion = Modifier.INSTANCE;
            ImageKt.Image(painterPainterResource, (String) null, SizeKt.m469size3ABfNKs(companion, Dp.m4104constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, colorFilterM1659tintxETnrds$default, composer, UploadStateAware.HTTP_DECRYPT_FAILED, 56);
            TextKt.m1201Text4IGK_g(str, PaddingKt.m430paddingqDBjuR0$default(companion, Dp.m4104constructorimpl(2), 0.0f, 0.0f, 0.0f, 14, null), ColorResources_androidKt.colorResource(R$color.sports_record_weather_text, composer, 0), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getW400(), mji.e(0, 1, null), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, ((i4 >> 3) & 14) | 199728, 0, 130960);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f106lambda2 = ComposableLambdaKt.composableLambdaInstance(504358538, false, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.record.details.cards.widget.ComposableSingletons$SportRecordSummaryComposeKt$lambda-2$1
        @Override // p010kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
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
                ComposerKt.traceEventStart(504358538, i, -1, "com.heytap.sports.record.details.cards.widget.ComposableSingletons$SportRecordSummaryComposeKt.lambda-2.<anonymous> (SportRecordSummaryCompose.kt:113)");
            }
            float f = 8;
            BoxKt.Box(BackgroundKt.m163backgroundbw27NRU$default(SizeKt.m455height3ABfNKs(SizeKt.m474width3ABfNKs(PaddingKt.m428paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m4104constructorimpl(f), 0.0f, 2, null), Dp.m4104constructorimpl((float) 0.6d)), Dp.m4104constructorimpl(f)), ColorResources_androidKt.colorResource(R$color.sports_record_weather_split, composer, 0), null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @NotNull
    public final Function4<Integer, String, Composer, Integer, Unit> a() {
        return f105lambda1;
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> b() {
        return f106lambda2;
    }
}

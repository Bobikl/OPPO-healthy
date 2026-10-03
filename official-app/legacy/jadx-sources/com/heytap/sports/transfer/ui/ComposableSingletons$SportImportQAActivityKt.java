package com.heytap.sports.transfer.ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import com.heytap.sports.R$string;
import com.heytap.sports.transfer.ui.theme.SportTransferThemeKt;
import com.oplus.aiunit.vision.TransferExtendedColors;
import com.oplus.weatherservicesdk.data.Weather;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class ComposableSingletons$SportImportQAActivityKt {

    @NotNull
    public static final ComposableSingletons$SportImportQAActivityKt INSTANCE = new ComposableSingletons$SportImportQAActivityKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static Function2<Composer, Integer, Unit> f132lambda1 = ComposableLambdaKt.composableLambdaInstance(-1505383057, false, new Function2<Composer, Integer, Unit>() { // from class: com.heytap.sports.transfer.ui.ComposableSingletons$SportImportQAActivityKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1505383057, i, -1, "com.heytap.sports.transfer.ui.ComposableSingletons$SportImportQAActivityKt.lambda-1.<anonymous> (SportImportQAActivity.kt:84)");
            }
            Modifier modifierM426padding3ABfNKs = PaddingKt.m426padding3ABfNKs(Modifier.INSTANCE, Dp.m4104constructorimpl(20));
            composer.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM426padding3ABfNKs);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer composerM1259constructorimpl = Updater.m1259constructorimpl(composer);
            Updater.m1266setimpl(composerM1259constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1266setimpl(composerM1259constructorimpl, density, companion.getSetDensity());
            Updater.m1266setimpl(composerM1259constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m1266setimpl(composerM1259constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composer.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m1250boximpl(SkippableUpdater.m1251constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            composer.startReplaceableGroup(1455788974);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i2 = MaterialTheme.$stable;
            FontWeight.Companion companion2 = FontWeight.INSTANCE;
            int iPushStyle = builder.pushStyle(new SpanStyle(materialTheme.getColors(composer, i2).m972getOnSurface0d7_KjU(), 0L, companion2.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16378, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(R$string.sports_transfer_import_qa_q1, composer, 0));
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                composer.endReplaceableGroup();
                builder.append(Weather.SEPARATOR);
                composer.startReplaceableGroup(1455789262);
                int iPushStyle2 = builder.pushStyle(new SpanStyle(((TransferExtendedColors) composer.consume(SportTransferThemeKt.c())).getSecondaryText(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16382, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(R$string.sports_transfer_import_qa_a1, composer, 0));
                    builder.pop(iPushStyle2);
                    composer.endReplaceableGroup();
                    builder.append("\n\n");
                    composer.startReplaceableGroup(1455789539);
                    int iPushStyle3 = builder.pushStyle(new SpanStyle(materialTheme.getColors(composer, i2).m972getOnSurface0d7_KjU(), 0L, companion2.getNormal(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16378, (DefaultConstructorMarker) null));
                    try {
                        builder.append(StringResources_androidKt.stringResource(R$string.sports_transfer_import_qa_q2, composer, 0));
                        builder.pop(iPushStyle3);
                        composer.endReplaceableGroup();
                        builder.append(Weather.SEPARATOR);
                        int iPushStyle4 = builder.pushStyle(new SpanStyle(((TransferExtendedColors) composer.consume(SportTransferThemeKt.c())).getSecondaryText(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, 16382, (DefaultConstructorMarker) null));
                        try {
                            builder.append(StringResources_androidKt.stringResource(R$string.sports_transfer_import_qa_a2, composer, 0));
                            builder.pop(iPushStyle4);
                            TextKt.m1202TextIbK3jfQ(builder.toAnnotatedString(), null, 0L, TextUnitKt.getSp(14), null, null, null, 0L, null, null, TextUnitKt.getSp(24), 0, false, 0, 0, null, null, null, composer, 3072, 6, 261110);
                            composer.endReplaceableGroup();
                            composer.endNode();
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } catch (Throwable th) {
                            builder.pop(iPushStyle4);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        builder.pop(iPushStyle3);
                        throw th2;
                    }
                } catch (Throwable th3) {
                    builder.pop(iPushStyle2);
                    throw th3;
                }
            } catch (Throwable th4) {
                builder.pop(iPushStyle);
                throw th4;
            }
        }
    });

    @NotNull
    public final Function2<Composer, Integer, Unit> a() {
        return f132lambda1;
    }
}

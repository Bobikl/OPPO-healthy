package com.google.android.material.color.utilities;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.oplus.aiunit.vision.ikb;
import java.util.function.Function;

/* JADX INFO: loaded from: classes14.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class MaterialDynamicColors {
    private static final double CONTAINER_ACCENT_TONE_DELTA = 15.0d;

    public static double findDesiredChromaByTone(double d, double d2, double d3, boolean z) {
        Hct hctFrom = Hct.from(d, d2, d3);
        if (hctFrom.getChroma() >= d2) {
            return d3;
        }
        Hct hct = hctFrom;
        double chroma = hctFrom.getChroma();
        double d4 = d3;
        while (hct.getChroma() < d2) {
            double d5 = d4 + (z ? -1.0d : 1.0d);
            Hct hctFrom2 = Hct.from(d, d2, d5);
            if (chroma > hctFrom2.getChroma() || Math.abs(hctFrom2.getChroma() - d2) < 0.4d) {
                return d5;
            }
            if (Math.abs(hctFrom2.getChroma() - d2) < Math.abs(hct.getChroma() - d2)) {
                hct = hctFrom2;
            }
            chroma = Math.max(chroma, hctFrom2.getChroma());
            d4 = d5;
        }
        return d4;
    }

    private static boolean isFidelity(DynamicScheme dynamicScheme) {
        Variant variant = dynamicScheme.variant;
        return variant == Variant.FIDELITY || variant == Variant.CONTENT;
    }

    private static boolean isMonochrome(DynamicScheme dynamicScheme) {
        return dynamicScheme.variant == Variant.MONOCHROME;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$background$11(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlActivated$131(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$134(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$135(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$136(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 100.0d : 0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$137(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 0.2d : 0.12d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$138(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 100.0d : 0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$139(DynamicScheme dynamicScheme) {
        return Double.valueOf(DynamicColor.toneMinContrastDefault(new Function() { // from class: com.oplus.aiunit.vision.njb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$138((DynamicScheme) obj);
            }
        }, null, dynamicScheme, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$140(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 100.0d : 0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlHighlight$141(DynamicScheme dynamicScheme) {
        return Double.valueOf(DynamicColor.toneMaxContrastDefault(new Function() { // from class: com.oplus.aiunit.vision.djb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$140((DynamicScheme) obj);
            }
        }, null, dynamicScheme, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$controlNormal$133(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$error$95(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaConstraint lambda$error$96(DynamicScheme dynamicScheme) {
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, errorContainer(), dynamicScheme.isDark ? TonePolarity.DARKER : TonePolarity.LIGHTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$errorContainer$90(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$inverseOnSurface$36(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 95.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$inverseOnSurface$37(DynamicScheme dynamicScheme) {
        return inverseSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$inversePrimary$62(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 40.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$inversePrimary$63(DynamicScheme dynamicScheme) {
        return inverseSurface();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$inverseSurface$18(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 20.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$neutralPaletteKeyColor$7(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.neutralPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$neutralVariantPaletteKeyColor$9(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.neutralVariantPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onBackground$13(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onBackground$14(DynamicScheme dynamicScheme) {
        return background();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onError$98(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onError$99(DynamicScheme dynamicScheme) {
        return error();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onErrorContainer$92(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onErrorContainer$93(DynamicScheme dynamicScheme) {
        return errorContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onPrimary$65(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimary$66(DynamicScheme dynamicScheme) {
        return primary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onPrimaryContainer$56(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.contrastingTone(primaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
        }
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 0.0d : 100.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryContainer$57(DynamicScheme dynamicScheme) {
        return primaryContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onPrimaryFixed$105(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
        }
        return Double.valueOf(10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixed$106(DynamicScheme dynamicScheme) {
        return primaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onPrimaryFixedVariant$108(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 30.0d : 70.0d);
        }
        return Double.valueOf(30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onPrimaryFixedVariant$109(DynamicScheme dynamicScheme) {
        return primaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSecondary$76(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 100.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondary$77(DynamicScheme dynamicScheme) {
        return secondary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onSecondaryContainer$70(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.contrastingTone(secondaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryContainer$71(DynamicScheme dynamicScheme) {
        return secondaryContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSecondaryFixed$115(DynamicScheme dynamicScheme) {
        return Double.valueOf(10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixed$116(DynamicScheme dynamicScheme) {
        return secondaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSecondaryFixedVariant$118(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 25.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSecondaryFixedVariant$119(DynamicScheme dynamicScheme) {
        return secondaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSurface$34(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onSurfaceVariant$41(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onSurfaceVariant$42(DynamicScheme dynamicScheme) {
        return surfaceVariant();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onTertiary$87(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 20.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiary$88(DynamicScheme dynamicScheme) {
        return tertiary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Double lambda$onTertiaryContainer$81(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 0.0d : 100.0d);
        }
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DynamicColor.contrastingTone(tertiaryContainer().tone.apply(dynamicScheme).doubleValue(), 4.5d));
        }
        return Double.valueOf(dynamicScheme.isDark ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryContainer$82(DynamicScheme dynamicScheme) {
        return tertiaryContainer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onTertiaryFixed$125(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 90.0d : 10.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixed$126(DynamicScheme dynamicScheme) {
        return tertiaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$onTertiaryFixedVariant$128(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 70.0d : 30.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DynamicColor lambda$onTertiaryFixedVariant$129(DynamicScheme dynamicScheme) {
        return tertiaryFixedDim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$outline$44(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 60.0d : 50.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$outlineVariant$46(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primary$59(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 100.0d : 0.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaConstraint lambda$primary$60(DynamicScheme dynamicScheme) {
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, primaryContainer(), dynamicScheme.isDark ? TonePolarity.DARKER : TonePolarity.LIGHTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryContainer$54(DynamicScheme dynamicScheme) {
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(performAlbers(dynamicScheme.sourceColorHct, dynamicScheme));
        }
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 85.0d : 25.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryFixed$101(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 100.0d : 10.0d);
        }
        return Double.valueOf(90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryFixedDim$103(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 90.0d : 20.0d);
        }
        return Double.valueOf(80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$primaryPaletteKeyColor$1(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.primaryPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$scrim$50(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondary$73(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaConstraint lambda$secondary$74(DynamicScheme dynamicScheme) {
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, secondaryContainer(), dynamicScheme.isDark ? TonePolarity.DARKER : TonePolarity.LIGHTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryContainer$68(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 30.0d : 85.0d);
        }
        double d = dynamicScheme.isDark ? 30.0d : 90.0d;
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(performAlbers(dynamicScheme.secondaryPalette.getHct(findDesiredChromaByTone(dynamicScheme.secondaryPalette.getHue(), dynamicScheme.secondaryPalette.getChroma(), d, !dynamicScheme.isDark)), dynamicScheme));
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryFixed$111(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 80.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryFixedDim$113(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 70.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$secondaryPaletteKeyColor$3(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.secondaryPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$shadow$48(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surface$16(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceBright$20(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 24.0d : 98.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainer$28(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 12.0d : 94.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerHigh$30(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 17.0d : 92.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerHighest$32(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 22.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerLow$26(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 96.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceContainerLowest$24(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 4.0d : 100.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceDim$22(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 6.0d : 87.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceTint$52(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$surfaceVariant$39(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiary$84(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 90.0d : 25.0d);
        }
        return Double.valueOf(dynamicScheme.isDark ? 80.0d : 40.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ToneDeltaConstraint lambda$tertiary$85(DynamicScheme dynamicScheme) {
        return new ToneDeltaConstraint(CONTAINER_ACCENT_TONE_DELTA, tertiaryContainer(), dynamicScheme.isDark ? TonePolarity.DARKER : TonePolarity.LIGHTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryContainer$79(DynamicScheme dynamicScheme) {
        if (isMonochrome(dynamicScheme)) {
            return Double.valueOf(dynamicScheme.isDark ? 60.0d : 49.0d);
        }
        if (isFidelity(dynamicScheme)) {
            return Double.valueOf(DislikeAnalyzer.fixIfDisliked(dynamicScheme.tertiaryPalette.getHct(performAlbers(dynamicScheme.tertiaryPalette.getHct(dynamicScheme.sourceColorHct.getTone()), dynamicScheme))).getTone());
        }
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryFixed$121(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 40.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryFixedDim$123(DynamicScheme dynamicScheme) {
        return Double.valueOf(isMonochrome(dynamicScheme) ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$tertiaryPaletteKeyColor$5(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.tertiaryPalette.getKeyColor().getTone());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textHintInverse$151(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textPrimaryInverse$143(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textPrimaryInverseDisableOnly$147(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverse$145(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Double lambda$textSecondaryAndTertiaryInverseDisabled$149(DynamicScheme dynamicScheme) {
        return Double.valueOf(dynamicScheme.isDark ? 10.0d : 90.0d);
    }

    public static double performAlbers(Hct hct, DynamicScheme dynamicScheme) {
        Hct hctInViewingConditions = hct.inViewingConditions(viewingConditionsForAlbers(dynamicScheme));
        return (!DynamicColor.tonePrefersLightForeground(hct.getTone()) || DynamicColor.toneAllowsLightForeground(hctInViewingConditions.getTone())) ? DynamicColor.enableLightForeground(hctInViewingConditions.getTone()) : DynamicColor.enableLightForeground(hct.getTone());
    }

    private static ViewingConditions viewingConditionsForAlbers(DynamicScheme dynamicScheme) {
        return ViewingConditions.defaultWithBackgroundLstar(dynamicScheme.isDark ? 30.0d : 80.0d);
    }

    @NonNull
    public DynamicColor background() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.bib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.cib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$background$11((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor controlActivated() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.qkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.rkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlActivated$131((DynamicScheme) obj);
            }
        }, null);
    }

    @NonNull
    public DynamicColor controlHighlight() {
        return new DynamicColor(new Function() { // from class: com.oplus.aiunit.vision.pmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$134((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.qmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$135((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.rmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$136((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.smb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$137((DynamicScheme) obj);
            }
        }, null, new Function() { // from class: com.oplus.aiunit.vision.tmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$139((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.umb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlHighlight$141((DynamicScheme) obj);
            }
        }, null);
    }

    @NonNull
    public DynamicColor controlNormal() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.qhb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.rhb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$controlNormal$133((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor error() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.bkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).errorPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.ckb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$error$95((DynamicScheme) obj);
            }
        }, new ikb(this), new Function() { // from class: com.oplus.aiunit.vision.dkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$error$96((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor errorContainer() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.xib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).errorPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.yib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$errorContainer$90((DynamicScheme) obj);
            }
        }, new ikb(this));
    }

    @NonNull
    public DynamicColor highestSurface(@NonNull DynamicScheme dynamicScheme) {
        return dynamicScheme.isDark ? surfaceBright() : surfaceDim();
    }

    @NonNull
    public DynamicColor inverseOnSurface() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.oib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.pib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$inverseOnSurface$36((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.qib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$inverseOnSurface$37((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor inversePrimary() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.jkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.kkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$inversePrimary$62((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.lkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$inversePrimary$63((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor inverseSurface() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.zjb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.akb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$inverseSurface$18((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor neutralPaletteKeyColor() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.kib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.lib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$neutralPaletteKeyColor$7((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor neutralVariantPaletteKeyColor() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.glb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.hlb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$neutralVariantPaletteKeyColor$9((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor onBackground() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.gjb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.hjb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onBackground$13((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.ijb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onBackground$14((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor onError() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.ulb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).errorPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.vlb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onError$98((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.wlb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onError$99((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor onErrorContainer() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.ojb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).errorPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.sjb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onErrorContainer$92((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.tjb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onErrorContainer$93((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor onPrimary() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.ykb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.zkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onPrimary$65((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.alb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onPrimary$66((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor onPrimaryContainer() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.cjb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.ejb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onPrimaryContainer$56((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.fjb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onPrimaryContainer$57((DynamicScheme) obj);
            }
        }, null);
    }

    @NonNull
    public DynamicColor onPrimaryFixed() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.klb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.llb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onPrimaryFixed$105((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.mlb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onPrimaryFixed$106((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor onPrimaryFixedVariant() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.anb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.bnb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onPrimaryFixedVariant$108((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.cnb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onPrimaryFixedVariant$109((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor onSecondary() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.bmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.cmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSecondary$76((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.dmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onSecondary$77((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor onSecondaryContainer() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.pjb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.qjb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onSecondaryContainer$70((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.rjb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onSecondaryContainer$71((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor onSecondaryFixed() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.whb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.hib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSecondaryFixed$115((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.sib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onSecondaryFixed$116((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor onSecondaryFixedVariant() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.uib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.vib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSecondaryFixedVariant$118((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.wib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onSecondaryFixedVariant$119((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor onSurface() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.okb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.pkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSurface$34((DynamicScheme) obj);
            }
        }, new ikb(this));
    }

    @NonNull
    public DynamicColor onSurfaceVariant() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.xlb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.ylb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onSurfaceVariant$41((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.zlb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onSurfaceVariant$42((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor onTertiary() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.hmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.imb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onTertiary$87((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.jmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onTertiary$88((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor onTertiaryContainer() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.fnb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.gnb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onTertiaryContainer$81((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.mhb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onTertiaryContainer$82((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor onTertiaryFixed() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.emb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.fmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onTertiaryFixed$125((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.gmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onTertiaryFixed$126((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor onTertiaryFixedVariant() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.zib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.ajb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$onTertiaryFixedVariant$128((DynamicScheme) obj);
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.bjb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$onTertiaryFixedVariant$129((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor outline() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.mib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.nib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$outline$44((DynamicScheme) obj);
            }
        }, new ikb(this));
    }

    @NonNull
    public DynamicColor outlineVariant() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.nlb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.olb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$outlineVariant$46((DynamicScheme) obj);
            }
        }, new ikb(this));
    }

    @NonNull
    public DynamicColor primary() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.vkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.wkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primary$59((DynamicScheme) obj);
            }
        }, new ikb(this), new Function() { // from class: com.oplus.aiunit.vision.xkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$primary$60((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor primaryContainer() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.lhb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.xjb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryContainer$54((DynamicScheme) obj);
            }
        }, new ikb(this));
    }

    @NonNull
    public DynamicColor primaryFixed() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.ujb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.vjb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryFixed$101((DynamicScheme) obj);
            }
        }, new ikb(this));
    }

    @NonNull
    public DynamicColor primaryFixedDim() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.skb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.ukb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryFixedDim$103((DynamicScheme) obj);
            }
        }, new ikb(this));
    }

    @NonNull
    public DynamicColor primaryPaletteKeyColor() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.mkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.nkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$primaryPaletteKeyColor$1((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor scrim() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.ilb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.jlb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$scrim$50((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor secondary() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.plb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.amb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondary$73((DynamicScheme) obj);
            }
        }, new ikb(this), new Function() { // from class: com.oplus.aiunit.vision.lmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$secondary$74((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor secondaryContainer() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.uhb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.vhb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryContainer$68((DynamicScheme) obj);
            }
        }, new ikb(this));
    }

    @NonNull
    public DynamicColor secondaryFixed() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.wmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.hnb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryFixed$111((DynamicScheme) obj);
            }
        }, new ikb(this));
    }

    @NonNull
    public DynamicColor secondaryFixedDim() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.wjb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.yjb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryFixedDim$113((DynamicScheme) obj);
            }
        }, new ikb(this));
    }

    @NonNull
    public DynamicColor secondaryPaletteKeyColor() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.ekb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).secondaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.fkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$secondaryPaletteKeyColor$3((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor shadow() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.kmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.mmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$shadow$48((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor surface() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.fib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.gib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surface$16((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor surfaceBright() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.xhb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.yhb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceBright$20((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor surfaceContainer() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.slb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.tlb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainer$28((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor surfaceContainerHigh() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.zhb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.aib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerHigh$30((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor surfaceContainerHighest() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.dib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.eib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerHighest$32((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor surfaceContainerLow() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.qlb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.rlb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerLow$26((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor surfaceContainerLowest() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.blb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.clb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceContainerLowest$24((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor surfaceDim() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.iib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.jib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceDim$22((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor surfaceTint() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.gkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).primaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.hkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceTint$52((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor surfaceVariant() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.ljb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.mjb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$surfaceVariant$39((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor tertiary() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.nhb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.ohb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiary$84((DynamicScheme) obj);
            }
        }, new ikb(this), new Function() { // from class: com.oplus.aiunit.vision.phb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.a.lambda$tertiary$85((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor tertiaryContainer() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.ymb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.zmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryContainer$79((DynamicScheme) obj);
            }
        }, new ikb(this));
    }

    @NonNull
    public DynamicColor tertiaryFixed() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.dnb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.enb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryFixed$121((DynamicScheme) obj);
            }
        }, new ikb(this));
    }

    @NonNull
    public DynamicColor tertiaryFixedDim() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.vmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.xmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryFixedDim$123((DynamicScheme) obj);
            }
        }, new ikb(this));
    }

    @NonNull
    public DynamicColor tertiaryPaletteKeyColor() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.jjb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).tertiaryPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.kjb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$tertiaryPaletteKeyColor$5((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor textHintInverse() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.shb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.thb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textHintInverse$151((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor textPrimaryInverse() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.dlb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.flb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textPrimaryInverse$143((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor textPrimaryInverseDisableOnly() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.rib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.tib
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$147((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor textSecondaryAndTertiaryInverse() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.tkb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralVariantPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.elb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverse$145((DynamicScheme) obj);
            }
        });
    }

    @NonNull
    public DynamicColor textSecondaryAndTertiaryInverseDisabled() {
        return DynamicColor.fromPalette(new Function() { // from class: com.oplus.aiunit.vision.nmb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DynamicScheme) obj).neutralPalette;
            }
        }, new Function() { // from class: com.oplus.aiunit.vision.omb
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MaterialDynamicColors.lambda$textSecondaryAndTertiaryInverseDisabled$149((DynamicScheme) obj);
            }
        });
    }
}

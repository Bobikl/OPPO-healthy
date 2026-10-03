package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.channel.client.data.Action;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f\u001a+\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u0002H\u000e2\u0006\u0010\u0010\u001a\u0002H\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0011\u001a&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\t\u001a\u0004\u0018\u00010\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a-\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\fH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0000\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"DefaultBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "J", "DefaultColor", "DefaultFontSize", "Landroidx/compose/ui/unit/TextUnit;", "DefaultLetterSpacing", "lerp", "Landroidx/compose/ui/text/SpanStyle;", "start", Action.LIFE_CIRCLE_VALUE_STOP, "fraction", "", "lerpDiscrete", ExifInterface.GPS_DIRECTION_TRUE, "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "lerpPlatformStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "lerpTextUnitInheritable", "t", "lerpTextUnitInheritable-C3pnCVY", "(JJF)J", "resolveSpanStyleDefaults", Const.Arguments.Open.STYLE, "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,856:1\n658#2:857\n646#2:858\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n*L\n851#1:857\n851#1:858\n*E\n"})
public final class SpanStyleKt {
    private static final long DefaultBackgroundColor;
    private static final long DefaultColor;
    private static final long DefaultFontSize = TextUnitKt.getSp(14);
    private static final long DefaultLetterSpacing = TextUnitKt.getSp(0);

    static {
        Color.Companion companion = Color.INSTANCE;
        DefaultBackgroundColor = companion.m1653getTransparent0d7_KjU();
        DefaultColor = companion.m1644getBlack0d7_KjU();
    }

    @NotNull
    public static final SpanStyle lerp(@NotNull SpanStyle start, @NotNull SpanStyle stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        TextForegroundStyle textForegroundStyleLerp = TextDrawStyleKt.lerp(start.getTextForegroundStyle(), stop.getTextForegroundStyle(), f);
        FontFamily fontFamily = (FontFamily) lerpDiscrete(start.getFontFamily(), stop.getFontFamily(), f);
        long jM3608lerpTextUnitInheritableC3pnCVY = m3608lerpTextUnitInheritableC3pnCVY(start.getFontSize(), stop.getFontSize(), f);
        FontWeight fontWeight = start.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        FontWeight fontWeight2 = stop.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.INSTANCE.getNormal();
        }
        FontWeight fontWeightLerp = FontWeightKt.lerp(fontWeight, fontWeight2, f);
        FontStyle fontStyle = (FontStyle) lerpDiscrete(start.getFontStyle(), stop.getFontStyle(), f);
        FontSynthesis fontSynthesis = (FontSynthesis) lerpDiscrete(start.getFontSynthesis(), stop.getFontSynthesis(), f);
        String str = (String) lerpDiscrete(start.getFontFeatureSettings(), stop.getFontFeatureSettings(), f);
        long jM3608lerpTextUnitInheritableC3pnCVY2 = m3608lerpTextUnitInheritableC3pnCVY(start.getLetterSpacing(), stop.getLetterSpacing(), f);
        BaselineShift baselineShift = start.getBaselineShift();
        float fM3893unboximpl = baselineShift != null ? baselineShift.m3893unboximpl() : BaselineShift.m3888constructorimpl(0.0f);
        BaselineShift baselineShift2 = stop.getBaselineShift();
        float fM3900lerpjWV1Mfo = BaselineShiftKt.m3900lerpjWV1Mfo(fM3893unboximpl, baselineShift2 != null ? baselineShift2.m3893unboximpl() : BaselineShift.m3888constructorimpl(0.0f), f);
        TextGeometricTransform textGeometricTransform = start.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = stop.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransformLerp = TextGeometricTransformKt.lerp(textGeometricTransform, textGeometricTransform2, f);
        LocaleList localeList = (LocaleList) lerpDiscrete(start.getLocaleList(), stop.getLocaleList(), f);
        long jM1669lerpjxsXWHM = ColorKt.m1669lerpjxsXWHM(start.getBackground(), stop.getBackground(), f);
        TextDecoration textDecoration = (TextDecoration) lerpDiscrete(start.getTextDecoration(), stop.getTextDecoration(), f);
        Shadow shadow = start.getShadow();
        if (shadow == null) {
            shadow = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        Shadow shadow2 = stop.getShadow();
        if (shadow2 == null) {
            shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
        }
        return new SpanStyle(textForegroundStyleLerp, jM3608lerpTextUnitInheritableC3pnCVY, fontWeightLerp, fontStyle, fontSynthesis, fontFamily, str, jM3608lerpTextUnitInheritableC3pnCVY2, BaselineShift.m3887boximpl(fM3900lerpjWV1Mfo), textGeometricTransformLerp, localeList, jM1669lerpjxsXWHM, textDecoration, ShadowKt.lerp(shadow, shadow2, f), lerpPlatformStyle(start.getPlatformStyle(), stop.getPlatformStyle(), f), (DrawStyle) lerpDiscrete(start.getDrawStyle(), stop.getDrawStyle(), f), (DefaultConstructorMarker) null);
    }

    public static final <T> T lerpDiscrete(T t, T t2, float f) {
        return ((double) f) < 0.5d ? t : t2;
    }

    private static final PlatformSpanStyle lerpPlatformStyle(PlatformSpanStyle platformSpanStyle, PlatformSpanStyle platformSpanStyle2, float f) {
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            return null;
        }
        if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.INSTANCE.getDefault();
        }
        if (platformSpanStyle2 == null) {
            platformSpanStyle2 = PlatformSpanStyle.INSTANCE.getDefault();
        }
        return AndroidTextStyle_androidKt.lerp(platformSpanStyle, platformSpanStyle2, f);
    }

    /* JADX INFO: renamed from: lerpTextUnitInheritable-C3pnCVY, reason: not valid java name */
    public static final long m3608lerpTextUnitInheritableC3pnCVY(long j2, long j3, float f) {
        return (TextUnitKt.m4303isUnspecifiedR2X_6o(j2) || TextUnitKt.m4303isUnspecifiedR2X_6o(j3)) ? ((TextUnit) lerpDiscrete(TextUnit.m4275boximpl(j2), TextUnit.m4275boximpl(j3), f)).getPackedValue() : TextUnitKt.m4305lerpC3pnCVY(j2, j3, f);
    }

    @NotNull
    public static final SpanStyle resolveSpanStyleDefaults(@NotNull SpanStyle style) {
        Intrinsics.checkNotNullParameter(style, "style");
        TextForegroundStyle textForegroundStyleTakeOrElse = style.getTextForegroundStyle().takeOrElse(new Function0<TextForegroundStyle>() { // from class: androidx.compose.ui.text.SpanStyleKt.resolveSpanStyleDefaults.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final TextForegroundStyle invoke() {
                return TextForegroundStyle.INSTANCE.m4017from8_81llA(SpanStyleKt.DefaultColor);
            }
        });
        long fontSize = TextUnitKt.m4303isUnspecifiedR2X_6o(style.getFontSize()) ? DefaultFontSize : style.getFontSize();
        FontWeight fontWeight = style.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle = style.getFontStyle();
        FontStyle fontStyleM3724boximpl = FontStyle.m3724boximpl(fontStyle != null ? fontStyle.m3730unboximpl() : FontStyle.INSTANCE.m3732getNormal_LCdwA());
        FontSynthesis fontSynthesis = style.getFontSynthesis();
        FontSynthesis fontSynthesisM3733boximpl = FontSynthesis.m3733boximpl(fontSynthesis != null ? fontSynthesis.getValue() : FontSynthesis.INSTANCE.m3742getAllGVVA2EU());
        FontFamily fontFamily = style.getFontFamily();
        if (fontFamily == null) {
            fontFamily = FontFamily.INSTANCE.getDefault();
        }
        FontFamily fontFamily2 = fontFamily;
        String fontFeatureSettings = style.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long letterSpacing = TextUnitKt.m4303isUnspecifiedR2X_6o(style.getLetterSpacing()) ? DefaultLetterSpacing : style.getLetterSpacing();
        BaselineShift baselineShift = style.getBaselineShift();
        BaselineShift baselineShiftM3887boximpl = BaselineShift.m3887boximpl(baselineShift != null ? baselineShift.m3893unboximpl() : BaselineShift.INSTANCE.m3897getNoney9eOQZs());
        TextGeometricTransform textGeometricTransform = style.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.getNone$ui_text_release();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = style.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        LocaleList localeList2 = localeList;
        long background = style.getBackground();
        if (!(background != Color.INSTANCE.m1654getUnspecified0d7_KjU())) {
            background = DefaultBackgroundColor;
        }
        long j2 = background;
        TextDecoration textDecoration = style.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.INSTANCE.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = style.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.getNone();
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformStyle = style.getPlatformStyle();
        DrawStyle drawStyle = style.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        return new SpanStyle(textForegroundStyleTakeOrElse, fontSize, fontWeight2, fontStyleM3724boximpl, fontSynthesisM3733boximpl, fontFamily2, str, letterSpacing, baselineShiftM3887boximpl, textGeometricTransform2, localeList2, j2, textDecoration2, shadow2, platformStyle, drawStyle, (DefaultConstructorMarker) null);
    }
}

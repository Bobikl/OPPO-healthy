package androidx.compose.ui.text.font;

import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"synthesizeTypeface", "", "Landroidx/compose/ui/text/font/FontSynthesis;", ParserTag.TAG_TEXT_TYPEFACE, "font", "Landroidx/compose/ui/text/font/Font;", "requestedWeight", "Landroidx/compose/ui/text/font/FontWeight;", "requestedStyle", "Landroidx/compose/ui/text/font/FontStyle;", "synthesizeTypeface-FxwP2eA", "(ILjava/lang/Object;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FontSynthesis_androidKt {
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    @NotNull
    /* JADX INFO: renamed from: synthesizeTypeface-FxwP2eA, reason: not valid java name */
    public static final Object m3746synthesizeTypefaceFxwP2eA(int i, @NotNull Object typeface, @NotNull Font font, @NotNull FontWeight requestedWeight, int i2) {
        boolean z;
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(requestedWeight, "requestedWeight");
        if (!(typeface instanceof android.graphics.Typeface)) {
            return typeface;
        }
        if (!FontSynthesis.m3739isWeightOnimpl$ui_text_release(i) || Intrinsics.areEqual(font.getWeight(), requestedWeight)) {
            z = false;
        } else {
            FontWeight.Companion companion = FontWeight.INSTANCE;
            if (requestedWeight.compareTo(AndroidFontUtils_androidKt.getAndroidBold(companion)) < 0 || font.getWeight().compareTo(AndroidFontUtils_androidKt.getAndroidBold(companion)) >= 0) {
                z = false;
            } else {
                z = true;
            }
        }
        boolean z2 = FontSynthesis.m3738isStyleOnimpl$ui_text_release(i) && !FontStyle.m3727equalsimpl0(i2, font.getStyle());
        if (!z2 && !z) {
            return typeface;
        }
        android.graphics.Typeface typefaceCreate = TypefaceHelperMethodsApi28.INSTANCE.create((android.graphics.Typeface) typeface, z ? requestedWeight.getWeight() : font.getWeight().getWeight(), z2 ? FontStyle.m3727equalsimpl0(i2, FontStyle.INSTANCE.m3731getItalic_LCdwA()) : FontStyle.m3727equalsimpl0(font.getStyle(), FontStyle.INSTANCE.m3731getItalic_LCdwA()));
        Intrinsics.checkNotNullExpressionValue(typefaceCreate, "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }");
        return typefaceCreate;
    }
}

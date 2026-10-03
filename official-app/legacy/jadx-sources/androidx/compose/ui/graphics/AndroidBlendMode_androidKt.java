package androidx.compose.ui.graphics;

import android.graphics.PorterDuff;
import androidx.annotation.RequiresApi;
import org.hapjs.card.api.debug.CardDebugController;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\n*\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {CardDebugController.EXTRA_IS_SUPPORTED, "", "Landroidx/compose/ui/graphics/BlendMode;", "isSupported-s9anfk8", "(I)Z", "toAndroidBlendMode", "Landroid/graphics/BlendMode;", "toAndroidBlendMode-s9anfk8", "(I)Landroid/graphics/BlendMode;", "toPorterDuffMode", "Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode-s9anfk8", "(I)Landroid/graphics/PorterDuff$Mode;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidBlendMode_androidKt {
    /* JADX INFO: renamed from: isSupported-s9anfk8, reason: not valid java name */
    public static final boolean m1471isSupporteds9anfk8(int i) {
        return true;
    }

    @RequiresApi(29)
    @NotNull
    /* JADX INFO: renamed from: toAndroidBlendMode-s9anfk8, reason: not valid java name */
    public static final android.graphics.BlendMode m1472toAndroidBlendModes9anfk8(int i) {
        BlendMode.Companion companion = BlendMode.INSTANCE;
        if (BlendMode.m1531equalsimpl0(i, companion.m1535getClear0nO6VwU())) {
            return android.graphics.BlendMode.CLEAR;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1558getSrc0nO6VwU())) {
            return android.graphics.BlendMode.SRC;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1541getDst0nO6VwU())) {
            return android.graphics.BlendMode.DST;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1562getSrcOver0nO6VwU())) {
            return android.graphics.BlendMode.SRC_OVER;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1545getDstOver0nO6VwU())) {
            return android.graphics.BlendMode.DST_OVER;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1560getSrcIn0nO6VwU())) {
            return android.graphics.BlendMode.SRC_IN;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1543getDstIn0nO6VwU())) {
            return android.graphics.BlendMode.DST_IN;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1561getSrcOut0nO6VwU())) {
            return android.graphics.BlendMode.SRC_OUT;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1544getDstOut0nO6VwU())) {
            return android.graphics.BlendMode.DST_OUT;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1559getSrcAtop0nO6VwU())) {
            return android.graphics.BlendMode.SRC_ATOP;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1542getDstAtop0nO6VwU())) {
            return android.graphics.BlendMode.DST_ATOP;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1563getXor0nO6VwU())) {
            return android.graphics.BlendMode.XOR;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1554getPlus0nO6VwU())) {
            return android.graphics.BlendMode.PLUS;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1551getModulate0nO6VwU())) {
            return android.graphics.BlendMode.MODULATE;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1556getScreen0nO6VwU())) {
            return android.graphics.BlendMode.SCREEN;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1553getOverlay0nO6VwU())) {
            return android.graphics.BlendMode.OVERLAY;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1539getDarken0nO6VwU())) {
            return android.graphics.BlendMode.DARKEN;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1549getLighten0nO6VwU())) {
            return android.graphics.BlendMode.LIGHTEN;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1538getColorDodge0nO6VwU())) {
            return android.graphics.BlendMode.COLOR_DODGE;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1537getColorBurn0nO6VwU())) {
            return android.graphics.BlendMode.COLOR_BURN;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1547getHardlight0nO6VwU())) {
            return android.graphics.BlendMode.HARD_LIGHT;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1557getSoftlight0nO6VwU())) {
            return android.graphics.BlendMode.SOFT_LIGHT;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1540getDifference0nO6VwU())) {
            return android.graphics.BlendMode.DIFFERENCE;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1546getExclusion0nO6VwU())) {
            return android.graphics.BlendMode.EXCLUSION;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1552getMultiply0nO6VwU())) {
            return android.graphics.BlendMode.MULTIPLY;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1548getHue0nO6VwU())) {
            return android.graphics.BlendMode.HUE;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1555getSaturation0nO6VwU())) {
            return android.graphics.BlendMode.SATURATION;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1536getColor0nO6VwU())) {
            return android.graphics.BlendMode.COLOR;
        }
        return BlendMode.m1531equalsimpl0(i, companion.m1550getLuminosity0nO6VwU()) ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    @NotNull
    /* JADX INFO: renamed from: toPorterDuffMode-s9anfk8, reason: not valid java name */
    public static final PorterDuff.Mode m1473toPorterDuffModes9anfk8(int i) {
        BlendMode.Companion companion = BlendMode.INSTANCE;
        if (BlendMode.m1531equalsimpl0(i, companion.m1535getClear0nO6VwU())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1558getSrc0nO6VwU())) {
            return PorterDuff.Mode.SRC;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1541getDst0nO6VwU())) {
            return PorterDuff.Mode.DST;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1562getSrcOver0nO6VwU())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1545getDstOver0nO6VwU())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1560getSrcIn0nO6VwU())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1543getDstIn0nO6VwU())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1561getSrcOut0nO6VwU())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1544getDstOut0nO6VwU())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1559getSrcAtop0nO6VwU())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1542getDstAtop0nO6VwU())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1563getXor0nO6VwU())) {
            return PorterDuff.Mode.XOR;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1554getPlus0nO6VwU())) {
            return PorterDuff.Mode.ADD;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1556getScreen0nO6VwU())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1553getOverlay0nO6VwU())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1539getDarken0nO6VwU())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (BlendMode.m1531equalsimpl0(i, companion.m1549getLighten0nO6VwU())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return BlendMode.m1531equalsimpl0(i, companion.m1551getModulate0nO6VwU()) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}

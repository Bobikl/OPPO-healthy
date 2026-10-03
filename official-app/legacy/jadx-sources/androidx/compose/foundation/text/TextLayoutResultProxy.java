package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017J%\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u001a*\u00020\u001aH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u0019\u0010%\u001a\u00020\u001a*\u00020\u001aH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Landroidx/compose/foundation/text/TextLayoutResultProxy;", "", "value", "Landroidx/compose/ui/text/TextLayoutResult;", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "decorationBoxCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getDecorationBoxCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setDecorationBoxCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "innerTextFieldCoordinates", "getInnerTextFieldCoordinates", "setInnerTextFieldCoordinates", "getValue", "()Landroidx/compose/ui/text/TextLayoutResult;", "getLineEnd", "", "lineIndex", "visibleEnd", "", "getLineForVerticalPosition", "vertical", "", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "coerceInVisibleBounds", "getOffsetForPosition-3MmeM6k", "(JZ)I", "isPositionOnText", TypedValues.CycleType.S_WAVE_OFFSET, "isPositionOnText-k-4lQ0M", "(J)Z", "coercedInVisibleBoundsOfInputText", "coercedInVisibleBoundsOfInputText-MK-Hz9U", "(J)J", "relativeToInputText", "relativeToInputText-MK-Hz9U", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTextLayoutResultProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResultProxy.kt\nandroidx/compose/foundation/text/TextLayoutResultProxy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
public final class TextLayoutResultProxy {

    @Nullable
    private LayoutCoordinates decorationBoxCoordinates;

    @Nullable
    private LayoutCoordinates innerTextFieldCoordinates;

    @NotNull
    private final TextLayoutResult value;

    public TextLayoutResultProxy(@NotNull TextLayoutResult value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX INFO: renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U, reason: not valid java name */
    private final long m801coercedInVisibleBoundsOfInputTextMKHz9U(long j2) {
        Rect zero;
        LayoutCoordinates layoutCoordinates = this.innerTextFieldCoordinates;
        if (layoutCoordinates == null) {
            zero = Rect.INSTANCE.getZero();
        } else {
            if (layoutCoordinates.isAttached()) {
                LayoutCoordinates layoutCoordinates2 = this.decorationBoxCoordinates;
                zero = null;
                if (layoutCoordinates2 != null) {
                    zero = LayoutCoordinates.localBoundingBoxOf$default(layoutCoordinates2, layoutCoordinates, false, 2, null);
                }
            } else {
                zero = Rect.INSTANCE.getZero();
            }
            if (zero == null) {
                zero = Rect.INSTANCE.getZero();
            }
        }
        return TextLayoutResultProxyKt.m807coerceIn3MmeM6k(j2, zero);
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResultProxy textLayoutResultProxy, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayoutResultProxy.getLineEnd(i, z);
    }

    /* JADX INFO: renamed from: getOffsetForPosition-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ int m802getOffsetForPosition3MmeM6k$default(TextLayoutResultProxy textLayoutResultProxy, long j2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return textLayoutResultProxy.m804getOffsetForPosition3MmeM6k(j2, z);
    }

    /* JADX INFO: renamed from: relativeToInputText-MK-Hz9U, reason: not valid java name */
    private final long m803relativeToInputTextMKHz9U(long j2) {
        Offset offsetM1369boximpl;
        LayoutCoordinates layoutCoordinates = this.innerTextFieldCoordinates;
        if (layoutCoordinates == null) {
            return j2;
        }
        LayoutCoordinates layoutCoordinates2 = this.decorationBoxCoordinates;
        if (layoutCoordinates2 != null) {
            offsetM1369boximpl = Offset.m1369boximpl((layoutCoordinates.isAttached() && layoutCoordinates2.isAttached()) ? layoutCoordinates.mo3138localPositionOfR5De75A(layoutCoordinates2, j2) : j2);
        } else {
            offsetM1369boximpl = null;
        }
        return offsetM1369boximpl != null ? offsetM1369boximpl.getPackedValue() : j2;
    }

    @Nullable
    public final LayoutCoordinates getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    @Nullable
    public final LayoutCoordinates getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final int getLineEnd(int lineIndex, boolean visibleEnd) {
        return this.value.getLineEnd(lineIndex, visibleEnd);
    }

    public final int getLineForVerticalPosition(float vertical) {
        return this.value.getLineForVerticalPosition(Offset.m1381getYimpl(m803relativeToInputTextMKHz9U(m801coercedInVisibleBoundsOfInputTextMKHz9U(OffsetKt.Offset(0.0f, vertical)))));
    }

    /* JADX INFO: renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m804getOffsetForPosition3MmeM6k(long position, boolean coerceInVisibleBounds) {
        if (coerceInVisibleBounds) {
            position = m801coercedInVisibleBoundsOfInputTextMKHz9U(position);
        }
        return this.value.m3615getOffsetForPositionk4lQ0M(m803relativeToInputTextMKHz9U(position));
    }

    @NotNull
    public final TextLayoutResult getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m805isPositionOnTextk4lQ0M(long offset) {
        long jM803relativeToInputTextMKHz9U = m803relativeToInputTextMKHz9U(m801coercedInVisibleBoundsOfInputTextMKHz9U(offset));
        int lineForVerticalPosition = this.value.getLineForVerticalPosition(Offset.m1381getYimpl(jM803relativeToInputTextMKHz9U));
        return Offset.m1380getXimpl(jM803relativeToInputTextMKHz9U) >= this.value.getLineLeft(lineForVerticalPosition) && Offset.m1380getXimpl(jM803relativeToInputTextMKHz9U) <= this.value.getLineRight(lineForVerticalPosition);
    }

    public final void setDecorationBoxCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.decorationBoxCoordinates = layoutCoordinates;
    }

    public final void setInnerTextFieldCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.innerTextFieldCoordinates = layoutCoordinates;
    }
}

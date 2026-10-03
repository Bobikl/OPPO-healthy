package androidx.compose.ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"getLineForOffset", "", "Landroid/text/Layout;", TypedValues.CycleType.S_WAVE_OFFSET, "upstream", "", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class LayoutCompatKt {
    @InternalPlatformTextApi
    public static final int getLineForOffset(@NotNull Layout layout, @IntRange(from = 0) int i, boolean z) {
        Intrinsics.checkNotNullParameter(layout, "<this>");
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart != i && lineEnd != i) {
            return lineForOffset;
        }
        if (lineStart == i) {
            return z ? lineForOffset - 1 : lineForOffset;
        }
        return z ? lineForOffset : lineForOffset + 1;
    }
}

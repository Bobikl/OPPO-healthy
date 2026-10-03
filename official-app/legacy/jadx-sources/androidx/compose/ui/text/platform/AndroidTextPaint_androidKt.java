package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.math.MathKt__MathJVMKt;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {ClickApiEntity.SET_ALPHA, "", "Landroid/text/TextPaint;", "alpha", "", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidTextPaint_androidKt {
    public static final void setAlpha(@NotNull TextPaint textPaint, float f) {
        Intrinsics.checkNotNullParameter(textPaint, "<this>");
        if (Float.isNaN(f)) {
            return;
        }
        textPaint.setAlpha(MathKt__MathJVMKt.roundToInt(RangesKt___RangesKt.coerceIn(f, 0.0f, 1.0f) * 255));
    }
}

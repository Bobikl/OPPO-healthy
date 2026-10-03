package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.oplus.aiunit.vision.c22;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(33)
class BoringLayoutConstructor33 {
    private BoringLayoutConstructor33() {
    }

    @NonNull
    public static BoringLayout create(@NonNull CharSequence charSequence, @NonNull TextPaint textPaint, @IntRange(from = 0) int i, @NonNull Layout.Alignment alignment, float f, float f2, @NonNull BoringLayout.Metrics metrics, boolean z, @Nullable TextUtils.TruncateAt truncateAt, @IntRange(from = 0) int i2, boolean z2) {
        return c22.a(charSequence, textPaint, i, alignment, f, f2, metrics, z, truncateAt, i2, z2);
    }
}

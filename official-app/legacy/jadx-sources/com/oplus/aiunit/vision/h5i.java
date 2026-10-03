package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class h5i {
    public static int a(@NonNull Canvas canvas, @NonNull CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            Layout layoutC = ctj.c(spanned);
            if (layoutC != null) {
                return layoutC.getWidth();
            }
            TextView textViewC = ntj.c(spanned);
            if (textViewC != null) {
                return (textViewC.getWidth() - textViewC.getPaddingLeft()) - textViewC.getPaddingRight();
            }
        }
        return canvas.getWidth();
    }
}

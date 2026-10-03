package com.oplus.aiunit.vision;

import android.text.Spanned;

/* JADX INFO: loaded from: classes10.dex */
public abstract class fva {
    public static boolean a(int i, CharSequence charSequence, Object obj) {
        return (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(obj) == i;
    }

    public static boolean b(int i, CharSequence charSequence, Object obj) {
        return (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(obj) == i;
    }
}

package com.oplus.aiunit.vision;

import android.text.InputFilter;
import android.text.Spanned;

/* JADX INFO: loaded from: classes2.dex */
public class k4i implements InputFilter {
    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (charSequence.equals(" ")) {
            return "";
        }
        return null;
    }
}

package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes9.dex */
public class g1j {
    public static boolean a(CharSequence charSequence) {
        int length;
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean b(CharSequence charSequence) {
        return !a(charSequence);
    }
}

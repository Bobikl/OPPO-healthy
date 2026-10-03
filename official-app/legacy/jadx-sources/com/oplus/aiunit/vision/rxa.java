package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes11.dex */
public class rxa {
    public static int a(CharSequence charSequence, int i) {
        char cCharAt;
        if (i >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i) != '<') {
            return b(charSequence, i);
        }
        while (true) {
            i++;
            if (i >= charSequence.length() || (cCharAt = charSequence.charAt(i)) == '\n' || cCharAt == '<') {
                break;
            }
            if (cCharAt == '>') {
                return i + 1;
            }
            if (cCharAt == '\\') {
                int i2 = i + 1;
                if (m8e.g(charSequence, i2)) {
                    i = i2;
                }
            }
        }
        return -1;
    }

    public static int b(CharSequence charSequence, int i) {
        int i2 = 0;
        int i3 = i;
        while (i3 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i3);
            if (cCharAt == 0 || cCharAt == ' ') {
                if (i3 != i) {
                    return i3;
                }
                return -1;
            }
            if (cCharAt == '\\') {
                int i4 = i3 + 1;
                if (m8e.g(charSequence, i4)) {
                    i3 = i4;
                }
            } else if (cCharAt == '(') {
                i2++;
                if (i2 > 32) {
                    return -1;
                }
            } else if (cCharAt != ')') {
                if (Character.isISOControl(cCharAt)) {
                    if (i3 != i) {
                        return i3;
                    }
                    return -1;
                }
            } else {
                if (i2 == 0) {
                    return i3;
                }
                i2--;
            }
            i3++;
        }
        return charSequence.length();
    }

    public static int c(CharSequence charSequence, int i) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case '\\':
                    int i2 = i + 1;
                    if (m8e.g(charSequence, i2)) {
                        i = i2;
                    }
                    break;
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static int d(CharSequence charSequence, int i) {
        if (i >= charSequence.length()) {
            return -1;
        }
        char cCharAt = charSequence.charAt(i);
        char c2 = '\"';
        if (cCharAt != '\"') {
            c2 = '\'';
            if (cCharAt != '\'') {
                if (cCharAt != '(') {
                    return -1;
                }
                c2 = ')';
            }
        }
        int iE = e(charSequence, i + 1, c2);
        if (iE != -1 && iE < charSequence.length() && charSequence.charAt(iE) == c2) {
            return iE + 1;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:21:0x001a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018 A[DONT_INVERT] */
    public static int e(CharSequence charSequence, int i, char c2) {
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\\') {
                int i2 = i + 1;
                if (m8e.g(charSequence, i2)) {
                    i = i2;
                } else {
                    if (cCharAt == c2) {
                        return i;
                    }
                    if (c2 == ')' && cCharAt == '(') {
                        return -1;
                    }
                }
            } else {
                if (cCharAt == c2) {
                    return i;
                }
                if (c2 == ')') {
                    continue;
                }
            }
            i++;
        }
        return charSequence.length();
    }
}

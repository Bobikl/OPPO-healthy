package com.fasterxml.jackson.core.io;

import com.oplus.aiunit.vision.a83;
import com.oplus.aiunit.vision.wtg;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public abstract class CharacterEscapes implements Serializable {
    public static final int ESCAPE_CUSTOM = -2;
    public static final int ESCAPE_NONE = 0;
    public static final int ESCAPE_STANDARD = -1;

    public static int[] standardAsciiEscapesForJSON() {
        int[] iArrE = a83.e();
        return Arrays.copyOf(iArrE, iArrE.length);
    }

    public abstract int[] getEscapeCodesForAscii();

    public abstract wtg getEscapeSequence(int i);
}

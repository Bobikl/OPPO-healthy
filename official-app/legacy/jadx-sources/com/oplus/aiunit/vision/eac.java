package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.Comparator;

/* JADX INFO: loaded from: classes19.dex */
public class eac implements Comparator<dac> {
    public int i;

    public eac() {
        this.i = 0;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(dac dacVar, dac dacVar2) {
        char cB;
        char cB2;
        int i = this.i;
        if (i == 0) {
            cB2 = b(dacVar.o());
            cB = b(dacVar2.o());
        } else if (i == 1) {
            cB2 = b(dacVar.d());
            cB = b(dacVar2.d());
        } else if (i == 2) {
            cB2 = b(dacVar.b());
            cB = b(dacVar2.b());
        } else if (i == 3) {
            cB2 = b(dacVar.g());
            cB = b(dacVar2.g());
        } else {
            cB = '#';
            cB2 = '#';
        }
        if (cB2 == '#') {
            return cB == '#' ? 0 : 1;
        }
        if (cB == '#') {
            return -1;
        }
        if (cB2 == cB) {
            return 0;
        }
        return cB2 < cB ? -1 : 1;
    }

    public final char b(String str) {
        if (TextUtils.isEmpty(str)) {
            return '#';
        }
        char cCharAt = str.charAt(0);
        if (Character.isUpperCase(cCharAt) || Character.isLowerCase(cCharAt)) {
            return Character.toUpperCase(cCharAt);
        }
        return '#';
    }

    public eac(int i) {
        this.i = i;
    }
}

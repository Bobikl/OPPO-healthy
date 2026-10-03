package com.oplus.aiunit.vision;

import io.netty.util.internal.StringUtil;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class yr0 extends n8a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f19112e = Pattern.compile("`+");
    public static final Pattern f = Pattern.compile("^`+");

    @Override // com.oplus.aiunit.vision.n8a
    public ltc e() {
        String strD;
        String strD2 = d(f);
        if (strD2 == null) {
            return null;
        }
        int i = this.d;
        do {
            strD = d(f19112e);
            if (strD == null) {
                this.d = i;
                return o(strD2);
            }
        } while (!strD.equals(strD2));
        zj3 zj3Var = new zj3();
        String strReplace = this.f14395c.substring(i, this.d - strD2.length()).replace('\n', StringUtil.SPACE);
        if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ' && m8e.e(strReplace)) {
            strReplace = strReplace.substring(1, strReplace.length() - 1);
        }
        zj3Var.n(strReplace);
        return zj3Var;
    }

    @Override // com.oplus.aiunit.vision.n8a
    public char m() {
        return '`';
    }
}

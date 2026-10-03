package com.oplus.aiunit.vision;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class xr0 extends n8a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f18731e = jgb.f12890n;

    @Override // com.oplus.aiunit.vision.n8a
    public ltc e() {
        this.d++;
        if (j() == '\n') {
            hh8 hh8Var = new hh8();
            this.d++;
            return hh8Var;
        }
        if (this.d < this.f14395c.length()) {
            Pattern pattern = f18731e;
            String str = this.f14395c;
            int i = this.d;
            if (pattern.matcher(str.substring(i, i + 1)).matches()) {
                String str2 = this.f14395c;
                int i2 = this.d;
                zrj zrjVarP = p(str2, i2, i2 + 1);
                this.d++;
                return zrjVarP;
            }
        }
        return o("\\");
    }

    @Override // com.oplus.aiunit.vision.n8a
    public char m() {
        return '\\';
    }
}

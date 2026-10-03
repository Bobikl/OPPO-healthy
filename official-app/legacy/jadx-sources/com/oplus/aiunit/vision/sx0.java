package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes10.dex */
public class sx0 extends n8a {
    @Override // com.oplus.aiunit.vision.n8a
    public ltc e() {
        int i = this.d;
        this.d = i + 1;
        if (j() != '[') {
            return null;
        }
        this.d++;
        zrj zrjVarO = o("![");
        a(j52.a(zrjVarO, i + 1, b(), c()));
        return zrjVarO;
    }

    @Override // com.oplus.aiunit.vision.n8a
    public char m() {
        return '!';
    }
}

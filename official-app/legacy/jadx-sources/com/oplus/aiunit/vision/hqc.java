package com.oplus.aiunit.vision;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class hqc extends n8a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f12231e = Pattern.compile(" *$");

    @Override // com.oplus.aiunit.vision.n8a
    public ltc e() {
        this.d++;
        ltc ltcVarD = this.b.d();
        if (ltcVarD instanceof zrj) {
            zrj zrjVar = (zrj) ltcVarD;
            if (zrjVar.m().endsWith(" ")) {
                String strM = zrjVar.m();
                Matcher matcher = f12231e.matcher(strM);
                int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (iEnd > 0) {
                    zrjVar.n(strM.substring(0, strM.length() - iEnd));
                }
                return iEnd >= 2 ? new hh8() : new s1i();
            }
        }
        return new s1i();
    }

    @Override // com.oplus.aiunit.vision.n8a
    public char m() {
        return '\n';
    }
}

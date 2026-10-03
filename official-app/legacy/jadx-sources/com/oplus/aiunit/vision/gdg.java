package com.oplus.aiunit.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class gdg implements ma4<cuf, Character> {
    public static final gdg a = new gdg();

    @Override // com.oplus.aiunit.vision.ma4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Character convert(cuf cufVar) throws IOException {
        String strS = cufVar.s();
        if (strS.length() == 1) {
            return Character.valueOf(strS.charAt(0));
        }
        throw new IOException("Expected body of length 1 for Character conversion but was " + strS.length());
    }
}

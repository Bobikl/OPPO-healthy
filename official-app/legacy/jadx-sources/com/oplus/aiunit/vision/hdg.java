package com.oplus.aiunit.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class hdg implements ma4<cuf, Double> {
    public static final hdg a = new hdg();

    @Override // com.oplus.aiunit.vision.ma4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double convert(cuf cufVar) throws IOException {
        return Double.valueOf(cufVar.s());
    }
}

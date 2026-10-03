package com.oplus.aiunit.vision;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class ldg implements ma4<cuf, Short> {
    public static final ldg a = new ldg();

    @Override // com.oplus.aiunit.vision.ma4
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Short convert(cuf cufVar) throws IOException {
        return Short.valueOf(cufVar.s());
    }
}

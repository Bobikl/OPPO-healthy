package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes18.dex */
public class a70 extends y60<String> {
    @Override // com.oplus.aiunit.vision.c70
    public void onStart() {
        StringBuilder sb = new StringBuilder();
        ydc.n().m(sb);
        t6b.b("ApduGetCplcJob", "cplc of this time: " + ((Object) sb));
        notifyResult(sb.toString());
    }
}

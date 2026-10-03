package org.spongycastle.jcajce.provider.asymmetric.ec;

import com.oplus.aiunit.vision.rna;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes11.dex */
class KeyAgreementSpi$1 extends InvalidKeyException {
    final /* synthetic */ rna this$0;
    final /* synthetic */ Exception val$e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyAgreementSpi$1(rna rnaVar, String str, Exception exc) {
        super(str);
        this.val$e = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.val$e;
    }
}

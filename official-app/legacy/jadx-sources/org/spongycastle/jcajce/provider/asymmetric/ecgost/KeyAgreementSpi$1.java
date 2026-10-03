package org.spongycastle.jcajce.provider.asymmetric.ecgost;

import com.oplus.aiunit.vision.pna;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes11.dex */
class KeyAgreementSpi$1 extends InvalidKeyException {
    final /* synthetic */ pna this$0;
    final /* synthetic */ Exception val$e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyAgreementSpi$1(pna pnaVar, String str, Exception exc) {
        super(str);
        this.val$e = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.val$e;
    }
}

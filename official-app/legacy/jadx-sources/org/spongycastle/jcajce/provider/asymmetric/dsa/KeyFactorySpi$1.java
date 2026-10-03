package org.spongycastle.jcajce.provider.asymmetric.dsa;

import com.oplus.aiunit.vision.aoa;
import java.security.spec.InvalidKeySpecException;

/* JADX INFO: loaded from: classes11.dex */
class KeyFactorySpi$1 extends InvalidKeySpecException {
    final /* synthetic */ aoa this$0;
    final /* synthetic */ Exception val$e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyFactorySpi$1(aoa aoaVar, String str, Exception exc) {
        super(str);
        this.val$e = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.val$e;
    }
}

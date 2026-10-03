package org.spongycastle.jcajce.provider.asymmetric.elgamal;

import com.oplus.aiunit.vision.gb3;
import javax.crypto.BadPaddingException;
import org.spongycastle.crypto.InvalidCipherTextException;

/* JADX INFO: loaded from: classes11.dex */
class CipherSpi$1 extends BadPaddingException {
    final /* synthetic */ gb3 this$0;
    final /* synthetic */ InvalidCipherTextException val$e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CipherSpi$1(gb3 gb3Var, String str, InvalidCipherTextException invalidCipherTextException) {
        super(str);
        this.val$e = invalidCipherTextException;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        return this.val$e;
    }
}

package org.spongycastle.jcajce.provider.asymmetric.util;

import com.oplus.aiunit.vision.b11;
import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;

/* JADX INFO: loaded from: classes11.dex */
class BaseCipherSpi$1 extends InvalidKeyException {
    final /* synthetic */ b11 this$0;
    final /* synthetic */ BadPaddingException val$e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCipherSpi$1(b11 b11Var, String str, BadPaddingException badPaddingException) {
        super(str);
        this.val$e = badPaddingException;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        return this.val$e;
    }
}

package org.spongycastle.jce.interfaces;

import com.oplus.aiunit.vision.qi6;
import java.math.BigInteger;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;

/* JADX INFO: loaded from: classes11.dex */
public interface ElGamalPrivateKey extends DHKey, DHPrivateKey {
    /* synthetic */ qi6 getParameters();

    BigInteger getX();
}

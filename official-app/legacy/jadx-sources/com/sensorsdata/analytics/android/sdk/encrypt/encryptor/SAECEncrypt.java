package com.sensorsdata.analytics.android.sdk.encrypt.encryptor;

import com.oplus.aiunit.vision.apj;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.encrypt.AESSecretManager;
import com.sensorsdata.analytics.android.sdk.encrypt.impl.AbsSAEncrypt;
import com.sensorsdata.analytics.android.sdk.encrypt.utils.EncryptUtils;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import org.spongycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes10.dex */
public class SAECEncrypt extends AbsSAEncrypt {
    byte[] aesKey;
    String mEncryptKey;

    static {
        try {
            String str = BouncyCastleProvider.PROVIDER_NAME;
            Security.addProvider((Provider) BouncyCastleProvider.class.newInstance());
        } catch (Exception e2) {
            SALog.i("SA.SAECEncrypt", e2.toString());
        }
    }

    @Override // com.sensorsdata.analytics.android.sdk.encrypt.SAEncryptListener
    public String asymmetricEncryptType() {
        return apj.Thread_Type_Executor_Cached;
    }

    @Override // com.sensorsdata.analytics.android.sdk.encrypt.impl.AbsSAEncrypt
    public String decryptEventRecord(String str) {
        return AESSecretManager.getInstance().decryptAES(str);
    }

    @Override // com.sensorsdata.analytics.android.sdk.encrypt.SAEncryptListener
    public String encryptEvent(byte[] bArr) {
        return EncryptUtils.symmetricEncrypt(this.aesKey, bArr, SymmetricEncryptMode.AES);
    }

    @Override // com.sensorsdata.analytics.android.sdk.encrypt.impl.AbsSAEncrypt
    public String encryptEventRecord(String str) {
        return AESSecretManager.getInstance().encryptAES(str);
    }

    @Override // com.sensorsdata.analytics.android.sdk.encrypt.SAEncryptListener
    public String encryptSymmetricKeyWithPublicKey(String str) {
        if (this.mEncryptKey == null) {
            try {
                byte[] bArrGenerateSymmetricKey = EncryptUtils.generateSymmetricKey(SymmetricEncryptMode.AES);
                this.aesKey = bArrGenerateSymmetricKey;
                this.mEncryptKey = EncryptUtils.encryptAESKey(str, bArrGenerateSymmetricKey, apj.Thread_Type_Executor_Cached);
            } catch (NoSuchAlgorithmException e2) {
                SALog.printStackTrace(e2);
                return null;
            }
        }
        return this.mEncryptKey;
    }

    @Override // com.sensorsdata.analytics.android.sdk.encrypt.SAEncryptListener
    public String symmetricEncryptType() {
        return "AES";
    }
}

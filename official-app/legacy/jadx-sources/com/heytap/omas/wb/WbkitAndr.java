package com.heytap.omas.wb;

/* JADX INFO: loaded from: classes19.dex */
public class WbkitAndr {
    public static final int a = 0;
    public static final int b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f7665c = 2;

    static {
        System.loadLibrary("wbkit-seckit3");
    }

    public static native byte[] WBkit_AES_CFB_decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6, int i2);

    public static native byte[] WBkit_AES_CFB_encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6, int i2);

    public static native byte[] WBkit_AES_CMS_CFB_decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native byte[] WBkit_AES_CMS_CFB_encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6, byte[] bArr7, int i2);

    public static native byte[] WBkit_AES_CMS_CTR_decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native byte[] WBkit_AES_CMS_CTR_encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6, byte[] bArr7, int i2);

    public static native byte[] WBkit_AES_CMS_GCM_decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native byte[] WBkit_AES_CMS_GCM_encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, int i);

    public static native byte[] WBkit_AES_CMS_OFB_decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native byte[] WBkit_AES_CMS_OFB_encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6, byte[] bArr7, int i2);

    public static native byte[] WBkit_AES_CTR_decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6, int i2);

    public static native byte[] WBkit_AES_CTR_encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6, int i2);

    public static native byte[] WBkit_AES_GCM_decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, int i);

    public static native byte[] WBkit_AES_GCM_encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, int i);

    public static native byte[] WBkit_AES_OFB_decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6, int i2);

    public static native byte[] WBkit_AES_OFB_encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6, int i2);

    public static native byte[] WBkit_SM4_CFB_decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6, int i2);

    public static native byte[] WBkit_SM4_CFB_encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6, int i2);

    public static native byte[] WBkit_SM4_CMS_CFB_decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native byte[] WBkit_SM4_CMS_CFB_encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6, byte[] bArr7, int i2);

    public static native byte[] WBkit_SM4_CMS_CTR_decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native byte[] WBkit_SM4_CMS_CTR_encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6, byte[] bArr7, int i2);

    public static native byte[] WBkit_SM4_CMS_OFB_decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native byte[] WBkit_SM4_CMS_OFB_encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6, byte[] bArr7, int i2);

    public static native byte[] WBkit_SM4_CTR_decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6, int i2);

    public static native byte[] WBkit_SM4_CTR_encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6, int i2);

    public static native byte[] WBkit_SM4_OFB_decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6, int i2);

    public static native byte[] WBkit_SM4_OFB_encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5, byte[] bArr6, int i2);

    public static native byte[] getAppid(byte[] bArr, byte[] bArr2, byte[] bArr3, int i);

    public static native byte[] getKeyids(byte[] bArr, byte[] bArr2, byte[] bArr3, int i);

    public static native byte[] getSk(byte[] bArr, byte[] bArr2, int i);

    public static native byte[] getWhitelist(byte[] bArr, byte[] bArr2, byte[] bArr3, int i);

    public static native byte[] hmac(byte[] bArr, byte[] bArr2);

    public static native byte[] signature(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i);

    public static native int verify(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, int i);
}

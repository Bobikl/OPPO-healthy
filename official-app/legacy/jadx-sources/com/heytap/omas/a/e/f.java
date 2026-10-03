package com.heytap.omas.a.e;

import com.heytap.omas.omkms.exception.AuthenticationException;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes19.dex */
public class f {
    public static byte[] a(byte[] bArr, byte[] bArr2) throws AuthenticationException {
        try {
            return (byte[]) Class.forName("com.heytap.omasnative.CryptoUtil").getDeclaredMethod("osecEciesEncryptWithCert", byte[].class, byte[].class).invoke(null, bArr, bArr2);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            i.b("CipherUtil", "osecEciesEncryptWithCert: " + e2);
            throw new AuthenticationException("No Authentication mode ,must use dependencies \" Implementation 'com.heytap.omas.seckit:jce-andr:$version' \" in file build.gradle of you app module.exception:" + e2);
        }
    }
}

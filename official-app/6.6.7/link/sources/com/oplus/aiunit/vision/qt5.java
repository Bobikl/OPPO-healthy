package com.oplus.aiunit.vision;

import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004H\u0007¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/qt5;", "", "Ljava/io/File;", "file", "", "d", "", "bytes", "e", "encryptedData", "", "usePrivateKey", "a", "publicKeyString", "Ljava/security/PublicKey;", "c", "privateKeyString", "Ljava/security/PrivateKey;", "b", "<init>", "()V", "base-plugin-manage_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDigestUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DigestUtils.kt\ncom/oplus/pantanal/plugin/DigestUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,136:1\n1#2:137\n13316#3,2:138\n*S KotlinDebug\n*F\n+ 1 DigestUtils.kt\ncom/oplus/pantanal/plugin/DigestUtils\n*L\n78#1:138,2\n*E\n"})
public final class qt5 {

    @NotNull
    public static final qt5 INSTANCE = new qt5();

    @JvmStatic
    @NotNull
    public static final String a(@NotNull String encryptedData, boolean usePrivateKey) {
        Cipher cipher;
        Intrinsics.checkNotNullParameter(encryptedData, "encryptedData");
        try {
            Result.Companion companion = Result.Companion;
            s8e s8eVar = s8e.INSTANCE;
            ht9.a.a(s8eVar, "DigestUtils", "decryptData, usePrivateKey=" + usePrivateKey + ", encryptedData=" + encryptedData, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (usePrivateKey) {
                PrivateKey privateKeyB = b("MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAIRHKJNUUMGluDeasHRyL6e3bL3NS7NHnqoo9VrWZi9P8UqBziutFigzg8ShuYyYkqbdM87lSKnua6G3lKk+3i5/j3KGE+a6SHXqG8aGpL2lwEy7xsZHm47Si6HThtyxaw7MsL3HevllwpDUNTt85aMgd2IulfUAvthZzsUocNpdAgMBAAECgYALKFVr1/jX3LqlNg8cQ2VxqC8r810nSis//yRy/RKxevTHbBuP45Gy4mWC+IFGMrhsCsyL7xsp+kpp4apQfFURR9P08opAZIMow6ag5B4ppgBmfTu3Chow632ptM+3eCOT5lET/NjEerWbJlS0nzPPE5XJXdoFtdoMYvkBin1uoQJBAMnTw8BT5RLfdFSX8Z7/O9c7MDhhLE1Xc5B6mEH2SfO7nwD5ecgHSRFKCozATF6nDxPil+ASZuu/5xZvtFvLoQcCQQCnyG2jVSxQ7KbfRKPf6QmUQpaCjckhG/R3HEgQkpkLtwealRMw4C1j7y0upDfr1uyfEKvCUQFOblo/C96ffqR7AkEAoUsqmo6xeHa6Ckzv3UhO84Aq1jPaaujjw2gmPDju+ulLdkTp7VDdNQL+EWQw5EgQRa0GAR3TwL45mPWmpuHCiwJBAJvAFe7KMSJKHLojuNAxPuAvVBKLVgrzLWOokEk6HPJgDKH2AuObJuee7l1euj6mu+8JBbiTg9fv3ryp4xZB9KMCQESs8Ita9k8tOBGehIPf7Jg+02+EAU/dGblt10oYIKRxr7qPkNPkMdr/1T934Py/HDDyZvKi8wM8ZjsSd8E9hSw=");
                cipher = Cipher.getInstance("RSA/ECB/OAEPPadding");
                Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(RSA_OAEP_PADDING)");
                cipher.init(2, privateKeyB);
            } else {
                PublicKey publicKeyC = c("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCRQ+6nTqMd+KQybI1rgCshl+kE79RAd6lsPvw8EXsW814wI0fNj4APoy7lMovhyebIJk7VVHKeOyRoENtMHcUty3i1eYQ94CBbXpmOovYa6xG/16a3vO1tyaA8/GDJrQLHo/CgNbzko8hZF1kGrO5zc4jcZweKdiMQB2pl+DN2owIDAQAB");
                cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(RSA_PK_PADDING)");
                cipher.init(2, publicKeyC);
            }
            byte[] bArrDoFinal = cipher.doFinal(Base64.decode(encryptedData, 0));
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "decryptedData");
            String str = new String(bArrDoFinal, Charsets.UTF_8);
            ht9.a.a(s8eVar, "DigestUtils", "decryptData,decryptedString=" + str + ", const " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + " ms", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return str;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 == null) {
                return "";
            }
            ht9.a.b(s8e.INSTANCE, "DigestUtils", "decryptData error, " + th2, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return "";
        }
    }

    @JvmStatic
    @NotNull
    public static final PrivateKey b(@NotNull String privateKeyString) throws InvalidKeySpecException {
        Intrinsics.checkNotNullParameter(privateKeyString, "privateKeyString");
        PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(privateKeyString, 0)));
        Intrinsics.checkNotNullExpressionValue(privateKeyGeneratePrivate, "keyFactory.generatePrivate(keySpec)");
        return privateKeyGeneratePrivate;
    }

    @JvmStatic
    @NotNull
    public static final PublicKey c(@NotNull String publicKeyString) throws InvalidKeySpecException {
        Intrinsics.checkNotNullParameter(publicKeyString, "publicKeyString");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(publicKeyString, 0)));
        Intrinsics.checkNotNullExpressionValue(publicKeyGeneratePublic, "keyFactory.generatePublic(keySpec)");
        return publicKeyGeneratePublic;
    }

    @JvmStatic
    @Nullable
    public static final String d(@NotNull File file) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(file, "file");
        ht9.a.c(s8e.INSTANCE, "DigestUtils", "Start sha for " + file.getName() + d14.POINT_REGEX, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        try {
            byte[] bArr = new byte[4096];
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                try {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileInputStream, (Throwable) null);
                        ht9.a.c(s8e.INSTANCE, "DigestUtils", "Success sha 256.", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                        byte[] bArrDigest = messageDigest.digest();
                        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest.digest()");
                        return e(bArrDigest);
                    }
                    messageDigest.update(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(fileInputStream, th);
                        throw th2;
                    }
                }
                ht9.a.b(s8e.INSTANCE, "DigestUtils", "IOException exception:" + e.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
                return null;
            }
        } catch (IOException e) {
            ht9.a.b(s8e.INSTANCE, "DigestUtils", "IOException exception:" + e.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        } catch (IllegalStateException e2) {
            ht9.a.b(s8e.INSTANCE, "DigestUtils", "IllegalStateException exception:" + e2.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
    }

    @JvmStatic
    public static final String e(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) {
            sb.append("0123456789abcdef".charAt((b & 240) >>> 4));
            sb.append("0123456789abcdef".charAt(b & 15));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}

package com.oplus.aiunit.vision;

import androidx.autofill.HintConstants;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\r\u001a\u00020\fH\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/nq;", "", "Ljava/io/OutputStream;", "outputStream", "", HintConstants.AUTOFILL_HINT_PASSWORD, "Ljavax/crypto/CipherOutputStream;", "b", "Ljava/io/InputStream;", "inputStream", "Ljavax/crypto/CipherInputStream;", "a", "", "c", "[B", "IV", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class nq {

    @NotNull
    public static final nq INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final byte[] IV;

    static {
        nq nqVar = new nq();
        INSTANCE = nqVar;
        IV = nqVar.c();
    }

    @NotNull
    public final CipherInputStream a(@Nullable InputStream inputStream, @NotNull String password) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(password, "password");
        if (inputStream instanceof CipherInputStream) {
            return (CipherInputStream) inputStream;
        }
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = password.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKeySpec, new GCMParameterSpec(128, IV));
        StringBuilder sb = new StringBuilder();
        sb.append("convertCipherInputStream() called with: inputStream = ");
        sb.append(inputStream);
        sb.append(", password = ");
        sb.append(password);
        return new CipherInputStream(inputStream, cipher);
    }

    @NotNull
    public final CipherOutputStream b(@Nullable OutputStream outputStream, @NotNull String password) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(password, "password");
        if (outputStream instanceof CipherOutputStream) {
            return (CipherOutputStream) outputStream;
        }
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = password.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, secretKeySpec, new GCMParameterSpec(128, IV));
        StringBuilder sb = new StringBuilder();
        sb.append("convertCipherOutputStream() called with: outputStream = ");
        sb.append(outputStream);
        sb.append(", password = ");
        sb.append(password);
        return new CipherOutputStream(outputStream, cipher);
    }

    public final byte[] c() {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) i;
        }
        String str = new String(bArr, Charsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        sb.append("generateSecureBytes() called with:");
        sb.append(str);
        return bArr;
    }
}

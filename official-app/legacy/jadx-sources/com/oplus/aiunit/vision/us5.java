package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.CharsKt__CharJVMKt;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0001\u001a\f\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0001¨\u0006\b"}, d2 = {"", "", "c", "key", "d", MapSchema.FIELD_NAME_ENTRY, "b", "a", "watchface_impl_release"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "DigestUtils")
@SourceDebugExtension({"SMAP\nDigestKt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DigestKt.kt\ncom/heytap/health/watchface/network/utils/DigestUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
public final class us5 {
    @Nullable
    public static final byte[] a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            String strSubstring = str.substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            int i4 = Integer.parseInt(strSubstring, CharsKt__CharJVMKt.checkRadix(16));
            String strSubstring2 = str.substring(i3, i2 + 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            bArr[i] = (byte) ((i4 * 16) + Integer.parseInt(strSubstring2, CharsKt__CharJVMKt.checkRadix(16)));
        }
        return bArr;
    }

    @NotNull
    public static final String b(@Nullable byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "result.toString()");
        return string;
    }

    @NotNull
    public static final String c(@Nullable byte[] bArr) {
        byte[] bArrDigest;
        if (bArr == null) {
            return "";
        }
        if (bArr.length == 0) {
            return "";
        }
        try {
            bArrDigest = MessageDigest.getInstance("MD5").digest(bArr);
        } catch (Exception unused) {
            bArrDigest = null;
        }
        return b(bArrDigest);
    }

    @NotNull
    public static final String d(@Nullable String str, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (str == null || str.length() == 0) {
            return "";
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return e(bytes, key);
    }

    @NotNull
    public static final String e(@Nullable byte[] bArr, @NotNull String key) {
        byte[] bArrSign;
        Intrinsics.checkNotNullParameter(key, "key");
        if (bArr == null) {
            return "";
        }
        if (bArr.length == 0) {
            return "";
        }
        try {
            PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(a(key)));
            Signature signature = Signature.getInstance(q2h.SHA1_WITH_RSA);
            signature.initSign(privateKeyGeneratePrivate);
            signature.update(bArr);
            bArrSign = signature.sign();
        } catch (Exception unused) {
            bArrSign = null;
        }
        return b(bArrSign);
    }
}

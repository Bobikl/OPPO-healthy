package com.oplus.aiunit.vision;

import android.util.Base64;
import com.oplus.nearx.track.internal.utils.Logger;
import io.protostuff.MapSchema;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;
import p010kotlin.text.StringsKt__StringNumberConversionsKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\u0012\u0010\t\u001a\u0004\u0018\u00010\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\f\u0010\u000b\u001a\u00020\u0003*\u00020\u0000H\u0000\u001a\u0016\u0010\u000e\u001a\u00020\f*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\r\u001a\u00020\f\u001a\u0016\u0010\u0010\u001a\u00020\u000f*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\r\u001a\u00020\u000f\u001a\f\u0010\u0011\u001a\u00020\u0000*\u0004\u0018\u00010\u0000¨\u0006\u0012"}, d2 = {"", "a", "f", "", "data", "key", "d", MapSchema.FIELD_NAME_ENTRY, "bytes", b2n.f, "c", "b", "", "default", b2n.g, "", "i", "j", "core-statistics_release"}, k = 2, mv = {1, 7, 1})
public final class u0j {
    @NotNull
    public static final String a(@NotNull String str) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return "";
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            byte[] bArrDecode = Base64.decode(str, 0);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(this, Base64.DEFAULT)");
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            objM5287constructorimpl = Result.m5287constructorimpl(new String(bArrDecode, UTF_8));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            Logger.d(k6k.e(), k6k.TAG, k6k.f(thM5290exceptionOrNullimpl), null, null, 12, null);
        }
        return (String) (Result.m5293isFailureimpl(objM5287constructorimpl) ? "" : objM5287constructorimpl);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    @NotNull
    public static final byte[] b(@NotNull String str) {
        Object objM5287constructorimpl;
        Object objM5287constructorimpl2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            byte[] bytes = "".getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            Result.Companion companion = Result.INSTANCE;
            try {
                byte[] bytes2 = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes2);
                try {
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = byteArrayInputStream.read(bArr);
                            if (i <= 0) {
                                break;
                            }
                            gZIPOutputStream.write(bArr, 0, i);
                            gZIPOutputStream.flush();
                            Result.Companion companion2 = Result.INSTANCE;
                            objM5287constructorimpl2 = Result.m5287constructorimpl(ResultKt.createFailure(th));
                            if (Result.m5293isFailureimpl(objM5287constructorimpl2)) {
                                objM5287constructorimpl2 = null;
                            }
                            Unit unit = (Unit) objM5287constructorimpl2;
                            CloseableKt.closeFinally(gZIPOutputStream, null);
                            objM5287constructorimpl = Result.m5287constructorimpl(unit);
                            Result.m5293isFailureimpl(objM5287constructorimpl);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            Intrinsics.checkNotNullExpressionValue(byteArray, "{\n        val outputStre…tream.toByteArray()\n    }");
                            return byteArray;
                        }
                        Unit unit2 = Unit.INSTANCE;
                        CloseableKt.closeFinally(byteArrayInputStream, null);
                        objM5287constructorimpl2 = Result.m5287constructorimpl(unit2);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(byteArrayInputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM5287constructorimpl2 = Result.m5287constructorimpl(ResultKt.createFailure(th3));
                }
                if (Result.m5293isFailureimpl(objM5287constructorimpl2)) {
                    objM5287constructorimpl2 = null;
                }
                Unit unit3 = (Unit) objM5287constructorimpl2;
                CloseableKt.closeFinally(gZIPOutputStream, null);
                objM5287constructorimpl = Result.m5287constructorimpl(unit3);
                Result.m5293isFailureimpl(objM5287constructorimpl);
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray2, "{\n        val outputStre…tream.toByteArray()\n    }");
                return byteArray2;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    CloseableKt.closeFinally(gZIPOutputStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            Result.Companion companion4 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th6));
        }
    }

    @NotNull
    public static final String c(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        StringBuilder sb = new StringBuilder("");
        int length = data.length;
        for (int i = 0; i < length; i++) {
            int i2 = data[i];
            if (i2 < 0) {
                i2 += 256;
            }
            if (i2 < 16) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(i2));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buf.toString()");
        return string;
    }

    @Nullable
    public static final String d(@NotNull byte[] data, @NotNull String key) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            Intrinsics.checkNotNullExpressionValue(mac, "getInstance(\"HmacSHA1\")");
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
            byte[] bytes = key.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            mac.init(new SecretKeySpec(bytes, mac.getAlgorithm()));
            byte[] bArrDoFinal = mac.doFinal(data);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "mac.doFinal(data)");
            return c(bArrDoFinal);
        } catch (Exception e2) {
            Logger.d(k6k.e(), k6k.TAG, "HMAC-SHA1 encode error: " + e2, null, null, 12, null);
            return null;
        }
    }

    @NotNull
    public static final String e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() <= 16) {
            for (int i = 0; i < 16; i++) {
                str = str + kam.h;
            }
        }
        return str;
    }

    @NotNull
    public static final String f(@NotNull String str) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            return "";
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        try {
            Result.Companion companion = Result.INSTANCE;
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "messageDigest.digest()");
            objM5287constructorimpl = Result.m5287constructorimpl(c(bArrDigest));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m5290exceptionOrNullimpl(objM5287constructorimpl) != null) {
            objM5287constructorimpl = String.valueOf(new String(bytes, Charsets.UTF_8).hashCode());
        }
        return (String) objM5287constructorimpl;
    }

    @Nullable
    public static final String g(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "md.digest()");
            String strC = c(bArrDigest);
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase = strC.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        } catch (Exception e2) {
            Logger.d(k6k.e(), k6k.TAG, "SHA encode error: " + e2, null, null, 12, null);
            return null;
        }
    }

    public static final int h(@Nullable String str, int i) {
        Object objM5287constructorimpl;
        Integer intOrNull;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(Integer.valueOf((str == null || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(str)) == null) ? i : intOrNull.intValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Integer numValueOf = Integer.valueOf(i);
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = numValueOf;
        }
        return ((Number) objM5287constructorimpl).intValue();
    }

    public static final long i(@Nullable String str, long j2) {
        Object objM5287constructorimpl;
        Long longOrNull;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(Long.valueOf((str == null || (longOrNull = StringsKt__StringNumberConversionsKt.toLongOrNull(str)) == null) ? j2 : longOrNull.longValue()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Long lValueOf = Long.valueOf(j2);
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = lValueOf;
        }
        return ((Number) objM5287constructorimpl).longValue();
    }

    @NotNull
    public static final String j(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            bytes[i] = (byte) (bytes[i] ^ 8);
        }
        return new String(bytes, Charsets.UTF_8);
    }
}

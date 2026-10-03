package com.oplus.pay.opensdk.statistic.helper;

import android.util.Base64;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.qae;
import io.protostuff.MapSchema;
import java.security.MessageDigest;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007J\u001a\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006H\u0007J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0011"}, d2 = {"Lcom/oplus/pay/opensdk/statistic/helper/DigestHelper;", "", "", "input", "f", "", "", "flag", "c", "a", "content", "key", b2n.g, "type", MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "paysdk_statistic_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDigestHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DigestHelper.kt\ncom/oplus/pay/opensdk/statistic/helper/DigestHelper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,84:1\n13654#2,3:85\n13004#2,3:88\n*S KotlinDebug\n*F\n+ 1 DigestHelper.kt\ncom/oplus/pay/opensdk/statistic/helper/DigestHelper\n*L\n63#1:85,3\n76#1:88,3\n*E\n"})
public final class DigestHelper {

    @NotNull
    public static final DigestHelper INSTANCE = new DigestHelper();

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final byte[] a(@NotNull String input, int flag) {
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            byte[] bArrDecode = Base64.decode(input, flag);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(input, flag)");
            return bArrDecode;
        } catch (Exception e2) {
            qae.c(e2.getMessage());
            return new byte[0];
        }
    }

    public static /* synthetic */ byte[] b(String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return a(str, i);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final String c(@NotNull byte[] input, int flag) {
        Intrinsics.checkNotNullParameter(input, "input");
        String strEncodeToString = Base64.encodeToString(input, flag);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(input, flag)");
        return strEncodeToString;
    }

    public static /* synthetic */ String d(byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return c(bArr, i);
    }

    @JvmStatic
    @NotNull
    public static final String f(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return INSTANCE.e("MD5", input);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final String g(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return i(content, 0, 2, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final String h(@NotNull String content, int key) {
        Intrinsics.checkNotNullParameter(content, "content");
        byte b = (byte) key;
        byte[] bytes = content.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            bytes[i2] = (byte) (bytes[i] ^ b);
            i++;
            i2++;
        }
        return new String(bytes, Charsets.UTF_8);
    }

    public static /* synthetic */ String i(String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8;
        }
        return h(str, i);
    }

    public final String e(String type, String input) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(type);
            byte[] bytes = input.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] bytes2 = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(bytes2, "bytes");
            return ArraysKt___ArraysKt.joinToString$default(bytes2, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) new Function1<Byte, CharSequence>() { // from class: com.oplus.pay.opensdk.statistic.helper.DigestHelper$hashString$1
                @NotNull
                public final CharSequence invoke(byte b) {
                    String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
                    return str;
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                    return invoke(b.byteValue());
                }
            }, 30, (Object) null);
        } catch (Exception e2) {
            qae.c(e2.getMessage());
            return "";
        }
    }
}

package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/qs5;", "", "", "content", "", "key", "b", "<init>", "()V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDigestHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DigestHelper.kt\ncom/oplus/pay/opensdk/web/util/DigestHelper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,83:1\n13654#2,3:84\n13004#2,3:87\n*S KotlinDebug\n*F\n+ 1 DigestHelper.kt\ncom/oplus/pay/opensdk/web/util/DigestHelper\n*L\n62#1:84,3\n75#1:87,3\n*E\n"})
public final class qs5 {

    @NotNull
    public static final qs5 INSTANCE = new qs5();

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final String a(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return c(content, 0, 2, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final String b(@NotNull String content, int key) {
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

    public static /* synthetic */ String c(String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8;
        }
        return b(str, i);
    }
}

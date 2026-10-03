package com.oplus.aiunit.vision;

import com.oplus.wearable.linkservice.sdk.Node;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/ot5;", "", "", "content", "", Node.I_KEY, "b", "<init>", "()V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDigestHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DigestHelper.kt\ncom/oplus/pay/opensdk/web/util/DigestHelper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,83:1\n13654#2,3:84\n13004#2,3:87\n*S KotlinDebug\n*F\n+ 1 DigestHelper.kt\ncom/oplus/pay/opensdk/web/util/DigestHelper\n*L\n62#1:84,3\n75#1:87,3\n*E\n"})
public final class ot5 {

    @NotNull
    public static final ot5 INSTANCE = new ot5();

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final String a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "content");
        return c(str, 0, 2, null);
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

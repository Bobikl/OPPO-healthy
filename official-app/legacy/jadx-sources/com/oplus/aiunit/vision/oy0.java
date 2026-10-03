package com.oplus.aiunit.vision;

import android.util.Base64;
import java.nio.charset.Charset;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/oy0;", "", "", "text", "a", "<init>", "()V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class oy0 {
    public static final oy0 INSTANCE = new oy0();

    @Nullable
    public final String a(@Nullable String text) {
        if (text == null || text.length() == 0) {
            return null;
        }
        try {
            Charset charset = Charsets.UTF_8;
            if (text == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = text.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            return Base64.encodeToString(bytes, 0);
        } catch (Throwable unused) {
            return text;
        }
    }
}

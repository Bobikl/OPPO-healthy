package com.oplus.aiunit.vision;

import java.nio.charset.Charset;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002\u001a\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¨\u0006\b"}, d2 = {"", "by", "", "b", "region", "c", "", "d", "com.heytap.nearx.taphttp-env"}, k = 2, mv = {1, 4, 0})
public final class xo6 {
    public static final String b(byte[] bArr) {
        Charset charsetForName = Charset.forName("utf-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "Charset.forName(\"utf-8\")");
        return new String(bArr, charsetForName);
    }

    @NotNull
    public static final String c(@NotNull String region) {
        Intrinsics.checkNotNullParameter(region, "region");
        return qj9.INSTANCE.a();
    }

    @NotNull
    public static final List<String> d() {
        return CollectionsKt__CollectionsJVMKt.listOf(qj9.INSTANCE.a());
    }
}

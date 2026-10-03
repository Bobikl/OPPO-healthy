package com.oplus.pay.opensdk.web.util;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "eachByte", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class DigestHelper$hashString$1 extends Lambda implements Function1<Byte, CharSequence> {
    public static final DigestHelper$hashString$1 INSTANCE = new DigestHelper$hashString$1();

    public DigestHelper$hashString$1() {
        super(1);
    }

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
}

package com.oplus.nearx.net;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 16})
final class ICloudHttpClient$Companion$DEFAULT$1$sendRequest$4 extends Lambda implements Function0<byte[]> {
    final /* synthetic */ byte[] $byteArray;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ICloudHttpClient$Companion$DEFAULT$1$sendRequest$4(byte[] bArr) {
        super(0);
        this.$byteArray = bArr;
    }

    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final byte[] invoke() {
        return this.$byteArray;
    }
}

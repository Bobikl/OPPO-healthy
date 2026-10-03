package com.heytap.httpdns.webkit.extension.api;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "", "headerName", "invoke", "com/heytap/httpdns/webkit/extension/api/HeaderInterceptorImpl$handleResponseHeader$1$1"}, k = 3, mv = {1, 4, 0})
final class HeaderInterceptorImpl$handleResponseHeader$$inlined$forEach$lambda$1 extends Lambda implements Function1<String, String> {
    final /* synthetic */ Map $rspHeader$inlined;
    final /* synthetic */ String $url$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderInterceptorImpl$handleResponseHeader$$inlined$forEach$lambda$1(String str, Map map) {
        super(1);
        this.$url$inlined = str;
        this.$rspHeader$inlined = map;
    }

    @Override // p010kotlin.jvm.functions.Function1
    @Nullable
    public final String invoke(@NotNull String headerName) {
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        return (String) this.$rspHeader$inlined.get(headerName);
    }
}

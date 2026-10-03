package com.oplus.aiunit.vision;

import io.netty.util.internal.StringUtil;
import java.net.Proxy;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/tqf;", "", "Lokhttp3/Request;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", "a", "Lcom/oplus/aiunit/vision/uk9;", "url", "c", "", "b", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class tqf {
    public static final tqf INSTANCE = new tqf();

    @NotNull
    public final String a(@NotNull Request request, @NotNull Proxy.Type proxyType) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.getMethod());
        sb.append(StringUtil.SPACE);
        tqf tqfVar = INSTANCE;
        if (tqfVar.b(request, proxyType)) {
            sb.append(request.getUrl());
        } else {
            sb.append(tqfVar.c(request.getUrl()));
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final boolean b(Request request, Proxy.Type proxyType) {
        return !request.k() && proxyType == Proxy.Type.HTTP;
    }

    @NotNull
    public final String c(@NotNull uk9 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String strD = url.d();
        String strF = url.f();
        if (strF == null) {
            return strD;
        }
        return strD + '?' + strF;
    }
}

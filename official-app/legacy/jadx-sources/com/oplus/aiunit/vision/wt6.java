package com.oplus.aiunit.vision;

import com.heytap.okhttp.extension.util.ExIOException;
import java.io.IOException;
import java.net.InetAddress;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/wt6;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lcom/oplus/aiunit/vision/syf;", "route", "Lcom/oplus/aiunit/vision/wr2;", "call", "Ljava/io/IOException;", "a", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class wt6 {
    public static final wt6 INSTANCE = new wt6();

    @NotNull
    public final IOException a(@NotNull Exception exception, @NotNull syf route, @NotNull wr2 call) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(call, "call");
        ExIOException exIOException = new ExIOException(exception);
        InetAddress address = route.getSocketAddress().getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "route.socketAddress.address");
        exIOException.setLastConnectIp(address.getHostAddress());
        ezj ezjVarF = ks2.f(call);
        if (ezjVarF != null) {
            exIOException.setConnectTime(ezjVarF.B(), ezjVarF.F());
        }
        return exIOException;
    }
}

package com.oplus.aiunit.vision;

import android.net.SSLSessionCache;
import com.heytap.conscrypt.Strategy;
import com.heytap.webview.extension.protocol.Const;
import java.io.File;
import java.io.IOException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSessionContext;
import org.conscrypt.ClientSessionContext;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.OpenSSLContextImpl;
import org.conscrypt.SSLClientSessionCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u000f\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/gag;", "", "Landroid/net/SSLSessionCache;", "cache", "Ljavax/net/ssl/SSLContext;", "context", "", "a", "Ljava/io/File;", Const.Scheme.SCHEME_FILE, "b", "Lcom/oplus/aiunit/vision/HeyConfig;", "config", "Lorg/conscrypt/OpenSSLContextImpl;", "sslContext", "c", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class gag {
    public static final gag INSTANCE = new gag();

    public final void a(@Nullable SSLSessionCache cache, @NotNull SSLContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (cache == null) {
            return;
        }
        SSLSessionContext clientSessionContext = context.getClientSessionContext();
        Intrinsics.checkNotNullExpressionValue(clientSessionContext, "context.clientSessionContext");
        clientSessionContext.setSessionCacheSize(800);
        SSLSessionContext clientSessionContext2 = context.getClientSessionContext();
        Intrinsics.checkNotNullExpressionValue(clientSessionContext2, "context.clientSessionContext");
        clientSessionContext2.setSessionTimeout(604800);
    }

    public final void b(@Nullable File file, @NotNull SSLContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (file == null) {
            return;
        }
        SSLSessionContext clientSessionContext = context.getClientSessionContext();
        Intrinsics.checkNotNullExpressionValue(clientSessionContext, "context.clientSessionContext");
        clientSessionContext.setSessionCacheSize(800);
        SSLSessionContext clientSessionContext2 = context.getClientSessionContext();
        Intrinsics.checkNotNullExpressionValue(clientSessionContext2, "context.clientSessionContext");
        clientSessionContext2.setSessionTimeout(604800);
    }

    public final void c(@Nullable HeyConfig config, @NotNull OpenSSLContextImpl sslContext) {
        Intrinsics.checkNotNullParameter(sslContext, "sslContext");
        if (config != null) {
            int iC = config.c();
            File fileB = config.b();
            SSLClientSessionCache sSLClientSessionCacheUsingDirectory = null;
            if (fileB != null) {
                try {
                    sSLClientSessionCacheUsingDirectory = FileClientSessionCache.usingDirectory(fileB);
                } catch (IOException unused) {
                }
            }
            ClientSessionContext clientSessionContextEngineGetClientSessionContext = sslContext.engineGetClientSessionContext();
            if (clientSessionContextEngineGetClientSessionContext != null) {
                clientSessionContextEngineGetClientSessionContext.setSessionCacheSize(800);
                clientSessionContextEngineGetClientSessionContext.setSessionTimeout(604800);
                if (clientSessionContextEngineGetClientSessionContext instanceof ClientSessionContext) {
                    try {
                        if (iC == 1) {
                            clientSessionContextEngineGetClientSessionContext.setStrategy(Strategy.OPEN);
                        } else {
                            clientSessionContextEngineGetClientSessionContext.setStrategy(Strategy.GOOGLE_RECOMMEND);
                        }
                    } catch (Throwable unused2) {
                    }
                    if (sSLClientSessionCacheUsingDirectory != null) {
                        clientSessionContextEngineGetClientSessionContext.setPersistentCache(sSLClientSessionCacheUsingDirectory);
                    }
                }
            }
        }
    }
}

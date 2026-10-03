package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.SSLSessionCache;
import com.heytap.common.LogLevel;
import com.heytap.httpdns.env.ApiEnv;
import com.oplus.nearx.track.internal.common.content.GlobalConfigHelper;
import com.oplus.nearx.track.internal.utils.Logger;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/fag;", "", "Ljavax/net/ssl/TrustManager;", "trustManager", "Landroid/net/SSLSessionCache;", "sessionCache", "Ljavax/net/ssl/SSLSocketFactory;", "b", "Ljavax/net/ssl/X509TrustManager;", "c", "Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/HeyConfig;", "a", "<init>", "()V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class fag {

    @NotNull
    public static final fag INSTANCE = new fag();

    @NotNull
    public final HeyConfig a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        HeyConfig heyConfigA = new HeyConfig.Builder().c(ApiEnv.RELEASE).d(LogLevel.LEVEL_NONE).e(GlobalConfigHelper.INSTANCE.c().getDir("track_sslcache", 0)).f(1).g().setSessionTimeoutSecond(604800).configSessionReuseSwitch(true).a(context);
        Intrinsics.checkNotNullExpressionValue(heyConfigA, "Builder()\n            .s…          .build(context)");
        return heyConfigA;
    }

    @Nullable
    public final SSLSocketFactory b(@NotNull TrustManager trustManager, @Nullable SSLSessionCache sessionCache) throws NoSuchAlgorithmException, KeyManagementException {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, new TrustManager[]{trustManager}, null);
        sSLContext.getClientSessionContext().setSessionCacheSize(0);
        sSLContext.getClientSessionContext().setSessionTimeout(604800);
        if (sessionCache != null) {
            try {
                SSLSessionCache.class.getMethod("install", SSLSessionCache.class, SSLContext.class).invoke(null, sessionCache, sSLContext);
            } catch (Exception unused) {
            }
            Logger.b(k6k.e(), "RequestNet", "session saved!", null, null, 12, null);
        }
        return sSLContext.getSocketFactory();
    }

    @Nullable
    public final X509TrustManager c() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            Intrinsics.checkNotNullExpressionValue(trustManagerFactory, "getInstance(\n           …Algorithm()\n            )");
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            Intrinsics.checkNotNullExpressionValue(trustManagers, "trustManagerFactory.trustManagers");
            boolean z = true;
            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                z = false;
            }
            if (z) {
                TrustManager trustManager = trustManagers[0];
                Intrinsics.checkNotNull(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected default trust managers:");
            String string = Arrays.toString(trustManagers);
            Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
            sb.append(string);
            throw new IllegalStateException(sb.toString().toString());
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }
}

package com.heytap.nearx.tangramconfig.net;

import com.heytap.nearx.tangramconfig.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/heytap/nearx/tangramconfig/net/INetworkCallback;", "", "isNetworkAvailable", "", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface INetworkCallback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/nearx/tangramconfig/net/INetworkCallback$Companion;", "", "()V", "DEFAULT", "Lcom/heytap/nearx/tangramconfig/net/INetworkCallback;", "getDEFAULT", "()Lcom/heytap/nearx/tangramconfig/net/INetworkCallback;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final INetworkCallback DEFAULT = new INetworkCallback() { // from class: com.heytap.nearx.tangramconfig.net.INetworkCallback$Companion$DEFAULT$1
            @Override // com.heytap.nearx.tangramconfig.net.INetworkCallback
            public boolean isNetworkAvailable() {
                return true;
            }
        };

        private Companion() {
        }

        @NotNull
        public final INetworkCallback getDEFAULT() {
            return DEFAULT;
        }
    }

    boolean isNetworkAvailable();
}

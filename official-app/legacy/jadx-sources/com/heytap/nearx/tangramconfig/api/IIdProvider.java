package com.heytap.nearx.tangramconfig.api;

import com.heytap.nearx.tangramconfig.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&¨\u0006\b"}, d2 = {"Lcom/heytap/nearx/tangramconfig/api/IIdProvider;", "", "getDuid", "", "getGuid", "getImei", "getOuid", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IIdProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/nearx/tangramconfig/api/IIdProvider$Companion;", "", "()V", "DEFAULT", "Lcom/heytap/nearx/tangramconfig/api/IIdProvider;", "getDEFAULT", "()Lcom/heytap/nearx/tangramconfig/api/IIdProvider;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final IIdProvider DEFAULT = new IIdProvider() { // from class: com.heytap.nearx.tangramconfig.api.IIdProvider$Companion$DEFAULT$1
            @Override // com.heytap.nearx.tangramconfig.api.IIdProvider
            @Nullable
            public String getDuid() {
                return null;
            }

            @Override // com.heytap.nearx.tangramconfig.api.IIdProvider
            @Nullable
            public String getGuid() {
                return null;
            }

            @Override // com.heytap.nearx.tangramconfig.api.IIdProvider
            @Nullable
            public String getImei() {
                return null;
            }

            @Override // com.heytap.nearx.tangramconfig.api.IIdProvider
            @Nullable
            public String getOuid() {
                return null;
            }
        };

        private Companion() {
        }

        @NotNull
        public final IIdProvider getDEFAULT() {
            return DEFAULT;
        }
    }

    @Nullable
    String getDuid();

    @Nullable
    String getGuid();

    @Nullable
    String getImei();

    @Nullable
    String getOuid();
}

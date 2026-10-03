package com.heytap.nearx.tangramconfig.api;

import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.bean.CheckupdateInfo;
import com.heytap.nearx.tangramconfig.bean.ConfigVersionInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0000H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH&¨\u0006\u0011"}, d2 = {"Lcom/heytap/nearx/tangramconfig/api/IConfigUpdateListener;", "", "addConfigUpdateListener", "", "updateListener", "onCheckUpdateStatus", "status", "Lcom/heytap/nearx/tangramconfig/api/CheckUpdateStatus;", "onConfigUpdateAfter", "state", "Lcom/heytap/nearx/tangramconfig/bean/ConfigVersionInfo;", "onConfigUpdateFailed", "onConfigUpdateProgress", "checkupdateInfo", "Lcom/heytap/nearx/tangramconfig/bean/CheckupdateInfo;", "configVersionInfo", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IConfigUpdateListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/nearx/tangramconfig/api/IConfigUpdateListener$Companion;", "", "()V", "DEFAULT", "Lcom/heytap/nearx/tangramconfig/api/IConfigUpdateListener;", "getDEFAULT", "()Lcom/heytap/nearx/tangramconfig/api/IConfigUpdateListener;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final IConfigUpdateListener DEFAULT = new IConfigUpdateListener() { // from class: com.heytap.nearx.tangramconfig.api.IConfigUpdateListener$Companion$DEFAULT$1
            @Override // com.heytap.nearx.tangramconfig.api.IConfigUpdateListener
            public void addConfigUpdateListener(@NotNull IConfigUpdateListener updateListener) {
                Intrinsics.checkNotNullParameter(updateListener, "updateListener");
            }

            @Override // com.heytap.nearx.tangramconfig.api.IConfigUpdateListener
            public void onCheckUpdateStatus(@NotNull CheckUpdateStatus status) {
                Intrinsics.checkNotNullParameter(status, "status");
            }

            @Override // com.heytap.nearx.tangramconfig.api.IConfigUpdateListener
            public void onConfigUpdateAfter(@NotNull ConfigVersionInfo state) {
                Intrinsics.checkNotNullParameter(state, "state");
            }

            @Override // com.heytap.nearx.tangramconfig.api.IConfigUpdateListener
            public void onConfigUpdateFailed(@NotNull ConfigVersionInfo state) {
                Intrinsics.checkNotNullParameter(state, "state");
            }

            @Override // com.heytap.nearx.tangramconfig.api.IConfigUpdateListener
            public void onConfigUpdateProgress(@NotNull CheckupdateInfo checkupdateInfo, @NotNull ConfigVersionInfo configVersionInfo) {
                Intrinsics.checkNotNullParameter(checkupdateInfo, "checkupdateInfo");
                Intrinsics.checkNotNullParameter(configVersionInfo, "configVersionInfo");
            }
        };

        private Companion() {
        }

        @NotNull
        public final IConfigUpdateListener getDEFAULT() {
            return DEFAULT;
        }
    }

    void addConfigUpdateListener(@NotNull IConfigUpdateListener updateListener);

    void onCheckUpdateStatus(@NotNull CheckUpdateStatus status);

    void onConfigUpdateAfter(@NotNull ConfigVersionInfo state);

    void onConfigUpdateFailed(@NotNull ConfigVersionInfo state);

    void onConfigUpdateProgress(@NotNull CheckupdateInfo checkupdateInfo, @NotNull ConfigVersionInfo configVersionInfo);
}

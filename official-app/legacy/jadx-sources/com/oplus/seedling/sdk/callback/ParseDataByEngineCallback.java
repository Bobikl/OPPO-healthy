package com.oplus.seedling.sdk.callback;

import com.oplus.seedling.sdk.seedling.SeedlingUIData;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/oplus/seedling/sdk/callback/ParseDataByEngineCallback;", "", "onFailed", "", "errorCode", "", "errorMsg", "", "onSuccess", "uiData", "Lcom/oplus/seedling/sdk/seedling/SeedlingUIData;", "Companion", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ParseDataByEngineCallback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int ERROR_CODE_DATA_IS_NULL = 1;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/oplus/seedling/sdk/callback/ParseDataByEngineCallback$Companion;", "", "()V", "ERROR_CODE_DATA_IS_NULL", "", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int ERROR_CODE_DATA_IS_NULL = 1;

        private Companion() {
        }
    }

    void onFailed(int errorCode, @NotNull String errorMsg);

    void onSuccess(@NotNull SeedlingUIData uiData);
}

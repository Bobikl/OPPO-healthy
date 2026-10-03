package com.heytap.store.platform.share;

import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/heytap/store/platform/share/ShareEntity;", "", "sharePlatform", "Lcom/heytap/store/platform/share/SharePlatform;", "(Lcom/heytap/store/platform/share/SharePlatform;)V", "getSharePlatform", "()Lcom/heytap/store/platform/share/SharePlatform;", "setSharePlatform", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 4, 2})
public abstract class ShareEntity {

    @Nullable
    private SharePlatform sharePlatform;

    public ShareEntity(@Nullable SharePlatform sharePlatform) {
        this.sharePlatform = sharePlatform;
    }

    @Nullable
    public final SharePlatform getSharePlatform() {
        return this.sharePlatform;
    }

    public final void setSharePlatform(@Nullable SharePlatform sharePlatform) {
        this.sharePlatform = sharePlatform;
    }
}

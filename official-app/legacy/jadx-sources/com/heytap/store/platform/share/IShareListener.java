package com.heytap.store.platform.share;

import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/heytap/store/platform/share/IShareListener;", "", "onCancel", "", "onFailure", "message", "", "onSuccess", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 4, 2})
public interface IShareListener {
    void onCancel();

    void onFailure(@Nullable String message);

    void onSuccess();
}

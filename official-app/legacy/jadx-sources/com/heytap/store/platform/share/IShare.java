package com.heytap.store.platform.share;

import android.app.Activity;
import com.heytap.store.base.core.util.RxBus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/heytap/store/platform/share/IShare;", "", RxBus.SHARE, "", "activity", "Landroid/app/Activity;", "entity", "Lcom/heytap/store/platform/share/ShareEntity;", "listener", "Lcom/heytap/store/platform/share/IShareListener;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 4, 2})
public interface IShare {
    void share(@NotNull Activity activity, @NotNull ShareEntity entity, @Nullable IShareListener listener);
}

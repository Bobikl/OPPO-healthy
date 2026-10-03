package com.heytap.store.base.core.navigation;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/heytap/store/base/core/navigation/IBaseRouter;", "", NotificationCompat.CATEGORY_NAVIGATION, "", "activity", "Landroid/app/Activity;", "url", "", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IBaseRouter {
    void navigation(@NotNull Activity activity, @NotNull String url);
}

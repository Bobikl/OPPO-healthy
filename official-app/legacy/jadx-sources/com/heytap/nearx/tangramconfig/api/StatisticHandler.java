package com.heytap.nearx.tangramconfig.api;

import android.content.Context;
import com.heytap.nearx.tangramconfig.BuildConfig;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\fH&¨\u0006\r"}, d2 = {"Lcom/heytap/nearx/tangramconfig/api/StatisticHandler;", "", "recordCustomEvent", "", "context", "Landroid/content/Context;", "appId", "", "categoryId", "", "eventId", "map", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface StatisticHandler {
    void recordCustomEvent(@NotNull Context context, int appId, @NotNull String categoryId, @NotNull String eventId, @NotNull Map<String, String> map);
}

package com.heytap.nearx.tangramconfig.api;

import android.content.Context;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.oplus.aiunit.vision.r7b;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J<\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\tH\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/heytap/nearx/tangramconfig/api/DefaultStatisticHandler;", "Lcom/heytap/nearx/tangramconfig/api/StatisticHandler;", "Landroid/content/Context;", "context", "", "appId", "", "categoryId", "eventId", "", "map", "", "recordCustomEvent", "Lcom/oplus/aiunit/vision/r7b;", "logger", "Lcom/oplus/aiunit/vision/r7b;", "", "isV1Enable", "Z", "isV2Enable", "isV3Enable", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasRemind", "Ljava/util/concurrent/atomic/AtomicBoolean;", "<init>", "(Landroid/content/Context;Lcom/oplus/aiunit/vision/r7b;)V", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1})
public final class DefaultStatisticHandler implements StatisticHandler {

    @NotNull
    private AtomicBoolean hasRemind;
    private boolean isV1Enable;
    private boolean isV2Enable;
    private boolean isV3Enable;

    @NotNull
    private final r7b logger;

    public DefaultStatisticHandler(@NotNull Context context, @NotNull r7b logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        this.isV1Enable = true;
        this.isV2Enable = true;
        this.isV3Enable = true;
        this.hasRemind = new AtomicBoolean(false);
    }

    @Override // com.heytap.nearx.tangramconfig.api.StatisticHandler
    public void recordCustomEvent(@NotNull Context context, int appId, @NotNull String categoryId, @NotNull String eventId, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(map, "map");
    }
}

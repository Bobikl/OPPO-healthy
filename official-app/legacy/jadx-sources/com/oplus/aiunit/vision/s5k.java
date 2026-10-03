package com.oplus.aiunit.vision;

import com.oplus.nearx.track.internal.storage.db.common.entity.AppConfig;
import com.oplus.nearx.track.internal.storage.db.common.entity.AppIds;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&J\u0017\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\rH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/s5k;", "", "Lcom/oplus/nearx/track/internal/storage/db/common/entity/AppConfig;", "appConfig", "", "c", "d", "", "appId", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/nearx/track/internal/storage/db/common/entity/AppIds;", "appIds", "a", "", "b", "()[Ljava/lang/Long;", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public interface s5k {
    void a(@NotNull AppIds appIds);

    @Nullable
    Long[] b();

    void c(@NotNull AppConfig appConfig);

    void d(@NotNull AppConfig appConfig);

    @Nullable
    AppConfig e(long appId);
}

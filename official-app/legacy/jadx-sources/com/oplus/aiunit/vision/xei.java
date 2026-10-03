package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.health.device_data_sync.data_sync.IDataSyncService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/xei;", "Lcom/oplus/aiunit/vision/ky9;", "", "filePath", "Lcom/heytap/databaseengine/model/OneTimeSport;", "t", "oneTimeSport", b2n.g, "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class xei implements ky9 {
    public static final int $stable = 0;

    @Override // com.oplus.aiunit.vision.ky9
    @Nullable
    public String h(@NotNull OneTimeSport oneTimeSport) {
        Intrinsics.checkNotNullParameter(oneTimeSport, "oneTimeSport");
        return ((IDataSyncService) x0.d().h(IDataSyncService.class)).h(oneTimeSport);
    }

    @Override // com.oplus.aiunit.vision.ky9
    @Nullable
    public OneTimeSport t(@NotNull String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return ((IDataSyncService) x0.d().h(IDataSyncService.class)).t(filePath);
    }
}

package com.heytap.health.watchpair.manager;

import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.urf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¨\u0006\r"}, d2 = {"Lcom/heytap/health/watchpair/manager/a;", "", "Lcom/oplus/aiunit/vision/urf;", "downloadType", "Lcom/heytap/health/watchpair/manager/b;", "downloadResult", "", "a", "", "model", "b", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class a {

    @NotNull
    public static final a INSTANCE = new a();

    public final void a(@NotNull urf downloadType, @NotNull DownloadResult downloadResult) {
        Intrinsics.checkNotNullParameter(downloadType, "downloadType");
        Intrinsics.checkNotNullParameter(downloadResult, "downloadResult");
        ml4.d("DeviceResEventHelper", "reportDownloadState downloadType:" + downloadType + " downloadResult:" + downloadResult);
        com.heytap.health.base.track.a.b bVar = new com.heytap.health.base.track.a.b(2019);
        bVar.a("strategy_type", Integer.valueOf(downloadType.getEventType()));
        bVar.a("start_download_time", String.valueOf(downloadResult.getStartTime()));
        bVar.a("download_model", downloadResult.getModel());
        bVar.a("download_type", Integer.valueOf(!downloadResult.getDownloadState().a() ? 1 : 0));
        if (downloadResult.getDownloadState() instanceof c.b) {
            c downloadState = downloadResult.getDownloadState();
            Intrinsics.checkNotNull(downloadState, "null cannot be cast to non-null type com.heytap.health.watchpair.manager.ResDownloadState.DownloadFail");
            bVar.a("download_faile_reason", ((c.b) downloadState).getMsg());
        } else {
            bVar.a("download_duration", Long.valueOf(downloadResult.getStartTime() - downloadResult.getEndTime()));
        }
        bVar.b();
    }

    public final void b(@Nullable String model) {
        ml4.d("DeviceResEventHelper", "reportPocketShow model:" + model);
        com.heytap.health.base.track.a.b bVar = new com.heytap.health.base.track.a.b(2019);
        if (model != null) {
            bVar.a("download_model", model);
        }
        bVar.a("strategy_type", 4);
        bVar.a("general_figure_out_count", 1);
        bVar.b();
    }
}

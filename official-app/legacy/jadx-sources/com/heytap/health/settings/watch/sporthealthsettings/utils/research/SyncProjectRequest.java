package com.heytap.health.settings.watch.sporthealthsettings.utils.research;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/settings/watch/sporthealthsettings/utils/research/SyncProjectRequest;", "", "syncProjectStates", "", "Lcom/heytap/health/settings/watch/sporthealthsettings/utils/research/SyncProjectState;", "(Ljava/util/List;)V", "getSyncProjectStates", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SyncProjectRequest {
    public static final int $stable = 8;

    @NotNull
    private final List<SyncProjectState> syncProjectStates;

    public SyncProjectRequest(@NotNull List<SyncProjectState> syncProjectStates) {
        Intrinsics.checkNotNullParameter(syncProjectStates, "syncProjectStates");
        this.syncProjectStates = syncProjectStates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncProjectRequest copy$default(SyncProjectRequest syncProjectRequest, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = syncProjectRequest.syncProjectStates;
        }
        return syncProjectRequest.copy(list);
    }

    @NotNull
    public final List<SyncProjectState> component1() {
        return this.syncProjectStates;
    }

    @NotNull
    public final SyncProjectRequest copy(@NotNull List<SyncProjectState> syncProjectStates) {
        Intrinsics.checkNotNullParameter(syncProjectStates, "syncProjectStates");
        return new SyncProjectRequest(syncProjectStates);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SyncProjectRequest) && Intrinsics.areEqual(this.syncProjectStates, ((SyncProjectRequest) other).syncProjectStates);
    }

    @NotNull
    public final List<SyncProjectState> getSyncProjectStates() {
        return this.syncProjectStates;
    }

    public int hashCode() {
        return this.syncProjectStates.hashCode();
    }

    @NotNull
    public String toString() {
        return "SyncProjectRequest(syncProjectStates=" + this.syncProjectStates + ")";
    }
}

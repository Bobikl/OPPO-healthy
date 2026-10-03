package com.heytap.health.sleep.formula;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.snore.SnoreRecordTimeInterval;
import com.heytap.health.sleep.formula.formula.OsaSnoreMultiFragBean;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u001aR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/sleep/formula/SnoreParameterBean;", "", "()V", "firstSnoreTimestamp", "", "getFirstSnoreTimestamp", "()J", "setFirstSnoreTimestamp", "(J)V", "fragBean", "Lcom/heytap/health/sleep/formula/formula/OsaSnoreMultiFragBean;", "getFragBean", "()Lcom/heytap/health/sleep/formula/formula/OsaSnoreMultiFragBean;", "setFragBean", "(Lcom/heytap/health/sleep/formula/formula/OsaSnoreMultiFragBean;)V", "lastSnoreTimestamp", "getLastSnoreTimestamp", "setLastSnoreTimestamp", "recordTimeList", "", "Lcom/heytap/databaseengine/model/snore/SnoreRecordTimeInterval;", "getRecordTimeList", "()Ljava/util/List;", "setRecordTimeList", "(Ljava/util/List;)V", "isEmpty", "", "sleep_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SnoreParameterBean {
    public static final int $stable = 8;
    private long firstSnoreTimestamp;

    @Nullable
    private OsaSnoreMultiFragBean fragBean;
    private long lastSnoreTimestamp;

    @NotNull
    private List<SnoreRecordTimeInterval> recordTimeList = new ArrayList();

    public final long getFirstSnoreTimestamp() {
        return this.firstSnoreTimestamp;
    }

    @Nullable
    public final OsaSnoreMultiFragBean getFragBean() {
        return this.fragBean;
    }

    public final long getLastSnoreTimestamp() {
        return this.lastSnoreTimestamp;
    }

    @NotNull
    public final List<SnoreRecordTimeInterval> getRecordTimeList() {
        return this.recordTimeList;
    }

    public final boolean isEmpty() {
        return this.fragBean == null;
    }

    public final void setFirstSnoreTimestamp(long j2) {
        this.firstSnoreTimestamp = j2;
    }

    public final void setFragBean(@Nullable OsaSnoreMultiFragBean osaSnoreMultiFragBean) {
        this.fragBean = osaSnoreMultiFragBean;
    }

    public final void setLastSnoreTimestamp(long j2) {
        this.lastSnoreTimestamp = j2;
    }

    public final void setRecordTimeList(@NotNull List<SnoreRecordTimeInterval> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.recordTimeList = list;
    }
}

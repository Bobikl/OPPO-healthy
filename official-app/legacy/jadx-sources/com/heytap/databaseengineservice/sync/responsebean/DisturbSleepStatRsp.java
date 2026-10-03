package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R$\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/DisturbSleepStatRsp;", "", "()V", "dataList", "", "Lcom/heytap/databaseengineservice/sync/responsebean/AppUsageStat;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "hasMore", "", "getHasMore", "()I", "setHasMore", "(I)V", "toString", "", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DisturbSleepStatRsp {

    @Nullable
    private List<? extends AppUsageStat> dataList;
    private int hasMore;

    @Nullable
    public final List<AppUsageStat> getDataList() {
        return this.dataList;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    public final void setDataList(@Nullable List<? extends AppUsageStat> list) {
        this.dataList = list;
    }

    public final void setHasMore(int i) {
        this.hasMore = i;
    }

    @NotNull
    public String toString() {
        return "DisturbSleepStatRsp(dataList=" + this.dataList + ", hasMore=" + this.hasMore + ")";
    }
}

package com.oplus.aiunit.vision;

import com.oplus.nearx.track.internal.storage.db.app.balance.entity.BalanceCompleteness;
import com.oplus.nearx.track.internal.storage.db.app.balance.entity.BalanceHashCompleteness;
import com.oplus.nearx.track.internal.storage.db.app.balance.entity.BalanceRealtimeCompleteness;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&J\"\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH&J\u0010\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bH&J\u0010\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bH&J\u0018\u0010\u0014\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000bH&J\b\u0010\u0015\u001a\u00020\u0007H&¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/ms0;", "", "", sbe.PAY_SDK_EVENT_TIME, "createNum", "", "uploadType", "", "b", "uploadNum", "a", "", "Lcom/oplus/nearx/track/internal/storage/db/app/balance/entity/BalanceCompleteness;", b2n.f, "Lcom/oplus/nearx/track/internal/storage/db/app/balance/entity/BalanceRealtimeCompleteness;", "d", "Lcom/oplus/nearx/track/internal/storage/db/app/balance/entity/BalanceHashCompleteness;", "f", "Lcom/oplus/aiunit/vision/hm9;", "balanceList", MapSchema.FIELD_NAME_ENTRY, "c", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public interface ms0 {
    void a(long eventTime, long uploadNum, int uploadType);

    void b(long eventTime, long createNum, int uploadType);

    void c();

    @Nullable
    List<BalanceRealtimeCompleteness> d();

    void e(@Nullable List<? extends hm9> balanceList);

    @Nullable
    List<BalanceHashCompleteness> f();

    @Nullable
    List<BalanceCompleteness> g();
}

package com.oplus.aiunit.vision;

import com.heytap.databaseengineservice.sync.network.DBBaseResponse;
import com.heytap.databaseengineservice.sync.responsebean.CervicalSpineActionPOJO;
import com.heytap.databaseengineservice.sync.responsebean.CervicalSpinePOJO;
import com.heytap.databaseengineservice.sync.responsebean.PushSportHealthDataRspBody;
import com.heytap.databaseengineservice.sync.responsebean.VersionListRspBodyNewModify;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J+\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00032\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007J-\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00032\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0007J+\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0007J'\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00032\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J-\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00040\u00032\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0007J%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/v53;", "", "body", "Lcom/heytap/databaseengineservice/sync/network/DBBaseResponse;", "", "Lcom/heytap/databaseengineservice/sync/responsebean/CervicalSpineActionPOJO;", b2n.g, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/databaseengineservice/sync/responsebean/VersionListRspBodyNewModify;", "c", b2n.f, "Lcom/heytap/databaseengineservice/sync/responsebean/PushSportHealthDataRspBody;", "d", "Lcom/heytap/databaseengineservice/sync/responsebean/CervicalSpinePOJO;", "a", MapSchema.FIELD_NAME_ENTRY, "b", "f", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface v53 {
    @m1e("v5/c2s/health/cervical/pullCervicalStatData")
    @Nullable
    Object a(@av1 @Nullable Object obj, @NotNull Continuation<? super DBBaseResponse<List<CervicalSpinePOJO>>> continuation);

    @m1e("v5/c2s/health/cervical/queryCervicalStatData")
    @Nullable
    Object b(@av1 @Nullable Object obj, @NotNull Continuation<? super DBBaseResponse<List<CervicalSpinePOJO>>> continuation);

    @m1e("v3/c2s/health/cervical/queryCervicalActionDetailVersion")
    @Nullable
    Object c(@av1 @Nullable Object obj, @NotNull Continuation<? super DBBaseResponse<VersionListRspBodyNewModify>> continuation);

    @m1e("v5/c2s/health/cervical/syncCervicalActionDetail")
    @Nullable
    Object d(@av1 @Nullable Object obj, @NotNull Continuation<? super DBBaseResponse<PushSportHealthDataRspBody>> continuation);

    @m1e("v3/c2s/health/cervical/queryCervicalStatVersion")
    @Nullable
    Object e(@av1 @Nullable Object obj, @NotNull Continuation<? super DBBaseResponse<VersionListRspBodyNewModify>> continuation);

    @m1e("v5/c2s/health/cervical/syncCervicalStat")
    @Nullable
    Object f(@av1 @Nullable Object obj, @NotNull Continuation<? super DBBaseResponse<PushSportHealthDataRspBody>> continuation);

    @m1e("v5/c2s/health/cervical/queryCervicalActionDetailData")
    @Nullable
    Object g(@av1 @Nullable Object obj, @NotNull Continuation<? super DBBaseResponse<List<CervicalSpineActionPOJO>>> continuation);

    @m1e("v5/c2s/health/cervical/pullCervicalActionDetailData")
    @Nullable
    Object h(@av1 @Nullable Object obj, @NotNull Continuation<? super DBBaseResponse<List<CervicalSpineActionPOJO>>> continuation);
}

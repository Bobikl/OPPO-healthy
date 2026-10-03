package com.oplus.aiunit.vision;

import com.heytap.databaseengineservice.sync.network.DBBaseResponse;
import com.heytap.databaseengineservice.sync.responsebean.PushSportHealthDataRspBody;
import com.heytap.databaseengineservice.sync.responsebean.VersionListRspBodyNewModify;
import com.heytap.databaseengineservice.sync.responsebean.bloodsugar.BloodSugarWarningPOJO;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JE\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ?\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00062\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0001H§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/lt1;", "", "", "vSsoid", "fSsoid", "body", "Lcom/heytap/databaseengineservice/sync/network/DBBaseResponse;", "", "Lcom/heytap/databaseengineservice/sync/responsebean/bloodsugar/BloodSugarWarningPOJO;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/databaseengineservice/sync/responsebean/VersionListRspBodyNewModify;", "d", "Lcom/heytap/databaseengineservice/sync/responsebean/PushSportHealthDataRspBody;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface lt1 {
    @m1e("v5/c2s/health/glucose/syncGlucoseWarn")
    @Nullable
    Object b(@av1 @Nullable Object obj, @NotNull Continuation<? super DBBaseResponse<PushSportHealthDataRspBody>> continuation);

    @m1e("v5/c2s/health/glucose/queryGlucoseWarn")
    @Nullable
    Object c(@yh8("virtual-ssoid") @Nullable String str, @yh8("encrypt-friend-ssoid") @Nullable String str2, @av1 @Nullable Object obj, @NotNull Continuation<? super DBBaseResponse<List<BloodSugarWarningPOJO>>> continuation);

    @m1e("v4/c2s/health/glucose/queryGlucoseWarnVersion")
    @Nullable
    Object d(@yh8("virtual-ssoid") @Nullable String str, @yh8("encrypt-friend-ssoid") @Nullable String str2, @av1 @Nullable Object obj, @NotNull Continuation<? super DBBaseResponse<VersionListRspBodyNewModify>> continuation);
}

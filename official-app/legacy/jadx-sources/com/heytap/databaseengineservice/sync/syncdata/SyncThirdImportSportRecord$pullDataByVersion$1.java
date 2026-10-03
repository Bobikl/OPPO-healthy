package com.heytap.databaseengineservice.sync.syncdata;

import com.heytap.databaseengineservice.sync.network.DBBaseResponse;
import com.heytap.databaseengineservice.sync.responsebean.VersionListRspBodyNew;
import com.heytap.databaseengineservice.sync.syncdata.SyncThirdImportSportRecord$pullDataByVersion$1;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.oplus.aiunit.vision.cj4;
import com.oplus.aiunit.vision.hz;
import com.oplus.aiunit.vision.mpe;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/heytap/databaseengineservice/sync/network/DBBaseResponse;", "Lcom/heytap/databaseengineservice/sync/responsebean/VersionListRspBodyNew;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "b", "(Lcom/heytap/databaseengineservice/sync/network/DBBaseResponse;)Z"}, k = 3, mv = {1, 8, 0})
public final class SyncThirdImportSportRecord$pullDataByVersion$1<T> implements mpe {
    public final /* synthetic */ int[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long[] f2881j;

    public SyncThirdImportSportRecord$pullDataByVersion$1(int[] iArr, long[] jArr) {
        this.i = iArr;
        this.f2881j = jArr;
    }

    public static final int c(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    @Override // com.oplus.aiunit.vision.mpe
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean test(@NotNull DBBaseResponse<VersionListRspBodyNew> response) {
        Intrinsics.checkNotNullParameter(response, "response");
        this.i[0] = 0;
        if (response.getBody() == null || hz.b(response.getBody().getModifiedTime())) {
            cj4.c("SyncThirdImportSportRecord", "version list body is null!");
            return false;
        }
        this.i[0] = response.getBody().getHasMore();
        List<Long> modifiedTime = response.getBody().getModifiedTime();
        long[] jArr = this.f2881j;
        final AnonymousClass1 anonymousClass1 = new Function2<Long, Long, Integer>() { // from class: com.heytap.databaseengineservice.sync.syncdata.SyncThirdImportSportRecord$pullDataByVersion$1.1
            @Override // p010kotlin.jvm.functions.Function2
            @NotNull
            public final Integer invoke(Long l2, Long b) {
                long jLongValue = l2.longValue();
                Intrinsics.checkNotNullExpressionValue(b, "b");
                return Integer.valueOf(Intrinsics.compare(jLongValue, b.longValue()));
            }
        };
        Object objMax = Collections.max(modifiedTime, new Comparator() { // from class: com.oplus.aiunit.vision.bjj
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SyncThirdImportSportRecord$pullDataByVersion$1.c(anonymousClass1, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objMax, "max(modifiedTimestampLis… a, b -> a.compareTo(b) }");
        jArr[0] = ((Number) objMax).longValue();
        return true;
    }
}

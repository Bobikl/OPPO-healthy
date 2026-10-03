package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.CommonBackBean;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.time.ZoneId;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\b"}, d2 = {"Lcom/heytap/databaseengine/model/CommonBackBean;", "result", "", "", "b", "", ClickApiEntity.TIME, "a", "operation_impl_release"}, k = 2, mv = {1, 8, 0})
public final class j0k {
    public static final long a(long j2) {
        return n05.g(j2).minusDays(1L).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    @NotNull
    public static final List<Object> b(@NotNull CommonBackBean result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getErrorCode() != 0 || !(result.getObj() instanceof List)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Object obj = result.getObj();
        List<Object> list = obj instanceof List ? (List) obj : null;
        return list == null ? CollectionsKt__CollectionsKt.emptyList() : list;
    }
}

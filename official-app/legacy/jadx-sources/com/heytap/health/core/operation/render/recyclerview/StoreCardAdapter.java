package com.heytap.health.core.operation.render.recyclerview;

import com.heytap.databaseengine.model.SpaceCardMetaData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/heytap/health/core/operation/render/recyclerview/StoreCardAdapter;", "Lcom/heytap/health/core/operation/render/recyclerview/BaseSpaceAdapter;", "Lcom/heytap/databaseengine/model/SpaceCardMetaData;", "data", "", "parentPosition", "", "(Ljava/util/List;I)V", "operations_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class StoreCardAdapter extends BaseSpaceAdapter<SpaceCardMetaData> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoreCardAdapter(@NotNull List<SpaceCardMetaData> data, int i) {
        super(data, i);
        Intrinsics.checkNotNullParameter(data, "data");
    }
}

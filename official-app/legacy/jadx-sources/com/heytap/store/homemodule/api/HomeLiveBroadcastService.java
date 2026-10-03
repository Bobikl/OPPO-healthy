package com.heytap.store.homemodule.api;

import com.heytap.store.homemodule.data.protobuf.Operation;
import com.oplus.aiunit.vision.dx7;
import com.oplus.aiunit.vision.euf;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.m1e;
import com.oplus.aiunit.vision.x97;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/heytap/store/homemodule/api/HomeLiveBroadcastService;", "", "", "streamId", "Lcom/oplus/aiunit/vision/kbd;", "Lcom/heytap/store/homemodule/data/protobuf/Operation;", "subscribeBroadcastList", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0})
public interface HomeLiveBroadcastService {
    @euf(euf.PROTO)
    @m1e("/live/app/lives/subscribe")
    @NotNull
    @dx7
    kbd<Operation> subscribeBroadcastList(@x97("steamId") @Nullable String streamId);
}

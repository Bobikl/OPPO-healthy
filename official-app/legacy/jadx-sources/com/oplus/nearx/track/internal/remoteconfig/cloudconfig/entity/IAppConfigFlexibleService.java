package com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.observable.Observable;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/oplus/nearx/track/internal/remoteconfig/cloudconfig/entity/IAppConfigFlexibleService;", "", "data", "Lcom/heytap/nearx/tangramconfig/observable/Observable;", "Lcom/oplus/nearx/track/internal/remoteconfig/cloudconfig/entity/AppConfigFlexibleEntity;", "getData", "()Lcom/heytap/nearx/tangramconfig/observable/Observable;", "core-statistics_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IAppConfigFlexibleService {
    @Nullable
    Observable<AppConfigFlexibleEntity> getData();
}

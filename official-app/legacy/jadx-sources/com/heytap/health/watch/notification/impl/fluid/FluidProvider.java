package com.heytap.health.watch.notification.impl.fluid;

import com.oplus.aiunit.vision.y6e;
import com.oplus.seedling.sdk.datachannel.provider.CardServerProvider;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/watch/notification/impl/fluid/FluidProvider;", "Lcom/oplus/seedling/sdk/datachannel/provider/CardServerProvider;", "()V", "getAuthority", "", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FluidProvider extends CardServerProvider {
    @Override // com.oplus.channel.server.provider.ChannelServerProvider
    @NotNull
    public String getAuthority() {
        return y6e.PROVIDER_HEALTH;
    }
}

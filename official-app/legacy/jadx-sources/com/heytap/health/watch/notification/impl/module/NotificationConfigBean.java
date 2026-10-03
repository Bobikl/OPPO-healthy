package com.heytap.health.watch.notification.impl.module;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.heytap.webview.extension.protocol.Const;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/watch/notification/impl/module/NotificationConfigBean;", "Ljava/io/Serializable;", "()V", Const.Arguments.Call.DIAL, "", "", "getDial", "()Ljava/util/List;", "forceAbandon", "getForceAbandon", "forward", "getForward", "ignore", "getIgnore", "ignoreBand", "getIgnoreBand", "ignoreIcon", "Lcom/heytap/health/watch/notification/impl/module/IgnoreIcon;", "getIgnoreIcon", "()Lcom/heytap/health/watch/notification/impl/module/IgnoreIcon;", "mms", "getMms", NotificationCompat.CATEGORY_SOCIAL, "getSocial", "whiteList", "getWhiteList", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NotificationConfigBean implements Serializable {

    @Nullable
    private final List<String> dial;

    @Nullable
    private final List<String> forceAbandon;

    @Nullable
    private final List<String> forward;

    @Nullable
    private final List<String> ignore;

    @Nullable
    private final List<String> ignoreBand;

    @Nullable
    private final IgnoreIcon ignoreIcon;

    @Nullable
    private final List<String> mms;

    @Nullable
    private final List<String> social;

    @Nullable
    private final List<String> whiteList;

    @Nullable
    public final List<String> getDial() {
        return this.dial;
    }

    @Nullable
    public final List<String> getForceAbandon() {
        return this.forceAbandon;
    }

    @Nullable
    public final List<String> getForward() {
        return this.forward;
    }

    @Nullable
    public final List<String> getIgnore() {
        return this.ignore;
    }

    @Nullable
    public final List<String> getIgnoreBand() {
        return this.ignoreBand;
    }

    @Nullable
    public final IgnoreIcon getIgnoreIcon() {
        return this.ignoreIcon;
    }

    @Nullable
    public final List<String> getMms() {
        return this.mms;
    }

    @Nullable
    public final List<String> getSocial() {
        return this.social;
    }

    @Nullable
    public final List<String> getWhiteList() {
        return this.whiteList;
    }
}

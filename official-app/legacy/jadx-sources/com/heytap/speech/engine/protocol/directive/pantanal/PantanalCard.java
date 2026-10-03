package com.heytap.speech.engine.protocol.directive.pantanal;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.TrackingInfo;
import com.heytap.speech.engine.protocol.directive.common.commercial.ActionInfo;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/pantanal/PantanalCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "actionInfos", "", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "getActionInfos", "()Ljava/util/List;", "setActionInfos", "(Ljava/util/List;)V", "data", "", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "serviceId", "getServiceId", "setServiceId", "trackingInfo", "Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "getTrackingInfo", "()Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "setTrackingInfo", "(Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PantanalCard extends DirectivePayload {

    @Nullable
    private List<ActionInfo> actionInfos;

    @Nullable
    private String data;

    @Nullable
    private String serviceId;

    @Nullable
    private TrackingInfo trackingInfo;

    @Nullable
    public final List<ActionInfo> getActionInfos() {
        return this.actionInfos;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getServiceId() {
        return this.serviceId;
    }

    @Nullable
    public final TrackingInfo getTrackingInfo() {
        return this.trackingInfo;
    }

    public final void setActionInfos(@Nullable List<ActionInfo> list) {
        this.actionInfos = list;
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    public final void setServiceId(@Nullable String str) {
        this.serviceId = str;
    }

    public final void setTrackingInfo(@Nullable TrackingInfo trackingInfo) {
        this.trackingInfo = trackingInfo;
    }
}

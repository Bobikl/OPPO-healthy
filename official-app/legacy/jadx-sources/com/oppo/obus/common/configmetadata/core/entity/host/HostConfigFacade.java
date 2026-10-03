package com.oppo.obus.common.configmetadata.core.entity.host;

import com.oppo.obus.common.configmetadata.core.concept.entity.ConfigFacade;
import com.oppo.obus.common.protobuf.ProtobufSerializable;

/* JADX INFO: loaded from: classes9.dex */
public class HostConfigFacade implements ConfigFacade, ProtobufSerializable {
    private static final long serialVersionUID = -2528774233763531680L;
    private MinHostConfig host;

    public HostConfigFacade() {
    }

    public HostConfigFacade(MinHostConfig minHostConfig) {
        this.host = minHostConfig;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof HostConfigFacade;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HostConfigFacade)) {
            return false;
        }
        HostConfigFacade hostConfigFacade = (HostConfigFacade) obj;
        if (!hostConfigFacade.canEqual(this)) {
            return false;
        }
        MinHostConfig host = getHost();
        MinHostConfig host2 = hostConfigFacade.getHost();
        return host != null ? host.equals(host2) : host2 == null;
    }

    public MinHostConfig getHost() {
        return this.host;
    }

    public int hashCode() {
        MinHostConfig host = getHost();
        return 59 + (host == null ? 43 : host.hashCode());
    }

    public HostConfigFacade setHost(MinHostConfig minHostConfig) {
        this.host = minHostConfig;
        return this;
    }

    public String toString() {
        return "HostConfigFacade(host=" + getHost() + ")";
    }
}

package com.heytap.health.main.protocol;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class ProtocolUpdateBean {
    private ProtocolVersionBean chargeServiceVersion;
    private ProtocolVersionBean numberIdentificationVersion;
    private ProtocolVersionBean privacyVersion;
    private ProtocolVersionBean protocolVersion;

    public ProtocolVersionBean getPrivacyVersion() {
        return this.privacyVersion;
    }

    public ProtocolVersionBean getProtocolVersion() {
        return this.protocolVersion;
    }
}

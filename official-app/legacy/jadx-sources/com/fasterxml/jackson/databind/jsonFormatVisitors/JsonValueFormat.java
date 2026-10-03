package com.fasterxml.jackson.databind.jsonFormatVisitors;

import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.mma;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;

/* JADX INFO: loaded from: classes13.dex */
public enum JsonValueFormat {
    COLOR("color"),
    DATE("date"),
    DATE_TIME("date-time"),
    EMAIL("email"),
    HOST_NAME("host-name"),
    IP_ADDRESS("ip-address"),
    IPV6("ipv6"),
    PHONE("phone"),
    REGEX("regex"),
    STYLE(Const.Arguments.Open.STYLE),
    TIME(ClickApiEntity.TIME),
    URI(ParserTag.TAG_URI),
    UTC_MILLISEC("utc-millisec"),
    UUID("uuid");

    private final String _desc;

    JsonValueFormat(String str) {
        this._desc = str;
    }

    @Override // java.lang.Enum
    @mma
    public String toString() {
        return this._desc;
    }
}

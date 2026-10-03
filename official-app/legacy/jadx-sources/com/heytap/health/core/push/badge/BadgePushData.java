package com.heytap.health.core.push.badge;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class BadgePushData implements Serializable {
    private String messageType;

    public String getMessageType() {
        return this.messageType;
    }

    public void setMessageType(String str) {
        this.messageType = str;
    }
}

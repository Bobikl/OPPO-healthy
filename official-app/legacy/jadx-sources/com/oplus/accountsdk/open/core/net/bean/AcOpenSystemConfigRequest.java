package com.oplus.accountsdk.open.core.net.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcOpenSystemConfigRequest {
    public String configType;
    public int version;

    public AcOpenSystemConfigRequest(String str, int i) {
        this.configType = str;
        this.version = i;
    }
}

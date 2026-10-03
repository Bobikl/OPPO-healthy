package com.oplus.accountsdk.service.account.net.beans;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AcCheckUpgradeRequest implements Serializable {
    private String sceneType;

    public AcCheckUpgradeRequest(String str) {
        this.sceneType = str;
    }

    public String getSceneType() {
        return this.sceneType;
    }

    public void setSceneType(String str) {
        this.sceneType = str;
    }
}

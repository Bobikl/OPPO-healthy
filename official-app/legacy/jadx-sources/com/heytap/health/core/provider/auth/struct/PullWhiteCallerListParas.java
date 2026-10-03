package com.heytap.health.core.provider.auth.struct;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class PullWhiteCallerListParas {

    @SerializedName("switchType")
    int switchType;

    public PullWhiteCallerListParas(int i) {
        this.switchType = i;
    }
}

package com.heytap.store.business.config.bean;

import androidx.annotation.Keep;
import com.google.gson.JsonObject;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/store/business/config/bean/ConfigResponse;", "Lcom/heytap/store/business/config/bean/ConfigBaseResponseData;", "()V", "data", "Lcom/google/gson/JsonObject;", "getData", "()Lcom/google/gson/JsonObject;", "config-service_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ConfigResponse extends ConfigBaseResponseData {

    @Nullable
    private final JsonObject data;

    @Nullable
    public final JsonObject getData() {
        return this.data;
    }
}

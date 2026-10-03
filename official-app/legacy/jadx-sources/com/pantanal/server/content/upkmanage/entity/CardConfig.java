package com.pantanal.server.content.upkmanage.entity;

import androidx.annotation.Keep;
import com.google.gson.JsonArray;
import com.google.gson.annotations.SerializedName;
import com.heytap.store.business.rn.service.RnConstant;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/pantanal/server/content/upkmanage/entity/CardConfig;", "", "()V", "clicks", "Lcom/google/gson/JsonArray;", "getClicks", "()Lcom/google/gson/JsonArray;", "eventWhiteList", "getEventWhiteList", "host", "Lcom/pantanal/server/content/upkmanage/entity/CardConfig$Host;", "getHost", "()Lcom/pantanal/server/content/upkmanage/entity/CardConfig$Host;", "Host", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CardConfig {

    @SerializedName("click")
    @Nullable
    private final JsonArray clicks;

    @Nullable
    private final JsonArray eventWhiteList;

    @Nullable
    private final Host host;

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/pantanal/server/content/upkmanage/entity/CardConfig$Host;", "", "()V", RnConstant.KEY_COMPONENT_NAME, "", "getComponentName", "()Ljava/lang/String;", "packageName", "getPackageName", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Host {

        @Nullable
        private final String componentName;

        @Nullable
        private final String packageName;

        @Nullable
        public final String getComponentName() {
            return this.componentName;
        }

        @Nullable
        public final String getPackageName() {
            return this.packageName;
        }
    }

    @Nullable
    public final JsonArray getClicks() {
        return this.clicks;
    }

    @Nullable
    public final JsonArray getEventWhiteList() {
        return this.eventWhiteList;
    }

    @Nullable
    public final Host getHost() {
        return this.host;
    }
}

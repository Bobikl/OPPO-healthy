package com.heytap.speech.engine.constant;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.EventRuleEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/heytap/speech/engine/constant/NetworkType;", "", "des", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDes", "()Ljava/lang/String;", "setDes", "(Ljava/lang/String;)V", "getNetworkType", "name", "DEFAULT", "NONE", "TWO", "THREE", "FOUR", "FIVE", "WIFI", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum NetworkType {
    DEFAULT("default"),
    NONE(SpeechConstant.ENGINE_TYPE_NONE),
    TWO("2G"),
    THREE("3G"),
    FOUR(EventRuleEntity.ACCEPT_NET_4G),
    FIVE(EventRuleEntity.ACCEPT_NET_5G),
    WIFI("WIFI");


    @NotNull
    private String des;

    NetworkType(String str) {
        this.des = str;
    }

    @NotNull
    public final String getDes() {
        return this.des;
    }

    @NotNull
    public final NetworkType getNetworkType(@Nullable String name) {
        NetworkType networkType = DEFAULT;
        if (Intrinsics.areEqual(name, networkType.des)) {
            return networkType;
        }
        NetworkType networkType2 = NONE;
        if (Intrinsics.areEqual(name, networkType2.des)) {
            return networkType2;
        }
        NetworkType networkType3 = TWO;
        if (Intrinsics.areEqual(name, networkType3.des)) {
            return networkType3;
        }
        NetworkType networkType4 = THREE;
        if (Intrinsics.areEqual(name, networkType4.des)) {
            return networkType4;
        }
        NetworkType networkType5 = FOUR;
        if (Intrinsics.areEqual(name, networkType5.des)) {
            return networkType5;
        }
        NetworkType networkType6 = FIVE;
        if (Intrinsics.areEqual(name, networkType6.des)) {
            return networkType6;
        }
        NetworkType networkType7 = WIFI;
        return Intrinsics.areEqual(name, networkType7.des) ? networkType7 : networkType2;
    }

    public final void setDes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.des = str;
    }
}

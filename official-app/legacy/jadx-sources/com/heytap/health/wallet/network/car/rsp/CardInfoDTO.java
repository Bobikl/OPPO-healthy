package com.heytap.health.wallet.network.car.rsp;

import androidx.annotation.Keep;
import java.io.Serializable;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/wallet/network/car/rsp/CardInfoDTO;", "Ljava/io/Serializable;", "()V", "carCode", "", "getCarCode", "()Ljava/lang/String;", "setCarCode", "(Ljava/lang/String;)V", "carMode", "getCarMode", "setCarMode", "createTm", "getCreateTm", "setCreateTm", "imgUrl", "getImgUrl", "setImgUrl", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CardInfoDTO implements Serializable {

    @Nullable
    private String carCode;

    @Nullable
    private String carMode;

    @Nullable
    private String createTm;

    @Nullable
    private String imgUrl;

    @Nullable
    public final String getCarCode() {
        return this.carCode;
    }

    @Nullable
    public final String getCarMode() {
        return this.carMode;
    }

    @Nullable
    public final String getCreateTm() {
        return this.createTm;
    }

    @Nullable
    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final void setCarCode(@Nullable String str) {
        this.carCode = str;
    }

    public final void setCarMode(@Nullable String str) {
        this.carMode = str;
    }

    public final void setCreateTm(@Nullable String str) {
        this.createTm = str;
    }

    public final void setImgUrl(@Nullable String str) {
        this.imgUrl = str;
    }
}

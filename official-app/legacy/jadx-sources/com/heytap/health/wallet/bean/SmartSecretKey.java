package com.heytap.health.wallet.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.f04;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00162\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/wallet/bean/SmartSecretKey;", "", "()V", f04.JSON_KEY_DIGITAL_KEY_TYPE, "", "getKeyType", "()Ljava/lang/String;", "setKeyType", "(Ljava/lang/String;)V", "pKey", "", "Ljava/lang/Long;", "sectorNo", "", "getSectorNo", "()Ljava/lang/Integer;", "setSectorNo", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getpKey", "()Ljava/lang/Long;", "setpKey", "", "(Ljava/lang/Long;)V", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SmartSecretKey {

    @Nullable
    private String keyType;

    @Nullable
    private Long pKey;

    @Nullable
    private Integer sectorNo;

    @Nullable
    public final String getKeyType() {
        return this.keyType;
    }

    @Nullable
    public final Integer getSectorNo() {
        return this.sectorNo;
    }

    @Nullable
    /* JADX INFO: renamed from: getpKey, reason: from getter */
    public final Long getPKey() {
        return this.pKey;
    }

    public final void setKeyType(@Nullable String str) {
        this.keyType = str;
    }

    public final void setSectorNo(@Nullable Integer num) {
        this.sectorNo = num;
    }

    public final void setpKey(@Nullable Long pKey) {
        this.pKey = pKey;
    }
}

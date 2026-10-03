package com.heytap.health.wallet.network.door.rsp;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.f04;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/wallet/network/door/rsp/SrvKeysDto;", "", "()V", f04.JSON_KEY_DIGITAL_KEY_TYPE, "", "getKeyType", "()Ljava/lang/String;", "setKeyType", "(Ljava/lang/String;)V", "pKeys", "", "", "getPKeys", "()Ljava/util/List;", "setPKeys", "(Ljava/util/List;)V", "sectorNo", "", "getSectorNo", "()Ljava/lang/Integer;", "setSectorNo", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "size", "getSize", "()J", "setSize", "(J)V", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SrvKeysDto {

    @Nullable
    private String keyType;

    @Nullable
    private List<Long> pKeys;

    @Nullable
    private Integer sectorNo;
    private long size;

    @Nullable
    public final String getKeyType() {
        return this.keyType;
    }

    @Nullable
    public final List<Long> getPKeys() {
        return this.pKeys;
    }

    @Nullable
    public final Integer getSectorNo() {
        return this.sectorNo;
    }

    public final long getSize() {
        return this.size;
    }

    public final void setKeyType(@Nullable String str) {
        this.keyType = str;
    }

    public final void setPKeys(@Nullable List<Long> list) {
        this.pKeys = list;
    }

    public final void setSectorNo(@Nullable Integer num) {
        this.sectorNo = num;
    }

    public final void setSize(long j2) {
        this.size = j2;
    }
}

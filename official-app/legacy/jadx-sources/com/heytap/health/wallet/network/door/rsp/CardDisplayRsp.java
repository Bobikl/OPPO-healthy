package com.heytap.health.wallet.network.door.rsp;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/wallet/network/door/rsp/CardDisplayRsp;", "", "()V", "cardTypeDisplays", "", "Lcom/heytap/health/wallet/network/door/rsp/CardDisplayEntity;", "getCardTypeDisplays", "()Ljava/util/List;", "setCardTypeDisplays", "(Ljava/util/List;)V", "displayTypeName", "", "getDisplayTypeName", "()Ljava/lang/String;", "setDisplayTypeName", "(Ljava/lang/String;)V", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CardDisplayRsp {

    @Nullable
    private List<CardDisplayEntity> cardTypeDisplays;

    @Nullable
    private String displayTypeName;

    @Nullable
    public final List<CardDisplayEntity> getCardTypeDisplays() {
        return this.cardTypeDisplays;
    }

    @Nullable
    public final String getDisplayTypeName() {
        return this.displayTypeName;
    }

    public final void setCardTypeDisplays(@Nullable List<CardDisplayEntity> list) {
        this.cardTypeDisplays = list;
    }

    public final void setDisplayTypeName(@Nullable String str) {
        this.displayTypeName = str;
    }
}

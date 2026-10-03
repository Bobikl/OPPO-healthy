package com.heytap.health.wallet.network.door.rsp;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/wallet/network/door/rsp/CardThemeGroup;", "", "()V", "cardThemes", "", "Lcom/heytap/health/wallet/network/door/rsp/CardTheme;", "getCardThemes", "()Ljava/util/List;", "setCardThemes", "(Ljava/util/List;)V", "groupName", "", "getGroupName", "()Ljava/lang/String;", "setGroupName", "(Ljava/lang/String;)V", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CardThemeGroup {

    @Nullable
    private List<CardTheme> cardThemes;

    @Nullable
    private String groupName;

    @Nullable
    public final List<CardTheme> getCardThemes() {
        return this.cardThemes;
    }

    @Nullable
    public final String getGroupName() {
        return this.groupName;
    }

    public final void setCardThemes(@Nullable List<CardTheme> list) {
        this.cardThemes = list;
    }

    public final void setGroupName(@Nullable String str) {
        this.groupName = str;
    }
}

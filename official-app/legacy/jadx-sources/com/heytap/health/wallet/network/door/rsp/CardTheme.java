package com.heytap.health.wallet.network.door.rsp;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/heytap/health/wallet/network/door/rsp/CardTheme;", "", "()V", "appCode", "", "getAppCode", "()Ljava/lang/String;", "setAppCode", "(Ljava/lang/String;)V", "cardImg", "getCardImg", "setCardImg", "cardLogo", "getCardLogo", "setCardLogo", "cardThemeId", "", "getCardThemeId", "()J", "setCardThemeId", "(J)V", "cardThumb", "getCardThumb", "setCardThumb", "id", "getId", "setId", "name", "getName", "setName", "selected", "", "getSelected", "()I", "setSelected", "(I)V", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CardTheme {

    @Nullable
    private String appCode;

    @Nullable
    private String cardImg;

    @Nullable
    private String cardLogo;
    private long cardThemeId;

    @Nullable
    private String cardThumb;
    private long id;

    @Nullable
    private String name;
    private int selected;

    @Nullable
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final String getCardImg() {
        return this.cardImg;
    }

    @Nullable
    public final String getCardLogo() {
        return this.cardLogo;
    }

    public final long getCardThemeId() {
        return this.cardThemeId;
    }

    @Nullable
    public final String getCardThumb() {
        return this.cardThumb;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getSelected() {
        return this.selected;
    }

    public final void setAppCode(@Nullable String str) {
        this.appCode = str;
    }

    public final void setCardImg(@Nullable String str) {
        this.cardImg = str;
    }

    public final void setCardLogo(@Nullable String str) {
        this.cardLogo = str;
    }

    public final void setCardThemeId(long j2) {
        this.cardThemeId = j2;
    }

    public final void setCardThumb(@Nullable String str) {
        this.cardThumb = str;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setSelected(int i) {
        this.selected = i;
    }
}

package com.heytap.store.usercenter;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/heytap/store/usercenter/CreditEntity;", "", "()V", "amount", "", "getAmount", "()I", "setAmount", "(I)V", "country", "", "getCountry", "()Ljava/lang/String;", "setCountry", "(Ljava/lang/String;)V", "expiredAmount", "getExpiredAmount", "setExpiredAmount", "signGiftTips", "getSignGiftTips", "setSignGiftTips", "signJumpLink", "getSignJumpLink", "setSignJumpLink", "todayStatus", "", "getTodayStatus", "()Z", "setTodayStatus", "(Z)V", "toString", "usercenterservices_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class CreditEntity {
    private int amount;

    @Nullable
    private String country;
    private int expiredAmount;

    @Nullable
    private String signGiftTips;

    @Nullable
    private String signJumpLink;
    private boolean todayStatus;

    public final int getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    public final int getExpiredAmount() {
        return this.expiredAmount;
    }

    @Nullable
    public final String getSignGiftTips() {
        return this.signGiftTips;
    }

    @Nullable
    public final String getSignJumpLink() {
        return this.signJumpLink;
    }

    public final boolean getTodayStatus() {
        return this.todayStatus;
    }

    public final void setAmount(int i) {
        this.amount = i;
    }

    public final void setCountry(@Nullable String str) {
        this.country = str;
    }

    public final void setExpiredAmount(int i) {
        this.expiredAmount = i;
    }

    public final void setSignGiftTips(@Nullable String str) {
        this.signGiftTips = str;
    }

    public final void setSignJumpLink(@Nullable String str) {
        this.signJumpLink = str;
    }

    public final void setTodayStatus(boolean z) {
        this.todayStatus = z;
    }

    @NotNull
    public String toString() {
        return "CreditEntity(todayStatus=" + this.todayStatus + ", amount=" + this.amount + ", expiredAmount=" + this.expiredAmount + ", country=" + ((Object) this.country) + ", signGiftTips=" + ((Object) this.signGiftTips) + ", signJumpLink=" + ((Object) this.signJumpLink) + ')';
    }
}

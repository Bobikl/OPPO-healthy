package com.heytap.health.wallet.network.door.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\bR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006)"}, d2 = {"Lcom/heytap/health/wallet/network/door/params/EditCardParam;", "", j7l.KEY_CPLC, "", "cardName", "(Ljava/lang/String;Ljava/lang/String;)V", "aid", "getAid", "()Ljava/lang/String;", "setAid", "(Ljava/lang/String;)V", "appCode", "getAppCode", "setAppCode", "getCardName", "cardThemeId", "", "getCardThemeId", "()Ljava/lang/Long;", "setCardThemeId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "cardType", "getCardType", "setCardType", "getCplc", "finish", "", "getFinish", "()Ljava/lang/Boolean;", "setFinish", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class EditCardParam {

    @Nullable
    private String aid;

    @Nullable
    private String appCode;

    @Nullable
    private final String cardName;

    @Nullable
    private Long cardThemeId;

    @Nullable
    private String cardType;

    @Nullable
    private final String cplc;

    @Nullable
    private Boolean finish;

    public EditCardParam(@Nullable String str, @Nullable String str2) {
        this.cplc = str;
        this.cardName = str2;
    }

    public static /* synthetic */ EditCardParam copy$default(EditCardParam editCardParam, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editCardParam.cplc;
        }
        if ((i & 2) != 0) {
            str2 = editCardParam.cardName;
        }
        return editCardParam.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    @NotNull
    public final EditCardParam copy(@Nullable String cplc, @Nullable String cardName) {
        return new EditCardParam(cplc, cardName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditCardParam)) {
            return false;
        }
        EditCardParam editCardParam = (EditCardParam) other;
        return Intrinsics.areEqual(this.cplc, editCardParam.cplc) && Intrinsics.areEqual(this.cardName, editCardParam.cardName);
    }

    @Nullable
    public final String getAid() {
        return this.aid;
    }

    @Nullable
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final String getCardName() {
        return this.cardName;
    }

    @Nullable
    public final Long getCardThemeId() {
        return this.cardThemeId;
    }

    @Nullable
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    public final Boolean getFinish() {
        return this.finish;
    }

    public int hashCode() {
        String str = this.cplc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAid(@Nullable String str) {
        this.aid = str;
    }

    public final void setAppCode(@Nullable String str) {
        this.appCode = str;
    }

    public final void setCardThemeId(@Nullable Long l2) {
        this.cardThemeId = l2;
    }

    public final void setCardType(@Nullable String str) {
        this.cardType = str;
    }

    public final void setFinish(@Nullable Boolean bool) {
        this.finish = bool;
    }

    @NotNull
    public String toString() {
        return "EditCardParam(cplc=" + this.cplc + ", cardName=" + this.cardName + ")";
    }
}

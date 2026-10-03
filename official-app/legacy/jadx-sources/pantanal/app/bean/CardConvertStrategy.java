package pantanal.app.bean;

import androidx.annotation.Keep;
import com.squareup.moshi.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, d2 = {"Lpantanal/app/bean/CardConvertStrategy;", "", "strategyId", "", "sourceCardCode", "", "targetCardCode", "supportEntries", "extData", "(Ljava/lang/String;IIILjava/lang/String;)V", "getExtData", "()Ljava/lang/String;", "getSourceCardCode", "()I", "getStrategyId", "getSupportEntries", "getTargetCardCode", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CardConvertStrategy {

    @Nullable
    private final String extData;
    private final int sourceCardCode;

    @NotNull
    private final String strategyId;
    private final int supportEntries;
    private final int targetCardCode;

    public CardConvertStrategy() {
        this(null, 0, 0, 0, null, 31, null);
    }

    public static /* synthetic */ CardConvertStrategy copy$default(CardConvertStrategy cardConvertStrategy, String str, int i, int i2, int i3, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = cardConvertStrategy.strategyId;
        }
        if ((i4 & 2) != 0) {
            i = cardConvertStrategy.sourceCardCode;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = cardConvertStrategy.targetCardCode;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = cardConvertStrategy.supportEntries;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            str2 = cardConvertStrategy.extData;
        }
        return cardConvertStrategy.copy(str, i5, i6, i7, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStrategyId() {
        return this.strategyId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSourceCardCode() {
        return this.sourceCardCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTargetCardCode() {
        return this.targetCardCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSupportEntries() {
        return this.supportEntries;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExtData() {
        return this.extData;
    }

    @NotNull
    public final CardConvertStrategy copy(@Json(name = "strategyId") @NotNull String strategyId, @Json(name = "sourceCardCode") int sourceCardCode, @Json(name = "targetCardCode") int targetCardCode, int supportEntries, @Json(name = "extData") @Nullable String extData) {
        Intrinsics.checkNotNullParameter(strategyId, "strategyId");
        return new CardConvertStrategy(strategyId, sourceCardCode, targetCardCode, supportEntries, extData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardConvertStrategy)) {
            return false;
        }
        CardConvertStrategy cardConvertStrategy = (CardConvertStrategy) other;
        return Intrinsics.areEqual(this.strategyId, cardConvertStrategy.strategyId) && this.sourceCardCode == cardConvertStrategy.sourceCardCode && this.targetCardCode == cardConvertStrategy.targetCardCode && this.supportEntries == cardConvertStrategy.supportEntries && Intrinsics.areEqual(this.extData, cardConvertStrategy.extData);
    }

    @Nullable
    public final String getExtData() {
        return this.extData;
    }

    public final int getSourceCardCode() {
        return this.sourceCardCode;
    }

    @NotNull
    public final String getStrategyId() {
        return this.strategyId;
    }

    public final int getSupportEntries() {
        return this.supportEntries;
    }

    public final int getTargetCardCode() {
        return this.targetCardCode;
    }

    public int hashCode() {
        int iHashCode = ((((((this.strategyId.hashCode() * 31) + Integer.hashCode(this.sourceCardCode)) * 31) + Integer.hashCode(this.targetCardCode)) * 31) + Integer.hashCode(this.supportEntries)) * 31;
        String str = this.extData;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "CardConvertStrategy(strategyId=" + this.strategyId + ", sourceCardCode=" + this.sourceCardCode + ", targetCardCode=" + this.targetCardCode + ", supportEntries=" + this.supportEntries + ", extData=" + this.extData + ")";
    }

    public CardConvertStrategy(@Json(name = "strategyId") @NotNull String strategyId, @Json(name = "sourceCardCode") int i, @Json(name = "targetCardCode") int i2, int i3, @Json(name = "extData") @Nullable String str) {
        Intrinsics.checkNotNullParameter(strategyId, "strategyId");
        this.strategyId = strategyId;
        this.sourceCardCode = i;
        this.targetCardCode = i2;
        this.supportEntries = i3;
        this.extData = str;
    }

    public /* synthetic */ CardConvertStrategy(String str, int i, int i2, int i3, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? -1 : i, (i4 & 4) != 0 ? -1 : i2, (i4 & 8) != 0 ? -1 : i3, (i4 & 16) != 0 ? "" : str2);
    }
}

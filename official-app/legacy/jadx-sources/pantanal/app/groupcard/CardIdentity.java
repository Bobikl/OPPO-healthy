package pantanal.app.groupcard;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u001c"}, d2 = {"Lpantanal/app/groupcard/CardIdentity;", "", "", "toString", "", "component1", "component2", "component3", "component4", "cardType", "cardId", "hostId", "size", "copy", "hashCode", "other", "", "equals", "I", "getCardType", "()I", "getCardId", "getHostId", "getSize", "<init>", "(IIII)V", "Companion", "a", "groupcard-interface_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CardIdentity {

    @NotNull
    public static final String TAG = "CardIdentity";
    private final int cardId;
    private final int cardType;
    private final int hostId;
    private final int size;

    public CardIdentity(int i, int i2, int i3, int i4) {
        this.cardType = i;
        this.cardId = i2;
        this.hostId = i3;
        this.size = i4;
    }

    public static /* synthetic */ CardIdentity copy$default(CardIdentity cardIdentity, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = cardIdentity.cardType;
        }
        if ((i5 & 2) != 0) {
            i2 = cardIdentity.cardId;
        }
        if ((i5 & 4) != 0) {
            i3 = cardIdentity.hostId;
        }
        if ((i5 & 8) != 0) {
            i4 = cardIdentity.size;
        }
        return cardIdentity.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCardType() {
        return this.cardType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCardId() {
        return this.cardId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHostId() {
        return this.hostId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final CardIdentity copy(int cardType, int cardId, int hostId, int size) {
        return new CardIdentity(cardType, cardId, hostId, size);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardIdentity)) {
            return false;
        }
        CardIdentity cardIdentity = (CardIdentity) other;
        return this.cardType == cardIdentity.cardType && this.cardId == cardIdentity.cardId && this.hostId == cardIdentity.hostId && this.size == cardIdentity.size;
    }

    public final int getCardId() {
        return this.cardId;
    }

    public final int getCardType() {
        return this.cardType;
    }

    public final int getHostId() {
        return this.hostId;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.cardType) * 31) + Integer.hashCode(this.cardId)) * 31) + Integer.hashCode(this.hostId)) * 31) + Integer.hashCode(this.size);
    }

    @NotNull
    public String toString() {
        String json = new Gson().toJson(this);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(this)");
        return json;
    }
}

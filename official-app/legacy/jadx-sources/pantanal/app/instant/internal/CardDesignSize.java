package pantanal.app.instant.internal;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.nn9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001$B+\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0015R\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0015¨\u0006%"}, d2 = {"Lpantanal/app/instant/internal/CardDesignSize;", "Lcom/oplus/aiunit/vision/nn9;", "", "component1", "component2", "component3", "component4", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "configDesign", "cardDesignWidth", "copy", "", "toString", "hashCode", "", "other", "", "equals", "I", "getWidth", "()I", "getHeight", "getConfigDesign", "getCardDesignWidth", "getContainerWidth", "containerWidth", "getContainerHeight", "containerHeight", "getDesignSize", "designSize", "getDesignWidth", "designWidth", "<init>", "(IIII)V", "Companion", "a", "card-instant_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CardDesignSize implements nn9 {
    public static final int CARD_DESIGN_SIZE_INVALID = -1;
    private final int cardDesignWidth;
    private final int configDesign;
    private final int height;
    private final int width;

    public CardDesignSize(int i, int i2, int i3, int i4) {
        this.width = i;
        this.height = i2;
        this.configDesign = i3;
        this.cardDesignWidth = i4;
    }

    public static /* synthetic */ CardDesignSize copy$default(CardDesignSize cardDesignSize, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = cardDesignSize.width;
        }
        if ((i5 & 2) != 0) {
            i2 = cardDesignSize.height;
        }
        if ((i5 & 4) != 0) {
            i3 = cardDesignSize.configDesign;
        }
        if ((i5 & 8) != 0) {
            i4 = cardDesignSize.cardDesignWidth;
        }
        return cardDesignSize.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getConfigDesign() {
        return this.configDesign;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCardDesignWidth() {
        return this.cardDesignWidth;
    }

    @NotNull
    public final CardDesignSize copy(int width, int height, int configDesign, int cardDesignWidth) {
        return new CardDesignSize(width, height, configDesign, cardDesignWidth);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardDesignSize)) {
            return false;
        }
        CardDesignSize cardDesignSize = (CardDesignSize) other;
        return this.width == cardDesignSize.width && this.height == cardDesignSize.height && this.configDesign == cardDesignSize.configDesign && this.cardDesignWidth == cardDesignSize.cardDesignWidth;
    }

    public final int getCardDesignWidth() {
        return this.cardDesignWidth;
    }

    public final int getConfigDesign() {
        return this.configDesign;
    }

    @Override // com.oplus.aiunit.vision.nn9
    public int getContainerHeight() {
        return this.height;
    }

    @Override // com.oplus.aiunit.vision.nn9
    public int getContainerWidth() {
        return this.width;
    }

    @Override // com.oplus.aiunit.vision.nn9
    public int getDesignSize() {
        return this.configDesign;
    }

    @Override // com.oplus.aiunit.vision.nn9
    public int getDesignWidth() {
        return this.cardDesignWidth;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.configDesign)) * 31) + Integer.hashCode(this.cardDesignWidth);
    }

    @NotNull
    public String toString() {
        return "CardDesignSize(width=" + this.width + ", height=" + this.height + ", configDesign=" + this.configDesign + ", cardDesignWidth=" + this.cardDesignWidth + ")";
    }

    public /* synthetic */ CardDesignSize(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i5 & 4) != 0 ? -1 : i3, (i5 & 8) != 0 ? -1 : i4);
    }
}

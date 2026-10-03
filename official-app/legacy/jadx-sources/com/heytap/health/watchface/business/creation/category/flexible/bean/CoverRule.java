package com.heytap.health.watchface.business.creation.category.flexible.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.y04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/bean/CoverRule;", "", y04.TIME_STYLE_UP_DIR_NAME, "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/CoverRuleItem;", y04.TIME_STYLE_DOWN_DIR_NAME, y04.TIME_STYLE_LEFT_DIR_NAME, y04.TIME_STYLE_RIGHT_DIR_NAME, "(Lcom/heytap/health/watchface/business/creation/category/flexible/bean/CoverRuleItem;Lcom/heytap/health/watchface/business/creation/category/flexible/bean/CoverRuleItem;Lcom/heytap/health/watchface/business/creation/category/flexible/bean/CoverRuleItem;Lcom/heytap/health/watchface/business/creation/category/flexible/bean/CoverRuleItem;)V", "getDown", "()Lcom/heytap/health/watchface/business/creation/category/flexible/bean/CoverRuleItem;", "getLeft", "getRight", "getUp", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CoverRule {

    @NotNull
    private final CoverRuleItem down;

    @Nullable
    private final CoverRuleItem left;

    @Nullable
    private final CoverRuleItem right;

    @NotNull
    private final CoverRuleItem up;

    public CoverRule(@NotNull CoverRuleItem up, @NotNull CoverRuleItem down, @Nullable CoverRuleItem coverRuleItem, @Nullable CoverRuleItem coverRuleItem2) {
        Intrinsics.checkNotNullParameter(up, "up");
        Intrinsics.checkNotNullParameter(down, "down");
        this.up = up;
        this.down = down;
        this.left = coverRuleItem;
        this.right = coverRuleItem2;
    }

    public static /* synthetic */ CoverRule copy$default(CoverRule coverRule, CoverRuleItem coverRuleItem, CoverRuleItem coverRuleItem2, CoverRuleItem coverRuleItem3, CoverRuleItem coverRuleItem4, int i, Object obj) {
        if ((i & 1) != 0) {
            coverRuleItem = coverRule.up;
        }
        if ((i & 2) != 0) {
            coverRuleItem2 = coverRule.down;
        }
        if ((i & 4) != 0) {
            coverRuleItem3 = coverRule.left;
        }
        if ((i & 8) != 0) {
            coverRuleItem4 = coverRule.right;
        }
        return coverRule.copy(coverRuleItem, coverRuleItem2, coverRuleItem3, coverRuleItem4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CoverRuleItem getUp() {
        return this.up;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CoverRuleItem getDown() {
        return this.down;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CoverRuleItem getLeft() {
        return this.left;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CoverRuleItem getRight() {
        return this.right;
    }

    @NotNull
    public final CoverRule copy(@NotNull CoverRuleItem up, @NotNull CoverRuleItem down, @Nullable CoverRuleItem left, @Nullable CoverRuleItem right) {
        Intrinsics.checkNotNullParameter(up, "up");
        Intrinsics.checkNotNullParameter(down, "down");
        return new CoverRule(up, down, left, right);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoverRule)) {
            return false;
        }
        CoverRule coverRule = (CoverRule) other;
        return Intrinsics.areEqual(this.up, coverRule.up) && Intrinsics.areEqual(this.down, coverRule.down) && Intrinsics.areEqual(this.left, coverRule.left) && Intrinsics.areEqual(this.right, coverRule.right);
    }

    @NotNull
    public final CoverRuleItem getDown() {
        return this.down;
    }

    @Nullable
    public final CoverRuleItem getLeft() {
        return this.left;
    }

    @Nullable
    public final CoverRuleItem getRight() {
        return this.right;
    }

    @NotNull
    public final CoverRuleItem getUp() {
        return this.up;
    }

    public int hashCode() {
        int iHashCode = ((this.up.hashCode() * 31) + this.down.hashCode()) * 31;
        CoverRuleItem coverRuleItem = this.left;
        int iHashCode2 = (iHashCode + (coverRuleItem == null ? 0 : coverRuleItem.hashCode())) * 31;
        CoverRuleItem coverRuleItem2 = this.right;
        return iHashCode2 + (coverRuleItem2 != null ? coverRuleItem2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CoverRule(up=" + this.up + ", down=" + this.down + ", left=" + this.left + ", right=" + this.right + ")";
    }

    public /* synthetic */ CoverRule(CoverRuleItem coverRuleItem, CoverRuleItem coverRuleItem2, CoverRuleItem coverRuleItem3, CoverRuleItem coverRuleItem4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coverRuleItem, coverRuleItem2, (i & 4) != 0 ? null : coverRuleItem3, (i & 8) != 0 ? null : coverRuleItem4);
    }
}

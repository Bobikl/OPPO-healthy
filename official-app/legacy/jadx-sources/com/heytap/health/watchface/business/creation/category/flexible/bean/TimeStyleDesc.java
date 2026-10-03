package com.heytap.health.watchface.business.creation.category.flexible.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001.BG\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b+\u0010,J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\t\u0010\u0018\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b\u0005\u0010(R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F¢\u0006\u0006\u001a\u0004\b)\u0010&¨\u0006/"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/bean/TimeStyleDesc;", "", "", "timePos", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/CoverRuleItem;", "getCoverRule", "", "isSupportLeftRight", "component1", "component2", "component3", "", "component4", "", "component5", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/CoverRule;", "component6", "timeStyleIndex", "type", "mode", "styleId", "supportType", "coverRule", "copy", "toString", "hashCode", "other", "equals", "I", "getTimeStyleIndex", "()I", "getType", "getMode", "Ljava/lang/String;", "getStyleId", "()Ljava/lang/String;", "Ljava/util/List;", "getSupportType", "()Ljava/util/List;", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/CoverRule;", "()Lcom/heytap/health/watchface/business/creation/category/flexible/bean/CoverRule;", "getCompatSupportType", "compatSupportType", "<init>", "(IIILjava/lang/String;Ljava/util/List;Lcom/heytap/health/watchface/business/creation/category/flexible/bean/CoverRule;)V", "Companion", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TimeStyleDesc {
    public static final int MODE_DEFAULT = 13;
    public static final int MODE_SMALL_WIDGET = 5;

    @NotNull
    public static final String SUPPORT_TYPE_ALBUM = "Album";

    @NotNull
    public static final String SUPPORT_TYPE_DOF = "Dof";

    @NotNull
    public static final String SUPPORT_TYPE_LIVEPHOTO = "LivePhoto";
    public static final int TYPE_NUMBER = 0;
    public static final int TYPE_POINT = 1;

    @Nullable
    private final CoverRule coverRule;
    private final int mode;

    @Nullable
    private final String styleId;

    @Nullable
    private final List<String> supportType;
    private final int timeStyleIndex;
    private final int type;

    public TimeStyleDesc(int i, int i2, int i3, @Nullable String str, @Nullable List<String> list, @Nullable CoverRule coverRule) {
        this.timeStyleIndex = i;
        this.type = i2;
        this.mode = i3;
        this.styleId = str;
        this.supportType = list;
        this.coverRule = coverRule;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimeStyleDesc copy$default(TimeStyleDesc timeStyleDesc, int i, int i2, int i3, String str, List list, CoverRule coverRule, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = timeStyleDesc.timeStyleIndex;
        }
        if ((i4 & 2) != 0) {
            i2 = timeStyleDesc.type;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = timeStyleDesc.mode;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            str = timeStyleDesc.styleId;
        }
        String str2 = str;
        if ((i4 & 16) != 0) {
            list = timeStyleDesc.supportType;
        }
        List list2 = list;
        if ((i4 & 32) != 0) {
            coverRule = timeStyleDesc.coverRule;
        }
        return timeStyleDesc.copy(i, i5, i6, str2, list2, coverRule);
    }

    public static /* synthetic */ CoverRuleItem getCoverRule$default(TimeStyleDesc timeStyleDesc, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return timeStyleDesc.getCoverRule(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTimeStyleIndex() {
        return this.timeStyleIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStyleId() {
        return this.styleId;
    }

    @Nullable
    public final List<String> component5() {
        return this.supportType;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CoverRule getCoverRule() {
        return this.coverRule;
    }

    @NotNull
    public final TimeStyleDesc copy(int timeStyleIndex, int type, int mode, @Nullable String styleId, @Nullable List<String> supportType, @Nullable CoverRule coverRule) {
        return new TimeStyleDesc(timeStyleIndex, type, mode, styleId, supportType, coverRule);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeStyleDesc)) {
            return false;
        }
        TimeStyleDesc timeStyleDesc = (TimeStyleDesc) other;
        return this.timeStyleIndex == timeStyleDesc.timeStyleIndex && this.type == timeStyleDesc.type && this.mode == timeStyleDesc.mode && Intrinsics.areEqual(this.styleId, timeStyleDesc.styleId) && Intrinsics.areEqual(this.supportType, timeStyleDesc.supportType) && Intrinsics.areEqual(this.coverRule, timeStyleDesc.coverRule);
    }

    @NotNull
    public final List<String> getCompatSupportType() {
        List<String> list = this.supportType;
        return list == null ? CollectionsKt__CollectionsKt.arrayListOf(SUPPORT_TYPE_ALBUM, SUPPORT_TYPE_LIVEPHOTO) : list;
    }

    @Nullable
    public final CoverRule getCoverRule() {
        return this.coverRule;
    }

    public final int getMode() {
        return this.mode;
    }

    @Nullable
    public final String getStyleId() {
        return this.styleId;
    }

    @Nullable
    public final List<String> getSupportType() {
        return this.supportType;
    }

    public final int getTimeStyleIndex() {
        return this.timeStyleIndex;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.timeStyleIndex) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.mode)) * 31;
        String str = this.styleId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.supportType;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        CoverRule coverRule = this.coverRule;
        return iHashCode3 + (coverRule != null ? coverRule.hashCode() : 0);
    }

    public final boolean isSupportLeftRight() {
        return this.mode == 5;
    }

    @NotNull
    public String toString() {
        return "TimeStyleDesc(timeStyleIndex=" + this.timeStyleIndex + ", type=" + this.type + ", mode=" + this.mode + ", styleId=" + this.styleId + ", supportType=" + this.supportType + ", coverRule=" + this.coverRule + ")";
    }

    @Nullable
    public final CoverRuleItem getCoverRule(int timePos) {
        CoverRule coverRule;
        if (this.type == 1) {
            return null;
        }
        if (timePos == 0) {
            CoverRule coverRule2 = this.coverRule;
            if (coverRule2 != null) {
                return coverRule2.getUp();
            }
            return null;
        }
        if (timePos == 1) {
            CoverRule coverRule3 = this.coverRule;
            if (coverRule3 != null) {
                return coverRule3.getDown();
            }
            return null;
        }
        if (timePos == 3) {
            CoverRule coverRule4 = this.coverRule;
            if (coverRule4 != null) {
                return coverRule4.getLeft();
            }
            return null;
        }
        if (timePos != 4 || (coverRule = this.coverRule) == null) {
            return null;
        }
        return coverRule.getRight();
    }

    public /* synthetic */ TimeStyleDesc(int i, int i2, int i3, String str, List list, CoverRule coverRule, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, i2, (i4 & 4) != 0 ? 13 : i3, str, list, coverRule);
    }
}

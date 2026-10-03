package com.heytap.health.watchface.business.creation.category.flexible.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0005HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006#"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/bean/TimeStyleBean;", "", "source", "", "type", "", "styleId", "supportType", "", "coverRuleItem", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/CoverRuleItem;", "mode", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lcom/heytap/health/watchface/business/creation/category/flexible/bean/CoverRuleItem;I)V", "getCoverRuleItem", "()Lcom/heytap/health/watchface/business/creation/category/flexible/bean/CoverRuleItem;", "getMode", "()I", "getSource", "()Ljava/lang/String;", "getStyleId", "getSupportType", "()Ljava/util/List;", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TimeStyleBean {

    @Nullable
    private final CoverRuleItem coverRuleItem;
    private final int mode;

    @NotNull
    private final String source;

    @Nullable
    private final String styleId;

    @Nullable
    private final List<String> supportType;
    private final int type;

    public TimeStyleBean(@NotNull String source, int i, @Nullable String str, @Nullable List<String> list, @Nullable CoverRuleItem coverRuleItem, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
        this.type = i;
        this.styleId = str;
        this.supportType = list;
        this.coverRuleItem = coverRuleItem;
        this.mode = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimeStyleBean copy$default(TimeStyleBean timeStyleBean, String str, int i, String str2, List list, CoverRuleItem coverRuleItem, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = timeStyleBean.source;
        }
        if ((i3 & 2) != 0) {
            i = timeStyleBean.type;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str2 = timeStyleBean.styleId;
        }
        String str3 = str2;
        if ((i3 & 8) != 0) {
            list = timeStyleBean.supportType;
        }
        List list2 = list;
        if ((i3 & 16) != 0) {
            coverRuleItem = timeStyleBean.coverRuleItem;
        }
        CoverRuleItem coverRuleItem2 = coverRuleItem;
        if ((i3 & 32) != 0) {
            i2 = timeStyleBean.mode;
        }
        return timeStyleBean.copy(str, i4, str3, list2, coverRuleItem2, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStyleId() {
        return this.styleId;
    }

    @Nullable
    public final List<String> component4() {
        return this.supportType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CoverRuleItem getCoverRuleItem() {
        return this.coverRuleItem;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    @NotNull
    public final TimeStyleBean copy(@NotNull String source, int type, @Nullable String styleId, @Nullable List<String> supportType, @Nullable CoverRuleItem coverRuleItem, int mode) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new TimeStyleBean(source, type, styleId, supportType, coverRuleItem, mode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeStyleBean)) {
            return false;
        }
        TimeStyleBean timeStyleBean = (TimeStyleBean) other;
        return Intrinsics.areEqual(this.source, timeStyleBean.source) && this.type == timeStyleBean.type && Intrinsics.areEqual(this.styleId, timeStyleBean.styleId) && Intrinsics.areEqual(this.supportType, timeStyleBean.supportType) && Intrinsics.areEqual(this.coverRuleItem, timeStyleBean.coverRuleItem) && this.mode == timeStyleBean.mode;
    }

    @Nullable
    public final CoverRuleItem getCoverRuleItem() {
        return this.coverRuleItem;
    }

    public final int getMode() {
        return this.mode;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    @Nullable
    public final String getStyleId() {
        return this.styleId;
    }

    @Nullable
    public final List<String> getSupportType() {
        return this.supportType;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((this.source.hashCode() * 31) + Integer.hashCode(this.type)) * 31;
        String str = this.styleId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.supportType;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        CoverRuleItem coverRuleItem = this.coverRuleItem;
        return ((iHashCode3 + (coverRuleItem != null ? coverRuleItem.hashCode() : 0)) * 31) + Integer.hashCode(this.mode);
    }

    @NotNull
    public String toString() {
        return "TimeStyleBean(source=" + this.source + ", type=" + this.type + ", styleId=" + this.styleId + ", supportType=" + this.supportType + ", coverRuleItem=" + this.coverRuleItem + ", mode=" + this.mode + ")";
    }

    public /* synthetic */ TimeStyleBean(String str, int i, String str2, List list, CoverRuleItem coverRuleItem, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, list, (i3 & 16) != 0 ? null : coverRuleItem, (i3 & 32) != 0 ? 13 : i2);
    }
}

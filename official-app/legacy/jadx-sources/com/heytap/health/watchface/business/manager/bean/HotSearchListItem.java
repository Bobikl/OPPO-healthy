package com.heytap.health.watchface.business.manager.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0001;Bu\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b8\u00109J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u0091\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u0007HÆ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0002HÖ\u0001J\u0013\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b+\u0010'R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b/\u0010'R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b0\u0010'R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b1\u0010.R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\b2\u0010.R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\b3\u0010.R\u0017\u0010\u001b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010,\u001a\u0004\b4\u0010.R\u0017\u0010\u001c\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010,\u001a\u0004\b5\u0010.R\u0017\u0010\u001d\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010,\u001a\u0004\b6\u0010.R\u0017\u0010\u001e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010,\u001a\u0004\b7\u0010.¨\u0006<"}, d2 = {"Lcom/heytap/health/watchface/business/manager/bean/HotSearchListItem;", "", "", "component1", "", "component2", "component3", "", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "id", "hotListId", "hotType", "name", "supportDeepLink", "needIcon", "adDeepLinkUrl", "iosDeepLinkUrl", "iconUrl", "createTime", "createOperator", "updateTime", "updateOperator", "copy", "toString", "hashCode", "other", "", "equals", "I", "getId", "()I", "J", "getHotListId", "()J", "getHotType", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getSupportDeepLink", "getNeedIcon", "getAdDeepLinkUrl", "getIosDeepLinkUrl", "getIconUrl", "getCreateTime", "getCreateOperator", "getUpdateTime", "getUpdateOperator", "<init>", "(IJILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class HotSearchListItem {
    public static final int TAG_DISABLE = 0;
    public static final int TAG_ENABLE = 1;

    @Nullable
    private final String adDeepLinkUrl;

    @NotNull
    private final String createOperator;

    @NotNull
    private final String createTime;
    private final long hotListId;
    private final int hotType;

    @Nullable
    private final String iconUrl;
    private final int id;

    @Nullable
    private final String iosDeepLinkUrl;

    @NotNull
    private final String name;
    private final int needIcon;
    private final int supportDeepLink;

    @NotNull
    private final String updateOperator;

    @NotNull
    private final String updateTime;

    public HotSearchListItem(int i, long j2, int i2, @NotNull String name, int i3, int i4, @Nullable String str, @Nullable String str2, @Nullable String str3, @NotNull String createTime, @NotNull String createOperator, @NotNull String updateTime, @NotNull String updateOperator) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        Intrinsics.checkNotNullParameter(createOperator, "createOperator");
        Intrinsics.checkNotNullParameter(updateTime, "updateTime");
        Intrinsics.checkNotNullParameter(updateOperator, "updateOperator");
        this.id = i;
        this.hotListId = j2;
        this.hotType = i2;
        this.name = name;
        this.supportDeepLink = i3;
        this.needIcon = i4;
        this.adDeepLinkUrl = str;
        this.iosDeepLinkUrl = str2;
        this.iconUrl = str3;
        this.createTime = createTime;
        this.createOperator = createOperator;
        this.updateTime = updateTime;
        this.updateOperator = updateOperator;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCreateOperator() {
        return this.createOperator;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getUpdateOperator() {
        return this.updateOperator;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getHotListId() {
        return this.hotListId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHotType() {
        return this.hotType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSupportDeepLink() {
        return this.supportDeepLink;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getNeedIcon() {
        return this.needIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAdDeepLinkUrl() {
        return this.adDeepLinkUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getIosDeepLinkUrl() {
        return this.iosDeepLinkUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final HotSearchListItem copy(int id, long hotListId, int hotType, @NotNull String name, int supportDeepLink, int needIcon, @Nullable String adDeepLinkUrl, @Nullable String iosDeepLinkUrl, @Nullable String iconUrl, @NotNull String createTime, @NotNull String createOperator, @NotNull String updateTime, @NotNull String updateOperator) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        Intrinsics.checkNotNullParameter(createOperator, "createOperator");
        Intrinsics.checkNotNullParameter(updateTime, "updateTime");
        Intrinsics.checkNotNullParameter(updateOperator, "updateOperator");
        return new HotSearchListItem(id, hotListId, hotType, name, supportDeepLink, needIcon, adDeepLinkUrl, iosDeepLinkUrl, iconUrl, createTime, createOperator, updateTime, updateOperator);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotSearchListItem)) {
            return false;
        }
        HotSearchListItem hotSearchListItem = (HotSearchListItem) other;
        return this.id == hotSearchListItem.id && this.hotListId == hotSearchListItem.hotListId && this.hotType == hotSearchListItem.hotType && Intrinsics.areEqual(this.name, hotSearchListItem.name) && this.supportDeepLink == hotSearchListItem.supportDeepLink && this.needIcon == hotSearchListItem.needIcon && Intrinsics.areEqual(this.adDeepLinkUrl, hotSearchListItem.adDeepLinkUrl) && Intrinsics.areEqual(this.iosDeepLinkUrl, hotSearchListItem.iosDeepLinkUrl) && Intrinsics.areEqual(this.iconUrl, hotSearchListItem.iconUrl) && Intrinsics.areEqual(this.createTime, hotSearchListItem.createTime) && Intrinsics.areEqual(this.createOperator, hotSearchListItem.createOperator) && Intrinsics.areEqual(this.updateTime, hotSearchListItem.updateTime) && Intrinsics.areEqual(this.updateOperator, hotSearchListItem.updateOperator);
    }

    @Nullable
    public final String getAdDeepLinkUrl() {
        return this.adDeepLinkUrl;
    }

    @NotNull
    public final String getCreateOperator() {
        return this.createOperator;
    }

    @NotNull
    public final String getCreateTime() {
        return this.createTime;
    }

    public final long getHotListId() {
        return this.hotListId;
    }

    public final int getHotType() {
        return this.hotType;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getIosDeepLinkUrl() {
        return this.iosDeepLinkUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getNeedIcon() {
        return this.needIcon;
    }

    public final int getSupportDeepLink() {
        return this.supportDeepLink;
    }

    @NotNull
    public final String getUpdateOperator() {
        return this.updateOperator;
    }

    @NotNull
    public final String getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Integer.hashCode(this.id) * 31) + Long.hashCode(this.hotListId)) * 31) + Integer.hashCode(this.hotType)) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.supportDeepLink)) * 31) + Integer.hashCode(this.needIcon)) * 31;
        String str = this.adDeepLinkUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iosDeepLinkUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        return ((((((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.createTime.hashCode()) * 31) + this.createOperator.hashCode()) * 31) + this.updateTime.hashCode()) * 31) + this.updateOperator.hashCode();
    }

    @NotNull
    public String toString() {
        return "HotSearchListItem(id=" + this.id + ", hotListId=" + this.hotListId + ", hotType=" + this.hotType + ", name=" + this.name + ", supportDeepLink=" + this.supportDeepLink + ", needIcon=" + this.needIcon + ", adDeepLinkUrl=" + this.adDeepLinkUrl + ", iosDeepLinkUrl=" + this.iosDeepLinkUrl + ", iconUrl=" + this.iconUrl + ", createTime=" + this.createTime + ", createOperator=" + this.createOperator + ", updateTime=" + this.updateTime + ", updateOperator=" + this.updateOperator + ")";
    }
}

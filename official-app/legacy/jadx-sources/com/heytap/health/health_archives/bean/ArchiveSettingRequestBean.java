package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/health_archives/bean/ArchiveSettingRequestBean;", "", "settingKeyList", "", "", "(Ljava/util/List;)V", "getSettingKeyList", "()Ljava/util/List;", "setSettingKeyList", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ArchiveSettingRequestBean {

    @NotNull
    private List<String> settingKeyList;

    /* JADX WARN: Multi-variable type inference failed */
    public ArchiveSettingRequestBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArchiveSettingRequestBean copy$default(ArchiveSettingRequestBean archiveSettingRequestBean, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = archiveSettingRequestBean.settingKeyList;
        }
        return archiveSettingRequestBean.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.settingKeyList;
    }

    @NotNull
    public final ArchiveSettingRequestBean copy(@NotNull List<String> settingKeyList) {
        Intrinsics.checkNotNullParameter(settingKeyList, "settingKeyList");
        return new ArchiveSettingRequestBean(settingKeyList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ArchiveSettingRequestBean) && Intrinsics.areEqual(this.settingKeyList, ((ArchiveSettingRequestBean) other).settingKeyList);
    }

    @NotNull
    public final List<String> getSettingKeyList() {
        return this.settingKeyList;
    }

    public int hashCode() {
        return this.settingKeyList.hashCode();
    }

    public final void setSettingKeyList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.settingKeyList = list;
    }

    @NotNull
    public String toString() {
        return "ArchiveSettingRequestBean(settingKeyList=" + this.settingKeyList + ")";
    }

    public ArchiveSettingRequestBean(@NotNull List<String> settingKeyList) {
        Intrinsics.checkNotNullParameter(settingKeyList, "settingKeyList");
        this.settingKeyList = settingKeyList;
    }

    public /* synthetic */ ArchiveSettingRequestBean(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}

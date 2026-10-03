package com.heytap.health.wallet.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/wallet/bean/Section;", "", "sectionTitle", "", "sectionList", "", "Lcom/heytap/health/wallet/bean/SectionInfo;", "(Ljava/lang/String;Ljava/util/List;)V", "getSectionList", "()Ljava/util/List;", "getSectionTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Section {

    @Nullable
    private final List<SectionInfo> sectionList;

    @Nullable
    private final String sectionTitle;

    public Section(@Nullable String str, @Nullable List<SectionInfo> list) {
        this.sectionTitle = str;
        this.sectionList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Section copy$default(Section section, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = section.sectionTitle;
        }
        if ((i & 2) != 0) {
            list = section.sectionList;
        }
        return section.copy(str, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    @Nullable
    public final List<SectionInfo> component2() {
        return this.sectionList;
    }

    @NotNull
    public final Section copy(@Nullable String sectionTitle, @Nullable List<SectionInfo> sectionList) {
        return new Section(sectionTitle, sectionList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Section)) {
            return false;
        }
        Section section = (Section) other;
        return Intrinsics.areEqual(this.sectionTitle, section.sectionTitle) && Intrinsics.areEqual(this.sectionList, section.sectionList);
    }

    @Nullable
    public final List<SectionInfo> getSectionList() {
        return this.sectionList;
    }

    @Nullable
    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    public int hashCode() {
        String str = this.sectionTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<SectionInfo> list = this.sectionList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Section(sectionTitle=" + this.sectionTitle + ", sectionList=" + this.sectionList + ")";
    }
}

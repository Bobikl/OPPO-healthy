package com.heytap.health.cervical_vertebra.bean;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/heytap/health/cervical_vertebra/bean/CervicalSpine;", "Ljava/io/Serializable;", "type", "", "title", DBHealthReviewPlan.DESC, "url", "", "size", "", "(IIILjava/lang/String;J)V", "getDesc", "()I", "setDesc", "(I)V", "getSize", "()J", "getTitle", "setTitle", "getType", "getUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CervicalSpine implements Serializable {
    private int desc;
    private final long size;
    private int title;
    private final int type;

    @Nullable
    private final String url;

    public CervicalSpine(int i, int i2, int i3, @Nullable String str, long j2) {
        this.type = i;
        this.title = i2;
        this.desc = i3;
        this.url = str;
        this.size = j2;
    }

    public static /* synthetic */ CervicalSpine copy$default(CervicalSpine cervicalSpine, int i, int i2, int i3, String str, long j2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = cervicalSpine.type;
        }
        if ((i4 & 2) != 0) {
            i2 = cervicalSpine.title;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = cervicalSpine.desc;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            str = cervicalSpine.url;
        }
        String str2 = str;
        if ((i4 & 16) != 0) {
            j2 = cervicalSpine.size;
        }
        return cervicalSpine.copy(i, i5, i6, str2, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDesc() {
        return this.desc;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @NotNull
    public final CervicalSpine copy(int type, int title, int desc, @Nullable String url, long size) {
        return new CervicalSpine(type, title, desc, url, size);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CervicalSpine)) {
            return false;
        }
        CervicalSpine cervicalSpine = (CervicalSpine) other;
        return this.type == cervicalSpine.type && this.title == cervicalSpine.title && this.desc == cervicalSpine.desc && Intrinsics.areEqual(this.url, cervicalSpine.url) && this.size == cervicalSpine.size;
    }

    public final int getDesc() {
        return this.desc;
    }

    public final long getSize() {
        return this.size;
    }

    public final int getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.title)) * 31) + Integer.hashCode(this.desc)) * 31;
        String str = this.url;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.size);
    }

    public final void setDesc(int i) {
        this.desc = i;
    }

    public final void setTitle(int i) {
        this.title = i;
    }

    @NotNull
    public String toString() {
        return "CervicalSpine(type=" + this.type + ", title=" + this.title + ", desc=" + this.desc + ", url=" + this.url + ", size=" + this.size + ")";
    }

    public /* synthetic */ CervicalSpine(int i, int i2, int i3, String str, long j2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i4 & 8) != 0 ? null : str, j2);
    }
}

package com.heytap.health.insight.net;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u000bHÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006!"}, d2 = {"Lcom/heytap/health/insight/net/Data;", "", "axisDependency", "", "color", "", "entries", "", "Lcom/heytap/health/insight/net/Entry;", "type", "attrs", "", "(IJLjava/util/List;ILjava/lang/String;)V", "getAttrs", "()Ljava/lang/String;", "getAxisDependency", "()I", "getColor", "()J", "getEntries", "()Ljava/util/List;", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Data {

    @Nullable
    private final String attrs;
    private final int axisDependency;
    private final long color;

    @Nullable
    private final List<Entry> entries;
    private final int type;

    public Data(int i, long j2, @Nullable List<Entry> list, int i2, @Nullable String str) {
        this.axisDependency = i;
        this.color = j2;
        this.entries = list;
        this.type = i2;
        this.attrs = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, int i, long j2, List list, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = data.axisDependency;
        }
        if ((i3 & 2) != 0) {
            j2 = data.color;
        }
        long j3 = j2;
        if ((i3 & 4) != 0) {
            list = data.entries;
        }
        List list2 = list;
        if ((i3 & 8) != 0) {
            i2 = data.type;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            str = data.attrs;
        }
        return data.copy(i, j3, list2, i4, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAxisDependency() {
        return this.axisDependency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    @Nullable
    public final List<Entry> component3() {
        return this.entries;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAttrs() {
        return this.attrs;
    }

    @NotNull
    public final Data copy(int axisDependency, long color, @Nullable List<Entry> entries, int type, @Nullable String attrs) {
        return new Data(axisDependency, color, entries, type, attrs);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Data)) {
            return false;
        }
        Data data = (Data) other;
        return this.axisDependency == data.axisDependency && this.color == data.color && Intrinsics.areEqual(this.entries, data.entries) && this.type == data.type && Intrinsics.areEqual(this.attrs, data.attrs);
    }

    @Nullable
    public final String getAttrs() {
        return this.attrs;
    }

    public final int getAxisDependency() {
        return this.axisDependency;
    }

    public final long getColor() {
        return this.color;
    }

    @Nullable
    public final List<Entry> getEntries() {
        return this.entries;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.axisDependency) * 31) + Long.hashCode(this.color)) * 31;
        List<Entry> list = this.entries;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.type)) * 31;
        String str = this.attrs;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Data(axisDependency=" + this.axisDependency + ", color=" + this.color + ", entries=" + this.entries + ", type=" + this.type + ", attrs=" + this.attrs + ")";
    }
}

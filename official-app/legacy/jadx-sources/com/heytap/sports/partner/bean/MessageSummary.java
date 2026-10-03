package com.heytap.sports.partner.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/heytap/sports/partner/bean/MessageSummary;", "", "count", "", "summary", "", "(ILjava/lang/String;)V", "getCount", "()I", "getSummary", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "partner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MessageSummary {
    public static final int $stable = 0;
    private final int count;

    @NotNull
    private final String summary;

    /* JADX WARN: Multi-variable type inference failed */
    public MessageSummary() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MessageSummary copy$default(MessageSummary messageSummary, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = messageSummary.count;
        }
        if ((i2 & 2) != 0) {
            str = messageSummary.summary;
        }
        return messageSummary.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    @NotNull
    public final MessageSummary copy(int count, @NotNull String summary) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        return new MessageSummary(count, summary);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageSummary)) {
            return false;
        }
        MessageSummary messageSummary = (MessageSummary) other;
        return this.count == messageSummary.count && Intrinsics.areEqual(this.summary, messageSummary.summary);
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final String getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return (Integer.hashCode(this.count) * 31) + this.summary.hashCode();
    }

    @NotNull
    public String toString() {
        return "MessageSummary(count=" + this.count + ", summary=" + this.summary + ")";
    }

    public MessageSummary(int i, @NotNull String summary) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.count = i;
        this.summary = summary;
    }

    public /* synthetic */ MessageSummary(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}

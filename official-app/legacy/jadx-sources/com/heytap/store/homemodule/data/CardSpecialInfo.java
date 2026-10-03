package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import com.oplus.drs.core.config.entity.DebugModeEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JC\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\tHÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lcom/heytap/store/homemodule/data/CardSpecialInfo;", "", "curAt", "", "cardSpecialDetails", "", "Lcom/heytap/store/homemodule/data/CardSpecialDetail;", DebugModeEntity.KEY_END_AT, "status", "", DebugModeEntity.KEY_START_AT, "(JLjava/util/List;JIJ)V", "getCardSpecialDetails", "()Ljava/util/List;", "setCardSpecialDetails", "(Ljava/util/List;)V", "getCurAt", "()J", "setCurAt", "(J)V", "getEndAt", "setEndAt", "getStartAt", "setStartAt", "getStatus", "()I", "setStatus", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class CardSpecialInfo {

    @Nullable
    private List<CardSpecialDetail> cardSpecialDetails;
    private long curAt;
    private long endAt;
    private long startAt;
    private int status;

    public CardSpecialInfo() {
        this(0L, null, 0L, 0, 0L, 31, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCurAt() {
        return this.curAt;
    }

    @Nullable
    public final List<CardSpecialDetail> component2() {
        return this.cardSpecialDetails;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEndAt() {
        return this.endAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getStartAt() {
        return this.startAt;
    }

    @NotNull
    public final CardSpecialInfo copy(long curAt, @Nullable List<CardSpecialDetail> cardSpecialDetails, long endAt, int status, long startAt) {
        return new CardSpecialInfo(curAt, cardSpecialDetails, endAt, status, startAt);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardSpecialInfo)) {
            return false;
        }
        CardSpecialInfo cardSpecialInfo = (CardSpecialInfo) other;
        return this.curAt == cardSpecialInfo.curAt && Intrinsics.areEqual(this.cardSpecialDetails, cardSpecialInfo.cardSpecialDetails) && this.endAt == cardSpecialInfo.endAt && this.status == cardSpecialInfo.status && this.startAt == cardSpecialInfo.startAt;
    }

    @Nullable
    public final List<CardSpecialDetail> getCardSpecialDetails() {
        return this.cardSpecialDetails;
    }

    public final long getCurAt() {
        return this.curAt;
    }

    public final long getEndAt() {
        return this.endAt;
    }

    public final long getStartAt() {
        return this.startAt;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.curAt) * 31;
        List<CardSpecialDetail> list = this.cardSpecialDetails;
        return ((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Long.hashCode(this.endAt)) * 31) + Integer.hashCode(this.status)) * 31) + Long.hashCode(this.startAt);
    }

    public final void setCardSpecialDetails(@Nullable List<CardSpecialDetail> list) {
        this.cardSpecialDetails = list;
    }

    public final void setCurAt(long j2) {
        this.curAt = j2;
    }

    public final void setEndAt(long j2) {
        this.endAt = j2;
    }

    public final void setStartAt(long j2) {
        this.startAt = j2;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    @NotNull
    public String toString() {
        return "CardSpecialInfo(curAt=" + this.curAt + ", cardSpecialDetails=" + this.cardSpecialDetails + ", endAt=" + this.endAt + ", status=" + this.status + ", startAt=" + this.startAt + ')';
    }

    public CardSpecialInfo(long j2, @Nullable List<CardSpecialDetail> list, long j3, int i, long j4) {
        this.curAt = j2;
        this.cardSpecialDetails = list;
        this.endAt = j3;
        this.status = i;
        this.startAt = j4;
    }

    public /* synthetic */ CardSpecialInfo(long j2, List list, long j3, int i, long j4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j2, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? 0L : j3, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? 0L : j4);
    }
}

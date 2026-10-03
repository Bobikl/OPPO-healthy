package com.oplus.aiunit.vision;

import com.heytap.health.watch.thirdparty.ThirdPartyPresenter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.j3k, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u0010\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/j3k;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", "setModuleId", "(I)V", "moduleId", "setCheckTouristFrom", "checkTouristFrom", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "setTicket", "(Ljava/lang/String;)V", ThirdPartyPresenter.TICKET, "<init>", "(IILjava/lang/String;)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TouristLoginParam {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int moduleId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int checkTouristFrom;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public String ticket;

    public TouristLoginParam() {
        this(0, 0, null, 7, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCheckTouristFrom() {
        return this.checkTouristFrom;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getModuleId() {
        return this.moduleId;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTicket() {
        return this.ticket;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouristLoginParam)) {
            return false;
        }
        TouristLoginParam touristLoginParam = (TouristLoginParam) other;
        return this.moduleId == touristLoginParam.moduleId && this.checkTouristFrom == touristLoginParam.checkTouristFrom && Intrinsics.areEqual(this.ticket, touristLoginParam.ticket);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.moduleId) * 31) + Integer.hashCode(this.checkTouristFrom)) * 31) + this.ticket.hashCode();
    }

    @NotNull
    public String toString() {
        return "TouristLoginParam(moduleId=" + this.moduleId + ", checkTouristFrom=" + this.checkTouristFrom + ", ticket=" + this.ticket + ")";
    }

    public TouristLoginParam(int i, int i2, @NotNull String ticket) {
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        this.moduleId = i;
        this.checkTouristFrom = i2;
        this.ticket = ticket;
    }

    public /* synthetic */ TouristLoginParam(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? "" : str);
    }
}

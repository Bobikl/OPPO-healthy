package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.y5k, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/y5k;", "", "other", "", "equals", "", "hashCode", "", "toString", "a", "Ljava/lang/String;", "getEventGroup", "()Ljava/lang/String;", "eventGroup", "b", "getEventId", "eventId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class TrackEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final String eventGroup;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String eventId;

    public TrackEvent(@NotNull String eventGroup, @NotNull String eventId) {
        Intrinsics.checkNotNullParameter(eventGroup, "eventGroup");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        this.eventGroup = eventGroup;
        this.eventId = eventId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(TrackEvent.class, other != null ? other.getClass() : null)) {
            return false;
        }
        String str = this.eventGroup;
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.oplus.nearx.track.internal.model.TrackEvent");
        TrackEvent trackEvent = (TrackEvent) other;
        return Intrinsics.areEqual(str, trackEvent.eventGroup) && Intrinsics.areEqual(this.eventId, trackEvent.eventId);
    }

    public int hashCode() {
        return (this.eventGroup.hashCode() * 31) + this.eventId.hashCode();
    }

    @NotNull
    public String toString() {
        return "TrackEvent(eventGroup=" + this.eventGroup + ", eventId=" + this.eventId + ')';
    }
}

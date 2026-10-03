package com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.anotation.FieldIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/oplus/nearx/track/internal/remoteconfig/cloudconfig/entity/EventBlackEntity;", "", "eventType", "", "eventId", "operationBlackList", "blackKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBlackKey", "()Ljava/lang/String;", "getEventId", "getEventType", "getOperationBlackList", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "core-statistics_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class EventBlackEntity {

    @FieldIndex(index = 4)
    @NotNull
    private final String blackKey;

    @FieldIndex(index = 2)
    @NotNull
    private final String eventId;

    @FieldIndex(index = 1)
    @NotNull
    private final String eventType;

    @FieldIndex(index = 3)
    @NotNull
    private final String operationBlackList;

    public EventBlackEntity() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ EventBlackEntity copy$default(EventBlackEntity eventBlackEntity, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventBlackEntity.eventType;
        }
        if ((i & 2) != 0) {
            str2 = eventBlackEntity.eventId;
        }
        if ((i & 4) != 0) {
            str3 = eventBlackEntity.operationBlackList;
        }
        if ((i & 8) != 0) {
            str4 = eventBlackEntity.blackKey;
        }
        return eventBlackEntity.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOperationBlackList() {
        return this.operationBlackList;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBlackKey() {
        return this.blackKey;
    }

    @NotNull
    public final EventBlackEntity copy(@NotNull String eventType, @NotNull String eventId, @NotNull String operationBlackList, @NotNull String blackKey) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(operationBlackList, "operationBlackList");
        Intrinsics.checkNotNullParameter(blackKey, "blackKey");
        return new EventBlackEntity(eventType, eventId, operationBlackList, blackKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventBlackEntity)) {
            return false;
        }
        EventBlackEntity eventBlackEntity = (EventBlackEntity) other;
        return Intrinsics.areEqual(this.eventType, eventBlackEntity.eventType) && Intrinsics.areEqual(this.eventId, eventBlackEntity.eventId) && Intrinsics.areEqual(this.operationBlackList, eventBlackEntity.operationBlackList) && Intrinsics.areEqual(this.blackKey, eventBlackEntity.blackKey);
    }

    @NotNull
    public final String getBlackKey() {
        return this.blackKey;
    }

    @NotNull
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    public final String getOperationBlackList() {
        return this.operationBlackList;
    }

    public int hashCode() {
        return (((((this.eventType.hashCode() * 31) + this.eventId.hashCode()) * 31) + this.operationBlackList.hashCode()) * 31) + this.blackKey.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventBlackEntity(eventType=" + this.eventType + ", eventId=" + this.eventId + ", operationBlackList=" + this.operationBlackList + ", blackKey=" + this.blackKey + ')';
    }

    public EventBlackEntity(@NotNull String eventType, @NotNull String eventId, @NotNull String operationBlackList, @NotNull String blackKey) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(operationBlackList, "operationBlackList");
        Intrinsics.checkNotNullParameter(blackKey, "blackKey");
        this.eventType = eventType;
        this.eventId = eventId;
        this.operationBlackList = operationBlackList;
        this.blackKey = blackKey;
    }

    public /* synthetic */ EventBlackEntity(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}

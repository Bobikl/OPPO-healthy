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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/oplus/nearx/track/internal/remoteconfig/cloudconfig/entity/WhiteListEntity;", "", "viewId", "", "operationId", "eventType", "eventId", "extend", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "getEventType", "getExtend", "getOperationId", "getViewId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "core-statistics_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class WhiteListEntity {

    @FieldIndex(index = 4)
    @NotNull
    private final String eventId;

    @FieldIndex(index = 3)
    @NotNull
    private final String eventType;

    @FieldIndex(index = 5)
    @NotNull
    private final String extend;

    @FieldIndex(index = 2)
    @NotNull
    private final String operationId;

    @FieldIndex(index = 1)
    @NotNull
    private final String viewId;

    public WhiteListEntity() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ WhiteListEntity copy$default(WhiteListEntity whiteListEntity, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = whiteListEntity.viewId;
        }
        if ((i & 2) != 0) {
            str2 = whiteListEntity.operationId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = whiteListEntity.eventType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = whiteListEntity.eventId;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = whiteListEntity.extend;
        }
        return whiteListEntity.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getViewId() {
        return this.viewId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOperationId() {
        return this.operationId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExtend() {
        return this.extend;
    }

    @NotNull
    public final WhiteListEntity copy(@NotNull String viewId, @NotNull String operationId, @NotNull String eventType, @NotNull String eventId, @NotNull String extend) {
        Intrinsics.checkNotNullParameter(viewId, "viewId");
        Intrinsics.checkNotNullParameter(operationId, "operationId");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(extend, "extend");
        return new WhiteListEntity(viewId, operationId, eventType, eventId, extend);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhiteListEntity)) {
            return false;
        }
        WhiteListEntity whiteListEntity = (WhiteListEntity) other;
        return Intrinsics.areEqual(this.viewId, whiteListEntity.viewId) && Intrinsics.areEqual(this.operationId, whiteListEntity.operationId) && Intrinsics.areEqual(this.eventType, whiteListEntity.eventType) && Intrinsics.areEqual(this.eventId, whiteListEntity.eventId) && Intrinsics.areEqual(this.extend, whiteListEntity.extend);
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
    public final String getExtend() {
        return this.extend;
    }

    @NotNull
    public final String getOperationId() {
        return this.operationId;
    }

    @NotNull
    public final String getViewId() {
        return this.viewId;
    }

    public int hashCode() {
        return (((((((this.viewId.hashCode() * 31) + this.operationId.hashCode()) * 31) + this.eventType.hashCode()) * 31) + this.eventId.hashCode()) * 31) + this.extend.hashCode();
    }

    @NotNull
    public String toString() {
        return "WhiteListEntity(viewId=" + this.viewId + ", operationId=" + this.operationId + ", eventType=" + this.eventType + ", eventId=" + this.eventId + ", extend=" + this.extend + ')';
    }

    public WhiteListEntity(@NotNull String viewId, @NotNull String operationId, @NotNull String eventType, @NotNull String eventId, @NotNull String extend) {
        Intrinsics.checkNotNullParameter(viewId, "viewId");
        Intrinsics.checkNotNullParameter(operationId, "operationId");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(extend, "extend");
        this.viewId = viewId;
        this.operationId = operationId;
        this.eventType = eventType;
        this.eventId = eventId;
        this.extend = extend;
    }

    public /* synthetic */ WhiteListEntity(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}

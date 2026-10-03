package com.heytap.sports.home.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.wearable.emergency.api.emergency.EmergencyMainApis;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, d2 = {"Lcom/heytap/sports/home/bean/TodoData;", "", "eventType", "", "eventSubType", "eventTitle", "", "eventId", "eventLink", "eventIcon", EmergencyMainApis.EVENT_OPEN_PAGE_PRAM_CODE, "cardCode", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCardCode", "()Ljava/lang/String;", "getEventIcon", "getEventId", "getEventLink", "getEventSubType", "()I", "getEventTitle", "getEventType", "getPageCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TodoData {
    public static final int $stable = 0;

    @NotNull
    private final String cardCode;

    @NotNull
    private final String eventIcon;

    @NotNull
    private final String eventId;

    @NotNull
    private final String eventLink;
    private final int eventSubType;

    @NotNull
    private final String eventTitle;
    private final int eventType;

    @NotNull
    private final String pageCode;

    public TodoData(int i, int i2, @NotNull String eventTitle, @NotNull String eventId, @NotNull String eventLink, @NotNull String eventIcon, @NotNull String pageCode, @NotNull String cardCode) {
        Intrinsics.checkNotNullParameter(eventTitle, "eventTitle");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventLink, "eventLink");
        Intrinsics.checkNotNullParameter(eventIcon, "eventIcon");
        Intrinsics.checkNotNullParameter(pageCode, "pageCode");
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        this.eventType = i;
        this.eventSubType = i2;
        this.eventTitle = eventTitle;
        this.eventId = eventId;
        this.eventLink = eventLink;
        this.eventIcon = eventIcon;
        this.pageCode = pageCode;
        this.cardCode = cardCode;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEventSubType() {
        return this.eventSubType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEventTitle() {
        return this.eventTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEventLink() {
        return this.eventLink;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEventIcon() {
        return this.eventIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPageCode() {
        return this.pageCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCardCode() {
        return this.cardCode;
    }

    @NotNull
    public final TodoData copy(int eventType, int eventSubType, @NotNull String eventTitle, @NotNull String eventId, @NotNull String eventLink, @NotNull String eventIcon, @NotNull String pageCode, @NotNull String cardCode) {
        Intrinsics.checkNotNullParameter(eventTitle, "eventTitle");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(eventLink, "eventLink");
        Intrinsics.checkNotNullParameter(eventIcon, "eventIcon");
        Intrinsics.checkNotNullParameter(pageCode, "pageCode");
        Intrinsics.checkNotNullParameter(cardCode, "cardCode");
        return new TodoData(eventType, eventSubType, eventTitle, eventId, eventLink, eventIcon, pageCode, cardCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TodoData)) {
            return false;
        }
        TodoData todoData = (TodoData) other;
        return this.eventType == todoData.eventType && this.eventSubType == todoData.eventSubType && Intrinsics.areEqual(this.eventTitle, todoData.eventTitle) && Intrinsics.areEqual(this.eventId, todoData.eventId) && Intrinsics.areEqual(this.eventLink, todoData.eventLink) && Intrinsics.areEqual(this.eventIcon, todoData.eventIcon) && Intrinsics.areEqual(this.pageCode, todoData.pageCode) && Intrinsics.areEqual(this.cardCode, todoData.cardCode);
    }

    @NotNull
    public final String getCardCode() {
        return this.cardCode;
    }

    @NotNull
    public final String getEventIcon() {
        return this.eventIcon;
    }

    @NotNull
    public final String getEventId() {
        return this.eventId;
    }

    @NotNull
    public final String getEventLink() {
        return this.eventLink;
    }

    public final int getEventSubType() {
        return this.eventSubType;
    }

    @NotNull
    public final String getEventTitle() {
        return this.eventTitle;
    }

    public final int getEventType() {
        return this.eventType;
    }

    @NotNull
    public final String getPageCode() {
        return this.pageCode;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.eventType) * 31) + Integer.hashCode(this.eventSubType)) * 31) + this.eventTitle.hashCode()) * 31) + this.eventId.hashCode()) * 31) + this.eventLink.hashCode()) * 31) + this.eventIcon.hashCode()) * 31) + this.pageCode.hashCode()) * 31) + this.cardCode.hashCode();
    }

    @NotNull
    public String toString() {
        return "TodoData(eventType=" + this.eventType + ", eventSubType=" + this.eventSubType + ", eventTitle=" + this.eventTitle + ", eventId=" + this.eventId + ", eventLink=" + this.eventLink + ", eventIcon=" + this.eventIcon + ", pageCode=" + this.pageCode + ", cardCode=" + this.cardCode + ")";
    }
}

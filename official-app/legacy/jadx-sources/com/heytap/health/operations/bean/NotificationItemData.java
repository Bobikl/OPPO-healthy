package com.heytap.health.operations.bean;

import android.app.PendingIntent;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/operations/bean/NotificationItemData;", "", "notifyType", "Lcom/heytap/health/operations/bean/NotifyType;", "title", "", "content", "intent", "Landroid/app/PendingIntent;", "(Lcom/heytap/health/operations/bean/NotifyType;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;)V", "getContent", "()Ljava/lang/String;", "getIntent", "()Landroid/app/PendingIntent;", "getNotifyType", "()Lcom/heytap/health/operations/bean/NotifyType;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "operations_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class NotificationItemData {

    @NotNull
    private final String content;

    @NotNull
    private final PendingIntent intent;

    @NotNull
    private final NotifyType notifyType;

    @NotNull
    private final String title;

    public NotificationItemData(@NotNull NotifyType notifyType, @NotNull String title, @NotNull String content, @NotNull PendingIntent intent) {
        Intrinsics.checkNotNullParameter(notifyType, "notifyType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.notifyType = notifyType;
        this.title = title;
        this.content = content;
        this.intent = intent;
    }

    public static /* synthetic */ NotificationItemData copy$default(NotificationItemData notificationItemData, NotifyType notifyType, String str, String str2, PendingIntent pendingIntent, int i, Object obj) {
        if ((i & 1) != 0) {
            notifyType = notificationItemData.notifyType;
        }
        if ((i & 2) != 0) {
            str = notificationItemData.title;
        }
        if ((i & 4) != 0) {
            str2 = notificationItemData.content;
        }
        if ((i & 8) != 0) {
            pendingIntent = notificationItemData.intent;
        }
        return notificationItemData.copy(notifyType, str, str2, pendingIntent);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NotifyType getNotifyType() {
        return this.notifyType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PendingIntent getIntent() {
        return this.intent;
    }

    @NotNull
    public final NotificationItemData copy(@NotNull NotifyType notifyType, @NotNull String title, @NotNull String content, @NotNull PendingIntent intent) {
        Intrinsics.checkNotNullParameter(notifyType, "notifyType");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new NotificationItemData(notifyType, title, content, intent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationItemData)) {
            return false;
        }
        NotificationItemData notificationItemData = (NotificationItemData) other;
        return this.notifyType == notificationItemData.notifyType && Intrinsics.areEqual(this.title, notificationItemData.title) && Intrinsics.areEqual(this.content, notificationItemData.content) && Intrinsics.areEqual(this.intent, notificationItemData.intent);
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final PendingIntent getIntent() {
        return this.intent;
    }

    @NotNull
    public final NotifyType getNotifyType() {
        return this.notifyType;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.notifyType.hashCode() * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + this.intent.hashCode();
    }

    @NotNull
    public String toString() {
        return "NotificationItemData(notifyType=" + this.notifyType + ", title=" + this.title + ", content=" + this.content + ", intent=" + this.intent + ")";
    }
}

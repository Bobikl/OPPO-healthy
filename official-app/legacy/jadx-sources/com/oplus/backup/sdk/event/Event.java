package com.oplus.backup.sdk.event;

import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/oplus/backup/sdk/event/Event;", "", "eventIntent", "Landroid/content/Intent;", "(Landroid/content/Intent;)V", "getEventIntent", "()Landroid/content/Intent;", "setEventIntent", "receivePluginID", "", "getReceivePluginID", "()Ljava/lang/String;", "setReceivePluginID", "(Ljava/lang/String;)V", "Companion", "backup-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class Event {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EVENT_MESSAGE_RECEIVED = "event_message_received";

    @NotNull
    public static final String EVENT_MESSAGE_SENT = "event_message_sent";

    @NotNull
    public static final String EVENT_RESTORE_CMD_SENT = "event_restore_cmd_sent";

    @NotNull
    private Intent eventIntent;

    @Nullable
    private String receivePluginID;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/oplus/backup/sdk/event/Event$Companion;", "", "()V", "EVENT_MESSAGE_RECEIVED", "", "EVENT_MESSAGE_SENT", "EVENT_RESTORE_CMD_SENT", "isEventIntent", "", "intent", "Landroid/content/Intent;", "action", "backup-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean isEventIntent(@Nullable String action) {
            return Intrinsics.areEqual(Event.EVENT_MESSAGE_RECEIVED, action) || Intrinsics.areEqual(Event.EVENT_MESSAGE_SENT, action) || Intrinsics.areEqual(Event.EVENT_RESTORE_CMD_SENT, action);
        }

        @JvmStatic
        public final boolean isEventIntent(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return isEventIntent(intent.getAction());
        }
    }

    public Event(@NotNull Intent eventIntent) {
        Intrinsics.checkNotNullParameter(eventIntent, "eventIntent");
        this.eventIntent = eventIntent;
    }

    @JvmStatic
    public static final boolean isEventIntent(@NotNull Intent intent) {
        return INSTANCE.isEventIntent(intent);
    }

    @NotNull
    public final Intent getEventIntent() {
        return this.eventIntent;
    }

    @Nullable
    public final String getReceivePluginID() {
        return this.receivePluginID;
    }

    public final void setEventIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<set-?>");
        this.eventIntent = intent;
    }

    public final void setReceivePluginID(@Nullable String str) {
        this.receivePluginID = str;
    }

    @JvmStatic
    public static final boolean isEventIntent(@Nullable String str) {
        return INSTANCE.isEventIntent(str);
    }
}

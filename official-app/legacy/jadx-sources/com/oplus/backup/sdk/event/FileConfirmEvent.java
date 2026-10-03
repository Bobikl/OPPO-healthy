package com.oplus.backup.sdk.event;

import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/oplus/backup/sdk/event/FileConfirmEvent;", "Lcom/oplus/backup/sdk/event/Event;", "intent", "Landroid/content/Intent;", "(Landroid/content/Intent;)V", "sentFile", "", "getSentFile", "()Ljava/lang/String;", "Companion", "backup-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FileConfirmEvent extends Event {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EVENT_FILE_CONFIRM_ACTION = "file_confirm_action";

    @NotNull
    public static final String EVENT_KEY_SENT_FILE = "sent_file";

    @Nullable
    private final String sentFile;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/oplus/backup/sdk/event/FileConfirmEvent$Companion;", "", "()V", "EVENT_FILE_CONFIRM_ACTION", "", "EVENT_KEY_SENT_FILE", "isFileConfirmEvent", "", "action", "backup-sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean isFileConfirmEvent(@NotNull String action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return Intrinsics.areEqual(action, FileConfirmEvent.EVENT_FILE_CONFIRM_ACTION);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileConfirmEvent(@NotNull Intent intent) {
        super(intent);
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.sentFile = intent.getStringExtra(EVENT_KEY_SENT_FILE);
    }

    @JvmStatic
    public static final boolean isFileConfirmEvent(@NotNull String str) {
        return INSTANCE.isFileConfirmEvent(str);
    }

    @Nullable
    public final String getSentFile() {
        return this.sentFile;
    }
}

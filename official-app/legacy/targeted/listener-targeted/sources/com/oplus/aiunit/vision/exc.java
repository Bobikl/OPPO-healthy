package com.oplus.aiunit.vision;

import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.watch.notification.BleNotificationNeedIcon;
import com.heytap.health.watch.notification.BleNotificationRemoved;
import com.heytap.health.watch.notification.BleNotificationReply;
import com.heytap.health.watch.notification.CloudStatus;
import com.heytap.health.watch.notification.DismissNotificationProto;
import com.heytap.health.watch.notification.NotificationRemoved;
import com.heytap.health.watch.notification.NotificationReply;
import com.heytap.health.watch.notification.ParsedNotificationActionProto;
import com.heytap.health.watch.notification.ParsedNotificationProto;
import com.heytap.health.watch.notification.ReSyncNotificationProto;
import com.heytap.health.watch.notification.SimpleNotificationProto;
import com.heytap.health.watch.notification.WeChatLoginStatus;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\f\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\f\u001a\u0004\u0018\u00010\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/exc;", "", "", "data", "Lcom/heytap/health/watch/notification/NotificationRemoved;", b2n.g, "Lcom/heytap/health/watch/notification/BleNotificationRemoved;", "i", "Lcom/heytap/health/watch/notification/NotificationReply;", "j", "Lcom/heytap/health/watch/notification/BleNotificationReply;", MapSchema.FIELD_NAME_KEY, "value", "Lcom/heytap/health/watch/notification/BleNotificationNeedIcon;", "c", "Lcom/heytap/health/watch/notification/WeChatLoginStatus;", LogFieldKey.LEVEL_KEY, "Lcom/heytap/health/watch/notification/DismissNotificationProto;", "b", "Lcom/heytap/health/watch/notification/ReSyncNotificationProto;", b2n.f, "Lcom/heytap/health/watch/notification/SimpleNotificationProto;", "d", "", "f", "Lcom/heytap/health/watch/notification/ParsedNotificationActionProto;", "a", "", MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class exc {

    @NotNull
    public static final exc INSTANCE = new exc();

    @Nullable
    public final ParsedNotificationActionProto a(@Nullable byte[] value) {
        try {
            return ParsedNotificationActionProto.parseFrom(value);
        } catch (InvalidProtocolBufferException e2) {
            a7b.b("NTF_NotificationPbParser", "[parseActionIntent] --> " + e2.getMessage());
            return null;
        }
    }

    @Nullable
    public final DismissNotificationProto b(@Nullable byte[] value) {
        try {
            return DismissNotificationProto.parseFrom(value);
        } catch (InvalidProtocolBufferException e2) {
            a7b.b("NTF_NotificationPbParser", "[onMessageReceived] --> " + e2.getMessage());
            return null;
        }
    }

    @Nullable
    public final BleNotificationNeedIcon c(@Nullable byte[] value) {
        try {
            return BleNotificationNeedIcon.parseFrom(value);
        } catch (InvalidProtocolBufferException unused) {
            a7b.b("NTF_NotificationPbParser", "note: protocol buffer parse exception");
            return null;
        }
    }

    @Nullable
    public final SimpleNotificationProto d(@Nullable byte[] value) {
        try {
            return SimpleNotificationProto.parseFrom(value);
        } catch (InvalidProtocolBufferException e2) {
            a7b.b("NTF_NotificationPbParser", "[parseIconDelete] --> " + e2.getMessage());
            return null;
        }
    }

    public final int e(@Nullable byte[] value) {
        try {
            return CloudStatus.parseFrom(value).getStatus();
        } catch (InvalidProtocolBufferException e2) {
            a7b.b("NTF_NotificationPbParser", "[parseIntStatus] --> " + e2.getMessage());
            return 0;
        }
    }

    @Nullable
    public final String f(@Nullable byte[] value) {
        try {
            return ParsedNotificationProto.parseFrom(value).getContentIntentId();
        } catch (InvalidProtocolBufferException e2) {
            a7b.b("NTF_NotificationPbParser", "[parseOpenOnPhone] --> " + e2.getMessage());
            return null;
        }
    }

    @Nullable
    public final ReSyncNotificationProto g(@Nullable byte[] value) {
        try {
            return ReSyncNotificationProto.parseFrom(value);
        } catch (InvalidProtocolBufferException e2) {
            a7b.b("NTF_NotificationPbParser", "[parseReSync] --> " + e2.getMessage());
            return null;
        }
    }

    @Nullable
    public final NotificationRemoved h(@Nullable byte[] data) {
        try {
            return NotificationRemoved.parseFrom(data);
        } catch (InvalidProtocolBufferException unused) {
            a7b.b("NTF_NotificationPbParser", "note: protocol buffer parse exception!");
            return null;
        }
    }

    @Nullable
    public final BleNotificationRemoved i(@Nullable byte[] data) {
        try {
            return BleNotificationRemoved.parseFrom(data);
        } catch (InvalidProtocolBufferException unused) {
            a7b.b("NTF_NotificationPbParser", "note: protocol buffer parse exception!");
            return null;
        }
    }

    @Nullable
    public final NotificationReply j(@Nullable byte[] data) {
        try {
            return NotificationReply.parseFrom(data);
        } catch (InvalidProtocolBufferException unused) {
            a7b.b("NTF_NotificationPbParser", "note: protocol buffer parse exception");
            return null;
        }
    }

    @Nullable
    public final BleNotificationReply k(@Nullable byte[] data) {
        try {
            return BleNotificationReply.parseFrom(data);
        } catch (InvalidProtocolBufferException unused) {
            a7b.b("NTF_NotificationPbParser", "note: protocol buffer parse exception");
            return null;
        }
    }

    @Nullable
    public final WeChatLoginStatus l(@Nullable byte[] value) {
        try {
            return WeChatLoginStatus.parseFrom(value);
        } catch (InvalidProtocolBufferException unused) {
            a7b.b("NTF_NotificationPbParser", "note: protocol buffer parse exception");
            return null;
        }
    }
}

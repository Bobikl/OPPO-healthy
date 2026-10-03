package com.heytap.health.base.notification;

import android.content.Context;
import com.heytap.health.base.R$string;
import com.oplus.aiunit.vision.ChannelConfig;
import com.oplus.aiunit.vision.b78;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u000b\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\u0003\u0010\nR\u001b\u0010\u000f\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000e\u0010\nR\u001b\u0010\u0011\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\u0010\u0010\nR\u001b\u0010\u0012\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\f\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/base/notification/NotificationConfig;", "", "Landroid/content/Context;", "a", "Lkotlin/Lazy;", "b", "()Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/b73;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/oplus/aiunit/vision/b73;", "safeGuard", "c", "chargeEvent", "d", "notifyModule", "f", "sleepBusiness", "healthArchivesBusiness", "<init>", "()V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class NotificationConfig {

    @NotNull
    public static final NotificationConfig INSTANCE = new NotificationConfig();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy context = LazyKt__LazyJVMKt.lazy(new Function0<Context>() { // from class: com.heytap.health.base.notification.NotificationConfig$context$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        public final Context invoke() {
            return b78.a();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy safeGuard = LazyKt__LazyJVMKt.lazy(new Function0<ChannelConfig>() { // from class: com.heytap.health.base.notification.NotificationConfig$safeGuard$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ChannelConfig invoke() {
            String string = NotificationConfig.INSTANCE.b().getString(R$string.lib_base_channel_safe_guard_notify);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…hannel_safe_guard_notify)");
            return new ChannelConfig("safe_guard", string, new Integer[]{100001, 100002});
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy chargeEvent = LazyKt__LazyJVMKt.lazy(new Function0<ChannelConfig>() { // from class: com.heytap.health.base.notification.NotificationConfig$chargeEvent$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ChannelConfig invoke() {
            String string = NotificationConfig.INSTANCE.b().getString(R$string.lib_base_channel_charge_event);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ase_channel_charge_event)");
            return new ChannelConfig("charge_event", string, new Integer[]{200001, 200002, 200003});
        }
    });

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public static final Lazy notifyModule = LazyKt__LazyJVMKt.lazy(new Function0<ChannelConfig>() { // from class: com.heytap.health.base.notification.NotificationConfig$notifyModule$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ChannelConfig invoke() {
            String string = NotificationConfig.INSTANCE.b().getString(R$string.lib_base_device_notification);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…base_device_notification)");
            return new ChannelConfig("device_notification", string, new Integer[]{300001});
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy sleepBusiness = LazyKt__LazyJVMKt.lazy(new Function0<ChannelConfig>() { // from class: com.heytap.health.base.notification.NotificationConfig$sleepBusiness$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ChannelConfig invoke() {
            String string = NotificationConfig.INSTANCE.b().getString(R$string.lib_base_sleep_business_notification1);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…p_business_notification1)");
            return new ChannelConfig("sleep_business_notification", string, new Integer[]{400001});
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Lazy healthArchivesBusiness = LazyKt__LazyJVMKt.lazy(new Function0<ChannelConfig>() { // from class: com.heytap.health.base.notification.NotificationConfig$healthArchivesBusiness$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ChannelConfig invoke() {
            String string = NotificationConfig.INSTANCE.b().getString(R$string.lib_base_health_archives_busniess_notification);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…es_busniess_notification)");
            return new ChannelConfig("ai_health_archives_notification", string, new Integer[]{500001});
        }
    });

    @NotNull
    public final ChannelConfig a() {
        return (ChannelConfig) chargeEvent.getValue();
    }

    @NotNull
    public final Context b() {
        Object value = context.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-context>(...)");
        return (Context) value;
    }

    @NotNull
    public final ChannelConfig c() {
        return (ChannelConfig) healthArchivesBusiness.getValue();
    }

    @NotNull
    public final ChannelConfig d() {
        return (ChannelConfig) notifyModule.getValue();
    }

    @NotNull
    public final ChannelConfig e() {
        return (ChannelConfig) safeGuard.getValue();
    }

    @NotNull
    public final ChannelConfig f() {
        return (ChannelConfig) sleepBusiness.getValue();
    }
}

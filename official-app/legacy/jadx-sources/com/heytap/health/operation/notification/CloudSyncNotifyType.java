package com.heytap.health.operation.notification;

import com.heytap.health.operation.R$string;
import com.oplus.aiunit.vision.CloudSyncNotifyConfig;
import com.oplus.aiunit.vision.hq8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/operation/notification/CloudSyncNotifyType;", "", "Lcom/oplus/aiunit/vision/lj3;", "config", "Lcom/oplus/aiunit/vision/lj3;", "getConfig", "()Lcom/oplus/aiunit/vision/lj3;", "<init>", "(Ljava/lang/String;ILcom/oplus/aiunit/vision/lj3;)V", "Companion", "a", "COMMUNITY", "OPERATION_ACTIVITY", "QUESTIONNAIRE", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
public enum CloudSyncNotifyType {
    COMMUNITY(new CloudSyncNotifyConfig("community_notify", hq8.SP_COMMUNITY_STATUS_NOTIFY, "community", R$string.operation_notify_manager_community_title, R$string.operation_notify_manager_community_content, false, 32, null)),
    OPERATION_ACTIVITY(new CloudSyncNotifyConfig("operation_activity_notify", hq8.SP_OPERATION_ACTIVITY_STATUS_NOTIFY, "push_notices_operation_activity", R$string.operation_notify_manager_operation_activity_title, R$string.operation_notify_manager_operation_activity_content, false, 32, null)),
    QUESTIONNAIRE(new CloudSyncNotifyConfig("questionnaire_notify", hq8.SP_QUESTIONNAIRE_STATUS_NOTIFY, "push_notices_questionnaire", R$string.operation_notify_manager_questionnaire_title, R$string.operation_notify_manager_questionnaire_content, false, 32, null));


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final CloudSyncNotifyConfig config;

    /* JADX INFO: renamed from: com.heytap.health.operation.notification.CloudSyncNotifyType$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/heytap/health/operation/notification/CloudSyncNotifyType$a;", "", "", "itemId", "Lcom/heytap/health/operation/notification/CloudSyncNotifyType;", "b", "cloudKey", "a", "<init>", "()V", "operation_impl_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCloudSyncNotifyConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudSyncNotifyConfig.kt\ncom/heytap/health/operation/notification/CloudSyncNotifyType$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final CloudSyncNotifyType a(@NotNull String cloudKey) {
            Intrinsics.checkNotNullParameter(cloudKey, "cloudKey");
            for (CloudSyncNotifyType cloudSyncNotifyType : CloudSyncNotifyType.values()) {
                if (Intrinsics.areEqual(cloudSyncNotifyType.getConfig().getCloudKey(), cloudKey)) {
                    return cloudSyncNotifyType;
                }
            }
            return null;
        }

        @Nullable
        public final CloudSyncNotifyType b(@NotNull String itemId) {
            Intrinsics.checkNotNullParameter(itemId, "itemId");
            for (CloudSyncNotifyType cloudSyncNotifyType : CloudSyncNotifyType.values()) {
                if (Intrinsics.areEqual(cloudSyncNotifyType.getConfig().getId(), itemId)) {
                    return cloudSyncNotifyType;
                }
            }
            return null;
        }
    }

    CloudSyncNotifyType(CloudSyncNotifyConfig cloudSyncNotifyConfig) {
        this.config = cloudSyncNotifyConfig;
    }

    @NotNull
    public final CloudSyncNotifyConfig getConfig() {
        return this.config;
    }
}

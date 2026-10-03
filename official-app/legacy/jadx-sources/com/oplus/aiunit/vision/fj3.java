package com.oplus.aiunit.vision;

import com.heytap.health.watch.notification.impl.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0014\u0010\u0001\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0014\u0010\b\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0002\"\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"", "CONNECT_BY_BT", "I", "CONNECT_BY_BT_STUB", "CONNECT_PHONE_NO_NET", "CONNECT_CHECKING", "CONNECT_BY_NET_ERROR", "CONNECT_BY_NET", "CONNECT_WARNING", "CONNECT_HEAD", "", "Lcom/oplus/aiunit/vision/dj3;", "a", "Ljava/util/List;", "()Ljava/util/List;", "CLOUD_STATUS_CONFIG_LIST", "device_notification_impl2_release"}, k = 2, mv = {1, 8, 0})
public final class fj3 {
    public static final int CONNECT_BY_BT = 0;
    public static final int CONNECT_BY_BT_STUB = 5;
    public static final int CONNECT_BY_NET = 1;
    public static final int CONNECT_BY_NET_ERROR = 3;
    public static final int CONNECT_CHECKING = 2;
    public static final int CONNECT_HEAD = 7;
    public static final int CONNECT_PHONE_NO_NET = 4;
    public static final int CONNECT_WARNING = 6;

    @NotNull
    public static final List<CloudStatus> a;

    static {
        int i = R$string.settings_cloud_notification_device_status;
        a = CollectionsKt__CollectionsKt.listOf((Object[]) new CloudStatus[]{new CloudStatus(7, i, i), new CloudStatus(0, R$string.settings_cloud_notification_status_1_title, R$string.settings_cloud_notification_status_1_desc), new CloudStatus(1, R$string.settings_cloud_notification_status_2_title, R$string.settings_cloud_notification_status_2_desc), new CloudStatus(2, R$string.settings_cloud_notification_status_3_title, R$string.settings_cloud_notification_status_3_desc), new CloudStatus(3, R$string.settings_cloud_notification_status_4_title, R$string.settings_cloud_notification_status_4_desc), new CloudStatus(4, R$string.settings_cloud_notification_status_5_title, R$string.settings_cloud_notification_status_5_desc), new CloudStatus(5, R$string.settings_cloud_notification_status_6_title, R$string.settings_cloud_notification_status_6_desc), new CloudStatus(6, R$string.settings_cloud_notification_status_7_title, R$string.settings_cloud_notification_status_7_desc)});
    }

    @NotNull
    public static final List<CloudStatus> a() {
        return a;
    }
}

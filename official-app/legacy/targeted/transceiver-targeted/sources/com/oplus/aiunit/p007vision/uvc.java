package com.oplus.aiunit.p007vision;

import android.os.Bundle;
import com.heytap.health.watch.notification.HealthNotificationBean;
import com.heytap.health.watch.notification.impl.transceiver.WeChatConfig;
import com.oplus.aiunit.vision.n7a;
import com.oplus.backup.sdk.common.utils.Constants;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\dex\classes19.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0018\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0004R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/uvc;", "", "Lcom/oplus/wearable/linkservice/sdk/Node;", "node", "", "h", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "hnb", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "c", "Landroid/os/Bundle;", "watchPush", "d", "a", "b", "e", "Lcom/heytap/health/watch/notification/impl/transceiver/WeChatConfig;", Constants.MessagerConstants.CONFIG_KEY, "f", "g", "Lcom/oplus/aiunit/vision/oa4;", "Lcom/oplus/aiunit/vision/oa4;", "worker", "<init>", "()V", "Companion", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class uvc {
    public static final int BIG_PICTURE_HEIGHT = 208;
    public static final int BIG_PICTURE_WIDTH = 320;
    public static final int MAX_BLE_CONTENT_LENGTH = 300;
    public static final int MAX_BLE_LENGTH = 30;
    public static final int MAX_SIZE = 8192;

    @NotNull
    public static final String PIC_TYPE_BIG = "_big_picture";

    @NotNull
    public static final String PIC_TYPE_D19 = "_D19";

    @NotNull
    public static final String PIC_TYPE_D20 = "_D20";

    @NotNull
    public static final String PIC_TYPE_LARGE = "_large";

    @NotNull
    public static final String PIC_TYPE_LARGE_144 = "_large_144";

    @NotNull
    public static final String TAG = "NTF_EventConverter";

    @NotNull
    public static final String WECHAT_VOICE = ".voice";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public oa4 worker;

    @Nullable
    public final MessageEvent a(@NotNull HealthNotificationBean hnb, @NotNull Bundle watchPush) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Intrinsics.checkNotNullParameter(watchPush, "watchPush");
        oa4 oa4Var = this.worker;
        if (oa4Var != null) {
            return oa4Var.g(hnb, watchPush);
        }
        return null;
    }

    @Nullable
    public final MessageEvent b(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        oa4 oa4Var = this.worker;
        if (oa4Var != null) {
            return oa4Var.j(hnb);
        }
        return null;
    }

    @Nullable
    public final MessageEvent c(@NotNull HealthNotificationBean hnb) {
        String str;
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        String strA = oa4.INSTANCE.a(hnb);
        String str2 = "";
        if (strA.length() > 0) {
            String strSubstring = strA.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            str2 = "" + strSubstring + "*\\n";
        }
        if (hnb.getTitle().length() > 0) {
            String strSubstring2 = hnb.getTitle().substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            str2 = str2 + strSubstring2 + "*";
        }
        if (hnb.getContent().length() > 0) {
            if (hnb.getContent().length() > 1) {
                String strSubstring3 = hnb.getContent().substring(0, 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                str = " : " + strSubstring3 + "********";
            } else {
                String strSubstring4 = hnb.getContent().substring(0, 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring4, "substring(...)");
                str = " : " + strSubstring4 + "********";
            }
            str2 = str2 + str;
        }
        n7a.a.d(n7a.Companion, 67, 6, str2, 0L, 0L, (String) null, 56, (Object) null);
        oa4 oa4Var = this.worker;
        if (oa4Var != null) {
            return oa4Var.a(hnb);
        }
        return null;
    }

    @Nullable
    public final MessageEvent d(@NotNull HealthNotificationBean hnb, @Nullable Bundle watchPush) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        oa4 oa4Var = this.worker;
        if (oa4Var != null) {
            return oa4Var.m(hnb, watchPush);
        }
        return null;
    }

    @Nullable
    public final MessageEvent e(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        oa4 oa4Var = this.worker;
        if (oa4Var != null) {
            return oa4Var.b(hnb);
        }
        return null;
    }

    @Nullable
    public final MessageEvent f(@NotNull HealthNotificationBean hnb, @NotNull WeChatConfig config) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Intrinsics.checkNotNullParameter(config, Constants.MessagerConstants.CONFIG_KEY);
        oa4 oa4Var = this.worker;
        if (oa4Var != null) {
            return oa4Var.n(hnb, config);
        }
        return null;
    }

    public final void g() {
        oa4 oa4Var = this.worker;
        if (oa4Var != null) {
            oa4Var.D();
        }
    }

    public final void h(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.worker = oa4.INSTANCE.j(node);
    }
}

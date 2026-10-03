package com.oplus.aiunit.p007vision;

import android.service.notification.StatusBarNotification;
import com.heytap.health.watch.notification.HealthNotificationBean;
import com.heytap.health.watch.notification.impl.transceiver.WeChatConfig;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.rl4;
import com.oplus.backup.sdk.common.utils.Constants;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\dex\classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J \u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/vhl;", "", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "hnb", "Lcom/oplus/aiunit/vision/uvc;", "converter", "", "b", "Lcom/heytap/health/watch/notification/impl/transceiver/WeChatConfig;", Constants.MessagerConstants.CONFIG_KEY, "c", "", "a", "Ljava/lang/String;", "tag", "", "J", "lastTime", "Lcom/heytap/health/watch/notification/impl/transceiver/WeChatConfig;", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class vhl {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long lastTime;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String tag = "NTF_WeChatVoice";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final WeChatConfig config = new WeChatConfig(null, false, 0, 7, null);

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/oplus/aiunit/vision/vhl$a", "Lcom/oplus/aiunit/vision/rl4$c;", "", "success", "", "code", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements rl4.c {
        public a() {
        }

        public void a(boolean success, int code) {
            a7b.f(vhl.this.tag, "sendWeChatVoiceMessage: " + success);
        }
    }

    public final void b(@NotNull HealthNotificationBean hnb, @NotNull uvc converter) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Intrinsics.checkNotNullParameter(converter, "converter");
        if (Intrinsics.areEqual(hnb.getPackageName(), k51.PKG_WECHAT) && (hnb.getOrigin() instanceof StatusBarNotification)) {
            Object origin = hnb.getOrigin();
            Intrinsics.checkNotNull(origin, "null cannot be cast to non-null type android.service.notification.StatusBarNotification");
            String str = ((StatusBarNotification) origin).getNotification().category;
            a7b.f(this.tag, "distinguish: " + hnb.getFlags() + " " + hnb.getChannelId() + " " + str);
            if (Intrinsics.areEqual(str, this.config.getCategory())) {
                c(hnb, converter, this.config);
            }
        }
    }

    public final void c(HealthNotificationBean hnb, uvc converter, WeChatConfig config) {
        com.heytap.health.watch.notification.impl.whitelist.a aVar = com.heytap.health.watch.notification.impl.whitelist.a.INSTANCE;
        boolean zK = aVar.k("main_switch");
        a7b.f(this.tag, "sendWeChatVoiceMessage: mainSwitch=" + zK);
        if (zK) {
            boolean zK2 = aVar.k(k51.PKG_WECHAT);
            a7b.f(this.tag, "sendWeChatVoiceMessage: wechat package=" + zK2);
            if (zK2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.lastTime <= 800) {
                    a7b.f(this.tag, "sendWeChatVoiceMessage: double, ignore");
                    return;
                }
                this.lastTime = jCurrentTimeMillis;
                MessageEvent messageEventF = converter.f(hnb, config);
                if (messageEventF != null) {
                    gl4.deviceMultiple.b.j(gl4.managerApi.n(), messageEventF, new a());
                }
            }
        }
    }
}

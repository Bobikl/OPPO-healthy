package com.oplus.aiunit.p007vision;

import android.content.Context;
import android.os.Bundle;
import com.heytap.health.watch.notification.BleNotificationPosted;
import com.heytap.health.watch.notification.BleNotificationRemoved;
import com.heytap.health.watch.notification.HealthNotificationBean;
import com.heytap.health.watch.notification.impl.transceiver.WeChatConfig;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.j1j;
import com.oplus.backup.sdk.common.utils.Constants;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\dex\classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0002¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/xg1;", "Lcom/oplus/aiunit/vision/oa4;", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "hnb", "Landroid/os/Bundle;", "watchPush", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "g", "j", LogFieldKey.MESSAGE_KEY, "Lcom/heytap/health/watch/notification/impl/transceiver/WeChatConfig;", Constants.MessagerConstants.CONFIG_KEY, "n", "a", "b", "", "E", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class xg1 extends oa4 {
    public final int E() {
        Context applicationContext = b78.a().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getAppContext().applicationContext");
        return mxc.INSTANCE.a(applicationContext) ? 1 : 0;
    }

    @Override // com.oplus.aiunit.p007vision.jo9
    @NotNull
    public MessageEvent a(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        BleNotificationPosted.Builder strKey = BleNotificationPosted.newBuilder().setIntId(hnb.getId()).setStrTag(j1j.b(hnb.getTag(), 30)).setIntType(u(hnb)).setStrPackageName(j1j.b(hnb.getPackageName(), 30)).setStrKey(hnb.getKey());
        oa4.Companion companion = oa4.INSTANCE;
        BleNotificationPosted bleNotificationPosted = (BleNotificationPosted) strKey.setStrTitle(j1j.b(companion.c(hnb), 30)).setStrContent(j1j.b(companion.b(hnb), uvc.MAX_BLE_CONTENT_LENGTH)).setHasRemoteInput(w(hnb)).setPostTime((int) (hnb.getPostTimeMillis() / ((long) 1000))).setIconType(0).setStrAppName(j1j.b(companion.a(hnb), 30)).setPhoneState(E()).build();
        StringBuilder sb = new StringBuilder();
        sb.append("BleConverterWorker convertPost: ");
        sb.append(bleNotificationPosted);
        return new MessageEvent(2, 1, bleNotificationPosted.toByteArray());
    }

    @Override // com.oplus.aiunit.p007vision.jo9
    @NotNull
    public MessageEvent b(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        BleNotificationRemoved bleNotificationRemoved = (BleNotificationRemoved) BleNotificationRemoved.newBuilder().setIntId(hnb.getId()).setIntType(u(hnb)).setStrTag(hnb.getTag()).setStrKey(hnb.getKey()).setStrPackageName(hnb.getPackageName()).setIsRemoveAll(0).build();
        StringBuilder sb = new StringBuilder();
        sb.append("BleConverterWorker convertRemoved: ");
        sb.append(bleNotificationRemoved);
        return new MessageEvent(2, 3, bleNotificationRemoved.toByteArray());
    }

    @Override // com.oplus.aiunit.p007vision.oa4
    @Nullable
    public MessageEvent g(@NotNull HealthNotificationBean hnb, @NotNull Bundle watchPush) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Intrinsics.checkNotNullParameter(watchPush, "watchPush");
        a7b.m("NTF_Converter", "convertFluid: not support device");
        return null;
    }

    @Override // com.oplus.aiunit.p007vision.oa4
    @Nullable
    public MessageEvent j(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        a7b.m("NTF_Converter", "convertFluidRemoved: not support device");
        return null;
    }

    @Override // com.oplus.aiunit.p007vision.oa4
    @Nullable
    public MessageEvent m(@NotNull HealthNotificationBean hnb, @Nullable Bundle watchPush) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        return a(hnb);
    }

    @Override // com.oplus.aiunit.p007vision.oa4
    @NotNull
    public MessageEvent n(@NotNull HealthNotificationBean hnb, @NotNull WeChatConfig config) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Intrinsics.checkNotNullParameter(config, Constants.MessagerConstants.CONFIG_KEY);
        BleNotificationPosted.Builder strKey = BleNotificationPosted.newBuilder().setIntId(hnb.getId()).setStrTag(j1j.b(hnb.getTag(), 30)).setIntType(u(hnb)).setStrPackageName(j1j.b(hnb.getPackageName(), 30)).setStrKey(hnb.getKey() + uvc.WECHAT_VOICE);
        oa4.Companion companion = oa4.INSTANCE;
        BleNotificationPosted bleNotificationPosted = (BleNotificationPosted) strKey.setStrTitle(j1j.b(companion.c(hnb), 30)).setStrContent(j1j.b(companion.b(hnb), uvc.MAX_BLE_CONTENT_LENGTH)).setHasRemoteInput(w(hnb)).setPostTime((int) (hnb.getPostTimeMillis() / ((long) 1000))).setIconType(0).setStrAppName(j1j.b(companion.a(hnb), 30)).setPhoneState(E()).build();
        StringBuilder sb = new StringBuilder();
        sb.append("BleConverterWorker convertWechatVoice: ");
        sb.append(bleNotificationPosted);
        return new MessageEvent(2, 1, bleNotificationPosted.toByteArray());
    }
}

package com.oplus.aiunit.p007vision;

import android.os.Bundle;
import com.google.protobuf.ByteString;
import com.heytap.health.watch.notification.HealthNotificationBean;
import com.heytap.health.watch.notification.NTFCmdId2;
import com.heytap.health.watch.notification.NotificationPosted;
import com.heytap.health.watch.notification.NotificationRemoved;
import com.heytap.health.watch.notification.WechatMessage;
import com.heytap.health.watch.notification.impl.R$string;
import com.heytap.health.watch.notification.impl.fluid.FluidConfigCenter;
import com.heytap.health.watch.notification.impl.transceiver.WeChatConfig;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.evc;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ra5;
import com.oplus.backup.sdk.common.utils.Constants;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\dex\classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/puc;", "Lcom/oplus/aiunit/vision/oa4;", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "hnb", "Landroid/os/Bundle;", "watchPush", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "g", "j", LogFieldKey.MESSAGE_KEY, "Lcom/heytap/health/watch/notification/impl/transceiver/WeChatConfig;", Constants.MessagerConstants.CONFIG_KEY, "n", "a", "b", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class puc extends oa4 {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"com/oplus/aiunit/vision/puc$a", "Lcom/oplus/aiunit/vision/na4;", "Lcom/google/protobuf/ByteString;", "str", "", "bytes", "", "width", "height", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements na4 {
        public final /* synthetic */ NotificationPosted.Builder a;

        public a(NotificationPosted.Builder builder) {
            this.a = builder;
        }

        @Override // com.oplus.aiunit.p007vision.na4
        public void a(@Nullable ByteString str, @Nullable byte[] bytes, int width, int height) {
            if (bytes != null) {
                NotificationPosted.Builder builder = this.a;
                if (!(bytes.length == 0)) {
                    builder.setByteLargeIcon(ByteString.copyFrom(bytes));
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¨\u0006\u000b"}, d2 = {"com/oplus/aiunit/vision/puc$b", "Lcom/oplus/aiunit/vision/na4;", "Lcom/google/protobuf/ByteString;", "str", "", "bytes", "", "width", "height", "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements na4 {
        public final /* synthetic */ NotificationPosted.Builder a;

        public b(NotificationPosted.Builder builder) {
            this.a = builder;
        }

        @Override // com.oplus.aiunit.p007vision.na4
        public void a(@Nullable ByteString str, @Nullable byte[] bytes, int width, int height) {
            if (bytes != null) {
                NotificationPosted.Builder builder = this.a;
                if (!(bytes.length == 0)) {
                    builder.setByteLargeIcon(ByteString.copyFrom(bytes));
                }
            }
        }
    }

    @Override // com.oplus.aiunit.p007vision.jo9
    @NotNull
    public MessageEvent a(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        if (hnb.getTitle().length() > 0) {
            if (hnb.getContent().length() == 0) {
                hnb.setContent(hnb.getTitle());
            }
        }
        if (hnb.getTitle().length() == 0) {
            if (hnb.getContent().length() > 0) {
                hnb.setTitle(hnb.getContent());
            }
        }
        NotificationPosted.Builder strKey = NotificationPosted.newBuilder().setIntId(hnb.getId()).setStrTag(hnb.getTag()).setIntType(u(hnb)).setLPostTime(hnb.getPostTimeMillis()).setStrPackageName(hnb.getPackageName()).setStrKey(hnb.getKey());
        oa4.Companion companion = oa4.INSTANCE;
        NotificationPosted.Builder strAppName = strKey.setStrTitle(companion.c(hnb)).setStrContent(companion.b(hnb)).setStrSubContent(hnb.getSubText()).setHasRemoteInput(w(hnb)).setStrFrom(n04.PREFIX_STR_ANDROID).setStrAppName(companion.a(hnb));
        r(false, hnb, new a(strAppName));
        NotificationPosted notificationPosted = (NotificationPosted) strAppName.build();
        StringBuilder sb = new StringBuilder();
        sb.append("NormalConverterWorker convertPost: ");
        sb.append(notificationPosted);
        return new MessageEvent(2, 1, notificationPosted.toByteArray());
    }

    @Override // com.oplus.aiunit.p007vision.jo9
    @NotNull
    public MessageEvent b(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        NotificationRemoved notificationRemoved = (NotificationRemoved) NotificationRemoved.newBuilder().setIntId(hnb.getId()).setStrKey(hnb.getKey()).build();
        StringBuilder sb = new StringBuilder();
        sb.append("NormalConverterWorker convertRemoved: ");
        sb.append(notificationRemoved);
        return new MessageEvent(2, 3, notificationRemoved.toByteArray());
    }

    @Override // com.oplus.aiunit.p007vision.oa4
    @Nullable
    public MessageEvent g(@NotNull HealthNotificationBean hnb, @NotNull Bundle watchPush) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Intrinsics.checkNotNullParameter(watchPush, "watchPush");
        if (!evc.a(gl4.managerApi.q(ra5.a.INSTANCE)).n8() || FluidConfigCenter.INSTANCE.p().contains(hnb.getPackageName())) {
            return i(hnb, watchPush);
        }
        a7b.m("NTF_Converter", "band2 not support: " + hnb.getPackageName());
        return null;
    }

    @Override // com.oplus.aiunit.p007vision.oa4
    @NotNull
    public MessageEvent j(@NotNull HealthNotificationBean hnb) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        return l(hnb);
    }

    @Override // com.oplus.aiunit.p007vision.oa4
    @NotNull
    public MessageEvent m(@NotNull HealthNotificationBean hnb, @Nullable Bundle watchPush) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        return a(hnb);
    }

    @Override // com.oplus.aiunit.p007vision.oa4
    @NotNull
    public MessageEvent n(@NotNull HealthNotificationBean hnb, @NotNull WeChatConfig config) {
        Intrinsics.checkNotNullParameter(hnb, "hnb");
        Intrinsics.checkNotNullParameter(config, Constants.MessagerConstants.CONFIG_KEY);
        if (evc.a(gl4.managerApi.q(ra5.a.INSTANCE)).N1()) {
            WechatMessage.Builder builderNewBuilder = WechatMessage.newBuilder();
            builderNewBuilder.setTitle(hnb.getContent());
            builderNewBuilder.setContent(b78.a().getString(R$string.notification_wechat_voice_content));
            builderNewBuilder.setVibrateDuration(config.getVibrateDuration());
            builderNewBuilder.setCanSlideOut(config.getCanSlideOut());
            WechatMessage wechatMessage = (WechatMessage) builderNewBuilder.build();
            StringBuilder sb = new StringBuilder();
            sb.append("convertWechatVoice: ");
            sb.append(wechatMessage);
            return new MessageEvent(2, NTFCmdId2.CID_WECHAT_VOICE_MSG_VALUE, wechatMessage.toByteArray());
        }
        NotificationPosted.Builder strKey = NotificationPosted.newBuilder().setIntId(hnb.getId()).setStrTag(hnb.getTag()).setIntType(u(hnb)).setLPostTime(hnb.getPostTimeMillis()).setStrPackageName(hnb.getPackageName() + uvc.WECHAT_VOICE).setStrKey(hnb.getKey() + uvc.WECHAT_VOICE);
        oa4.Companion companion = oa4.INSTANCE;
        NotificationPosted.Builder strAppName = strKey.setStrTitle(companion.b(hnb)).setStrContent(b78.a().getString(R$string.notification_wechat_voice_content)).setStrSubContent(hnb.getSubText()).setHasRemoteInput(false).setStrFrom(n04.PREFIX_STR_ANDROID).setStrAppName(companion.a(hnb));
        r(false, hnb, new b(strAppName));
        NotificationPosted notificationPosted = (NotificationPosted) strAppName.build();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("NormalConverterWorker convertWechatVoice: ");
        sb2.append(notificationPosted);
        return new MessageEvent(2, 1, notificationPosted.toByteArray());
    }
}

package com.heytap.health.watch.thirdparty;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.protocol.device_breeno.DeviceBreenoProto$BreenoSkillCmd;
import com.heytap.health.watch.thirdparty.ThirdPartyPresenter;
import com.heytap.wearable.oms.base.IWearableServicePresenter;
import com.heytap.wearable.oms.base.node.NodeManager;
import com.heytap.wearable.oms.internal.NodeParcelable;
import com.oplus.aiunit.vision.dwj;
import com.oplus.aiunit.vision.f5h;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.o6h;
import com.oplus.aiunit.vision.ol4;
import com.oplus.aiunit.vision.ovj;
import com.oplus.aiunit.vision.rl4;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.ugl;
import com.oplus.aiunit.vision.x5h;
import com.oplus.ocs.wearengine.bean.BatteryInfoParcelable;
import com.oplus.ocs.wearengine.bean.DeviceListParcelable;
import com.oplus.ocs.wearengine.bean.DeviceModuleParcelable;
import com.oplus.ocs.wearengine.bean.PermissionResultParcelable;
import com.oplus.ocs.wearengine.bean.SendFileInfoParcelable;
import com.oplus.ocs.wearengine.common.Status;
import com.oplus.ocs.wearengine.p2pclient.file.SendFileRequest;
import com.oplus.ocs.wearengine.proto.WearEngineProto$WEMessage;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public class ThirdPartyPresenter extends IWearableServicePresenter {
    private static final String APP_PACKAGE_NAME = "com.coloros.findmyphone";
    private static final String APP_PACKAGE_NAME2 = "com.realme.findphone.client2";
    public static final String CMD_CLOSE = "关闭查找功能";
    public static final String CMD_OPEN = "开启查找功能";
    public static final int OTA2_VERSION = 43;
    public static final int OTA3_VERSION = 48;
    public static final String TAG = "ThirdPartyPresenter";
    public static final String TICKET = "ticket";
    public static final String TICKET_CLOSE = "\"ticket\":\"AAAABBBBCCCC\"";
    public static final String TOKEN = "token";

    @SuppressLint({"CheckResult"})
    private int fixFindInDormant(@NonNull String str, @NonNull String str2, @NotNull final MessageEvent messageEvent) {
        if (!TextUtils.equals(APP_PACKAGE_NAME, str) && !TextUtils.equals(APP_PACKAGE_NAME2, str)) {
            ml4.d(TAG, "[fixFindInDormant] --> not find msg, no need to fix");
            return 0;
        }
        ol4 ol4Var = gl4.managerApi;
        if (!dwj.a(ol4Var.getCurrentConnectId()).P0()) {
            return 0;
        }
        UserDeviceInfo userDeviceInfoJ = ol4Var.j();
        if (userDeviceInfoJ == null) {
            ml4.e(TAG, "[fixFindInDormant] --> connectedDeviceInfo==null");
            return 0;
        }
        String firmwareVersion = userDeviceInfoJ.getFirmwareVersion();
        if (ugl.e(firmwareVersion, 48)) {
            return 48;
        }
        if (ugl.e(firmwareVersion, 43)) {
            return 43;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        f5h.e(new o6h() { // from class: com.oplus.aiunit.vision.rvj
            @Override // com.oplus.aiunit.vision.o6h
            public final void a(x5h x5hVar) throws Throwable {
                ThirdPartyPresenter.lambda$fixFindInDormant$1(messageEvent, x5hVar);
            }
        }).y(su8.c()).s(su8.c()).w(new o14() { // from class: com.oplus.aiunit.vision.svj
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                ThirdPartyPresenter.lambda$fixFindInDormant$2((Boolean) obj);
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.tvj
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                ThirdPartyPresenter.lambda$fixFindInDormant$3((Throwable) obj);
            }
        });
        try {
            countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            ml4.c(TAG, "[sendMessage] --> " + e2.getMessage());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fixFindInDormant$0(x5h x5hVar, boolean z, int i) {
        if (z) {
            x5hVar.onSuccess(Boolean.TRUE);
        } else {
            x5hVar.onSuccess(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fixFindInDormant$1(MessageEvent messageEvent, final x5h x5hVar) throws Throwable {
        String str = new String(WearEngineProto$WEMessage.parseFrom(messageEvent.getData()).getBody().getData().toByteArray());
        ml4.a(TAG, "[fixFindInDormant] --> " + str);
        if (str.contains("token") && str.contains(TICKET)) {
            String str2 = str.contains(TICKET_CLOSE) ? CMD_OPEN : CMD_CLOSE;
            ml4.d(TAG, "[sendMessage] --> force wake, send to watch");
            gl4.devicePrimary.messageApi.e(new MessageEvent(19, 2, DeviceBreenoProto$BreenoSkillCmd.newBuilder().setCmd(str2).build().toByteArray()), new rl4.c() { // from class: com.oplus.aiunit.vision.uvj
                @Override // com.oplus.aiunit.vision.rl4.c
                public final void a(boolean z, int i) {
                    ThirdPartyPresenter.lambda$fixFindInDormant$0(x5hVar, z, i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fixFindInDormant$2(Boolean bool) throws Throwable {
        ml4.d(TAG, "[fixFindInDormant] --> send force finish, " + bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$fixFindInDormant$3(Throwable th) throws Throwable {
        ml4.c(TAG, "[fixFindInDormant] --> send force error," + th.getMessage());
    }

    @Override // com.heytap.wearable.oms.base.IWearableServicePresenter, com.oplus.aiunit.vision.rx9
    @NonNull
    public Status cancelFile(@NonNull String str) {
        return null;
    }

    @Override // com.heytap.wearable.oms.base.IWearableServicePresenter, com.oplus.aiunit.vision.rx9
    @NonNull
    public PermissionResultParcelable checkPermission(@NonNull String str, @NonNull String[] strArr) {
        return null;
    }

    @Override // com.heytap.wearable.oms.base.IWearableServicePresenter, com.oplus.aiunit.vision.rx9
    @NonNull
    public BatteryInfoParcelable getBatteryInfo(@NonNull String str) {
        return null;
    }

    @Override // com.heytap.wearable.oms.base.IWearableServicePresenter, com.oplus.aiunit.vision.rx9
    @NonNull
    public DeviceListParcelable getBindDeviceList(@NonNull String str) {
        return null;
    }

    @Override // com.heytap.wearable.oms.base.IWearableServicePresenter, com.oplus.aiunit.vision.rx9
    @NonNull
    public DeviceModuleParcelable getDeviceModule(@NonNull String str) {
        return null;
    }

    @Override // com.heytap.wearable.oms.base.IWearableServicePresenter
    @NotNull
    public NodeParcelable getNode() {
        return NodeManager.d().e();
    }

    @Override // com.heytap.wearable.oms.base.IWearableServicePresenter, com.oplus.aiunit.vision.rx9
    public boolean isPermissionGranted(@NonNull String str, @NonNull String[] strArr) {
        return false;
    }

    @Override // com.heytap.wearable.oms.base.IWearableServicePresenter, com.oplus.aiunit.vision.rx9
    public void receiveFile(@NonNull String str, @Nullable String str2) {
    }

    @Override // com.heytap.wearable.oms.base.IWearableServicePresenter, com.oplus.aiunit.vision.rx9
    public void rejectFile(@NonNull String str) {
    }

    @Override // com.heytap.wearable.oms.base.IWearableServicePresenter, com.oplus.aiunit.vision.rx9
    @NonNull
    public Status requestPermission(@NonNull String str, int i, @NonNull String[] strArr, @NonNull String str2) {
        return null;
    }

    @Override // com.heytap.wearable.oms.base.IWearableServicePresenter, com.oplus.aiunit.vision.rx9
    @NonNull
    public SendFileInfoParcelable sendFile(@NonNull SendFileRequest sendFileRequest) {
        return null;
    }

    @Override // com.heytap.wearable.oms.base.IWearableServicePresenter, com.oplus.aiunit.vision.rx9
    @NonNull
    public com.heytap.wearable.oms.common.Status sendMessage(@NonNull String str, @NotNull String str2, @NotNull MessageEvent messageEvent) {
        MessageEvent messageEvent2;
        int iFixFindInDormant = fixFindInDormant(str, str2, messageEvent);
        if (iFixFindInDormant >= 43) {
            if (messageEvent.getCommandId() == 1) {
                ml4.d(TAG, "[sendMessage] --> OTA2 version, replace cid1>5");
                messageEvent = new MessageEvent(messageEvent.getServiceId(), 5, messageEvent.getData());
            }
            if (iFixFindInDormant >= 48 && messageEvent.getCommandId() == 3) {
                ml4.d(TAG, "[sendMessage] --> OTA3version, replace cid3>7");
                messageEvent2 = new MessageEvent(messageEvent.getServiceId(), 7, messageEvent.getData());
                messageEvent = messageEvent2;
            }
        } else if (TextUtils.equals(APP_PACKAGE_NAME, str) || TextUtils.equals(APP_PACKAGE_NAME2, str)) {
            if (messageEvent.getCommandId() == 1) {
                ml4.d(TAG, "[sendMessage] --> replace cid1>5");
                messageEvent = new MessageEvent(messageEvent.getServiceId(), 5, messageEvent.getData());
            }
            if (messageEvent.getCommandId() == 3) {
                ml4.d(TAG, "[sendMessage] --> replace cid3>7");
                messageEvent2 = new MessageEvent(messageEvent.getServiceId(), 7, messageEvent.getData());
                messageEvent = messageEvent2;
            }
        }
        return ovj.d().f(messageEvent);
    }
}

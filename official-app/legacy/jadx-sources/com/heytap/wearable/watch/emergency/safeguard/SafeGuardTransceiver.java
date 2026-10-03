package com.heytap.wearable.watch.emergency.safeguard;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.dcg;
import com.oplus.aiunit.vision.mc7;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Route(path = "/emergency_impl/SafeGuardTransceiver")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/SafeGuardTransceiver;", "Lcom/heytap/health/devicemanager/client/impl/arouter/DMIMessageHandler;", "", "macAddress", "Lcom/oplus/aiunit/vision/mc7;", "fileTaskInfo", "", "onProgressChanged", "onTransferCompleted", "nodeId", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "onMessageReceived", "i", "Ljava/lang/String;", "tag", "Lcom/oplus/aiunit/vision/dcg;", "j", "Lcom/oplus/aiunit/vision/dcg;", EngineConstant.TIPS_TYPE_PROCESSOR, "<init>", "()V", "emergency_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SafeGuardTransceiver extends DMIMessageHandler {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String tag = "HSG_Transceiver";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dcg processor = new dcg();

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onMessageReceived(@NotNull String nodeId, @NotNull MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(nodeId, "nodeId");
        Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if (46 != messageEvent.getServiceId()) {
            a7b.m(this.tag, "onMessageReceived: not safe guard message");
            return;
        }
        int commandId = messageEvent.getCommandId();
        byte[] data = messageEvent.getData();
        a7b.f(this.tag, "SafeGuardTransceiver, onMessageReceived: cid=" + commandId);
        if (commandId == 8) {
            this.processor.j(data);
            return;
        }
        if (commandId == 13) {
            this.processor.q(data);
        } else if (commandId == 10) {
            this.processor.p(data);
        } else {
            if (commandId != 11) {
                return;
            }
            this.processor.h();
        }
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onProgressChanged(@NotNull String macAddress, @NotNull mc7 fileTaskInfo) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
        a7b.f(this.tag, "onProgressChanged " + fileTaskInfo.b() + " " + fileTaskInfo.f());
    }

    @Override // com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler
    public void onTransferCompleted(@NotNull String macAddress, @NotNull mc7 fileTaskInfo) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
        a7b.f(this.tag, "onTransferCompleted: " + fileTaskInfo.b());
        dcg dcgVar = this.processor;
        String strH = fileTaskInfo.h();
        Intrinsics.checkNotNullExpressionValue(strH, "fileTaskInfo.taskId");
        dcgVar.i(macAddress, strH);
    }
}

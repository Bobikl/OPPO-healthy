package com.heytap.device.data.sporthealth.receive;

import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.health.cardiovascular.CardiovascularService;
import com.heytap.health.protocol.fitness.FitnessProto$TypeRequest;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.x0;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/heytap/device/data/sporthealth/receive/c;", "Lcom/heytap/device/data/sporthealth/receive/j;", "", "Lcom/heytap/device/data/sporthealth/receive/j$a;", "t", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "", "onMessageReceived", "i", "Ljava/lang/String;", "TAG", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class c implements j {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "CardiovasProcess";

    @Override // com.oplus.aiunit.vision.rl4.b
    public void onMessageReceived(@NotNull String mac, @NotNull MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        try {
            FitnessProto$TypeRequest from = FitnessProto$TypeRequest.parseFrom(messageEvent.getData());
            a7b.f(this.TAG, "OnMessageReceived type=" + from.getType());
            Object objNavigation = x0.d().b("/cardiovascular/CardiovascularService").navigation();
            Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.health.health.cardiovascular.CardiovascularService");
            CardiovascularService cardiovascularService = (CardiovascularService) objNavigation;
            int type = from.getType();
            if (type == 1) {
                cardiovascularService.q9();
            } else if (type == 2) {
                cardiovascularService.l5();
            }
        } catch (InvalidProtocolBufferException e2) {
            a7b.b(this.TAG, "Parse cardiovascular prepare state msg fail=" + e2);
        }
    }

    @Override // com.heytap.device.data.sporthealth.receive.j
    @NotNull
    public List<j.a> t() {
        return CollectionsKt__CollectionsJVMKt.listOf(j.a.a(5, 109));
    }
}

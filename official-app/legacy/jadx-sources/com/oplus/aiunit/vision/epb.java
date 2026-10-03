package com.oplus.aiunit.vision;

import com.heytap.wearable.btnet.proto.FileUploadPreRequest;
import com.heytap.wearable.btnet.proto.FileUploadResponse;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/epb;", "Lcom/oplus/aiunit/vision/rl4$b;", "", "a", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "onMessageReceived", "", "requestId", "b", "TAG", "Ljava/lang/String;", "<init>", "()V", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
public final class epb implements rl4.b {

    @NotNull
    public static final epb INSTANCE;

    @NotNull
    public static final String TAG = "McuFileUpload";

    static {
        epb epbVar = new epb();
        INSTANCE = epbVar;
        rl4 rl4Var = gl4.devicePrimary.messageApi;
        ipb.Companion companion = ipb.INSTANCE;
        rl4Var.f(companion.c(), companion.a(), epbVar);
    }

    public final void a() {
        a7b.f(TAG, "Init mcu file upload proxy");
    }

    public final void b(long requestId) {
        FileUploadResponse fileUploadResponseBuild = FileUploadResponse.newBuilder().setReqId(requestId).setRspType(1).setRspCode(200).build();
        rl4 rl4Var = gl4.devicePrimary.messageApi;
        ipb.Companion companion = ipb.INSTANCE;
        rl4Var.b(new MessageEvent(companion.c(), companion.a(), fileUploadResponseBuild.toByteArray()));
    }

    @Override // com.oplus.aiunit.vision.rl4.b
    public void onMessageReceived(@NotNull String mac, @NotNull MessageEvent event) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            Result.Companion companion = Result.INSTANCE;
            FileUploadPreRequest request = FileUploadPreRequest.parseFrom(event.getData());
            Intrinsics.checkNotNullExpressionValue(request, "request");
            new fpb(request).i();
            INSTANCE.b(request.getReqId());
            objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl == null) {
            return;
        }
        a7b.b(TAG, "Parse file upload request fail:" + thM5290exceptionOrNullimpl);
    }
}

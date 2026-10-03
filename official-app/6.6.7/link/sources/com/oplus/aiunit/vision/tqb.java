package com.oplus.aiunit.vision;

import com.heytap.wearable.btnet.proto.FileUploadPreRequest;
import com.heytap.wearable.btnet.proto.FileUploadResponse;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/tqb;", "Lcom/oplus/aiunit/vision/hm4$b;", "", "a", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", "onMessageReceived", "", "requestId", "b", "TAG", "Ljava/lang/String;", "<init>", "()V", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
public final class tqb implements hm4.b {

    @NotNull
    public static final tqb INSTANCE;

    @NotNull
    public static final String TAG = "McuFileUpload";

    static {
        tqb tqbVar = new tqb();
        INSTANCE = tqbVar;
        hm4 hm4Var = wl4.devicePrimary.b;
        xqb.Companion companion = xqb.INSTANCE;
        hm4Var.f(companion.c(), companion.a(), tqbVar);
    }

    public final void a() {
        m8b.f(TAG, "Init mcu file upload proxy");
    }

    public final void b(long requestId) {
        FileUploadResponse fileUploadResponseBuild = FileUploadResponse.newBuilder().setReqId(requestId).setRspType(1).setRspCode(200).build();
        hm4 hm4Var = wl4.devicePrimary.b;
        xqb.Companion companion = xqb.INSTANCE;
        hm4Var.b(new MessageEvent(companion.c(), companion.a(), fileUploadResponseBuild.toByteArray()));
    }

    public void onMessageReceived(@NotNull String mac, @NotNull MessageEvent event) {
        Object obj;
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(event, "event");
        try {
            Result.Companion companion = Result.Companion;
            FileUploadPreRequest from = FileUploadPreRequest.parseFrom(event.getData());
            Intrinsics.checkNotNullExpressionValue(from, "request");
            new uqb(from).i();
            INSTANCE.b(from.getReqId());
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 == null) {
            return;
        }
        m8b.b(TAG, "Parse file upload request fail:" + th2);
    }
}

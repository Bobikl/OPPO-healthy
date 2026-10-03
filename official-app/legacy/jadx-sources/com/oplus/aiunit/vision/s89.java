package com.oplus.aiunit.vision;

import com.heytap.health.base.track.NxTrackHelper;
import com.heytap.mcssdk.PushService;
import com.heytap.msp.push.callback.ICallBackResultService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016J$\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016J.\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0002R\u001a\u0010\u001b\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/s89;", "Lcom/heytap/msp/push/callback/ICallBackResultService;", "", "responseCode", "", "registerID", "packageName", "miniPackageName", "", "onRegister", "onUnRegister", "pushTime", "onSetPushTime", "status", "onGetPushStatus", "onGetNotificationStatus", "errorCode", "message", PushService.MINI_PROGRAM_PKG, "onError", "", "result", "upsRegisterToken", "a", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "<init>", "()V", "push_base_release"}, k = 1, mv = {1, 8, 0})
public final class s89 implements ICallBackResultService {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "HeyTapUPSRegisterCallbackImpl";

    public final void a(boolean result, String upsRegisterToken) {
        xs8 xs8VarA;
        if (!result) {
            StringBuilder sb = new StringBuilder();
            sb.append("onRequestedFinished register token failed : server code not 0 : message : ");
            sb.append(upsRegisterToken);
            v9g.x("health_share_preference_oobe").U("registerID", "register_failure");
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onRequestedFinished register token sucess: ");
        sb2.append(upsRegisterToken);
        xs8.Companion companion = xs8.INSTANCE;
        xs8 xs8VarA2 = companion.a();
        if (!Intrinsics.areEqual(upsRegisterToken, xs8VarA2 != null ? xs8VarA2.i() : null)) {
            NxTrackHelper.Q(NxTrackHelper.K("registerId", upsRegisterToken));
        }
        if (upsRegisterToken == null || (xs8VarA = companion.a()) == null) {
            return;
        }
        xs8VarA.n(upsRegisterToken);
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onError(int errorCode, @Nullable String message, @Nullable String packageName, @Nullable String miniProgramPkg) {
        a7b.b(this.TAG, "onError code = " + errorCode + " , msg = " + message);
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onGetNotificationStatus(int responseCode, int status) {
        a7b.f(this.TAG, "onGetNotificationStatus code = " + responseCode);
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onGetPushStatus(int responseCode, int status) {
        a7b.f(this.TAG, "onGetPushStatus code = " + responseCode);
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onRegister(int responseCode, @Nullable String registerID, @Nullable String packageName, @Nullable String miniPackageName) {
        a(responseCode == 0, registerID);
        a7b.f(this.TAG, "onRegister code = " + responseCode);
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onSetPushTime(int responseCode, @Nullable String pushTime) {
        a7b.f(this.TAG, "onSetPushTime code = " + responseCode);
    }

    @Override // com.heytap.msp.push.callback.ICallBackResultService
    public void onUnRegister(int responseCode, @Nullable String packageName, @Nullable String miniPackageName) {
        a7b.f(this.TAG, "onUnRegister code = " + responseCode);
    }
}

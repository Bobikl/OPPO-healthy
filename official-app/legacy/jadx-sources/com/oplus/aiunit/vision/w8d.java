package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import com.heytap.health.voiceassistant.ovs.OvsManager;
import com.oplus.ovoicemanager.wakeup.service.HotwordRecordingListener;
import com.oplus.ovoicemanager.wakeup.service.OplusVoiceRecognitionManager;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0004R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/w8d;", "", "Landroid/content/Context;", "context", "", "a", "Lcom/oplus/ovoicemanager/wakeup/service/HotwordRecordingListener;", "callback", "", "b", "captureSession", "Lcom/oplus/ovoicemanager/wakeup/service/OplusVoiceRecognitionManager$DeviceType;", "type", "Landroid/os/Bundle;", "bundle", MapSchema.FIELD_NAME_ENTRY, "", "d", b2n.f, "Lcom/oplus/ovoicemanager/wakeup/service/OplusVoiceRecognitionManager;", "Lcom/oplus/ovoicemanager/wakeup/service/OplusVoiceRecognitionManager;", "realSdk", "Lcom/oplus/aiunit/vision/x8d;", "Lcom/oplus/aiunit/vision/x8d;", "c", "()Lcom/oplus/aiunit/vision/x8d;", "f", "(Lcom/oplus/aiunit/vision/x8d;)V", "serviceCallback", "<init>", "()V", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0})
public final class w8d {

    @NotNull
    public static final w8d INSTANCE = new w8d();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static volatile OplusVoiceRecognitionManager realSdk;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static volatile x8d serviceCallback;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"com/oplus/aiunit/vision/w8d$a", "Lcom/oplus/aiunit/vision/x8d;", "", "onServiceConnected", "onServiceDisconnected", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements x8d {
        @Override // com.oplus.aiunit.vision.x8d
        public void onServiceConnected() {
            a7b.f(OvsManager.TAG, "OVRMSdkWrapper onServiceConnected");
            x8d x8dVarC = w8d.INSTANCE.c();
            if (x8dVarC != null) {
                x8dVarC.onServiceConnected();
            }
        }

        @Override // com.oplus.aiunit.vision.x8d
        public void onServiceDisconnected() {
            a7b.f(OvsManager.TAG, "OVRMSdkWrapper onServiceDisconnected");
            x8d x8dVarC = w8d.INSTANCE.c();
            if (x8dVarC != null) {
                x8dVarC.onServiceDisconnected();
            }
        }
    }

    public final void a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (realSdk == null) {
            realSdk = OplusVoiceRecognitionManager.e(context, new a());
        }
        OplusVoiceRecognitionManager oplusVoiceRecognitionManager = realSdk;
        if (oplusVoiceRecognitionManager != null) {
            oplusVoiceRecognitionManager.b();
        }
    }

    public final int b(@Nullable HotwordRecordingListener callback) {
        OplusVoiceRecognitionManager oplusVoiceRecognitionManager = realSdk;
        if (oplusVoiceRecognitionManager != null) {
            return oplusVoiceRecognitionManager.d(callback);
        }
        return -1;
    }

    @Nullable
    public final x8d c() {
        return serviceCallback;
    }

    public final boolean d() {
        OplusVoiceRecognitionManager oplusVoiceRecognitionManager = realSdk;
        if (oplusVoiceRecognitionManager != null) {
            return oplusVoiceRecognitionManager.f();
        }
        return false;
    }

    public final int e(int captureSession, @Nullable OplusVoiceRecognitionManager.DeviceType type, @Nullable Bundle bundle) {
        OplusVoiceRecognitionManager oplusVoiceRecognitionManager = realSdk;
        if (oplusVoiceRecognitionManager != null) {
            return oplusVoiceRecognitionManager.g(captureSession, type, bundle);
        }
        return -1;
    }

    public final void f(@Nullable x8d x8dVar) {
        serviceCallback = x8dVar;
    }

    public final void g() {
        OplusVoiceRecognitionManager oplusVoiceRecognitionManager = realSdk;
        if (oplusVoiceRecognitionManager != null) {
            oplusVoiceRecognitionManager.h();
        }
        OplusVoiceRecognitionManager oplusVoiceRecognitionManager2 = realSdk;
        if (oplusVoiceRecognitionManager2 != null) {
            oplusVoiceRecognitionManager2.c();
        }
        serviceCallback = null;
    }
}

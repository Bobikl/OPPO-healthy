package com.heytap.wearable.watch.emergency;

import android.content.Context;
import android.os.Bundle;
import com.heytap.wearable.emergency.api.IEmergencyAidl;
import com.heytap.wearable.watch.emergency.safeguard.SafeGuardCardManager;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.cm9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/heytap/wearable/watch/emergency/EmergencyTransportApisImpl;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/wearable/emergency/api/IEmergencyAidl;", "f", "Landroid/content/Context;", "context", "", "c", "b", "", "i", "Ljava/lang/String;", "tag", "Lcom/heytap/wearable/emergency/api/IEmergencyAidl$Stub;", "j", "Lcom/heytap/wearable/emergency/api/IEmergencyAidl$Stub;", "iBinder", "<init>", "()V", "emergency_impl_release"}, k = 1, mv = {1, 8, 0})
public final class EmergencyTransportApisImpl implements cm9<IEmergencyAidl> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String tag = "HSG_TransportApisImpl";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final IEmergencyAidl.Stub iBinder = new IEmergencyAidl.Stub() { // from class: com.heytap.wearable.watch.emergency.EmergencyTransportApisImpl$iBinder$1
        @Override // com.heytap.wearable.emergency.api.IEmergencyAidl
        public void pushSafeEvent(@Nullable Bundle data) {
            a7b.f(this.this$0.tag, "pushSafeEvent in transport");
            SafeGuardCardManager.INSTANCE.w(data);
        }

        @Override // com.heytap.wearable.emergency.api.IEmergencyAidl
        public void updateFluidDate(@Nullable Bundle data) {
            a7b.f(this.this$0.tag, "updateFluidDate in transport");
            SafeGuardCardManager.INSTANCE.G(data);
        }
    };

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a7b.f(this.tag, "onDestroy: " + this);
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a7b.f(this.tag, "onCreate: " + this);
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public IEmergencyAidl d() {
        return this.iBinder;
    }
}

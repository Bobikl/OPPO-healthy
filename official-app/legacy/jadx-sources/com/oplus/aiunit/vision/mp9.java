package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.devicemanager.manager.IDeviceManager;
import io.protostuff.MapSchema;
import java.io.PrintWriter;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/mp9;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/devicemanager/manager/IDeviceManager;", "", MapSchema.FIELD_NAME_ENTRY, "Landroid/content/Context;", "context", "", "c", "b", "Ljava/io/PrintWriter;", "writer", "", "", "args", "a", "(Ljava/io/PrintWriter;[Ljava/lang/String;)V", "<init>", "()V", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0})
public final class mp9 implements cm9<IDeviceManager> {
    @Override // com.oplus.aiunit.vision.cm9
    public void a(@NotNull PrintWriter writer, @NotNull String[] args) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(args, "args");
        ak5.INSTANCE.a(writer, args);
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ak5.INSTANCE.d(context);
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ak5.INSTANCE.c(context);
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public IDeviceManager d() {
        return ak5.INSTANCE.b();
    }
}

package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.IInterface;
import com.heytap.health.watch.notification.INotificationApiService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.KotlinNothingValueException;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/t94;", "Lcom/oplus/aiunit/vision/cm9;", "Landroid/os/IInterface;", "d", "Landroid/content/Context;", "context", "", "c", "b", "<init>", "()V", "a", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0})
public final class t94 implements cm9<IInterface> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/t94$a;", "Lcom/oplus/aiunit/vision/uo5;", "Lcom/heytap/health/device_manager_base/b;", "bean", "", "d", "<init>", "()V", "device_manager_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements uo5 {
        @Override // com.oplus.aiunit.vision.c01
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean c(@Nullable com.heytap.health.device_manager_base.b bean) {
            if (bean != null) {
                return bean.o2();
            }
            return false;
        }
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a7b.f("ControlComponentManager", "onDestroy");
        v9g.x(INotificationApiService.SP_NAME).W(INotificationApiService.KILL_KEY, false);
        x94.e(context, false);
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a7b.f("ControlComponentManager", "onCreate");
        x94.e(context, true);
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    public IInterface d() {
        Intrinsics.checkNotNull(null);
        throw new KotlinNothingValueException();
    }
}

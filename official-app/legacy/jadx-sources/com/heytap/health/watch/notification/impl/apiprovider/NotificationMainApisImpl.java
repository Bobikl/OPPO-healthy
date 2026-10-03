package com.heytap.health.watch.notification.impl.apiprovider;

import android.app.Activity;
import android.content.Context;
import com.heytap.health.watch.notification.INotificationMainAidl;
import com.heytap.health.watch.notification.impl.cloud.CloudCheckWorker;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.nj3;
import com.oplus.aiunit.vision.op;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/watch/notification/impl/apiprovider/NotificationMainApisImpl;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/watch/notification/INotificationMainAidl;", "f", "Landroid/content/Context;", "context", "", "c", "b", "", "i", "Ljava/lang/String;", "TAG", "Lcom/heytap/health/watch/notification/INotificationMainAidl$Stub;", "j", "Lcom/heytap/health/watch/notification/INotificationMainAidl$Stub;", "iBinder", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class NotificationMainApisImpl implements cm9<INotificationMainAidl> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "NTF_MainApisImpl";

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final INotificationMainAidl.Stub iBinder = new INotificationMainAidl.Stub() { // from class: com.heytap.health.watch.notification.impl.apiprovider.NotificationMainApisImpl$iBinder$1
        @Override // com.heytap.health.watch.notification.INotificationMainAidl
        public void cancelAlarm() {
            a7b.f(this.this$0.TAG, "cancelAlarm: main application");
            CloudCheckWorker.Companion.a();
        }

        @Override // com.heytap.health.watch.notification.INotificationMainAidl
        public void setAlarm() {
            a7b.f(this.this$0.TAG, "setAlarm: main application");
            CloudCheckWorker.Companion.b();
        }

        @Override // com.heytap.health.watch.notification.INotificationMainAidl
        public void updateUI() {
            a7b.f(this.this$0.TAG, "updateUI: main application");
            for (Activity activity : op.n().q()) {
                if (activity instanceof nj3) {
                    a7b.f(this.this$0.TAG, "updateUI: main application, found " + activity);
                    ((nj3) activity).x2();
                }
            }
        }
    };

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a7b.f(this.TAG, "onDestroy: " + this);
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a7b.f(this.TAG, "onCreate: " + this);
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public INotificationMainAidl d() {
        return this.iBinder;
    }
}

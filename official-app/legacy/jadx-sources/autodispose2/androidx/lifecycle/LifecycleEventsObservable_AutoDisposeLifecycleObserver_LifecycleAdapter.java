package autodispose2.androidx.lifecycle;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

/* JADX INFO: loaded from: classes12.dex */
public class LifecycleEventsObservable_AutoDisposeLifecycleObserver_LifecycleAdapter implements GeneratedAdapter {
    public final LifecycleEventsObservable.AutoDisposeLifecycleObserver a;

    public LifecycleEventsObservable_AutoDisposeLifecycleObserver_LifecycleAdapter(LifecycleEventsObservable.AutoDisposeLifecycleObserver autoDisposeLifecycleObserver) {
        this.a = autoDisposeLifecycleObserver;
    }

    @Override // androidx.lifecycle.GeneratedAdapter
    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2 = methodCallsLogger != null;
        if (z) {
            if (!z2 || methodCallsLogger.approveCall("onStateChange", 4)) {
                this.a.onStateChange(lifecycleOwner, event);
            }
        }
    }
}

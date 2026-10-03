package coil.request;

import androidx.annotation.MainThread;
import androidx.lifecycle.DefaultLifecycleObserver;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0004\u001a\u00020\u0002H\u0017J\b\u0010\u0005\u001a\u00020\u0002H\u0017\u0082\u0001\u0002\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcoil/request/RequestDelegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "", "Q2", "start", "complete", "Lcoil/request/BaseRequestDelegate;", "Lcoil/request/ViewTargetRequestDelegate;", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public interface RequestDelegate extends DefaultLifecycleObserver {
    @MainThread
    default void Q2() {
    }

    @MainThread
    default void complete() {
    }

    @MainThread
    default void start() {
    }
}

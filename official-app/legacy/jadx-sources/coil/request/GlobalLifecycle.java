package coil.request;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcoil/request/GlobalLifecycle;", "Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/LifecycleObserver;", "observer", "", "addObserver", "removeObserver", "", "toString", "coil/request/GlobalLifecycle$owner$1", "a", "Lcoil/request/GlobalLifecycle$owner$1;", "owner", "Landroidx/lifecycle/Lifecycle$State;", "getCurrentState", "()Landroidx/lifecycle/Lifecycle$State;", "currentState", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class GlobalLifecycle extends Lifecycle {

    @NotNull
    public static final GlobalLifecycle INSTANCE = new GlobalLifecycle();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final GlobalLifecycle$owner$1 owner = new LifecycleOwner() { // from class: coil.request.GlobalLifecycle$owner$1
        @Override // androidx.lifecycle.LifecycleOwner
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GlobalLifecycle getLifecycle() {
            return GlobalLifecycle.INSTANCE;
        }
    };

    private GlobalLifecycle() {
    }

    @Override // androidx.lifecycle.Lifecycle
    public void addObserver(@NotNull LifecycleObserver observer) {
        if (!(observer instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((observer + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) observer;
        GlobalLifecycle$owner$1 globalLifecycle$owner$1 = owner;
        defaultLifecycleObserver.onCreate(globalLifecycle$owner$1);
        defaultLifecycleObserver.onStart(globalLifecycle$owner$1);
        defaultLifecycleObserver.onResume(globalLifecycle$owner$1);
    }

    @Override // androidx.lifecycle.Lifecycle
    @NotNull
    public Lifecycle.State getCurrentState() {
        return Lifecycle.State.RESUMED;
    }

    @Override // androidx.lifecycle.Lifecycle
    public void removeObserver(@NotNull LifecycleObserver observer) {
    }

    @NotNull
    public String toString() {
        return "coil.request.GlobalLifecycle";
    }
}

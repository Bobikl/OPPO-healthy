package coil.request;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcoil/request/BaseRequestDelegate;", "Lcoil/request/RequestDelegate;", "", "start", "complete", "a", "Landroidx/lifecycle/LifecycleOwner;", "owner", "onDestroy", "Landroidx/lifecycle/Lifecycle;", "i", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lkotlinx/coroutines/Job;", "j", "Lkotlinx/coroutines/Job;", "job", "<init>", "(Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/Job;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class BaseRequestDelegate implements RequestDelegate {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lifecycle lifecycle;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Job job;

    public BaseRequestDelegate(@NotNull Lifecycle lifecycle, @NotNull Job job) {
        this.lifecycle = lifecycle;
        this.job = job;
    }

    public void a() {
        Job.DefaultImpls.cancel$default(this.job, (CancellationException) null, 1, (Object) null);
    }

    @Override // coil.request.RequestDelegate
    public void complete() {
        this.lifecycle.removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        a();
    }

    @Override // coil.request.RequestDelegate
    public void start() {
        this.lifecycle.addObserver(this);
    }
}

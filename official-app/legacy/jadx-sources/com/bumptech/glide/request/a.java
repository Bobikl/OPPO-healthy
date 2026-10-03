package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.dqf;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements RequestCoordinator, dqf {
    public final Object a;

    @Nullable
    public final RequestCoordinator b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile dqf f1432c;
    public volatile dqf d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f1433e;

    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f;

    public a(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f1433e = requestState;
        this.f = requestState;
        this.a = obj;
        this.b = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.oplus.aiunit.vision.dqf
    public boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.f1432c.a() || this.d.a();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean b(dqf dqfVar) {
        boolean zM;
        synchronized (this.a) {
            zM = m();
        }
        return zM;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void c(dqf dqfVar) {
        synchronized (this.a) {
            if (dqfVar.equals(this.d)) {
                this.f = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.b;
                if (requestCoordinator != null) {
                    requestCoordinator.c(this);
                }
                return;
            }
            this.f1433e = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator.RequestState requestState = this.f;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f = requestState2;
                this.d.i();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.dqf
    public void clear() {
        synchronized (this.a) {
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f1433e = requestState;
            this.f1432c.clear();
            if (this.f != requestState) {
                this.f = requestState;
                this.d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean d(dqf dqfVar) {
        boolean z;
        synchronized (this.a) {
            z = k() && dqfVar.equals(this.f1432c);
        }
        return z;
    }

    @Override // com.oplus.aiunit.vision.dqf
    public boolean e() {
        boolean z;
        synchronized (this.a) {
            RequestCoordinator.RequestState requestState = this.f1433e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
            z = requestState == requestState2 && this.f == requestState2;
        }
        return z;
    }

    @Override // com.oplus.aiunit.vision.dqf
    public boolean f(dqf dqfVar) {
        if (!(dqfVar instanceof a)) {
            return false;
        }
        a aVar = (a) dqfVar;
        return this.f1432c.f(aVar.f1432c) && this.d.f(aVar.d);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean g(dqf dqfVar) {
        boolean z;
        synchronized (this.a) {
            z = l() && j(dqfVar);
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bumptech.glide.request.RequestCoordinator] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        ?? root;
        synchronized (this.a) {
            RequestCoordinator requestCoordinator = this.b;
            this = this;
            if (requestCoordinator != null) {
                root = requestCoordinator.getRoot();
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void h(dqf dqfVar) {
        synchronized (this.a) {
            if (dqfVar.equals(this.f1432c)) {
                this.f1433e = RequestCoordinator.RequestState.SUCCESS;
            } else if (dqfVar.equals(this.d)) {
                this.f = RequestCoordinator.RequestState.SUCCESS;
            }
            RequestCoordinator requestCoordinator = this.b;
            if (requestCoordinator != null) {
                requestCoordinator.h(this);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.dqf
    public void i() {
        synchronized (this.a) {
            RequestCoordinator.RequestState requestState = this.f1433e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState != requestState2) {
                this.f1433e = requestState2;
                this.f1432c.i();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.dqf
    public boolean isComplete() {
        boolean z;
        synchronized (this.a) {
            RequestCoordinator.RequestState requestState = this.f1433e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
            z = requestState == requestState2 || this.f == requestState2;
        }
        return z;
    }

    @Override // com.oplus.aiunit.vision.dqf
    public boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            RequestCoordinator.RequestState requestState = this.f1433e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            z = requestState == requestState2 || this.f == requestState2;
        }
        return z;
    }

    @GuardedBy("requestLock")
    public final boolean j(dqf dqfVar) {
        RequestCoordinator.RequestState requestState;
        RequestCoordinator.RequestState requestState2 = this.f1433e;
        RequestCoordinator.RequestState requestState3 = RequestCoordinator.RequestState.FAILED;
        if (requestState2 != requestState3) {
            return dqfVar.equals(this.f1432c);
        }
        return dqfVar.equals(this.d) && ((requestState = this.f) == RequestCoordinator.RequestState.SUCCESS || requestState == requestState3);
    }

    @GuardedBy("requestLock")
    public final boolean k() {
        RequestCoordinator requestCoordinator = this.b;
        return requestCoordinator == null || requestCoordinator.d(this);
    }

    @GuardedBy("requestLock")
    public final boolean l() {
        RequestCoordinator requestCoordinator = this.b;
        return requestCoordinator == null || requestCoordinator.g(this);
    }

    @GuardedBy("requestLock")
    public final boolean m() {
        RequestCoordinator requestCoordinator = this.b;
        return requestCoordinator == null || requestCoordinator.b(this);
    }

    public void n(dqf dqfVar, dqf dqfVar2) {
        this.f1432c = dqfVar;
        this.d = dqfVar2;
    }

    @Override // com.oplus.aiunit.vision.dqf
    public void pause() {
        synchronized (this.a) {
            RequestCoordinator.RequestState requestState = this.f1433e;
            RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
            if (requestState == requestState2) {
                this.f1433e = RequestCoordinator.RequestState.PAUSED;
                this.f1432c.pause();
            }
            if (this.f == requestState2) {
                this.f = RequestCoordinator.RequestState.PAUSED;
                this.d.pause();
            }
        }
    }
}

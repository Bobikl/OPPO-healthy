package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.dqf;

/* JADX INFO: loaded from: classes13.dex */
public class b implements RequestCoordinator, dqf {

    @Nullable
    public final RequestCoordinator a;
    public final Object b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile dqf f1434c;
    public volatile dqf d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f1435e;

    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f;

    @GuardedBy("requestLock")
    public boolean g;

    public b(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.f1435e = requestState;
        this.f = requestState;
        this.b = obj;
        this.a = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.oplus.aiunit.vision.dqf
    public boolean a() {
        boolean z;
        synchronized (this.b) {
            z = this.d.a() || this.f1434c.a();
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean b(dqf dqfVar) {
        boolean z;
        synchronized (this.b) {
            z = l() && (dqfVar.equals(this.f1434c) || this.f1435e != RequestCoordinator.RequestState.SUCCESS);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void c(dqf dqfVar) {
        synchronized (this.b) {
            if (!dqfVar.equals(this.f1434c)) {
                this.f = RequestCoordinator.RequestState.FAILED;
                return;
            }
            this.f1435e = RequestCoordinator.RequestState.FAILED;
            RequestCoordinator requestCoordinator = this.a;
            if (requestCoordinator != null) {
                requestCoordinator.c(this);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.dqf
    public void clear() {
        synchronized (this.b) {
            this.g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.f1435e = requestState;
            this.f = requestState;
            this.d.clear();
            this.f1434c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean d(dqf dqfVar) {
        boolean z;
        synchronized (this.b) {
            z = j() && dqfVar.equals(this.f1434c) && this.f1435e != RequestCoordinator.RequestState.PAUSED;
        }
        return z;
    }

    @Override // com.oplus.aiunit.vision.dqf
    public boolean e() {
        boolean z;
        synchronized (this.b) {
            z = this.f1435e == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // com.oplus.aiunit.vision.dqf
    public boolean f(dqf dqfVar) {
        if (!(dqfVar instanceof b)) {
            return false;
        }
        b bVar = (b) dqfVar;
        if (this.f1434c == null) {
            if (bVar.f1434c != null) {
                return false;
            }
        } else if (!this.f1434c.f(bVar.f1434c)) {
            return false;
        }
        if (this.d == null) {
            if (bVar.d != null) {
                return false;
            }
        } else if (!this.d.f(bVar.d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean g(dqf dqfVar) {
        boolean z;
        synchronized (this.b) {
            z = k() && dqfVar.equals(this.f1434c) && !a();
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
        synchronized (this.b) {
            RequestCoordinator requestCoordinator = this.a;
            this = this;
            if (requestCoordinator != null) {
                root = requestCoordinator.getRoot();
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void h(dqf dqfVar) {
        synchronized (this.b) {
            if (dqfVar.equals(this.d)) {
                this.f = RequestCoordinator.RequestState.SUCCESS;
                return;
            }
            this.f1435e = RequestCoordinator.RequestState.SUCCESS;
            RequestCoordinator requestCoordinator = this.a;
            if (requestCoordinator != null) {
                requestCoordinator.h(this);
            }
            if (!this.f.isComplete()) {
                this.d.clear();
            }
        }
    }

    @Override // com.oplus.aiunit.vision.dqf
    public void i() {
        synchronized (this.b) {
            this.g = true;
            try {
                if (this.f1435e != RequestCoordinator.RequestState.SUCCESS) {
                    RequestCoordinator.RequestState requestState = this.f;
                    RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState != requestState2) {
                        this.f = requestState2;
                        this.d.i();
                    }
                }
                if (this.g) {
                    RequestCoordinator.RequestState requestState3 = this.f1435e;
                    RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                    if (requestState3 != requestState4) {
                        this.f1435e = requestState4;
                        this.f1434c.i();
                    }
                }
                this.g = false;
            } catch (Throwable th) {
                this.g = false;
                throw th;
            }
        }
    }

    @Override // com.oplus.aiunit.vision.dqf
    public boolean isComplete() {
        boolean z;
        synchronized (this.b) {
            z = this.f1435e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    @Override // com.oplus.aiunit.vision.dqf
    public boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = this.f1435e == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    @GuardedBy("requestLock")
    public final boolean j() {
        RequestCoordinator requestCoordinator = this.a;
        return requestCoordinator == null || requestCoordinator.d(this);
    }

    @GuardedBy("requestLock")
    public final boolean k() {
        RequestCoordinator requestCoordinator = this.a;
        return requestCoordinator == null || requestCoordinator.g(this);
    }

    @GuardedBy("requestLock")
    public final boolean l() {
        RequestCoordinator requestCoordinator = this.a;
        return requestCoordinator == null || requestCoordinator.b(this);
    }

    public void m(dqf dqfVar, dqf dqfVar2) {
        this.f1434c = dqfVar;
        this.d = dqfVar2;
    }

    @Override // com.oplus.aiunit.vision.dqf
    public void pause() {
        synchronized (this.b) {
            if (!this.f.isComplete()) {
                this.f = RequestCoordinator.RequestState.PAUSED;
                this.d.pause();
            }
            if (!this.f1435e.isComplete()) {
                this.f1435e = RequestCoordinator.RequestState.PAUSED;
                this.f1434c.pause();
            }
        }
    }
}

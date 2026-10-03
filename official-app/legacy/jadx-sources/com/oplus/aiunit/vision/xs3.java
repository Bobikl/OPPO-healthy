package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class xs3 implements io.reactivex.rxjava3.disposables.a, fv5 {
    public fld<io.reactivex.rxjava3.disposables.a> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f18738j;

    @Override // com.oplus.aiunit.vision.fv5
    public boolean a(io.reactivex.rxjava3.disposables.a aVar) {
        Objects.requireNonNull(aVar, "disposable is null");
        if (!this.f18738j) {
            synchronized (this) {
                if (!this.f18738j) {
                    fld<io.reactivex.rxjava3.disposables.a> fldVar = this.i;
                    if (fldVar == null) {
                        fldVar = new fld<>();
                        this.i = fldVar;
                    }
                    fldVar.a(aVar);
                    return true;
                }
            }
        }
        aVar.dispose();
        return false;
    }

    @Override // com.oplus.aiunit.vision.fv5
    public boolean b(io.reactivex.rxjava3.disposables.a aVar) {
        Objects.requireNonNull(aVar, "disposable is null");
        if (this.f18738j) {
            return false;
        }
        synchronized (this) {
            if (this.f18738j) {
                return false;
            }
            fld<io.reactivex.rxjava3.disposables.a> fldVar = this.i;
            if (fldVar != null && fldVar.e(aVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // com.oplus.aiunit.vision.fv5
    public boolean c(io.reactivex.rxjava3.disposables.a aVar) {
        if (!b(aVar)) {
            return false;
        }
        aVar.dispose();
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public void dispose() {
        if (this.f18738j) {
            return;
        }
        synchronized (this) {
            if (this.f18738j) {
                return;
            }
            this.f18738j = true;
            fld<io.reactivex.rxjava3.disposables.a> fldVar = this.i;
            this.i = null;
            g(fldVar);
        }
    }

    public void f() {
        if (this.f18738j) {
            return;
        }
        synchronized (this) {
            if (this.f18738j) {
                return;
            }
            fld<io.reactivex.rxjava3.disposables.a> fldVar = this.i;
            this.i = null;
            g(fldVar);
        }
    }

    public void g(fld<io.reactivex.rxjava3.disposables.a> fldVar) {
        if (fldVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : fldVar.b()) {
            if (obj instanceof io.reactivex.rxjava3.disposables.a) {
                try {
                    ((io.reactivex.rxjava3.disposables.a) obj).dispose();
                } catch (Throwable th) {
                    hu6.b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw ExceptionHelper.h((Throwable) arrayList.get(0));
        }
    }

    public int h() {
        if (this.f18738j) {
            return 0;
        }
        synchronized (this) {
            if (this.f18738j) {
                return 0;
            }
            fld<io.reactivex.rxjava3.disposables.a> fldVar = this.i;
            return fldVar != null ? fldVar.g() : 0;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.f18738j;
    }
}

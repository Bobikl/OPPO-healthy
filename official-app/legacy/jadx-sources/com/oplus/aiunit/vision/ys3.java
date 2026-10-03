package com.oplus.aiunit.vision;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class ys3 implements cv5, gv5 {
    public gld<cv5> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f19127j;

    @Override // com.oplus.aiunit.vision.gv5
    public boolean a(cv5 cv5Var) {
        abd.d(cv5Var, "disposable is null");
        if (!this.f19127j) {
            synchronized (this) {
                if (!this.f19127j) {
                    gld<cv5> gldVar = this.i;
                    if (gldVar == null) {
                        gldVar = new gld<>();
                        this.i = gldVar;
                    }
                    gldVar.a(cv5Var);
                    return true;
                }
            }
        }
        cv5Var.dispose();
        return false;
    }

    @Override // com.oplus.aiunit.vision.gv5
    public boolean b(cv5 cv5Var) {
        abd.d(cv5Var, "disposables is null");
        if (this.f19127j) {
            return false;
        }
        synchronized (this) {
            if (this.f19127j) {
                return false;
            }
            gld<cv5> gldVar = this.i;
            if (gldVar != null && gldVar.e(cv5Var)) {
                return true;
            }
            return false;
        }
    }

    @Override // com.oplus.aiunit.vision.gv5
    public boolean c(cv5 cv5Var) {
        if (!b(cv5Var)) {
            return false;
        }
        cv5Var.dispose();
        return true;
    }

    public void d(gld<cv5> gldVar) {
        if (gldVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : gldVar.b()) {
            if (obj instanceof cv5) {
                try {
                    ((cv5) obj).dispose();
                } catch (Throwable th) {
                    iu6.b(th);
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
            throw ExceptionHelper.d((Throwable) arrayList.get(0));
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        if (this.f19127j) {
            return;
        }
        synchronized (this) {
            if (this.f19127j) {
                return;
            }
            this.f19127j = true;
            gld<cv5> gldVar = this.i;
            this.i = null;
            d(gldVar);
        }
    }

    public int e() {
        if (this.f19127j) {
            return 0;
        }
        synchronized (this) {
            if (this.f19127j) {
                return 0;
            }
            gld<cv5> gldVar = this.i;
            return gldVar != null ? gldVar.g() : 0;
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.f19127j;
    }
}

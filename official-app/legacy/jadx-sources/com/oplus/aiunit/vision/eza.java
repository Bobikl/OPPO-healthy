package com.oplus.aiunit.vision;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class eza implements cv5, gv5 {
    public List<cv5> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f11141j;

    @Override // com.oplus.aiunit.vision.gv5
    public boolean a(cv5 cv5Var) {
        abd.d(cv5Var, "d is null");
        if (!this.f11141j) {
            synchronized (this) {
                if (!this.f11141j) {
                    List linkedList = this.i;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.i = linkedList;
                    }
                    linkedList.add(cv5Var);
                    return true;
                }
            }
        }
        cv5Var.dispose();
        return false;
    }

    @Override // com.oplus.aiunit.vision.gv5
    public boolean b(cv5 cv5Var) {
        abd.d(cv5Var, "Disposable item is null");
        if (this.f11141j) {
            return false;
        }
        synchronized (this) {
            if (this.f11141j) {
                return false;
            }
            List<cv5> list = this.i;
            if (list != null && list.remove(cv5Var)) {
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

    public void d(List<cv5> list) {
        if (list == null) {
            return;
        }
        Iterator<cv5> it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (Throwable th) {
                iu6.b(th);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
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
        if (this.f11141j) {
            return;
        }
        synchronized (this) {
            if (this.f11141j) {
                return;
            }
            this.f11141j = true;
            List<cv5> list = this.i;
            this.i = null;
            d(list);
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return this.f11141j;
    }
}

package com.oplus.aiunit.vision;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public final class dza implements io.reactivex.rxjava3.disposables.a, fv5 {
    public List<io.reactivex.rxjava3.disposables.a> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f10732j;

    @Override // com.oplus.aiunit.vision.fv5
    public boolean a(io.reactivex.rxjava3.disposables.a aVar) {
        Objects.requireNonNull(aVar, "d is null");
        if (!this.f10732j) {
            synchronized (this) {
                if (!this.f10732j) {
                    List linkedList = this.i;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.i = linkedList;
                    }
                    linkedList.add(aVar);
                    return true;
                }
            }
        }
        aVar.dispose();
        return false;
    }

    @Override // com.oplus.aiunit.vision.fv5
    public boolean b(io.reactivex.rxjava3.disposables.a aVar) {
        Objects.requireNonNull(aVar, "Disposable item is null");
        if (this.f10732j) {
            return false;
        }
        synchronized (this) {
            if (this.f10732j) {
                return false;
            }
            List<io.reactivex.rxjava3.disposables.a> list = this.i;
            if (list != null && list.remove(aVar)) {
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
        if (this.f10732j) {
            return;
        }
        synchronized (this) {
            if (this.f10732j) {
                return;
            }
            this.f10732j = true;
            List<io.reactivex.rxjava3.disposables.a> list = this.i;
            this.i = null;
            f(list);
        }
    }

    public void f(List<io.reactivex.rxjava3.disposables.a> list) {
        if (list == null) {
            return;
        }
        Iterator<io.reactivex.rxjava3.disposables.a> it = list.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            try {
                it.next().dispose();
            } catch (Throwable th) {
                hu6.b(th);
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
            throw ExceptionHelper.h((Throwable) arrayList.get(0));
        }
    }

    @Override // io.reactivex.rxjava3.disposables.a
    public boolean isDisposed() {
        return this.f10732j;
    }
}

package com.oplus.aiunit.vision;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class crf {
    public final Set<dqf> a = Collections.newSetFromMap(new WeakHashMap());
    public final Set<dqf> b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10213c;

    public boolean a(@Nullable dqf dqfVar) {
        boolean z = true;
        if (dqfVar == null) {
            return true;
        }
        boolean zRemove = this.a.remove(dqfVar);
        if (!this.b.remove(dqfVar) && !zRemove) {
            z = false;
        }
        if (z) {
            dqfVar.clear();
        }
        return z;
    }

    public void b() {
        Iterator it = uqk.k(this.a).iterator();
        while (it.hasNext()) {
            a((dqf) it.next());
        }
        this.b.clear();
    }

    public void c() {
        this.f10213c = true;
        for (dqf dqfVar : uqk.k(this.a)) {
            if (dqfVar.isRunning() || dqfVar.isComplete()) {
                dqfVar.clear();
                this.b.add(dqfVar);
            }
        }
    }

    public void d() {
        this.f10213c = true;
        for (dqf dqfVar : uqk.k(this.a)) {
            if (dqfVar.isRunning()) {
                dqfVar.pause();
                this.b.add(dqfVar);
            }
        }
    }

    public void e() {
        for (dqf dqfVar : uqk.k(this.a)) {
            if (!dqfVar.isComplete() && !dqfVar.e()) {
                dqfVar.clear();
                if (this.f10213c) {
                    this.b.add(dqfVar);
                } else {
                    dqfVar.i();
                }
            }
        }
    }

    public void f() {
        this.f10213c = false;
        for (dqf dqfVar : uqk.k(this.a)) {
            if (!dqfVar.isComplete() && !dqfVar.isRunning()) {
                dqfVar.i();
            }
        }
        this.b.clear();
    }

    public void g(@NonNull dqf dqfVar) {
        this.a.add(dqfVar);
        if (!this.f10213c) {
            dqfVar.i();
            return;
        }
        dqfVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.b.add(dqfVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.a.size() + ", isPaused=" + this.f10213c + "}";
    }
}

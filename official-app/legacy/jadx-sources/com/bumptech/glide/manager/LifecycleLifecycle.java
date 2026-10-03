package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.oplus.aiunit.vision.bwa;
import com.oplus.aiunit.vision.uqk;
import com.oplus.aiunit.vision.zva;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
final class LifecycleLifecycle implements zva, LifecycleObserver {

    @NonNull
    public final Set<bwa> i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    public final Lifecycle f1422j;

    public LifecycleLifecycle(Lifecycle lifecycle) {
        this.f1422j = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // com.oplus.aiunit.vision.zva
    public void a(@NonNull bwa bwaVar) {
        this.i.add(bwaVar);
        if (this.f1422j.getCurrentState() == Lifecycle.State.DESTROYED) {
            bwaVar.onDestroy();
        } else if (this.f1422j.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            bwaVar.onStart();
        } else {
            bwaVar.onStop();
        }
    }

    @Override // com.oplus.aiunit.vision.zva
    public void b(@NonNull bwa bwaVar) {
        this.i.remove(bwaVar);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = uqk.k(this.i).iterator();
        while (it.hasNext()) {
            ((bwa) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = uqk.k(this.i).iterator();
        while (it.hasNext()) {
            ((bwa) it.next()).onStart();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        Iterator it = uqk.k(this.i).iterator();
        while (it.hasNext()) {
            ((bwa) it.next()).onStop();
        }
    }
}

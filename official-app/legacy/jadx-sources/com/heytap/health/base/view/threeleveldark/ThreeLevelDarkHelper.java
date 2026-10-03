package com.heytap.health.base.view.threeleveldark;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.oh2;

/* JADX INFO: loaded from: classes15.dex */
public class ThreeLevelDarkHelper implements LifecycleEventObserver {
    public LifecycleOwner i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Application f3348j;

    public interface a {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        LifecycleOwner lifecycleOwner2 = this.i;
        if (lifecycleOwner2 != null && lifecycleOwner2.getLifecycle().getState() == Lifecycle.State.DESTROYED) {
            a7b.f("ThreeLevelDarkHelper", "state == DESTROYED!");
            oh2.a().b(null);
            this.f3348j = null;
        }
    }

    public void setOnDarkModeChangeListener(a aVar) {
    }
}

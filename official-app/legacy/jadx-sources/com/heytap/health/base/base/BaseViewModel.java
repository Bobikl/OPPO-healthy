package com.heytap.health.base.base;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import com.oplus.aiunit.vision.xs3;
import io.reactivex.rxjava3.disposables.a;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseViewModel extends ViewModel {
    public xs3 i;

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        xs3 xs3Var = this.i;
        if (xs3Var != null) {
            xs3Var.dispose();
            this.i = null;
        }
        super.onCleared();
    }

    public void u(@NonNull a aVar) {
        Objects.requireNonNull(aVar, "disposable is null");
        if (this.i == null) {
            this.i = new xs3();
        }
        this.i.a(aVar);
    }
}

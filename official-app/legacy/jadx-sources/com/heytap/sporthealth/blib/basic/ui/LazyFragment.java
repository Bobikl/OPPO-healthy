package com.heytap.sporthealth.blib.basic.ui;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LazyFragment extends Fragment {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f7708j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f7709l = true;

    public abstract void W();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.k = !z;
        if (!z && this.f7708j && this.f7709l) {
            this.f7709l = false;
            W();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f7708j = true;
        if (this.k && this.f7709l) {
            this.f7709l = false;
            W();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.k = z;
        if (z && this.f7708j && this.f7709l) {
            this.f7709l = false;
            W();
        }
    }
}

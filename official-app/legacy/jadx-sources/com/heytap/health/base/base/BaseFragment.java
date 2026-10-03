package com.heytap.health.base.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseFragment extends Fragment implements BaseViewSizeControl {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    @Deprecated
    public Context f3159j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3160l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3161n;

    @Override // com.heytap.health.base.base.BaseViewSizeControl
    public boolean F5() {
        return false;
    }

    public <T extends View> T W(@IdRes int i) {
        return (T) this.k.findViewById(i);
    }

    public boolean X() {
        return this.m;
    }

    public void Y() {
    }

    public void Z(BaseFragment baseFragment, int i) {
        if (baseFragment == this) {
            a0(true);
            this.f3161n = true;
        } else if (this.f3161n) {
            a0(false);
            this.f3161n = false;
        }
    }

    public void a0(boolean z) {
    }

    public void b0() {
    }

    public abstract int getLayoutId();

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View getView() {
        return super.getView();
    }

    public abstract void initData();

    public abstract void initView(View view);

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f3159j = context;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        this.m = true;
        View view = this.k;
        if (view == null) {
            View viewInflate = layoutInflater.inflate(getLayoutId(), viewGroup, false);
            this.k = viewInflate;
            handleContentView(viewInflate);
        } else {
            ViewParent parent = view.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.k);
            }
        }
        return this.k;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.m = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f3159j = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!this.f3160l) {
            initView(view);
            initData();
        }
        this.f3160l = true;
    }
}

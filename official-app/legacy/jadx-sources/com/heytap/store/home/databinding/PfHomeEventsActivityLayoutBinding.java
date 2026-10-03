package com.heytap.store.home.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.heytap.store.home.R;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PfHomeEventsActivityLayoutBinding extends ViewDataBinding {

    @NonNull
    public final FrameLayout eventsActivityContainer;

    public PfHomeEventsActivityLayoutBinding(Object obj, View view, int i, FrameLayout frameLayout) {
        super(obj, view, i);
        this.eventsActivityContainer = frameLayout;
    }

    public static PfHomeEventsActivityLayoutBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static PfHomeEventsActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static PfHomeEventsActivityLayoutBinding bind(@NonNull View view, @Nullable Object obj) {
        return (PfHomeEventsActivityLayoutBinding) ViewDataBinding.bind(obj, view, R.layout.pf_home_events_activity_layout);
    }

    @NonNull
    @Deprecated
    public static PfHomeEventsActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z, @Nullable Object obj) {
        return (PfHomeEventsActivityLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_home_events_activity_layout, viewGroup, z, obj);
    }

    @NonNull
    public static PfHomeEventsActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static PfHomeEventsActivityLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable Object obj) {
        return (PfHomeEventsActivityLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.pf_home_events_activity_layout, null, false, obj);
    }
}

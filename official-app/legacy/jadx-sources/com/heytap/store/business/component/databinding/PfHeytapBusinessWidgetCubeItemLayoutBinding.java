package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.business.component.R;

/* JADX INFO: loaded from: classes4.dex */
public final class PfHeytapBusinessWidgetCubeItemLayoutBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    private PfHeytapBusinessWidgetCubeItemLayoutBinding(@NonNull LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    @NonNull
    public static PfHeytapBusinessWidgetCubeItemLayoutBinding bind(@NonNull View view) {
        if (view != null) {
            return new PfHeytapBusinessWidgetCubeItemLayoutBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static PfHeytapBusinessWidgetCubeItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PfHeytapBusinessWidgetCubeItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.pf_heytap_business_widget_cube_item_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}

package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.business.component.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ItemIntegralExpLeftLayoutBinding implements ViewBinding {

    @NonNull
    public final ConstraintLayout clIntegralLeft;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final AppCompatTextView tvIntegralDes;

    @NonNull
    public final AppCompatTextView tvIntegralMaxNum;

    @NonNull
    public final AppCompatTextView tvIntegralNumber;

    private ItemIntegralExpLeftLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3) {
        this.rootView = constraintLayout;
        this.clIntegralLeft = constraintLayout2;
        this.tvIntegralDes = appCompatTextView;
        this.tvIntegralMaxNum = appCompatTextView2;
        this.tvIntegralNumber = appCompatTextView3;
    }

    @NonNull
    public static ItemIntegralExpLeftLayoutBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.tv_integral_des;
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(i);
        if (appCompatTextView != null) {
            i = R.id.tv_integral_max_num;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(i);
            if (appCompatTextView2 != null) {
                i = R.id.tv_integral_number;
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) view.findViewById(i);
                if (appCompatTextView3 != null) {
                    return new ItemIntegralExpLeftLayoutBinding((ConstraintLayout) view, constraintLayout, appCompatTextView, appCompatTextView2, appCompatTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemIntegralExpLeftLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemIntegralExpLeftLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_integral_exp_left_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

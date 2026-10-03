package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.business.component.R;

/* JADX INFO: loaded from: classes4.dex */
public final class PfHeytapBusinessWidgetItemNearStoreLabelBinding implements ViewBinding {

    @NonNull
    private final AppCompatTextView rootView;

    private PfHeytapBusinessWidgetItemNearStoreLabelBinding(@NonNull AppCompatTextView appCompatTextView) {
        this.rootView = appCompatTextView;
    }

    @NonNull
    public static PfHeytapBusinessWidgetItemNearStoreLabelBinding bind(@NonNull View view) {
        if (view != null) {
            return new PfHeytapBusinessWidgetItemNearStoreLabelBinding((AppCompatTextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static PfHeytapBusinessWidgetItemNearStoreLabelBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PfHeytapBusinessWidgetItemNearStoreLabelBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.pf_heytap_business_widget_item_near_store_label, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public AppCompatTextView getRoot() {
        return this.rootView;
    }
}

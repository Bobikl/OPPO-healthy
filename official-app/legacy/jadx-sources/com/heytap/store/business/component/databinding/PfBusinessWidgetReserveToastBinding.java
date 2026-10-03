package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.business.component.R;

/* JADX INFO: loaded from: classes4.dex */
public final class PfBusinessWidgetReserveToastBinding implements ViewBinding {

    @NonNull
    public final TextView pfProductProductDetailOrderResultToastContent;

    @NonNull
    private final LinearLayout rootView;

    private PfBusinessWidgetReserveToastBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.pfProductProductDetailOrderResultToastContent = textView;
    }

    @NonNull
    public static PfBusinessWidgetReserveToastBinding bind(@NonNull View view) {
        int i = R.id.pf_product_product_detail_order_result_toast_content;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            return new PfBusinessWidgetReserveToastBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PfBusinessWidgetReserveToastBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PfBusinessWidgetReserveToastBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.pf_business_widget_reserve_toast, viewGroup, false);
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

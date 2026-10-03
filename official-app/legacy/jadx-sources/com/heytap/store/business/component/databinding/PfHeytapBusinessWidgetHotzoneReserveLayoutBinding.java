package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.business.component.R;

/* JADX INFO: loaded from: classes4.dex */
public final class PfHeytapBusinessWidgetHotzoneReserveLayoutBinding implements ViewBinding {

    @NonNull
    public final AppCompatTextView btnReserve;

    @NonNull
    public final ConstraintLayout clBtnReserve;

    @NonNull
    public final FrameLayout flWipes;

    @NonNull
    public final AppCompatImageView imgReserveTonext;

    @NonNull
    public final AppCompatImageView imgWipes;

    @NonNull
    private final View rootView;

    @NonNull
    public final AppCompatTextView tvReserveCount;

    private PfHeytapBusinessWidgetHotzoneReserveLayoutBinding(@NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = view;
        this.btnReserve = appCompatTextView;
        this.clBtnReserve = constraintLayout;
        this.flWipes = frameLayout;
        this.imgReserveTonext = appCompatImageView;
        this.imgWipes = appCompatImageView2;
        this.tvReserveCount = appCompatTextView2;
    }

    @NonNull
    public static PfHeytapBusinessWidgetHotzoneReserveLayoutBinding bind(@NonNull View view) {
        int i = R.id.btn_reserve;
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(i);
        if (appCompatTextView != null) {
            i = R.id.cl_btn_reserve;
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(i);
            if (constraintLayout != null) {
                i = R.id.fl_wipes;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
                if (frameLayout != null) {
                    i = R.id.img_reserve_tonext;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(i);
                    if (appCompatImageView != null) {
                        i = R.id.img_wipes;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(i);
                        if (appCompatImageView2 != null) {
                            i = R.id.tv_reserve_count;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(i);
                            if (appCompatTextView2 != null) {
                                return new PfHeytapBusinessWidgetHotzoneReserveLayoutBinding(view, appCompatTextView, constraintLayout, frameLayout, appCompatImageView, appCompatImageView2, appCompatTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PfHeytapBusinessWidgetHotzoneReserveLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.pf_heytap_business_widget_hotzone_reserve_layout, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

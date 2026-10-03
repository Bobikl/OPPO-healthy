package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.business.component.R;

/* JADX INFO: loaded from: classes4.dex */
public final class PfHeytapBusinessWidgetCardPendantLayoutBinding implements ViewBinding {

    @NonNull
    public final AppCompatTextView cardPendantContent;

    @NonNull
    public final AppCompatImageView cardPendantImage;

    @NonNull
    private final View rootView;

    private PfHeytapBusinessWidgetCardPendantLayoutBinding(@NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatImageView appCompatImageView) {
        this.rootView = view;
        this.cardPendantContent = appCompatTextView;
        this.cardPendantImage = appCompatImageView;
    }

    @NonNull
    public static PfHeytapBusinessWidgetCardPendantLayoutBinding bind(@NonNull View view) {
        int i = R.id.card_pendant_content;
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(i);
        if (appCompatTextView != null) {
            i = R.id.card_pendant_image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(i);
            if (appCompatImageView != null) {
                return new PfHeytapBusinessWidgetCardPendantLayoutBinding(view, appCompatTextView, appCompatImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PfHeytapBusinessWidgetCardPendantLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.pf_heytap_business_widget_card_pendant_layout, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

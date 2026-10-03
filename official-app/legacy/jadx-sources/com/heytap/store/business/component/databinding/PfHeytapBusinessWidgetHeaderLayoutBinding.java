package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.business.component.R;

/* JADX INFO: loaded from: classes4.dex */
public final class PfHeytapBusinessWidgetHeaderLayoutBinding implements ViewBinding {

    @NonNull
    public final TextView idLeftTitle;

    @NonNull
    public final ImageView idTitleBg;

    @NonNull
    private final View rootView;

    @NonNull
    public final AppCompatTextView tvMoreTitle2;

    private PfHeytapBusinessWidgetHeaderLayoutBinding(@NonNull View view, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = view;
        this.idLeftTitle = textView;
        this.idTitleBg = imageView;
        this.tvMoreTitle2 = appCompatTextView;
    }

    @NonNull
    public static PfHeytapBusinessWidgetHeaderLayoutBinding bind(@NonNull View view) {
        int i = R.id.id_left_title;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = R.id.id_title_bg;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = R.id.tv_more_title2;
                AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(i);
                if (appCompatTextView != null) {
                    return new PfHeytapBusinessWidgetHeaderLayoutBinding(view, textView, imageView, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PfHeytapBusinessWidgetHeaderLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.pf_heytap_business_widget_header_layout, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.business.component.R;
import com.heytap.store.business.component.widget.assist.OStoreAssistCardLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class PfHeytapBusinessItemAssistCardLayoutBinding implements ViewBinding {

    @NonNull
    public final TextView cCardBtn;

    @NonNull
    public final AppCompatImageView cCardImg;

    @NonNull
    public final ConstraintLayout cCardLayout;

    @NonNull
    public final TextView cCardSubContent;

    @NonNull
    public final TextView cCardSubExtContent;

    @NonNull
    public final TextView cCardSubExtDesc;

    @NonNull
    public final LinearLayoutCompat cCardSubTagLayout;

    @NonNull
    public final TextView cCardTitle;

    @NonNull
    private final OStoreAssistCardLayout rootView;

    private PfHeytapBusinessItemAssistCardLayoutBinding(@NonNull OStoreAssistCardLayout oStoreAssistCardLayout, @NonNull TextView textView, @NonNull AppCompatImageView appCompatImageView, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull TextView textView5) {
        this.rootView = oStoreAssistCardLayout;
        this.cCardBtn = textView;
        this.cCardImg = appCompatImageView;
        this.cCardLayout = constraintLayout;
        this.cCardSubContent = textView2;
        this.cCardSubExtContent = textView3;
        this.cCardSubExtDesc = textView4;
        this.cCardSubTagLayout = linearLayoutCompat;
        this.cCardTitle = textView5;
    }

    @NonNull
    public static PfHeytapBusinessItemAssistCardLayoutBinding bind(@NonNull View view) {
        int i = R.id.c_card_btn;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = R.id.c_card_img;
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(i);
            if (appCompatImageView != null) {
                i = R.id.c_card_layout;
                ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(i);
                if (constraintLayout != null) {
                    i = R.id.c_card_sub_content;
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null) {
                        i = R.id.c_card_sub_ext_content;
                        TextView textView3 = (TextView) view.findViewById(i);
                        if (textView3 != null) {
                            i = R.id.c_card_sub_ext_desc;
                            TextView textView4 = (TextView) view.findViewById(i);
                            if (textView4 != null) {
                                i = R.id.c_card_sub_tag_layout;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view.findViewById(i);
                                if (linearLayoutCompat != null) {
                                    i = R.id.c_card_title;
                                    TextView textView5 = (TextView) view.findViewById(i);
                                    if (textView5 != null) {
                                        return new PfHeytapBusinessItemAssistCardLayoutBinding((OStoreAssistCardLayout) view, textView, appCompatImageView, constraintLayout, textView2, textView3, textView4, linearLayoutCompat, textView5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PfHeytapBusinessItemAssistCardLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PfHeytapBusinessItemAssistCardLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.pf_heytap_business_item_assist_card_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public OStoreAssistCardLayout getRoot() {
        return this.rootView;
    }
}

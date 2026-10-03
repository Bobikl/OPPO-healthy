package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.business.component.R;
import com.heytap.store.business.component.widget.assist.AssistCardRecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class PfHeytapBusinessWidgetAssistCardLayoutBinding implements ViewBinding {

    @NonNull
    public final AppCompatImageView imgAssistCardBg;

    @NonNull
    public final AssistCardRecyclerView recyclerAssistCard;

    @NonNull
    private final View rootView;

    @NonNull
    public final AppCompatTextView tvAssistCardTitle;

    @NonNull
    public final View vAssistCardBottom;

    private PfHeytapBusinessWidgetAssistCardLayoutBinding(@NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull AssistCardRecyclerView assistCardRecyclerView, @NonNull AppCompatTextView appCompatTextView, @NonNull View view2) {
        this.rootView = view;
        this.imgAssistCardBg = appCompatImageView;
        this.recyclerAssistCard = assistCardRecyclerView;
        this.tvAssistCardTitle = appCompatTextView;
        this.vAssistCardBottom = view2;
    }

    @NonNull
    public static PfHeytapBusinessWidgetAssistCardLayoutBinding bind(@NonNull View view) {
        View viewFindViewById;
        int i = R.id.img_assist_card_bg;
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(i);
        if (appCompatImageView != null) {
            i = R.id.recycler_assist_card;
            AssistCardRecyclerView assistCardRecyclerView = (AssistCardRecyclerView) view.findViewById(i);
            if (assistCardRecyclerView != null) {
                i = R.id.tv_assist_card_title;
                AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(i);
                if (appCompatTextView != null && (viewFindViewById = view.findViewById((i = R.id.v_assist_card_bottom))) != null) {
                    return new PfHeytapBusinessWidgetAssistCardLayoutBinding(view, appCompatImageView, assistCardRecyclerView, appCompatTextView, viewFindViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PfHeytapBusinessWidgetAssistCardLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.pf_heytap_business_widget_assist_card_layout, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

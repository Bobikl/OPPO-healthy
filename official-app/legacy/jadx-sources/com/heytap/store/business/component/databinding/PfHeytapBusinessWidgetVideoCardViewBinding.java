package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.business.component.R;

/* JADX INFO: loaded from: classes4.dex */
public final class PfHeytapBusinessWidgetVideoCardViewBinding implements ViewBinding {

    @NonNull
    public final ViewStub cardFormVideoView;

    @NonNull
    public final ImageView cardImgView;

    @NonNull
    private final View rootView;

    private PfHeytapBusinessWidgetVideoCardViewBinding(@NonNull View view, @NonNull ViewStub viewStub, @NonNull ImageView imageView) {
        this.rootView = view;
        this.cardFormVideoView = viewStub;
        this.cardImgView = imageView;
    }

    @NonNull
    public static PfHeytapBusinessWidgetVideoCardViewBinding bind(@NonNull View view) {
        int i = R.id.card_form_video_view;
        ViewStub viewStub = (ViewStub) view.findViewById(i);
        if (viewStub != null) {
            i = R.id.card_img_view;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                return new PfHeytapBusinessWidgetVideoCardViewBinding(view, viewStub, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PfHeytapBusinessWidgetVideoCardViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.pf_heytap_business_widget_video_card_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

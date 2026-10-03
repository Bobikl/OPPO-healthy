package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.business.component.R;
import com.heytap.store.business.component.view.OStoreHeaderView;

/* JADX INFO: loaded from: classes4.dex */
public final class PfHeytapBusinessWidgetStoreChangeNewBinding implements ViewBinding {

    @NonNull
    public final TextView btnRecycle;

    @NonNull
    public final ConstraintLayout cardContainer;

    @NonNull
    public final OStoreHeaderView headerContainer;

    @NonNull
    public final ImageView ivDeviceIcon;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView tvPrice;

    @NonNull
    public final TextView tvPricePrefix;

    @NonNull
    public final TextView tvPriceSign;

    @NonNull
    public final TextView tvPriceSubsidy;

    @NonNull
    public final TextView tvTakeDevice;

    @NonNull
    public final TextView tvTitle;

    private PfHeytapBusinessWidgetStoreChangeNewBinding(@NonNull View view, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout, @NonNull OStoreHeaderView oStoreHeaderView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.rootView = view;
        this.btnRecycle = textView;
        this.cardContainer = constraintLayout;
        this.headerContainer = oStoreHeaderView;
        this.ivDeviceIcon = imageView;
        this.tvPrice = textView2;
        this.tvPricePrefix = textView3;
        this.tvPriceSign = textView4;
        this.tvPriceSubsidy = textView5;
        this.tvTakeDevice = textView6;
        this.tvTitle = textView7;
    }

    @NonNull
    public static PfHeytapBusinessWidgetStoreChangeNewBinding bind(@NonNull View view) {
        int i = R.id.btn_recycle;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = R.id.card_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(i);
            if (constraintLayout != null) {
                i = R.id.header_container;
                OStoreHeaderView oStoreHeaderView = (OStoreHeaderView) view.findViewById(i);
                if (oStoreHeaderView != null) {
                    i = R.id.iv_device_icon;
                    ImageView imageView = (ImageView) view.findViewById(i);
                    if (imageView != null) {
                        i = R.id.tv_price;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            i = R.id.tv_price_prefix;
                            TextView textView3 = (TextView) view.findViewById(i);
                            if (textView3 != null) {
                                i = R.id.tv_price_sign;
                                TextView textView4 = (TextView) view.findViewById(i);
                                if (textView4 != null) {
                                    i = R.id.tv_price_subsidy;
                                    TextView textView5 = (TextView) view.findViewById(i);
                                    if (textView5 != null) {
                                        i = R.id.tv_take_device;
                                        TextView textView6 = (TextView) view.findViewById(i);
                                        if (textView6 != null) {
                                            i = R.id.tv_title;
                                            TextView textView7 = (TextView) view.findViewById(i);
                                            if (textView7 != null) {
                                                return new PfHeytapBusinessWidgetStoreChangeNewBinding(view, textView, constraintLayout, oStoreHeaderView, imageView, textView2, textView3, textView4, textView5, textView6, textView7);
                                            }
                                        }
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
    public static PfHeytapBusinessWidgetStoreChangeNewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.pf_heytap_business_widget_store_change_new, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

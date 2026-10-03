package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.business.component.R;

/* JADX INFO: loaded from: classes4.dex */
public final class LayoutLanternBubbleViewBinding implements ViewBinding {

    @NonNull
    public final FrameLayout flWipes;

    @NonNull
    public final AppCompatImageView imgWipes;

    @NonNull
    private final View rootView;

    @NonNull
    public final TextView tvItemBubble;

    private LayoutLanternBubbleViewBinding(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView) {
        this.rootView = view;
        this.flWipes = frameLayout;
        this.imgWipes = appCompatImageView;
        this.tvItemBubble = textView;
    }

    @NonNull
    public static LayoutLanternBubbleViewBinding bind(@NonNull View view) {
        int i = R.id.fl_wipes;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
        if (frameLayout != null) {
            i = R.id.img_wipes;
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(i);
            if (appCompatImageView != null) {
                i = R.id.tv_item_bubble;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    return new LayoutLanternBubbleViewBinding(view, frameLayout, appCompatImageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutLanternBubbleViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.layout_lantern_bubble_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

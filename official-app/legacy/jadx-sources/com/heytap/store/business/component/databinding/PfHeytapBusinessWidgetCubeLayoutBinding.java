package com.heytap.store.business.component.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.heytap.store.business.component.R;
import com.heytap.store.business.component.view.OStoreHeaderView;

/* JADX INFO: loaded from: classes4.dex */
public final class PfHeytapBusinessWidgetCubeLayoutBinding implements ViewBinding {

    @NonNull
    public final ImageView cubeBg;

    @NonNull
    public final OStoreHeaderView cubeHeader;

    @NonNull
    public final RecyclerView idCubeContentView;

    @NonNull
    private final View rootView;

    private PfHeytapBusinessWidgetCubeLayoutBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull OStoreHeaderView oStoreHeaderView, @NonNull RecyclerView recyclerView) {
        this.rootView = view;
        this.cubeBg = imageView;
        this.cubeHeader = oStoreHeaderView;
        this.idCubeContentView = recyclerView;
    }

    @NonNull
    public static PfHeytapBusinessWidgetCubeLayoutBinding bind(@NonNull View view) {
        int i = R.id.cube_bg;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.cube_header;
            OStoreHeaderView oStoreHeaderView = (OStoreHeaderView) view.findViewById(i);
            if (oStoreHeaderView != null) {
                i = R.id.id_cube_content_view;
                RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
                if (recyclerView != null) {
                    return new PfHeytapBusinessWidgetCubeLayoutBinding(view, imageView, oStoreHeaderView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PfHeytapBusinessWidgetCubeLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.pf_heytap_business_widget_cube_layout, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}

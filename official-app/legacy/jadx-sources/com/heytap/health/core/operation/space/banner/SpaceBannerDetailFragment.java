package com.heytap.health.core.operation.space.banner;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.model.SpaceCardMetaData;
import com.heytap.databaseengine.model.SpaceInfo;
import com.heytap.health.base.base.BaseFragment;
import com.heytap.health.base.track.a;
import com.heytap.health.operations.R$layout;
import com.oplus.aiunit.vision.kui;
import com.oplus.aiunit.vision.vik;

/* JADX INFO: loaded from: classes16.dex */
public class SpaceBannerDetailFragment extends BaseFragment {
    public static final String KEY_SPACE_DETAIL_DATA = "KEY_SPACE_DETAIL_DATA";
    public static final String KEY_SPACE_DETAIL_POSITION = "KEY_SPACE_DETAIL_POSITION";
    public static final String KEY_SPACE_DETAIL_SPACE = "KEY_SPACE_DETAIL_SPACE";
    public SpaceInfo o;
    public SpaceCardMetaData p;
    public int q;

    public static SpaceBannerDetailFragment c0(SpaceInfo spaceInfo, SpaceCardMetaData spaceCardMetaData, int i) {
        SpaceBannerDetailFragment spaceBannerDetailFragment = new SpaceBannerDetailFragment();
        spaceBannerDetailFragment.o = spaceInfo;
        spaceBannerDetailFragment.p = spaceCardMetaData;
        spaceBannerDetailFragment.q = i;
        return spaceBannerDetailFragment;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public int getLayoutId() {
        return R$layout.lib_core_view_space_banner_detail;
    }

    @Override // com.heytap.health.base.base.BaseFragment
    @SuppressLint({"AutoDispose"})
    public void initData() {
        StringBuilder sb = new StringBuilder();
        sb.append("initData mMetaData ");
        sb.append(this.p);
        SpaceCardMetaData spaceCardMetaData = this.p;
        if (spaceCardMetaData != null) {
            new kui().e(getView(), this.o, spaceCardMetaData, this.q);
        }
    }

    @Override // com.heytap.health.base.base.BaseFragment
    public void initView(View view) {
        a.x().a(vik.TAG_MODULE_ID, -1).b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSaveInstanceState ");
        sb.append(bundle);
    }
}

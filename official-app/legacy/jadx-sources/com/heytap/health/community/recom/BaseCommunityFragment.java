package com.heytap.health.community.recom;

import com.heytap.health.base.base.BaseFragment;
import com.oplus.aiunit.vision.z6k;
import com.oplus.channel.client.data.Action;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/heytap/health/community/recom/BaseCommunityFragment;", "Lcom/heytap/health/base/base/BaseFragment;", "", "c0", "scrollToTop", "onResume", "", Action.EXPOSED_STATE_VALUE_HIDDEN, "onHiddenChanged", "<init>", "()V", "PostType", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public abstract class BaseCommunityFragment extends BaseFragment {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/health/community/recom/BaseCommunityFragment$PostType;", "", "(Ljava/lang/String;I)V", "FOLLOWED", "FEATURED", "SEARCH_POST", "RECOMMEND", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum PostType {
        FOLLOWED,
        FEATURED,
        SEARCH_POST,
        RECOMMEND
    }

    public abstract void c0();

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (isVisible()) {
            z6k.INSTANCE.a(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (isVisible()) {
            z6k.INSTANCE.a(this);
        }
    }

    public abstract void scrollToTop();
}

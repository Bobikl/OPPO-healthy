package com.heytap.health.home;

import android.view.View;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.coui.appcompat.toolbar.COUIToolbar;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\n"}, d2 = {"Lcom/heytap/health/home/HomeToolbarMenuService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Lcom/coui/appcompat/toolbar/COUIToolbar;", "toolbar", "", "isCommunityAvatar", "Landroid/view/View$OnClickListener;", "onClickListener", "", "x0", "home_release"}, k = 1, mv = {1, 8, 0})
public interface HomeToolbarMenuService extends IProvider {
    void x0(@NotNull COUIToolbar toolbar, boolean isCommunityAvatar, @Nullable View.OnClickListener onClickListener);
}

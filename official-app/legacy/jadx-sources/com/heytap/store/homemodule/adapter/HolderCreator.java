package com.heytap.store.homemodule.adapter;

import android.view.ViewGroup;
import com.heytap.store.base.widget.recyclerview.BaseRViewHolder;
import com.heytap.store.homemodule.data.HomeDataBean;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/heytap/store/homemodule/adapter/HolderCreator;", "", "create", "Lcom/heytap/store/base/widget/recyclerview/BaseRViewHolder;", "Lcom/heytap/store/homemodule/data/HomeDataBean;", "homeEnvironment", "Lcom/heytap/store/homemodule/adapter/HomeEnvironment;", "parent", "Landroid/view/ViewGroup;", ParserTag.VIEW_TYPE, "", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface HolderCreator {
    @Nullable
    BaseRViewHolder<HomeDataBean> create(@NotNull HomeEnvironment homeEnvironment, @NotNull ViewGroup parent, int viewType);
}

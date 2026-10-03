package com.oppo.store.web;

import androidx.databinding.ViewDataBinding;
import com.heytap.store.base.core.activity.StoreBackInterceptActivity;
import com.heytap.store.platform.mvvm.BaseViewModel;
import com.oppo.store.web.jsbridge.javacalljs.JavaCallJs;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/oppo/store/web/AbstractWebCallbackActivity;", "Lcom/heytap/store/base/core/activity/StoreBackInterceptActivity;", "Lcom/heytap/store/platform/mvvm/BaseViewModel;", "Landroidx/databinding/ViewDataBinding;", "()V", "doLogin", "", "jsCallback", "Lcom/oppo/store/web/jsbridge/javacalljs/JavaCallJs;", "isRefresh", "", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class AbstractWebCallbackActivity extends StoreBackInterceptActivity<BaseViewModel, ViewDataBinding> {
    public abstract void doLogin(@Nullable JavaCallJs jsCallback, boolean isRefresh);
}

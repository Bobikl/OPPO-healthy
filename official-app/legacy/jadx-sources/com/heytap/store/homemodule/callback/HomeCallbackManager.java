package com.heytap.store.homemodule.callback;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.heytap.store.homeservice.IHomeCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001J(\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/heytap/store/homemodule/callback/HomeCallbackManager;", "Lcom/heytap/store/homeservice/IHomeCallback;", "()V", "callbacks", "", "addCallback", "", "callback", "onChildViewScrolled", "activity", "Landroid/app/Activity;", "fragment", "Landroidx/fragment/app/Fragment;", "subFragment", "scrollY", "", "removeCallback", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HomeCallbackManager implements IHomeCallback {

    @NotNull
    public static final HomeCallbackManager INSTANCE = new HomeCallbackManager();

    @NotNull
    private static final List<IHomeCallback> callbacks = new ArrayList();

    private HomeCallbackManager() {
    }

    public final void addCallback(@NotNull IHomeCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callbacks.add(callback);
    }

    @Override // com.heytap.store.homeservice.IHomeCallback
    public void onChildViewScrolled(@NotNull Activity activity, @NotNull Fragment fragment, @NotNull Fragment subFragment, int scrollY) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(subFragment, "subFragment");
        Iterator<T> it = callbacks.iterator();
        while (it.hasNext()) {
            ((IHomeCallback) it.next()).onChildViewScrolled(activity, fragment, subFragment, scrollY);
        }
    }

    public final void removeCallback(@NotNull IHomeCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        callbacks.remove(callback);
    }
}

package com.heytap.store.homemodule.helper;

import android.text.TextUtils;
import com.heytap.store.homemodule.data.HomeTabItemBean;
import com.heytap.store.platform.tools.LogUtils;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B;\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007¢\u0006\u0002\u0010\fJ\u0016\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\bH\u0002J\u0006\u0010\u0014\u001a\u00020\u0005J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J\u0006\u0010\u0017\u001a\u00020\bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/heytap/store/homemodule/helper/DeepLinkHelper;", "", "action", "Lkotlin/Function1;", "", "", "accept", "Lkotlin/Function0;", "", "dataSource", "", "Lcom/heytap/store/homemodule/data/HomeTabItemBean;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "pendingDeepLinkTarget", "Lcom/heytap/store/homemodule/helper/DeepLinkTarget;", "deepLinkToTab", "index", "channel", "", "deeplinkToTabImpl", "executePendingDeepLink", "findDeepLinkTargetIndex", "target", "isFromDeepLink", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DeepLinkHelper {

    @NotNull
    private final Function0<Boolean> accept;

    @NotNull
    private final Function1<Integer, Unit> action;

    @NotNull
    private final Function0<List<HomeTabItemBean>> dataSource;

    @Nullable
    private DeepLinkTarget pendingDeepLinkTarget;

    /* JADX WARN: Multi-variable type inference failed */
    public DeepLinkHelper(@NotNull Function1<? super Integer, Unit> action, @NotNull Function0<Boolean> accept, @NotNull Function0<? extends List<HomeTabItemBean>> dataSource) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(accept, "accept");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.action = action;
        this.accept = accept;
        this.dataSource = dataSource;
    }

    private final boolean deeplinkToTabImpl() {
        int iFindDeepLinkTargetIndex;
        DeepLinkTarget deepLinkTarget = this.pendingDeepLinkTarget;
        if (deepLinkTarget == null || (iFindDeepLinkTargetIndex = findDeepLinkTargetIndex(deepLinkTarget)) < 0) {
            return false;
        }
        this.action.invoke(Integer.valueOf(iFindDeepLinkTargetIndex));
        this.pendingDeepLinkTarget = null;
        return true;
    }

    private final int findDeepLinkTargetIndex(DeepLinkTarget target) {
        List<HomeTabItemBean> listInvoke = this.dataSource.invoke();
        if (!listInvoke.isEmpty() && !target.isEmpty()) {
            if (!StringsKt__StringsJVMKt.isBlank(target.getTargetChannel())) {
                int size = listInvoke.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    if (TextUtils.equals(listInvoke.get(i).getLink(), target.getTargetChannel())) {
                        LogUtils.INSTANCE.d("DeepLinkHelper", "findDeepLinkTargetIndex found channel: target = " + target + ", corresponding index = " + i);
                        return i;
                    }
                    i = i2;
                }
            }
            if (target.getTargetIndex() >= 0 && target.getTargetIndex() < listInvoke.size()) {
                LogUtils.INSTANCE.d("DeepLinkHelper", "findDeepLinkTargetIndex found index: target = " + target + ", corresponding index = " + target.getTargetIndex());
                return target.getTargetIndex();
            }
        }
        return -1;
    }

    public final boolean deepLinkToTab(int index, @NotNull String channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.pendingDeepLinkTarget = new DeepLinkTarget(index, channel);
        if (this.accept.invoke().booleanValue()) {
            return deeplinkToTabImpl();
        }
        return false;
    }

    public final void executePendingDeepLink() {
        deeplinkToTabImpl();
    }

    public final boolean isFromDeepLink() {
        return this.pendingDeepLinkTarget == null;
    }
}

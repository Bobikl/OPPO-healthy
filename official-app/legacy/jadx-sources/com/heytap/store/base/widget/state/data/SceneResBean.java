package com.heytap.store.base.widget.state.data;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/heytap/store/base/widget/state/data/SceneResBean;", "", NotificationCompat.CATEGORY_SYSTEM, "Lcom/heytap/store/base/widget/state/data/ConfigStateResBean;", "net", "(Lcom/heytap/store/base/widget/state/data/ConfigStateResBean;Lcom/heytap/store/base/widget/state/data/ConfigStateResBean;)V", "getNet", "()Lcom/heytap/store/base/widget/state/data/ConfigStateResBean;", "getSys", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class SceneResBean {

    @Nullable
    private final ConfigStateResBean net;

    @Nullable
    private final ConfigStateResBean sys;

    /* JADX WARN: Multi-variable type inference failed */
    public SceneResBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SceneResBean copy$default(SceneResBean sceneResBean, ConfigStateResBean configStateResBean, ConfigStateResBean configStateResBean2, int i, Object obj) {
        if ((i & 1) != 0) {
            configStateResBean = sceneResBean.sys;
        }
        if ((i & 2) != 0) {
            configStateResBean2 = sceneResBean.net;
        }
        return sceneResBean.copy(configStateResBean, configStateResBean2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConfigStateResBean getSys() {
        return this.sys;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConfigStateResBean getNet() {
        return this.net;
    }

    @NotNull
    public final SceneResBean copy(@Nullable ConfigStateResBean sys, @Nullable ConfigStateResBean net2) {
        return new SceneResBean(sys, net2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SceneResBean)) {
            return false;
        }
        SceneResBean sceneResBean = (SceneResBean) other;
        return Intrinsics.areEqual(this.sys, sceneResBean.sys) && Intrinsics.areEqual(this.net, sceneResBean.net);
    }

    @Nullable
    public final ConfigStateResBean getNet() {
        return this.net;
    }

    @Nullable
    public final ConfigStateResBean getSys() {
        return this.sys;
    }

    public int hashCode() {
        ConfigStateResBean configStateResBean = this.sys;
        int iHashCode = (configStateResBean == null ? 0 : configStateResBean.hashCode()) * 31;
        ConfigStateResBean configStateResBean2 = this.net;
        return iHashCode + (configStateResBean2 != null ? configStateResBean2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SceneResBean(sys=" + this.sys + ", net=" + this.net + ')';
    }

    public SceneResBean(@Nullable ConfigStateResBean configStateResBean, @Nullable ConfigStateResBean configStateResBean2) {
        this.sys = configStateResBean;
        this.net = configStateResBean2;
    }

    public /* synthetic */ SceneResBean(ConfigStateResBean configStateResBean, ConfigStateResBean configStateResBean2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : configStateResBean, (i & 2) != 0 ? null : configStateResBean2);
    }
}

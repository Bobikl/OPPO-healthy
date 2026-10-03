package com.oplus.aiunit.vision;

import android.util.ArraySet;
import androidx.lifecycle.LiveData;
import com.heytap.health.devicemanager.processor.bean.OobeStatusBean;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.wearable.linkservice.sdk.Node;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\f\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rH&¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/ul4;", "", "Lcom/oplus/aiunit/vision/ul4$a;", "listener", "", b2n.f, "d", "Lcom/oplus/aiunit/vision/ul4$b;", LogFieldKey.LEVEL_KEY, "j", "Landroidx/lifecycle/LiveData;", "Lcom/heytap/health/devicemanager/processor/bean/OobeStatusBean;", "a", "Lcom/oplus/aiunit/vision/bld;", b2n.g, "b", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface ul4 {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/ul4$a;", "", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "", "onPeerConnected", "onPeerDisconnected", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void onPeerConnected(@NotNull Node node);

        void onPeerDisconnected(@NotNull Node node);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/ul4$b;", "", "Landroid/util/ArraySet;", "Lcom/oplus/aiunit/vision/auc;", "interests", "", "getInterestingStatus", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "nodeStatus", "d", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public interface b {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public static void a(@NotNull b bVar, @NotNull Node node, @NotNull auc nodeStatus) {
                Intrinsics.checkNotNullParameter(node, "node");
                Intrinsics.checkNotNullParameter(nodeStatus, "nodeStatus");
            }
        }

        void d(@NotNull Node node, @NotNull auc nodeStatus);

        void getInterestingStatus(@NotNull ArraySet<auc> interests);
    }

    @NotNull
    LiveData<OobeStatusBean> a();

    void d(@NotNull a listener);

    void g(@NotNull a listener);

    void h(@NotNull bld listener);

    void j(@NotNull b listener);

    void l(@NotNull b listener);
}

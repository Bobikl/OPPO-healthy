package com.oplus.aiunit.vision;

import android.util.ArraySet;
import androidx.lifecycle.LiveData;
import com.heytap.health.devicemanager.processor.bean.OobeStatusBean;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.wearable.linkservice.sdk.Node;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u000fH&¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/wl4;", "", "Lcom/oplus/aiunit/vision/ra5;", "role", "Lcom/oplus/aiunit/vision/wl4$a;", "listener", "", "i", "f", "Lcom/oplus/aiunit/vision/wl4$b;", MapSchema.FIELD_NAME_ENTRY, "c", "Landroidx/lifecycle/LiveData;", "Lcom/heytap/health/devicemanager/processor/bean/OobeStatusBean;", MapSchema.FIELD_NAME_KEY, "Lcom/oplus/aiunit/vision/wl4$c;", "b", "a", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface wl4 {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/wl4$a;", "", "Lcom/oplus/aiunit/vision/ra5$c;", "role", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "", "f", LogFieldKey.MESSAGE_KEY, "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void f(@NotNull ra5.c role, @NotNull Node node);

        void m(@NotNull ra5.c role, @NotNull Node node);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J \u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/wl4$b;", "", "Landroid/util/ArraySet;", "Lcom/oplus/aiunit/vision/auc;", "interests", "Lcom/oplus/aiunit/vision/ra5;", "getInterestingStatus", "Lcom/oplus/aiunit/vision/ra5$c;", "role", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "nodeStatus", "", "onNodeStatusChanged", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public interface b {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public static void a(@NotNull b bVar, @NotNull ra5.c role, @NotNull Node node, @NotNull auc nodeStatus) {
                Intrinsics.checkNotNullParameter(role, "role");
                Intrinsics.checkNotNullParameter(node, "node");
                Intrinsics.checkNotNullParameter(nodeStatus, "nodeStatus");
            }
        }

        @NotNull
        ra5 getInterestingStatus(@NotNull ArraySet<auc> interests);

        void onNodeStatusChanged(@NotNull ra5.c role, @NotNull Node node, @NotNull auc nodeStatus);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/wl4$c;", "", "Lcom/oplus/aiunit/vision/ra5$c;", "role", "", "mac", "", "oobeFinish", "", "a", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public interface c {
        void a(@NotNull ra5.c role, @NotNull String mac, boolean oobeFinish);
    }

    void b(@NotNull ra5 role, @NotNull c listener);

    void c(@NotNull b listener);

    void e(@NotNull b listener);

    void f(@NotNull ra5 role, @NotNull a listener);

    void i(@NotNull ra5 role, @NotNull a listener);

    @NotNull
    LiveData<OobeStatusBean> k(@NotNull ra5 role);
}

package com.oplus.aiunit.vision;

import com.heytap.health.watchpair.manager.DeviceResDownloadManager;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/oplus/aiunit/vision/vrf;", "", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public interface vrf {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        @NotNull
        public static File a(@NotNull vrf vrfVar, @NotNull String receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return new File(DeviceResDownloadManager.v(), receiver);
        }
    }
}

package com.oplus.aiunit.vision;

import com.heytap.setup.libraries.wear.companion.setup.SetupEngine;
import com.heytap.setup.libraries.wear.companion.setup.SetupStep;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0003J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/pxg;", "", "Lcom/oplus/aiunit/vision/pxg$a;", "a", "Lcom/heytap/setup/libraries/wear/companion/setup/SetupEngine;", jla.DEFAULT_BUILD_METHOD, "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public interface pxg {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\t\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/pxg$a;", "", "Lcom/heytap/setup/libraries/wear/companion/setup/SetupStep;", "setupStep", "", "isPointOfNoReturn", "c", "b", "Lcom/oplus/aiunit/vision/pxg;", "a", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        @NotNull
        pxg a();

        @NotNull
        a b(@NotNull SetupStep setupStep);

        @NotNull
        a c(@NotNull SetupStep setupStep, boolean isPointOfNoReturn);
    }

    @NotNull
    a a();

    @NotNull
    SetupEngine build();
}

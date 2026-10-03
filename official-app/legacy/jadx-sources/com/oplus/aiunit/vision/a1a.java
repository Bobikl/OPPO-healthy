package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.processor.bean.Params;
import com.heytap.health.watchpair.view.WatchView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\bH&J\b\u0010\u000e\u001a\u00020\bH&¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/a1a;", "", "Lcom/heytap/health/devicemanager/processor/bean/Params;", b2n.g, "Lcom/heytap/health/watchpair/view/WatchView;", "watchView", "", "imageUrl", "", "setBlackFace", "", "o", "i", "b", "a", "device_pair_release"}, k = 1, mv = {1, 8, 0})
public interface a1a {
    boolean a();

    boolean b();

    @NotNull
    Params h();

    boolean i(@NotNull WatchView watchView);

    void o(@NotNull WatchView watchView, @Nullable String imageUrl, boolean setBlackFace);
}

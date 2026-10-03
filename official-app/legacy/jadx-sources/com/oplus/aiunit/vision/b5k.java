package com.oplus.aiunit.vision;

import com.amap.api.maps.MapView;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/b5k;", "", "", ParserTag.TAG_ON_ANIMATION_START, "", "showTimeing", "w5", "onAnimationFinished", "Lcom/amap/api/maps/MapView;", "map", "b3", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public interface b5k {
    void b3(@NotNull MapView map);

    void onAnimationFinished();

    void onAnimationStart();

    void w5(float showTimeing);
}

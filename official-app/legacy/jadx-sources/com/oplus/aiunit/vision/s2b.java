package com.oplus.aiunit.vision;

import com.heytap.health.watchface.business.creation.category.livephoto.StyleRequire;
import com.heytap.health.watchface.business.creation.category.livephoto.SupportStyles;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\n\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH&¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/s2b;", "Lcom/oplus/aiunit/vision/mm9;", "Lcom/heytap/health/watchface/business/creation/category/livephoto/SupportStyles;", "supportStyles", "", "message", "", "O3", "", "Lcom/heytap/health/watchface/business/creation/category/livephoto/StyleRequire;", "F4", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public interface s2b extends mm9 {
    void F4(@Nullable List<StyleRequire> supportStyles);

    void O3(@Nullable SupportStyles supportStyles, @NotNull String message);
}

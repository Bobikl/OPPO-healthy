package com.oplus.aiunit.vision;

import com.heytap.health.watchface.business.creation.category.livephoto.ImageTags;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H&J\b\u0010\u000b\u001a\u00020\tH&¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/v0b;", "Lcom/oplus/aiunit/vision/mm9;", "", "errorCode", "", "message", "Ljava/util/ArrayList;", "Lcom/heytap/health/watchface/business/creation/category/livephoto/ImageTags;", "body", "", "N3", "X4", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public interface v0b extends mm9 {
    void N3(int errorCode, @NotNull String message, @Nullable ArrayList<ImageTags> body);

    void X4();
}

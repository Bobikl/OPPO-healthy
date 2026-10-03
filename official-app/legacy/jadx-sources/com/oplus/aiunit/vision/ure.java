package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H&J$\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/ure;", "", "", "key", "value", "", "a", ExifInterface.GPS_DIRECTION_TRUE, ParserTag.TAG_GET, "(Ljava/lang/String;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, 4, 0})
public interface ure {
    void a(@NotNull String key, @NotNull Object value);

    @Nullable
    <T> T get(@NotNull String key);
}

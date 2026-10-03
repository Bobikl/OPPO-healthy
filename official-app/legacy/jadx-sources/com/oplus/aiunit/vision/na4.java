package com.oplus.aiunit.vision;

import com.google.protobuf.ByteString;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/na4;", "", "Lcom/google/protobuf/ByteString;", "str", "", "bytes", "", Fields.WIDTH_FIELD, Fields.HEIGHT_FIELD, "", "a", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public interface na4 {
    void a(@Nullable ByteString str, @Nullable byte[] bytes, int width, int height);
}

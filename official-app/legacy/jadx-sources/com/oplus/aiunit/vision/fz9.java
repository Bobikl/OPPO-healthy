package com.oplus.aiunit.vision;

import com.oplus.nearx.track.internal.record.TrackBean;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\u001c\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002H&J\b\u0010\r\u001a\u00020\u0006H&J\b\u0010\u000e\u001a\u00020\u0006H&J\b\u0010\u000f\u001a\u00020\u0006H&¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/fz9;", "", "", "count", "uploadType", y15.PARAMS_DATA_TYPE, "", "c", "Lcom/oplus/nearx/track/internal/record/TrackBean;", "trackBean", "d", "b", b2n.f, "a", "f", MapSchema.FIELD_NAME_ENTRY, "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public interface fz9 {
    void a();

    void b(@NotNull TrackBean trackBean);

    void c(int count, int uploadType, int dataType);

    void d(@NotNull TrackBean trackBean);

    void e();

    void f();

    void g(int uploadType, int dataType);
}

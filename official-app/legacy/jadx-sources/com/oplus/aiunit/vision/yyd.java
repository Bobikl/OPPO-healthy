package com.oplus.aiunit.vision;

import com.heytap.health.watchface.R$drawable;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\b\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/yyd;", "Lcom/oplus/aiunit/vision/wyd;", "", MapSchema.FIELD_NAME_ENTRY, "f", "c", "<init>", "()V", "Companion", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public class yyd extends wyd {

    @NotNull
    public static final int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final int[] f19197c;

    @NotNull
    public static final int[] d;

    static {
        int i = R$drawable.watch_face_v4_album_default_all;
        b = new int[]{i, i, i};
        int i2 = R$drawable.watch_face_v4pro_album_clock_style_1;
        int i3 = R$drawable.watch_face_v3pro_album_clock_style_2;
        int i4 = R$drawable.watch_face_v3_v3pro_clock_style_3;
        f19197c = new int[]{i2, i3, i4};
        d = new int[]{R$drawable.watch_face_v4pro_clock_style_4, R$drawable.watch_face_v3pro_clock_style_5, i4};
    }

    @Override // com.oplus.aiunit.vision.wyd
    @NotNull
    public int[] c() {
        return b;
    }

    @Override // com.oplus.aiunit.vision.wyd
    @NotNull
    public int[] e() {
        return f19197c;
    }

    @Override // com.oplus.aiunit.vision.wyd
    @NotNull
    public int[] f() {
        return d;
    }
}

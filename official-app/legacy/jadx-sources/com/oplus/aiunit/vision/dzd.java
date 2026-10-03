package com.oplus.aiunit.vision;

import com.heytap.health.watchface.R$drawable;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\n\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0002H\u0014J\b\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/dzd;", "Lcom/oplus/aiunit/vision/czd;", "", MapSchema.FIELD_NAME_ENTRY, "c", "d", b2n.f, b2n.g, "<init>", "()V", "Companion", "a", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public class dzd extends czd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final int[] f10733c = {R$drawable.watch_face_v4round_starriver_clock_style_omoji_1, R$drawable.watch_face_v4round_starriver_clock_style_omoji_2, R$drawable.watch_face_v4round_starriver_clock_style_omoji_3, R$drawable.watch_face_v4round_starriver_clock_style_omoji_4, R$drawable.watch_face_v4round_starriver_clock_style_omoji_5, R$drawable.watch_face_v4round_starriver_clock_style_omoji_6};

    @NotNull
    public static final int[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final int[] f10734e;

    @NotNull
    public static final int[] f;

    static {
        int i = R$drawable.watch_face_v4round_starriver_com_clock_style_2;
        int i2 = R$drawable.watch_face_v4round_starriver_com_clock_style_1;
        int i3 = R$drawable.watch_face_v4round_com_clock_style_3;
        d = new int[]{i, i2, i3};
        f10734e = new int[]{i2, i, i3};
        int i4 = R$drawable.watch_face_v4round_starriver_album_default_bg;
        f = new int[]{i4, i4, i4};
    }

    @Override // com.oplus.aiunit.vision.czd
    @NotNull
    public int[] c() {
        return d;
    }

    @Override // com.oplus.aiunit.vision.czd
    @NotNull
    public int[] d() {
        return d;
    }

    @Override // com.oplus.aiunit.vision.czd
    @NotNull
    public int[] e() {
        return f;
    }

    @Override // com.oplus.aiunit.vision.czd
    @NotNull
    public int[] g() {
        return f10733c;
    }

    @Override // com.oplus.aiunit.vision.czd
    @NotNull
    public int[] h() {
        return f10734e;
    }
}

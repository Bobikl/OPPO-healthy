package com.oplus.aiunit.vision;

import coil.decode.ExifOrientationPolicy;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.collections.SetsKt__SetsKt;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0018\u0010\f\u001a\u00020\u0003*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0018\u0010\r\u001a\u00020\u0003*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcoil/decode/ExifOrientationPolicy;", "", "mimeType", "", "c", "", "a", "Ljava/util/Set;", "RESPECT_PERFORMANCE_MIME_TYPES", "Lcom/oplus/aiunit/vision/yw6;", "b", "(Lcom/oplus/aiunit/vision/yw6;)Z", "isSwapped", "isRotated", "coil-base_release"}, k = 2, mv = {1, 9, 0})
public final class dx6 {

    @NotNull
    public static final Set<String> a = SetsKt__SetsKt.setOf((Object[]) new String[]{j.MIME_TYPE_JPEG, j.MIME_TYPE_WEBP, j.MIME_TYPE_HEIC, j.MIME_TYPE_HEIF});

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExifOrientationPolicy.values().length];
            try {
                iArr[ExifOrientationPolicy.RESPECT_PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExifOrientationPolicy.IGNORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExifOrientationPolicy.RESPECT_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean a(@NotNull yw6 yw6Var) {
        return yw6Var.getRotationDegrees() > 0;
    }

    public static final boolean b(@NotNull yw6 yw6Var) {
        return yw6Var.getRotationDegrees() == 90 || yw6Var.getRotationDegrees() == 270;
    }

    public static final boolean c(@NotNull ExifOrientationPolicy exifOrientationPolicy, @Nullable String str) {
        int i = a.$EnumSwitchMapping$0[exifOrientationPolicy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (str == null || !a.contains(str)) {
            return false;
        }
        return true;
    }
}

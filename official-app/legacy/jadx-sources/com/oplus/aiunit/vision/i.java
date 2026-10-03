package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import coil.size.Scale;
import java.io.IOException;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a$\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\u000e\u0010\b\u001a\u00020\u0007*\u0004\u0018\u00010\u0007H\u0000\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0000\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lokio/BufferedSource;", "Lokio/ByteString;", "bytes", "", "fromIndex", "toIndex", "a", "Landroid/graphics/Bitmap$Config;", "d", "Lcoil/size/c;", "Lcoil/size/Scale;", "scale", "", "c", "", "b", "(Landroid/graphics/Bitmap$Config;)Z", "isHardware", "coil-svg_release"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "-SvgUtils")
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/util/-SvgUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"})
public final class i {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Scale.values().length];
            try {
                iArr[Scale.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final long a(@NotNull BufferedSource bufferedSource, @NotNull ByteString byteString, long j2, long j3) throws IOException {
        if (!(byteString.size() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        byte b = byteString.getByte(0);
        long size = j3 - ((long) byteString.size());
        long j4 = j2;
        while (j4 < size) {
            long jIndexOf = bufferedSource.indexOf(b, j4, size);
            if (jIndexOf == -1 || bufferedSource.rangeEquals(jIndexOf, byteString)) {
                return jIndexOf;
            }
            j4 = jIndexOf + 1;
        }
        return -1L;
    }

    public static final boolean b(@NotNull Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }

    public static final float c(@NotNull coil.size.c cVar, @NotNull Scale scale) {
        if (cVar instanceof coil.size.c.a) {
            return ((coil.size.c.a) cVar).px;
        }
        int i = a.$EnumSwitchMapping$0[scale.ordinal()];
        if (i == 1) {
            return Float.MIN_VALUE;
        }
        if (i == 2) {
            return Float.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final Bitmap.Config d(@Nullable Bitmap.Config config) {
        return (config == null || b(config)) ? Bitmap.Config.ARGB_8888 : config;
    }
}

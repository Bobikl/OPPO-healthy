package com.oplus.aiunit.vision;

import com.adobe.xmp.XMPException;
import io.protostuff.MapSchema;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u001e\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0002R\u001c\u0010\u001a\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/aja;", "", "Lcom/oplus/aiunit/vision/xia;", "jpegSection", "Lkotlin/Pair;", "Lcom/oplus/aiunit/vision/v5m;", "Lcom/oplus/aiunit/vision/kue;", b2n.f, "", "data", "", "f", "xmpMeta", "i", b2n.g, "d", MapSchema.FIELD_NAME_ENTRY, "", "structIndex", "Lcom/oplus/aiunit/vision/kue$b;", "a", "c", "b", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "Ljava/util/logging/Logger;", "logger", "<init>", "()V", "olive-decoder"}, k = 1, mv = {1, 6, 0})
public final class aja {

    @NotNull
    public static final aja INSTANCE = new aja();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Logger logger = Logger.getLogger("JpegXmpParser");

    static {
        try {
            w5m.a().b(l7m.GOOGLE_GCAMERA_NAMESPACE, l7m.CAMERA_PREFIX);
            w5m.a().b(l7m.GOOGLE_OPCAMERA_NAMESPACE, l7m.OPCAMERA_PREFIX);
            w5m.a().b(l7m.GOOGLE_PHOTOS_CONTAINER_NAMESPACE, l7m.CONTAINER_PREFIX);
            w5m.a().b(l7m.GOOGLE_PHOTOS_CONTAINER_ITEM_NAMESPACE, l7m.ITEM_PREFIX);
            w5m.a().b(l7m.GOOGLE_HDR_NAMESPACE, l7m.HDRGM_PREFIX);
        } catch (XMPException unused) {
            logger.warning("JpegXmpParser, [init] failed xmp registerNamespace");
        }
    }

    public final PrimaryXmpInfo.b a(v5m xmpMeta, int structIndex) throws XMPException {
        String value;
        String value2;
        String value3;
        String value4;
        PrimaryXmpInfo.b bVar = new PrimaryXmpInfo.b(null, null, 0, 0, 15, null);
        l7m l7mVar = l7m.INSTANCE;
        g6m g6mVarL = xmpMeta.l(l7m.GOOGLE_PHOTOS_CONTAINER_NAMESPACE, l7mVar.a(structIndex), l7m.GOOGLE_PHOTOS_CONTAINER_ITEM_NAMESPACE, l7m.ITEM_MIME_TYPE_FIELD_NAME);
        String str = "";
        if (g6mVarL == null || (value = g6mVarL.getValue()) == null) {
            value = "";
        }
        bVar.e(value);
        g6m g6mVarL2 = xmpMeta.l(l7m.GOOGLE_PHOTOS_CONTAINER_NAMESPACE, l7mVar.a(structIndex), l7m.GOOGLE_PHOTOS_CONTAINER_ITEM_NAMESPACE, l7m.ITEM_SEMANTIC_FIELD_NAME);
        if (g6mVarL2 != null && (value4 = g6mVarL2.getValue()) != null) {
            str = value4;
        }
        bVar.g(str);
        g6m g6mVarL3 = xmpMeta.l(l7m.GOOGLE_PHOTOS_CONTAINER_NAMESPACE, l7mVar.a(structIndex), l7m.GOOGLE_PHOTOS_CONTAINER_ITEM_NAMESPACE, l7m.ITEM_LENGTH_FIELD_NAME);
        int i = 0;
        bVar.d((g6mVarL3 == null || (value2 = g6mVarL3.getValue()) == null) ? 0 : Integer.parseInt(value2));
        g6m g6mVarL4 = xmpMeta.l(l7m.GOOGLE_PHOTOS_CONTAINER_NAMESPACE, l7mVar.a(structIndex), l7m.GOOGLE_PHOTOS_CONTAINER_ITEM_NAMESPACE, l7m.ITEM_PADDING_FIELD_NAME);
        if (g6mVarL4 != null && (value3 = g6mVarL4.getValue()) != null) {
            i = Integer.parseInt(value3);
        }
        bVar.f(i);
        return bVar;
    }

    public final int b(byte[] data) {
        int length = data.length - 1;
        if (1 <= length) {
            while (true) {
                int i = length - 1;
                if (data[length] == ((byte) 62) && data[length - 1] != ((byte) 63)) {
                    return length + 1;
                }
                if (1 <= i) {
                    length = i;
                }
            }
        }
        return data.length;
    }

    public final v5m c(Section jpegSection) {
        if (!f(jpegSection.a())) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            int iB = INSTANCE.b(jpegSection.a()) - 29;
            byte[] bArr = new byte[iB];
            System.arraycopy(jpegSection.a(), 29, bArr, 0, iB);
            return w5m.b(bArr);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            if (thM5290exceptionOrNullimpl == null) {
                return null;
            }
            logger.warning(Intrinsics.stringPlus("JpegXmpParser, [getXmpMeta] failed:", thM5290exceptionOrNullimpl.getMessage()));
            return null;
        }
    }

    public final boolean d(v5m xmpMeta) {
        return xmpMeta.p(l7m.GOOGLE_GCAMERA_NAMESPACE, l7m.MOTION_PHOTO_PROP_NAME_V1) != null;
    }

    public final boolean e(v5m xmpMeta) {
        return xmpMeta.p(l7m.GOOGLE_GCAMERA_NAMESPACE, l7m.MOTION_PHOTO_PROP_NAME) != null;
    }

    public final boolean f(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length < 29) {
            return false;
        }
        try {
            byte[] bArr = new byte[29];
            System.arraycopy(data, 0, bArr, 0, 29);
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(\"UTF-8\")");
            return Intrinsics.areEqual(new String(bArr, charsetForName), l7m.XMP_HEADER);
        } catch (UnsupportedEncodingException e2) {
            logger.warning(Intrinsics.stringPlus("isXmpSection error, ", e2));
            return false;
        }
    }

    @Nullable
    public final Pair<v5m, PrimaryXmpInfo> g(@NotNull Section jpegSection) throws XMPException {
        Intrinsics.checkNotNullParameter(jpegSection, "jpegSection");
        v5m v5mVarC = c(jpegSection);
        if (v5mVarC == null) {
            return null;
        }
        if (d(v5mVarC)) {
            return h(v5mVarC);
        }
        if (e(v5mVarC)) {
            return i(v5mVarC);
        }
        PrimaryXmpInfo primaryXmpInfo = new PrimaryXmpInfo();
        int iO = v5mVarC.o(l7m.GOOGLE_PHOTOS_CONTAINER_NAMESPACE, l7m.CONTAINER_DIRECTORY);
        if (iO > 0) {
            primaryXmpInfo.p(new ArrayList());
            int i = 0;
            while (i < iO) {
                int i2 = i + 1;
                List<PrimaryXmpInfo.b> listA = primaryXmpInfo.a();
                if (listA != null) {
                    listA.add(a(v5mVarC, i));
                }
                i = i2;
            }
        }
        return new Pair<>(v5mVarC, primaryXmpInfo);
    }

    public final Pair<v5m, PrimaryXmpInfo> h(v5m xmpMeta) {
        return null;
    }

    public final Pair<v5m, PrimaryXmpInfo> i(v5m xmpMeta) throws XMPException {
        String value;
        String value2;
        String value3;
        String value4;
        String value5;
        String value6;
        String value7;
        String value8;
        String value9;
        String value10;
        String value11;
        PrimaryXmpInfo primaryXmpInfo = new PrimaryXmpInfo();
        primaryXmpInfo.r(2);
        g6m g6mVarP = xmpMeta.p(l7m.GOOGLE_GCAMERA_NAMESPACE, l7m.MOTION_PHOTO_PROP_NAME);
        int i = (g6mVarP == null || (value = g6mVarP.getValue()) == null) ? 0 : Integer.parseInt(value);
        g6m g6mVarP2 = xmpMeta.p(l7m.GOOGLE_GCAMERA_NAMESPACE, l7m.MOTION_PHOTO_PROP_VERSION);
        String str = "";
        if (g6mVarP2 != null && (value11 = g6mVarP2.getValue()) != null) {
            str = value11;
        }
        g6m g6mVarP3 = xmpMeta.p(l7m.GOOGLE_GCAMERA_NAMESPACE, l7m.MOTION_PHOTO_PRESET_TIMESTAMP);
        long j2 = 0;
        long j3 = (g6mVarP3 == null || (value2 = g6mVarP3.getValue()) == null) ? 0L : Long.parseLong(value2);
        g6m g6mVarP4 = xmpMeta.p(l7m.GOOGLE_OPCAMERA_NAMESPACE, l7m.OPCAMERA_MOTION_PHOTO_PRIMARY_PRESET_TIMESTAMP);
        long j4 = -1;
        if (g6mVarP4 != null && (value10 = g6mVarP4.getValue()) != null) {
            j4 = Long.parseLong(value10);
        }
        g6m g6mVarP5 = xmpMeta.p(l7m.GOOGLE_HDR_NAMESPACE, l7m.HDR_VERSION);
        String value12 = g6mVarP5 == null ? null : g6mVarP5.getValue();
        g6m g6mVarP6 = xmpMeta.p(l7m.GOOGLE_OPCAMERA_NAMESPACE, l7m.OPCAMERA_PROP_OWNER);
        String value13 = g6mVarP6 == null ? null : g6mVarP6.getValue();
        g6m g6mVarP7 = xmpMeta.p(l7m.GOOGLE_OPCAMERA_NAMESPACE, l7m.OPCAMERA_OLIVE_PHOTO_VERSION);
        int i2 = (g6mVarP7 == null || (value3 = g6mVarP7.getValue()) == null) ? 0 : Integer.parseInt(value3);
        g6m g6mVarP8 = xmpMeta.p(l7m.GOOGLE_OPCAMERA_NAMESPACE, l7m.OPCAMERA_OLIVE_PHOTO_VIDEO_LENGTH);
        if (g6mVarP8 != null && (value9 = g6mVarP8.getValue()) != null) {
            j2 = Long.parseLong(value9);
        }
        g6m g6mVarP9 = xmpMeta.p(l7m.GOOGLE_OPCAMERA_NAMESPACE, l7m.OPCAMERA_MOTION_PHOTO_ENABLE);
        Boolean boolValueOf = (g6mVarP9 == null || (value4 = g6mVarP9.getValue()) == null) ? null : Boolean.valueOf(Boolean.parseBoolean(value4));
        g6m g6mVarP10 = xmpMeta.p(l7m.GOOGLE_OPCAMERA_NAMESPACE, l7m.OPCAMERA_MOTION_PHOTO_SOUND_ENABLE);
        Boolean boolValueOf2 = (g6mVarP10 == null || (value5 = g6mVarP10.getValue()) == null) ? null : Boolean.valueOf(Boolean.parseBoolean(value5));
        g6m g6mVarP11 = xmpMeta.p(l7m.GOOGLE_OPCAMERA_NAMESPACE, l7m.OPCAMERA_MOTION_PHOTO_VIDEO_START);
        Long lValueOf = (g6mVarP11 == null || (value6 = g6mVarP11.getValue()) == null) ? null : Long.valueOf(Long.parseLong(value6));
        g6m g6mVarP12 = xmpMeta.p(l7m.GOOGLE_OPCAMERA_NAMESPACE, l7m.OPCAMERA_MOTION_PHOTO_VIDEO_END);
        Long lValueOf2 = (g6mVarP12 == null || (value7 = g6mVarP12.getValue()) == null) ? null : Long.valueOf(Long.parseLong(value7));
        g6m g6mVarP13 = xmpMeta.p(l7m.GOOGLE_OPCAMERA_NAMESPACE, l7m.OPCAMERA_MOTION_PHOTO_EDITOR_FLAG);
        Integer numValueOf = (g6mVarP13 == null || (value8 = g6mVarP13.getValue()) == null) ? null : Integer.valueOf(Integer.parseInt(value8));
        primaryXmpInfo.v(value13);
        primaryXmpInfo.t(boolValueOf);
        primaryXmpInfo.B(boolValueOf2);
        primaryXmpInfo.s(numValueOf);
        primaryXmpInfo.A(lValueOf);
        primaryXmpInfo.z(lValueOf2);
        primaryXmpInfo.u(i);
        primaryXmpInfo.y(str);
        primaryXmpInfo.w(j3);
        primaryXmpInfo.x(j4);
        primaryXmpInfo.q(value12);
        primaryXmpInfo.C(i2);
        primaryXmpInfo.D(j2);
        int iO = xmpMeta.o(l7m.GOOGLE_PHOTOS_CONTAINER_NAMESPACE, l7m.CONTAINER_DIRECTORY);
        if (iO > 0) {
            primaryXmpInfo.p(new ArrayList());
            int i3 = 0;
            while (i3 < iO) {
                int i4 = i3 + 1;
                List<PrimaryXmpInfo.b> listA = primaryXmpInfo.a();
                if (listA != null) {
                    listA.add(a(xmpMeta, i3));
                }
                i3 = i4;
            }
        }
        return new Pair<>(xmpMeta, primaryXmpInfo);
    }
}

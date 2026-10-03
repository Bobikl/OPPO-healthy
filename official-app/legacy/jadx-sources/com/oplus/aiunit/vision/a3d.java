package com.oplus.aiunit.vision;

import androidx.core.app.FrameMetricsAggregator;
import com.oplus.gallery.olive_decoder.reader.JpegOLiveReader;
import io.protostuff.MapSchema;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\u001c\u0010\u0011\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0002R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u001c\u0010!\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 ¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/a3d;", "Lcom/oplus/aiunit/vision/z2d;", "", "a", "Lcom/oplus/aiunit/vision/b3d;", "c", "Ljava/io/InputStream;", "b", "", b2n.f, "", "d", "f", "Lcom/oplus/aiunit/vision/g5c;", "mpfInfo", "Lcom/oplus/aiunit/vision/kue;", "primaryXmpInfo", MapSchema.FIELD_NAME_ENTRY, "originalSize", b2n.g, "Lcom/oplus/aiunit/vision/y25;", "Lcom/oplus/aiunit/vision/y25;", "decodeSource", "Lcom/oplus/aiunit/vision/c3d;", "Lcom/oplus/aiunit/vision/c3d;", "oliveReader", "Lcom/oplus/aiunit/vision/kue;", "Lcom/oplus/aiunit/vision/g5c;", "Lcom/oplus/aiunit/vision/b3d;", "oLivePhoto", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "Ljava/util/logging/Logger;", "logger", "<init>", "(Lcom/oplus/aiunit/vision/y25;)V", "Companion", "olive-decoder"}, k = 1, mv = {1, 6, 0})
public final class a3d implements z2d {

    @NotNull
    public static final String TAG = "OLIVE.OLiveDecodeImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final y25 decodeSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final c3d oliveReader;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public PrimaryXmpInfo primaryXmpInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public g5c mpfInfo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public OLivePhoto oLivePhoto;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final Logger logger;

    public a3d(@NotNull y25 decodeSource) {
        Intrinsics.checkNotNullParameter(decodeSource, "decodeSource");
        this.decodeSource = decodeSource;
        this.oliveReader = new JpegOLiveReader(decodeSource);
        this.logger = Logger.getLogger(TAG);
    }

    @Override // com.oplus.aiunit.vision.z2d
    public boolean a() {
        return this.oliveReader.a();
    }

    @Override // com.oplus.aiunit.vision.z2d
    @Nullable
    public InputStream b() throws IOException {
        MicroVideo microVideo;
        InputStream inputStream = this.decodeSource.getInputStream();
        if (inputStream == null) {
            return null;
        }
        OLivePhoto oLivePhoto = this.oLivePhoto;
        MicroVideo microVideo2 = oLivePhoto == null ? null : oLivePhoto.getMicroVideo();
        if (microVideo2 == null) {
            return null;
        }
        long jSkip = inputStream.skip(microVideo2.getOffset());
        if (jSkip == microVideo2.getOffset()) {
            return inputStream;
        }
        this.logger.warning("OLIVE.OLiveDecodeImpl, [getVideoStream] failed with offset:" + microVideo2.getOffset() + ", but:" + jSkip + ", will return default stream.");
        mt9.a(inputStream);
        InputStream inputStream2 = this.decodeSource.getInputStream();
        if (inputStream2 == null) {
            return null;
        }
        try {
            OLivePhoto oLivePhoto2 = this.oLivePhoto;
            InputStream inputStreamC = (oLivePhoto2 == null || (microVideo = oLivePhoto2.getMicroVideo()) == null) ? null : microVideo.c(inputStream2);
            CloseableKt.closeFinally(inputStream2, null);
            return inputStreamC;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(inputStream2, th);
                throw th2;
            }
        }
    }

    @Override // com.oplus.aiunit.vision.z2d
    @Nullable
    public OLivePhoto c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        OLivePhoto oLivePhoto = this.oLivePhoto;
        if (oLivePhoto != null) {
            return oLivePhoto;
        }
        if (!a()) {
            return null;
        }
        if (this.primaryXmpInfo == null) {
            this.primaryXmpInfo = this.oliveReader.b();
        }
        PrimaryXmpInfo primaryXmpInfo = this.primaryXmpInfo;
        if (primaryXmpInfo == null) {
            this.logger.info("OLIVE.OLiveDecodeImpl, [decode] this live photo has no xmp info.");
            return null;
        }
        if (primaryXmpInfo.n()) {
            d();
        } else if (primaryXmpInfo.o()) {
            f();
        }
        this.logger.info(Intrinsics.stringPlus("OLIVE.OLiveDecodeImpl, [decode] costTime:", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)));
        return this.oLivePhoto;
    }

    public final void d() {
        List<Image> listA;
        OLivePhoto oLivePhoto = new OLivePhoto(0, null, null, null, null, null, null, 0L, 0L, FrameMetricsAggregator.EVERY_DURATION, null);
        oLivePhoto.d(new ArrayList());
        PrimaryXmpInfo primaryXmpInfo = this.primaryXmpInfo;
        oLivePhoto.c(primaryXmpInfo == null ? 0L : primaryXmpInfo.getMotionPhotoPresentationTimestampUs());
        Image image = new Image(null, null, 0L, 0L, 15, null);
        MicroVideo microVideo = new MicroVideo(null, 0L, 0L, 0L, null, null, 63, null);
        image.d(j.MIME_TYPE_JPEG);
        image.e(0L);
        image.g(g());
        image.f(OLivePhoto.PRIMARY_SEMANTIC);
        OLivePhoto oLivePhoto2 = this.oLivePhoto;
        if (oLivePhoto2 != null && (listA = oLivePhoto2.a()) != null) {
            listA.add(image);
        }
        microVideo.e("video/mp4");
        long jG = g();
        PrimaryXmpInfo primaryXmpInfo2 = this.primaryXmpInfo;
        microVideo.f(jG - (primaryXmpInfo2 == null ? 0L : primaryXmpInfo2.getMotionPhotoVideoOffset()));
        PrimaryXmpInfo primaryXmpInfo3 = this.primaryXmpInfo;
        microVideo.d(primaryXmpInfo3 != null ? primaryXmpInfo3.getMotionPhotoVideoOffset() : 0L);
        oLivePhoto.e(microVideo);
        this.oLivePhoto = oLivePhoto;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:126:0x0238  */
    /* JADX WARN: Code duplicated, block: B:136:0x0250  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b3  */
    public final void e(g5c mpfInfo, PrimaryXmpInfo primaryXmpInfo) {
        OLivePhoto oLivePhoto;
        a3d a3dVar;
        g5c.MPFValue mpfValue;
        List<g5c.b> listA;
        boolean z;
        g5c.MPFValue mpfValue2;
        List<g5c.b> listA2;
        int size;
        g5c.MPFValue mpfValue3;
        List<g5c.b> listA3;
        g5c.MPFValue mpfValue4;
        List<g5c.b> listA4;
        List<PrimaryXmpInfo.b> listA5;
        g5c.MPFValue mpfValue5;
        List<g5c.b> listA6;
        int iF = ((JpegOLiveReader) this.oliveReader).f();
        OLivePhoto oLivePhoto2 = new OLivePhoto(0, null, null, null, null, null, null, 0L, 0L, FrameMetricsAggregator.EVERY_DURATION, null);
        oLivePhoto2.g(primaryXmpInfo == null ? 1 : primaryXmpInfo.getOLivePhotoVersion());
        oLivePhoto2.i(primaryXmpInfo == null ? null : primaryXmpInfo.getMotionEnable());
        oLivePhoto2.j(primaryXmpInfo == null ? null : primaryXmpInfo.getMotionSoundEnable());
        oLivePhoto2.f(primaryXmpInfo == null ? null : primaryXmpInfo.getMotionPhotoOwner());
        oLivePhoto2.h(primaryXmpInfo == null ? null : primaryXmpInfo.getMotionEditorFlag());
        oLivePhoto2.d(new ArrayList());
        oLivePhoto2.c(primaryXmpInfo == null ? 0L : primaryXmpInfo.getMotionPhotoPresentationTimestampUs());
        oLivePhoto2.k(primaryXmpInfo == null ? -1L : primaryXmpInfo.getMotionPhotoPrimaryPresentationTimestampUs());
        MicroVideo microVideo = new MicroVideo(null, 0L, 0L, 0L, null, null, 63, null);
        if (primaryXmpInfo != null && (listA5 = primaryXmpInfo.a()) != null) {
            int i = 0;
            for (Object obj : listA5) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                PrimaryXmpInfo.b bVar = (PrimaryXmpInfo.b) obj;
                if (Intrinsics.areEqual(bVar.getSemantic(), OLivePhoto.MICRO_VIDEO_SEMANTIC)) {
                    microVideo.e(bVar.getMimeType());
                    microVideo.d(bVar.getLength());
                    microVideo.i(primaryXmpInfo.getMotionPhotoVideoStart());
                    microVideo.h(primaryXmpInfo.getMotionPhotoVideoEnd());
                    microVideo.g(primaryXmpInfo.getOLiveVideoLength() == 0 ? microVideo.getLength() : primaryXmpInfo.getOLiveVideoLength());
                } else {
                    Image image = new Image(null, null, 0L, 0L, 15, null);
                    g5c.b bVar2 = (mpfInfo == null || (mpfValue5 = mpfInfo.getMpfValue()) == null || (listA6 = mpfValue5.a()) == null) ? null : listA6.get(i);
                    image.d(bVar.getMimeType());
                    image.g(bVar2 == null ? 0 : bVar2.getImageSize());
                    image.f(bVar.getSemantic());
                    if (!Intrinsics.areEqual(image.getSemantic(), OLivePhoto.PRIMARY_SEMANTIC)) {
                        image.e((bVar2 == null ? 0 : bVar2.getImageDataOffset()) + iF);
                    }
                    List<Image> listA7 = oLivePhoto2.a();
                    if (listA7 != null) {
                        listA7.add(image);
                    }
                }
                i = i2;
            }
        }
        List<Image> listA8 = oLivePhoto2.a();
        if (listA8 == null) {
            oLivePhoto = oLivePhoto2;
            a3dVar = this;
        } else {
            if (listA8.size() == 0) {
                this.logger.warning("olive have no image");
                return;
            }
            oLivePhoto = oLivePhoto2;
            a3dVar = this;
            if (listA8.size() != 1) {
                if (mpfInfo == null && (mpfValue = mpfInfo.getMpfValue()) != null && (listA = mpfValue.a()) != null && listA.size() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    listA8.get(0).g(a3dVar.h(listA8.get(0).getSize()));
                } else {
                    if (mpfInfo != null || (mpfValue2 = mpfInfo.getMpfValue()) == null || (listA2 = mpfValue2.a()) == null) {
                        size = 0;
                    } else {
                        size = listA2.size();
                    }
                    if (size > 1 && listA8.size() > 1) {
                        listA8.get(0).g(listA8.get(1).getOffset());
                    }
                }
                Image image2 = listA8.get(listA8.size() - 1);
                microVideo.f(image2.getOffset() + image2.getSize());
                if (primaryXmpInfo != null && primaryXmpInfo.getOLivePhotoVersion() >= 2) {
                    if (mpfInfo == null && (mpfValue3 = mpfInfo.getMpfValue()) != null && (listA3 = mpfValue3.a()) != null && listA3.size() == 1) {
                        microVideo.f(g() - microVideo.getLength());
                        a3dVar.logger.info("video.offset:calculate by fileLength minus video size");
                    }
                }
                a3dVar.logger.info("video.offset:" + kzc.b(microVideo.getOffset()) + ",size:" + listA8.size() + ",videoLength:" + microVideo.getLength());
            } else if (((mpfInfo == null || (mpfValue4 = mpfInfo.getMpfValue()) == null || (listA4 = mpfValue4.a()) == null) ? 0 : listA4.size()) == 0) {
                microVideo.f(g() - microVideo.getLength());
            } else {
                if (mpfInfo == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    listA8.get(0).g(a3dVar.h(listA8.get(0).getSize()));
                } else {
                    if (mpfInfo != null) {
                        size = 0;
                    } else {
                        size = listA2.size();
                    }
                    if (size > 1) {
                        listA8.get(0).g(listA8.get(1).getOffset());
                    }
                }
                Image image3 = listA8.get(listA8.size() - 1);
                microVideo.f(image3.getOffset() + image3.getSize());
                if (primaryXmpInfo != null) {
                    if (mpfInfo == null && (mpfValue3 = mpfInfo.getMpfValue()) != null && (listA3 = mpfValue3.a()) != null && listA3.size() == 1) {
                        microVideo.f(g() - microVideo.getLength());
                        a3dVar.logger.info("video.offset:calculate by fileLength minus video size");
                    }
                }
                a3dVar.logger.info("video.offset:" + kzc.b(microVideo.getOffset()) + ",size:" + listA8.size() + ",videoLength:" + microVideo.getLength());
            }
            oLivePhoto.e(microVideo);
        }
        a3dVar.oLivePhoto = oLivePhoto;
    }

    public final void f() {
        PrimaryXmpInfo primaryXmpInfo = this.primaryXmpInfo;
        List<PrimaryXmpInfo.b> listA = primaryXmpInfo == null ? null : primaryXmpInfo.a();
        if (listA == null || listA.isEmpty()) {
            this.logger.info("OLIVE.OLiveDecodeImpl, [decodeV2Spec] xmp containerItems is null or empty.It's not valid, livePhoto v2 at least have primary image and video in XMP.");
            return;
        }
        if (this.mpfInfo == null) {
            this.mpfInfo = this.oliveReader.c();
        }
        e(this.mpfInfo, this.primaryXmpInfo);
    }

    public final long g() {
        return this.decodeSource.a();
    }

    public final long h(long originalSize) {
        List<Section> listH;
        c3d c3dVar = this.oliveReader;
        Section section = null;
        Object obj = null;
        section = null;
        JpegOLiveReader jpegOLiveReader = c3dVar instanceof JpegOLiveReader ? (JpegOLiveReader) c3dVar : null;
        if (jpegOLiveReader != null && (listH = jpegOLiveReader.h()) != null) {
            for (Object obj2 : listH) {
                if (((Section) obj2).getMarker() == 218) {
                    obj = obj2;
                    break;
                }
            }
            section = (Section) obj;
        }
        return section == null ? originalSize : yia.a(section, originalSize);
    }
}

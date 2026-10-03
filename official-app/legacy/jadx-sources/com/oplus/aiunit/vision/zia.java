package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004J(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002R\u001c\u0010\u000e\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/zia;", "", "Ljava/io/InputStream;", "inputStream", "", "onlyXmp", "onlyMpf", "", "Lcom/oplus/aiunit/vision/xia;", "b", "a", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "Ljava/util/logging/Logger;", "logger", "<init>", "()V", "olive-decoder"}, k = 1, mv = {1, 6, 0})
public final class zia {

    @NotNull
    public static final zia INSTANCE = new zia();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Logger logger = Logger.getLogger("JpegSectionParser");

    public static /* synthetic */ List c(zia ziaVar, InputStream inputStream, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return ziaVar.b(inputStream, z, z2);
    }

    public final List<Section> a(InputStream inputStream, boolean onlyXmp, boolean onlyMpf) throws IOException {
        int i;
        if (inputStream.read() != 255) {
            logger.warning("JpegSectionParser, [parse] not valid jpeg file");
            return null;
        }
        if (inputStream.read() != 216) {
            logger.warning("JpegSectionParser, [parse] not valid jpeg file, no SOI");
            return null;
        }
        if (inputStream.available() > 104857600) {
            logger.warning("JpegSectionParser, [parse] live photo too large, can not parse");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = 2;
        while (true) {
            int i2 = inputStream.read();
            if (i2 == -1) {
                logger.warning("JpegSectionParser, [parse] no byte for the file");
                return arrayList;
            }
            if (i2 != 255) {
                logger.warning("JpegSectionParser, [parse] no marker");
                return null;
            }
            int i3 = length + 1;
            while (true) {
                i = inputStream.read();
                i3++;
                if (i != 255) {
                    break;
                }
                logger.info("JpegSectionParser, [parse] continue to read next byte for marker");
            }
            if (i == 218 && !onlyMpf && !onlyXmp) {
                Section section = new Section();
                section.f(i);
                section.g(i3 - 2);
                section.d(new byte[inputStream.available()]);
                inputStream.read(section.a(), 0, section.a().length);
                section.e(-1);
                arrayList.add(section);
                return arrayList;
            }
            int i4 = inputStream.read();
            int i5 = inputStream.read();
            int i6 = i3 + 2;
            if (i4 == -1 || i5 == -1) {
                logger.warning("JpegSectionParser, [parse] marker section length error");
                return null;
            }
            int i7 = (i4 << 8) | i5;
            if (i7 > inputStream.available()) {
                logger.warning("JpegSectionParser, [parse] marker section error, length larger than stream length " + i7 + ", " + inputStream.available());
                return null;
            }
            if (i == 225) {
                Section section2 = new Section();
                section2.f(i);
                section2.e(i7);
                section2.g((i6 - 2) - 2);
                section2.d(new byte[RangesKt___RangesKt.coerceAtLeast(i7 - 2, 0)]);
                inputStream.read(section2.a(), 0, section2.a().length);
                length = i6 + section2.a().length;
                if (onlyMpf) {
                    continue;
                } else if (!onlyXmp) {
                    arrayList.add(section2);
                } else if (aja.INSTANCE.f(section2.a())) {
                    arrayList.add(section2);
                    return arrayList;
                }
            } else if (i != 226) {
                Section section3 = new Section();
                section3.f(i);
                section3.e(i7);
                section3.g((i6 - 2) - 2);
                section3.d(new byte[RangesKt___RangesKt.coerceAtLeast(i7 - 2, 0)]);
                inputStream.read(section3.a(), 0, section3.a().length);
                length = i6 + section3.a().length;
                if (!onlyXmp && !onlyMpf) {
                    arrayList.add(section3);
                }
            } else {
                Section section4 = new Section();
                section4.f(i);
                section4.e(i7);
                section4.g((i6 - 2) - 2);
                section4.d(new byte[RangesKt___RangesKt.coerceAtLeast(i7 - 2, 0)]);
                inputStream.read(section4.a(), 0, section4.a().length);
                length = i6 + section4.a().length;
                if (onlyXmp) {
                    continue;
                } else if (!onlyMpf) {
                    arrayList.add(section4);
                } else if (wia.INSTANCE.a(section4.a())) {
                    arrayList.add(section4);
                    return arrayList;
                }
            }
        }
    }

    @Nullable
    public final List<Section> b(@NotNull InputStream inputStream, boolean onlyXmp, boolean onlyMpf) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        return a(inputStream, onlyXmp, onlyMpf);
    }
}

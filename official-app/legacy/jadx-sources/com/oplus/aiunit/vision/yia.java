package com.oplus.aiunit.vision;

import com.heytap.nearx.taphttp.statitics.StatRateHelper;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/xia;", "", "originalSize", "a", "olive-decoder"}, k = 2, mv = {1, 6, 0})
public final class yia {
    public static final long a(@NotNull Section section, long j2) {
        Intrinsics.checkNotNullParameter(section, "<this>");
        Logger logger = Logger.getLogger(a3d.TAG);
        Charset charset = Charsets.UTF_8;
        byte[] bytes = "ftyp".getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bytes2 = "wide".getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        byte[][] bArr = {bytes, bytes2};
        int iMax = Math.max(bytes.length, bytes2.length);
        int i = (int) ((j2 - ((long) section.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String())) - ((long) StatRateHelper.MAX_RECORDS_NUM));
        if (i < 0) {
            i = 0;
        }
        logger.info(Intrinsics.stringPlus("getPrimaryImageSize startPosition=", Integer.valueOf(i)));
        boolean z = false;
        while (i < section.a().length - iMax) {
            int i2 = 0;
            while (i2 < 2) {
                byte[] bArr2 = bArr[i2];
                i2++;
                if (bArr2[0] == section.a()[i]) {
                    int length = bArr2.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            z = true;
                            break;
                        }
                        int i4 = i3 + 1;
                        if (section.a()[i + i3] != bArr2[i3]) {
                            z = false;
                            break;
                        }
                        i3 = i4;
                    }
                }
            }
            if (z) {
                break;
            }
            i++;
        }
        long j3 = z ? ((long) ((section.getAndroidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET java.lang.String() + 2) + i)) - 4 : j2;
        logger.info("primary image size=" + j3 + ", videoPositionFound=" + z);
        return j3;
    }
}

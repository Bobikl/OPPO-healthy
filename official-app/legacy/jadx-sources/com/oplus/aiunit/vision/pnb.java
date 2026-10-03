package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import java.util.List;
import java.util.Random;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J+\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0010\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/pnb;", "", "", "a", "b", "size", "Lcom/oplus/aiunit/vision/h1a;", ExifInterface.GPS_DIRECTION_TRUE, "", "weightArr", "c", "(Ljava/util/List;)Lcom/oplus/aiunit/vision/h1a;", "Ljava/util/Random;", "Ljava/util/Random;", "sRandom", "", UserInfo.SEX_FEMALE, "DEG_TO_RAD", "RAD_TO_DEG", "<init>", "()V", "com.heytap.nearx.common"}, k = 1, mv = {1, 4, 0})
public final class pnb {
    public static final pnb INSTANCE = new pnb();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Random sRandom = new Random();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final float DEG_TO_RAD = 0.017453292f;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final float RAD_TO_DEG = 57.295784f;

    public final int a(int a, int b) {
        return a > b ? a : b;
    }

    public final int b(int size) {
        int iNextFloat = (int) (sRandom.nextFloat() * size);
        return iNextFloat == size ? size - 1 : iNextFloat;
    }

    @Nullable
    public final <T extends h1a> T c(@Nullable List<? extends T> weightArr) {
        if (weightArr == null || weightArr.isEmpty()) {
            return null;
        }
        int size = weightArr.size();
        int[][] iArr = new int[size][];
        for (int i = 0; i < size; i++) {
            iArr[i] = new int[2];
        }
        int iA = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iA += a(0, weightArr.get(i2).weight());
            int[] iArr2 = iArr[i2];
            iArr2[0] = i2;
            iArr2[1] = iA;
        }
        int iNextInt = new Random().nextInt(iA + 1);
        for (int i3 = 0; i3 < size; i3++) {
            int[] iArr3 = iArr[i3];
            if (iNextInt <= iArr3[1]) {
                return weightArr.get(iArr3[0]);
            }
        }
        return weightArr.get(0);
    }
}

package com.oplus.aiunit.vision;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002J$\u0010\u000e\u001a\u00060\rR\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/wia;", "", "", "data", "", "a", "byteArray", "Lcom/oplus/aiunit/vision/g5c;", "c", "mpfInfo", "entryByteArray", "Ljava/nio/ByteOrder;", "byteOrder", "Lcom/oplus/aiunit/vision/g5c$b;", "b", "<init>", "()V", "olive-decoder"}, k = 1, mv = {1, 6, 0})
public final class wia {

    @NotNull
    public static final wia INSTANCE = new wia();

    public final boolean a(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length < 4) {
            return false;
        }
        byte[] bArr = new byte[4];
        System.arraycopy(data, 0, bArr, 0, 4);
        return Arrays.equals(bArr, h5c.INSTANCE.b());
    }

    public final g5c.b b(g5c mpfInfo, byte[] entryByteArray, ByteOrder byteOrder) {
        g5c.b bVar = new g5c.b(mpfInfo);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(entryByteArray);
        byte[] bArr = new byte[4];
        byteBufferWrap.get(bArr, 0, 4);
        bVar.g(ArraysKt___ArraysKt.sliceArray(bArr, RangesKt___RangesKt.until(1, 4)));
        byte[] bArr2 = new byte[4];
        byteBufferWrap.get(bArr2, 0, 4);
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        bVar.f(gh0.b(bArr2, Intrinsics.areEqual(byteOrder, byteOrder2)));
        byte[] bArr3 = new byte[4];
        byteBufferWrap.get(bArr3, 0, 4);
        bVar.e(gh0.b(bArr3, Intrinsics.areEqual(byteOrder, byteOrder2)));
        byte[] bArr4 = new byte[2];
        byteBufferWrap.get(bArr4, 0, 2);
        bVar.c(gh0.c(bArr4, Intrinsics.areEqual(byteOrder, byteOrder2)));
        byte[] bArr5 = new byte[2];
        byteBufferWrap.get(bArr5, 0, 2);
        bVar.d(gh0.c(bArr5, Intrinsics.areEqual(byteOrder, byteOrder2)));
        return bVar;
    }

    @Nullable
    public final g5c c(@NotNull byte[] byteArray) {
        int i;
        ByteOrder byteOrder;
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        if (!a(byteArray)) {
            return null;
        }
        g5c g5cVar = new g5c();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(ArraysKt___ArraysKt.sliceArray(byteArray, RangesKt___RangesKt.until(4, byteArray.length)));
        byte[] bArr = new byte[4];
        byteBufferWrap.get(bArr, 0, 4);
        h5c h5cVar = h5c.INSTANCE;
        if (Arrays.equals(bArr, h5cVar.c())) {
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        } else if (Arrays.equals(bArr, h5cVar.a())) {
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        }
        byte[] bArr2 = new byte[4];
        byteBufferWrap.get(bArr2, 0, 4);
        int iB = gh0.b(bArr2, Intrinsics.areEqual(byteBufferWrap.order(), ByteOrder.LITTLE_ENDIAN));
        ByteOrder byteOrderOrder = byteBufferWrap.order();
        Intrinsics.checkNotNullExpressionValue(byteOrderOrder, "byteBuffer.order()");
        g5cVar.b(new g5c.MPFHeader(g5cVar, byteOrderOrder, iB));
        g5c.d dVar = new g5c.d(g5cVar);
        dVar.a(byteBufferWrap.getShort());
        int i2 = iB + 2;
        int iB2 = 0;
        int iB3 = 0;
        while (true) {
            byte[] bArrA = new byte[2];
            byteBufferWrap.get(bArrA, 0, 2);
            i = i2 + 2;
            ByteOrder byteOrderOrder2 = byteBufferWrap.order();
            byteOrder = ByteOrder.LITTLE_ENDIAN;
            if (Intrinsics.areEqual(byteOrderOrder2, byteOrder)) {
                bArrA = gh0.a(bArrA);
            }
            h5c h5cVar2 = h5c.INSTANCE;
            if (!Arrays.equals(bArrA, h5cVar2.e())) {
                if (!Arrays.equals(bArrA, h5cVar2.g())) {
                    if (!Arrays.equals(bArrA, h5cVar2.d())) {
                        if (!Arrays.equals(bArrA, h5cVar2.f())) {
                            if (!Arrays.equals(bArrA, h5cVar2.h())) {
                                break;
                            }
                            byte[] bArr3 = new byte[10];
                            byteBufferWrap.get(bArr3, 0, 10);
                            i2 = i + 10;
                            dVar.f(bArr3);
                        } else {
                            byte[] bArr4 = new byte[10];
                            byteBufferWrap.get(bArr4, 0, 10);
                            i2 = i + 10;
                            dVar.c(bArr4);
                        }
                    } else {
                        byte[] bArr5 = new byte[10];
                        byteBufferWrap.get(bArr5, 0, 10);
                        i2 = i + 10;
                        iB2 = gh0.b(ArraysKt___ArraysKt.sliceArray(bArr5, RangesKt___RangesKt.until(6, 10)), Intrinsics.areEqual(byteBufferWrap.order(), byteOrder));
                        dVar.b(iB2);
                    }
                } else {
                    byte[] bArr6 = new byte[10];
                    byteBufferWrap.get(bArr6, 0, 10);
                    i2 = i + 10;
                    iB3 = gh0.b(ArraysKt___ArraysKt.sliceArray(bArr6, RangesKt___RangesKt.until(6, 10)), Intrinsics.areEqual(byteBufferWrap.order(), byteOrder));
                    dVar.d(iB3);
                }
            } else {
                byte[] bArr7 = new byte[10];
                byteBufferWrap.get(bArr7, 0, 10);
                i2 = i + 10;
                dVar.g(gh0.d(bArr7, 6, 4, Charsets.US_ASCII));
            }
        }
        byteBufferWrap.position(byteBufferWrap.position() - 2);
        byte[] bArr8 = new byte[4];
        byteBufferWrap.get(bArr8, 0, 4);
        dVar.e(gh0.b(bArr8, Intrinsics.areEqual(byteBufferWrap.order(), byteOrder)));
        g5cVar.c(dVar);
        g5c.MPFValue mPFValue = new g5c.MPFValue(g5cVar);
        ArrayList arrayList = new ArrayList();
        byteBufferWrap.position(byteBufferWrap.position() + (iB2 - ((i - 2) + 4)));
        int i3 = 0;
        while (i3 < iB3) {
            i3++;
            byte[] bArr9 = new byte[16];
            byteBufferWrap.get(bArr9, 0, 16);
            ByteOrder byteOrderOrder3 = byteBufferWrap.order();
            Intrinsics.checkNotNullExpressionValue(byteOrderOrder3, "byteBuffer.order()");
            arrayList.add(b(g5cVar, bArr9, byteOrderOrder3));
        }
        mPFValue.b(arrayList);
        g5cVar.d(mPFValue);
        return g5cVar;
    }
}

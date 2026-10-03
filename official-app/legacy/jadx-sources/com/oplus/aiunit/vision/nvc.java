package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.math.MathKt__MathJVMKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0012\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b9\u0010:J\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\u001e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002J*\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u0004J\u0010\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0018\u0010\"\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0002J\u0010\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0002H\u0002J\u0016\u0010'\u001a\u00020\u00112\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110%H\u0002J(\u0010-\u001a\u00020,2\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u00110(j\b\u0012\u0004\u0012\u00020\u0011`)2\u0006\u0010+\u001a\u00020\u0004H\u0002J(\u0010/\u001a\u00020,2\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u00110(j\b\u0012\u0004\u0012\u00020\u0011`)2\u0006\u0010+\u001a\u00020.H\u0002J(\u00100\u001a\u00020,2\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u00110(j\b\u0012\u0004\u0012\u00020\u0011`)2\u0006\u0010+\u001a\u00020.H\u0002J\u0010\u00101\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0010\u00102\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0004H\u0002J\u001c\u00103\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u0004H\u0002R\u001d\u00108\u001a\b\u0012\u0004\u0012\u0002040%8\u0006¢\u0006\f\n\u0004\b\u001c\u00105\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/oplus/aiunit/vision/nvc;", "", "Landroid/graphics/Bitmap;", "origin", "", "size", "q", LogFieldKey.PROCESS_NAME_KEY, "bgImage", "newWidth", "newHeight", "u", "srcBitmap", "desWidth", "desHeight", b2n.f, "bitmap", "", "b", "c", LogFieldKey.MESSAGE_KEY, "d", MapSchema.FIELD_NAME_ENTRY, "sourceBitmap", "targetWidth", "targetHeight", ParserTag.TAG_CORNER_RADIUS, "o", "a", "squareBitmap", "i", "source", "", "radius", "n", "bmp", LogFieldKey.LEVEL_KEY, "", "values", "f", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "data", "value", "", "t", "", "r", "s", MapSchema.FIELD_NAME_KEY, b2n.g, "j", "", "Ljava/util/List;", "getWhiteSpaceApp", "()Ljava/util/List;", "whiteSpaceApp", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationBitmapUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationBitmapUtil.kt\ncom/heytap/health/watch/notification/impl/utils/NotificationBitmapUtil\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,450:1\n52#2:451\n52#2:452\n90#2,6:453\n90#2,6:459\n52#2:465\n52#2:466\n*S KotlinDebug\n*F\n+ 1 NotificationBitmapUtil.kt\ncom/heytap/health/watch/notification/impl/utils/NotificationBitmapUtil\n*L\n79#1:451\n88#1:452\n148#1:453,6\n169#1:459,6\n190#1:465\n335#1:466\n*E\n"})
public final class nvc {

    @NotNull
    public static final nvc INSTANCE = new nvc();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final List<String> whiteSpaceApp = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"com.heytap.health", "com.heytap.health.international", "com.android.calendar", "com.coloros.calendar", "com.heytap.browser", "com.heytap.music", "com.android.contacts"});

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\r\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/nvc$a;", "", "", "a", "I", "d", "()I", b2n.g, "(I)V", "r", "b", "c", b2n.f, "f", MapSchema.FIELD_NAME_ENTRY, "<init>", "(IIII)V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public int r;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public int g;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int b;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public int a;

        public a(int i, int i2, int i3, int i4) {
            this.r = i;
            this.g = i2;
            this.b = i3;
            this.a = i4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getA() {
            return this.a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getB() {
            return this.b;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getG() {
            return this.g;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getR() {
            return this.r;
        }

        public final void e(int i) {
            this.a = i;
        }

        public final void f(int i) {
            this.b = i;
        }

        public final void g(int i) {
            this.g = i;
        }

        public final void h(int i) {
            this.r = i;
        }
    }

    @Nullable
    public final Bitmap a(@Nullable Bitmap origin, int targetWidth) {
        if (origin == null) {
            return null;
        }
        int width = origin.getWidth();
        int height = origin.getHeight();
        if (width <= targetWidth) {
            return origin;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(origin, targetWidth, (int) (height * (targetWidth / width)), true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "{\n            val scale …etHeight, true)\n        }");
        return bitmapCreateScaledBitmap;
    }

    @NotNull
    public final byte[] b(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        byte[] bArr = new byte[height * width * 2];
        int i = 0;
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                int pixel = bitmap.getPixel(i3, i2);
                if (Color.alpha(pixel) == 0) {
                    bArr[i + 1] = 0;
                    bArr[i] = 0;
                } else {
                    int iRed = Color.red(pixel);
                    int iGreen = Color.green(pixel);
                    int iBlue = Color.blue(pixel);
                    bArr[i + 1] = (byte) ((iRed & 248) | ((iGreen >> 5) & 7));
                    bArr[i] = (byte) (((iBlue >> 3) & 31) | ((iGreen << 3) & oei.TAI_CHI));
                }
                i += 2;
            }
        }
        return bArr;
    }

    @NotNull
    public final byte[] c(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bao.toByteArray()");
        return byteArray;
    }

    @NotNull
    public final byte[] d(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bao.toByteArray()");
        return byteArray;
    }

    @NotNull
    public final byte[] e(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ArrayList<byte[]> arrayList = new ArrayList<>();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        t(arrayList, 19778);
        r(arrayList, (height * width * 2) + 54);
        t(arrayList, 0);
        t(arrayList, 0);
        r(arrayList, 54L);
        r(arrayList, 40L);
        s(arrayList, width);
        s(arrayList, height);
        t(arrayList, 1);
        t(arrayList, 16);
        r(arrayList, 0L);
        r(arrayList, 0L);
        s(arrayList, 0L);
        s(arrayList, 0L);
        r(arrayList, 0L);
        r(arrayList, 0L);
        arrayList.add(k(bitmap));
        return f(arrayList);
    }

    public final byte[] f(List<byte[]> values) {
        int size = values.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += values.get(i).length;
        }
        byte[] bArr = new byte[length];
        int size2 = values.size();
        int length2 = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            byte[] bArr2 = values.get(i2);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    @NotNull
    public final Bitmap g(@NotNull Bitmap srcBitmap, int desWidth, int desHeight) {
        int i;
        Intrinsics.checkNotNullParameter(srcBitmap, "srcBitmap");
        int width = srcBitmap.getWidth();
        int height = srcBitmap.getHeight();
        float f = width;
        float f2 = height;
        float f3 = f / f2;
        float f4 = desWidth / desHeight;
        int i2 = 0;
        if (f3 == f4) {
            return srcBitmap;
        }
        if (f3 > f4) {
            int i3 = (int) (f2 * f4);
            i = 0;
            i2 = (width - i3) / 2;
            width = i3;
        } else {
            int i4 = (int) (f / f4);
            i = (height - i4) / 2;
            height = i4;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(srcBitmap, i2, i, width, height);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(srcBitmap, … dy, newWidth, newHeight)");
        return bitmapCreateBitmap;
    }

    public final int h(int n2) {
        return Math.max(Math.min(n2, 255), 0);
    }

    public final Bitmap i(Bitmap squareBitmap) {
        int iRoundToInt;
        int width = squareBitmap.getWidth() / 2;
        int height = squareBitmap.getHeight() / 2;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= width) {
                i2 = 0;
                break;
            }
            if (Color.alpha(squareBitmap.getPixel(i2, height)) != 0) {
                break;
            }
            i2++;
        }
        for (int i3 = 0; i3 < height; i3++) {
            if (Color.alpha(squareBitmap.getPixel(width, i3)) != 0) {
                i = i3;
                break;
            }
        }
        if ((i2 == 0 && i == 0) || i2 > (iRoundToInt = MathKt__MathJVMKt.roundToInt(squareBitmap.getWidth() * 0.05f)) || i > iRoundToInt) {
            return squareBitmap;
        }
        int iMin = Math.min(i2, i) + 2;
        int i4 = (width - iMin) * 2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(squareBitmap, iMin, iMin, i4, i4);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(squareBitma…contentSize, contentSize)");
        return bitmapCreateBitmap;
    }

    public final Bitmap j(Bitmap sourceBitmap, int cornerRadius) {
        if (sourceBitmap == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sourceBitmap.getWidth(), sourceBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n          …onfig.ARGB_8888\n        )");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-16777216);
        Rect rect = new Rect(0, 0, sourceBitmap.getWidth(), sourceBitmap.getHeight());
        float f = cornerRadius;
        canvas.drawRoundRect(new RectF(rect), f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(sourceBitmap, rect, rect, paint);
        paint.setXfermode(null);
        return bitmapCreateBitmap;
    }

    public final byte[] k(Bitmap bitmap) {
        byte[] bArr = new byte[bitmap.getWidth() * bitmap.getHeight() * 2];
        int width = bitmap.getWidth() + 2;
        a[] aVarArr = new a[width];
        int i = 0;
        for (int i2 = 0; i2 < width; i2++) {
            aVarArr[i2] = new a(0, 0, 0, 0);
        }
        int height = bitmap.getHeight();
        int i3 = 0;
        while (i3 < height) {
            a[] aVarArr2 = new a[width];
            for (int i4 = i; i4 < width; i4++) {
                aVarArr2[i4] = new a(i, i, i, i);
            }
            a aVar = new a(i, i, i, i);
            int width2 = bitmap.getWidth();
            int i5 = i;
            while (i5 < width2) {
                int pixel = bitmap.getPixel(i5, i3);
                int iRed = Color.red(pixel);
                int r = aVar.getR();
                int i6 = i5 + 1;
                a aVar2 = aVarArr[i6];
                Intrinsics.checkNotNull(aVar2);
                int r2 = iRed + ((r + aVar2.getR()) / 16);
                int iGreen = Color.green(pixel);
                int g = aVar.getG();
                a aVar3 = aVarArr[i6];
                Intrinsics.checkNotNull(aVar3);
                int g2 = iGreen + ((g + aVar3.getG()) / 16);
                int iBlue = Color.blue(pixel);
                int b = aVar.getB();
                a aVar4 = aVarArr[i6];
                Intrinsics.checkNotNull(aVar4);
                int b2 = iBlue + ((b + aVar4.getB()) / 16);
                int iAlpha = Color.alpha(pixel);
                int a2 = aVar.getA();
                a aVar5 = aVarArr[i6];
                Intrinsics.checkNotNull(aVar5);
                int a3 = iAlpha + ((a2 + aVar5.getA()) / 16);
                a[] aVarArr3 = aVarArr;
                int iH = this.h(b2) >>> 4;
                int i7 = height;
                int iH2 = this.h(g2) >>> 4;
                int i8 = width2;
                int iH3 = this.h(r2) >>> 4;
                int iH4 = this.h(a3) >>> 4;
                int i9 = (iH3 << 12) | (iH2 << 8) | (iH << 4) | iH4;
                int i10 = i5 * 2;
                int i11 = width;
                bArr[i10 + (bitmap.getWidth() * 2 * i3)] = (byte) i9;
                bArr[i10 + 1 + (bitmap.getWidth() * 2 * i3)] = (byte) (i9 >>> 8);
                int i12 = r2 - ((iH3 * 255) / 15);
                aVar.h(i12 * 7);
                a aVar6 = aVarArr2[i5];
                Intrinsics.checkNotNull(aVar6);
                aVar6.h(aVar6.getR() + (i12 * 3));
                a aVar7 = aVarArr2[i6];
                Intrinsics.checkNotNull(aVar7);
                aVar7.h(aVar7.getR() + (i12 * 5));
                int i13 = i5 + 2;
                a aVar8 = aVarArr2[i13];
                Intrinsics.checkNotNull(aVar8);
                aVar8.h(i12);
                int i14 = g2 - ((iH2 * 255) / 15);
                aVar.g(i14 * 7);
                a aVar9 = aVarArr2[i5];
                Intrinsics.checkNotNull(aVar9);
                aVar9.g(aVar9.getG() + (i14 * 3));
                a aVar10 = aVarArr2[i6];
                Intrinsics.checkNotNull(aVar10);
                aVar10.g(aVar10.getG() + (i14 * 5));
                a aVar11 = aVarArr2[i13];
                Intrinsics.checkNotNull(aVar11);
                aVar11.g(i14);
                int i15 = b2 - ((iH * 255) / 15);
                aVar.f(i15 * 7);
                a aVar12 = aVarArr2[i5];
                Intrinsics.checkNotNull(aVar12);
                aVar12.f(aVar12.getB() + (i15 * 3));
                a aVar13 = aVarArr2[i6];
                Intrinsics.checkNotNull(aVar13);
                aVar13.f(aVar13.getB() + (i15 * 5));
                a aVar14 = aVarArr2[i13];
                Intrinsics.checkNotNull(aVar14);
                aVar14.f(i15);
                int i16 = a3 - ((iH4 * 255) / 15);
                aVar.e(i16 * 7);
                a aVar15 = aVarArr2[i5];
                Intrinsics.checkNotNull(aVar15);
                aVar15.e(aVar15.getA() + (i16 * 3));
                a aVar16 = aVarArr2[i6];
                Intrinsics.checkNotNull(aVar16);
                aVar16.e(aVar16.getA() + (i16 * 5));
                a aVar17 = aVarArr2[i13];
                Intrinsics.checkNotNull(aVar17);
                aVar17.e(i16);
                this = this;
                i5 = i6;
                aVarArr = aVarArr3;
                height = i7;
                width2 = i8;
                width = i11;
            }
            Object[] objArrCopyOf = Arrays.copyOf(aVarArr2, width);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            aVarArr = (a[]) objArrCopyOf;
            i3++;
            i = 0;
        }
        return bArr;
    }

    public final Bitmap l(Bitmap bmp) {
        int width = bmp.getWidth();
        int height = bmp.getHeight();
        if (width == height) {
            return bmp;
        }
        int iMax = Math.max(width, height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f = (iMax - width) / 2.0f;
        float f2 = (iMax - height) / 2.0f;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        canvas.drawBitmap(bmp, f, f2, paint);
        return bitmapCreateBitmap;
    }

    @NotNull
    public final byte[] m(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 100;
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        while (byteArrayOutputStream.size() > 8192) {
            byteArrayOutputStream.reset();
            i -= 2;
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        }
        a7b.f("NTF_BitmapUtil", "iWatchBmpJpgByteArray quality: " + i);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bao.toByteArray()");
        return byteArray;
    }

    public final Bitmap n(Bitmap source, float radius) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(source.getWidth(), source.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setFilterBitmap(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(source, tileMode, tileMode));
        paint.setAntiAlias(true);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, source.getWidth(), source.getHeight()), radius, radius, paint);
        return bitmapCreateBitmap;
    }

    @Nullable
    public final Bitmap o(@Nullable Bitmap sourceBitmap, int targetWidth, int targetHeight, int cornerRadius) {
        if (sourceBitmap == null) {
            return null;
        }
        int width = sourceBitmap.getWidth();
        int height = sourceBitmap.getHeight();
        if (width <= targetWidth && height <= targetHeight) {
            return j(sourceBitmap, cornerRadius);
        }
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(height * (targetWidth / width));
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(sourceBitmap, targetWidth, iRoundToInt, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "createScaledBitmap(sourc…idth, scaledHeight, true)");
        if (iRoundToInt > targetHeight) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap, 0, (iRoundToInt - targetHeight) / 2, targetWidth, targetHeight);
            bitmapCreateScaledBitmap.recycle();
            bitmapCreateScaledBitmap = bitmapCreateBitmap;
        }
        Bitmap bitmapJ = j(bitmapCreateScaledBitmap, cornerRadius);
        bitmapCreateScaledBitmap.recycle();
        return bitmapJ;
    }

    @NotNull
    public final Bitmap p(@NotNull Bitmap origin, int size) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Bitmap bitmapI = i(l(origin));
        if (bitmapI.getWidth() >= size) {
            return u(n(bitmapI, bitmapI.getWidth() / 2.0f), size, size);
        }
        Bitmap bitmapU = u(bitmapI, size, size);
        return n(bitmapU, bitmapU.getWidth() / 2.0f);
    }

    @NotNull
    public final Bitmap q(@NotNull Bitmap origin, int size) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return n(u(l(origin), size, size), 16.0f);
    }

    public final void r(ArrayList<byte[]> data, long value) {
        data.add(new byte[]{(byte) (value & 255), (byte) ((value >> 8) & 255), (byte) ((value >> 16) & 255), (byte) ((value >> 24) & 255)});
    }

    public final void s(ArrayList<byte[]> data, long value) {
        data.add(new byte[]{(byte) (value & 255), (byte) ((value >> 8) & 255), (byte) ((value >> 16) & 255), (byte) ((value >> 24) & 255)});
    }

    public final void t(ArrayList<byte[]> data, int value) {
        data.add(new byte[]{(byte) (value & 255), (byte) ((value >> 8) & 255)});
    }

    @NotNull
    public final Bitmap u(@NotNull Bitmap bgImage, int newWidth, int newHeight) {
        Intrinsics.checkNotNullParameter(bgImage, "bgImage");
        int width = bgImage.getWidth();
        int height = bgImage.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(newWidth / width, newHeight / height);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bgImage, 0, 0, width, height, matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(bgImage, 0,…th, height, matrix, true)");
        return bitmapCreateBitmap;
    }
}

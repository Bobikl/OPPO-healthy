package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ImageEntity;
import io.netty.util.internal.StringUtil;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmInline;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__IndentKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 G2\u00020\u0001:\u0001GB\u0014\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u001b\u001a\u00020 2\u0006\u0010!\u001a\u00020 ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0015\u0010\u001b\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020$¢\u0006\u0004\b\u001e\u0010%J\r\u0010&\u001a\u00020\u0018¢\u0006\u0004\b'\u0010\u001aJ\u0015\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b-\u0010+J\u0015\u0010.\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u000e¢\u0006\u0004\b/\u0010+J+\u00100\u001a\u00020\u00182\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\u000e2\b\b\u0002\u00103\u001a\u00020\u000e¢\u0006\u0004\b4\u00105J(\u00106\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00107\u001a\u00020\u000eH\u0086\n¢\u0006\u0004\b8\u00109J\u001b\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u001e\u0010>\u001a\u00020\u00182\u0006\u0010?\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010=J\u000f\u0010A\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ+\u0010E\u001a\u00020\u00182\b\b\u0002\u00101\u001a\u00020\u000e2\b\b\u0002\u00102\u001a\u00020\u000e2\b\b\u0002\u00103\u001a\u00020\u000e¢\u0006\u0004\bF\u00105R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006H"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "values", "", "constructor-impl", "([F)[F", "getValues", "()[F", "equals", "", "other", "equals-impl", "([FLjava/lang/Object;)Z", ParserTag.TAG_GET, "", "row", "", "column", "get-impl", "([FII)F", "hashCode", "hashCode-impl", "([F)I", "invert", "", "invert-impl", "([F)V", "map", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "map-impl", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "Landroidx/compose/ui/geometry/Offset;", "point", "map-MK-Hz9U", "([FJ)J", "Landroidx/compose/ui/geometry/Rect;", "([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "reset", "reset-impl", "rotateX", "degrees", "rotateX-impl", "([FF)V", "rotateY", "rotateY-impl", "rotateZ", "rotateZ-impl", "scale", "x", "y", "z", "scale-impl", "([FFFF)V", "set", "v", "set-impl", "([FIIF)V", "setFrom", ImageEntity.SCALE_TYPE_MATRIX, "setFrom-58bKbWc", "([F[F)V", "timesAssign", LogFieldKey.MESSAGE_KEY, "timesAssign-58bKbWc", "toString", "", "toString-impl", "([F)Ljava/lang/String;", "translate", "translate-impl", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,440:1\n39#1:441\n39#1:442\n39#1:443\n42#1,2:444\n42#1,2:446\n42#1,2:448\n42#1,2:450\n42#1,2:452\n42#1,2:454\n42#1,2:456\n42#1,2:458\n42#1,2:460\n42#1,2:462\n42#1,2:464\n42#1,2:466\n42#1,2:468\n42#1,2:470\n42#1,2:472\n42#1,2:474\n39#1:476\n39#1:477\n39#1:478\n39#1:479\n39#1:480\n39#1:481\n39#1:482\n39#1:483\n39#1:484\n39#1:485\n39#1:486\n39#1:487\n39#1:488\n39#1:489\n39#1:490\n39#1:491\n39#1:492\n39#1:493\n39#1:494\n39#1:495\n42#1,2:496\n42#1,2:498\n42#1,2:500\n42#1,2:502\n42#1,2:504\n42#1,2:506\n42#1,2:508\n42#1,2:510\n42#1,2:512\n42#1,2:514\n42#1,2:516\n42#1,2:518\n42#1,2:520\n42#1,2:522\n42#1,2:524\n42#1,2:526\n42#1,2:528\n39#1:530\n39#1:531\n39#1:532\n39#1:533\n39#1:534\n39#1:535\n39#1:536\n39#1:537\n42#1,2:538\n42#1,2:540\n42#1,2:542\n42#1,2:544\n42#1,2:546\n42#1,2:548\n42#1,2:550\n42#1,2:552\n39#1:554\n39#1:555\n39#1:556\n39#1:557\n39#1:558\n39#1:559\n39#1:560\n39#1:561\n42#1,2:562\n42#1,2:564\n42#1,2:566\n42#1,2:568\n42#1,2:570\n42#1,2:572\n42#1,2:574\n42#1,2:576\n39#1:578\n39#1:579\n39#1:580\n39#1:581\n39#1:582\n39#1:583\n39#1:584\n39#1:585\n42#1,2:586\n42#1,2:588\n42#1,2:590\n42#1,2:592\n42#1,2:594\n42#1,2:596\n42#1,2:598\n42#1,2:600\n39#1,5:602\n39#1,5:607\n39#1,5:612\n39#1,5:617\n39#1,5:622\n39#1,5:627\n39#1,5:632\n39#1,5:637\n39#1,5:642\n39#1,5:647\n39#1,5:652\n39#1,5:657\n39#1:662\n39#1:663\n39#1:664\n39#1:665\n39#1:666\n39#1:667\n39#1:668\n39#1:669\n39#1:670\n39#1:671\n39#1:672\n39#1:673\n39#1:674\n39#1:675\n39#1:676\n39#1:677\n42#1,2:678\n42#1,2:680\n42#1,2:682\n42#1,2:684\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n51#1:441\n56#1:442\n57#1:443\n112#1:444,2\n113#1:446,2\n114#1:448,2\n115#1:450,2\n116#1:452,2\n117#1:454,2\n118#1:456,2\n119#1:458,2\n120#1:460,2\n121#1:462,2\n122#1:464,2\n123#1:466,2\n124#1:468,2\n125#1:470,2\n126#1:472,2\n127#1:474,2\n132#1:476\n133#1:477\n134#1:478\n135#1:479\n143#1:480\n144#1:481\n145#1:482\n146#1:483\n147#1:484\n148#1:485\n149#1:486\n150#1:487\n151#1:488\n152#1:489\n153#1:490\n154#1:491\n155#1:492\n156#1:493\n157#1:494\n158#1:495\n177#1:496,2\n178#1:498,2\n179#1:500,2\n180#1:502,2\n181#1:504,2\n182#1:506,2\n183#1:508,2\n184#1:510,2\n185#1:512,2\n186#1:514,2\n187#1:516,2\n188#1:518,2\n189#1:520,2\n190#1:522,2\n191#1:524,2\n192#1:526,2\n201#1:528,2\n220#1:530\n221#1:531\n225#1:532\n226#1:533\n230#1:534\n231#1:535\n235#1:536\n236#1:537\n240#1:538,2\n241#1:540,2\n242#1:542,2\n243#1:544,2\n244#1:546,2\n245#1:548,2\n246#1:550,2\n247#1:552,2\n257#1:554\n258#1:555\n262#1:556\n263#1:557\n267#1:558\n268#1:559\n272#1:560\n273#1:561\n277#1:562,2\n278#1:564,2\n279#1:566,2\n280#1:568,2\n281#1:570,2\n282#1:572,2\n283#1:574,2\n284#1:576,2\n294#1:578\n295#1:579\n299#1:580\n300#1:581\n304#1:582\n305#1:583\n309#1:584\n310#1:585\n314#1:586,2\n315#1:588,2\n316#1:590,2\n317#1:592,2\n318#1:594,2\n319#1:596,2\n320#1:598,2\n321#1:600,2\n326#1:602,5\n327#1:607,5\n328#1:612,5\n329#1:617,5\n330#1:622,5\n331#1:627,5\n332#1:632,5\n333#1:637,5\n334#1:642,5\n335#1:647,5\n336#1:652,5\n337#1:657,5\n342#1:662\n343#1:663\n344#1:664\n345#1:665\n346#1:666\n347#1:667\n348#1:668\n349#1:669\n350#1:670\n351#1:671\n352#1:672\n353#1:673\n354#1:674\n355#1:675\n356#1:676\n357#1:677\n358#1:678,2\n359#1:680,2\n360#1:682,2\n361#1:684,2\n*E\n"})
public final class Matrix {
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;

    @NotNull
    private final float[] values;

    private /* synthetic */ Matrix(float[] fArr) {
        this.values = fArr;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Matrix m1840boximpl(float[] fArr) {
        return new Matrix(fArr);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static float[] m1841constructorimpl(@NotNull float[] values) {
        Intrinsics.checkNotNullParameter(values, "values");
        return values;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m1842constructorimpl$default(float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return m1841constructorimpl(fArr);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m1843equalsimpl(float[] fArr, Object obj) {
        return (obj instanceof Matrix) && Intrinsics.areEqual(fArr, ((Matrix) obj).m1863unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1844equalsimpl0(float[] fArr, float[] fArr2) {
        return Intrinsics.areEqual(fArr, fArr2);
    }

    /* JADX INFO: renamed from: get-impl, reason: not valid java name */
    public static final float m1845getimpl(float[] fArr, int i, int i2) {
        return fArr[(i * 4) + i2];
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m1846hashCodeimpl(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    /* JADX INFO: renamed from: invert-impl, reason: not valid java name */
    public static final void m1847invertimpl(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (((((f17 * f28) - (f18 * f27)) + (f19 * f26)) + (f20 * f25)) - (f21 * f24)) + (f22 * f23);
        if (f29 == 0.0f) {
            return;
        }
        float f30 = 1.0f / f29;
        fArr[0] = (((f6 * f28) - (f7 * f27)) + (f8 * f26)) * f30;
        fArr[1] = ((((-f2) * f28) + (f3 * f27)) - (f4 * f26)) * f30;
        fArr[2] = (((f14 * f22) - (f15 * f21)) + (f16 * f20)) * f30;
        fArr[3] = ((((-f10) * f22) + (f11 * f21)) - (f12 * f20)) * f30;
        float f31 = -f5;
        fArr[4] = (((f31 * f28) + (f7 * f25)) - (f8 * f24)) * f30;
        fArr[5] = (((f28 * f) - (f3 * f25)) + (f4 * f24)) * f30;
        float f32 = -f13;
        fArr[6] = (((f32 * f22) + (f15 * f19)) - (f16 * f18)) * f30;
        fArr[7] = (((f22 * f9) - (f11 * f19)) + (f12 * f18)) * f30;
        fArr[8] = (((f5 * f27) - (f6 * f25)) + (f8 * f23)) * f30;
        fArr[9] = ((((-f) * f27) + (f25 * f2)) - (f4 * f23)) * f30;
        fArr[10] = (((f13 * f21) - (f14 * f19)) + (f16 * f17)) * f30;
        fArr[11] = ((((-f9) * f21) + (f19 * f10)) - (f12 * f17)) * f30;
        fArr[12] = (((f31 * f26) + (f6 * f24)) - (f7 * f23)) * f30;
        fArr[13] = (((f * f26) - (f2 * f24)) + (f3 * f23)) * f30;
        fArr[14] = (((f32 * f20) + (f14 * f18)) - (f15 * f17)) * f30;
        fArr[15] = (((f9 * f20) - (f10 * f18)) + (f11 * f17)) * f30;
    }

    /* JADX INFO: renamed from: map-MK-Hz9U, reason: not valid java name */
    public static final long m1848mapMKHz9U(float[] fArr, long j2) {
        float fM1380getXimpl = Offset.m1380getXimpl(j2);
        float fM1381getYimpl = Offset.m1381getYimpl(j2);
        float f = 1 / (((fArr[3] * fM1380getXimpl) + (fArr[7] * fM1381getYimpl)) + fArr[15]);
        if (!((Float.isInfinite(f) || Float.isNaN(f)) ? false : true)) {
            f = 0.0f;
        }
        return OffsetKt.Offset(((fArr[0] * fM1380getXimpl) + (fArr[4] * fM1381getYimpl) + fArr[12]) * f, f * ((fArr[1] * fM1380getXimpl) + (fArr[5] * fM1381getYimpl) + fArr[13]));
    }

    @NotNull
    /* JADX INFO: renamed from: map-impl, reason: not valid java name */
    public static final Rect m1849mapimpl(float[] fArr, @NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        long jM1848mapMKHz9U = m1848mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long jM1848mapMKHz9U2 = m1848mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long jM1848mapMKHz9U3 = m1848mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long jM1848mapMKHz9U4 = m1848mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        return new Rect(Math.min(Math.min(Offset.m1380getXimpl(jM1848mapMKHz9U), Offset.m1380getXimpl(jM1848mapMKHz9U2)), Math.min(Offset.m1380getXimpl(jM1848mapMKHz9U3), Offset.m1380getXimpl(jM1848mapMKHz9U4))), Math.min(Math.min(Offset.m1381getYimpl(jM1848mapMKHz9U), Offset.m1381getYimpl(jM1848mapMKHz9U2)), Math.min(Offset.m1381getYimpl(jM1848mapMKHz9U3), Offset.m1381getYimpl(jM1848mapMKHz9U4))), Math.max(Math.max(Offset.m1380getXimpl(jM1848mapMKHz9U), Offset.m1380getXimpl(jM1848mapMKHz9U2)), Math.max(Offset.m1380getXimpl(jM1848mapMKHz9U3), Offset.m1380getXimpl(jM1848mapMKHz9U4))), Math.max(Math.max(Offset.m1381getYimpl(jM1848mapMKHz9U), Offset.m1381getYimpl(jM1848mapMKHz9U2)), Math.max(Offset.m1381getYimpl(jM1848mapMKHz9U3), Offset.m1381getYimpl(jM1848mapMKHz9U4))));
    }

    /* JADX INFO: renamed from: reset-impl, reason: not valid java name */
    public static final void m1851resetimpl(float[] fArr) {
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                fArr[(i2 * 4) + i] = i == i2 ? 1.0f : 0.0f;
                i2++;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: rotateX-impl, reason: not valid java name */
    public static final void m1852rotateXimpl(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[5];
        float f5 = fArr[6];
        float f6 = fArr[9];
        float f7 = fArr[10];
        float f8 = fArr[13];
        float f9 = fArr[14];
        fArr[1] = (f2 * fCos) - (f3 * fSin);
        fArr[2] = (f2 * fSin) + (f3 * fCos);
        fArr[5] = (f4 * fCos) - (f5 * fSin);
        fArr[6] = (f4 * fSin) + (f5 * fCos);
        fArr[9] = (f6 * fCos) - (f7 * fSin);
        fArr[10] = (f6 * fSin) + (f7 * fCos);
        fArr[13] = (f8 * fCos) - (f9 * fSin);
        fArr[14] = (f8 * fSin) + (f9 * fCos);
    }

    /* JADX INFO: renamed from: rotateY-impl, reason: not valid java name */
    public static final void m1853rotateYimpl(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[2];
        float f4 = fArr[4];
        float f5 = fArr[6];
        float f6 = fArr[8];
        float f7 = fArr[10];
        float f8 = fArr[12];
        float f9 = fArr[14];
        fArr[0] = (f2 * fCos) + (f3 * fSin);
        fArr[2] = ((-f2) * fSin) + (f3 * fCos);
        fArr[4] = (f4 * fCos) + (f5 * fSin);
        fArr[6] = ((-f4) * fSin) + (f5 * fCos);
        fArr[8] = (f6 * fCos) + (f7 * fSin);
        fArr[10] = ((-f6) * fSin) + (f7 * fCos);
        fArr[12] = (f8 * fCos) + (f9 * fSin);
        fArr[14] = ((-f8) * fSin) + (f9 * fCos);
    }

    /* JADX INFO: renamed from: rotateZ-impl, reason: not valid java name */
    public static final void m1854rotateZimpl(float[] fArr, float f) {
        double d = (((double) f) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = (fCos * f2) + (fSin * f3);
        float f5 = -fSin;
        float f6 = fArr[1];
        float f7 = fArr[5];
        float f8 = (fCos * f6) + (fSin * f7);
        float f9 = fArr[2];
        float f10 = fArr[6];
        float f11 = (fCos * f9) + (fSin * f10);
        float f12 = fArr[3];
        float f13 = fArr[7];
        fArr[0] = f4;
        fArr[1] = f8;
        fArr[2] = f11;
        fArr[3] = (fCos * f12) + (fSin * f13);
        fArr[4] = (f2 * f5) + (f3 * fCos);
        fArr[5] = (f6 * f5) + (f7 * fCos);
        fArr[6] = (f9 * f5) + (f10 * fCos);
        fArr[7] = (f5 * f12) + (fCos * f13);
    }

    /* JADX INFO: renamed from: scale-impl, reason: not valid java name */
    public static final void m1855scaleimpl(float[] fArr, float f, float f2, float f3) {
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    /* JADX INFO: renamed from: scale-impl$default, reason: not valid java name */
    public static /* synthetic */ void m1856scaleimpl$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 1.0f;
        }
        m1855scaleimpl(fArr, f, f2, f3);
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final void m1857setimpl(float[] fArr, int i, int i2, float f) {
        fArr[(i * 4) + i2] = f;
    }

    /* JADX INFO: renamed from: setFrom-58bKbWc, reason: not valid java name */
    public static final void m1858setFrom58bKbWc(float[] fArr, @NotNull float[] matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        for (int i = 0; i < 16; i++) {
            fArr[i] = matrix[i];
        }
    }

    /* JADX INFO: renamed from: timesAssign-58bKbWc, reason: not valid java name */
    public static final void m1859timesAssign58bKbWc(float[] fArr, @NotNull float[] m) {
        Intrinsics.checkNotNullParameter(m, "m");
        float fM1865dotp89u6pk = MatrixKt.m1865dotp89u6pk(fArr, 0, m, 0);
        float fM1865dotp89u6pk2 = MatrixKt.m1865dotp89u6pk(fArr, 0, m, 1);
        float fM1865dotp89u6pk3 = MatrixKt.m1865dotp89u6pk(fArr, 0, m, 2);
        float fM1865dotp89u6pk4 = MatrixKt.m1865dotp89u6pk(fArr, 0, m, 3);
        float fM1865dotp89u6pk5 = MatrixKt.m1865dotp89u6pk(fArr, 1, m, 0);
        float fM1865dotp89u6pk6 = MatrixKt.m1865dotp89u6pk(fArr, 1, m, 1);
        float fM1865dotp89u6pk7 = MatrixKt.m1865dotp89u6pk(fArr, 1, m, 2);
        float fM1865dotp89u6pk8 = MatrixKt.m1865dotp89u6pk(fArr, 1, m, 3);
        float fM1865dotp89u6pk9 = MatrixKt.m1865dotp89u6pk(fArr, 2, m, 0);
        float fM1865dotp89u6pk10 = MatrixKt.m1865dotp89u6pk(fArr, 2, m, 1);
        float fM1865dotp89u6pk11 = MatrixKt.m1865dotp89u6pk(fArr, 2, m, 2);
        float fM1865dotp89u6pk12 = MatrixKt.m1865dotp89u6pk(fArr, 2, m, 3);
        float fM1865dotp89u6pk13 = MatrixKt.m1865dotp89u6pk(fArr, 3, m, 0);
        float fM1865dotp89u6pk14 = MatrixKt.m1865dotp89u6pk(fArr, 3, m, 1);
        float fM1865dotp89u6pk15 = MatrixKt.m1865dotp89u6pk(fArr, 3, m, 2);
        float fM1865dotp89u6pk16 = MatrixKt.m1865dotp89u6pk(fArr, 3, m, 3);
        fArr[0] = fM1865dotp89u6pk;
        fArr[1] = fM1865dotp89u6pk2;
        fArr[2] = fM1865dotp89u6pk3;
        fArr[3] = fM1865dotp89u6pk4;
        fArr[4] = fM1865dotp89u6pk5;
        fArr[5] = fM1865dotp89u6pk6;
        fArr[6] = fM1865dotp89u6pk7;
        fArr[7] = fM1865dotp89u6pk8;
        fArr[8] = fM1865dotp89u6pk9;
        fArr[9] = fM1865dotp89u6pk10;
        fArr[10] = fM1865dotp89u6pk11;
        fArr[11] = fM1865dotp89u6pk12;
        fArr[12] = fM1865dotp89u6pk13;
        fArr[13] = fM1865dotp89u6pk14;
        fArr[14] = fM1865dotp89u6pk15;
        fArr[15] = fM1865dotp89u6pk16;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m1860toStringimpl(float[] fArr) {
        return StringsKt__IndentKt.trimIndent("\n            |" + fArr[0] + StringUtil.SPACE + fArr[1] + StringUtil.SPACE + fArr[2] + StringUtil.SPACE + fArr[3] + "|\n            |" + fArr[4] + StringUtil.SPACE + fArr[5] + StringUtil.SPACE + fArr[6] + StringUtil.SPACE + fArr[7] + "|\n            |" + fArr[8] + StringUtil.SPACE + fArr[9] + StringUtil.SPACE + fArr[10] + StringUtil.SPACE + fArr[11] + "|\n            |" + fArr[12] + StringUtil.SPACE + fArr[13] + StringUtil.SPACE + fArr[14] + StringUtil.SPACE + fArr[15] + "|\n        ");
    }

    /* JADX INFO: renamed from: translate-impl, reason: not valid java name */
    public static final void m1861translateimpl(float[] fArr, float f, float f2, float f3) {
        float f4 = (fArr[0] * f) + (fArr[4] * f2) + (fArr[8] * f3) + fArr[12];
        float f5 = (fArr[1] * f) + (fArr[5] * f2) + (fArr[9] * f3) + fArr[13];
        float f6 = (fArr[2] * f) + (fArr[6] * f2) + (fArr[10] * f3) + fArr[14];
        float f7 = (fArr[3] * f) + (fArr[7] * f2) + (fArr[11] * f3) + fArr[15];
        fArr[12] = f4;
        fArr[13] = f5;
        fArr[14] = f6;
        fArr[15] = f7;
    }

    /* JADX INFO: renamed from: translate-impl$default, reason: not valid java name */
    public static /* synthetic */ void m1862translateimpl$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        m1861translateimpl(fArr, f, f2, f3);
    }

    public boolean equals(Object obj) {
        return m1843equalsimpl(this.values, obj);
    }

    @NotNull
    public final float[] getValues() {
        return this.values;
    }

    public int hashCode() {
        return m1846hashCodeimpl(this.values);
    }

    @NotNull
    public String toString() {
        return m1860toStringimpl(this.values);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m1863unboximpl() {
        return this.values;
    }

    /* JADX INFO: renamed from: map-impl, reason: not valid java name */
    public static final void m1850mapimpl(float[] fArr, @NotNull MutableRect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        long jM1848mapMKHz9U = m1848mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getTop()));
        long jM1848mapMKHz9U2 = m1848mapMKHz9U(fArr, OffsetKt.Offset(rect.getLeft(), rect.getBottom()));
        long jM1848mapMKHz9U3 = m1848mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getTop()));
        long jM1848mapMKHz9U4 = m1848mapMKHz9U(fArr, OffsetKt.Offset(rect.getRight(), rect.getBottom()));
        rect.setLeft(Math.min(Math.min(Offset.m1380getXimpl(jM1848mapMKHz9U), Offset.m1380getXimpl(jM1848mapMKHz9U2)), Math.min(Offset.m1380getXimpl(jM1848mapMKHz9U3), Offset.m1380getXimpl(jM1848mapMKHz9U4))));
        rect.setTop(Math.min(Math.min(Offset.m1381getYimpl(jM1848mapMKHz9U), Offset.m1381getYimpl(jM1848mapMKHz9U2)), Math.min(Offset.m1381getYimpl(jM1848mapMKHz9U3), Offset.m1381getYimpl(jM1848mapMKHz9U4))));
        rect.setRight(Math.max(Math.max(Offset.m1380getXimpl(jM1848mapMKHz9U), Offset.m1380getXimpl(jM1848mapMKHz9U2)), Math.max(Offset.m1380getXimpl(jM1848mapMKHz9U3), Offset.m1380getXimpl(jM1848mapMKHz9U4))));
        rect.setBottom(Math.max(Math.max(Offset.m1381getYimpl(jM1848mapMKHz9U), Offset.m1381getYimpl(jM1848mapMKHz9U2)), Math.max(Offset.m1381getYimpl(jM1848mapMKHz9U3), Offset.m1381getYimpl(jM1848mapMKHz9U4))));
    }
}

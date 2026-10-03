package androidx.compose.ui.graphics.vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysJvmKt;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.IntIterator;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.IntProgression;
import p010kotlin.ranges.IntRange;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aB\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\b2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110#¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020!0&H\u0082\b\u001a\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020!0 *\u00020\u00012\u0006\u0010\"\u001a\u00020#H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"ArcToKey", "", "CloseKey", "CurveToKey", "HorizontalToKey", "LineToKey", "MoveToKey", "NUM_ARC_TO_ARGS", "", "NUM_CURVE_TO_ARGS", "NUM_HORIZONTAL_TO_ARGS", "NUM_LINE_TO_ARGS", "NUM_MOVE_TO_ARGS", "NUM_QUAD_TO_ARGS", "NUM_REFLECTIVE_CURVE_TO_ARGS", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_VERTICAL_TO_ARGS", "QuadToKey", "ReflectiveCurveToKey", "ReflectiveQuadToKey", "RelativeArcToKey", "RelativeCloseKey", "RelativeCurveToKey", "RelativeHorizontalToKey", "RelativeLineToKey", "RelativeMoveToKey", "RelativeQuadToKey", "RelativeReflectiveCurveToKey", "RelativeReflectiveQuadToKey", "RelativeVerticalToKey", "VerticalToKey", "pathNodesFromArgs", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "args", "", "numArgs", "nodeFor", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "subArray", "toPathNodes", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPathNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,333:1\n283#1:334\n284#1,9:338\n283#1:348\n284#1,9:352\n283#1:362\n284#1,9:366\n283#1:376\n284#1,9:380\n283#1:390\n284#1,9:394\n283#1:404\n284#1,9:408\n283#1:418\n284#1,9:422\n283#1:432\n284#1,9:436\n283#1:446\n284#1,9:450\n283#1:460\n284#1,9:464\n283#1:474\n284#1,9:478\n283#1:488\n284#1,9:492\n283#1:502\n284#1,9:506\n283#1:516\n284#1,9:520\n283#1:530\n284#1,9:534\n283#1:544\n284#1,9:548\n283#1:558\n284#1,9:562\n283#1:572\n284#1,9:576\n1549#2:335\n1620#2,2:336\n1622#2:347\n1549#2:349\n1620#2,2:350\n1622#2:361\n1549#2:363\n1620#2,2:364\n1622#2:375\n1549#2:377\n1620#2,2:378\n1622#2:389\n1549#2:391\n1620#2,2:392\n1622#2:403\n1549#2:405\n1620#2,2:406\n1622#2:417\n1549#2:419\n1620#2,2:420\n1622#2:431\n1549#2:433\n1620#2,2:434\n1622#2:445\n1549#2:447\n1620#2,2:448\n1622#2:459\n1549#2:461\n1620#2,2:462\n1622#2:473\n1549#2:475\n1620#2,2:476\n1622#2:487\n1549#2:489\n1620#2,2:490\n1622#2:501\n1549#2:503\n1620#2,2:504\n1622#2:515\n1549#2:517\n1620#2,2:518\n1622#2:529\n1549#2:531\n1620#2,2:532\n1622#2:543\n1549#2:545\n1620#2,2:546\n1622#2:557\n1549#2:559\n1620#2,2:560\n1622#2:571\n1549#2:573\n1620#2,2:574\n1622#2:585\n1549#2:586\n1620#2,3:587\n*S KotlinDebug\n*F\n+ 1 PathNode.kt\nandroidx/compose/ui/graphics/vector/PathNodeKt\n*L\n153#1:334\n153#1:338,9\n157#1:348\n157#1:352,9\n161#1:362\n161#1:366,9\n165#1:376\n165#1:380,9\n169#1:390\n169#1:394,9\n173#1:404\n173#1:408,9\n177#1:418\n177#1:422,9\n181#1:432\n181#1:436,9\n185#1:446\n185#1:450,9\n196#1:460\n196#1:464,9\n207#1:474\n207#1:478,9\n216#1:488\n216#1:492,9\n225#1:502\n225#1:506,9\n234#1:516\n234#1:520,9\n243#1:530\n243#1:534,9\n247#1:544\n247#1:548,9\n251#1:558\n251#1:562,9\n263#1:572\n263#1:576,9\n153#1:335\n153#1:336,2\n153#1:347\n157#1:349\n157#1:350,2\n157#1:361\n161#1:363\n161#1:364,2\n161#1:375\n165#1:377\n165#1:378,2\n165#1:389\n169#1:391\n169#1:392,2\n169#1:403\n173#1:405\n173#1:406,2\n173#1:417\n177#1:419\n177#1:420,2\n177#1:431\n181#1:433\n181#1:434,2\n181#1:445\n185#1:447\n185#1:448,2\n185#1:459\n196#1:461\n196#1:462,2\n196#1:473\n207#1:475\n207#1:476,2\n207#1:487\n216#1:489\n216#1:490,2\n216#1:501\n225#1:503\n225#1:504,2\n225#1:515\n234#1:517\n234#1:518,2\n234#1:529\n243#1:531\n243#1:532,2\n243#1:543\n247#1:545\n247#1:546,2\n247#1:557\n251#1:559\n251#1:560,2\n251#1:571\n263#1:573\n263#1:574,2\n263#1:585\n283#1:586\n283#1:587,3\n*E\n"})
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [float[], java.lang.Object] */
    private static final List<PathNode> pathNodesFromArgs(float[] fArr, int i, Function1<? super float[], ? extends PathNode> function1) {
        IntProgression intProgressionStep = RangesKt___RangesKt.step(new IntRange(0, fArr.length - i), i);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep, 10));
        Iterator<Integer> it = intProgressionStep.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            ?? CopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(fArr, iNextInt, iNextInt + i);
            Object relativeLineTo = (PathNode) function1.invoke(CopyOfRange);
            if ((relativeLineTo instanceof PathNode.MoveTo) && iNextInt > 0) {
                relativeLineTo = new PathNode.LineTo(CopyOfRange[0], CopyOfRange[1]);
            } else if ((relativeLineTo instanceof PathNode.RelativeMoveTo) && iNextInt > 0) {
                relativeLineTo = new PathNode.RelativeLineTo(CopyOfRange[0], CopyOfRange[1]);
            }
            arrayList.add(relativeLineTo);
        }
        return arrayList;
    }

    @NotNull
    public static final List<PathNode> toPathNodes(char c2, @NotNull float[] args) {
        ArrayList arrayList;
        PathNode relativeLineTo;
        Intrinsics.checkNotNullParameter(args, "args");
        if (c2 == 'z' || c2 == 'Z') {
            return CollectionsKt__CollectionsJVMKt.listOf(PathNode.Close.INSTANCE);
        }
        if (c2 == 'm') {
            IntProgression intProgressionStep = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep, 10));
            Iterator<Integer> it = intProgressionStep.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                float[] fArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(args, iNextInt, iNextInt + 2);
                PathNode relativeMoveTo = new PathNode.RelativeMoveTo(fArrCopyOfRange[0], fArrCopyOfRange[1]);
                if ((relativeMoveTo instanceof PathNode.MoveTo) && iNextInt > 0) {
                    relativeMoveTo = new PathNode.LineTo(fArrCopyOfRange[0], fArrCopyOfRange[1]);
                } else if (iNextInt > 0) {
                    relativeMoveTo = new PathNode.RelativeLineTo(fArrCopyOfRange[0], fArrCopyOfRange[1]);
                }
                arrayList.add(relativeMoveTo);
            }
        } else if (c2 == 'M') {
            IntProgression intProgressionStep2 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep2, 10));
            Iterator<Integer> it2 = intProgressionStep2.iterator();
            while (it2.hasNext()) {
                int iNextInt2 = ((IntIterator) it2).nextInt();
                float[] fArrCopyOfRange2 = ArraysKt___ArraysJvmKt.copyOfRange(args, iNextInt2, iNextInt2 + 2);
                PathNode moveTo = new PathNode.MoveTo(fArrCopyOfRange2[0], fArrCopyOfRange2[1]);
                if (iNextInt2 > 0) {
                    moveTo = new PathNode.LineTo(fArrCopyOfRange2[0], fArrCopyOfRange2[1]);
                } else if ((moveTo instanceof PathNode.RelativeMoveTo) && iNextInt2 > 0) {
                    moveTo = new PathNode.RelativeLineTo(fArrCopyOfRange2[0], fArrCopyOfRange2[1]);
                }
                arrayList.add(moveTo);
            }
        } else if (c2 == 'l') {
            IntProgression intProgressionStep3 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep3, 10));
            Iterator<Integer> it3 = intProgressionStep3.iterator();
            while (it3.hasNext()) {
                int iNextInt3 = ((IntIterator) it3).nextInt();
                float[] fArrCopyOfRange3 = ArraysKt___ArraysJvmKt.copyOfRange(args, iNextInt3, iNextInt3 + 2);
                PathNode relativeLineTo2 = new PathNode.RelativeLineTo(fArrCopyOfRange3[0], fArrCopyOfRange3[1]);
                if ((relativeLineTo2 instanceof PathNode.MoveTo) && iNextInt3 > 0) {
                    relativeLineTo2 = new PathNode.LineTo(fArrCopyOfRange3[0], fArrCopyOfRange3[1]);
                } else if ((relativeLineTo2 instanceof PathNode.RelativeMoveTo) && iNextInt3 > 0) {
                    relativeLineTo2 = new PathNode.RelativeLineTo(fArrCopyOfRange3[0], fArrCopyOfRange3[1]);
                }
                arrayList.add(relativeLineTo2);
            }
        } else if (c2 == 'L') {
            IntProgression intProgressionStep4 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep4, 10));
            Iterator<Integer> it4 = intProgressionStep4.iterator();
            while (it4.hasNext()) {
                int iNextInt4 = ((IntIterator) it4).nextInt();
                float[] fArrCopyOfRange4 = ArraysKt___ArraysJvmKt.copyOfRange(args, iNextInt4, iNextInt4 + 2);
                PathNode lineTo = new PathNode.LineTo(fArrCopyOfRange4[0], fArrCopyOfRange4[1]);
                if ((lineTo instanceof PathNode.MoveTo) && iNextInt4 > 0) {
                    lineTo = new PathNode.LineTo(fArrCopyOfRange4[0], fArrCopyOfRange4[1]);
                } else if ((lineTo instanceof PathNode.RelativeMoveTo) && iNextInt4 > 0) {
                    lineTo = new PathNode.RelativeLineTo(fArrCopyOfRange4[0], fArrCopyOfRange4[1]);
                }
                arrayList.add(lineTo);
            }
        } else if (c2 == 'h') {
            IntProgression intProgressionStep5 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep5, 10));
            Iterator<Integer> it5 = intProgressionStep5.iterator();
            while (it5.hasNext()) {
                int iNextInt5 = ((IntIterator) it5).nextInt();
                float[] fArrCopyOfRange5 = ArraysKt___ArraysJvmKt.copyOfRange(args, iNextInt5, iNextInt5 + 1);
                PathNode relativeHorizontalTo = new PathNode.RelativeHorizontalTo(fArrCopyOfRange5[0]);
                if ((relativeHorizontalTo instanceof PathNode.MoveTo) && iNextInt5 > 0) {
                    relativeHorizontalTo = new PathNode.LineTo(fArrCopyOfRange5[0], fArrCopyOfRange5[1]);
                } else if ((relativeHorizontalTo instanceof PathNode.RelativeMoveTo) && iNextInt5 > 0) {
                    relativeHorizontalTo = new PathNode.RelativeLineTo(fArrCopyOfRange5[0], fArrCopyOfRange5[1]);
                }
                arrayList.add(relativeHorizontalTo);
            }
        } else if (c2 == 'H') {
            IntProgression intProgressionStep6 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep6, 10));
            Iterator<Integer> it6 = intProgressionStep6.iterator();
            while (it6.hasNext()) {
                int iNextInt6 = ((IntIterator) it6).nextInt();
                float[] fArrCopyOfRange6 = ArraysKt___ArraysJvmKt.copyOfRange(args, iNextInt6, iNextInt6 + 1);
                PathNode horizontalTo = new PathNode.HorizontalTo(fArrCopyOfRange6[0]);
                if ((horizontalTo instanceof PathNode.MoveTo) && iNextInt6 > 0) {
                    horizontalTo = new PathNode.LineTo(fArrCopyOfRange6[0], fArrCopyOfRange6[1]);
                } else if ((horizontalTo instanceof PathNode.RelativeMoveTo) && iNextInt6 > 0) {
                    horizontalTo = new PathNode.RelativeLineTo(fArrCopyOfRange6[0], fArrCopyOfRange6[1]);
                }
                arrayList.add(horizontalTo);
            }
        } else if (c2 == 'v') {
            IntProgression intProgressionStep7 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep7, 10));
            Iterator<Integer> it7 = intProgressionStep7.iterator();
            while (it7.hasNext()) {
                int iNextInt7 = ((IntIterator) it7).nextInt();
                float[] fArrCopyOfRange7 = ArraysKt___ArraysJvmKt.copyOfRange(args, iNextInt7, iNextInt7 + 1);
                PathNode relativeVerticalTo = new PathNode.RelativeVerticalTo(fArrCopyOfRange7[0]);
                if ((relativeVerticalTo instanceof PathNode.MoveTo) && iNextInt7 > 0) {
                    relativeVerticalTo = new PathNode.LineTo(fArrCopyOfRange7[0], fArrCopyOfRange7[1]);
                } else if ((relativeVerticalTo instanceof PathNode.RelativeMoveTo) && iNextInt7 > 0) {
                    relativeVerticalTo = new PathNode.RelativeLineTo(fArrCopyOfRange7[0], fArrCopyOfRange7[1]);
                }
                arrayList.add(relativeVerticalTo);
            }
        } else if (c2 == 'V') {
            IntProgression intProgressionStep8 = RangesKt___RangesKt.step(new IntRange(0, args.length - 1), 1);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep8, 10));
            Iterator<Integer> it8 = intProgressionStep8.iterator();
            while (it8.hasNext()) {
                int iNextInt8 = ((IntIterator) it8).nextInt();
                float[] fArrCopyOfRange8 = ArraysKt___ArraysJvmKt.copyOfRange(args, iNextInt8, iNextInt8 + 1);
                PathNode verticalTo = new PathNode.VerticalTo(fArrCopyOfRange8[0]);
                if ((verticalTo instanceof PathNode.MoveTo) && iNextInt8 > 0) {
                    verticalTo = new PathNode.LineTo(fArrCopyOfRange8[0], fArrCopyOfRange8[1]);
                } else if ((verticalTo instanceof PathNode.RelativeMoveTo) && iNextInt8 > 0) {
                    verticalTo = new PathNode.RelativeLineTo(fArrCopyOfRange8[0], fArrCopyOfRange8[1]);
                }
                arrayList.add(verticalTo);
            }
        } else {
            char c3 = 5;
            if (c2 == 'c') {
                IntProgression intProgressionStep9 = RangesKt___RangesKt.step(new IntRange(0, args.length - 6), 6);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep9, 10));
                Iterator<Integer> it9 = intProgressionStep9.iterator();
                while (it9.hasNext()) {
                    int iNextInt9 = ((IntIterator) it9).nextInt();
                    float[] fArrCopyOfRange9 = ArraysKt___ArraysJvmKt.copyOfRange(args, iNextInt9, iNextInt9 + 6);
                    PathNode relativeCurveTo = new PathNode.RelativeCurveTo(fArrCopyOfRange9[0], fArrCopyOfRange9[1], fArrCopyOfRange9[2], fArrCopyOfRange9[3], fArrCopyOfRange9[4], fArrCopyOfRange9[c3]);
                    if (!(relativeCurveTo instanceof PathNode.MoveTo) || iNextInt9 <= 0) {
                        relativeLineTo = (!(relativeCurveTo instanceof PathNode.RelativeMoveTo) || iNextInt9 <= 0) ? relativeCurveTo : new PathNode.RelativeLineTo(fArrCopyOfRange9[0], fArrCopyOfRange9[1]);
                    } else {
                        relativeLineTo = new PathNode.LineTo(fArrCopyOfRange9[0], fArrCopyOfRange9[1]);
                    }
                    arrayList.add(relativeLineTo);
                    c3 = 5;
                }
            } else if (c2 == 'C') {
                IntProgression intProgressionStep10 = RangesKt___RangesKt.step(new IntRange(0, args.length - 6), 6);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep10, 10));
                Iterator<Integer> it10 = intProgressionStep10.iterator();
                while (it10.hasNext()) {
                    int iNextInt10 = ((IntIterator) it10).nextInt();
                    float[] fArrCopyOfRange10 = ArraysKt___ArraysJvmKt.copyOfRange(args, iNextInt10, iNextInt10 + 6);
                    PathNode curveTo = new PathNode.CurveTo(fArrCopyOfRange10[0], fArrCopyOfRange10[1], fArrCopyOfRange10[2], fArrCopyOfRange10[3], fArrCopyOfRange10[4], fArrCopyOfRange10[5]);
                    if ((curveTo instanceof PathNode.MoveTo) && iNextInt10 > 0) {
                        curveTo = new PathNode.LineTo(fArrCopyOfRange10[0], fArrCopyOfRange10[1]);
                    } else if ((curveTo instanceof PathNode.RelativeMoveTo) && iNextInt10 > 0) {
                        curveTo = new PathNode.RelativeLineTo(fArrCopyOfRange10[0], fArrCopyOfRange10[1]);
                    }
                    arrayList.add(curveTo);
                }
            } else if (c2 == 's') {
                IntProgression intProgressionStep11 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep11, 10));
                Iterator<Integer> it11 = intProgressionStep11.iterator();
                while (it11.hasNext()) {
                    int iNextInt11 = ((IntIterator) it11).nextInt();
                    float[] fArrCopyOfRange11 = ArraysKt___ArraysJvmKt.copyOfRange(args, iNextInt11, iNextInt11 + 4);
                    PathNode relativeReflectiveCurveTo = new PathNode.RelativeReflectiveCurveTo(fArrCopyOfRange11[0], fArrCopyOfRange11[1], fArrCopyOfRange11[2], fArrCopyOfRange11[3]);
                    if ((relativeReflectiveCurveTo instanceof PathNode.MoveTo) && iNextInt11 > 0) {
                        relativeReflectiveCurveTo = new PathNode.LineTo(fArrCopyOfRange11[0], fArrCopyOfRange11[1]);
                    } else if ((relativeReflectiveCurveTo instanceof PathNode.RelativeMoveTo) && iNextInt11 > 0) {
                        relativeReflectiveCurveTo = new PathNode.RelativeLineTo(fArrCopyOfRange11[0], fArrCopyOfRange11[1]);
                    }
                    arrayList.add(relativeReflectiveCurveTo);
                }
            } else if (c2 == 'S') {
                IntProgression intProgressionStep12 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep12, 10));
                Iterator<Integer> it12 = intProgressionStep12.iterator();
                while (it12.hasNext()) {
                    int iNextInt12 = ((IntIterator) it12).nextInt();
                    float[] fArrCopyOfRange12 = ArraysKt___ArraysJvmKt.copyOfRange(args, iNextInt12, iNextInt12 + 4);
                    PathNode reflectiveCurveTo = new PathNode.ReflectiveCurveTo(fArrCopyOfRange12[0], fArrCopyOfRange12[1], fArrCopyOfRange12[2], fArrCopyOfRange12[3]);
                    if ((reflectiveCurveTo instanceof PathNode.MoveTo) && iNextInt12 > 0) {
                        reflectiveCurveTo = new PathNode.LineTo(fArrCopyOfRange12[0], fArrCopyOfRange12[1]);
                    } else if ((reflectiveCurveTo instanceof PathNode.RelativeMoveTo) && iNextInt12 > 0) {
                        reflectiveCurveTo = new PathNode.RelativeLineTo(fArrCopyOfRange12[0], fArrCopyOfRange12[1]);
                    }
                    arrayList.add(reflectiveCurveTo);
                }
            } else if (c2 == 'q') {
                IntProgression intProgressionStep13 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep13, 10));
                Iterator<Integer> it13 = intProgressionStep13.iterator();
                while (it13.hasNext()) {
                    int iNextInt13 = ((IntIterator) it13).nextInt();
                    float[] fArrCopyOfRange13 = ArraysKt___ArraysJvmKt.copyOfRange(args, iNextInt13, iNextInt13 + 4);
                    PathNode relativeQuadTo = new PathNode.RelativeQuadTo(fArrCopyOfRange13[0], fArrCopyOfRange13[1], fArrCopyOfRange13[2], fArrCopyOfRange13[3]);
                    if ((relativeQuadTo instanceof PathNode.MoveTo) && iNextInt13 > 0) {
                        relativeQuadTo = new PathNode.LineTo(fArrCopyOfRange13[0], fArrCopyOfRange13[1]);
                    } else if ((relativeQuadTo instanceof PathNode.RelativeMoveTo) && iNextInt13 > 0) {
                        relativeQuadTo = new PathNode.RelativeLineTo(fArrCopyOfRange13[0], fArrCopyOfRange13[1]);
                    }
                    arrayList.add(relativeQuadTo);
                }
            } else if (c2 == 'Q') {
                IntProgression intProgressionStep14 = RangesKt___RangesKt.step(new IntRange(0, args.length - 4), 4);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep14, 10));
                Iterator<Integer> it14 = intProgressionStep14.iterator();
                while (it14.hasNext()) {
                    int iNextInt14 = ((IntIterator) it14).nextInt();
                    float[] fArrCopyOfRange14 = ArraysKt___ArraysJvmKt.copyOfRange(args, iNextInt14, iNextInt14 + 4);
                    PathNode quadTo = new PathNode.QuadTo(fArrCopyOfRange14[0], fArrCopyOfRange14[1], fArrCopyOfRange14[2], fArrCopyOfRange14[3]);
                    if ((quadTo instanceof PathNode.MoveTo) && iNextInt14 > 0) {
                        quadTo = new PathNode.LineTo(fArrCopyOfRange14[0], fArrCopyOfRange14[1]);
                    } else if ((quadTo instanceof PathNode.RelativeMoveTo) && iNextInt14 > 0) {
                        quadTo = new PathNode.RelativeLineTo(fArrCopyOfRange14[0], fArrCopyOfRange14[1]);
                    }
                    arrayList.add(quadTo);
                }
            } else if (c2 == 't') {
                IntProgression intProgressionStep15 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep15, 10));
                Iterator<Integer> it15 = intProgressionStep15.iterator();
                while (it15.hasNext()) {
                    int iNextInt15 = ((IntIterator) it15).nextInt();
                    float[] fArrCopyOfRange15 = ArraysKt___ArraysJvmKt.copyOfRange(args, iNextInt15, iNextInt15 + 2);
                    PathNode relativeReflectiveQuadTo = new PathNode.RelativeReflectiveQuadTo(fArrCopyOfRange15[0], fArrCopyOfRange15[1]);
                    if ((relativeReflectiveQuadTo instanceof PathNode.MoveTo) && iNextInt15 > 0) {
                        relativeReflectiveQuadTo = new PathNode.LineTo(fArrCopyOfRange15[0], fArrCopyOfRange15[1]);
                    } else if ((relativeReflectiveQuadTo instanceof PathNode.RelativeMoveTo) && iNextInt15 > 0) {
                        relativeReflectiveQuadTo = new PathNode.RelativeLineTo(fArrCopyOfRange15[0], fArrCopyOfRange15[1]);
                    }
                    arrayList.add(relativeReflectiveQuadTo);
                }
            } else if (c2 == 'T') {
                IntProgression intProgressionStep16 = RangesKt___RangesKt.step(new IntRange(0, args.length - 2), 2);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep16, 10));
                Iterator<Integer> it16 = intProgressionStep16.iterator();
                while (it16.hasNext()) {
                    int iNextInt16 = ((IntIterator) it16).nextInt();
                    float[] fArrCopyOfRange16 = ArraysKt___ArraysJvmKt.copyOfRange(args, iNextInt16, iNextInt16 + 2);
                    PathNode reflectiveQuadTo = new PathNode.ReflectiveQuadTo(fArrCopyOfRange16[0], fArrCopyOfRange16[1]);
                    if ((reflectiveQuadTo instanceof PathNode.MoveTo) && iNextInt16 > 0) {
                        reflectiveQuadTo = new PathNode.LineTo(fArrCopyOfRange16[0], fArrCopyOfRange16[1]);
                    } else if ((reflectiveQuadTo instanceof PathNode.RelativeMoveTo) && iNextInt16 > 0) {
                        reflectiveQuadTo = new PathNode.RelativeLineTo(fArrCopyOfRange16[0], fArrCopyOfRange16[1]);
                    }
                    arrayList.add(reflectiveQuadTo);
                }
            } else if (c2 == 'a') {
                IntProgression intProgressionStep17 = RangesKt___RangesKt.step(new IntRange(0, args.length - 7), 7);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep17, 10));
                Iterator<Integer> it17 = intProgressionStep17.iterator();
                while (it17.hasNext()) {
                    int iNextInt17 = ((IntIterator) it17).nextInt();
                    float[] fArrCopyOfRange17 = ArraysKt___ArraysJvmKt.copyOfRange(args, iNextInt17, iNextInt17 + 7);
                    PathNode relativeArcTo = new PathNode.RelativeArcTo(fArrCopyOfRange17[0], fArrCopyOfRange17[1], fArrCopyOfRange17[2], Float.compare(fArrCopyOfRange17[3], 0.0f) != 0, Float.compare(fArrCopyOfRange17[4], 0.0f) != 0, fArrCopyOfRange17[5], fArrCopyOfRange17[6]);
                    if ((relativeArcTo instanceof PathNode.MoveTo) && iNextInt17 > 0) {
                        relativeArcTo = new PathNode.LineTo(fArrCopyOfRange17[0], fArrCopyOfRange17[1]);
                    } else if ((relativeArcTo instanceof PathNode.RelativeMoveTo) && iNextInt17 > 0) {
                        relativeArcTo = new PathNode.RelativeLineTo(fArrCopyOfRange17[0], fArrCopyOfRange17[1]);
                    }
                    arrayList.add(relativeArcTo);
                }
            } else {
                if (c2 != 'A') {
                    throw new IllegalArgumentException("Unknown command for: " + c2);
                }
                IntProgression intProgressionStep18 = RangesKt___RangesKt.step(new IntRange(0, args.length - 7), 7);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep18, 10));
                Iterator<Integer> it18 = intProgressionStep18.iterator();
                while (it18.hasNext()) {
                    int iNextInt18 = ((IntIterator) it18).nextInt();
                    float[] fArrCopyOfRange18 = ArraysKt___ArraysJvmKt.copyOfRange(args, iNextInt18, iNextInt18 + 7);
                    PathNode arcTo = new PathNode.ArcTo(fArrCopyOfRange18[0], fArrCopyOfRange18[1], fArrCopyOfRange18[2], Float.compare(fArrCopyOfRange18[3], 0.0f) != 0, Float.compare(fArrCopyOfRange18[4], 0.0f) != 0, fArrCopyOfRange18[5], fArrCopyOfRange18[6]);
                    if ((arcTo instanceof PathNode.MoveTo) && iNextInt18 > 0) {
                        arcTo = new PathNode.LineTo(fArrCopyOfRange18[0], fArrCopyOfRange18[1]);
                    } else if ((arcTo instanceof PathNode.RelativeMoveTo) && iNextInt18 > 0) {
                        arcTo = new PathNode.RelativeLineTo(fArrCopyOfRange18[0], fArrCopyOfRange18[1]);
                    }
                    arrayList.add(arcTo);
                }
            }
        }
        return arrayList;
    }
}

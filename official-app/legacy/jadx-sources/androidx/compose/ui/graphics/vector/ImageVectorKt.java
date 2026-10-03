package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0089\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0086\bø\u0001\u0000\u001a\u009e\u0001\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020 2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0086\bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b#\u0010$\u001a'\u0010%\u001a\u0002H&\"\u0004\b\u0000\u0010&*\u0012\u0012\u0004\u0012\u0002H&0'j\b\u0012\u0004\u0012\u0002H&`(H\u0002¢\u0006\u0002\u0010)\u001a'\u0010*\u001a\u0002H&\"\u0004\b\u0000\u0010&*\u0012\u0012\u0004\u0012\u0002H&0'j\b\u0012\u0004\u0012\u0002H&`(H\u0002¢\u0006\u0002\u0010)\u001a/\u0010+\u001a\u00020,\"\u0004\b\u0000\u0010&*\u0012\u0012\u0004\u0012\u0002H&0'j\b\u0012\u0004\u0012\u0002H&`(2\u0006\u0010-\u001a\u0002H&H\u0002¢\u0006\u0002\u0010.\u0082\u0002\u0012\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"group", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "name", "", "rotate", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "path", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "pathBuilder", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "path-R_LF-3I", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "peek", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "pop", "push", "", "value", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 2 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,768:1\n53#2,4:769\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n*L\n707#1:769,4\n*E\n"})
public final class ImageVectorKt {
    @NotNull
    public static final ImageVector.Builder group(@NotNull ImageVector.Builder builder, @NotNull String name, float f, float f2, float f3, float f4, float f5, float f6, float f7, @NotNull List<? extends PathNode> clipPathData, @NotNull Function1<? super ImageVector.Builder, Unit> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
        Intrinsics.checkNotNullParameter(block, "block");
        builder.addGroup(name, f, f2, f3, f4, f5, f6, f7, clipPathData);
        block.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ImageVector.Builder group$default(ImageVector.Builder builder, String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, Function1 block, int i, Object obj) {
        String name = (i & 1) != 0 ? "" : str;
        float f8 = (i & 2) != 0 ? 0.0f : f;
        float f9 = (i & 4) != 0 ? 0.0f : f2;
        float f10 = (i & 8) != 0 ? 0.0f : f3;
        float f11 = (i & 16) != 0 ? 1.0f : f4;
        float f12 = (i & 32) == 0 ? f5 : 1.0f;
        float f13 = (i & 64) != 0 ? 0.0f : f6;
        float f14 = (i & 128) != 0 ? 0.0f : f7;
        List clipPathData = (i & 256) != 0 ? VectorKt.getEmptyPath() : list;
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(clipPathData, "clipPathData");
        Intrinsics.checkNotNullParameter(block, "block");
        builder.addGroup(name, f8, f9, f10, f11, f12, f13, f14, clipPathData);
        block.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    @NotNull
    /* JADX INFO: renamed from: path-R_LF-3I, reason: not valid java name */
    public static final ImageVector.Builder m2236pathR_LF3I(@NotNull ImageVector.Builder path, @NotNull String name, @Nullable Brush brush, float f, @Nullable Brush brush2, float f2, float f3, int i, int i2, float f4, int i3, @NotNull Function1<? super PathBuilder, Unit> pathBuilder) {
        Intrinsics.checkNotNullParameter(path, "$this$path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pathBuilder, "pathBuilder");
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder.invoke(pathBuilder2);
        return ImageVector.Builder.m2234addPathoIyEayM$default(path, pathBuilder2.getNodes(), i3, name, brush, f, brush2, f2, f3, i, i2, f4, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* JADX INFO: renamed from: path-R_LF-3I$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m2237pathR_LF3I$default(ImageVector.Builder path, String str, Brush brush, float f, Brush brush2, float f2, float f3, int i, int i2, float f4, int i3, Function1 pathBuilder, int i4, Object obj) {
        String name = (i4 & 1) != 0 ? "" : str;
        Brush brush3 = (i4 & 2) != 0 ? null : brush;
        float f5 = (i4 & 4) != 0 ? 1.0f : f;
        Brush brush4 = (i4 & 8) != 0 ? null : brush2;
        float f6 = (i4 & 16) != 0 ? 1.0f : f2;
        float f7 = (i4 & 32) != 0 ? 0.0f : f3;
        int defaultStrokeLineCap = (i4 & 64) != 0 ? VectorKt.getDefaultStrokeLineCap() : i;
        int defaultStrokeLineJoin = (i4 & 128) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i2;
        float f8 = (i4 & 256) != 0 ? 4.0f : f4;
        int defaultFillType = (i4 & 512) != 0 ? VectorKt.getDefaultFillType() : i3;
        Intrinsics.checkNotNullParameter(path, "$this$path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pathBuilder, "pathBuilder");
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder.invoke(pathBuilder2);
        return ImageVector.Builder.m2234addPathoIyEayM$default(path, pathBuilder2.getNodes(), defaultFillType, name, brush3, f5, brush4, f6, f7, defaultStrokeLineCap, defaultStrokeLineJoin, f8, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T peek(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T pop(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean push(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }
}

package io.reactivex.rxkotlin;

import androidx.exifinterface.media.ExifInterface;
import com.oplus.aiunit.vision.sgm;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Triple;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.FunctionReference;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0005\"\b\b\u0002\u0010\u0004*\u00020\u00052\u0015\u0010\u0006\u001a\u0011H\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t2\u0015\u0010\n\u001a\u0011H\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b2\u0015\u0010\f\u001a\u0011H\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"<anonymous>", "Lkotlin/Triple;", ExifInterface.GPS_DIRECTION_TRUE, "R", "U", "", "p1", "Lkotlin/ParameterName;", "name", "first", "p2", "second", "p3", sgm.o, "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;"}, k = 3, mv = {1, 1, 15})
final /* synthetic */ class FlowableKt$combineLatest$3 extends FunctionReference implements Function3<Object, Object, Object, Triple<Object, Object, Object>> {
    public static final FlowableKt$combineLatest$3 INSTANCE = new FlowableKt$combineLatest$3();

    public FlowableKt$combineLatest$3() {
        super(3);
    }

    @Override // p010kotlin.jvm.internal.CallableReference, p010kotlin.reflect.KCallable
    public final String getName() {
        return "<init>";
    }

    @Override // p010kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(Triple.class);
    }

    @Override // p010kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V";
    }

    @Override // p010kotlin.jvm.functions.Function3
    @NotNull
    public final Triple<Object, Object, Object> invoke(@NotNull Object p1, @NotNull Object p2, @NotNull Object p3) {
        Intrinsics.checkParameterIsNotNull(p1, "p1");
        Intrinsics.checkParameterIsNotNull(p2, "p2");
        Intrinsics.checkParameterIsNotNull(p3, "p3");
        return new Triple<>(p1, p2, p3);
    }
}

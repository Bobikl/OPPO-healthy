package io.reactivex.rxkotlin;

import androidx.exifinterface.media.ExifInterface;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.FunctionReference;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0015\u0010\u0005\u001a\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b2\u0015\u0010\t\u001a\u0011H\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"<anonymous>", "Lkotlin/Pair;", ExifInterface.GPS_DIRECTION_TRUE, "R", "", "p1", "Lkotlin/ParameterName;", "name", "first", "p2", "second", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, k = 3, mv = {1, 1, 15})
final /* synthetic */ class FlowableKt$combineLatest$2 extends FunctionReference implements Function2<Object, Object, Pair<Object, Object>> {
    public static final FlowableKt$combineLatest$2 INSTANCE = new FlowableKt$combineLatest$2();

    public FlowableKt$combineLatest$2() {
        super(2);
    }

    @Override // p010kotlin.jvm.internal.CallableReference, p010kotlin.reflect.KCallable
    public final String getName() {
        return "<init>";
    }

    @Override // p010kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinClass(Pair.class);
    }

    @Override // p010kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "<init>(Ljava/lang/Object;Ljava/lang/Object;)V";
    }

    @Override // p010kotlin.jvm.functions.Function2
    @NotNull
    public final Pair<Object, Object> invoke(@NotNull Object p1, @NotNull Object p2) {
        Intrinsics.checkParameterIsNotNull(p1, "p1");
        Intrinsics.checkParameterIsNotNull(p2, "p2");
        return new Pair<>(p1, p2);
    }
}

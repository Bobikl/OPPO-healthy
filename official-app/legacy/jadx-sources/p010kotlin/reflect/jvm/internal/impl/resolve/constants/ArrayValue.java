package p010kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes11.dex */
public class ArrayValue extends ConstantValue<List<? extends ConstantValue<?>>> {

    @NotNull
    private final Function1<ModuleDescriptor, KotlinType> computeType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ArrayValue(@NotNull List<? extends ConstantValue<?>> value, @NotNull Function1<? super ModuleDescriptor, ? extends KotlinType> computeType) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(computeType, "computeType");
        this.computeType = computeType;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public KotlinType getType(@NotNull ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        KotlinType kotlinTypeInvoke = this.computeType.invoke(module);
        if (!KotlinBuiltIns.isArray(kotlinTypeInvoke) && !KotlinBuiltIns.isPrimitiveArray(kotlinTypeInvoke)) {
            KotlinBuiltIns.isUnsignedArrayType(kotlinTypeInvoke);
        }
        return kotlinTypeInvoke;
    }
}

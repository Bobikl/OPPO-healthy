package p010kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Pair;
import p010kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes11.dex */
public interface JavaCallableMemberDescriptor extends CallableMemberDescriptor {
    @NotNull
    JavaCallableMemberDescriptor enhance(@Nullable KotlinType kotlinType, @NotNull List<KotlinType> list, @NotNull KotlinType kotlinType2, @Nullable Pair<CallableDescriptor.UserDataKey<?>, ?> pair);
}

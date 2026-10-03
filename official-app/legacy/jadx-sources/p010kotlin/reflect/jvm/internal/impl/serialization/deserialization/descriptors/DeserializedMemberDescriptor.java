package p010kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import p010kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p010kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import p010kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: loaded from: classes11.dex */
public interface DeserializedMemberDescriptor extends DeserializedDescriptor, MemberDescriptor, DescriptorWithContainerSource {
    @Nullable
    DeserializedContainerSource getContainerSource();

    @NotNull
    NameResolver getNameResolver();

    @NotNull
    MessageLite getProto();

    @NotNull
    TypeTable getTypeTable();
}

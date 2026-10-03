package p010kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.reflect.jvm.internal.impl.util.ArrayMap;
import p010kotlin.reflect.jvm.internal.impl.util.AttributeArrayOwner;
import p010kotlin.reflect.jvm.internal.impl.util.TypeRegistry;
import p010kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n105#1,9:134\n105#1,9:143\n105#1,9:152\n766#2:161\n857#2,2:162\n*S KotlinDebug\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes\n*L\n74#1:134,9\n78#1:143,9\n82#1:152,9\n99#1:161\n99#1:162,2\n*E\n"})
public final class TypeAttributes extends AttributeArrayOwner<TypeAttribute<?>, TypeAttribute<?>> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final TypeAttributes Empty = new TypeAttributes((List<? extends TypeAttribute<?>>) CollectionsKt__CollectionsKt.emptyList());

    @SourceDebugExtension({"SMAP\nTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    public static final class Companion extends TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TypeAttributes create(@NotNull List<? extends TypeAttribute<?>> attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            return attributes.isEmpty() ? getEmpty() : new TypeAttributes(attributes, null);
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.util.TypeRegistry
        public int customComputeIfAbsent(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap, @NotNull String key, @NotNull Function1<? super String, Integer> compute) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(concurrentHashMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(compute, "compute");
            Integer num = concurrentHashMap.get(key);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                Integer num2 = concurrentHashMap.get(key);
                if (num2 == null) {
                    Integer numInvoke = compute.invoke(key);
                    concurrentHashMap.putIfAbsent(key, Integer.valueOf(numInvoke.intValue()));
                    num2 = numInvoke;
                }
                Intrinsics.checkNotNullExpressionValue(num2, "this[key] ?: compute(key…is.putIfAbsent(key, it) }");
                iIntValue = num2.intValue();
            }
            return iIntValue;
        }

        @NotNull
        public final TypeAttributes getEmpty() {
            return TypeAttributes.Empty;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TypeAttributes(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this((List<? extends TypeAttribute<?>>) list);
    }

    @NotNull
    public final TypeAttributes add(@NotNull TypeAttributes other) {
        TypeAttribute typeAttributeAdd;
        Intrinsics.checkNotNullParameter(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.getIndices().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TypeAttribute<?> typeAttribute = getArrayMap().get(iIntValue);
            TypeAttribute<?> typeAttribute2 = other.getArrayMap().get(iIntValue);
            if (typeAttribute == null) {
                typeAttributeAdd = typeAttribute2 != null ? typeAttribute2.add(typeAttribute) : null;
            } else {
                typeAttributeAdd = typeAttribute.add(typeAttribute2);
            }
            CollectionsKt.addIfNotNull(arrayList, typeAttributeAdd);
        }
        return Companion.create(arrayList);
    }

    public final boolean contains(@NotNull TypeAttribute<?> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        return getArrayMap().get(Companion.getId(attribute.getKey())) != null;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    @NotNull
    public TypeRegistry<TypeAttribute<?>, TypeAttribute<?>> getTypeRegistry() {
        return Companion;
    }

    @NotNull
    public final TypeAttributes intersect(@NotNull TypeAttributes other) {
        TypeAttribute typeAttributeIntersect;
        Intrinsics.checkNotNullParameter(other, "other");
        if (isEmpty() && other.isEmpty()) {
            return this;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = Companion.getIndices().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            TypeAttribute<?> typeAttribute = getArrayMap().get(iIntValue);
            TypeAttribute<?> typeAttribute2 = other.getArrayMap().get(iIntValue);
            if (typeAttribute == null) {
                typeAttributeIntersect = typeAttribute2 != null ? typeAttribute2.intersect(typeAttribute) : null;
            } else {
                typeAttributeIntersect = typeAttribute.intersect(typeAttribute2);
            }
            CollectionsKt.addIfNotNull(arrayList, typeAttributeIntersect);
        }
        return Companion.create(arrayList);
    }

    @NotNull
    public final TypeAttributes plus(@NotNull TypeAttribute<?> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (contains(attribute)) {
            return this;
        }
        if (isEmpty()) {
            return new TypeAttributes(attribute);
        }
        return Companion.create(CollectionsKt___CollectionsKt.plus((Collection<? extends TypeAttribute<?>>) CollectionsKt___CollectionsKt.toList(this), attribute));
    }

    @NotNull
    public final TypeAttributes remove(@NotNull TypeAttribute<?> attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        if (isEmpty()) {
            return this;
        }
        ArrayMap<TypeAttribute<?>> arrayMap = getArrayMap();
        ArrayList arrayList = new ArrayList();
        for (TypeAttribute<?> typeAttribute : arrayMap) {
            if (!Intrinsics.areEqual(typeAttribute, attribute)) {
                arrayList.add(typeAttribute);
            }
        }
        return arrayList.size() == getArrayMap().getSize() ? this : Companion.create(arrayList);
    }

    private TypeAttributes(List<? extends TypeAttribute<?>> list) {
        for (TypeAttribute<?> typeAttribute : list) {
            registerComponent(typeAttribute.getKey(), typeAttribute);
        }
    }

    private TypeAttributes(TypeAttribute<?> typeAttribute) {
        this((List<? extends TypeAttribute<?>>) CollectionsKt__CollectionsJVMKt.listOf(typeAttribute));
    }
}

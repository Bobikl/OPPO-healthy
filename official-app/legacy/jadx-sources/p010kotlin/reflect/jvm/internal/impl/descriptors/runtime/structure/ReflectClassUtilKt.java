package p010kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.databaseengine.model.UserInfo;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.mla;
import com.oplus.aiunit.vision.rnb;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Function;
import p010kotlin.TuplesKt;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.JvmClassMappingKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function10;
import p010kotlin.jvm.functions.Function11;
import p010kotlin.jvm.functions.Function12;
import p010kotlin.jvm.functions.Function13;
import p010kotlin.jvm.functions.Function14;
import p010kotlin.jvm.functions.Function15;
import p010kotlin.jvm.functions.Function16;
import p010kotlin.jvm.functions.Function17;
import p010kotlin.jvm.functions.Function18;
import p010kotlin.jvm.functions.Function19;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function20;
import p010kotlin.jvm.functions.Function21;
import p010kotlin.jvm.functions.Function22;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.functions.Function4;
import p010kotlin.jvm.functions.Function5;
import p010kotlin.jvm.functions.Function6;
import p010kotlin.jvm.functions.Function7;
import p010kotlin.jvm.functions.Function8;
import p010kotlin.jvm.functions.Function9;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.reflect.KClass;
import p010kotlin.reflect.jvm.internal.impl.name.ClassId;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;
import p010kotlin.reflect.jvm.internal.impl.name.Name;
import p010kotlin.sequences.Sequence;
import p010kotlin.sequences.SequencesKt__SequencesKt;
import p010kotlin.sequences.SequencesKt___SequencesKt;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nreflectClassUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 reflectClassUtil.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectClassUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n1549#2:100\n1620#2,3:101\n1549#2:104\n1620#2,3:105\n1559#2:108\n1590#2,4:109\n*S KotlinDebug\n*F\n+ 1 reflectClassUtil.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectClassUtilKt\n*L\n34#1:100\n34#1:101,3\n35#1:104\n35#1:105,3\n50#1:108\n50#1:109,4\n*E\n"})
public final class ReflectClassUtilKt {

    @NotNull
    private static final Map<Class<? extends Function<?>>, Integer> FUNCTION_CLASSES;

    @NotNull
    private static final List<KClass<? extends Object>> PRIMITIVE_CLASSES;

    @NotNull
    private static final Map<Class<? extends Object>, Class<? extends Object>> PRIMITIVE_TO_WRAPPER;

    @NotNull
    private static final Map<Class<? extends Object>, Class<? extends Object>> WRAPPER_TO_PRIMITIVE;

    static {
        int i = 0;
        List<KClass<? extends Object>> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new KClass[]{Reflection.getOrCreateKotlinClass(Boolean.TYPE), Reflection.getOrCreateKotlinClass(Byte.TYPE), Reflection.getOrCreateKotlinClass(Character.TYPE), Reflection.getOrCreateKotlinClass(Double.TYPE), Reflection.getOrCreateKotlinClass(Float.TYPE), Reflection.getOrCreateKotlinClass(Integer.TYPE), Reflection.getOrCreateKotlinClass(Long.TYPE), Reflection.getOrCreateKotlinClass(Short.TYPE)});
        PRIMITIVE_CLASSES = listListOf;
        List<KClass<? extends Object>> list = listListOf;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KClass kClass = (KClass) it.next();
            arrayList.add(TuplesKt.to(JvmClassMappingKt.getJavaObjectType(kClass), JvmClassMappingKt.getJavaPrimitiveType(kClass)));
        }
        WRAPPER_TO_PRIMITIVE = MapsKt__MapsKt.toMap(arrayList);
        List<KClass<? extends Object>> list2 = PRIMITIVE_CLASSES;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            KClass kClass2 = (KClass) it2.next();
            arrayList2.add(TuplesKt.to(JvmClassMappingKt.getJavaPrimitiveType(kClass2), JvmClassMappingKt.getJavaObjectType(kClass2)));
        }
        PRIMITIVE_TO_WRAPPER = MapsKt__MapsKt.toMap(arrayList2);
        List listListOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Class[]{Function0.class, Function1.class, Function2.class, Function3.class, Function4.class, Function5.class, Function6.class, Function7.class, Function8.class, Function9.class, Function10.class, Function11.class, Function12.class, Function13.class, Function14.class, Function15.class, Function16.class, Function17.class, Function18.class, Function19.class, Function20.class, Function21.class, Function22.class});
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf2, 10));
        for (Object obj : listListOf2) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList3.add(TuplesKt.to((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        FUNCTION_CLASSES = MapsKt__MapsKt.toMap(arrayList3);
    }

    @NotNull
    public static final ClassId getClassId(@NotNull Class<?> cls) {
        ClassId classIdCreateNestedClassId;
        ClassId classId;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "simpleName");
            if (!(simpleName.length() == 0)) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass == null || (classId = getClassId(declaringClass)) == null || (classIdCreateNestedClassId = classId.createNestedClassId(Name.identifier(cls.getSimpleName()))) == null) {
                    classIdCreateNestedClassId = ClassId.topLevel(new FqName(cls.getName()));
                }
                Intrinsics.checkNotNullExpressionValue(classIdCreateNestedClassId, "declaringClass?.classId?…Id.topLevel(FqName(name))");
                return classIdCreateNestedClassId;
            }
        }
        FqName fqName = new FqName(cls.getName());
        return new ClassId(fqName.parent(), FqName.topLevel(fqName.shortName()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final String getDesc(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                Intrinsics.checkNotNullExpressionValue(name, "name");
                return StringsKt__StringsJVMKt.replace$default(name, '.', mla.SEPARATOR, false, 4, (Object) null);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(rnb.MATRIX_TYPE_RANDOM_LT);
            String name2 = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "name");
            sb.append(StringsKt__StringsJVMKt.replace$default(name2, '.', mla.SEPARATOR, false, 4, (Object) null));
            sb.append(';');
            return sb.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return c8l.KEY_B;
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return ExifInterface.GPS_MEASUREMENT_INTERRUPTED;
                }
                break;
            case 64711720:
                if (name3.equals(TypedValues.Custom.S_BOOLEAN)) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals(TypedValues.Custom.S_FLOAT)) {
                    return UserInfo.SEX_FEMALE;
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    @Nullable
    public static final Integer getFunctionClassArity(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return FUNCTION_CLASSES.get(cls);
    }

    @NotNull
    public static final List<Type> getParameterizedTypeArguments(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return SequencesKt___SequencesKt.toList(SequencesKt___SequencesKt.flatMap(SequencesKt__SequencesKt.generateSequence(type, (Function1<? super Type, ? extends Type>) ((Function1<? super Object, ? extends Object>) new Function1<ParameterizedType, ParameterizedType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt$parameterizedTypeArguments$1
                @Override // p010kotlin.jvm.functions.Function1
                @Nullable
                public final ParameterizedType invoke(@NotNull ParameterizedType it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Type ownerType = it.getOwnerType();
                    if (ownerType instanceof ParameterizedType) {
                        return (ParameterizedType) ownerType;
                    }
                    return null;
                }
            })), new Function1<ParameterizedType, Sequence<? extends Type>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt$parameterizedTypeArguments$2
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final Sequence<Type> invoke(@NotNull ParameterizedType it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Type[] actualTypeArguments = it.getActualTypeArguments();
                    Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "it.actualTypeArguments");
                    return ArraysKt___ArraysKt.asSequence(actualTypeArguments);
                }
            }));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "actualTypeArguments");
        return ArraysKt___ArraysKt.toList(actualTypeArguments);
    }

    @Nullable
    public static final Class<?> getPrimitiveByWrapper(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return WRAPPER_TO_PRIMITIVE.get(cls);
    }

    @NotNull
    public static final ClassLoader getSafeClassLoader(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Intrinsics.checkNotNullExpressionValue(systemClassLoader, "getSystemClassLoader()");
        return systemClassLoader;
    }

    @Nullable
    public static final Class<?> getWrapperByPrimitive(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return PRIMITIVE_TO_WRAPPER.get(cls);
    }

    public static final boolean isEnumClassOrSpecializedEnumEntryClass(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}

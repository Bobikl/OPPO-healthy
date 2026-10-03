package com.google.devtools.ksp;

import com.google.devtools.ksp.UtilsKt;
import com.google.devtools.ksp.processing.Resolver;
import com.google.devtools.ksp.symbol.ClassKind;
import com.google.devtools.ksp.symbol.KSAnnotated;
import com.google.devtools.ksp.symbol.KSAnnotation;
import com.google.devtools.ksp.symbol.KSClassDeclaration;
import com.google.devtools.ksp.symbol.KSDeclaration;
import com.google.devtools.ksp.symbol.KSFile;
import com.google.devtools.ksp.symbol.KSFunctionDeclaration;
import com.google.devtools.ksp.symbol.KSName;
import com.google.devtools.ksp.symbol.KSNode;
import com.google.devtools.ksp.symbol.KSPropertyDeclaration;
import com.google.devtools.ksp.symbol.KSPropertyGetter;
import com.google.devtools.ksp.symbol.KSPropertySetter;
import com.google.devtools.ksp.symbol.KSType;
import com.google.devtools.ksp.symbol.KSTypeAlias;
import com.google.devtools.ksp.symbol.KSTypeArgument;
import com.google.devtools.ksp.symbol.KSTypeParameter;
import com.google.devtools.ksp.symbol.KSTypeReference;
import com.google.devtools.ksp.symbol.KSValueArgument;
import com.google.devtools.ksp.symbol.Modifier;
import com.google.devtools.ksp.symbol.Origin;
import com.google.devtools.ksp.symbol.Visibility;
import com.google.devtools.ksp.visitor.KSValidateVisitor;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0003\u001a$\u0010\u0015\u001a\u00020\u0011*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0003\u001a\f\u0010\u0019\u001a\u00020\u001a*\u00020\u0011H\u0002\u001a(\u0010\u001b\u001a\u0012\u0012\u0002\b\u0003 \u001c*\b\u0012\u0002\b\u0003\u0018\u00010\u00140\u0014*\u00020\n2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0003\u001a4\u0010\u001d\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u001c*\b\u0012\u0002\b\u0003\u0018\u00010\u00140\u00140\b*\b\u0012\u0004\u0012\u00020\n0\b2\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0003\u001a\f\u0010\u001e\u001a\u00020\u001f*\u00020\u0011H\u0002\u001a%\u0010 \u001a\u0002H!\"\u0004\b\u0000\u0010!*\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H!0\u0014H\u0002¢\u0006\u0002\u0010#\u001a\f\u0010$\u001a\u00020%*\u00020\u0011H\u0002\u001a\f\u0010&\u001a\u00020'*\u00020\u0011H\u0002\u001a\f\u0010(\u001a\u00020)*\u00020\u0011H\u0002\u001a\f\u0010*\u001a\u0004\u0018\u00010+*\u00020,\u001a\u0018\u0010-\u001a\u00020.*\u00020\u00122\n\u0010/\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0003\u001a\n\u00100\u001a\u00020+*\u000201\u001a\u0010\u00102\u001a\b\u0012\u0004\u0012\u00020\n03*\u00020+\u001a*\u00104\u001a\b\u0012\u0004\u0012\u0002H!03\"\b\b\u0000\u0010!*\u000205*\u0002062\f\u00107\u001a\b\u0012\u0004\u0012\u0002H!08H\u0007\u001a\u0017\u00109\u001a\u0004\u0018\u00010+\"\u0006\b\u0000\u0010!\u0018\u0001*\u00020:H\u0086\b\u001a\u0014\u00109\u001a\u0004\u0018\u00010+*\u00020:2\u0006\u0010;\u001a\u00020\u0001\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020=03*\u00020+\u001a\u0010\u0010>\u001a\b\u0012\u0004\u0012\u00020=03*\u00020+\u001a\u0010\u0010?\u001a\b\u0012\u0004\u0012\u00020@03*\u00020+\u001a\"\u0010A\u001a\b\u0012\u0004\u0012\u00020=03*\u00020:2\u0006\u0010;\u001a\u00020\u00012\b\b\u0002\u0010B\u001a\u00020C\u001a\u0016\u0010D\u001a\u0004\u0018\u00010+*\u00020:2\u0006\u0010;\u001a\u00020EH\u0007\u001a\u0016\u0010D\u001a\u0004\u0018\u00010+*\u00020:2\u0006\u0010;\u001a\u00020\u0001H\u0007\u001a\u0016\u0010F\u001a\u0004\u0018\u00010+*\u00020:2\u0006\u0010;\u001a\u00020EH\u0007\u001a\u0016\u0010F\u001a\u0004\u0018\u00010+*\u00020:2\u0006\u0010;\u001a\u00020\u0001H\u0007\u001a\u001e\u0010G\u001a\u0004\u0018\u00010@*\u00020:2\u0006\u0010;\u001a\u00020\u00012\b\b\u0002\u0010B\u001a\u00020C\u001a\n\u0010H\u001a\u00020I*\u00020,\u001a\n\u0010J\u001a\u00020C*\u00020+\u001a\n\u0010J\u001a\u00020C*\u00020@\u001a$\u0010K\u001a\u00020C\"\b\b\u0000\u0010!*\u000205*\u0002062\f\u00107\u001a\b\u0012\u0004\u0012\u0002H!08H\u0007\u001a\n\u0010L\u001a\u00020C*\u00020=\u001a\n\u0010M\u001a\u00020C*\u00020N\u001a\n\u0010O\u001a\u00020C*\u00020,\u001a\n\u0010P\u001a\u00020C*\u00020,\u001a\n\u0010Q\u001a\u00020C*\u00020,\u001a\n\u0010R\u001a\u00020C*\u00020,\u001a\n\u0010S\u001a\u00020C*\u00020,\u001a\n\u0010T\u001a\u00020C*\u00020,\u001a\n\u0010U\u001a\u00020C*\u00020,\u001a\u0012\u0010V\u001a\u00020C*\u00020,2\u0006\u0010W\u001a\u00020,\u001a)\u0010X\u001a\u0002H!\"\b\b\u0000\u0010!*\u000205*\u00020\u00122\f\u0010Y\u001a\b\u0012\u0004\u0012\u0002H!0\u0014H\u0003¢\u0006\u0002\u0010Z\u001a9\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\\*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110^H\u0002¢\u0006\u0002\u0010_\u001a(\u0010`\u001a\u00020C*\u00020\u00042\u001c\b\u0002\u0010a\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020C0b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u0004\u0018\u00010\n*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006c"}, d2 = {"ExceptionMessage", "", "containingFile", "Lcom/google/devtools/ksp/symbol/KSFile;", "Lcom/google/devtools/ksp/symbol/KSNode;", "getContainingFile", "(Lcom/google/devtools/ksp/symbol/KSNode;)Lcom/google/devtools/ksp/symbol/KSFile;", "innerArguments", "", "Lcom/google/devtools/ksp/symbol/KSTypeArgument;", "Lcom/google/devtools/ksp/symbol/KSType;", "getInnerArguments", "(Lcom/google/devtools/ksp/symbol/KSType;)Ljava/util/List;", "outerType", "getOuterType", "(Lcom/google/devtools/ksp/symbol/KSType;)Lcom/google/devtools/ksp/symbol/KSType;", "asAnnotation", "", "Lcom/google/devtools/ksp/symbol/KSAnnotation;", "annotationInterface", "Ljava/lang/Class;", "asArray", "method", "Ljava/lang/reflect/Method;", "proxyClass", "asByte", "", "asClass", "kotlin.jvm.PlatformType", "asClasses", "asDouble", "", "asEnum", "T", "returnType", "(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;", "asFloat", "", "asLong", "", "asShort", "", "closestClassDeclaration", "Lcom/google/devtools/ksp/symbol/KSClassDeclaration;", "Lcom/google/devtools/ksp/symbol/KSDeclaration;", "createInvocationHandler", "Ljava/lang/reflect/InvocationHandler;", "clazz", "findActualType", "Lcom/google/devtools/ksp/symbol/KSTypeAlias;", "getAllSuperTypes", "Lkotlin/sequences/Sequence;", "getAnnotationsByType", "", "Lcom/google/devtools/ksp/symbol/KSAnnotated;", "annotationKClass", "Lkotlin/reflect/KClass;", "getClassDeclarationByName", "Lcom/google/devtools/ksp/processing/Resolver;", "name", "getConstructors", "Lcom/google/devtools/ksp/symbol/KSFunctionDeclaration;", "getDeclaredFunctions", "getDeclaredProperties", "Lcom/google/devtools/ksp/symbol/KSPropertyDeclaration;", "getFunctionDeclarationsByName", "includeTopLevel", "", "getJavaClassByName", "Lcom/google/devtools/ksp/symbol/KSName;", "getKotlinClassByName", "getPropertyDeclarationByName", "getVisibility", "Lcom/google/devtools/ksp/symbol/Visibility;", "isAbstract", "isAnnotationPresent", "isConstructor", "isDefault", "Lcom/google/devtools/ksp/symbol/KSValueArgument;", "isInternal", "isJavaPackagePrivate", "isLocal", "isOpen", "isPrivate", "isProtected", "isPublic", "isVisibleFrom", "other", "toAnnotation", "annotationClass", "(Lcom/google/devtools/ksp/symbol/KSAnnotation;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "toArray", "", "valueProvider", "Lkotlin/Function1;", "(Ljava/util/List;Ljava/lang/reflect/Method;Lkotlin/jvm/functions/Function1;)[Ljava/lang/Object;", "validate", "predicate", "Lkotlin/Function2;", "api"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\ncom/google/devtools/ksp/UtilsKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,520:1\n473#2:521\n473#2:522\n37#3,2:523\n37#3,2:525\n1#4:527\n1#4:543\n1#4:546\n1#4:549\n1#4:554\n1#4:557\n1#4:560\n1#4:563\n1#4:566\n1#4:569\n1549#5:528\n1620#5,3:529\n2624#5,3:532\n1549#5:535\n1620#5,3:536\n223#5,2:539\n73#6,2:541\n73#6,2:544\n73#6,2:547\n73#6,2:550\n73#6,2:555\n73#6,2:558\n73#6,2:561\n73#6,2:564\n73#6,2:567\n1109#7,2:552\n*S KotlinDebug\n*F\n+ 1 utils.kt\ncom/google/devtools/ksp/UtilsKt\n*L\n94#1:521\n104#1:522\n447#1:523,2\n448#1:525,2\n370#1:543\n376#1:546\n380#1:549\n383#1:554\n398#1:557\n402#1:560\n406#1:563\n410#1:566\n414#1:569\n514#1:528\n514#1:529,3\n356#1:532,3\n358#1:535\n358#1:536,3\n365#1:539,2\n370#1:541,2\n376#1:544,2\n380#1:547,2\n383#1:550,2\n398#1:555,2\n402#1:558,2\n406#1:561,2\n410#1:564,2\n414#1:567,2\n390#1:552,2\n*E\n"})
public final class UtilsKt {

    @NotNull
    public static final String ExceptionMessage = "please file a bug at https://github.com/google/ksp/issues/new";

    /* JADX INFO: Access modifiers changed from: private */
    @KspExperimental
    public static final Object asAnnotation(KSAnnotation kSAnnotation, Class<?> cls) {
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, createInvocationHandler(kSAnnotation, cls));
        Intrinsics.checkNotNull(objNewProxyInstance, "null cannot be cast to non-null type java.lang.reflect.Proxy");
        return (Proxy) objNewProxyInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @KspExperimental
    public static final Object asArray(List<?> list, final Method method, Class<?> cls) {
        String name = method.getReturnType().getComponentType().getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Double>");
                    return CollectionsKt.toDoubleArray(list);
                }
                break;
            case -530663260:
                if (name.equals("java.lang.Class")) {
                    Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.google.devtools.ksp.symbol.KSType>");
                    return asClasses(list, cls).toArray(new Class[0]);
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
                    return CollectionsKt.toIntArray(list);
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Byte>");
                    return CollectionsKt.toByteArray(list);
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Char>");
                    return CollectionsKt.toCharArray(list);
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Long>");
                    return CollectionsKt.toLongArray(list);
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Boolean>");
                    return CollectionsKt.toBooleanArray(list);
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                    return CollectionsKt.toFloatArray(list);
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Short>");
                    return CollectionsKt.toShortArray(list);
                }
                break;
            case 1195259493:
                if (name.equals("java.lang.String")) {
                    Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    return list.toArray(new String[0]);
                }
                break;
        }
        if (method.getReturnType().getComponentType().isEnum()) {
            return toArray(list, method, new Function1<Object, Object>() { // from class: com.google.devtools.ksp.UtilsKt.asArray.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @NotNull
                public final Object invoke(@NotNull Object obj) throws NoSuchMethodException {
                    Intrinsics.checkNotNullParameter(obj, "result");
                    Class<?> componentType = method.getReturnType().getComponentType();
                    Intrinsics.checkNotNullExpressionValue(componentType, "method.returnType.componentType");
                    Object objAsEnum = UtilsKt.asEnum(obj, componentType);
                    Intrinsics.checkNotNullExpressionValue(objAsEnum, "result.asEnum(method.returnType.componentType)");
                    return objAsEnum;
                }
            });
        }
        if (method.getReturnType().getComponentType().isAnnotation()) {
            return toArray(list, method, new Function1<Object, Object>() { // from class: com.google.devtools.ksp.UtilsKt.asArray.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @NotNull
                public final Object invoke(@NotNull Object obj) {
                    Intrinsics.checkNotNullParameter(obj, "result");
                    Class<?> componentType = method.getReturnType().getComponentType();
                    Intrinsics.checkNotNullExpressionValue(componentType, "method.returnType.componentType");
                    return UtilsKt.asAnnotation((KSAnnotation) obj, componentType);
                }
            });
        }
        throw new IllegalStateException("Unable to process type " + method.getReturnType().getComponentType().getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte asByte(Object obj) {
        if (obj instanceof Integer) {
            return (byte) ((Number) obj).intValue();
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) obj).byteValue();
    }

    @KspExperimental
    private static final Class<?> asClass(KSType kSType, Class<?> cls) {
        try {
            KSName qualifiedName = kSType.getDeclaration().getQualifiedName();
            Intrinsics.checkNotNull(qualifiedName);
            return Class.forName(qualifiedName.asString(), true, cls.getClassLoader());
        } catch (Exception e) {
            throw new KSTypeNotPresentException(kSType, e);
        }
    }

    @KspExperimental
    private static final List<Class<?>> asClasses(List<? extends KSType> list, Class<?> cls) {
        try {
            List<? extends KSType> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(asClass((KSType) it.next(), cls));
            }
            return arrayList;
        } catch (Exception e) {
            throw new KSTypesNotPresentException(list, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double asDouble(Object obj) {
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) obj).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T asEnum(Object obj, Class<T> cls) throws NoSuchMethodException {
        Method declaredMethod = cls.getDeclaredMethod("valueOf", String.class);
        Object[] objArr = new Object[1];
        objArr[0] = obj instanceof KSType ? ((KSType) obj).getDeclaration().getSimpleName().getShortName() : obj.toString();
        return (T) declaredMethod.invoke(null, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float asFloat(Object obj) {
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) obj).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long asLong(Object obj) {
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) obj).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final short asShort(Object obj) {
        if (obj instanceof Integer) {
            return (short) ((Number) obj).intValue();
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) obj).shortValue();
    }

    @Nullable
    public static final KSClassDeclaration closestClassDeclaration(@NotNull KSDeclaration kSDeclaration) {
        Intrinsics.checkNotNullParameter(kSDeclaration, "<this>");
        if (kSDeclaration instanceof KSClassDeclaration) {
            return (KSClassDeclaration) kSDeclaration;
        }
        KSDeclaration parentDeclaration = kSDeclaration.getParentDeclaration();
        if (parentDeclaration != null) {
            return closestClassDeclaration(parentDeclaration);
        }
        return null;
    }

    @KspExperimental
    private static final InvocationHandler createInvocationHandler(final KSAnnotation kSAnnotation, final Class<?> cls) {
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(kSAnnotation.getArguments().size());
        return new InvocationHandler() { // from class: com.oplus.aiunit.vision.svk
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return UtilsKt.createInvocationHandler$lambda$8(kSAnnotation, cls, concurrentHashMap, obj, method, objArr);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object createInvocationHandler$lambda$8(KSAnnotation kSAnnotation, final Class cls, ConcurrentHashMap concurrentHashMap, Object obj, final Method method, Object[] objArr) throws IllegalAccessException, ClassNotFoundException, InvocationTargetException {
        Object objPutIfAbsent;
        Class<?> cls2;
        Method method2;
        Intrinsics.checkNotNullParameter(kSAnnotation, "$this_createInvocationHandler");
        Intrinsics.checkNotNullParameter(cls, "$clazz");
        Intrinsics.checkNotNullParameter(concurrentHashMap, "$cache");
        int i = 0;
        if (Intrinsics.areEqual(method.getName(), "toString")) {
            List<KSValueArgument> arguments = kSAnnotation.getArguments();
            boolean z = true;
            if (!(arguments instanceof Collection) || !arguments.isEmpty()) {
                Iterator<T> it = arguments.iterator();
                while (it.hasNext()) {
                    KSName name = ((KSValueArgument) it.next()).getName();
                    if (Intrinsics.areEqual(name != null ? name.asString() : null, "toString")) {
                        z = false;
                        break;
                    }
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getCanonicalName());
                List<KSValueArgument> arguments2 = kSAnnotation.getArguments();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arguments2, 10));
                Iterator<T> it2 = arguments2.iterator();
                while (it2.hasNext()) {
                    KSName name2 = ((KSValueArgument) it2.next()).getName();
                    String strAsString = name2 != null ? name2.asString() : null;
                    Method[] methods = obj.getClass().getMethods();
                    Intrinsics.checkNotNullExpressionValue(methods, "proxy.javaClass.methods");
                    int length = methods.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            method2 = null;
                            break;
                        }
                        method2 = methods[i2];
                        if (Intrinsics.areEqual(method2.getName(), strAsString)) {
                            break;
                        }
                        i2++;
                    }
                    arrayList.add(strAsString + '=' + (method2 != null ? method2.invoke(obj, new Object[0]) : null));
                }
                sb.append(CollectionsKt.toList(arrayList));
                return sb.toString();
            }
        }
        for (KSValueArgument kSValueArgument : kSAnnotation.getArguments()) {
            KSName name3 = kSValueArgument.getName();
            if (Intrinsics.areEqual(name3 != null ? name3.asString() : null, method.getName())) {
                final Object value = kSValueArgument.getValue();
                if (value == null) {
                    value = method.getDefaultValue();
                }
                if (value instanceof Proxy) {
                    return value;
                }
                if (value instanceof List) {
                    Function0<Object> function0 = new Function0<Object>() { // from class: com.google.devtools.ksp.UtilsKt$createInvocationHandler$1$value$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @NotNull
                        public final Object invoke() {
                            Object obj2 = value;
                            Intrinsics.checkNotNullExpressionValue(obj2, "result");
                            Method method3 = method;
                            Intrinsics.checkNotNullExpressionValue(method3, "method");
                            return UtilsKt.asArray((List) obj2, method3, cls);
                        }
                    };
                    Pair pair = new Pair(method.getReturnType(), value);
                    Object obj2 = concurrentHashMap.get(pair);
                    if (obj2 != null) {
                        return obj2;
                    }
                    Object objInvoke = function0.invoke();
                    objPutIfAbsent = concurrentHashMap.putIfAbsent(pair, objInvoke);
                    if (objPutIfAbsent == null) {
                        return objInvoke;
                    }
                } else if (method.getReturnType().isEnum()) {
                    Function0<Object> function1 = new Function0<Object>() { // from class: com.google.devtools.ksp.UtilsKt$createInvocationHandler$1$value$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        public final Object invoke() {
                            Object obj3 = value;
                            Intrinsics.checkNotNullExpressionValue(obj3, "result");
                            Class<?> returnType = method.getReturnType();
                            Intrinsics.checkNotNullExpressionValue(returnType, "method.returnType");
                            return UtilsKt.asEnum(obj3, returnType);
                        }
                    };
                    Pair pair2 = new Pair(method.getReturnType(), value);
                    Object obj3 = concurrentHashMap.get(pair2);
                    if (obj3 != null) {
                        return obj3;
                    }
                    Object objInvoke2 = function1.invoke();
                    objPutIfAbsent = concurrentHashMap.putIfAbsent(pair2, objInvoke2);
                    if (objPutIfAbsent == null) {
                        return objInvoke2;
                    }
                } else if (method.getReturnType().isAnnotation()) {
                    Function0<Object> function2 = new Function0<Object>() { // from class: com.google.devtools.ksp.UtilsKt$createInvocationHandler$1$value$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @NotNull
                        public final Object invoke() {
                            Object obj4 = value;
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type com.google.devtools.ksp.symbol.KSAnnotation");
                            Class<?> returnType = method.getReturnType();
                            Intrinsics.checkNotNullExpressionValue(returnType, "method.returnType");
                            return UtilsKt.asAnnotation((KSAnnotation) obj4, returnType);
                        }
                    };
                    Pair pair3 = new Pair(method.getReturnType(), value);
                    Object obj4 = concurrentHashMap.get(pair3);
                    if (obj4 != null) {
                        return obj4;
                    }
                    Object objInvoke3 = function2.invoke();
                    objPutIfAbsent = concurrentHashMap.putIfAbsent(pair3, objInvoke3);
                    if (objPutIfAbsent == null) {
                        return objInvoke3;
                    }
                } else if (Intrinsics.areEqual(method.getReturnType().getName(), "java.lang.Class")) {
                    Pair pair4 = new Pair(method.getReturnType(), value);
                    Object obj5 = concurrentHashMap.get(pair4);
                    if (obj5 != null) {
                        return obj5;
                    }
                    if (value instanceof KSType) {
                        Intrinsics.checkNotNullExpressionValue(value, "result");
                        cls2 = asClass((KSType) value, cls);
                    } else {
                        Method[] methods2 = value.getClass().getMethods();
                        Intrinsics.checkNotNullExpressionValue(methods2, "result.javaClass.methods");
                        int length2 = methods2.length;
                        while (true) {
                            if (i >= length2) {
                                throw new NoSuchElementException("Array contains no element matching the predicate.");
                            }
                            Method method3 = methods2[i];
                            if (Intrinsics.areEqual(method3.getName(), "getCanonicalText")) {
                                Object objInvoke4 = method3.invoke(value, Boolean.FALSE);
                                Intrinsics.checkNotNull(objInvoke4, "null cannot be cast to non-null type kotlin.String");
                                cls2 = Class.forName((String) objInvoke4);
                                break;
                            }
                            i++;
                        }
                    }
                    objPutIfAbsent = concurrentHashMap.putIfAbsent(pair4, cls2);
                    if (objPutIfAbsent == null) {
                        return cls2;
                    }
                } else if (Intrinsics.areEqual(method.getReturnType().getName(), "byte")) {
                    Function0<Byte> function3 = new Function0<Byte>() { // from class: com.google.devtools.ksp.UtilsKt$createInvocationHandler$1$value$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @NotNull
                        public final Byte invoke() {
                            Object obj6 = value;
                            Intrinsics.checkNotNullExpressionValue(obj6, "result");
                            return Byte.valueOf(UtilsKt.asByte(obj6));
                        }
                    };
                    Pair pair5 = new Pair(method.getReturnType(), value);
                    Object obj6 = concurrentHashMap.get(pair5);
                    if (obj6 != null) {
                        return obj6;
                    }
                    Object objInvoke5 = function3.invoke();
                    objPutIfAbsent = concurrentHashMap.putIfAbsent(pair5, objInvoke5);
                    if (objPutIfAbsent == null) {
                        return objInvoke5;
                    }
                } else if (Intrinsics.areEqual(method.getReturnType().getName(), "short")) {
                    Function0<Short> function4 = new Function0<Short>() { // from class: com.google.devtools.ksp.UtilsKt$createInvocationHandler$1$value$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @NotNull
                        public final Short invoke() {
                            Object obj7 = value;
                            Intrinsics.checkNotNullExpressionValue(obj7, "result");
                            return Short.valueOf(UtilsKt.asShort(obj7));
                        }
                    };
                    Pair pair6 = new Pair(method.getReturnType(), value);
                    Object obj7 = concurrentHashMap.get(pair6);
                    if (obj7 != null) {
                        return obj7;
                    }
                    Object objInvoke6 = function4.invoke();
                    objPutIfAbsent = concurrentHashMap.putIfAbsent(pair6, objInvoke6);
                    if (objPutIfAbsent == null) {
                        return objInvoke6;
                    }
                } else if (Intrinsics.areEqual(method.getReturnType().getName(), "long")) {
                    Function0<Long> function5 = new Function0<Long>() { // from class: com.google.devtools.ksp.UtilsKt$createInvocationHandler$1$value$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @NotNull
                        public final Long invoke() {
                            Object obj8 = value;
                            Intrinsics.checkNotNullExpressionValue(obj8, "result");
                            return Long.valueOf(UtilsKt.asLong(obj8));
                        }
                    };
                    Pair pair7 = new Pair(method.getReturnType(), value);
                    Object obj8 = concurrentHashMap.get(pair7);
                    if (obj8 != null) {
                        return obj8;
                    }
                    Object objInvoke7 = function5.invoke();
                    objPutIfAbsent = concurrentHashMap.putIfAbsent(pair7, objInvoke7);
                    if (objPutIfAbsent == null) {
                        return objInvoke7;
                    }
                } else if (Intrinsics.areEqual(method.getReturnType().getName(), "float")) {
                    Function0<Float> function6 = new Function0<Float>() { // from class: com.google.devtools.ksp.UtilsKt$createInvocationHandler$1$value$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @NotNull
                        public final Float invoke() {
                            Object obj9 = value;
                            Intrinsics.checkNotNullExpressionValue(obj9, "result");
                            return Float.valueOf(UtilsKt.asFloat(obj9));
                        }
                    };
                    Pair pair8 = new Pair(method.getReturnType(), value);
                    Object obj9 = concurrentHashMap.get(pair8);
                    if (obj9 != null) {
                        return obj9;
                    }
                    Object objInvoke8 = function6.invoke();
                    objPutIfAbsent = concurrentHashMap.putIfAbsent(pair8, objInvoke8);
                    if (objPutIfAbsent == null) {
                        return objInvoke8;
                    }
                } else {
                    if (!Intrinsics.areEqual(method.getReturnType().getName(), "double")) {
                        return value;
                    }
                    Function0<Double> function7 = new Function0<Double>() { // from class: com.google.devtools.ksp.UtilsKt$createInvocationHandler$1$value$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @NotNull
                        public final Double invoke() {
                            Object obj10 = value;
                            Intrinsics.checkNotNullExpressionValue(obj10, "result");
                            return Double.valueOf(UtilsKt.asDouble(obj10));
                        }
                    };
                    Pair pair9 = new Pair(method.getReturnType(), value);
                    Object obj10 = concurrentHashMap.get(pair9);
                    if (obj10 != null) {
                        return obj10;
                    }
                    Object objInvoke9 = function7.invoke();
                    objPutIfAbsent = concurrentHashMap.putIfAbsent(pair9, objInvoke9);
                    if (objPutIfAbsent == null) {
                        return objInvoke9;
                    }
                }
                return objPutIfAbsent;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @NotNull
    public static final KSClassDeclaration findActualType(@NotNull KSTypeAlias kSTypeAlias) {
        Intrinsics.checkNotNullParameter(kSTypeAlias, "<this>");
        KSDeclaration declaration = kSTypeAlias.getType().resolve().getDeclaration();
        if (declaration instanceof KSTypeAlias) {
            return findActualType((KSTypeAlias) declaration);
        }
        Intrinsics.checkNotNull(declaration, "null cannot be cast to non-null type com.google.devtools.ksp.symbol.KSClassDeclaration");
        return (KSClassDeclaration) declaration;
    }

    @NotNull
    public static final Sequence<KSType> getAllSuperTypes(@NotNull KSClassDeclaration kSClassDeclaration) {
        Intrinsics.checkNotNullParameter(kSClassDeclaration, "<this>");
        return SequencesKt.distinct(SequencesKt.plus(SequencesKt.map(kSClassDeclaration.getSuperTypes(), new Function1<KSTypeReference, KSType>() { // from class: com.google.devtools.ksp.UtilsKt.getAllSuperTypes.1
            @NotNull
            public final KSType invoke(@NotNull KSTypeReference kSTypeReference) {
                Intrinsics.checkNotNullParameter(kSTypeReference, "it");
                return kSTypeReference.resolve();
            }
        }), SequencesKt.flatMap(SequencesKt.mapNotNull(kSClassDeclaration.getSuperTypes(), new Function1<KSTypeReference, KSDeclaration>() { // from class: com.google.devtools.ksp.UtilsKt.getAllSuperTypes.2
            @Nullable
            public final KSDeclaration invoke(@NotNull KSTypeReference kSTypeReference) {
                Intrinsics.checkNotNullParameter(kSTypeReference, "it");
                return kSTypeReference.resolve().getDeclaration();
            }
        }), new Function1<KSDeclaration, Sequence<? extends KSType>>() { // from class: com.google.devtools.ksp.UtilsKt.getAllSuperTypes.3
            @NotNull
            public final Sequence<KSType> invoke(@NotNull KSDeclaration kSDeclaration) {
                Intrinsics.checkNotNullParameter(kSDeclaration, "it");
                if (kSDeclaration instanceof KSClassDeclaration) {
                    return UtilsKt.getAllSuperTypes((KSClassDeclaration) kSDeclaration);
                }
                if (kSDeclaration instanceof KSTypeAlias) {
                    return UtilsKt.getAllSuperTypes(UtilsKt.findActualType((KSTypeAlias) kSDeclaration));
                }
                if (kSDeclaration instanceof KSTypeParameter) {
                    return SequencesKt.flatMap(UtilsKt.getAllSuperTypes$getTypesUpperBound((KSTypeParameter) kSDeclaration), new Function1<KSClassDeclaration, Sequence<? extends KSType>>() { // from class: com.google.devtools.ksp.UtilsKt.getAllSuperTypes.3.1
                        @NotNull
                        public final Sequence<KSType> invoke(@NotNull KSClassDeclaration kSClassDeclaration2) {
                            Intrinsics.checkNotNullParameter(kSClassDeclaration2, "it");
                            return UtilsKt.getAllSuperTypes(kSClassDeclaration2);
                        }
                    });
                }
                throw new IllegalStateException("unhandled super type kind, please file a bug at https://github.com/google/ksp/issues/new");
            }
        })));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence<KSClassDeclaration> getAllSuperTypes$getTypesUpperBound(KSTypeParameter kSTypeParameter) {
        return SequencesKt.flatMap(kSTypeParameter.getBounds(), new Function1<KSTypeReference, Sequence<? extends KSClassDeclaration>>() { // from class: com.google.devtools.ksp.UtilsKt$getAllSuperTypes$getTypesUpperBound$1
            @NotNull
            public final Sequence<KSClassDeclaration> invoke(@NotNull KSTypeReference kSTypeReference) {
                Intrinsics.checkNotNullParameter(kSTypeReference, "it");
                KSDeclaration declaration = kSTypeReference.resolve().getDeclaration();
                if (declaration instanceof KSClassDeclaration) {
                    return SequencesKt.sequenceOf(new KSClassDeclaration[]{(KSClassDeclaration) declaration});
                }
                if (declaration instanceof KSTypeAlias) {
                    return SequencesKt.sequenceOf(new KSClassDeclaration[]{UtilsKt.findActualType((KSTypeAlias) declaration)});
                }
                if (declaration instanceof KSTypeParameter) {
                    return UtilsKt.getAllSuperTypes$getTypesUpperBound((KSTypeParameter) declaration);
                }
                throw new IllegalStateException("unhandled type parameter bound, please file a bug at https://github.com/google/ksp/issues/new");
            }
        });
    }

    @KspExperimental
    @NotNull
    public static final <T extends Annotation> Sequence<T> getAnnotationsByType(@NotNull KSAnnotated kSAnnotated, @NotNull final KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kSAnnotated, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "annotationKClass");
        return SequencesKt.map(SequencesKt.filter(kSAnnotated.getAnnotations(), new Function1<KSAnnotation, Boolean>() { // from class: com.google.devtools.ksp.UtilsKt.getAnnotationsByType.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x003f  */
            @NotNull
            public final Boolean invoke(@NotNull KSAnnotation kSAnnotation) {
                boolean z;
                Intrinsics.checkNotNullParameter(kSAnnotation, "it");
                if (Intrinsics.areEqual(kSAnnotation.getShortName().getShortName(), kClass.getSimpleName())) {
                    KSName qualifiedName = kSAnnotation.getAnnotationType().resolve().getDeclaration().getQualifiedName();
                    if (Intrinsics.areEqual(qualifiedName != null ? qualifiedName.asString() : null, kClass.getQualifiedName())) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }), new Function1<KSAnnotation, T>() { // from class: com.google.devtools.ksp.UtilsKt.getAnnotationsByType.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect return type in method signature: (Lcom/google/devtools/ksp/symbol/KSAnnotation;)TT; */
            @NotNull
            public final Annotation invoke(@NotNull KSAnnotation kSAnnotation) {
                Intrinsics.checkNotNullParameter(kSAnnotation, "it");
                return UtilsKt.toAnnotation(kSAnnotation, JvmClassMappingKt.getJavaClass(kClass));
            }
        });
    }

    public static final /* synthetic */ <T> KSClassDeclaration getClassDeclarationByName(Resolver resolver) {
        Intrinsics.checkNotNullParameter(resolver, "<this>");
        Intrinsics.reifiedOperationMarker(4, "T");
        String qualifiedName = Reflection.getOrCreateKotlinClass(Object.class).getQualifiedName();
        if (qualifiedName != null) {
            return resolver.getClassDeclarationByName(resolver.getKSNameFromString(qualifiedName));
        }
        return null;
    }

    @NotNull
    public static final Sequence<KSFunctionDeclaration> getConstructors(@NotNull KSClassDeclaration kSClassDeclaration) {
        Intrinsics.checkNotNullParameter(kSClassDeclaration, "<this>");
        return SequencesKt.filter(getDeclaredFunctions(kSClassDeclaration), new Function1<KSFunctionDeclaration, Boolean>() { // from class: com.google.devtools.ksp.UtilsKt.getConstructors.1
            @NotNull
            public final Boolean invoke(@NotNull KSFunctionDeclaration kSFunctionDeclaration) {
                Intrinsics.checkNotNullParameter(kSFunctionDeclaration, "it");
                return Boolean.valueOf(UtilsKt.isConstructor(kSFunctionDeclaration));
            }
        });
    }

    @Nullable
    public static final KSFile getContainingFile(@NotNull KSNode kSNode) {
        Intrinsics.checkNotNullParameter(kSNode, "<this>");
        KSNode parent = kSNode.getParent();
        while (parent != null && !(parent instanceof KSFile)) {
            parent = parent.getParent();
        }
        if (parent instanceof KSFile) {
            return (KSFile) parent;
        }
        return null;
    }

    @NotNull
    public static final Sequence<KSFunctionDeclaration> getDeclaredFunctions(@NotNull KSClassDeclaration kSClassDeclaration) {
        Intrinsics.checkNotNullParameter(kSClassDeclaration, "<this>");
        Sequence<KSFunctionDeclaration> sequenceFilter = SequencesKt.filter(kSClassDeclaration.getDeclarations(), new Function1<Object, Boolean>() { // from class: com.google.devtools.ksp.UtilsKt$getDeclaredFunctions$$inlined$filterIsInstance$1
            @NotNull
            public final Boolean invoke(@Nullable Object obj) {
                return Boolean.valueOf(obj instanceof KSFunctionDeclaration);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return sequenceFilter;
    }

    @NotNull
    public static final Sequence<KSPropertyDeclaration> getDeclaredProperties(@NotNull KSClassDeclaration kSClassDeclaration) {
        Intrinsics.checkNotNullParameter(kSClassDeclaration, "<this>");
        Sequence<KSPropertyDeclaration> sequenceFilter = SequencesKt.filter(kSClassDeclaration.getDeclarations(), new Function1<Object, Boolean>() { // from class: com.google.devtools.ksp.UtilsKt$getDeclaredProperties$$inlined$filterIsInstance$1
            @NotNull
            public final Boolean invoke(@Nullable Object obj) {
                return Boolean.valueOf(obj instanceof KSPropertyDeclaration);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return sequenceFilter;
    }

    @NotNull
    public static final Sequence<KSFunctionDeclaration> getFunctionDeclarationsByName(@NotNull Resolver resolver, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(resolver, "<this>");
        Intrinsics.checkNotNullParameter(str, "name");
        return resolver.getFunctionDeclarationsByName(resolver.getKSNameFromString(str), z);
    }

    public static /* synthetic */ Sequence getFunctionDeclarationsByName$default(Resolver resolver, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getFunctionDeclarationsByName(resolver, str, z);
    }

    @NotNull
    public static final List<KSTypeArgument> getInnerArguments(@NotNull KSType kSType) {
        Intrinsics.checkNotNullParameter(kSType, "<this>");
        return kSType.getArguments().subList(0, kSType.getDeclaration().getTypeParameters().size());
    }

    @KspExperimental
    @Nullable
    public static final KSClassDeclaration getJavaClassByName(@NotNull Resolver resolver, @NotNull KSName kSName) {
        Intrinsics.checkNotNullParameter(resolver, "<this>");
        Intrinsics.checkNotNullParameter(kSName, "name");
        KSName kSNameMapKotlinNameToJava = resolver.mapKotlinNameToJava(kSName);
        if (kSNameMapKotlinNameToJava != null) {
            kSName = kSNameMapKotlinNameToJava;
        }
        return resolver.getClassDeclarationByName(kSName);
    }

    @KspExperimental
    @Nullable
    public static final KSClassDeclaration getKotlinClassByName(@NotNull Resolver resolver, @NotNull KSName kSName) {
        Intrinsics.checkNotNullParameter(resolver, "<this>");
        Intrinsics.checkNotNullParameter(kSName, "name");
        KSName kSNameMapJavaNameToKotlin = resolver.mapJavaNameToKotlin(kSName);
        if (kSNameMapJavaNameToKotlin != null) {
            kSName = kSNameMapJavaNameToKotlin;
        }
        return resolver.getClassDeclarationByName(kSName);
    }

    @Nullable
    public static final KSType getOuterType(@NotNull KSType kSType) {
        Intrinsics.checkNotNullParameter(kSType, "<this>");
        if (!kSType.getDeclaration().getModifiers().contains(Modifier.INNER)) {
            return null;
        }
        KSDeclaration parentDeclaration = kSType.getDeclaration().getParentDeclaration();
        KSClassDeclaration kSClassDeclaration = parentDeclaration instanceof KSClassDeclaration ? (KSClassDeclaration) parentDeclaration : null;
        if (kSClassDeclaration == null) {
            return null;
        }
        return kSClassDeclaration.asType(kSType.getArguments().subList(kSType.getDeclaration().getTypeParameters().size(), kSType.getArguments().size()));
    }

    @Nullable
    public static final KSPropertyDeclaration getPropertyDeclarationByName(@NotNull Resolver resolver, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(resolver, "<this>");
        Intrinsics.checkNotNullParameter(str, "name");
        return resolver.getPropertyDeclarationByName(resolver.getKSNameFromString(str), z);
    }

    public static /* synthetic */ KSPropertyDeclaration getPropertyDeclarationByName$default(Resolver resolver, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return getPropertyDeclarationByName(resolver, str, z);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    @NotNull
    public static final Visibility getVisibility(@NotNull KSDeclaration kSDeclaration) {
        KSPropertyDeclaration kSPropertyDeclarationFindOverridee;
        Visibility visibility;
        Intrinsics.checkNotNullParameter(kSDeclaration, "<this>");
        if (kSDeclaration.getModifiers().contains(Modifier.PUBLIC)) {
            return Visibility.PUBLIC;
        }
        Set<Modifier> modifiers = kSDeclaration.getModifiers();
        Modifier modifier = Modifier.OVERRIDE;
        if (modifiers.contains(modifier)) {
            if (kSDeclaration instanceof KSFunctionDeclaration) {
                KSDeclaration kSDeclarationFindOverridee = ((KSFunctionDeclaration) kSDeclaration).findOverridee();
                if (kSDeclarationFindOverridee != null) {
                    visibility = getVisibility(kSDeclarationFindOverridee);
                } else {
                    visibility = null;
                }
            } else if (!(kSDeclaration instanceof KSPropertyDeclaration) || (kSPropertyDeclarationFindOverridee = ((KSPropertyDeclaration) kSDeclaration).findOverridee()) == null) {
                visibility = null;
            } else {
                visibility = getVisibility(kSPropertyDeclarationFindOverridee);
            }
            return visibility == null ? Visibility.PUBLIC : visibility;
        }
        if (isLocal(kSDeclaration)) {
            return Visibility.LOCAL;
        }
        if (kSDeclaration.getModifiers().contains(Modifier.PRIVATE)) {
            return Visibility.PRIVATE;
        }
        if (kSDeclaration.getModifiers().contains(Modifier.PROTECTED) || kSDeclaration.getModifiers().contains(modifier)) {
            return Visibility.PROTECTED;
        }
        if (kSDeclaration.getModifiers().contains(Modifier.INTERNAL)) {
            return Visibility.INTERNAL;
        }
        return (kSDeclaration.getOrigin() == Origin.JAVA || kSDeclaration.getOrigin() == Origin.JAVA_LIB) ? Visibility.JAVA_PACKAGE : Visibility.PUBLIC;
    }

    public static final boolean isAbstract(@NotNull KSClassDeclaration kSClassDeclaration) {
        Intrinsics.checkNotNullParameter(kSClassDeclaration, "<this>");
        return kSClassDeclaration.getClassKind() == ClassKind.INTERFACE || kSClassDeclaration.getModifiers().contains(Modifier.ABSTRACT);
    }

    @KspExperimental
    public static final <T extends Annotation> boolean isAnnotationPresent(@NotNull KSAnnotated kSAnnotated, @NotNull KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kSAnnotated, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "annotationKClass");
        return SequencesKt.firstOrNull(getAnnotationsByType(kSAnnotated, kClass)) != null;
    }

    public static final boolean isConstructor(@NotNull KSFunctionDeclaration kSFunctionDeclaration) {
        Intrinsics.checkNotNullParameter(kSFunctionDeclaration, "<this>");
        return Intrinsics.areEqual(kSFunctionDeclaration.getSimpleName().asString(), "<init>");
    }

    public static final boolean isDefault(@NotNull KSValueArgument kSValueArgument) {
        Intrinsics.checkNotNullParameter(kSValueArgument, "<this>");
        return kSValueArgument.getOrigin() == Origin.SYNTHETIC;
    }

    public static final boolean isInternal(@NotNull KSDeclaration kSDeclaration) {
        Intrinsics.checkNotNullParameter(kSDeclaration, "<this>");
        return kSDeclaration.getModifiers().contains(Modifier.INTERNAL);
    }

    public static final boolean isJavaPackagePrivate(@NotNull KSDeclaration kSDeclaration) {
        Intrinsics.checkNotNullParameter(kSDeclaration, "<this>");
        return getVisibility(kSDeclaration) == Visibility.JAVA_PACKAGE;
    }

    public static final boolean isLocal(@NotNull KSDeclaration kSDeclaration) {
        Intrinsics.checkNotNullParameter(kSDeclaration, "<this>");
        return (kSDeclaration.getParentDeclaration() == null || (kSDeclaration.getParentDeclaration() instanceof KSClassDeclaration)) ? false : true;
    }

    public static final boolean isOpen(@NotNull KSDeclaration kSDeclaration) {
        Intrinsics.checkNotNullParameter(kSDeclaration, "<this>");
        if (!isLocal(kSDeclaration)) {
            KSClassDeclaration kSClassDeclaration = kSDeclaration instanceof KSClassDeclaration ? (KSClassDeclaration) kSDeclaration : null;
            ClassKind classKind = kSClassDeclaration != null ? kSClassDeclaration.getClassKind() : null;
            ClassKind classKind2 = ClassKind.INTERFACE;
            if (classKind != classKind2 && !kSDeclaration.getModifiers().contains(Modifier.OVERRIDE) && !kSDeclaration.getModifiers().contains(Modifier.ABSTRACT) && !kSDeclaration.getModifiers().contains(Modifier.OPEN) && !kSDeclaration.getModifiers().contains(Modifier.SEALED)) {
                if (!(kSDeclaration instanceof KSClassDeclaration)) {
                    KSDeclaration parentDeclaration = kSDeclaration.getParentDeclaration();
                    KSClassDeclaration kSClassDeclaration2 = parentDeclaration instanceof KSClassDeclaration ? (KSClassDeclaration) parentDeclaration : null;
                    if ((kSClassDeclaration2 != null ? kSClassDeclaration2.getClassKind() : null) != classKind2) {
                    }
                }
                if (kSDeclaration.getModifiers().contains(Modifier.FINAL) || kSDeclaration.getOrigin() != Origin.JAVA) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean isPrivate(@NotNull KSDeclaration kSDeclaration) {
        Intrinsics.checkNotNullParameter(kSDeclaration, "<this>");
        return kSDeclaration.getModifiers().contains(Modifier.PRIVATE);
    }

    public static final boolean isProtected(@NotNull KSDeclaration kSDeclaration) {
        Intrinsics.checkNotNullParameter(kSDeclaration, "<this>");
        return getVisibility(kSDeclaration) == Visibility.PROTECTED;
    }

    public static final boolean isPublic(@NotNull KSDeclaration kSDeclaration) {
        Intrinsics.checkNotNullParameter(kSDeclaration, "<this>");
        return getVisibility(kSDeclaration) == Visibility.PUBLIC;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        if (r3 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isVisibleFrom(@org.jetbrains.annotations.NotNull com.google.devtools.ksp.symbol.KSDeclaration r3, @org.jetbrains.annotations.NotNull com.google.devtools.ksp.symbol.KSDeclaration r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = isLocal(r3)
            if (r0 == 0) goto L1a
            java.util.List r3 = isVisibleFrom$parentDeclarationsForLocal(r3)
            boolean r3 = r3.contains(r4)
            goto L7e
        L1a:
            boolean r0 = isPrivate(r3)
            if (r0 == 0) goto L25
            boolean r3 = isVisibleFrom$isVisibleInPrivate(r3, r4)
            goto L7e
        L25:
            boolean r0 = isPublic(r3)
            r1 = 1
            if (r0 == 0) goto L2e
        L2c:
            r3 = r1
            goto L7e
        L2e:
            boolean r0 = isInternal(r3)
            if (r0 == 0) goto L41
            com.google.devtools.ksp.symbol.KSFile r0 = r4.getContainingFile()
            if (r0 == 0) goto L41
            com.google.devtools.ksp.symbol.KSFile r0 = r3.getContainingFile()
            if (r0 == 0) goto L41
            goto L2c
        L41:
            boolean r0 = isJavaPackagePrivate(r3)
            if (r0 == 0) goto L4c
            boolean r3 = isVisibleFrom$isSamePackage(r3, r4)
            goto L7e
        L4c:
            boolean r0 = isProtected(r3)
            r2 = 0
            if (r0 == 0) goto L7d
            boolean r0 = isVisibleFrom$isVisibleInPrivate(r3, r4)
            if (r0 != 0) goto L2c
            boolean r0 = isVisibleFrom$isSamePackage(r3, r4)
            if (r0 != 0) goto L2c
            com.google.devtools.ksp.symbol.KSClassDeclaration r4 = closestClassDeclaration(r4)
            if (r4 == 0) goto L79
            com.google.devtools.ksp.symbol.KSClassDeclaration r3 = closestClassDeclaration(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            com.google.devtools.ksp.symbol.KSType r3 = r3.asStarProjectedType()
            com.google.devtools.ksp.symbol.KSType r4 = r4.asStarProjectedType()
            boolean r3 = r3.isAssignableFrom(r4)
            goto L7a
        L79:
            r3 = r2
        L7a:
            if (r3 == 0) goto L7d
            goto L2c
        L7d:
            r3 = r2
        L7e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.devtools.ksp.UtilsKt.isVisibleFrom(com.google.devtools.ksp.symbol.KSDeclaration, com.google.devtools.ksp.symbol.KSDeclaration):boolean");
    }

    private static final boolean isVisibleFrom$isSamePackage(KSDeclaration kSDeclaration, KSDeclaration kSDeclaration2) {
        return Intrinsics.areEqual(kSDeclaration.getPackageName(), kSDeclaration2.getPackageName());
    }

    private static final boolean isVisibleFrom$isVisibleInPrivate(KSDeclaration kSDeclaration, KSDeclaration kSDeclaration2) {
        return (isLocal(kSDeclaration2) && CollectionsKt.contains(isVisibleFrom$parentDeclarationsForLocal(kSDeclaration2), kSDeclaration.getParentDeclaration())) || Intrinsics.areEqual(kSDeclaration.getParentDeclaration(), kSDeclaration2.getParentDeclaration()) || Intrinsics.areEqual(kSDeclaration.getParentDeclaration(), kSDeclaration2) || (kSDeclaration.getParentDeclaration() == null && kSDeclaration2.getParentDeclaration() == null && Intrinsics.areEqual(kSDeclaration.getContainingFile(), kSDeclaration2.getContainingFile()));
    }

    private static final List<KSDeclaration> isVisibleFrom$parentDeclarationsForLocal(KSDeclaration kSDeclaration) {
        ArrayList arrayList = new ArrayList();
        KSDeclaration parentDeclaration = kSDeclaration.getParentDeclaration();
        Intrinsics.checkNotNull(parentDeclaration);
        while (isLocal(parentDeclaration)) {
            arrayList.add(parentDeclaration);
            parentDeclaration = parentDeclaration.getParentDeclaration();
            Intrinsics.checkNotNull(parentDeclaration);
        }
        arrayList.add(parentDeclaration);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @KspExperimental
    public static final <T extends Annotation> T toAnnotation(KSAnnotation kSAnnotation, Class<T> cls) {
        Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, createInvocationHandler(kSAnnotation, cls));
        Intrinsics.checkNotNull(objNewProxyInstance, "null cannot be cast to non-null type T of com.google.devtools.ksp.UtilsKt.toAnnotation");
        return (T) objNewProxyInstance;
    }

    private static final Object[] toArray(List<?> list, Method method, Function1<Object, ? extends Object> function1) {
        Object objNewInstance = Array.newInstance(method.getReturnType().getComponentType(), list.size());
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) objNewInstance;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            objArr[i] = obj != null ? function1.invoke(obj) : null;
        }
        return objArr;
    }

    public static final boolean validate(@NotNull KSNode kSNode, @NotNull Function2<? super KSNode, ? super KSNode, Boolean> function2) {
        Intrinsics.checkNotNullParameter(kSNode, "<this>");
        Intrinsics.checkNotNullParameter(function2, "predicate");
        return ((Boolean) kSNode.accept(new KSValidateVisitor(function2), null)).booleanValue();
    }

    public static /* synthetic */ boolean validate$default(KSNode kSNode, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            function2 = new Function2<KSNode, KSNode, Boolean>() { // from class: com.google.devtools.ksp.UtilsKt.validate.1
                @NotNull
                public final Boolean invoke(@Nullable KSNode kSNode2, @NotNull KSNode kSNode3) {
                    Intrinsics.checkNotNullParameter(kSNode3, "<anonymous parameter 1>");
                    return Boolean.TRUE;
                }
            };
        }
        return validate(kSNode, function2);
    }

    public static final boolean isAbstract(@NotNull KSPropertyDeclaration kSPropertyDeclaration) {
        Set<Modifier> modifiers;
        Set<Modifier> modifiers2;
        Intrinsics.checkNotNullParameter(kSPropertyDeclaration, "<this>");
        Set<Modifier> modifiers3 = kSPropertyDeclaration.getModifiers();
        Modifier modifier = Modifier.ABSTRACT;
        if (modifiers3.contains(modifier)) {
            return true;
        }
        KSDeclaration parentDeclaration = kSPropertyDeclaration.getParentDeclaration();
        KSClassDeclaration kSClassDeclaration = parentDeclaration instanceof KSClassDeclaration ? (KSClassDeclaration) parentDeclaration : null;
        if (kSClassDeclaration == null || kSClassDeclaration.getClassKind() != ClassKind.INTERFACE) {
            return false;
        }
        KSPropertyGetter getter = kSPropertyDeclaration.getGetter();
        if ((getter == null || (modifiers2 = getter.getModifiers()) == null) ? true : modifiers2.contains(modifier)) {
            KSPropertySetter setter = kSPropertyDeclaration.getSetter();
            if ((setter == null || (modifiers = setter.getModifiers()) == null) ? true : modifiers.contains(modifier)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static final KSClassDeclaration getClassDeclarationByName(@NotNull Resolver resolver, @NotNull String str) {
        Intrinsics.checkNotNullParameter(resolver, "<this>");
        Intrinsics.checkNotNullParameter(str, "name");
        return resolver.getClassDeclarationByName(resolver.getKSNameFromString(str));
    }

    @KspExperimental
    @Nullable
    public static final KSClassDeclaration getJavaClassByName(@NotNull Resolver resolver, @NotNull String str) {
        Intrinsics.checkNotNullParameter(resolver, "<this>");
        Intrinsics.checkNotNullParameter(str, "name");
        return getJavaClassByName(resolver, resolver.getKSNameFromString(str));
    }

    @KspExperimental
    @Nullable
    public static final KSClassDeclaration getKotlinClassByName(@NotNull Resolver resolver, @NotNull String str) {
        Intrinsics.checkNotNullParameter(resolver, "<this>");
        Intrinsics.checkNotNullParameter(str, "name");
        return getKotlinClassByName(resolver, resolver.getKSNameFromString(str));
    }
}

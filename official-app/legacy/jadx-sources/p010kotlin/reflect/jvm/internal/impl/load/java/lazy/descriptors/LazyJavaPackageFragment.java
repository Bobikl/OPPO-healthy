package p010kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.PropertyReference1Impl;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.reflect.KProperty;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p010kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl;
import p010kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import p010kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import p010kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import p010kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import p010kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import p010kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryPackageSourceElement;
import p010kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import p010kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p010kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import p010kotlin.reflect.jvm.internal.impl.name.ClassId;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;
import p010kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import p010kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p010kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p010kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;

/* JADX INFO: loaded from: classes11.dex */
public final class LazyJavaPackageFragment extends PackageFragmentDescriptorImpl {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaPackageFragment.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(LazyJavaPackageFragment.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    @NotNull
    private final Annotations annotations;

    @NotNull
    private final NotNullLazyValue binaryClasses$delegate;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final LazyJavaResolverContext f20690c;

    @NotNull
    private final JavaPackage jPackage;

    @NotNull
    private final JvmMetadataVersion jvmMetadataVersion;

    @NotNull
    private final NotNullLazyValue partToFacade$delegate;

    @NotNull
    private final JvmPackageScope scope;

    @NotNull
    private final NotNullLazyValue<List<FqName>> subPackages;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment(@NotNull LazyJavaResolverContext outerContext, @NotNull JavaPackage jPackage) {
        super(outerContext.getModule(), jPackage.getFqName());
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        this.jPackage = jPackage;
        LazyJavaResolverContext lazyJavaResolverContextChildForClassOrPackage$default = ContextKt.childForClassOrPackage$default(outerContext, this, null, 0, 6, null);
        this.f20690c = lazyJavaResolverContextChildForClassOrPackage$default;
        this.jvmMetadataVersion = DeserializationHelpersKt.jvmMetadataVersionOrDefault(outerContext.getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration());
        this.binaryClasses$delegate = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createLazyValue(new Function0<Map<String, ? extends KotlinJvmBinaryClass>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$binaryClasses$2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Map<String, ? extends KotlinJvmBinaryClass> invoke() {
                PackagePartProvider packagePartProvider = this.this$0.f20690c.getComponents().getPackagePartProvider();
                String strAsString = this.this$0.getFqName().asString();
                Intrinsics.checkNotNullExpressionValue(strAsString, "fqName.asString()");
                List<String> listFindPackageParts = packagePartProvider.findPackageParts(strAsString);
                LazyJavaPackageFragment lazyJavaPackageFragment = this.this$0;
                ArrayList arrayList = new ArrayList();
                for (String str : listFindPackageParts) {
                    ClassId classId = ClassId.topLevel(JvmClassName.byInternalName(str).getFqNameForTopLevelClassMaybeWithDollars());
                    Intrinsics.checkNotNullExpressionValue(classId, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                    KotlinJvmBinaryClass kotlinJvmBinaryClassFindKotlinClass = KotlinClassFinderKt.findKotlinClass(lazyJavaPackageFragment.f20690c.getComponents().getKotlinClassFinder(), classId, lazyJavaPackageFragment.jvmMetadataVersion);
                    Pair pair = kotlinJvmBinaryClassFindKotlinClass != null ? TuplesKt.to(str, kotlinJvmBinaryClassFindKotlinClass) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return MapsKt__MapsKt.toMap(arrayList);
            }
        });
        this.scope = new JvmPackageScope(lazyJavaResolverContextChildForClassOrPackage$default, jPackage, this);
        this.subPackages = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createRecursionTolerantLazyValue(new Function0<List<? extends FqName>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$subPackages$1
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final List<? extends FqName> invoke() {
                Collection<JavaPackage> subPackages = this.this$0.jPackage.getSubPackages();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(subPackages, 10));
                Iterator<T> it = subPackages.iterator();
                while (it.hasNext()) {
                    arrayList.add(((JavaPackage) it.next()).getFqName());
                }
                return arrayList;
            }
        }, CollectionsKt__CollectionsKt.emptyList());
        this.annotations = lazyJavaResolverContextChildForClassOrPackage$default.getComponents().getJavaTypeEnhancementState().getDisabledDefaultAnnotations() ? Annotations.Companion.getEMPTY() : LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContextChildForClassOrPackage$default, jPackage);
        this.partToFacade$delegate = lazyJavaResolverContextChildForClassOrPackage$default.getStorageManager().createLazyValue(new Function0<HashMap<JvmClassName, JvmClassName>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment$partToFacade$2

            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[KotlinClassHeader.Kind.values().length];
                    try {
                        iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final HashMap<JvmClassName, JvmClassName> invoke() {
                HashMap<JvmClassName, JvmClassName> map = new HashMap<>();
                for (Map.Entry<String, KotlinJvmBinaryClass> entry : this.this$0.getBinaryClasses$descriptors_jvm().entrySet()) {
                    String key = entry.getKey();
                    KotlinJvmBinaryClass value = entry.getValue();
                    JvmClassName jvmClassNameByInternalName = JvmClassName.byInternalName(key);
                    Intrinsics.checkNotNullExpressionValue(jvmClassNameByInternalName, "byInternalName(partInternalName)");
                    KotlinClassHeader classHeader = value.getClassHeader();
                    int i = WhenMappings.$EnumSwitchMapping$0[classHeader.getKind().ordinal()];
                    if (i == 1) {
                        String multifileClassName = classHeader.getMultifileClassName();
                        if (multifileClassName != null) {
                            JvmClassName jvmClassNameByInternalName2 = JvmClassName.byInternalName(multifileClassName);
                            Intrinsics.checkNotNullExpressionValue(jvmClassNameByInternalName2, "byInternalName(header.mu…: continue@kotlinClasses)");
                            map.put(jvmClassNameByInternalName, jvmClassNameByInternalName2);
                        }
                    } else if (i == 2) {
                        map.put(jvmClassNameByInternalName, jvmClassNameByInternalName);
                    }
                }
                return map;
            }
        });
    }

    @Nullable
    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(@NotNull JavaClass jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        return this.scope.getJavaScope$descriptors_jvm().findClassifierByJavaClass$descriptors_jvm(jClass);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl, p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    @NotNull
    public Annotations getAnnotations() {
        return this.annotations;
    }

    @NotNull
    public final Map<String, KotlinJvmBinaryClass> getBinaryClasses$descriptors_jvm() {
        return (Map) StorageKt.getValue(this.binaryClasses$delegate, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, p010kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    @NotNull
    public SourceElement getSource() {
        return new KotlinJvmBinaryPackageSourceElement(this);
    }

    @NotNull
    public final List<FqName> getSubPackageFqNames$descriptors_jvm() {
        return this.subPackages.invoke();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageFragmentDescriptorImpl, p010kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl
    @NotNull
    public String toString() {
        return "Lazy Java package fragment: " + getFqName() + " of module " + this.f20690c.getComponents().getModule();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor
    @NotNull
    public JvmPackageScope getMemberScope() {
        return this.scope;
    }
}

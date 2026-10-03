package p010kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.LazyThreadSafetyMode;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;
import p010kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType, still in use, count: 1, list:
  (r4v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType) from 0x006e: FILLED_NEW_ARRAY 
  (r4v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r5v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r6v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r7v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r8v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r9v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
  (r10v0 kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType)
 A[WRAPPED] elemType: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes11.dex */
public final class PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    @JvmField
    @NotNull
    public static final Set<PrimitiveType> NUMBER_TYPES = SetsKt__SetsKt.setOf((Object[]) new PrimitiveType[]{new PrimitiveType("Char"), new PrimitiveType("Byte"), new PrimitiveType("Short"), new PrimitiveType("Int"), new PrimitiveType("Float"), new PrimitiveType("Long"), new PrimitiveType("Double")});

    @NotNull
    private final Lazy arrayTypeFqName$delegate;

    @NotNull
    private final Name arrayTypeName;

    @NotNull
    private final Lazy typeFqName$delegate;

    @NotNull
    private final Name typeName;

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
    }

    private PrimitiveType(String str) {
        super(str, i);
        Name nameIdentifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(typeName)");
        this.typeName = nameIdentifier;
        Name nameIdentifier2 = Name.identifier(str + "Array");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(\"${typeName}Array\")");
        this.arrayTypeName = nameIdentifier2;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.typeFqName$delegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<FqName>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$typeFqName$2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final FqName invoke() {
                FqName fqNameChild = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(this.this$0.getTypeName());
                Intrinsics.checkNotNullExpressionValue(fqNameChild, "BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName)");
                return fqNameChild;
            }
        });
        this.arrayTypeFqName$delegate = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<FqName>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$arrayTypeFqName$2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final FqName invoke() {
                FqName fqNameChild = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(this.this$0.getArrayTypeName());
                Intrinsics.checkNotNullExpressionValue(fqNameChild, "BUILT_INS_PACKAGE_FQ_NAME.child(arrayTypeName)");
                return fqNameChild;
            }
        });
    }

    public static PrimitiveType valueOf(String str) {
        return (PrimitiveType) Enum.valueOf(PrimitiveType.class, str);
    }

    public static PrimitiveType[] values() {
        return (PrimitiveType[]) $VALUES.clone();
    }

    @NotNull
    public final FqName getArrayTypeFqName() {
        return (FqName) this.arrayTypeFqName$delegate.getValue();
    }

    @NotNull
    public final Name getArrayTypeName() {
        return this.arrayTypeName;
    }

    @NotNull
    public final FqName getTypeFqName() {
        return (FqName) this.typeFqName$delegate.getValue();
    }

    @NotNull
    public final Name getTypeName() {
        return this.typeName;
    }
}

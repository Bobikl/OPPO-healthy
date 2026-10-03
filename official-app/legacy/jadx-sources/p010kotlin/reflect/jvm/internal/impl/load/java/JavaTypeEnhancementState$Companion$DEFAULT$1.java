package p010kotlin.reflect.jvm.internal.impl.load.java;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReference;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.reflect.KDeclarationContainer;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class JavaTypeEnhancementState$Companion$DEFAULT$1 extends FunctionReference implements Function1<FqName, ReportLevel> {
    public static final JavaTypeEnhancementState$Companion$DEFAULT$1 INSTANCE = new JavaTypeEnhancementState$Companion$DEFAULT$1();

    public JavaTypeEnhancementState$Companion$DEFAULT$1() {
        super(1);
    }

    @Override // p010kotlin.jvm.internal.CallableReference, p010kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // p010kotlin.jvm.internal.CallableReference
    @NotNull
    public final KDeclarationContainer getOwner() {
        return Reflection.getOrCreateKotlinPackage(JavaNullabilityAnnotationSettingsKt.class, "compiler.common.jvm");
    }

    @Override // p010kotlin.jvm.internal.CallableReference
    @NotNull
    public final String getSignature() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final ReportLevel invoke(@NotNull FqName p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return JavaNullabilityAnnotationSettingsKt.getDefaultReportLevelForAnnotation(p0);
    }
}

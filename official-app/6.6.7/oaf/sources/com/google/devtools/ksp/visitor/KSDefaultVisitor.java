package com.google.devtools.ksp.visitor;

import com.google.devtools.ksp.symbol.KSAnnotated;
import com.google.devtools.ksp.symbol.KSAnnotation;
import com.google.devtools.ksp.symbol.KSCallableReference;
import com.google.devtools.ksp.symbol.KSClassDeclaration;
import com.google.devtools.ksp.symbol.KSClassifierReference;
import com.google.devtools.ksp.symbol.KSDeclaration;
import com.google.devtools.ksp.symbol.KSDeclarationContainer;
import com.google.devtools.ksp.symbol.KSDefNonNullReference;
import com.google.devtools.ksp.symbol.KSDynamicReference;
import com.google.devtools.ksp.symbol.KSFile;
import com.google.devtools.ksp.symbol.KSFunctionDeclaration;
import com.google.devtools.ksp.symbol.KSModifierListOwner;
import com.google.devtools.ksp.symbol.KSParenthesizedReference;
import com.google.devtools.ksp.symbol.KSPropertyAccessor;
import com.google.devtools.ksp.symbol.KSPropertyDeclaration;
import com.google.devtools.ksp.symbol.KSPropertyGetter;
import com.google.devtools.ksp.symbol.KSPropertySetter;
import com.google.devtools.ksp.symbol.KSReferenceElement;
import com.google.devtools.ksp.symbol.KSTypeAlias;
import com.google.devtools.ksp.symbol.KSTypeArgument;
import com.google.devtools.ksp.symbol.KSTypeParameter;
import com.google.devtools.ksp.symbol.KSTypeReference;
import com.google.devtools.ksp.symbol.KSValueArgument;
import com.google.devtools.ksp.symbol.KSValueParameter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rJ\u001d\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J\u001d\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\u001d\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u00172\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\u001d\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u001d\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u001d\u0010!\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\"2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010#J\u001d\u0010$\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020%2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010&J\u001d\u0010'\u001a\u00028\u00012\u0006\u0010(\u001a\u00020)2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010*J\u001d\u0010+\u001a\u00028\u00012\u0006\u0010,\u001a\u00020-2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010.J\u001d\u0010/\u001a\u00028\u00012\u0006\u00100\u001a\u0002012\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00102J\u001d\u00103\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u0002042\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00105J\u001d\u00106\u001a\u00028\u00012\u0006\u00107\u001a\u0002082\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00109J\u001d\u0010:\u001a\u00028\u00012\u0006\u0010;\u001a\u00020<2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010=J\u001d\u0010>\u001a\u00028\u00012\u0006\u0010?\u001a\u00020@2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010AJ\u001d\u0010B\u001a\u00028\u00012\u0006\u0010C\u001a\u00020D2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010EJ\u001d\u0010F\u001a\u00028\u00012\u0006\u0010G\u001a\u00020H2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010IJ\u001d\u0010J\u001a\u00028\u00012\u0006\u0010K\u001a\u00020L2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010MJ\u001d\u0010N\u001a\u00028\u00012\u0006\u0010O\u001a\u00020P2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010QJ\u001d\u0010R\u001a\u00028\u00012\u0006\u0010S\u001a\u00020T2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010UJ\u001d\u0010V\u001a\u00028\u00012\u0006\u0010W\u001a\u00020X2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010YJ\u001d\u0010Z\u001a\u00028\u00012\u0006\u0010[\u001a\u00020\\2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010]J\u001d\u0010^\u001a\u00028\u00012\u0006\u0010_\u001a\u00020`2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010a¨\u0006b"}, d2 = {"Lcom/google/devtools/ksp/visitor/KSDefaultVisitor;", "D", "R", "Lcom/google/devtools/ksp/visitor/KSEmptyVisitor;", "()V", "visitAnnotated", "annotated", "Lcom/google/devtools/ksp/symbol/KSAnnotated;", "data", "(Lcom/google/devtools/ksp/symbol/KSAnnotated;Ljava/lang/Object;)Ljava/lang/Object;", "visitAnnotation", "annotation", "Lcom/google/devtools/ksp/symbol/KSAnnotation;", "(Lcom/google/devtools/ksp/symbol/KSAnnotation;Ljava/lang/Object;)Ljava/lang/Object;", "visitCallableReference", "reference", "Lcom/google/devtools/ksp/symbol/KSCallableReference;", "(Lcom/google/devtools/ksp/symbol/KSCallableReference;Ljava/lang/Object;)Ljava/lang/Object;", "visitClassDeclaration", "classDeclaration", "Lcom/google/devtools/ksp/symbol/KSClassDeclaration;", "(Lcom/google/devtools/ksp/symbol/KSClassDeclaration;Ljava/lang/Object;)Ljava/lang/Object;", "visitClassifierReference", "Lcom/google/devtools/ksp/symbol/KSClassifierReference;", "(Lcom/google/devtools/ksp/symbol/KSClassifierReference;Ljava/lang/Object;)Ljava/lang/Object;", "visitDeclaration", "declaration", "Lcom/google/devtools/ksp/symbol/KSDeclaration;", "(Lcom/google/devtools/ksp/symbol/KSDeclaration;Ljava/lang/Object;)Ljava/lang/Object;", "visitDeclarationContainer", "declarationContainer", "Lcom/google/devtools/ksp/symbol/KSDeclarationContainer;", "(Lcom/google/devtools/ksp/symbol/KSDeclarationContainer;Ljava/lang/Object;)Ljava/lang/Object;", "visitDefNonNullReference", "Lcom/google/devtools/ksp/symbol/KSDefNonNullReference;", "(Lcom/google/devtools/ksp/symbol/KSDefNonNullReference;Ljava/lang/Object;)Ljava/lang/Object;", "visitDynamicReference", "Lcom/google/devtools/ksp/symbol/KSDynamicReference;", "(Lcom/google/devtools/ksp/symbol/KSDynamicReference;Ljava/lang/Object;)Ljava/lang/Object;", "visitFile", "file", "Lcom/google/devtools/ksp/symbol/KSFile;", "(Lcom/google/devtools/ksp/symbol/KSFile;Ljava/lang/Object;)Ljava/lang/Object;", "visitFunctionDeclaration", "function", "Lcom/google/devtools/ksp/symbol/KSFunctionDeclaration;", "(Lcom/google/devtools/ksp/symbol/KSFunctionDeclaration;Ljava/lang/Object;)Ljava/lang/Object;", "visitModifierListOwner", "modifierListOwner", "Lcom/google/devtools/ksp/symbol/KSModifierListOwner;", "(Lcom/google/devtools/ksp/symbol/KSModifierListOwner;Ljava/lang/Object;)Ljava/lang/Object;", "visitParenthesizedReference", "Lcom/google/devtools/ksp/symbol/KSParenthesizedReference;", "(Lcom/google/devtools/ksp/symbol/KSParenthesizedReference;Ljava/lang/Object;)Ljava/lang/Object;", "visitPropertyAccessor", "accessor", "Lcom/google/devtools/ksp/symbol/KSPropertyAccessor;", "(Lcom/google/devtools/ksp/symbol/KSPropertyAccessor;Ljava/lang/Object;)Ljava/lang/Object;", "visitPropertyDeclaration", "property", "Lcom/google/devtools/ksp/symbol/KSPropertyDeclaration;", "(Lcom/google/devtools/ksp/symbol/KSPropertyDeclaration;Ljava/lang/Object;)Ljava/lang/Object;", "visitPropertyGetter", "getter", "Lcom/google/devtools/ksp/symbol/KSPropertyGetter;", "(Lcom/google/devtools/ksp/symbol/KSPropertyGetter;Ljava/lang/Object;)Ljava/lang/Object;", "visitPropertySetter", "setter", "Lcom/google/devtools/ksp/symbol/KSPropertySetter;", "(Lcom/google/devtools/ksp/symbol/KSPropertySetter;Ljava/lang/Object;)Ljava/lang/Object;", "visitReferenceElement", "element", "Lcom/google/devtools/ksp/symbol/KSReferenceElement;", "(Lcom/google/devtools/ksp/symbol/KSReferenceElement;Ljava/lang/Object;)Ljava/lang/Object;", "visitTypeAlias", "typeAlias", "Lcom/google/devtools/ksp/symbol/KSTypeAlias;", "(Lcom/google/devtools/ksp/symbol/KSTypeAlias;Ljava/lang/Object;)Ljava/lang/Object;", "visitTypeArgument", "typeArgument", "Lcom/google/devtools/ksp/symbol/KSTypeArgument;", "(Lcom/google/devtools/ksp/symbol/KSTypeArgument;Ljava/lang/Object;)Ljava/lang/Object;", "visitTypeParameter", "typeParameter", "Lcom/google/devtools/ksp/symbol/KSTypeParameter;", "(Lcom/google/devtools/ksp/symbol/KSTypeParameter;Ljava/lang/Object;)Ljava/lang/Object;", "visitTypeReference", "typeReference", "Lcom/google/devtools/ksp/symbol/KSTypeReference;", "(Lcom/google/devtools/ksp/symbol/KSTypeReference;Ljava/lang/Object;)Ljava/lang/Object;", "visitValueArgument", "valueArgument", "Lcom/google/devtools/ksp/symbol/KSValueArgument;", "(Lcom/google/devtools/ksp/symbol/KSValueArgument;Ljava/lang/Object;)Ljava/lang/Object;", "visitValueParameter", "valueParameter", "Lcom/google/devtools/ksp/symbol/KSValueParameter;", "(Lcom/google/devtools/ksp/symbol/KSValueParameter;Ljava/lang/Object;)Ljava/lang/Object;", "api"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class KSDefaultVisitor<D, R> extends KSEmptyVisitor<D, R> {
    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitAnnotated(@NotNull KSAnnotated annotated, D data) {
        Intrinsics.checkNotNullParameter(annotated, "annotated");
        visitNode(annotated, data);
        return (R) super.visitAnnotated(annotated, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitAnnotation(@NotNull KSAnnotation annotation, D data) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        visitNode(annotation, data);
        return (R) super.visitAnnotation(annotation, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitCallableReference(@NotNull KSCallableReference reference, D data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        visitReferenceElement(reference, data);
        return (R) super.visitCallableReference(reference, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitClassDeclaration(@NotNull KSClassDeclaration classDeclaration, D data) {
        Intrinsics.checkNotNullParameter(classDeclaration, "classDeclaration");
        visitDeclaration(classDeclaration, data);
        visitDeclarationContainer(classDeclaration, data);
        return (R) super.visitClassDeclaration(classDeclaration, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitClassifierReference(@NotNull KSClassifierReference reference, D data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        visitReferenceElement(reference, data);
        return (R) super.visitClassifierReference(reference, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitDeclaration(@NotNull KSDeclaration declaration, D data) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        visitAnnotated(declaration, data);
        visitModifierListOwner(declaration, data);
        return (R) super.visitDeclaration(declaration, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitDeclarationContainer(@NotNull KSDeclarationContainer declarationContainer, D data) {
        Intrinsics.checkNotNullParameter(declarationContainer, "declarationContainer");
        visitNode(declarationContainer, data);
        return (R) super.visitDeclarationContainer(declarationContainer, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitDefNonNullReference(@NotNull KSDefNonNullReference reference, D data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        visitReferenceElement(reference, data);
        return (R) super.visitDefNonNullReference(reference, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitDynamicReference(@NotNull KSDynamicReference reference, D data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        visitReferenceElement(reference, data);
        return (R) super.visitDynamicReference(reference, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitFile(@NotNull KSFile file, D data) {
        Intrinsics.checkNotNullParameter(file, "file");
        visitAnnotated(file, data);
        visitDeclarationContainer(file, data);
        return (R) super.visitFile(file, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitFunctionDeclaration(@NotNull KSFunctionDeclaration function, D data) {
        Intrinsics.checkNotNullParameter(function, "function");
        visitDeclaration(function, data);
        visitDeclarationContainer(function, data);
        return (R) super.visitFunctionDeclaration(function, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitModifierListOwner(@NotNull KSModifierListOwner modifierListOwner, D data) {
        Intrinsics.checkNotNullParameter(modifierListOwner, "modifierListOwner");
        visitNode(modifierListOwner, data);
        return (R) super.visitModifierListOwner(modifierListOwner, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitParenthesizedReference(@NotNull KSParenthesizedReference reference, D data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        visitReferenceElement(reference, data);
        return (R) super.visitParenthesizedReference(reference, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitPropertyAccessor(@NotNull KSPropertyAccessor accessor, D data) {
        Intrinsics.checkNotNullParameter(accessor, "accessor");
        visitModifierListOwner(accessor, data);
        visitAnnotated(accessor, data);
        return (R) super.visitPropertyAccessor(accessor, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitPropertyDeclaration(@NotNull KSPropertyDeclaration property, D data) {
        Intrinsics.checkNotNullParameter(property, "property");
        visitDeclaration(property, data);
        return (R) super.visitPropertyDeclaration(property, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitPropertyGetter(@NotNull KSPropertyGetter getter, D data) {
        Intrinsics.checkNotNullParameter(getter, "getter");
        visitPropertyAccessor(getter, data);
        return (R) super.visitPropertyGetter(getter, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitPropertySetter(@NotNull KSPropertySetter setter, D data) {
        Intrinsics.checkNotNullParameter(setter, "setter");
        visitPropertyAccessor(setter, data);
        return (R) super.visitPropertySetter(setter, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitReferenceElement(@NotNull KSReferenceElement element, D data) {
        Intrinsics.checkNotNullParameter(element, "element");
        visitNode(element, data);
        return (R) super.visitReferenceElement(element, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitTypeAlias(@NotNull KSTypeAlias typeAlias, D data) {
        Intrinsics.checkNotNullParameter(typeAlias, "typeAlias");
        visitDeclaration(typeAlias, data);
        return (R) super.visitTypeAlias(typeAlias, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitTypeArgument(@NotNull KSTypeArgument typeArgument, D data) {
        Intrinsics.checkNotNullParameter(typeArgument, "typeArgument");
        visitAnnotated(typeArgument, data);
        return (R) super.visitTypeArgument(typeArgument, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitTypeParameter(@NotNull KSTypeParameter typeParameter, D data) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        visitDeclaration(typeParameter, data);
        return (R) super.visitTypeParameter(typeParameter, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitTypeReference(@NotNull KSTypeReference typeReference, D data) {
        Intrinsics.checkNotNullParameter(typeReference, "typeReference");
        visitAnnotated(typeReference, data);
        visitModifierListOwner(typeReference, data);
        return (R) super.visitTypeReference(typeReference, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitValueArgument(@NotNull KSValueArgument valueArgument, D data) {
        Intrinsics.checkNotNullParameter(valueArgument, "valueArgument");
        visitAnnotated(valueArgument, data);
        return (R) super.visitValueArgument(valueArgument, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitValueParameter(@NotNull KSValueParameter valueParameter, D data) {
        Intrinsics.checkNotNullParameter(valueParameter, "valueParameter");
        visitAnnotated(valueParameter, data);
        return (R) super.visitValueParameter(valueParameter, data);
    }
}

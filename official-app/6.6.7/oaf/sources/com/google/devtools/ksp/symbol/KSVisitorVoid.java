package com.google.devtools.ksp.symbol;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\fJ\u001d\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\u001fJ\u001d\u0010 \u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\"J\u001d\u0010#\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020$2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010%J\u001d\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010)J\u001d\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010-J\u001d\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u0002002\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u00101J\u001d\u00102\u001a\u00020\u00022\u0006\u00103\u001a\u0002042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u00105J\u001d\u00106\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u0002072\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u00108J\u001d\u00109\u001a\u00020\u00022\u0006\u0010:\u001a\u00020;2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010<J\u001d\u0010=\u001a\u00020\u00022\u0006\u0010>\u001a\u00020?2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010@J\u001d\u0010A\u001a\u00020\u00022\u0006\u0010B\u001a\u00020C2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010DJ\u001d\u0010E\u001a\u00020\u00022\u0006\u0010F\u001a\u00020G2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010HJ\u001d\u0010I\u001a\u00020\u00022\u0006\u0010J\u001a\u00020K2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010LJ\u001d\u0010M\u001a\u00020\u00022\u0006\u0010N\u001a\u00020O2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010PJ\u001d\u0010Q\u001a\u00020\u00022\u0006\u0010R\u001a\u00020S2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010TJ\u001d\u0010U\u001a\u00020\u00022\u0006\u0010V\u001a\u00020W2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010XJ\u001d\u0010Y\u001a\u00020\u00022\u0006\u0010Z\u001a\u00020[2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\\J\u001d\u0010]\u001a\u00020\u00022\u0006\u0010^\u001a\u00020_2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010`J\u001d\u0010a\u001a\u00020\u00022\u0006\u0010b\u001a\u00020c2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010d¨\u0006e"}, d2 = {"Lcom/google/devtools/ksp/symbol/KSVisitorVoid;", "Lcom/google/devtools/ksp/symbol/KSVisitor;", "", "()V", "visitAnnotated", "annotated", "Lcom/google/devtools/ksp/symbol/KSAnnotated;", "data", "(Lcom/google/devtools/ksp/symbol/KSAnnotated;Lkotlin/Unit;)V", "visitAnnotation", "annotation", "Lcom/google/devtools/ksp/symbol/KSAnnotation;", "(Lcom/google/devtools/ksp/symbol/KSAnnotation;Lkotlin/Unit;)V", "visitCallableReference", "reference", "Lcom/google/devtools/ksp/symbol/KSCallableReference;", "(Lcom/google/devtools/ksp/symbol/KSCallableReference;Lkotlin/Unit;)V", "visitClassDeclaration", "classDeclaration", "Lcom/google/devtools/ksp/symbol/KSClassDeclaration;", "(Lcom/google/devtools/ksp/symbol/KSClassDeclaration;Lkotlin/Unit;)V", "visitClassifierReference", "Lcom/google/devtools/ksp/symbol/KSClassifierReference;", "(Lcom/google/devtools/ksp/symbol/KSClassifierReference;Lkotlin/Unit;)V", "visitDeclaration", "declaration", "Lcom/google/devtools/ksp/symbol/KSDeclaration;", "(Lcom/google/devtools/ksp/symbol/KSDeclaration;Lkotlin/Unit;)V", "visitDeclarationContainer", "declarationContainer", "Lcom/google/devtools/ksp/symbol/KSDeclarationContainer;", "(Lcom/google/devtools/ksp/symbol/KSDeclarationContainer;Lkotlin/Unit;)V", "visitDefNonNullReference", "Lcom/google/devtools/ksp/symbol/KSDefNonNullReference;", "(Lcom/google/devtools/ksp/symbol/KSDefNonNullReference;Lkotlin/Unit;)V", "visitDynamicReference", "Lcom/google/devtools/ksp/symbol/KSDynamicReference;", "(Lcom/google/devtools/ksp/symbol/KSDynamicReference;Lkotlin/Unit;)V", "visitFile", "file", "Lcom/google/devtools/ksp/symbol/KSFile;", "(Lcom/google/devtools/ksp/symbol/KSFile;Lkotlin/Unit;)V", "visitFunctionDeclaration", "function", "Lcom/google/devtools/ksp/symbol/KSFunctionDeclaration;", "(Lcom/google/devtools/ksp/symbol/KSFunctionDeclaration;Lkotlin/Unit;)V", "visitModifierListOwner", "modifierListOwner", "Lcom/google/devtools/ksp/symbol/KSModifierListOwner;", "(Lcom/google/devtools/ksp/symbol/KSModifierListOwner;Lkotlin/Unit;)V", "visitNode", "node", "Lcom/google/devtools/ksp/symbol/KSNode;", "(Lcom/google/devtools/ksp/symbol/KSNode;Lkotlin/Unit;)V", "visitParenthesizedReference", "Lcom/google/devtools/ksp/symbol/KSParenthesizedReference;", "(Lcom/google/devtools/ksp/symbol/KSParenthesizedReference;Lkotlin/Unit;)V", "visitPropertyAccessor", "accessor", "Lcom/google/devtools/ksp/symbol/KSPropertyAccessor;", "(Lcom/google/devtools/ksp/symbol/KSPropertyAccessor;Lkotlin/Unit;)V", "visitPropertyDeclaration", "property", "Lcom/google/devtools/ksp/symbol/KSPropertyDeclaration;", "(Lcom/google/devtools/ksp/symbol/KSPropertyDeclaration;Lkotlin/Unit;)V", "visitPropertyGetter", "getter", "Lcom/google/devtools/ksp/symbol/KSPropertyGetter;", "(Lcom/google/devtools/ksp/symbol/KSPropertyGetter;Lkotlin/Unit;)V", "visitPropertySetter", "setter", "Lcom/google/devtools/ksp/symbol/KSPropertySetter;", "(Lcom/google/devtools/ksp/symbol/KSPropertySetter;Lkotlin/Unit;)V", "visitReferenceElement", "element", "Lcom/google/devtools/ksp/symbol/KSReferenceElement;", "(Lcom/google/devtools/ksp/symbol/KSReferenceElement;Lkotlin/Unit;)V", "visitTypeAlias", "typeAlias", "Lcom/google/devtools/ksp/symbol/KSTypeAlias;", "(Lcom/google/devtools/ksp/symbol/KSTypeAlias;Lkotlin/Unit;)V", "visitTypeArgument", "typeArgument", "Lcom/google/devtools/ksp/symbol/KSTypeArgument;", "(Lcom/google/devtools/ksp/symbol/KSTypeArgument;Lkotlin/Unit;)V", "visitTypeParameter", "typeParameter", "Lcom/google/devtools/ksp/symbol/KSTypeParameter;", "(Lcom/google/devtools/ksp/symbol/KSTypeParameter;Lkotlin/Unit;)V", "visitTypeReference", "typeReference", "Lcom/google/devtools/ksp/symbol/KSTypeReference;", "(Lcom/google/devtools/ksp/symbol/KSTypeReference;Lkotlin/Unit;)V", "visitValueArgument", "valueArgument", "Lcom/google/devtools/ksp/symbol/KSValueArgument;", "(Lcom/google/devtools/ksp/symbol/KSValueArgument;Lkotlin/Unit;)V", "visitValueParameter", "valueParameter", "Lcom/google/devtools/ksp/symbol/KSValueParameter;", "(Lcom/google/devtools/ksp/symbol/KSValueParameter;Lkotlin/Unit;)V", "api"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class KSVisitorVoid implements KSVisitor<Unit, Unit> {
    public void visitAnnotated(@NotNull KSAnnotated annotated, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(annotated, "annotated");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitAnnotation(@NotNull KSAnnotation annotation, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitCallableReference(@NotNull KSCallableReference reference, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitClassDeclaration(@NotNull KSClassDeclaration classDeclaration, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(classDeclaration, "classDeclaration");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitClassifierReference(@NotNull KSClassifierReference reference, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitDeclaration(@NotNull KSDeclaration declaration, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitDeclarationContainer(@NotNull KSDeclarationContainer declarationContainer, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(declarationContainer, "declarationContainer");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitDefNonNullReference(@NotNull KSDefNonNullReference reference, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitDynamicReference(@NotNull KSDynamicReference reference, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitFile(@NotNull KSFile file, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitFunctionDeclaration(@NotNull KSFunctionDeclaration function, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitModifierListOwner(@NotNull KSModifierListOwner modifierListOwner, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(modifierListOwner, "modifierListOwner");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitNode(@NotNull KSNode node, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(node, "node");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitParenthesizedReference(@NotNull KSParenthesizedReference reference, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitPropertyAccessor(@NotNull KSPropertyAccessor accessor, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(accessor, "accessor");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitPropertyDeclaration(@NotNull KSPropertyDeclaration property, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitPropertyGetter(@NotNull KSPropertyGetter getter, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(getter, "getter");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitPropertySetter(@NotNull KSPropertySetter setter, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(setter, "setter");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitReferenceElement(@NotNull KSReferenceElement element, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitTypeAlias(@NotNull KSTypeAlias typeAlias, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(typeAlias, "typeAlias");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitTypeArgument(@NotNull KSTypeArgument typeArgument, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(typeArgument, "typeArgument");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitTypeParameter(@NotNull KSTypeParameter typeParameter, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitTypeReference(@NotNull KSTypeReference typeReference, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(typeReference, "typeReference");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitValueArgument(@NotNull KSValueArgument valueArgument, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(valueArgument, "valueArgument");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public void visitValueParameter(@NotNull KSValueParameter valueParameter, @NotNull Unit data) {
        Intrinsics.checkNotNullParameter(valueParameter, "valueParameter");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitAnnotated(KSAnnotated kSAnnotated, Unit unit) {
        visitAnnotated(kSAnnotated, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitAnnotation(KSAnnotation kSAnnotation, Unit unit) {
        visitAnnotation(kSAnnotation, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitCallableReference(KSCallableReference kSCallableReference, Unit unit) {
        visitCallableReference(kSCallableReference, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitClassDeclaration(KSClassDeclaration kSClassDeclaration, Unit unit) {
        visitClassDeclaration(kSClassDeclaration, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitClassifierReference(KSClassifierReference kSClassifierReference, Unit unit) {
        visitClassifierReference(kSClassifierReference, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitDeclaration(KSDeclaration kSDeclaration, Unit unit) {
        visitDeclaration(kSDeclaration, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitDeclarationContainer(KSDeclarationContainer kSDeclarationContainer, Unit unit) {
        visitDeclarationContainer(kSDeclarationContainer, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitDefNonNullReference(KSDefNonNullReference kSDefNonNullReference, Unit unit) {
        visitDefNonNullReference(kSDefNonNullReference, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitDynamicReference(KSDynamicReference kSDynamicReference, Unit unit) {
        visitDynamicReference(kSDynamicReference, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitFile(KSFile kSFile, Unit unit) {
        visitFile(kSFile, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitFunctionDeclaration(KSFunctionDeclaration kSFunctionDeclaration, Unit unit) {
        visitFunctionDeclaration(kSFunctionDeclaration, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitModifierListOwner(KSModifierListOwner kSModifierListOwner, Unit unit) {
        visitModifierListOwner(kSModifierListOwner, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitNode(KSNode kSNode, Unit unit) {
        visitNode(kSNode, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitParenthesizedReference(KSParenthesizedReference kSParenthesizedReference, Unit unit) {
        visitParenthesizedReference(kSParenthesizedReference, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitPropertyAccessor(KSPropertyAccessor kSPropertyAccessor, Unit unit) {
        visitPropertyAccessor(kSPropertyAccessor, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitPropertyDeclaration(KSPropertyDeclaration kSPropertyDeclaration, Unit unit) {
        visitPropertyDeclaration(kSPropertyDeclaration, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitPropertyGetter(KSPropertyGetter kSPropertyGetter, Unit unit) {
        visitPropertyGetter(kSPropertyGetter, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitPropertySetter(KSPropertySetter kSPropertySetter, Unit unit) {
        visitPropertySetter(kSPropertySetter, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitReferenceElement(KSReferenceElement kSReferenceElement, Unit unit) {
        visitReferenceElement(kSReferenceElement, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitTypeAlias(KSTypeAlias kSTypeAlias, Unit unit) {
        visitTypeAlias(kSTypeAlias, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitTypeArgument(KSTypeArgument kSTypeArgument, Unit unit) {
        visitTypeArgument(kSTypeArgument, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitTypeParameter(KSTypeParameter kSTypeParameter, Unit unit) {
        visitTypeParameter(kSTypeParameter, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitTypeReference(KSTypeReference kSTypeReference, Unit unit) {
        visitTypeReference(kSTypeReference, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitValueArgument(KSValueArgument kSValueArgument, Unit unit) {
        visitValueArgument(kSValueArgument, unit);
        return Unit.INSTANCE;
    }

    @Override // com.google.devtools.ksp.symbol.KSVisitor
    public /* bridge */ /* synthetic */ Unit visitValueParameter(KSValueParameter kSValueParameter, Unit unit) {
        visitValueParameter(kSValueParameter, unit);
        return Unit.INSTANCE;
    }
}

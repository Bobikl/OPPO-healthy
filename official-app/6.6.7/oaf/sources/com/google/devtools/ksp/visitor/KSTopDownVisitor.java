package com.google.devtools.ksp.visitor;

import com.google.devtools.ksp.symbol.KSAnnotated;
import com.google.devtools.ksp.symbol.KSAnnotation;
import com.google.devtools.ksp.symbol.KSCallableReference;
import com.google.devtools.ksp.symbol.KSClassDeclaration;
import com.google.devtools.ksp.symbol.KSClassifierReference;
import com.google.devtools.ksp.symbol.KSDeclaration;
import com.google.devtools.ksp.symbol.KSDeclarationContainer;
import com.google.devtools.ksp.symbol.KSDefNonNullReference;
import com.google.devtools.ksp.symbol.KSFunctionDeclaration;
import com.google.devtools.ksp.symbol.KSNode;
import com.google.devtools.ksp.symbol.KSParenthesizedReference;
import com.google.devtools.ksp.symbol.KSPropertyDeclaration;
import com.google.devtools.ksp.symbol.KSPropertyGetter;
import com.google.devtools.ksp.symbol.KSPropertySetter;
import com.google.devtools.ksp.symbol.KSReferenceElement;
import com.google.devtools.ksp.symbol.KSTypeAlias;
import com.google.devtools.ksp.symbol.KSTypeArgument;
import com.google.devtools.ksp.symbol.KSTypeParameter;
import com.google.devtools.ksp.symbol.KSTypeReference;
import com.google.devtools.ksp.symbol.KSValueParameter;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\rJ\u001d\u0010\u000e\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J\u001d\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\u001d\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u00172\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0018J\u001d\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u001d\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u001d\u0010!\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\"2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010#J\u001d\u0010$\u001a\u00028\u00012\u0006\u0010%\u001a\u00020&2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010'J\u001d\u0010(\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020)2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010*J\u001d\u0010+\u001a\u00028\u00012\u0006\u0010,\u001a\u00020-2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010.J\u001d\u0010/\u001a\u00028\u00012\u0006\u00100\u001a\u0002012\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00102J\u001d\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u0002052\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00106J\u001d\u00107\u001a\u00028\u00012\u0006\u00108\u001a\u0002092\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010:J\u001d\u0010;\u001a\u00028\u00012\u0006\u0010<\u001a\u00020=2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010>J\u001d\u0010?\u001a\u00028\u00012\u0006\u0010@\u001a\u00020A2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010BJ\u001d\u0010C\u001a\u00028\u00012\u0006\u0010D\u001a\u00020E2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010FJ\u001d\u0010G\u001a\u00028\u00012\u0006\u0010H\u001a\u00020I2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010JJ\u001d\u0010K\u001a\u00028\u00012\u0006\u0010L\u001a\u00020M2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010NJ\u0019\u0010O\u001a\u00028\u0001*\u00020P2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010QJ\u001f\u0010O\u001a\u00020R*\b\u0012\u0004\u0012\u00020P0S2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010TJ\u001f\u0010O\u001a\u00020R*\b\u0012\u0004\u0012\u00020P0U2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010V¨\u0006W"}, d2 = {"Lcom/google/devtools/ksp/visitor/KSTopDownVisitor;", "D", "R", "Lcom/google/devtools/ksp/visitor/KSDefaultVisitor;", "()V", "visitAnnotated", "annotated", "Lcom/google/devtools/ksp/symbol/KSAnnotated;", "data", "(Lcom/google/devtools/ksp/symbol/KSAnnotated;Ljava/lang/Object;)Ljava/lang/Object;", "visitAnnotation", "annotation", "Lcom/google/devtools/ksp/symbol/KSAnnotation;", "(Lcom/google/devtools/ksp/symbol/KSAnnotation;Ljava/lang/Object;)Ljava/lang/Object;", "visitCallableReference", "reference", "Lcom/google/devtools/ksp/symbol/KSCallableReference;", "(Lcom/google/devtools/ksp/symbol/KSCallableReference;Ljava/lang/Object;)Ljava/lang/Object;", "visitClassDeclaration", "classDeclaration", "Lcom/google/devtools/ksp/symbol/KSClassDeclaration;", "(Lcom/google/devtools/ksp/symbol/KSClassDeclaration;Ljava/lang/Object;)Ljava/lang/Object;", "visitClassifierReference", "Lcom/google/devtools/ksp/symbol/KSClassifierReference;", "(Lcom/google/devtools/ksp/symbol/KSClassifierReference;Ljava/lang/Object;)Ljava/lang/Object;", "visitDeclaration", "declaration", "Lcom/google/devtools/ksp/symbol/KSDeclaration;", "(Lcom/google/devtools/ksp/symbol/KSDeclaration;Ljava/lang/Object;)Ljava/lang/Object;", "visitDeclarationContainer", "declarationContainer", "Lcom/google/devtools/ksp/symbol/KSDeclarationContainer;", "(Lcom/google/devtools/ksp/symbol/KSDeclarationContainer;Ljava/lang/Object;)Ljava/lang/Object;", "visitDefNonNullReference", "Lcom/google/devtools/ksp/symbol/KSDefNonNullReference;", "(Lcom/google/devtools/ksp/symbol/KSDefNonNullReference;Ljava/lang/Object;)Ljava/lang/Object;", "visitFunctionDeclaration", "function", "Lcom/google/devtools/ksp/symbol/KSFunctionDeclaration;", "(Lcom/google/devtools/ksp/symbol/KSFunctionDeclaration;Ljava/lang/Object;)Ljava/lang/Object;", "visitParenthesizedReference", "Lcom/google/devtools/ksp/symbol/KSParenthesizedReference;", "(Lcom/google/devtools/ksp/symbol/KSParenthesizedReference;Ljava/lang/Object;)Ljava/lang/Object;", "visitPropertyDeclaration", "property", "Lcom/google/devtools/ksp/symbol/KSPropertyDeclaration;", "(Lcom/google/devtools/ksp/symbol/KSPropertyDeclaration;Ljava/lang/Object;)Ljava/lang/Object;", "visitPropertyGetter", "getter", "Lcom/google/devtools/ksp/symbol/KSPropertyGetter;", "(Lcom/google/devtools/ksp/symbol/KSPropertyGetter;Ljava/lang/Object;)Ljava/lang/Object;", "visitPropertySetter", "setter", "Lcom/google/devtools/ksp/symbol/KSPropertySetter;", "(Lcom/google/devtools/ksp/symbol/KSPropertySetter;Ljava/lang/Object;)Ljava/lang/Object;", "visitReferenceElement", "element", "Lcom/google/devtools/ksp/symbol/KSReferenceElement;", "(Lcom/google/devtools/ksp/symbol/KSReferenceElement;Ljava/lang/Object;)Ljava/lang/Object;", "visitTypeAlias", "typeAlias", "Lcom/google/devtools/ksp/symbol/KSTypeAlias;", "(Lcom/google/devtools/ksp/symbol/KSTypeAlias;Ljava/lang/Object;)Ljava/lang/Object;", "visitTypeArgument", "typeArgument", "Lcom/google/devtools/ksp/symbol/KSTypeArgument;", "(Lcom/google/devtools/ksp/symbol/KSTypeArgument;Ljava/lang/Object;)Ljava/lang/Object;", "visitTypeParameter", "typeParameter", "Lcom/google/devtools/ksp/symbol/KSTypeParameter;", "(Lcom/google/devtools/ksp/symbol/KSTypeParameter;Ljava/lang/Object;)Ljava/lang/Object;", "visitTypeReference", "typeReference", "Lcom/google/devtools/ksp/symbol/KSTypeReference;", "(Lcom/google/devtools/ksp/symbol/KSTypeReference;Ljava/lang/Object;)Ljava/lang/Object;", "visitValueParameter", "valueParameter", "Lcom/google/devtools/ksp/symbol/KSValueParameter;", "(Lcom/google/devtools/ksp/symbol/KSValueParameter;Ljava/lang/Object;)Ljava/lang/Object;", "accept", "Lcom/google/devtools/ksp/symbol/KSNode;", "(Lcom/google/devtools/ksp/symbol/KSNode;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "(Ljava/util/List;Ljava/lang/Object;)V", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;Ljava/lang/Object;)V", "api"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKSTopDownVisitor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KSTopDownVisitor.kt\ncom/google/devtools/ksp/visitor/KSTopDownVisitor\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,139:1\n1295#2,2:140\n1855#3,2:142\n*S KotlinDebug\n*F\n+ 1 KSTopDownVisitor.kt\ncom/google/devtools/ksp/visitor/KSTopDownVisitor\n*L\n28#1:140,2\n31#1:142,2\n*E\n"})
public abstract class KSTopDownVisitor<D, R> extends KSDefaultVisitor<D, R> {
    private final void accept(List<? extends KSNode> list, D d) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((KSNode) it.next()).accept(this, d);
        }
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitAnnotated(@NotNull KSAnnotated annotated, D data) {
        Intrinsics.checkNotNullParameter(annotated, "annotated");
        accept(annotated.getAnnotations(), data);
        return (R) super.visitAnnotated(annotated, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitAnnotation(@NotNull KSAnnotation annotation, D data) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        accept(annotation.getAnnotationType(), data);
        accept(annotation.getArguments(), data);
        return (R) super.visitAnnotation(annotation, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitCallableReference(@NotNull KSCallableReference reference, D data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        accept(reference.getFunctionParameters(), data);
        KSTypeReference receiverType = reference.getReceiverType();
        if (receiverType != null) {
            accept(receiverType, data);
        }
        accept(reference.getReturnType(), data);
        return (R) super.visitCallableReference(reference, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitClassDeclaration(@NotNull KSClassDeclaration classDeclaration, D data) {
        Intrinsics.checkNotNullParameter(classDeclaration, "classDeclaration");
        accept(classDeclaration.getSuperTypes(), data);
        return (R) super.visitClassDeclaration(classDeclaration, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitClassifierReference(@NotNull KSClassifierReference reference, D data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        KSClassifierReference qualifier = reference.getQualifier();
        if (qualifier != null) {
            accept(qualifier, data);
        }
        return (R) super.visitClassifierReference(reference, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitDeclaration(@NotNull KSDeclaration declaration, D data) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        accept(declaration.getTypeParameters(), data);
        return (R) super.visitDeclaration(declaration, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitDeclarationContainer(@NotNull KSDeclarationContainer declarationContainer, D data) {
        Intrinsics.checkNotNullParameter(declarationContainer, "declarationContainer");
        accept(declarationContainer.getDeclarations(), data);
        return (R) super.visitDeclarationContainer(declarationContainer, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitDefNonNullReference(@NotNull KSDefNonNullReference reference, D data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        accept(reference.getEnclosedType(), data);
        return (R) super.visitDefNonNullReference(reference, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitFunctionDeclaration(@NotNull KSFunctionDeclaration function, D data) {
        Intrinsics.checkNotNullParameter(function, "function");
        KSTypeReference extensionReceiver = function.getExtensionReceiver();
        if (extensionReceiver != null) {
            accept(extensionReceiver, data);
        }
        accept(function.getParameters(), data);
        KSTypeReference returnType = function.getReturnType();
        if (returnType != null) {
            accept(returnType, data);
        }
        return (R) super.visitFunctionDeclaration(function, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitParenthesizedReference(@NotNull KSParenthesizedReference reference, D data) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        accept(reference.getElement(), data);
        return (R) super.visitParenthesizedReference(reference, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitPropertyDeclaration(@NotNull KSPropertyDeclaration property, D data) {
        Intrinsics.checkNotNullParameter(property, "property");
        accept(property.getType(), data);
        KSTypeReference extensionReceiver = property.getExtensionReceiver();
        if (extensionReceiver != null) {
            accept(extensionReceiver, data);
        }
        KSPropertyGetter getter = property.getGetter();
        if (getter != null) {
            accept(getter, data);
        }
        KSPropertySetter setter = property.getSetter();
        if (setter != null) {
            accept(setter, data);
        }
        return (R) super.visitPropertyDeclaration(property, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitPropertyGetter(@NotNull KSPropertyGetter getter, D data) {
        Intrinsics.checkNotNullParameter(getter, "getter");
        KSTypeReference returnType = getter.getReturnType();
        if (returnType != null) {
            accept(returnType, data);
        }
        return (R) super.visitPropertyGetter(getter, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitPropertySetter(@NotNull KSPropertySetter setter, D data) {
        Intrinsics.checkNotNullParameter(setter, "setter");
        accept(setter.getParameter(), data);
        return (R) super.visitPropertySetter(setter, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitReferenceElement(@NotNull KSReferenceElement element, D data) {
        Intrinsics.checkNotNullParameter(element, "element");
        accept(element.getTypeArguments(), data);
        return (R) super.visitReferenceElement(element, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitTypeAlias(@NotNull KSTypeAlias typeAlias, D data) {
        Intrinsics.checkNotNullParameter(typeAlias, "typeAlias");
        accept(typeAlias.getType(), data);
        return (R) super.visitTypeAlias(typeAlias, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitTypeArgument(@NotNull KSTypeArgument typeArgument, D data) {
        Intrinsics.checkNotNullParameter(typeArgument, "typeArgument");
        KSTypeReference type = typeArgument.getType();
        if (type != null) {
            accept(type, data);
        }
        return (R) super.visitTypeArgument(typeArgument, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitTypeParameter(@NotNull KSTypeParameter typeParameter, D data) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        accept(typeParameter.getBounds(), data);
        return (R) super.visitTypeParameter(typeParameter, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitTypeReference(@NotNull KSTypeReference typeReference, D data) {
        Intrinsics.checkNotNullParameter(typeReference, "typeReference");
        KSReferenceElement element = typeReference.getElement();
        if (element != null) {
            accept(element, data);
        }
        return (R) super.visitTypeReference(typeReference, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    public R visitValueParameter(@NotNull KSValueParameter valueParameter, D data) {
        Intrinsics.checkNotNullParameter(valueParameter, "valueParameter");
        KSTypeReference type = valueParameter.getType();
        if (type != null) {
            accept(type, data);
        }
        return (R) super.visitValueParameter(valueParameter, data);
    }

    private final R accept(KSNode kSNode, D d) {
        return (R) kSNode.accept(this, d);
    }

    private final void accept(Sequence<? extends KSNode> sequence, D d) {
        Iterator it = sequence.iterator();
        while (it.hasNext()) {
            ((KSNode) it.next()).accept(this, d);
        }
    }
}

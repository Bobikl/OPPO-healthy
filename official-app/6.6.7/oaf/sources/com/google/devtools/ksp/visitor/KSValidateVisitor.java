package com.google.devtools.ksp.visitor;

import com.google.devtools.ksp.symbol.KSAnnotated;
import com.google.devtools.ksp.symbol.KSAnnotation;
import com.google.devtools.ksp.symbol.KSClassDeclaration;
import com.google.devtools.ksp.symbol.KSDeclaration;
import com.google.devtools.ksp.symbol.KSDeclarationContainer;
import com.google.devtools.ksp.symbol.KSFunctionDeclaration;
import com.google.devtools.ksp.symbol.KSNode;
import com.google.devtools.ksp.symbol.KSPropertyDeclaration;
import com.google.devtools.ksp.symbol.KSType;
import com.google.devtools.ksp.symbol.KSTypeArgument;
import com.google.devtools.ksp.symbol.KSTypeParameter;
import com.google.devtools.ksp.symbol.KSTypeReference;
import com.google.devtools.ksp.symbol.KSValueArgument;
import com.google.devtools.ksp.symbol.KSValueParameter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0002J\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010!J\u001f\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010%J\u001f\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020(2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010)J\u001f\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020,2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010-J\u001f\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u0002002\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u00101J\u001f\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u0002042\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u00105J\u001f\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u0002082\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u00109R\"\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/google/devtools/ksp/visitor/KSValidateVisitor;", "Lcom/google/devtools/ksp/visitor/KSDefaultVisitor;", "Lcom/google/devtools/ksp/symbol/KSNode;", "", "predicate", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function2;)V", "defaultHandler", "node", "data", "(Lcom/google/devtools/ksp/symbol/KSNode;Lcom/google/devtools/ksp/symbol/KSNode;)Ljava/lang/Boolean;", "validateType", "type", "Lcom/google/devtools/ksp/symbol/KSType;", "visitAnnotated", "annotated", "Lcom/google/devtools/ksp/symbol/KSAnnotated;", "(Lcom/google/devtools/ksp/symbol/KSAnnotated;Lcom/google/devtools/ksp/symbol/KSNode;)Ljava/lang/Boolean;", "visitAnnotation", "annotation", "Lcom/google/devtools/ksp/symbol/KSAnnotation;", "(Lcom/google/devtools/ksp/symbol/KSAnnotation;Lcom/google/devtools/ksp/symbol/KSNode;)Ljava/lang/Boolean;", "visitClassDeclaration", "classDeclaration", "Lcom/google/devtools/ksp/symbol/KSClassDeclaration;", "(Lcom/google/devtools/ksp/symbol/KSClassDeclaration;Lcom/google/devtools/ksp/symbol/KSNode;)Ljava/lang/Boolean;", "visitDeclaration", "declaration", "Lcom/google/devtools/ksp/symbol/KSDeclaration;", "(Lcom/google/devtools/ksp/symbol/KSDeclaration;Lcom/google/devtools/ksp/symbol/KSNode;)Ljava/lang/Boolean;", "visitDeclarationContainer", "declarationContainer", "Lcom/google/devtools/ksp/symbol/KSDeclarationContainer;", "(Lcom/google/devtools/ksp/symbol/KSDeclarationContainer;Lcom/google/devtools/ksp/symbol/KSNode;)Ljava/lang/Boolean;", "visitFunctionDeclaration", "function", "Lcom/google/devtools/ksp/symbol/KSFunctionDeclaration;", "(Lcom/google/devtools/ksp/symbol/KSFunctionDeclaration;Lcom/google/devtools/ksp/symbol/KSNode;)Ljava/lang/Boolean;", "visitPropertyDeclaration", "property", "Lcom/google/devtools/ksp/symbol/KSPropertyDeclaration;", "(Lcom/google/devtools/ksp/symbol/KSPropertyDeclaration;Lcom/google/devtools/ksp/symbol/KSNode;)Ljava/lang/Boolean;", "visitTypeParameter", "typeParameter", "Lcom/google/devtools/ksp/symbol/KSTypeParameter;", "(Lcom/google/devtools/ksp/symbol/KSTypeParameter;Lcom/google/devtools/ksp/symbol/KSNode;)Ljava/lang/Boolean;", "visitTypeReference", "typeReference", "Lcom/google/devtools/ksp/symbol/KSTypeReference;", "(Lcom/google/devtools/ksp/symbol/KSTypeReference;Lcom/google/devtools/ksp/symbol/KSNode;)Ljava/lang/Boolean;", "visitValueArgument", "valueArgument", "Lcom/google/devtools/ksp/symbol/KSValueArgument;", "(Lcom/google/devtools/ksp/symbol/KSValueArgument;Lcom/google/devtools/ksp/symbol/KSNode;)Ljava/lang/Boolean;", "visitValueParameter", "valueParameter", "Lcom/google/devtools/ksp/symbol/KSValueParameter;", "(Lcom/google/devtools/ksp/symbol/KSValueParameter;Lcom/google/devtools/ksp/symbol/KSNode;)Ljava/lang/Boolean;", "api"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKSValidateVisitor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KSValidateVisitor.kt\ncom/google/devtools/ksp/visitor/KSValidateVisitor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,115:1\n1747#2,3:116\n1747#2,3:119\n1747#2,3:128\n1726#2,3:133\n1726#2,3:136\n1206#3,2:122\n1206#3,2:124\n1206#3,2:126\n1206#3,2:131\n*S KotlinDebug\n*F\n+ 1 KSValidateVisitor.kt\ncom/google/devtools/ksp/visitor/KSValidateVisitor\n*L\n9#1:116,3\n20#1:119,3\n50#1:128,3\n82#1:133,3\n105#1:136,3\n27#1:122,2\n36#1:124,2\n40#1:126,2\n64#1:131,2\n*E\n"})
public class KSValidateVisitor extends KSDefaultVisitor<KSNode, Boolean> {

    @NotNull
    private final Function2<KSNode, KSNode, Boolean> predicate;

    /* JADX WARN: Multi-variable type inference failed */
    public KSValidateVisitor(@NotNull Function2<? super KSNode, ? super KSNode, Boolean> function2) {
        Intrinsics.checkNotNullParameter(function2, "predicate");
        this.predicate = function2;
    }

    private final boolean validateType(KSType type) {
        boolean z;
        if (type.isError()) {
            return false;
        }
        List<KSTypeArgument> arguments = type.getArguments();
        if ((arguments instanceof Collection) && arguments.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = arguments.iterator();
            while (it.hasNext()) {
                KSTypeReference type2 = ((KSTypeArgument) it.next()).getType();
                if ((type2 == null || ((Boolean) type2.accept(this, null)).booleanValue()) ? false : true) {
                    z = true;
                }
            }
            z = false;
        }
        return !z;
    }

    private static final boolean visitValueArgument$visitValue(KSValidateVisitor kSValidateVisitor, KSNode kSNode, Object obj) {
        if (obj instanceof KSType) {
            return kSValidateVisitor.validateType((KSType) obj);
        }
        if (obj instanceof KSAnnotation) {
            return kSValidateVisitor.visitAnnotation((KSAnnotation) obj, kSNode).booleanValue();
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    if (!visitValueArgument$visitValue(kSValidateVisitor, kSNode, it.next())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // com.google.devtools.ksp.visitor.KSEmptyVisitor
    @NotNull
    public Boolean defaultHandler(@NotNull KSNode node, @Nullable KSNode data) {
        Intrinsics.checkNotNullParameter(node, "node");
        return Boolean.TRUE;
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    @NotNull
    public Boolean visitAnnotated(@NotNull KSAnnotated annotated, @Nullable KSNode data) {
        boolean z;
        Intrinsics.checkNotNullParameter(annotated, "annotated");
        boolean z2 = true;
        if (((Boolean) this.predicate.invoke(data, annotated)).booleanValue()) {
            Iterator it = annotated.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (!((Boolean) ((KSAnnotation) it.next()).accept(this, annotated)).booleanValue()) {
                    z = false;
                    break;
                }
            }
            if (!z) {
                z2 = false;
            }
        }
        return Boolean.valueOf(z2);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    @NotNull
    public Boolean visitAnnotation(@NotNull KSAnnotation annotation, @Nullable KSNode data) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        if (!((Boolean) this.predicate.invoke(data, annotation)).booleanValue()) {
            return Boolean.TRUE;
        }
        if (!((Boolean) annotation.getAnnotationType().accept(this, annotation)).booleanValue()) {
            return Boolean.FALSE;
        }
        List<KSValueArgument> arguments = annotation.getArguments();
        boolean z = false;
        if (!(arguments instanceof Collection) || !arguments.isEmpty()) {
            for (KSValueArgument kSValueArgument : arguments) {
                if (!((Boolean) kSValueArgument.accept(this, kSValueArgument)).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        return z ? Boolean.FALSE : Boolean.TRUE;
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    @NotNull
    public Boolean visitClassDeclaration(@NotNull KSClassDeclaration classDeclaration, @Nullable KSNode data) {
        boolean z;
        Intrinsics.checkNotNullParameter(classDeclaration, "classDeclaration");
        if (classDeclaration.asStarProjectedType().isError()) {
            return Boolean.FALSE;
        }
        Iterator it = classDeclaration.getSuperTypes().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            if (!((Boolean) ((KSTypeReference) it.next()).accept(this, classDeclaration)).booleanValue()) {
                z = false;
                break;
            }
        }
        if (!z) {
            return Boolean.FALSE;
        }
        if (visitDeclaration((KSDeclaration) classDeclaration, data).booleanValue()) {
            return !visitDeclarationContainer((KSDeclarationContainer) classDeclaration, data).booleanValue() ? Boolean.FALSE : Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    @NotNull
    public Boolean visitDeclaration(@NotNull KSDeclaration declaration, @Nullable KSNode data) {
        Intrinsics.checkNotNullParameter(declaration, "declaration");
        if (!((Boolean) this.predicate.invoke(data, declaration)).booleanValue()) {
            return Boolean.TRUE;
        }
        List<KSTypeParameter> typeParameters = declaration.getTypeParameters();
        boolean z = false;
        if (!(typeParameters instanceof Collection) || !typeParameters.isEmpty()) {
            Iterator<T> it = typeParameters.iterator();
            while (it.hasNext()) {
                if (!((Boolean) ((KSTypeParameter) it.next()).accept(this, declaration)).booleanValue()) {
                    z = true;
                    break;
                }
            }
        }
        return z ? Boolean.FALSE : visitAnnotated((KSAnnotated) declaration, data);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    @NotNull
    public Boolean visitDeclarationContainer(@NotNull KSDeclarationContainer declarationContainer, @Nullable KSNode data) {
        boolean z;
        Intrinsics.checkNotNullParameter(declarationContainer, "declarationContainer");
        Iterator it = declarationContainer.getDeclarations().iterator();
        do {
            z = true;
            if (it.hasNext()) {
                KSDeclaration kSDeclaration = (KSDeclaration) it.next();
                if (((Boolean) this.predicate.invoke(declarationContainer, kSDeclaration)).booleanValue() && !((Boolean) kSDeclaration.accept(this, declarationContainer)).booleanValue()) {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        } while (z);
        z = false;
        return Boolean.valueOf(z);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    @NotNull
    public Boolean visitFunctionDeclaration(@NotNull KSFunctionDeclaration function, @Nullable KSNode data) {
        Intrinsics.checkNotNullParameter(function, "function");
        if (function.getReturnType() != null) {
            Function2<KSNode, KSNode, Boolean> function2 = this.predicate;
            KSTypeReference returnType = function.getReturnType();
            Intrinsics.checkNotNull(returnType);
            if (((Boolean) function2.invoke(function, returnType)).booleanValue()) {
                KSTypeReference returnType2 = function.getReturnType();
                Intrinsics.checkNotNull(returnType2);
                if (!((Boolean) returnType2.accept(this, data)).booleanValue()) {
                    return Boolean.FALSE;
                }
            }
        }
        List<KSValueParameter> parameters = function.getParameters();
        boolean z = true;
        if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                if (!((Boolean) ((KSValueParameter) it.next()).accept(this, function)).booleanValue()) {
                    z = false;
                    break;
                }
            }
        }
        if (z) {
            return !visitDeclaration((KSDeclaration) function, data).booleanValue() ? Boolean.FALSE : Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    @NotNull
    public Boolean visitPropertyDeclaration(@NotNull KSPropertyDeclaration property, @Nullable KSNode data) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (!((Boolean) this.predicate.invoke(property, property.getType())).booleanValue() || ((Boolean) property.getType().accept(this, data)).booleanValue()) {
            return !visitDeclaration((KSDeclaration) property, data).booleanValue() ? Boolean.FALSE : Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    @NotNull
    public Boolean visitTypeParameter(@NotNull KSTypeParameter typeParameter, @Nullable KSNode data) {
        boolean z;
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        boolean z2 = true;
        if (((Boolean) this.predicate.invoke(data, typeParameter)).booleanValue()) {
            Iterator it = typeParameter.getBounds().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (!((Boolean) ((KSTypeReference) it.next()).accept(this, typeParameter)).booleanValue()) {
                    z = false;
                    break;
                }
            }
            if (!z) {
                z2 = false;
            }
        }
        return Boolean.valueOf(z2);
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    @NotNull
    public Boolean visitTypeReference(@NotNull KSTypeReference typeReference, @Nullable KSNode data) {
        Intrinsics.checkNotNullParameter(typeReference, "typeReference");
        return Boolean.valueOf(validateType(typeReference.resolve()));
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    @NotNull
    public Boolean visitValueArgument(@NotNull KSValueArgument valueArgument, @Nullable KSNode data) {
        Intrinsics.checkNotNullParameter(valueArgument, "valueArgument");
        return Boolean.valueOf(visitValueArgument$visitValue(this, data, valueArgument.getValue()));
    }

    @Override // com.google.devtools.ksp.visitor.KSDefaultVisitor, com.google.devtools.ksp.visitor.KSEmptyVisitor, com.google.devtools.ksp.symbol.KSVisitor
    @NotNull
    public Boolean visitValueParameter(@NotNull KSValueParameter valueParameter, @Nullable KSNode data) {
        Intrinsics.checkNotNullParameter(valueParameter, "valueParameter");
        return (Boolean) valueParameter.getType().accept(this, valueParameter);
    }
}

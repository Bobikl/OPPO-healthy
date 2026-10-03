package com.heytap.store.platform.htrouter.compiler.utils;

import com.heytap.store.platform.htrouter.facade.enums.FieldType;
import javax.lang.model.element.Element;
import javax.lang.model.type.TypeKind;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/heytap/store/platform/htrouter/compiler/utils/TypeUtils;", "", "types", "Ljavax/lang/model/util/Types;", "elements", "Ljavax/lang/model/util/Elements;", "(Ljavax/lang/model/util/Types;Ljavax/lang/model/util/Elements;)V", "parcelableType", "Ljavax/lang/model/type/TypeMirror;", "serializableType", "typeExchange", "", "element", "Ljavax/lang/model/element/Element;", "htrouter-compiler"}, k = 1, mv = {1, 1, 15})
public final class TypeUtils {
    private TypeMirror parcelableType;
    private TypeMirror serializableType;
    private Types types;

    public TypeUtils(@NotNull Types types, @NotNull Elements elements) {
        Intrinsics.checkParameterIsNotNull(types, "types");
        Intrinsics.checkParameterIsNotNull(elements, "elements");
        this.types = types;
        TypeMirror typeMirrorAsType = elements.getTypeElement(Consts.PARCELABLE).asType();
        Intrinsics.checkExpressionValueIsNotNull(typeMirrorAsType, "elements.getTypeElement(PARCELABLE).asType()");
        this.parcelableType = typeMirrorAsType;
        TypeMirror typeMirrorAsType2 = elements.getTypeElement(Consts.SERIALIZABLE).asType();
        Intrinsics.checkExpressionValueIsNotNull(typeMirrorAsType2, "elements.getTypeElement(SERIALIZABLE).asType()");
        this.serializableType = typeMirrorAsType2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final int typeExchange(@NotNull Element element) {
        Intrinsics.checkParameterIsNotNull(element, "element");
        TypeMirror typeMirror = element.asType();
        Intrinsics.checkExpressionValueIsNotNull(typeMirror, "typeMirror");
        TypeKind kind = typeMirror.getKind();
        Intrinsics.checkExpressionValueIsNotNull(kind, "typeMirror.kind");
        if (kind.isPrimitive()) {
            TypeMirror typeMirrorAsType = element.asType();
            Intrinsics.checkExpressionValueIsNotNull(typeMirrorAsType, "element.asType()");
            return typeMirrorAsType.getKind().ordinal();
        }
        String string = typeMirror.toString();
        switch (string.hashCode()) {
            case -2056817302:
                if (string.equals(Consts.INTEGER)) {
                    return FieldType.INT.ordinal();
                }
                break;
            case -527879800:
                if (string.equals(Consts.FLOAT)) {
                    return FieldType.FLOAT.ordinal();
                }
                break;
            case -515992664:
                if (string.equals(Consts.SHORT)) {
                    return FieldType.SHORT.ordinal();
                }
                break;
            case 155276373:
                if (string.equals(Consts.CHAR)) {
                    return FieldType.CHAR.ordinal();
                }
                break;
            case 344809556:
                if (string.equals(Consts.BOOLEAN)) {
                    return FieldType.BOOLEAN.ordinal();
                }
                break;
            case 398507100:
                if (string.equals(Consts.BYTE)) {
                    return FieldType.BYTE.ordinal();
                }
                break;
            case 398795216:
                if (string.equals(Consts.LONG)) {
                    return FieldType.LONG.ordinal();
                }
                break;
            case 761287205:
                if (string.equals(Consts.DOUBLE)) {
                    return FieldType.DOUBLE.ordinal();
                }
                break;
            case 1195259493:
                if (string.equals(Consts.STRING)) {
                    return FieldType.STRING.ordinal();
                }
                break;
        }
        if (this.types.isSameType(typeMirror, this.parcelableType)) {
            return FieldType.PARCELABLE.ordinal();
        }
        return this.types.isSubtype(typeMirror, this.serializableType) ? FieldType.SERIALIZABLE.ordinal() : FieldType.OBJECT.ordinal();
    }
}

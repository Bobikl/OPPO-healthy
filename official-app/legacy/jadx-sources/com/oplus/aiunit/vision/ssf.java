package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ssf {
    public abstract ssf containedType(int i);

    public abstract int containedTypeCount();

    public abstract String containedTypeName(int i);

    public abstract ssf getContentType();

    public abstract ssf getKeyType();

    @Deprecated
    public Class<?> getParameterSource() {
        return null;
    }

    public abstract Class<?> getRawClass();

    public abstract ssf getReferencedType();

    public abstract boolean hasGenericTypes();

    public abstract boolean hasRawClass(Class<?> cls);

    public abstract boolean isAbstract();

    public abstract boolean isArrayType();

    public abstract boolean isCollectionLikeType();

    public abstract boolean isConcrete();

    public abstract boolean isContainerType();

    public abstract boolean isEnumType();

    public abstract boolean isFinal();

    public abstract boolean isInterface();

    public abstract boolean isMapLikeType();

    public abstract boolean isPrimitive();

    public boolean isReferenceType() {
        return getReferencedType() != null;
    }

    public abstract boolean isThrowable();

    public abstract String toCanonical();
}

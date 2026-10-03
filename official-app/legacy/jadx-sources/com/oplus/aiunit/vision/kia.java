package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import java.beans.ConstructorProperties;
import java.beans.Transient;

/* JADX INFO: loaded from: classes13.dex */
public class kia extends jia {
    public final Class<?> b = ConstructorProperties.class;

    @Override // com.oplus.aiunit.vision.jia
    public PropertyName a(AnnotatedParameter annotatedParameter) {
        ConstructorProperties annotation;
        AnnotatedWithParams owner = annotatedParameter.getOwner();
        if (owner == null || (annotation = owner.getAnnotation(ConstructorProperties.class)) == null) {
            return null;
        }
        String[] strArrValue = annotation.value();
        int index = annotatedParameter.getIndex();
        if (index < strArrValue.length) {
            return PropertyName.construct(strArrValue[index]);
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.jia
    public Boolean b(a60 a60Var) {
        Transient annotation = a60Var.getAnnotation(Transient.class);
        if (annotation != null) {
            return Boolean.valueOf(annotation.value());
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.jia
    public Boolean c(a60 a60Var) {
        if (a60Var.getAnnotation(ConstructorProperties.class) != null) {
            return Boolean.TRUE;
        }
        return null;
    }
}

package com.oplus.aiunit.vision;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.util.Iterator;

/* JADX INFO: loaded from: classes13.dex */
public abstract class rc1 implements tec {
    public static final JsonInclude.Value i = JsonInclude.Value.empty();

    public abstract AnnotatedMethod E();

    public AnnotatedMember F() {
        AnnotatedParameter annotatedParameterO = o();
        if (annotatedParameterO != null) {
            return annotatedParameterO;
        }
        AnnotatedMethod annotatedMethodK = K();
        return annotatedMethodK == null ? r() : annotatedMethodK;
    }

    public AnnotatedMember G() {
        AnnotatedMethod annotatedMethodK = K();
        return annotatedMethodK == null ? r() : annotatedMethodK;
    }

    public abstract AnnotatedMember H();

    public abstract JavaType I();

    public abstract Class<?> J();

    public abstract AnnotatedMethod K();

    public abstract boolean L();

    public abstract boolean M();

    public boolean N(PropertyName propertyName) {
        return getFullName().equals(propertyName);
    }

    public abstract boolean O();

    public abstract boolean P();

    public boolean Q() {
        return P();
    }

    public boolean R() {
        return false;
    }

    public boolean d() {
        return F() != null;
    }

    public boolean e() {
        return n() != null;
    }

    public abstract JsonInclude.Value g();

    public abstract PropertyName getFullName();

    public abstract PropertyMetadata getMetadata();

    @Override // com.oplus.aiunit.vision.tec
    public abstract String getName();

    public abstract PropertyName getWrapperName();

    public cbd h() {
        return null;
    }

    public String i() {
        AnnotationIntrospector.ReferenceProperty referencePropertyL = l();
        if (referencePropertyL == null) {
            return null;
        }
        return referencePropertyL.b();
    }

    public AnnotationIntrospector.ReferenceProperty l() {
        return null;
    }

    public Class<?>[] m() {
        return null;
    }

    public AnnotatedMember n() {
        AnnotatedMethod annotatedMethodE = E();
        return annotatedMethodE == null ? r() : annotatedMethodE;
    }

    public abstract AnnotatedParameter o();

    public Iterator<AnnotatedParameter> p() {
        return nc3.n();
    }

    public abstract AnnotatedField r();
}

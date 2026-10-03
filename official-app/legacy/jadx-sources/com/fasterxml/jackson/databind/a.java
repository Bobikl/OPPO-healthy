package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.oplus.aiunit.vision.fug;
import com.oplus.aiunit.vision.fuk;
import com.oplus.aiunit.vision.k95;
import com.oplus.aiunit.vision.qc1;
import com.oplus.aiunit.vision.uc1;
import com.oplus.aiunit.vision.y6;
import com.oplus.aiunit.vision.zna;
import java.util.Collections;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.a$a, reason: collision with other inner class name */
    public interface InterfaceC0212a {
        void a(y6 y6Var);

        void b(fug fugVar);

        void c(zna znaVar);

        void d(k95 k95Var);

        void e(fug fugVar);

        void f(fuk fukVar);

        void g(NamedType... namedTypeArr);

        void h(Class<?> cls, Class<?> cls2);

        void i(qc1 qc1Var);

        void j(PropertyNamingStrategy propertyNamingStrategy);

        void k(uc1 uc1Var);
    }

    public Iterable<? extends a> getDependencies() {
        return Collections.emptyList();
    }

    public abstract String getModuleName();

    public Object getTypeId() {
        return getClass().getName();
    }

    public abstract void setupModule(InterfaceC0212a interfaceC0212a);

    public abstract Version version();
}

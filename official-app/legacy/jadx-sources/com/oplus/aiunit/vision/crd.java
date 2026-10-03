package com.oplus.aiunit.vision;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: loaded from: classes11.dex */
@IgnoreJRERequirement
public final class crd extends ma4.a {
    public static final ma4.a a = new crd();

    @IgnoreJRERequirement
    public static final class a<T> implements ma4<cuf, Optional<T>> {
        public final ma4<cuf, T> a;

        public a(ma4<cuf, T> ma4Var) {
            this.a = ma4Var;
        }

        @Override // com.oplus.aiunit.vision.ma4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Optional<T> convert(cuf cufVar) throws IOException {
            return Optional.ofNullable(this.a.convert(cufVar));
        }
    }

    @Override // com.oplus.aiunit.vision.ma4.a
    @Nullable
    public ma4<cuf, ?> responseBodyConverter(Type type, Annotation[] annotationArr, evf evfVar) {
        if (ma4.a.getRawType(type) != Optional.class) {
            return null;
        }
        return new a(evfVar.h(ma4.a.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }
}

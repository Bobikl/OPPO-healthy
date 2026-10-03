package com.oplus.aiunit.vision;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p010kotlin.Unit;
import retrofit2.Utils;

/* JADX INFO: loaded from: classes11.dex */
public final class n82 extends ma4.a {
    public boolean a = true;

    public static final class a implements ma4<cuf, cuf> {
        public static final a a = new a();

        @Override // com.oplus.aiunit.vision.ma4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public cuf convert(cuf cufVar) throws IOException {
            try {
                return Utils.a(cufVar);
            } finally {
                cufVar.close();
            }
        }
    }

    public static final class b implements ma4<gqf, gqf> {
        public static final b a = new b();

        @Override // com.oplus.aiunit.vision.ma4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public gqf convert(gqf gqfVar) {
            return gqfVar;
        }
    }

    public static final class c implements ma4<cuf, cuf> {
        public static final c a = new c();

        @Override // com.oplus.aiunit.vision.ma4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public cuf convert(cuf cufVar) {
            return cufVar;
        }
    }

    public static final class d implements ma4<Object, String> {
        public static final d a = new d();

        @Override // com.oplus.aiunit.vision.ma4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    public static final class e implements ma4<cuf, Unit> {
        public static final e a = new e();

        @Override // com.oplus.aiunit.vision.ma4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit convert(cuf cufVar) {
            cufVar.close();
            return Unit.INSTANCE;
        }
    }

    public static final class f implements ma4<cuf, Void> {
        public static final f a = new f();

        @Override // com.oplus.aiunit.vision.ma4
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void convert(cuf cufVar) {
            cufVar.close();
            return null;
        }
    }

    @Override // com.oplus.aiunit.vision.ma4.a
    @Nullable
    public ma4<?, gqf> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, evf evfVar) {
        if (gqf.class.isAssignableFrom(Utils.h(type))) {
            return b.a;
        }
        return null;
    }

    @Override // com.oplus.aiunit.vision.ma4.a
    @Nullable
    public ma4<cuf, ?> responseBodyConverter(Type type, Annotation[] annotationArr, evf evfVar) {
        if (type == cuf.class) {
            return Utils.l(annotationArr, owi.class) ? c.a : a.a;
        }
        if (type == Void.class) {
            return f.a;
        }
        if (!this.a || type != Unit.class) {
            return null;
        }
        try {
            return e.a;
        } catch (NoClassDefFoundError unused) {
            this.a = false;
            return null;
        }
    }
}

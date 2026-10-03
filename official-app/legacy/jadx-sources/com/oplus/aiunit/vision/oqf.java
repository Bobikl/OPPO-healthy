package com.oplus.aiunit.vision;

import com.liulishuo.okdownload.core.Util;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.MediaType;
import okhttp3.Request;
import p010kotlin.coroutines.Continuation;
import retrofit2.Utils;

/* JADX INFO: loaded from: classes11.dex */
public final class oqf {
    public final Method a;
    public final uk9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15022c;

    @Nullable
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final gj8 f15023e;

    @Nullable
    public final MediaType f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p7e<?>[] f15024j;
    public final boolean k;

    public static final class a {
        public static final Pattern x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        public static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        public final evf a;
        public final Method b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Annotation[] f15025c;
        public final Annotation[][] d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Type[] f15026e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f15027j;
        public boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f15028l;
        public boolean m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @Nullable
        public String f15029n;
        public boolean o;
        public boolean p;
        public boolean q;

        @Nullable
        public String r;

        @Nullable
        public gj8 s;

        @Nullable
        public MediaType t;

        @Nullable
        public Set<String> u;

        @Nullable
        public p7e<?>[] v;
        public boolean w;

        public a(evf evfVar, Method method) {
            this.a = evfVar;
            this.b = method;
            this.f15025c = method.getAnnotations();
            this.f15026e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        public static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }

        public static Set<String> h(String str) {
            Matcher matcher = x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        public oqf b() {
            for (Annotation annotation : this.f15025c) {
                e(annotation);
            }
            if (this.f15029n == null) {
                throw Utils.m(this.b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.o) {
                if (this.q) {
                    throw Utils.m(this.b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.p) {
                    throw Utils.m(this.b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.d.length;
            this.v = new p7e[length];
            int i = length - 1;
            int i2 = 0;
            while (i2 < length) {
                this.v[i2] = f(i2, this.f15026e[i2], this.d[i2], i2 == i);
                i2++;
            }
            if (this.r == null && !this.m) {
                throw Utils.m(this.b, "Missing either @%s URL or @Url parameter.", this.f15029n);
            }
            boolean z = this.p;
            if (!z && !this.q && !this.o && this.h) {
                throw Utils.m(this.b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z && !this.f) {
                throw Utils.m(this.b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.q || this.g) {
                return new oqf(this);
            }
            throw Utils.m(this.b, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        public final gj8 c(String[] strArr) {
            gj8.a aVar = new gj8.a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw Utils.m(this.b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.t = MediaType.get(strTrim);
                    } catch (IllegalArgumentException e2) {
                        throw Utils.n(this.b, e2, "Malformed content type: %s", strTrim);
                    }
                } else {
                    aVar.b(strSubstring, strTrim);
                }
            }
            return aVar.g();
        }

        public final void d(String str, String str2, boolean z) {
            String str3 = this.f15029n;
            if (str3 != null) {
                throw Utils.m(this.b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f15029n = str;
            this.o = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (x.matcher(strSubstring).find()) {
                    throw Utils.m(this.b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.r = str2;
            this.u = h(str2);
        }

        public final void e(Annotation annotation) {
            if (annotation instanceof hj4) {
                d("DELETE", ((hj4) annotation).value(), false);
                return;
            }
            if (annotation instanceof g18) {
                d("GET", ((g18) annotation).value(), false);
                return;
            }
            if (annotation instanceof ee8) {
                d("HEAD", ((ee8) annotation).value(), false);
                return;
            }
            if (annotation instanceof y0e) {
                d("PATCH", ((y0e) annotation).value(), true);
                return;
            }
            if (annotation instanceof m1e) {
                d("POST", ((m1e) annotation).value(), true);
                return;
            }
            if (annotation instanceof p1e) {
                d("PUT", ((p1e) annotation).value(), true);
                return;
            }
            if (annotation instanceof t3d) {
                d("OPTIONS", ((t3d) annotation).value(), false);
                return;
            }
            if (annotation instanceof uf8) {
                uf8 uf8Var = (uf8) annotation;
                d(uf8Var.method(), uf8Var.path(), uf8Var.hasBody());
                return;
            }
            if (annotation instanceof hj8) {
                String[] strArrValue = ((hj8) annotation).value();
                if (strArrValue.length == 0) {
                    throw Utils.m(this.b, "@Headers annotation is empty.", new Object[0]);
                }
                this.s = c(strArrValue);
                return;
            }
            if (annotation instanceof m8c) {
                if (this.p) {
                    throw Utils.m(this.b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.q = true;
            } else if (annotation instanceof dx7) {
                if (this.q) {
                    throw Utils.m(this.b, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.p = true;
            }
        }

        @Nullable
        public final p7e<?> f(int i, Type type, @Nullable Annotation[] annotationArr, boolean z) {
            p7e<?> p7eVar;
            if (annotationArr != null) {
                p7eVar = null;
                for (Annotation annotation : annotationArr) {
                    p7e<?> p7eVarG = g(i, type, annotationArr, annotation);
                    if (p7eVarG != null) {
                        if (p7eVar != null) {
                            throw Utils.o(this.b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        p7eVar = p7eVarG;
                    }
                }
            } else {
                p7eVar = null;
            }
            if (p7eVar != null) {
                return p7eVar;
            }
            if (z) {
                try {
                    if (Utils.h(type) == Continuation.class) {
                        this.w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw Utils.o(this.b, i, "No Retrofit annotation found.", new Object[0]);
        }

        @Nullable
        public final p7e<?> g(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof dmk) {
                j(i, type);
                if (this.m) {
                    throw Utils.o(this.b, i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.i) {
                    throw Utils.o(this.b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f15027j) {
                    throw Utils.o(this.b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.k) {
                    throw Utils.o(this.b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f15028l) {
                    throw Utils.o(this.b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.r != null) {
                    throw Utils.o(this.b, i, "@Url cannot be used with @%s URL", this.f15029n);
                }
                this.m = true;
                if (type == uk9.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new p7e.p(this.b, i);
                }
                throw Utils.o(this.b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof h9e) {
                j(i, type);
                if (this.f15027j) {
                    throw Utils.o(this.b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.k) {
                    throw Utils.o(this.b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f15028l) {
                    throw Utils.o(this.b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.m) {
                    throw Utils.o(this.b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.r == null) {
                    throw Utils.o(this.b, i, "@Path can only be used with relative url on @%s", this.f15029n);
                }
                this.i = true;
                h9e h9eVar = (h9e) annotation;
                String strValue = h9eVar.value();
                i(i, strValue);
                return new p7e.k(this.b, i, strValue, this.a.i(type, annotationArr), h9eVar.encoded());
            }
            if (annotation instanceof g5f) {
                j(i, type);
                g5f g5fVar = (g5f) annotation;
                String strValue2 = g5fVar.value();
                boolean zEncoded = g5fVar.encoded();
                Class<?> clsH = Utils.h(type);
                this.f15027j = true;
                if (!Iterable.class.isAssignableFrom(clsH)) {
                    if (!clsH.isArray()) {
                        return new p7e.l(strValue2, this.a.i(type, annotationArr), zEncoded);
                    }
                    return new p7e.l(strValue2, this.a.i(a(clsH.getComponentType()), annotationArr), zEncoded).b();
                }
                if (type instanceof ParameterizedType) {
                    return new p7e.l(strValue2, this.a.i(Utils.g(0, (ParameterizedType) type), annotationArr), zEncoded).c();
                }
                throw Utils.o(this.b, i, clsH.getSimpleName() + " must include generic type (e.g., " + clsH.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof i6f) {
                j(i, type);
                boolean zEncoded2 = ((i6f) annotation).encoded();
                Class<?> clsH2 = Utils.h(type);
                this.k = true;
                if (!Iterable.class.isAssignableFrom(clsH2)) {
                    if (!clsH2.isArray()) {
                        return new p7e.n(this.a.i(type, annotationArr), zEncoded2);
                    }
                    return new p7e.n(this.a.i(a(clsH2.getComponentType()), annotationArr), zEncoded2).b();
                }
                if (type instanceof ParameterizedType) {
                    return new p7e.n(this.a.i(Utils.g(0, (ParameterizedType) type), annotationArr), zEncoded2).c();
                }
                throw Utils.o(this.b, i, clsH2.getSimpleName() + " must include generic type (e.g., " + clsH2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof h6f) {
                j(i, type);
                Class<?> clsH3 = Utils.h(type);
                this.f15028l = true;
                if (!Map.class.isAssignableFrom(clsH3)) {
                    throw Utils.o(this.b, i, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeI = Utils.i(type, clsH3, Map.class);
                if (!(typeI instanceof ParameterizedType)) {
                    throw Utils.o(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeI;
                Type typeG = Utils.g(0, parameterizedType);
                if (String.class == typeG) {
                    return new p7e.m(this.b, i, this.a.i(Utils.g(1, parameterizedType), annotationArr), ((h6f) annotation).encoded());
                }
                throw Utils.o(this.b, i, "@QueryMap keys must be of type String: " + typeG, new Object[0]);
            }
            if (annotation instanceof yh8) {
                j(i, type);
                String strValue3 = ((yh8) annotation).value();
                Class<?> clsH4 = Utils.h(type);
                if (!Iterable.class.isAssignableFrom(clsH4)) {
                    if (!clsH4.isArray()) {
                        return new p7e.f(strValue3, this.a.i(type, annotationArr));
                    }
                    return new p7e.f(strValue3, this.a.i(a(clsH4.getComponentType()), annotationArr)).b();
                }
                if (type instanceof ParameterizedType) {
                    return new p7e.f(strValue3, this.a.i(Utils.g(0, (ParameterizedType) type), annotationArr)).c();
                }
                throw Utils.o(this.b, i, clsH4.getSimpleName() + " must include generic type (e.g., " + clsH4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof oi8) {
                if (type == gj8.class) {
                    return new p7e.h(this.b, i);
                }
                j(i, type);
                Class<?> clsH5 = Utils.h(type);
                if (!Map.class.isAssignableFrom(clsH5)) {
                    throw Utils.o(this.b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type typeI2 = Utils.i(type, clsH5, Map.class);
                if (!(typeI2 instanceof ParameterizedType)) {
                    throw Utils.o(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeI2;
                Type typeG2 = Utils.g(0, parameterizedType2);
                if (String.class == typeG2) {
                    return new p7e.g(this.b, i, this.a.i(Utils.g(1, parameterizedType2), annotationArr));
                }
                throw Utils.o(this.b, i, "@HeaderMap keys must be of type String: " + typeG2, new Object[0]);
            }
            if (annotation instanceof x97) {
                j(i, type);
                if (!this.p) {
                    throw Utils.o(this.b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                x97 x97Var = (x97) annotation;
                String strValue4 = x97Var.value();
                boolean zEncoded3 = x97Var.encoded();
                this.f = true;
                Class<?> clsH6 = Utils.h(type);
                if (!Iterable.class.isAssignableFrom(clsH6)) {
                    if (!clsH6.isArray()) {
                        return new p7e.d(strValue4, this.a.i(type, annotationArr), zEncoded3);
                    }
                    return new p7e.d(strValue4, this.a.i(a(clsH6.getComponentType()), annotationArr), zEncoded3).b();
                }
                if (type instanceof ParameterizedType) {
                    return new p7e.d(strValue4, this.a.i(Utils.g(0, (ParameterizedType) type), annotationArr), zEncoded3).c();
                }
                throw Utils.o(this.b, i, clsH6.getSimpleName() + " must include generic type (e.g., " + clsH6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof ia7) {
                j(i, type);
                if (!this.p) {
                    throw Utils.o(this.b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> clsH7 = Utils.h(type);
                if (!Map.class.isAssignableFrom(clsH7)) {
                    throw Utils.o(this.b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeI3 = Utils.i(type, clsH7, Map.class);
                if (!(typeI3 instanceof ParameterizedType)) {
                    throw Utils.o(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeI3;
                Type typeG3 = Utils.g(0, parameterizedType3);
                if (String.class == typeG3) {
                    ma4 ma4VarI = this.a.i(Utils.g(1, parameterizedType3), annotationArr);
                    this.f = true;
                    return new p7e.e(this.b, i, ma4VarI, ((ia7) annotation).encoded());
                }
                throw Utils.o(this.b, i, "@FieldMap keys must be of type String: " + typeG3, new Object[0]);
            }
            if (!(annotation instanceof n8e)) {
                if (annotation instanceof o8e) {
                    j(i, type);
                    if (!this.q) {
                        throw Utils.o(this.b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.g = true;
                    Class<?> clsH8 = Utils.h(type);
                    if (!Map.class.isAssignableFrom(clsH8)) {
                        throw Utils.o(this.b, i, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type typeI4 = Utils.i(type, clsH8, Map.class);
                    if (!(typeI4 instanceof ParameterizedType)) {
                        throw Utils.o(this.b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) typeI4;
                    Type typeG4 = Utils.g(0, parameterizedType4);
                    if (String.class == typeG4) {
                        Type typeG5 = Utils.g(1, parameterizedType4);
                        if (o8c.c.class.isAssignableFrom(Utils.h(typeG5))) {
                            throw Utils.o(this.b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                        }
                        return new p7e.j(this.b, i, this.a.g(typeG5, annotationArr, this.f15025c), ((o8e) annotation).encoding());
                    }
                    throw Utils.o(this.b, i, "@PartMap keys must be of type String: " + typeG4, new Object[0]);
                }
                if (annotation instanceof av1) {
                    j(i, type);
                    if (this.p || this.q) {
                        throw Utils.o(this.b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.h) {
                        throw Utils.o(this.b, i, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        ma4 ma4VarG = this.a.g(type, annotationArr, this.f15025c);
                        this.h = true;
                        return new p7e.c(this.b, i, ma4VarG);
                    } catch (RuntimeException e2) {
                        throw Utils.p(this.b, e2, i, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof dnj)) {
                    return null;
                }
                j(i, type);
                Class<?> clsH9 = Utils.h(type);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    p7e<?> p7eVar = this.v[i2];
                    if ((p7eVar instanceof p7e.q) && ((p7e.q) p7eVar).a.equals(clsH9)) {
                        throw Utils.o(this.b, i, "@Tag type " + clsH9.getName() + " is duplicate of parameter #" + (i2 + 1) + " and would always overwrite its value.", new Object[0]);
                    }
                }
                return new p7e.q(clsH9);
            }
            j(i, type);
            if (!this.q) {
                throw Utils.o(this.b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            n8e n8eVar = (n8e) annotation;
            this.g = true;
            String strValue5 = n8eVar.value();
            Class<?> clsH10 = Utils.h(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(clsH10)) {
                    if (clsH10.isArray()) {
                        if (o8c.c.class.isAssignableFrom(clsH10.getComponentType())) {
                            return p7e.o.a.b();
                        }
                        throw Utils.o(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (o8c.c.class.isAssignableFrom(clsH10)) {
                        return p7e.o.a;
                    }
                    throw Utils.o(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (o8c.c.class.isAssignableFrom(Utils.h(Utils.g(0, (ParameterizedType) type)))) {
                        return p7e.o.a.c();
                    }
                    throw Utils.o(this.b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw Utils.o(this.b, i, clsH10.getSimpleName() + " must include generic type (e.g., " + clsH10.getSimpleName() + "<String>)", new Object[0]);
            }
            gj8 gj8VarF = gj8.f(Util.CONTENT_DISPOSITION, "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", n8eVar.encoding());
            if (!Iterable.class.isAssignableFrom(clsH10)) {
                if (!clsH10.isArray()) {
                    if (o8c.c.class.isAssignableFrom(clsH10)) {
                        throw Utils.o(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new p7e.i(this.b, i, gj8VarF, this.a.g(type, annotationArr, this.f15025c));
                }
                Class<?> clsA = a(clsH10.getComponentType());
                if (o8c.c.class.isAssignableFrom(clsA)) {
                    throw Utils.o(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new p7e.i(this.b, i, gj8VarF, this.a.g(clsA, annotationArr, this.f15025c)).b();
            }
            if (type instanceof ParameterizedType) {
                Type typeG6 = Utils.g(0, (ParameterizedType) type);
                if (o8c.c.class.isAssignableFrom(Utils.h(typeG6))) {
                    throw Utils.o(this.b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new p7e.i(this.b, i, gj8VarF, this.a.g(typeG6, annotationArr, this.f15025c)).c();
            }
            throw Utils.o(this.b, i, clsH10.getSimpleName() + " must include generic type (e.g., " + clsH10.getSimpleName() + "<String>)", new Object[0]);
        }

        public final void i(int i, String str) {
            if (!y.matcher(str).matches()) {
                throw Utils.o(this.b, i, "@Path parameter name must match %s. Found: %s", x.pattern(), str);
            }
            if (!this.u.contains(str)) {
                throw Utils.o(this.b, i, "URL \"%s\" does not contain \"{%s}\".", this.r, str);
            }
        }

        public final void j(int i, Type type) {
            if (Utils.j(type)) {
                throw Utils.o(this.b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public oqf(a aVar) {
        this.a = aVar.b;
        this.b = aVar.a.f11092c;
        this.f15022c = aVar.f15029n;
        this.d = aVar.r;
        this.f15023e = aVar.s;
        this.f = aVar.t;
        this.g = aVar.o;
        this.h = aVar.p;
        this.i = aVar.q;
        this.f15024j = aVar.v;
        this.k = aVar.w;
    }

    public static oqf b(evf evfVar, Method method) {
        return new a(evfVar, method).b();
    }

    public Request a(Object[] objArr) throws IOException {
        p7e<?>[] p7eVarArr = this.f15024j;
        int length = objArr.length;
        if (length != p7eVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + p7eVarArr.length + ")");
        }
        iqf iqfVar = new iqf(this.f15022c, this.b, this.d, this.f15023e, this.f, this.g, this.h, this.i);
        if (this.k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            p7eVarArr[i].a(iqfVar, objArr[i]);
        }
        return iqfVar.k().tag(ega.class, new ega(this.a, arrayList)).build();
    }
}

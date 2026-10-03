package com.oplus.aiunit.vision;

import com.liulishuo.okdownload.core.Util;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import retrofit2.Utils;

/* JADX INFO: loaded from: classes11.dex */
public abstract class p7e<T> {

    public class a extends p7e<Iterable<T>> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.p7e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(iqf iqfVar, @Nullable Iterable<T> iterable) throws IOException {
            if (iterable == null) {
                return;
            }
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                p7e.this.a(iqfVar, it.next());
            }
        }
    }

    public class b extends p7e<Object> {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.oplus.aiunit.vision.p7e
        public void a(iqf iqfVar, @Nullable Object obj) throws IOException {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                p7e.this.a(iqfVar, Array.get(obj, i));
            }
        }
    }

    public static final class c<T> extends p7e<T> {
        public final Method a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ma4<T, gqf> f15237c;

        public c(Method method, int i, ma4<T, gqf> ma4Var) {
            this.a = method;
            this.b = i;
            this.f15237c = ma4Var;
        }

        @Override // com.oplus.aiunit.vision.p7e
        public void a(iqf iqfVar, @Nullable T t) {
            if (t == null) {
                throw Utils.o(this.a, this.b, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                iqfVar.l(this.f15237c.convert(t));
            } catch (IOException e2) {
                throw Utils.p(this.a, e2, this.b, "Unable to convert " + t + " to RequestBody", new Object[0]);
            }
        }
    }

    public static final class d<T> extends p7e<T> {
        public final String a;
        public final ma4<T, String> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f15238c;

        public d(String str, ma4<T, String> ma4Var, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = ma4Var;
            this.f15238c = z;
        }

        @Override // com.oplus.aiunit.vision.p7e
        public void a(iqf iqfVar, @Nullable T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.b.convert(t)) == null) {
                return;
            }
            iqfVar.a(this.a, strConvert, this.f15238c);
        }
    }

    public static final class e<T> extends p7e<Map<String, T>> {
        public final Method a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ma4<T, String> f15239c;
        public final boolean d;

        public e(Method method, int i, ma4<T, String> ma4Var, boolean z) {
            this.a = method;
            this.b = i;
            this.f15239c = ma4Var;
            this.d = z;
        }

        @Override // com.oplus.aiunit.vision.p7e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(iqf iqfVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.o(this.a, this.b, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.o(this.a, this.b, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.o(this.a, this.b, "Field map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.f15239c.convert(value);
                if (strConvert == null) {
                    throw Utils.o(this.a, this.b, "Field map value '" + value + "' converted to null by " + this.f15239c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                iqfVar.a(key, strConvert, this.d);
            }
        }
    }

    public static final class f<T> extends p7e<T> {
        public final String a;
        public final ma4<T, String> b;

        public f(String str, ma4<T, String> ma4Var) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = ma4Var;
        }

        @Override // com.oplus.aiunit.vision.p7e
        public void a(iqf iqfVar, @Nullable T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.b.convert(t)) == null) {
                return;
            }
            iqfVar.b(this.a, strConvert);
        }
    }

    public static final class g<T> extends p7e<Map<String, T>> {
        public final Method a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ma4<T, String> f15240c;

        public g(Method method, int i, ma4<T, String> ma4Var) {
            this.a = method;
            this.b = i;
            this.f15240c = ma4Var;
        }

        @Override // com.oplus.aiunit.vision.p7e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(iqf iqfVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.o(this.a, this.b, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.o(this.a, this.b, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.o(this.a, this.b, "Header map contained null value for key '" + key + "'.", new Object[0]);
                }
                iqfVar.b(key, this.f15240c.convert(value));
            }
        }
    }

    public static final class h extends p7e<gj8> {
        public final Method a;
        public final int b;

        public h(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        @Override // com.oplus.aiunit.vision.p7e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(iqf iqfVar, @Nullable gj8 gj8Var) {
            if (gj8Var == null) {
                throw Utils.o(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
            }
            iqfVar.c(gj8Var);
        }
    }

    public static final class i<T> extends p7e<T> {
        public final Method a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final gj8 f15241c;
        public final ma4<T, gqf> d;

        public i(Method method, int i, gj8 gj8Var, ma4<T, gqf> ma4Var) {
            this.a = method;
            this.b = i;
            this.f15241c = gj8Var;
            this.d = ma4Var;
        }

        @Override // com.oplus.aiunit.vision.p7e
        public void a(iqf iqfVar, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                iqfVar.d(this.f15241c, this.d.convert(t));
            } catch (IOException e2) {
                throw Utils.o(this.a, this.b, "Unable to convert " + t + " to RequestBody", e2);
            }
        }
    }

    public static final class j<T> extends p7e<Map<String, T>> {
        public final Method a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ma4<T, gqf> f15242c;
        public final String d;

        public j(Method method, int i, ma4<T, gqf> ma4Var, String str) {
            this.a = method;
            this.b = i;
            this.f15242c = ma4Var;
            this.d = str;
        }

        @Override // com.oplus.aiunit.vision.p7e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(iqf iqfVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.o(this.a, this.b, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.o(this.a, this.b, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.o(this.a, this.b, "Part map contained null value for key '" + key + "'.", new Object[0]);
                }
                iqfVar.d(gj8.f(Util.CONTENT_DISPOSITION, "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.d), this.f15242c.convert(value));
            }
        }
    }

    public static final class k<T> extends p7e<T> {
        public final Method a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f15243c;
        public final ma4<T, String> d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f15244e;

        public k(Method method, int i, String str, ma4<T, String> ma4Var, boolean z) {
            this.a = method;
            this.b = i;
            Objects.requireNonNull(str, "name == null");
            this.f15243c = str;
            this.d = ma4Var;
            this.f15244e = z;
        }

        @Override // com.oplus.aiunit.vision.p7e
        public void a(iqf iqfVar, @Nullable T t) throws IOException {
            if (t != null) {
                iqfVar.f(this.f15243c, this.d.convert(t), this.f15244e);
                return;
            }
            throw Utils.o(this.a, this.b, "Path parameter \"" + this.f15243c + "\" value must not be null.", new Object[0]);
        }
    }

    public static final class l<T> extends p7e<T> {
        public final String a;
        public final ma4<T, String> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f15245c;

        public l(String str, ma4<T, String> ma4Var, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = ma4Var;
            this.f15245c = z;
        }

        @Override // com.oplus.aiunit.vision.p7e
        public void a(iqf iqfVar, @Nullable T t) throws IOException {
            String strConvert;
            if (t == null || (strConvert = this.b.convert(t)) == null) {
                return;
            }
            iqfVar.g(this.a, strConvert, this.f15245c);
        }
    }

    public static final class m<T> extends p7e<Map<String, T>> {
        public final Method a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ma4<T, String> f15246c;
        public final boolean d;

        public m(Method method, int i, ma4<T, String> ma4Var, boolean z) {
            this.a = method;
            this.b = i;
            this.f15246c = ma4Var;
            this.d = z;
        }

        @Override // com.oplus.aiunit.vision.p7e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(iqf iqfVar, @Nullable Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.o(this.a, this.b, "Query map was null", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.o(this.a, this.b, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.o(this.a, this.b, "Query map contained null value for key '" + key + "'.", new Object[0]);
                }
                String strConvert = this.f15246c.convert(value);
                if (strConvert == null) {
                    throw Utils.o(this.a, this.b, "Query map value '" + value + "' converted to null by " + this.f15246c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                iqfVar.g(key, strConvert, this.d);
            }
        }
    }

    public static final class n<T> extends p7e<T> {
        public final ma4<T, String> a;
        public final boolean b;

        public n(ma4<T, String> ma4Var, boolean z) {
            this.a = ma4Var;
            this.b = z;
        }

        @Override // com.oplus.aiunit.vision.p7e
        public void a(iqf iqfVar, @Nullable T t) throws IOException {
            if (t == null) {
                return;
            }
            iqfVar.g(this.a.convert(t), null, this.b);
        }
    }

    public static final class o extends p7e<o8c.c> {
        public static final o a = new o();

        @Override // com.oplus.aiunit.vision.p7e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(iqf iqfVar, @Nullable o8c.c cVar) {
            if (cVar != null) {
                iqfVar.e(cVar);
            }
        }
    }

    public static final class p extends p7e<Object> {
        public final Method a;
        public final int b;

        public p(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        @Override // com.oplus.aiunit.vision.p7e
        public void a(iqf iqfVar, @Nullable Object obj) {
            if (obj == null) {
                throw Utils.o(this.a, this.b, "@Url parameter is null.", new Object[0]);
            }
            iqfVar.m(obj);
        }
    }

    public static final class q<T> extends p7e<T> {
        public final Class<T> a;

        public q(Class<T> cls) {
            this.a = cls;
        }

        @Override // com.oplus.aiunit.vision.p7e
        public void a(iqf iqfVar, @Nullable T t) {
            iqfVar.h(this.a, t);
        }
    }

    public abstract void a(iqf iqfVar, @Nullable T t) throws IOException;

    public final p7e<Object> b() {
        return new b();
    }

    public final p7e<Iterable<T>> c() {
        return new a();
    }
}

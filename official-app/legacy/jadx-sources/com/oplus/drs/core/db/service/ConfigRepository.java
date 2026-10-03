package com.oplus.drs.core.db.service;

import com.oplus.aiunit.vision.ac0;
import com.oplus.aiunit.vision.bi8;
import com.oplus.aiunit.vision.bt6;
import com.oplus.aiunit.vision.cf9;
import com.oplus.aiunit.vision.df9;
import com.oplus.aiunit.vision.u56;
import com.oplus.aiunit.vision.zb0;
import com.oplus.aiunit.vision.zs6;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class ConfigRepository {
    public final bt6 a;
    public final df9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bi8 f19722c;
    public final ac0 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, zs6> f19723e = new LinkedHashMap<String, zs6>(16, 0.75f, true) { // from class: com.oplus.drs.core.db.service.ConfigRepository.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, zs6> entry) {
            return size() > 100;
        }
    };
    public final Map<String, Object> f = new ConcurrentHashMap();
    public final ConcurrentHashMap<String, zb0> g = new ConcurrentHashMap<>();

    public class a implements Callable<Integer> {
        public final /* synthetic */ List i;

        public a(List list) {
            this.i = list;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer call() {
            return Integer.valueOf(ConfigRepository.this.b.a(this.i));
        }
    }

    public class b implements Callable<Void> {
        public final /* synthetic */ zb0 i;

        public b(zb0 zb0Var) {
            this.i = zb0Var;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            ConfigRepository.this.d.a(this.i);
            return null;
        }
    }

    public class c implements Callable<String> {
        public c() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            return ConfigRepository.this.f19722c.a();
        }
    }

    public class d implements Callable<String> {
        public final /* synthetic */ long i;

        public d(long j2) {
            this.i = j2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            return ConfigRepository.this.f19722c.b(this.i);
        }
    }

    public class e implements Callable<cf9> {
        public final /* synthetic */ String i;

        public e(String str) {
            this.i = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public cf9 call() {
            return ConfigRepository.this.b.b(this.i);
        }
    }

    public class f implements Callable<List<cf9>> {
        public final /* synthetic */ String i;

        public f(String str) {
            this.i = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<cf9> call() {
            return ConfigRepository.this.b.d(this.i);
        }
    }

    public class g implements Callable<cf9> {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f19729j;

        public g(String str, String str2) {
            this.i = str;
            this.f19729j = str2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public cf9 call() {
            return ConfigRepository.this.b.c(this.i, this.f19729j);
        }
    }

    public class h implements Callable<zb0> {
        public final /* synthetic */ String i;

        public h(String str) {
            this.i = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public zb0 call() {
            return ConfigRepository.this.d.get(this.i);
        }
    }

    public class i implements Callable<List<zs6>> {
        public final /* synthetic */ String i;

        public i(String str) {
            this.i = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<zs6> call() {
            return ConfigRepository.this.a.f(this.i);
        }
    }

    public class j implements Callable<Boolean> {
        public final /* synthetic */ String i;

        public j(String str) {
            this.i = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(ConfigRepository.this.a.e(this.i));
        }
    }

    public class k implements Callable<List<zs6>> {
        public final /* synthetic */ List i;

        public k(List list) {
            this.i = list;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<zs6> call() {
            return ConfigRepository.this.a.a(this.i);
        }
    }

    public class l implements Callable<Map<String, Integer>> {
        public l() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<String, Integer> call() {
            return ConfigRepository.this.a.c();
        }
    }

    public ConfigRepository(bt6 bt6Var, df9 df9Var, bi8 bi8Var, ac0 ac0Var) {
        this.a = bt6Var;
        this.b = df9Var;
        this.f19722c = bi8Var;
        this.d = ac0Var;
    }

    public static <T> T s(Callable<T> callable) {
        try {
            return u56.c().submit(callable).get();
        } catch (Exception unused) {
            return null;
        }
    }

    public static <T> T t(Callable<T> callable) {
        try {
            return (T) u56.p(callable).get();
        } catch (Exception unused) {
            return null;
        }
    }

    public final String e(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    public List<cf9> f(String str) {
        return (List) s(new f(str));
    }

    public Map<String, Integer> g() {
        Map<String, Integer> map = (Map) s(new l());
        return map != null ? map : Collections.emptyMap();
    }

    public cf9 h(String str, String str2) {
        return (cf9) s(new g(str, str2));
    }

    public zb0 i(String str) {
        if (str == null) {
            return null;
        }
        zb0 zb0Var = this.g.get(str);
        if (zb0Var != null) {
            return zb0Var;
        }
        zb0 zb0Var2 = (zb0) s(new h(str));
        if (zb0Var2 != null) {
            this.g.put(str, zb0Var2);
        }
        return zb0Var2;
    }

    public zs6 j(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return null;
        }
        String strE = e(str, str2, str3);
        synchronized (this.f19723e) {
            zs6 zs6Var = this.f19723e.get(strE);
            if (zs6Var != null) {
                return zs6Var;
            }
            zs6 zs6VarD = this.a.d(str, str2, str3);
            if (zs6VarD != null) {
                synchronized (this.f19723e) {
                    this.f19723e.put(strE, zs6VarD);
                }
            }
            return zs6VarD;
        }
    }

    public cf9 k(String str) {
        return (cf9) s(new e(str));
    }

    public String l(long j2) {
        return (String) s(new d(j2));
    }

    public bi8 m() {
        return this.f19722c;
    }

    public String n() {
        return (String) s(new c());
    }

    public List<zs6> o(String str) {
        List<zs6> list;
        return (str == null || (list = (List) s(new i(str))) == null) ? Collections.emptyList() : list;
    }

    public void p(List<zs6> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        synchronized (this.f19723e) {
            for (zs6 zs6Var : list) {
                if (zs6Var != null) {
                    this.f19723e.remove(e(zs6Var.c(), zs6Var.d(), zs6Var.e()));
                }
            }
        }
    }

    public boolean q(String str) {
        if (str == null) {
            return true;
        }
        Boolean bool = (Boolean) s(new j(str));
        if (bool == null) {
            return false;
        }
        return !bool.booleanValue();
    }

    public List<zs6> r(Set<String> set) {
        return this.a.b(set);
    }

    public long u(zb0 zb0Var) {
        if (zb0Var == null || zb0Var.a() == null) {
            return -1L;
        }
        this.g.put(zb0Var.a(), zb0Var);
        try {
            u56.p(new b(zb0Var));
            return 0L;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public int v(List<cf9> list) {
        Integer num = (Integer) t(new a(list));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public List<zs6> w(List<zs6> list) {
        List<zs6> list2 = (List) t(new k(list));
        return list2 == null ? Collections.emptyList() : list2;
    }
}

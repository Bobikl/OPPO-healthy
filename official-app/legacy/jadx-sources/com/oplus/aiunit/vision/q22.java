package com.oplus.aiunit.vision;

import java.security.Permission;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.spongycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: loaded from: classes11.dex */
public class q22 implements g2f {
    public static Permission g = new ProviderConfigurationPermission("SC", yw3.THREAD_LOCAL_EC_IMPLICITLY_CA);
    public static Permission h = new ProviderConfigurationPermission("SC", yw3.EC_IMPLICITLY_CA);
    public static Permission i = new ProviderConfigurationPermission("SC", yw3.THREAD_LOCAL_DH_DEFAULT_PARAMS);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Permission f15602j = new ProviderConfigurationPermission("SC", yw3.DH_DEFAULT_PARAMS);
    public static Permission k = new ProviderConfigurationPermission("SC", yw3.ACCEPTABLE_EC_CURVES);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Permission f15603l = new ProviderConfigurationPermission("SC", yw3.ADDITIONAL_EC_PARAMETERS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile qb6 f15604c;
    public volatile Object d;
    public ThreadLocal a = new ThreadLocal();
    public ThreadLocal b = new ThreadLocal();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Set f15605e = new HashSet();
    public volatile Map f = new HashMap();

    @Override // com.oplus.aiunit.vision.g2f
    public qb6 a() {
        qb6 qb6Var = (qb6) this.a.get();
        return qb6Var != null ? qb6Var : this.f15604c;
    }

    @Override // com.oplus.aiunit.vision.g2f
    public Set b() {
        return Collections.unmodifiableSet(this.f15605e);
    }

    @Override // com.oplus.aiunit.vision.g2f
    public Map c() {
        return Collections.unmodifiableMap(this.f);
    }

    public void d(String str, Object obj) {
        SecurityManager securityManager = System.getSecurityManager();
        if (str.equals(yw3.THREAD_LOCAL_EC_IMPLICITLY_CA)) {
            if (securityManager != null) {
                securityManager.checkPermission(g);
            }
            qb6 qb6VarF = ((obj instanceof qb6) || obj == null) ? (qb6) obj : x76.f((ECParameterSpec) obj, false);
            if (qb6VarF == null) {
                this.a.remove();
                return;
            } else {
                this.a.set(qb6VarF);
                return;
            }
        }
        if (str.equals(yw3.EC_IMPLICITLY_CA)) {
            if (securityManager != null) {
                securityManager.checkPermission(h);
            }
            if ((obj instanceof qb6) || obj == null) {
                this.f15604c = (qb6) obj;
                return;
            } else {
                this.f15604c = x76.f((ECParameterSpec) obj, false);
                return;
            }
        }
        if (str.equals(yw3.THREAD_LOCAL_DH_DEFAULT_PARAMS)) {
            if (securityManager != null) {
                securityManager.checkPermission(i);
            }
            if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
                throw new IllegalArgumentException("not a valid DHParameterSpec");
            }
            if (obj == null) {
                this.b.remove();
                return;
            } else {
                this.b.set(obj);
                return;
            }
        }
        if (str.equals(yw3.DH_DEFAULT_PARAMS)) {
            if (securityManager != null) {
                securityManager.checkPermission(f15602j);
            }
            if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
                throw new IllegalArgumentException("not a valid DHParameterSpec or DHParameterSpec[]");
            }
            this.d = obj;
            return;
        }
        if (str.equals(yw3.ACCEPTABLE_EC_CURVES)) {
            if (securityManager != null) {
                securityManager.checkPermission(k);
            }
            this.f15605e = (Set) obj;
        } else if (str.equals(yw3.ADDITIONAL_EC_PARAMETERS)) {
            if (securityManager != null) {
                securityManager.checkPermission(f15603l);
            }
            this.f = (Map) obj;
        }
    }
}

package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.heytap.health.core.provider.adapter.open.SportDataAdapter;
import com.heytap.health.core.provider.auth.AuthScope;
import com.heytap.health.core.provider.auth.struct.AuthCallerBody;
import com.heytap.health.core.provider.auth.struct.PackageInfoBody;
import com.heytap.health.core.provider.auth.struct.WhiteCallerBody;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public class pee {
    public final Context a;
    public final String b = "PermissionChecker";

    public pee(Context context) {
        this.a = context;
    }

    public final boolean a(byte b, String str, String str2) {
        WhiteCallerBody.ConfigBean configBean;
        AuthScope.Configuration configuration;
        a7b.f("PermissionChecker", "check---flag: " + ((int) b) + ",callerPackageName: " + str);
        if (this.a.getApplicationInfo().packageName.equalsIgnoreCase(str)) {
            return true;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                if (TextUtils.isEmpty(str2)) {
                    a7b.f("PermissionChecker", "scope is null.");
                    return false;
                }
                Map<String, AuthScope.Configuration> callerWhiteListConfigMap = AuthScope.getCallerWhiteListConfigMap();
                if (callerWhiteListConfigMap != null && (configuration = callerWhiteListConfigMap.get(str)) != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" is in local white list.");
                    List<String> list = configuration.sha1;
                    List<String> list2 = configuration.scopes;
                    if (b(str, list) && list2 != null && list2.contains(str2)) {
                        return true;
                    }
                }
                a7b.f("PermissionChecker", str + " is not in local white list.");
                Map<String, WhiteCallerBody.ConfigBean> mapN = tuj.n();
                if (mapN != null && (configBean = mapN.get(str)) != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(" is in open white list.");
                    List<String> sha1 = configBean.getSha1();
                    List<String> scopes = configBean.getScopes();
                    if (scopes != null && scopes.contains("READ_DAILY_ACTIVITY")) {
                        scopes.add(SportDataAdapter.READ_SCOPE);
                    }
                    if (b(str, sha1) && scopes != null && scopes.contains(str2)) {
                        return true;
                    }
                }
                a7b.f("PermissionChecker", str + " is not in open white list.");
                Map<String, AuthCallerBody> mapI = tuj.i();
                if (mapI != null) {
                    AuthCallerBody authCallerBody = mapI.get(str);
                    if (authCallerBody == null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str);
                        sb3.append(" is not in open auth list.");
                        return false;
                    }
                    a7b.f("PermissionChecker", str + " is in open auth list.");
                    PackageInfoBody packageInfoBody = (PackageInfoBody) sc8.a(v9g.x("sdkCallerClientIdList").D(authCallerBody.getClientId()), PackageInfoBody.class);
                    Objects.requireNonNull(packageInfoBody);
                    return b(str, packageInfoBody.getSha1sums()) && f(str, str2);
                }
            } catch (Exception e2) {
                a7b.c("PermissionChecker", "exception: ", e2);
            }
        }
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    public boolean b(String str, List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("checkCallerSha1Valid---callerPackageName: ");
        sb.append(str);
        sb.append(",sha1: ");
        sb.append(list);
        String str2 = (String) woe.b(str);
        woe.b(list);
        String strJ = j(str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("checkCallerSha1Valid---callerSha1: ");
        sb2.append(strJ);
        boolean zContains = list.contains(strJ);
        a7b.f("PermissionChecker", str2 + " sha1 is valid: " + zContains);
        return zContains;
    }

    public boolean c(String str, String str2) {
        return a((byte) 8, str, str2);
    }

    public boolean d(String str, String str2) {
        return a((byte) 2, str, str2);
    }

    public boolean e(String str, String str2) {
        return a((byte) 1, str, str2);
    }

    public final boolean f(String str, String str2) {
        List<String> listConvertScopeBeanToSelectedScopeSet = AuthCallerBody.ScopeBean.convertScopeBeanToSelectedScopeSet(tuj.j(str));
        Set<String> callerGrantScope = AuthScope.getCallerGrantScope(str);
        listConvertScopeBeanToSelectedScopeSet.toString();
        return (callerGrantScope != null && callerGrantScope.contains(str2)) || listConvertScopeBeanToSelectedScopeSet.contains(str2);
    }

    public boolean g(String str, String str2) {
        return a((byte) 16, str, str2);
    }

    public boolean h(String str) {
        AuthCallerBody authCallerBody;
        AuthScope.Configuration configuration;
        WhiteCallerBody.ConfigBean configBean;
        AuthScope.Configuration configuration2;
        if (this.a.getApplicationInfo().packageName.equalsIgnoreCase(str)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Map<String, AuthScope.Configuration> callerWhiteListConfigMap = AuthScope.getCallerWhiteListConfigMap();
            if (callerWhiteListConfigMap != null && (configuration2 = callerWhiteListConfigMap.get(str)) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" is in local white list.");
                if (b(str, configuration2.sha1)) {
                    return true;
                }
            }
            a7b.f("PermissionChecker", str + " is not in local white list.");
            Map<String, WhiteCallerBody.ConfigBean> mapN = tuj.n();
            if (mapN != null && (configBean = mapN.get(str)) != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" is in open white list.");
                if (b(str, configBean.getSha1())) {
                    return true;
                }
            }
            a7b.f("PermissionChecker", str + " is not in open white list.");
            Map<String, AuthScope.Configuration> callerListConfigMap = AuthScope.getCallerListConfigMap();
            if (callerListConfigMap != null && (configuration = callerListConfigMap.get(str)) != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" is in local caller list.");
                if (b(str, configuration.sha1)) {
                    return true;
                }
            }
            a7b.f("PermissionChecker", str + " is not in local caller list.");
            Map<String, AuthCallerBody> mapI = tuj.i();
            if (mapI != null && (authCallerBody = mapI.get(str)) != null) {
                a7b.f("PermissionChecker", str + " is in open auth list.");
                PackageInfoBody packageInfoBody = (PackageInfoBody) sc8.a(v9g.x("sdkCallerClientIdList").D(authCallerBody.getClientId()), PackageInfoBody.class);
                Objects.requireNonNull(packageInfoBody);
                if (b(str, packageInfoBody.getSha1sums())) {
                    return true;
                }
            }
        } catch (Exception e2) {
            a7b.c("PermissionChecker", "exception: ", e2);
        }
        return false;
    }

    public boolean i(String str, String str2) {
        return a((byte) 4, str, str2);
    }

    public final String j(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("getCallerSHA1ByPackageName: ");
        sb.append(str);
        try {
            byte[] bArrDigest = MessageDigest.getInstance(gc0.SHA1).digest(this.a.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
            StringBuilder sb2 = new StringBuilder();
            for (byte b : bArrDigest) {
                String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.US);
                if (upperCase.length() == 1) {
                    sb2.append("0");
                }
                sb2.append(upperCase);
                sb2.append(":");
            }
            String string = sb2.toString();
            return string.substring(0, string.length() - 1);
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException e2) {
            a7b.c("PermissionChecker", "exception: ", e2);
            return null;
        }
    }
}

package com.heytap.msp.ipc.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.heytap.msp.ipc.annotation.IPCType;
import com.heytap.msp.ipc.common.exception.IPCBridgeException;
import com.heytap.msp.ipc.interceptor.ClientMethodInterceptor;
import com.heytap.msp.ipc.server.ServerFilter;
import com.oplus.aiunit.vision.en;
import com.opos.process.bridge.base.BridgeConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class f {
    public Context a;
    public ServerFilter b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<j> f7316c;
    public Bundle d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<ClientMethodInterceptor> f7317e = new ArrayList();
    public TargetModifier f;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IPCType.values().length];
            a = iArr;
            try {
                iArr[IPCType.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[IPCType.SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[IPCType.PROVIDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(List<j> list) {
        this.f7316c = list;
    }

    public Intent a(String str, String str2, String str3, Bundle bundle) {
        h.a("BaseActivityClient", "getActivityIntent --- packageName:" + str + ", targetComponentClass:" + str2 + ", action:" + str3 + ", bundle:" + bundle);
        Intent intent = new Intent();
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                intent.setPackage(str);
            } else {
                intent.setComponent(new ComponentName(str, str2));
            }
        }
        if (!TextUtils.isEmpty(str3) && !"NoAction".equals(str3)) {
            intent.setAction(str3);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return intent;
    }

    public abstract IPCType b();

    public Intent c(String str, String str2, String str3, Bundle bundle) {
        h.a("BaseActivityClient", "getServiceIntent --- packageName:" + str + ", targetClass:" + str2 + ", action" + str3 + ", bundle:" + bundle);
        Intent intent = new Intent();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            intent.setComponent(new ComponentName(str, str2));
        }
        intent.setPackage(str);
        intent.setAction(str3);
        intent.putExtra(BridgeConstant.KEY_CALLING_PACKAGE, this.a.getPackageName());
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return intent;
    }

    public abstract String d();

    public List<j> e(List<j> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<j> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new j(it.next()));
        }
        return arrayList;
    }

    public final List<j> f(Context context, PackageManager packageManager) {
        ProviderInfo providerInfoResolveContentProvider;
        ArrayList arrayList = new ArrayList();
        TargetModifier targetModifier = this.f;
        for (j jVarModify : targetModifier != null ? targetModifier.modify(context, this.f7316c) : this.f7316c) {
            TargetModifier targetModifier2 = this.f;
            if (targetModifier2 != null) {
                jVarModify = targetModifier2.modify(context, jVarModify);
            }
            if (jVarModify == null || !jVarModify.h()) {
                h.g("BaseActivityClient", "originTarget is not valid" + jVarModify);
            } else {
                int i = a.a[b().ordinal()];
                if (i == 1) {
                    for (ResolveInfo resolveInfo : en.d(packageManager, a(jVarModify.b, d(), jVarModify.d, null), 128)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo != null && !TextUtils.isEmpty(activityInfo.packageName)) {
                            ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                            j jVarB = j.b(activityInfo2.packageName, activityInfo2.processName, jVarModify.d, activityInfo2.name);
                            if (jVarB != null) {
                                arrayList.add(jVarB);
                            }
                        }
                    }
                } else if (i == 2) {
                    for (ResolveInfo resolveInfo2 : packageManager.queryIntentServices(c(jVarModify.b, d(), jVarModify.d, null), 128)) {
                        ServiceInfo serviceInfo = resolveInfo2.serviceInfo;
                        if (serviceInfo != null && !TextUtils.isEmpty(serviceInfo.packageName)) {
                            ServiceInfo serviceInfo2 = resolveInfo2.serviceInfo;
                            j jVarB2 = j.b(serviceInfo2.packageName, serviceInfo2.processName, jVarModify.d, serviceInfo2.name);
                            if (jVarB2 != null) {
                                arrayList.add(jVarB2);
                            }
                        }
                    }
                } else if (i == 3 && (providerInfoResolveContentProvider = packageManager.resolveContentProvider(jVarModify.f7318c, 128)) != null && !TextUtils.isEmpty(providerInfoResolveContentProvider.packageName) && (TextUtils.isEmpty(d()) || providerInfoResolveContentProvider.name.equals(d()))) {
                    j jVarD = j.d(providerInfoResolveContentProvider.packageName, providerInfoResolveContentProvider.processName, jVarModify.f7318c, providerInfoResolveContentProvider.name);
                    if (jVarD != null) {
                        arrayList.add(jVarD);
                    }
                }
            }
        }
        return arrayList;
    }

    public j g(Context context) throws IPCBridgeException {
        List<j> listF = f(context, this.a.getPackageManager());
        h.g("BaseActivityClient", "get targets:" + i.a(listF));
        if (listF.isEmpty()) {
            h.b("BaseActivityClient", "No target found for targets");
            throw new IPCBridgeException("No target found for all targets", 101001);
        }
        if (this.b == null) {
            j jVar = listF.get(0);
            h.g("BaseActivityClient", "select first package:" + jVar);
            return jVar;
        }
        h.g("BaseActivityClient", "serverFilter:" + this.b.getClass().getName());
        j jVarFilter = this.b.filter(context, e(listF));
        if (jVarFilter == null || !listF.contains(jVarFilter)) {
            throw new IPCBridgeException("serverFilter block all app package", 101003);
        }
        h.g("BaseActivityClient", "filterr result" + jVarFilter);
        if (jVarFilter.h()) {
            return jVarFilter;
        }
        throw new IPCBridgeException("serverFilter return unknown package", 101003);
    }

    public void h(TargetModifier targetModifier) {
        this.f = targetModifier;
    }
}

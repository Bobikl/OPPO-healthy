package com.oplus.aiunit.vision;

import com.heytap.databaseengine.callback.ICommonListener;
import com.heytap.databaseengine.callback.IDataOperateListener;
import com.heytap.databaseengine.callback.IDataReadResultListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class ts8 {
    public IDataReadResultListener a;
    public ICommonListener b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IDataOperateListener f17136c;
    public final List<Object> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17137e;

    public ts8() {
        this.f17137e = false;
        this.d = new ArrayList();
    }

    public final void a(int i) {
        ICommonListener iCommonListener = this.b;
        if (iCommonListener != null) {
            g0b.a(iCommonListener, i, this.d);
        }
        IDataReadResultListener iDataReadResultListener = this.a;
        if (iDataReadResultListener != null) {
            g0b.c(iDataReadResultListener, this.d, i, 2);
        }
        IDataOperateListener iDataOperateListener = this.f17136c;
        if (iDataOperateListener != null) {
            g0b.b(iDataOperateListener, i, this.d);
        }
    }

    public boolean b(String str) {
        try {
            if (qa2.account.b()) {
                cj4.d("HealthPlatformChecker", "do not grant login");
                a(jp6.a(this.f17137e, jp6.ERR_LOGIN_STATUS));
                return true;
            }
            cj4.c("HealthPlatformChecker", "read: start table is " + str);
            if (qa2.operationAuth.h(str)) {
                return false;
            }
            cj4.c("HealthPlatformChecker", "read: read authority deny. Table: " + str);
            a(jp6.a(this.f17137e, jp6.ERR_PERMISSION_DENY));
            return true;
        } catch (Exception e2) {
            cj4.b("HealthPlatformChecker", "read data e = " + e2.getMessage());
            a(jp6.a(this.f17137e, 101006));
            return true;
        }
    }

    public void c(boolean z) {
        this.f17137e = z;
    }

    public ts8(IDataReadResultListener iDataReadResultListener) {
        this();
        this.a = iDataReadResultListener;
    }

    public ts8(ICommonListener iCommonListener) {
        this();
        this.b = iCommonListener;
    }

    public ts8(IDataOperateListener iDataOperateListener) {
        this();
        this.f17136c = iDataOperateListener;
    }
}

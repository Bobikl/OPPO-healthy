package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.accountsdk.open.core.storage.db.AcUserCenterDataBase;
import com.oplus.accountsdk.open.core.storage.table.AcOpenSQLKeyValue;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.if, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C1712if {
    public static volatile C1712if b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f12504c = "AcOpenKeyValueHelper";
    public final hg a;

    public C1712if(Context context) {
        this.a = AcUserCenterDataBase.e(context.getApplicationContext()).d();
    }

    public static C1712if b(Context context) {
        if (b == null) {
            synchronized (C1712if.class) {
                if (b == null) {
                    b = new C1712if(context);
                }
            }
        }
        return b;
    }

    public void a(String str) {
        hg hgVar = this.a;
        if (hgVar != null) {
            hgVar.delete(str);
        }
    }

    public int c(String str, int i) {
        AcOpenSQLKeyValue acOpenSQLKeyValueE = e(str);
        if (acOpenSQLKeyValueE != null) {
            try {
                return Integer.parseInt(acOpenSQLKeyValueE.getSqlValue());
            } catch (Exception unused) {
                AcLogUtil.e(f12504c, "parseInt error");
            }
        }
        return i;
    }

    public String d(String str, String str2) {
        AcOpenSQLKeyValue acOpenSQLKeyValueE = e(str);
        return acOpenSQLKeyValueE != null ? acOpenSQLKeyValueE.getSqlValue() : str2;
    }

    public final AcOpenSQLKeyValue e(String str) {
        hg hgVar = this.a;
        if (hgVar != null) {
            return hgVar.b(str);
        }
        return null;
    }

    public void f(String str, String str2) {
        AcOpenSQLKeyValue acOpenSQLKeyValue = new AcOpenSQLKeyValue();
        acOpenSQLKeyValue.setSqlKey(str);
        acOpenSQLKeyValue.setSqlValue(str2);
        g(acOpenSQLKeyValue);
    }

    public final void g(AcOpenSQLKeyValue acOpenSQLKeyValue) {
        hg hgVar = this.a;
        if (hgVar == null || acOpenSQLKeyValue == null) {
            return;
        }
        hgVar.a(acOpenSQLKeyValue);
    }
}

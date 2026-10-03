package com.oplus.aiunit.vision;

import android.os.RemoteException;
import com.heytap.databaseengine.callback.ICommonListener;
import com.heytap.databaseengine.callback.IDataOperateListener;
import com.heytap.databaseengine.callback.IDataReadResultListener;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class g0b {
    public static void a(ICommonListener iCommonListener, int i, List<?> list) {
        if (iCommonListener == null) {
            cj4.c("HDB_OIHealthManager", "onResult listener is null!");
            return;
        }
        try {
            iCommonListener.onFailure(i, list);
        } catch (RemoteException e2) {
            cj4.b("HDB_OIHealthManager", "RemoteException e = " + e2.getMessage() + ", errorCode is: " + i + ", ");
        } catch (Exception e3) {
            cj4.b("HDB_OIHealthManager", "Exception e = " + e3.getMessage());
        }
    }

    public static void b(IDataOperateListener iDataOperateListener, int i, List<?> list) {
        if (iDataOperateListener == null) {
            cj4.c("HDB_OIHealthManager", "onResult listener is null!");
            return;
        }
        try {
            iDataOperateListener.onResult(i, list);
        } catch (RemoteException e2) {
            cj4.b("HDB_OIHealthManager", "RemoteException e = " + e2.getMessage() + ", errorCode is: " + i + ", ");
        } catch (Exception e3) {
            cj4.b("HDB_OIHealthManager", "Exception e = " + e3.getMessage());
        }
    }

    public static void c(IDataReadResultListener iDataReadResultListener, List<?> list, int i, int i2) {
        if (iDataReadResultListener == null) {
            cj4.c("HDB_OIHealthManager", "onResult listener is null!");
            return;
        }
        try {
            iDataReadResultListener.onResult(list, i, i2);
        } catch (RemoteException e2) {
            cj4.b("HDB_OIHealthManager", "RemoteException e = " + e2.getMessage() + ", errorCode is: " + i + ", ");
        } catch (Exception e3) {
            cj4.b("HDB_OIHealthManager", "Exception e = " + e3.getMessage());
        }
    }

    public static void d(ICommonListener iCommonListener, int i, List<?> list) {
        if (iCommonListener == null) {
            cj4.c("HDB_OIHealthManager", "onResult listener is null!");
            return;
        }
        try {
            iCommonListener.onSuccess(i, list);
        } catch (RemoteException e2) {
            cj4.b("HDB_OIHealthManager", "RemoteException e = " + e2.getMessage() + ", errorCode is: " + i + ", ");
        } catch (Exception e3) {
            cj4.b("HDB_OIHealthManager", "Exception e = " + e3.getMessage());
        }
    }
}

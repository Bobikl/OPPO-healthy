package com.coloros.sceneservice;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.coloros.sceneservice.aidl.IRemoteClientCallBack;
import com.coloros.sceneservice.aidl.ISceneService;
import com.coloros.sceneservice.m.f;

/* JADX INFO: loaded from: classes13.dex */
public class SceneService {
    public static final String TAG = "SceneService";
    public Context mContext;
    public ISceneService mService;

    public SceneService(Context context, ISceneService iSceneService) {
        this.mContext = context;
        this.mService = iSceneService;
    }

    public void oppoSceneConfirm(Context context, String str, Bundle bundle, int i) {
        try {
            if (str == null || bundle == null) {
                f.e(TAG, "oppoSceneConfirm keyword or bundle is null");
                return;
            }
            ISceneService iSceneService = this.mService;
            if (iSceneService == null) {
                f.e(TAG, "oppoSceneConfirm keyword or bundle is null");
            } else {
                iSceneService.oppoSceneConfirm(i, str, bundle);
            }
        } catch (RemoteException e2) {
            f.e(TAG, "oppoSceneConfirm Exception = " + e2);
        }
    }

    public void queryPoiService(Context context, String str, Bundle bundle, int i) {
        try {
            ISceneService iSceneService = this.mService;
            if (iSceneService == null) {
                f.e(TAG, "queryPoiService error");
            } else {
                iSceneService.queryPoiService(i, str, bundle);
            }
        } catch (RemoteException e2) {
            f.e(TAG, "queryPoiService Exception = " + e2.getMessage());
        }
    }

    public int registerCallBack(IRemoteClientCallBack iRemoteClientCallBack, int i) {
        if (iRemoteClientCallBack != null) {
            try {
                ISceneService iSceneService = this.mService;
                if (iSceneService != null) {
                    return iSceneService.registerCallBack(iRemoteClientCallBack, i);
                }
            } catch (Exception e2) {
                f.e(TAG, "registerCallBack Exception, " + e2.getMessage());
                return -2;
            }
        }
        f.e(TAG, "registerCallBack error");
        return -2;
    }

    public void unRegisterCallBack(IRemoteClientCallBack iRemoteClientCallBack, int i) {
        if (iRemoteClientCallBack != null) {
            try {
                ISceneService iSceneService = this.mService;
                if (iSceneService != null) {
                    iSceneService.unRegisterCallBack(iRemoteClientCallBack, i);
                    return;
                }
            } catch (Exception e2) {
                f.e(TAG, "unRegisterCallBack Exception, " + e2.getMessage());
                return;
            }
        }
        f.e(TAG, "unRegisterCallBack error");
    }
}

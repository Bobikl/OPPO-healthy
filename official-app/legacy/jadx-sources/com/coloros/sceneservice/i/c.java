package com.coloros.sceneservice.i;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.coloros.sceneservice.aidl.ISceneCorrespondInterface;
import com.coloros.sceneservice.m.f;

/* JADX INFO: loaded from: classes13.dex */
public class c implements ServiceConnection {
    public final /* synthetic */ e this$0;

    public c(e eVar) {
        this.this$0 = eVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f.i(e.TAG, "onServiceConnected");
        this.this$0.mService = ISceneCorrespondInterface.Stub.asInterface(iBinder);
        try {
            e eVar = this.this$0;
            eVar.rc = eVar.mService.registerSceneClient(this.this$0.mCallback, this.this$0.mContext.getPackageName());
        } catch (RemoteException e2) {
            f.e(e.TAG, "onServiceConnected", e2);
        }
        this.this$0.qc = true;
        this.this$0.u();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        f.i(e.TAG, "onServiceDisconnected");
        this.this$0.mService = null;
        this.this$0.qc = false;
        this.this$0.rc = false;
        this.this$0.sc = false;
        this.this$0.tc.clear();
    }
}

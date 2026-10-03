package com.oplus.onet.callback;

import android.os.RemoteException;
import com.oplus.onet.IONetService;
import com.oplus.onet.device.ONetDevice;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class IONetServiceExtend extends IONetService.Stub {
    public List<ONetDevice> getCachedDevicesByAbility(int i, List<String> list) throws RemoteException {
        return new ArrayList();
    }
}

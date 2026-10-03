package com.heytap.msp.ipc.client;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.heytap.msp.ipc.common.exception.IPCBridgeDispatchException;
import com.heytap.msp.ipc.common.exception.IPCBridgeException;
import com.heytap.msp.ipc.common.exception.IPCBridgeExecuteException;
import com.heytap.msp.ipc.server.ServerFilter;
import com.opos.process.bridge.base.BridgeConstant;
import com.opos.process.bridge.base.BridgeResultCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes19.dex */
public abstract class a extends f {
    public Parcelable g;
    public String h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ReentrantLock f7311j;
    public int k;

    public a(List<j> list, String str, String str2, Parcelable parcelable, Bundle bundle) {
        super(list);
        this.f7311j = new ReentrantLock(true);
        this.k = 5000;
        this.i = str;
        this.h = str2;
        this.g = parcelable;
        this.d = bundle;
    }

    @Override // com.heytap.msp.ipc.client.f
    public String d() {
        return this.i;
    }

    @Override // com.heytap.msp.ipc.client.f
    public List<j> e(List<j> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<j> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new j(it.next()));
        }
        return arrayList;
    }

    public Object i(int i, Object... objArr) throws IPCBridgeException {
        return j(this.a, l(), this.g, i, objArr);
    }

    public Object j(Context context, String str, Parcelable parcelable, int i, Object... objArr) throws IPCBridgeException {
        h.a("BaseClient", "callForResult");
        Bundle bundleK = k(context, str, parcelable, i, objArr);
        h.g("BaseClient", "callRemote --- resultBundle:" + bundleK);
        if (bundleK == null) {
            h.b("BaseClient", "remote response is NULL");
            throw new IPCBridgeException("remote response is NULL", BridgeResultCode.CODE_RESPONSE_ERROR);
        }
        bundleK.setClassLoader(getClass().getClassLoader());
        int i2 = bundleK.getInt("resultCode");
        if (i2 == 0) {
            return bundleK.get(BridgeConstant.KEY_RESULT_DATA);
        }
        String string = bundleK.getString("resultMsg");
        h.b("BaseClient", "error code:" + i2 + ", message:" + string);
        if (i2 == 101008) {
            Exception exc = (Exception) bundleK.getSerializable(BridgeConstant.KEY_RESULT_EXCEPTION);
            h.c("BaseClient", "code:" + i2, exc);
            throw new IPCBridgeException(exc, i2);
        }
        if (i2 < 102000) {
            throw new IPCBridgeException(string, i2);
        }
        if (i2 < 103000) {
            throw new IPCBridgeDispatchException(string, i2);
        }
        if (i2 != 103000) {
            throw new IPCBridgeException(string, i2);
        }
        int i3 = bundleK.getInt(BridgeConstant.KEY_INTERCEPTOR_CODE);
        String string2 = bundleK.getString(BridgeConstant.KEY_INTERCEPTOR_MSG);
        h.b("BaseClient", "interceptor error code:" + i2 + ", message:" + string);
        throw new IPCBridgeExecuteException(string2, i3);
    }

    public abstract Bundle k(Context context, String str, Parcelable parcelable, int i, Object... objArr) throws IPCBridgeException;

    public String l() {
        return this.h;
    }

    public void m(ServerFilter serverFilter) {
        h.a("BaseClient", "setServerFilter:" + serverFilter.getClass().getName());
        this.b = serverFilter;
    }
}

package com.opos.process.bridge.client;

import android.content.Context;
import android.os.Bundle;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;
import com.opos.process.bridge.base.BridgeConstant;
import com.opos.process.bridge.base.BridgeResultCode;
import com.opos.process.bridge.interceptor.ClientMethodInterceptor;
import com.opos.process.bridge.interceptor.ServerFilter;
import com.opos.process.bridge.provider.BridgeBizException;
import com.opos.process.bridge.provider.BridgeDispatchException;
import com.opos.process.bridge.provider.BridgeExecuteException;
import com.opos.process.bridge.provider.ProcessBridgeLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
public abstract class BaseClient {
    private static final String TAG = "BaseClient";
    protected Context mContext;
    protected Bundle mData;
    protected IBridgeTargetIdentify mTargetIdentify;
    protected ServerFilter serverFilter;
    protected final List<TargetInfo> mTargets = new ArrayList();
    protected List<ClientMethodInterceptor> clientMethodInterceptors = new ArrayList();
    final ReentrantLock lock = new ReentrantLock(true);
    int defaultTimeOut = 5000;

    public void addClientMethodInterceptor(ClientMethodInterceptor clientMethodInterceptor) {
        ProcessBridgeLog.d(TAG, "addClientMethodInterceptor:" + clientMethodInterceptor.getClass().getName());
        this.clientMethodInterceptors.add(clientMethodInterceptor);
    }

    public void call(Context context, String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object... objArr) throws BridgeExecuteException, BridgeDispatchException {
        ProcessBridgeLog.d(TAG, "call --- targetClass:" + str + ", methodId:" + i);
        callForResult(context, str, iBridgeTargetIdentify, i, objArr);
    }

    public Object callForResult(Context context, String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object... objArr) throws BridgeExecuteException, BridgeDispatchException {
        ProcessBridgeLog.d(TAG, "callForResult");
        Bundle bundleCallRemote = callRemote(context, str, iBridgeTargetIdentify, i, objArr);
        ProcessBridgeLog.v(TAG, "callRemote --- resultBundle:" + bundleCallRemote);
        if (bundleCallRemote == null) {
            ProcessBridgeLog.e(TAG, "remote response is NULL");
            throw new BridgeExecuteException("remote response is NULL", BridgeResultCode.CODE_RESPONSE_ERROR);
        }
        bundleCallRemote.setClassLoader(getClass().getClassLoader());
        int i2 = bundleCallRemote.getInt("resultCode");
        if (i2 == 0) {
            return bundleCallRemote.get(BridgeConstant.KEY_RESULT_DATA);
        }
        String string = bundleCallRemote.getString("resultMsg");
        ProcessBridgeLog.e(TAG, "error code:" + i2 + ", message:" + string);
        if (i2 == 101008) {
            Exception exc = (Exception) bundleCallRemote.getSerializable(BridgeConstant.KEY_RESULT_EXCEPTION);
            ProcessBridgeLog.e(TAG, "code:" + i2, exc);
            throw new BridgeExecuteException(exc, i2);
        }
        if (i2 < 102000) {
            throw new BridgeExecuteException(string, i2);
        }
        if (i2 < 103000) {
            throw new BridgeDispatchException(string, i2);
        }
        if (i2 != 103000) {
            throw new BridgeExecuteException(string, i2);
        }
        int i3 = bundleCallRemote.getInt(BridgeConstant.KEY_INTERCEPTOR_CODE);
        String string2 = bundleCallRemote.getString(BridgeConstant.KEY_INTERCEPTOR_MSG);
        ProcessBridgeLog.e(TAG, "interceptor error code:" + i2 + ", message:" + string);
        throw new BridgeBizException(string2, i3);
    }

    public abstract Bundle callRemote(Context context, String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object... objArr) throws BridgeExecuteException, BridgeDispatchException;

    public abstract void checkMainThread() throws BridgeExecuteException;

    public void checkNullResultType(Object obj, Class<?> cls) throws BridgeExecuteException {
        if (cls.isPrimitive() && obj == null) {
            throw new BridgeExecuteException("Primitive not allow return null", BridgeResultCode.CODE_REMOTE_RESULT_NOT_MATCH);
        }
    }

    public void clearClientMethodInterceptor() {
        ProcessBridgeLog.d(TAG, "clearClientMethodInterceptor");
        this.clientMethodInterceptors.clear();
    }

    public Bundle getData() {
        return this.mData;
    }

    public List<TargetInfo> getTargetsClone() {
        ArrayList arrayList = new ArrayList();
        Iterator<TargetInfo> it = this.mTargets.iterator();
        while (it.hasNext()) {
            arrayList.add(new TargetInfo(it.next()));
        }
        return arrayList;
    }

    public boolean removeClientMethodInterceptor(ClientMethodInterceptor clientMethodInterceptor) {
        ProcessBridgeLog.d(TAG, "removeClientMethodInterceptor:" + clientMethodInterceptor.getClass().getName());
        return this.clientMethodInterceptors.remove(clientMethodInterceptor);
    }

    public void setDefaultTimeOut(int i) {
        this.defaultTimeOut = i;
    }

    public void setServerFilter(ServerFilter serverFilter) {
        ProcessBridgeLog.d(TAG, "setServerFilter:" + serverFilter.getClass().getName());
        this.serverFilter = serverFilter;
    }
}

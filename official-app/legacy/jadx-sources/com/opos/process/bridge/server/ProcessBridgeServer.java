package com.opos.process.bridge.server;

import com.opos.process.bridge.interceptor.InterceptResult;
import com.opos.process.bridge.interceptor.InterceptorResultHandler;
import com.opos.process.bridge.interceptor.ServerInterceptor;
import com.opos.process.bridge.interceptor.ServerMethodInterceptor;
import com.opos.process.bridge.provider.ProcessBridgeLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class ProcessBridgeServer {
    private static final String TAG = "ProcessBridgeServer";
    private static final ProcessBridgeServer ourInstance = new ProcessBridgeServer();
    private List<ServerInterceptor> preLinkInterceptors = new CopyOnWriteArrayList();
    private List<ServerInterceptor> serverInterceptors = new CopyOnWriteArrayList();
    private List<ServerMethodInterceptor> serverMethodInterceptors = new CopyOnWriteArrayList();
    private final Map<String, List<ExceptionHandler>> moduleExceptionHandlerMap = new ConcurrentHashMap();
    private List<ExceptionHandler> globalExceptionHandlerList = Collections.synchronizedList(new ArrayList());
    private List<InterceptorResultHandler> interceptorResultHandlerList = Collections.synchronizedList(new ArrayList());

    private ProcessBridgeServer() {
    }

    public static ProcessBridgeServer getInstance() {
        return ourInstance;
    }

    public void addExceptionHandler(Class<?> cls, ExceptionHandler exceptionHandler) {
        if (cls == null || exceptionHandler == null) {
            return;
        }
        ProcessBridgeLog.d(TAG, "addExceptionHandler for moduleName:" + cls.getName() + " --- " + exceptionHandler.getClass().getName());
        String name = cls.getName();
        List<ExceptionHandler> arrayList = this.moduleExceptionHandlerMap.get(name);
        if (arrayList == null) {
            synchronized (this.moduleExceptionHandlerMap) {
                arrayList = this.moduleExceptionHandlerMap.get(name);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.moduleExceptionHandlerMap.put(name, arrayList);
                }
            }
        }
        arrayList.add(exceptionHandler);
    }

    public void addGlobalExceptionHandler(ExceptionHandler exceptionHandler) {
        if (exceptionHandler != null) {
            ProcessBridgeLog.d(TAG, "addGlobalExceptionHandler" + exceptionHandler.getClass().getName());
            this.globalExceptionHandlerList.add(exceptionHandler);
        }
    }

    public void addInterceptorResultHandler(InterceptorResultHandler interceptorResultHandler) {
        if (interceptorResultHandler != null) {
            ProcessBridgeLog.d(TAG, "addInterceptorResultHandler" + interceptorResultHandler.getClass().getName());
            this.interceptorResultHandlerList.add(interceptorResultHandler);
        }
    }

    public void addPreLinkServerInterceptor(ServerInterceptor serverInterceptor) {
        ProcessBridgeLog.d(TAG, "addPreLinkServerInterceptor:" + serverInterceptor.getClass().getName());
        this.preLinkInterceptors.add(serverInterceptor);
    }

    public void addServerInterceptor(ServerInterceptor serverInterceptor) {
        ProcessBridgeLog.d(TAG, "addServerInterceptor:" + serverInterceptor.getClass().getName());
        this.serverInterceptors.add(serverInterceptor);
    }

    public void addServerMethodInterceptor(ServerMethodInterceptor serverMethodInterceptor) {
        ProcessBridgeLog.d(TAG, "addServerMethodInterceptor:" + serverMethodInterceptor.getClass().getName());
        this.serverMethodInterceptors.add(serverMethodInterceptor);
    }

    public void clearServerInterceptor() {
        ProcessBridgeLog.d(TAG, "clearServerInterceptor:");
        this.serverInterceptors.clear();
    }

    public void clearServerMethodInterceptor() {
        ProcessBridgeLog.d(TAG, "clearServerMethodInterceptor:");
        this.serverMethodInterceptors.clear();
    }

    public void disconnectAllService() {
        ProcessBridgeLog.d(TAG, "disconnectAllService");
        ProcessBridgeServiceManager.getInstance().stopAllService();
    }

    public List<ServerInterceptor> getPreLinkInterceptors() {
        ProcessBridgeLog.d(TAG, "getPreLinkInterceptors:");
        return this.preLinkInterceptors;
    }

    public List<ServerInterceptor> getServerInterceptors() {
        ProcessBridgeLog.d(TAG, "getServerInterceptors:");
        return this.serverInterceptors;
    }

    public List<ServerMethodInterceptor> getServerMethodInterceptors() {
        ProcessBridgeLog.d(TAG, "getServerMethodInterceptors:");
        return this.serverMethodInterceptors;
    }

    public void handleException(String str, String str2, int i, String str3) {
        ProcessBridgeLog.d(TAG, "handleException:" + str + "-" + str2 + "-" + i + "-" + str3);
        List<ExceptionHandler> list = this.moduleExceptionHandlerMap.get(str);
        if (list != null && list.size() > 0) {
            for (ExceptionHandler exceptionHandler : list) {
                ProcessBridgeLog.d(TAG, "ExceptionHandler for moduleName:" + str + " --- " + exceptionHandler.getClass().getName());
                exceptionHandler.handleException(str2, i, str3);
            }
        }
        if (this.globalExceptionHandlerList.size() > 0) {
            for (ExceptionHandler exceptionHandler2 : this.globalExceptionHandlerList) {
                ProcessBridgeLog.d(TAG, "Global ExceptionHandler:" + exceptionHandler2.getClass().getName());
                exceptionHandler2.handleException(str2, i, str3);
            }
        }
    }

    public void handleInterceptorResult(String str, InterceptResult interceptResult) {
        ProcessBridgeLog.d(TAG, "handleInterceptorResult:-" + str + "-" + interceptResult);
        if (this.interceptorResultHandlerList.size() > 0) {
            for (InterceptorResultHandler interceptorResultHandler : this.interceptorResultHandlerList) {
                ProcessBridgeLog.d(TAG, "InterceptorResultHandler:" + interceptorResultHandler.getClass().getName());
                interceptorResultHandler.handleResult(str, interceptResult);
            }
        }
    }

    public boolean removeServerInterceptor(ServerInterceptor serverInterceptor) {
        ProcessBridgeLog.d(TAG, "removeServerInterceptor:" + serverInterceptor.getClass().getName());
        return this.serverInterceptors.remove(serverInterceptor);
    }

    public boolean removeServerMethodInterceptor(ServerMethodInterceptor serverMethodInterceptor) {
        ProcessBridgeLog.d(TAG, "removeServerMethodInterceptor:" + serverMethodInterceptor.getClass().getName());
        return this.serverMethodInterceptors.remove(serverMethodInterceptor);
    }
}

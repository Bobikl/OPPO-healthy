package com.oplus.backup.sdk.component;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import com.oplus.backup.sdk.common.host.BREngineConfig;
import com.oplus.backup.sdk.common.load.BRPluginLoader;
import com.oplus.backup.sdk.common.plugin.BRPluginConfig;
import com.oplus.backup.sdk.common.utils.BRLog;
import com.oplus.backup.sdk.common.utils.Constants;
import com.oplus.backup.sdk.common.utils.ReflectUtils;
import com.oplus.backup.sdk.common.utils.StaticHandler;
import com.oplus.backup.sdk.host.BRPluginServiceInfo;
import com.oplus.backup.sdk.host.BRPluginSource;
import com.oplus.weatherservicesdk.data.Weather;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes19.dex */
public class BRPluginService extends Service {
    public static final boolean DEBUG_SYNC_THREAD = true;
    public static final String TAG = "BRPluginService";
    private Handler mAsyncHandler;
    private HandlerThread mAsyncThread;
    private BREngineConfig mBREngineConfig;
    private Object mBRPlugin;
    private BRPluginHandlerImpl mBRPluginHandler;
    private IBinder mBinder;
    private ClassLoader mClassLoader;
    private Handler mHandler;
    private InvocationBRPluginHandlerImpl mInvocationBRPluginHandler;
    private BRPluginLoader mLoader;
    private Messenger mMessenger;
    private Class<?> mPluginClass;
    private Messenger mSendMessenger;
    private Handler mSyncHandler;
    private HandlerThread mSyncThread;

    public class BRPluginHandlerImpl implements BRPluginHandler {
        public BRPluginHandlerImpl() {
        }

        @Override // com.oplus.backup.sdk.component.BRPluginHandler
        public void error(Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("args", bundle);
            BRPluginService.this.sendMsg(4, bundle2, true);
        }

        @Override // com.oplus.backup.sdk.component.BRPluginHandler
        public void sendMsg(Intent intent, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("args", intent);
            BRPluginService.this.sendMsg(2, bundle, z);
        }

        @Override // com.oplus.backup.sdk.component.BRPluginHandler
        public void updateProgress(Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("args", bundle);
            BRPluginService.this.sendMsg(3, bundle2, true);
        }
    }

    public class InvocationBRPluginHandlerImpl implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if ("updateProgress".equals(method.getName())) {
                BRPluginService.this.mBRPluginHandler.updateProgress((Bundle) objArr[0]);
                return null;
            }
            if ("error".equals(method.getName())) {
                BRPluginService.this.mBRPluginHandler.error((Bundle) objArr[0]);
                return null;
            }
            if (!"sendMsg".equals(method.getName())) {
                return null;
            }
            BRPluginService.this.mBRPluginHandler.sendMsg((Intent) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }

        private InvocationBRPluginHandlerImpl() {
        }
    }

    public static class MessengerHandler extends StaticHandler<BRPluginService> {
        private Handler mAsyncHandler;
        private Handler mSyncHandler;

        public MessengerHandler(BRPluginService bRPluginService, Looper looper, Handler handler, Handler handler2) {
            super(bRPluginService, looper);
            this.mAsyncHandler = handler;
            this.mSyncHandler = handler2;
        }

        @Override // com.oplus.backup.sdk.common.utils.StaticHandler
        public void handleMessage(Message message, BRPluginService bRPluginService) {
            BRLog.d(BRPluginService.TAG, "MessagerHandler handleMessage " + message.what + ", msg.arg1:" + message.arg1);
            int i = message.arg1;
            if (i == 0) {
                this.mAsyncHandler.sendMessage(Message.obtain(message));
            } else {
                if (i != 1) {
                    return;
                }
                this.mSyncHandler.sendMessage(Message.obtain(message));
            }
        }
    }

    public static class WorkHandler extends StaticHandler<BRPluginService> {
        public WorkHandler(BRPluginService bRPluginService, Looper looper) {
            super(bRPluginService, looper);
        }

        @Override // com.oplus.backup.sdk.common.utils.StaticHandler
        public void handleMessage(Message message, BRPluginService bRPluginService) {
            Bundle bundle;
            String string;
            Messenger messenger = message.replyTo;
            if (messenger == null) {
                BRLog.w(BRPluginService.TAG, "handleMessage, messenger is null, return");
                return;
            }
            bRPluginService.mSendMessenger = messenger;
            Object obj = message.obj;
            if (obj != null) {
                Bundle bundle2 = (Bundle) obj;
                bundle = bundle2.getBundle("args");
                string = bundle2.getString("method");
            } else {
                bundle = null;
                string = null;
            }
            Bundle bundle3 = new Bundle();
            BRLog.d(BRPluginService.TAG, "WorkHandler handleMessage " + message.what + ", msg.arg1:" + message.arg1 + ", " + bundle + ", method:" + string);
            Object obj2 = bRPluginService.mBRPlugin;
            Class cls = bRPluginService.mPluginClass;
            int i = message.what;
            if (i == 0) {
                Bundle bundle4 = bundle.getBundle("config");
                if (bundle4 != null) {
                    bRPluginService.mBREngineConfig = new BREngineConfig(bundle4);
                    BRLog.setLogLevel(bRPluginService.mBREngineConfig.getLogLevel());
                }
                bundle3.putBundle(Constants.MessagerConstants.RETURN_KEY, bRPluginService.load(bundle));
            } else if (i != 1) {
                if (i != 2) {
                    switch (i) {
                        case 6:
                            BRLog.d(BRPluginService.TAG, "" + new BREngineConfig(bundle.getBundle("config")));
                            if (obj2 != null) {
                                bundle3.putBundle(Constants.MessagerConstants.RETURN_KEY, (Bundle) bRPluginService.invoke(obj2, cls, "onPrepare", bundle));
                            }
                            break;
                        case 7:
                            if (obj2 != null) {
                                bRPluginService.invoke(obj2, cls, "onBackup", bundle);
                            }
                            break;
                        case 8:
                            if (obj2 != null) {
                                bRPluginService.invoke(obj2, cls, "onRestore", bundle);
                            }
                            break;
                        case 9:
                            if (obj2 != null) {
                                bRPluginService.invoke(obj2, cls, "onPause", bundle);
                            }
                            break;
                        case 10:
                            if (obj2 != null) {
                                bRPluginService.invoke(obj2, cls, "onContinue", bundle);
                            }
                            break;
                        case 11:
                            HandlerThread handlerThread = bRPluginService.mSyncThread;
                            if (handlerThread != null) {
                                BRLog.i(BRPluginService.TAG, "before onCancel, Thread state = " + handlerThread.getState());
                            }
                            if (obj2 != null) {
                                bRPluginService.invoke(obj2, cls, "onCancel", bundle);
                            }
                            HandlerThread handlerThread2 = bRPluginService.mSyncThread;
                            if (handlerThread2 != null) {
                                Thread.State state = handlerThread2.getState();
                                BRLog.i(BRPluginService.TAG, "after onCancel, Thread state = " + state);
                                if (Thread.State.BLOCKED == state || Thread.State.WAITING == state) {
                                    BRLog.w(BRPluginService.TAG, "getStackTrace:\n" + BRPluginService.getStackMsg(handlerThread2.getStackTrace()));
                                }
                            }
                            break;
                        case 12:
                            if (obj2 != null) {
                                bundle3.putBundle(Constants.MessagerConstants.RETURN_KEY, (Bundle) bRPluginService.invoke(obj2, cls, "onDestroy", bundle));
                            }
                            break;
                        case 13:
                            if (obj2 != null) {
                                bundle3.putBundle(Constants.MessagerConstants.RETURN_KEY, (Bundle) bRPluginService.invoke(obj2, cls, "onPreview", bundle));
                            }
                            break;
                    }
                } else {
                    bRPluginService.receive(bundle, message.arg1 == 0);
                }
            } else if (obj2 != null) {
                bundle3.putBundle(Constants.MessagerConstants.RETURN_KEY, (Bundle) bRPluginService.invoke(obj2, cls, string, bundle));
            }
            if (message.arg1 == 1) {
                bRPluginService.returnMsg(messenger, message.what, bundle3, false);
            }
        }
    }

    private Class<?> findClass(BRPluginConfig bRPluginConfig, int i) {
        BRPluginLoader bRPluginLoader = new BRPluginLoader();
        this.mLoader = bRPluginLoader;
        ClassLoader classLoaderLoad = bRPluginLoader.load(this, bRPluginConfig);
        this.mClassLoader = classLoaderLoad;
        if (i == 0) {
            return this.mLoader.findClass(bRPluginConfig, classLoaderLoad, 0);
        }
        if (i == 1) {
            return this.mLoader.findClass(bRPluginConfig, classLoaderLoad, 1);
        }
        return null;
    }

    private BRPluginConfig getLocalPluginConfig() throws Throwable {
        ServiceInfo serviceInfo;
        BRPluginConfig[] localBRPlugins = BRPluginSource.getLocalBRPlugins(getApplicationContext(), BRPluginSource.LOCAL_PLUGINS_DIR);
        try {
            serviceInfo = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            BRLog.e(TAG, "imposible! no this service? " + this + ", " + getClass());
            serviceInfo = null;
        }
        if (serviceInfo != null) {
            BRPluginServiceInfo bRPluginServiceInfo = new BRPluginServiceInfo();
            bRPluginServiceInfo.setClass(serviceInfo.packageName, serviceInfo.name);
            bRPluginServiceInfo.setMetaData(serviceInfo.metaData);
            if (localBRPlugins != null && localBRPlugins.length > 0) {
                for (BRPluginConfig bRPluginConfig : localBRPlugins) {
                    if (bRPluginServiceInfo.getUniqueID().equals(bRPluginConfig.getUniqueID())) {
                        return bRPluginConfig;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getStackMsg(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        if (stackTraceElementArr != null) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                sb.append(stackTraceElement.toString() + Weather.SEPARATOR);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object invoke(Object obj, Class<?> cls, String str, Bundle bundle) {
        if (obj == null || cls == null) {
            return null;
        }
        return ReflectUtils.invoke(obj, cls, str, new Class[]{Bundle.class}, new Object[]{bundle});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle load(Bundle bundle) throws Throwable {
        BRPluginConfig[] bRPluginConfigArr;
        BRPluginConfig localPluginConfig;
        Class<?> clsLoadClass;
        int length;
        Parcelable[] parcelableArray = bundle.getParcelableArray(Constants.LoadBundle.PLUGINS);
        int i = bundle.getInt("br_type");
        if (parcelableArray == null || (length = parcelableArray.length) <= 0) {
            bRPluginConfigArr = null;
        } else {
            bRPluginConfigArr = new BRPluginConfig[length];
            for (int i2 = 0; i2 < length; i2++) {
                bRPluginConfigArr[i2] = new BRPluginConfig((Bundle) parcelableArray[i2]);
            }
        }
        try {
            localPluginConfig = getLocalPluginConfig();
            try {
                if (localPluginConfig == null || !localPluginConfig.isPreferLocalClass()) {
                    BRPluginConfig bRPluginConfigOnLoad = onLoad(bRPluginConfigArr, i);
                    if (bRPluginConfigOnLoad != null) {
                        try {
                            BRLog.d(TAG, "use host's plugin config:" + bRPluginConfigOnLoad);
                            localPluginConfig = bRPluginConfigOnLoad;
                        } catch (ClassCastException e2) {
                            e = e2;
                            localPluginConfig = bRPluginConfigOnLoad;
                            BRLog.e(TAG, "load, e =" + e.getMessage());
                        } catch (IllegalAccessException e3) {
                            e = e3;
                            localPluginConfig = bRPluginConfigOnLoad;
                            BRLog.e(TAG, "load, e =" + e.getMessage());
                        } catch (InstantiationException e4) {
                            e = e4;
                            localPluginConfig = bRPluginConfigOnLoad;
                            BRLog.e(TAG, "load, e =" + e.getMessage());
                        }
                    } else {
                        if (localPluginConfig == null) {
                            BRLog.w(TAG, "load localPlugin is null! pls check your .config file");
                            return null;
                        }
                        BRLog.d(TAG, "use local plugin config:" + localPluginConfig + ", no plugin in host");
                    }
                } else {
                    BRLog.d(TAG, "use local plugin config:" + localPluginConfig + ", isPreferLocalClass true");
                }
                Class<?> clsFindClass = findClass(localPluginConfig, i);
                this.mPluginClass = clsFindClass;
                if (clsFindClass != null) {
                    this.mBRPlugin = clsFindClass.newInstance();
                } else {
                    BRLog.e(TAG, "Didn't find plugin class. " + localPluginConfig);
                }
            } catch (ClassCastException e5) {
                e = e5;
            } catch (IllegalAccessException e6) {
                e = e6;
            } catch (InstantiationException e7) {
                e = e7;
            }
        } catch (ClassCastException e8) {
            e = e8;
            localPluginConfig = null;
        } catch (IllegalAccessException e9) {
            e = e9;
            localPluginConfig = null;
        } catch (InstantiationException e10) {
            e = e10;
            localPluginConfig = null;
        }
        try {
            clsLoadClass = this.mClassLoader.loadClass(BRPluginHandler.class.getName());
        } catch (ClassNotFoundException e11) {
            BRLog.e(TAG, "load, e =" + e11.getMessage());
            clsLoadClass = null;
        }
        ReflectUtils.invoke(this.mBRPlugin, this.mPluginClass, "onCreate", new Class[]{Context.class, clsLoadClass, BREngineConfig.class}, new Object[]{this, Proxy.newProxyInstance(this.mClassLoader, new Class[]{clsLoadClass}, this.mInvocationBRPluginHandler), this.mBREngineConfig});
        if (localPluginConfig == null) {
            return null;
        }
        return localPluginConfig.getBundle();
    }

    private void onReveiveMsg(Object obj, Class<?> cls, Intent intent, boolean z) {
        if (obj == null || cls == null) {
            return;
        }
        ReflectUtils.invoke(obj, cls, "onReveiveMsg", new Class[]{Intent.class, Boolean.TYPE}, new Object[]{intent, Boolean.valueOf(z)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void receive(Bundle bundle, boolean z) {
        onReveiveMsg(this.mBRPlugin, this.mPluginClass, (Intent) bundle.get("intent"), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void returnMsg(Messenger messenger, int i, Bundle bundle, boolean z) {
        try {
            messenger.send(Message.obtain(null, i, !z ? 1 : 0, 0, bundle));
        } catch (RemoteException e2) {
            BRLog.e(TAG, "returnMsg, e =" + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendMsg(int i, Bundle bundle, boolean z) {
        Message messageObtain = Message.obtain(null, i, !z ? 1 : 0, 0, bundle);
        Messenger messenger = this.mSendMessenger;
        if (messenger == null) {
            BRLog.e(TAG, "mSendMessenger == null");
            return;
        }
        try {
            messenger.send(messageObtain);
        } catch (RemoteException e2) {
            BRLog.e(TAG, "sendMsg, e =" + e2.getMessage());
        }
    }

    public BRPluginLoader getBRPluginLoader() {
        return this.mLoader;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (this.mBinder == null) {
            BRLog.i(TAG, "onBind ");
            this.mBinder = this.mMessenger.getBinder();
        }
        return this.mBinder;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        BRLog.d(TAG, "onCreate ");
        HandlerThread handlerThread = new HandlerThread("br_plugin_messager_thread");
        this.mSyncThread = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = new HandlerThread("br_plugin_async_thread");
        this.mAsyncThread = handlerThread2;
        handlerThread2.start();
        this.mAsyncHandler = new WorkHandler(this, this.mAsyncThread.getLooper());
        this.mSyncHandler = new WorkHandler(this, this.mSyncThread.getLooper());
        this.mHandler = new MessengerHandler(this, getMainLooper(), this.mAsyncHandler, this.mSyncHandler);
        this.mMessenger = new Messenger(this.mHandler);
        this.mBRPluginHandler = new BRPluginHandlerImpl();
        this.mInvocationBRPluginHandler = new InvocationBRPluginHandlerImpl();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        BRLog.i(TAG, "onDestroy");
        HandlerThread handlerThread = this.mSyncThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        HandlerThread handlerThread2 = this.mAsyncThread;
        if (handlerThread2 != null) {
            handlerThread2.quitSafely();
        }
    }

    public BRPluginConfig onLoad(BRPluginConfig[] bRPluginConfigArr, int i) {
        if (bRPluginConfigArr != null && bRPluginConfigArr.length > 0) {
            for (BRPluginConfig bRPluginConfig : bRPluginConfigArr) {
                if (bRPluginConfig != null) {
                    return bRPluginConfig;
                }
            }
        }
        return null;
    }
}

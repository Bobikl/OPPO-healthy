package com.heytap.accessory.platform.services;

import android.app.Notification;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Process;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.heytap.accessory.Initializer;
import com.heytap.accessory.accessorymanager.ConnectConfig;
import com.heytap.accessory.api.IDeathCallback;
import com.heytap.accessory.api.IServiceConnectionIndicationCallback;
import com.heytap.accessory.base.AccessoryManager;
import com.heytap.accessory.base.DeathCallback;
import com.heytap.accessory.base.FrameworkConnection;
import com.heytap.accessory.base.bean.FrameworkServiceDescription;
import com.heytap.accessory.base.logging.a;
import com.heytap.accessory.bean.ServiceProfile;
import com.heytap.accessory.connectivity.constant.ConnectConstant;
import com.heytap.accessory.connectivity.core.c;
import com.heytap.accessory.logging.CommonLog;
import com.heytap.accessory.misc.utils.PlatformUtils;
import com.heytap.accessory.platform.FrameworkManagerServiceNative;
import com.heytap.accessory.platform.GenericServiceNative;
import com.heytap.accessory.platform.receivers.PackageEventReceiver;
import com.heytap.accessory.platform.services.FrameworkService;
import com.heytap.accessory.sdp.service.b;
import com.heytap.accessory.session.g;
import com.heytap.accessory.utils.ResourceParserException;
import com.heytap.accessory.utils.ServiceXmlReader;
import com.heytap.accessory.utils.XmlReader;
import com.heytap.accessory.utils.buffer.BufferPool;
import com.oplus.aiunit.vision.pca;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class FrameworkService extends Service {
    private static final int ACCESSORY_SERVICE_NOTIFICATION_ID = 416;
    public static final String CONNECTION_LOG = "AF.CONNECTION_LOG";
    private static final String DATABASE_VERSION = "DatabaseVersion";
    private static final int DB_CHANGE_REGISTER_INTENT_DELAY = 3000;
    private static final String INTENT_BASE_FRAMEWORK_SERVICE = "com.heytap.accessory.action.BASE_FRAMEWORK_MANAGER";
    private static final String INTENT_FRAMEWORK_SERVICE = "com.heytap.accessory.action.FRAMEWORK_MANAGER";
    public static final String MTU_TAG = "AF.BLE_MTU";
    private static final long RANDOM_SEED = 2147483647L;
    private static final String REGISTER_AGENT_TYPE = "RegisterAgentType";
    private static final String TAG = "FrameworkService";
    private static boolean sIsFrameworkStarted;
    private static boolean sIsRegisterIntentSent;
    private BroadcastReceiver mPackageEventReceiver;
    private static final Map<Long, FrameworkConnection> CLIENT_CONNECTION_MAP = new ConcurrentHashMap();
    public static boolean sConnectionLogOpened = false;
    private static RemoteCallbackList<IDeathCallback> sIDeathCallBackList = new RemoteCallbackList<IDeathCallback>() { // from class: com.heytap.accessory.platform.services.FrameworkService.1
        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(IDeathCallback iDeathCallback, Object obj) {
            long jLongValue = ((Long) obj).longValue();
            a.a(FrameworkService.TAG, "onCallbackDied proxyId:" + jLongValue);
            FrameworkConnection frameworkConnection = (FrameworkConnection) FrameworkService.CLIENT_CONNECTION_MAP.get(Long.valueOf(jLongValue));
            if (frameworkConnection == null) {
                a.b(FrameworkService.TAG, "Matching framework connection not found for proxyId: " + jLongValue);
                return;
            }
            a.c(FrameworkService.TAG, "Package [" + frameworkConnection.m() + "] has died!!");
            if (frameworkConnection.i() == null || !frameworkConnection.i().equals(iDeathCallback)) {
                a.b(FrameworkService.TAG, "Failed to get matching IDeath callback!");
            } else {
                FrameworkService.cleanUpFrameworkConnection(jLongValue);
            }
        }
    };
    private static RemoteCallbackList<DeathCallback> sDeathCallBackList = new RemoteCallbackList<DeathCallback>() { // from class: com.heytap.accessory.platform.services.FrameworkService.2
        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(DeathCallback deathCallback, Object obj) {
            a.a(FrameworkService.TAG, "onCallbackDied");
            long jLongValue = ((Long) obj).longValue();
            FrameworkConnection frameworkConnection = (FrameworkConnection) FrameworkService.CLIENT_CONNECTION_MAP.get(Long.valueOf(jLongValue));
            if (frameworkConnection == null) {
                a.b(FrameworkService.TAG, "Matching framework connection not found for proxyId: " + jLongValue + "(DeathCallback)");
                return;
            }
            a.c(FrameworkService.TAG, "Package [" + frameworkConnection.m() + "] has died!");
            if (frameworkConnection.h() == null || !frameworkConnection.h().equals(deathCallback)) {
                a.b(FrameworkService.TAG, "Failed to get matching death callback!(DeathCallback)");
            } else {
                FrameworkService.cleanUpFrameworkConnection(jLongValue);
            }
        }
    };
    private static final Map<String, Boolean> sPackageIntentInfo = new ArrayMap();

    private static FrameworkServiceDescription addLocalServiceRecord(FrameworkServiceDescription frameworkServiceDescription) {
        b bVarG = b.g();
        frameworkServiceDescription.b(0);
        FrameworkServiceDescription frameworkServiceDescriptionA = bVarG.a(frameworkServiceDescription);
        if (frameworkServiceDescriptionA == null) {
            a.b(TAG, "framework service description is null");
        }
        return frameworkServiceDescriptionA;
    }

    public static void cleanUpFrameworkConnection(String str) {
        if (str == null) {
            a.e(TAG, "CleanUp failed! Client value received is null!");
        } else {
            cleanUpFrameworkConnection(getClientConnectionKey(str));
        }
    }

    public static ServiceProfile convertDescriptionToProfile(FrameworkServiceDescription frameworkServiceDescription) {
        ServiceProfile serviceProfile = new ServiceProfile();
        serviceProfile.setId(frameworkServiceDescription.m());
        serviceProfile.setIsMexSupported(frameworkServiceDescription.j());
        serviceProfile.setIsSocketSupported(frameworkServiceDescription.r());
        serviceProfile.setTransportType(frameworkServiceDescription.i());
        serviceProfile.setVersion(frameworkServiceDescription.n());
        serviceProfile.setRole(frameworkServiceDescription.o());
        serviceProfile.setServiceLimit(frameworkServiceDescription.q());
        serviceProfile.setServiceTimeout(frameworkServiceDescription.h());
        return serviceProfile;
    }

    public static RegisterAgentType convertStringToType(String str) {
        a.a(TAG, "convertStringToType value is" + str);
        return "dynamic".equals(str) ? RegisterAgentType.DYNAMIC : RegisterAgentType.STATIC;
    }

    public static long getClientConnectionKey(String str) {
        for (Map.Entry<Long, FrameworkConnection> entry : getClientMap().entrySet()) {
            if (entry.getValue().g().equalsIgnoreCase(str)) {
                return entry.getKey().longValue();
            }
        }
        return -1L;
    }

    public static Map<Long, FrameworkConnection> getClientMap() {
        return CLIENT_CONNECTION_MAP;
    }

    public static FrameworkConnection getClientele(long j2) {
        return CLIENT_CONNECTION_MAP.get(Long.valueOf(j2));
    }

    private int getDbVersion() {
        return b.g().f();
    }

    public static ArrayList<ServiceProfile> getLocalRegisteredProfile(String str) {
        List<FrameworkServiceDescription> listF = b.g().f(str);
        if (listF.isEmpty()) {
            a.e(TAG, "getLocalRegisteredProfile, profiles is empty!");
            return new ArrayList<>();
        }
        ArrayList<ServiceProfile> arrayList = new ArrayList<>();
        Iterator<FrameworkServiceDescription> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(convertDescriptionToProfile(it.next()));
        }
        a.a(TAG, "packageName=" + str + "local registered service size is=" + listF.size());
        return arrayList;
    }

    public static Boolean getPackageInfo(String str) {
        return sPackageIntentInfo.get(str);
    }

    public static RegisterAgentType getRegisterAgentType(Context context, String str) {
        try {
            String metaDataLocation = XmlReader.getMetaDataLocation(context, str, REGISTER_AGENT_TYPE);
            a.a(TAG, str + "register agent type is:" + metaDataLocation);
            return convertStringToType(metaDataLocation);
        } catch (ResourceParserException | NullPointerException e2) {
            a.e(TAG, "getRegisterAgentType failed, exception is:" + e2);
            return RegisterAgentType.STATIC;
        }
    }

    private static long getUniqueId() {
        return UUID.randomUUID().getMostSignificantBits() & RANDOM_SEED;
    }

    private void initFramework(Context context) {
        PlatformUtils.initialise(context);
        BufferPool.initialise(context);
        c.b();
        b.g();
        com.heytap.accessory.sdk.accessorymanager.a.a(context);
    }

    public static boolean isFrameworkStarted() {
        return sIsFrameworkStarted;
    }

    public static boolean isRegisterIntentSent() {
        return sIsRegisterIntentSent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startRegisteredApps$0(List list, Context context, ServiceXmlReader serviceXmlReader) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            registerService(context, ((ResolveInfo) it.next()).activityInfo.applicationInfo.packageName, serviceXmlReader);
        }
    }

    public static long makeFrameworkConnection(String str, ResultReceiver resultReceiver, int i, IServiceConnectionIndicationCallback iServiceConnectionIndicationCallback) {
        FrameworkConnection clientele;
        int callingPid = Binder.getCallingPid();
        String uniqueClientVal = PlatformUtils.getUniqueClientVal(callingPid, str);
        long clientConnectionKey = getClientConnectionKey(uniqueClientVal);
        if (clientConnectionKey == -1 || (clientele = getClientele(clientConnectionKey)) == null) {
            clientConnectionKey = -1;
        } else {
            DeathCallback deathCallbackH = clientele.h();
            if (deathCallbackH == null) {
                clientele.i();
            }
            if (deathCallbackH == null || !deathCallbackH.asBinder().isBinderAlive()) {
                cleanUpFrameworkConnection(clientConnectionKey);
            } else {
                a.e(TAG, "Another binder from " + clientele.m() + " is still alive!");
                clientConnectionKey = -1;
            }
        }
        if (clientConnectionKey == -1) {
            do {
                clientConnectionKey = getUniqueId();
            } while (CLIENT_CONNECTION_MAP.get(Long.valueOf(clientConnectionKey)) != null);
        }
        FrameworkConnection frameworkConnection = new FrameworkConnection(str, callingPid);
        CLIENT_CONNECTION_MAP.put(Long.valueOf(clientConnectionKey), frameworkConnection);
        frameworkConnection.a(resultReceiver, i);
        frameworkConnection.a(iServiceConnectionIndicationCallback);
        a.c(TAG, "New client conn:" + uniqueClientVal + " with " + clientConnectionKey);
        return clientConnectionKey;
    }

    private void makeServiceForeGround() {
        Notification notification = new Notification();
        notification.flags |= 2;
        notification.tickerText = "Accessory Service started ...";
        startForeground(416, notification);
    }

    private void printMyInfo(Context context) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            packageInfo = packageManager != null ? packageManager.getPackageInfo(context.getPackageName(), 128) : null;
        } catch (PackageManager.NameNotFoundException e2) {
            a.e(TAG, "printInfo error," + e2);
        }
        String str = TAG;
        a.c(str, "******************************************************************");
        if (packageInfo != null) {
            a.c(str, "Accessory Framework for Android:" + packageInfo.versionName);
        }
        a.c(str, "Accessory Framework commit id is 6ed9664");
        a.c(str, "Accessory Framework build time is 251011");
        a.c(str, "Copyright (C), 2008-2021, OPLUS Mobile Comm Corp., Ltd.");
        a.c(str, "******************************************************************");
    }

    public static void putPackageInfo(String str, boolean z) {
        sPackageIntentInfo.put(str, Boolean.valueOf(z));
    }

    public static void registerComponents(String str, byte[] bArr) throws ResourceParserException {
        Set<FrameworkServiceDescription> setA = com.heytap.accessory.sdk.c.a(str, 0, bArr);
        StringBuilder sb = new StringBuilder();
        sb.append("registerComponents: ");
        String packageName = PlatformUtils.getContext().getPackageName();
        for (FrameworkServiceDescription frameworkServiceDescription : setA) {
            if (!frameworkServiceDescription.m().startsWith("system") || packageName.equals(str)) {
                if (saveServiceToDb(frameworkServiceDescription) == null) {
                    a.a(TAG, "service description is null");
                }
                sb.append("[");
                sb.append(frameworkServiceDescription.m());
                sb.append("; ");
                sb.append(frameworkServiceDescription.b());
                sb.append("; ");
                sb.append(frameworkServiceDescription.o());
                sb.append("] ");
            } else {
                a.a(TAG, str + "#" + frameworkServiceDescription.m() + " should not register in package:" + packageName);
            }
        }
        a.a(TAG, sb.toString());
    }

    public static void registerDeathCallback(DeathCallback deathCallback) throws RemoteException {
        if (deathCallback != null) {
            String uniqueClientVal = PlatformUtils.getUniqueClientVal(Binder.getCallingPid(), deathCallback.a());
            long clientConnectionKey = getClientConnectionKey(uniqueClientVal);
            String str = TAG;
            a.a(str, "registerDeathCallback getClientConnectionKey proxyId:" + clientConnectionKey + " appName: " + deathCallback.a());
            if (clientConnectionKey != -1) {
                FrameworkConnection frameworkConnection = CLIENT_CONNECTION_MAP.get(Long.valueOf(clientConnectionKey));
                if (frameworkConnection == null) {
                    a.b(str, "! Matching framework connection not found while registering the death callback for " + uniqueClientVal);
                    return;
                }
                frameworkConnection.a(deathCallback);
                a.a(str, "register sDeathCallBackList:" + sDeathCallBackList.register(deathCallback, Long.valueOf(clientConnectionKey)));
            }
        }
    }

    public static void registerIDeathCallback(long j2, String str, IDeathCallback iDeathCallback) {
        FrameworkConnection frameworkConnection = CLIENT_CONNECTION_MAP.get(Long.valueOf(j2));
        if (frameworkConnection == null) {
            a.b(TAG, "! Matching framework connection not found while registering the IDeath callback for " + str);
            return;
        }
        frameworkConnection.a(iDeathCallback);
        boolean zRegister = sIDeathCallBackList.register(iDeathCallback, Long.valueOf(j2));
        a.a(TAG, "register sDeathCallBackList:" + zRegister + " clientId: " + j2);
    }

    public static void registerService(Context context, String str, ServiceXmlReader serviceXmlReader) {
        if (!Initializer.useOAFApp(context) && !context.getPackageName().equals(str)) {
            a.a(TAG, "use aar mode,just need register itself:" + str);
            return;
        }
        if (getRegisterAgentType(context, str) == RegisterAgentType.DYNAMIC) {
            String str2 = TAG;
            a.e(str2, "FirstTimeRegister, the application uses dynamic registration to register the agent, not static registration.");
            List<FrameworkServiceDescription> listF = b.g().f(str);
            if (listF.isEmpty()) {
                a.a(str2, "This packageName has not registered an agent and does not need to be removed.");
            }
            a.a(str2, "packageName=" + str + "registered" + listF.size() + "agent, remove it.");
            b.g().e(str);
        }
        a.a(TAG, "startRegisterApps: " + str);
        try {
            byte[][] xml = serviceXmlReader.readXml(str);
            if (xml == null || xml.length < 2) {
                return;
            }
            registerComponents(str, xml[1]);
            AccessoryManager.h().a(str);
            sPackageIntentInfo.put(str, Boolean.FALSE);
        } catch (ResourceParserException e2) {
            a.b(TAG, "RegisterApp failed", e2);
        }
    }

    public static boolean registerServiceProfileDynamic(String str, byte[] bArr) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            registerComponents(str, bArr);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            a.a(TAG, "registerServiceProfileDynamic, costTime=" + jCurrentTimeMillis2);
            return true;
        } catch (ResourceParserException e2) {
            a.e(TAG, "registerServiceProfileDynamic failed, exception is:" + e2);
            return false;
        }
    }

    public static void removePackageInfo(String str) {
        sPackageIntentInfo.remove(str);
    }

    private static FrameworkServiceDescription saveServiceToDb(FrameworkServiceDescription frameworkServiceDescription) {
        frameworkServiceDescription.a(frameworkServiceDescription.i());
        frameworkServiceDescription.b(0);
        Pair<Integer, FrameworkServiceDescription> pairB = b.g().b(frameworkServiceDescription);
        if (((Integer) pairB.first).intValue() == 2) {
            a.a(TAG, frameworkServiceDescription.m() + " is already present in DB");
            return (FrameworkServiceDescription) pairB.second;
        }
        FrameworkServiceDescription frameworkServiceDescriptionAddLocalServiceRecord = addLocalServiceRecord(frameworkServiceDescription);
        if (frameworkServiceDescriptionAddLocalServiceRecord == null) {
            a.b(TAG, "Adding record to database failed");
            return null;
        }
        a.c(TAG, "register component profileId:" + frameworkServiceDescriptionAddLocalServiceRecord.m() + "(" + frameworkServiceDescriptionAddLocalServiceRecord.o() + ") agentId:" + frameworkServiceDescriptionAddLocalServiceRecord.a());
        return frameworkServiceDescriptionAddLocalServiceRecord;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startRegisteredApps(final Context context) {
        String str = TAG;
        a.c(str, "startRegisteredApps!!!!!!!!");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            final List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(new Intent("com.heytap.accessory.action.REGISTER_AGENT"), 64);
            final ServiceXmlReader serviceXmlReader = ServiceXmlReader.getInstance(context);
            com.heytap.accessory.base.thread.a.b().a("daemon").post(new Runnable() { // from class: com.oplus.aiunit.vision.ez7
                @Override // java.lang.Runnable
                public final void run() {
                    FrameworkService.lambda$startRegisteredApps$0(listQueryBroadcastReceivers, context, serviceXmlReader);
                }
            });
        }
        SharedPreferences.Editor editorEdit = PlatformUtils.getSharedPreferences(PlatformUtils.ACCESSORY_PREFS, 0).edit();
        editorEdit.putInt(DATABASE_VERSION, getDbVersion());
        editorEdit.apply();
        a.c(str, "Accessory framework started");
        sIsRegisterIntentSent = true;
    }

    public static boolean unRegisterServiceProfileDynamic(String str) {
        a.a(TAG, "unRegisterServiceProfileDynamic");
        b.g().e(str);
        return true;
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = getPackageManager();
            packageInfo = packageManager != null ? packageManager.getPackageInfo(PlatformUtils.getContext().getPackageName(), 128) : null;
        } catch (PackageManager.NameNotFoundException e2) {
            a.e(TAG, "dump error," + e2);
        }
        if (packageInfo != null) {
            String str = TAG;
            a.c(str, "******************************************************************");
            a.c(str, "Accessory Framework for Android:" + packageInfo.versionName);
            a.c(str, "Accessory Framework commit id is 6ed9664");
            a.c(str, "Accessory Framework build time is 251011");
            a.c(str, "Copyright (C), 2008-2021, OPLUS Mobile Comm Corp., Ltd.");
            a.c(str, "******************************************************************");
        }
        if (strArr.length == 2) {
            String str2 = strArr[0];
            String str3 = strArr[1];
            if (CONNECTION_LOG.equals(str2)) {
                sConnectionLogOpened = Boolean.parseBoolean(str3);
                a.c(TAG, "connection log isOpened:" + sConnectionLogOpened);
                CommonLog.enableDevelopMode(sConnectionLogOpened);
                return;
            }
            if (MTU_TAG.equals(str2)) {
                a.c(TAG, "set mtu to:" + str3);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        a.d(TAG, ">>> onBind() [sIsRegisterIntentSent:" + sIsRegisterIntentSent + "], action:" + intent.getAction());
        Context context = PlatformUtils.getContext();
        if (context == null) {
            context = getApplicationContext();
        }
        if ("com.heytap.accessory.action.BASE_FRAMEWORK_MANAGER".equals(intent.getAction())) {
            return new GenericServiceNative(context);
        }
        if ("com.heytap.accessory.action.FRAMEWORK_MANAGER".equals(intent.getAction())) {
            return new FrameworkManagerServiceNative(context);
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        int iMyPid = Process.myPid();
        int iMyTid = Process.myTid();
        String str = TAG;
        a.a(str, "onCreate, pid is " + iMyPid + "; tid is " + iMyTid);
        super.onCreate();
        Context applicationContext = getApplicationContext();
        initFramework(applicationContext);
        printMyInfo(applicationContext);
        SharedPreferences sharedPreferences = PlatformUtils.getSharedPreferences(PlatformUtils.ACCESSORY_PREFS, 0);
        boolean z = sharedPreferences.contains(DATABASE_VERSION) && getDbVersion() != sharedPreferences.getInt(DATABASE_VERSION, -1);
        a.a(str, "getDbVersion():" + getDbVersion());
        a.a(str, "sp db version:" + sharedPreferences.getInt(DATABASE_VERSION, -1));
        if (z) {
            a.c(str, "DB version changed. Wait for 3 seconds..");
            sIsRegisterIntentSent = false;
            new Handler().postDelayed(new Runnable() { // from class: com.heytap.accessory.platform.services.FrameworkService.3
                @Override // java.lang.Runnable
                public void run() {
                    FrameworkService.this.startRegisteredApps(PlatformUtils.getContext());
                }
            }, 3000L);
        } else {
            startRegisteredApps(applicationContext);
        }
        sIsFrameworkStarted = true;
        IntentFilter intentFilter = new IntentFilter();
        pca.a(intentFilter, "android.intent.action.PACKAGE_ADDED");
        pca.a(intentFilter, "android.intent.action.PACKAGE_REMOVED");
        pca.a(intentFilter, "android.intent.action.PACKAGE_CHANGED");
        pca.b(intentFilter, "package");
        IntentFilter intentFilter2 = new IntentFilter();
        pca.a(intentFilter2, "android.intent.action.BOOT_COMPLETED");
        PackageEventReceiver packageEventReceiver = new PackageEventReceiver();
        this.mPackageEventReceiver = packageEventReceiver;
        registerReceiver(packageEventReceiver, intentFilter);
        registerReceiver(this.mPackageEventReceiver, intentFilter2);
    }

    @Override // android.app.Service
    public void onDestroy() {
        a.e(TAG, "AFP FWK service destroyed!");
        AccessoryManager.h().c();
        sPackageIntentInfo.clear();
        sIsFrameworkStarted = false;
        BroadcastReceiver broadcastReceiver = this.mPackageEventReceiver;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        PushAutoTrackHelper.onServiceStartCommand(this, intent, i, i2);
        String str = TAG;
        Log.d(str, "onStartCommand");
        if (intent != null) {
            String action = intent.getAction();
            try {
                if ("com.heytap.accessory.action.AUTO_CONNECT".equalsIgnoreCase(action)) {
                    a.c(str, ">>> ACTION_ACCESSORY_AUTO_CONNECT");
                    String stringExtra = intent.getStringExtra("address");
                    int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_TRANSPORT, 0);
                    int intExtra2 = intent.getIntExtra("retryMode", 0);
                    int intExtra3 = intent.getIntExtra("uuid", 0);
                    Message messageObtainMessage = com.heytap.accessory.connectivity.core.b.d().obtainMessage();
                    messageObtainMessage.what = 123;
                    messageObtainMessage.obj = new ConnectConfig(stringExtra, intExtra, intExtra2, intExtra3);
                    messageObtainMessage.sendToTarget();
                } else if (ConnectConstant.ACTION_ACCESSORY_CONNECT.equals(action)) {
                    a.c(str, ">>> ACTION_ACCESSORY_CONNECT");
                    c.b().a(intent.getIntExtra(ConnectConstant.ACTION_TRANSPORT_TYPE, 0), intent.getStringExtra(ConnectConstant.ACTION_TRANSPORT_ADDRESS), 0);
                } else if (ConnectConstant.ACTION_ACCESSORY_DISCONNECT.equals(action)) {
                    a.c(str, ">>> ACTION_ACCESSORY_DISCONNECT");
                    c.b().a(intent.getIntExtra(ConnectConstant.ACTION_TRANSPORT_TYPE, 0), intent.getStringExtra(ConnectConstant.ACTION_TRANSPORT_ADDRESS));
                }
                super.onStartCommand(intent, i, i2);
            } catch (Exception e2) {
                a.e(TAG, "onStartCommand error," + e2);
            }
        }
        return Initializer.useOAFApp(this) ? 1 : 2;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 5 || i == 10 || i == 15 || i == 40 || i == 60 || i == 80) {
            a.c(TAG, "onTrimMemory(" + i + "): clearing caches...");
            BufferPool.clearCache(i);
            g.o().l();
        }
        super.onTrimMemory(i);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    public static boolean cleanUpFrameworkConnection(long j2) {
        Map<Long, FrameworkConnection> map = CLIENT_CONNECTION_MAP;
        FrameworkConnection frameworkConnection = map.get(Long.valueOf(j2));
        if (frameworkConnection == null) {
            a.e(TAG, "CleanUp failed! No framework connection found with for proxyId: " + j2);
            return false;
        }
        frameworkConnection.d();
        if (frameworkConnection.h() != null) {
            sDeathCallBackList.unregister(frameworkConnection.h());
        } else if (frameworkConnection.i() != null) {
            sIDeathCallBackList.unregister(frameworkConnection.i());
        } else {
            a.e(TAG, "CleanUp failed! No death callback found for proxy id : " + j2);
        }
        map.remove(Long.valueOf(j2));
        a.c(TAG, "CleanUp FWK conn for pkg:" + frameworkConnection.g());
        return true;
    }
}

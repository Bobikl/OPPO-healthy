package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.health.quickcard.channel.StepChannelHandler;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.hapjs.features.channel.ChannelService;
import org.hapjs.features.channel.HapChannelManager;
import org.hapjs.features.channel.appinfo.AndroidApplication;
import org.hapjs.features.channel.appinfo.HapApplication;

/* JADX INFO: loaded from: classes.dex */
public abstract class wgm extends Handler {
    public Map<Message, Integer> a;
    public Set<Integer> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f18258c;
    public int[] d;

    public wgm(Context context, Looper looper, int[] iArr) {
        super(looper);
        this.f18258c = context;
        this.b = new HashSet();
        this.d = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d6  */
    public boolean a(Message message) {
        boolean z;
        int i;
        HashMap map;
        PackageInfo packageInfo;
        boolean z2;
        boolean z3;
        int i2 = message.sendingUid;
        if (i2 < 0) {
            Log.e(StepChannelHandler.TAG, "Fail to get calling uid");
            return false;
        }
        if (this.b.contains(Integer.valueOf(i2))) {
            z = true;
        } else {
            String[] packagesForUid = this.f18258c.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length == 0) {
                Log.e(StepChannelHandler.TAG, "not Granted: pm.getPackagesForUid = null or empty");
            } else {
                int length = packagesForUid.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        String str = packagesForUid[i3];
                        if (!str.equals(this.f18258c.getPackageName())) {
                            Context context = this.f18258c;
                            if (TextUtils.isEmpty(str)) {
                                i = length;
                                z3 = false;
                            } else {
                                String strA = ohm.a(context.getPackageManager(), str);
                                if (TextUtils.isEmpty(strA)) {
                                    i = length;
                                } else {
                                    if ("390ac61475dfb8799c5e6250d0b914439432e3153d4532e23c94ef2720275a54".equals(strA)) {
                                        i = length;
                                    } else {
                                        Map<String, String> map2 = klm.a;
                                        if (map2 == null || map2.isEmpty()) {
                                            i = length;
                                            map = null;
                                        } else {
                                            HashMap map3 = new HashMap();
                                            PackageManager packageManager = context.getPackageManager();
                                            String strA2 = ohm.a(packageManager, "android");
                                            for (Map.Entry<String, String> entry : map2.entrySet()) {
                                                String key = entry.getKey();
                                                String value = entry.getValue();
                                                try {
                                                    packageInfo = packageManager.getPackageInfo(key, 64);
                                                } catch (Exception unused) {
                                                    packageInfo = null;
                                                }
                                                if (packageInfo != null) {
                                                    int i4 = length;
                                                    String strB = ohm.b(packageInfo.signatures[0].toByteArray());
                                                    if (TextUtils.equals(strB, strA2)) {
                                                        z2 = true;
                                                    } else {
                                                        int i5 = packageInfo.applicationInfo.flags;
                                                        if ((i5 & 1) == 0 && (i5 & 128) == 0) {
                                                            z2 = false;
                                                        } else {
                                                            z2 = true;
                                                        }
                                                    }
                                                    if (TextUtils.equals(strB, value) || z2) {
                                                        map3.put(key, strB);
                                                    }
                                                    length = i4;
                                                }
                                            }
                                            i = length;
                                            map = map3;
                                        }
                                        if (map == null || !TextUtils.equals(strA, (CharSequence) map.get(str))) {
                                        }
                                    }
                                    z3 = true;
                                }
                                z3 = false;
                            }
                            if (z3) {
                                this.b.add(Integer.valueOf(i2));
                            } else {
                                i3++;
                                length = i;
                            }
                        }
                        z = true;
                    } else {
                        Log.e(StepChannelHandler.TAG, "not trusted host: " + Arrays.toString(packagesForUid));
                    }
                }
            }
            z = false;
        }
        if (z) {
            return true;
        }
        Log.e(StepChannelHandler.TAG, "Received ungranted request");
        return false;
    }

    public final boolean b(Message message) {
        int[] iArr = this.d;
        if (iArr != null) {
            for (int i : iArr) {
                if (i == message.what) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:61:0x022b  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        boolean z;
        boolean z2;
        Message messageObtain;
        if (!b(message) && !a(message)) {
            Log.e(StepChannelHandler.TAG, "Received ungranted request");
            return;
        }
        ChannelService.b bVar = (ChannelService.b) this;
        int i = message.what;
        if (i == -3) {
            ChannelService.this.f20755c.removeCallbacksAndMessages(null);
            ChannelService.this.b.quit();
            ChannelService.this.b = null;
            return;
        }
        String str2 = "ChannelService";
        if (i == -2) {
            ChannelService channelService = ChannelService.this;
            for (Map.Entry<String, dum> entry : channelService.a.entrySet()) {
                dum value = entry.getValue();
                if (value != null) {
                    int i2 = value.f;
                    if (i2 == 1 || i2 == 2) {
                        value.d(2, "service exited abnormally", false, null);
                    }
                } else {
                    Log.e(str2, "ChannelService Destroy, channel" + entry.getKey() + " not found");
                }
            }
            channelService.a.clear();
            channelService.f20755c.sendEmptyMessage(-3);
            return;
        }
        if (i == -1) {
            ChannelService channelService2 = ChannelService.this;
            int i3 = ChannelService.d;
            channelService2.getClass();
            String str3 = (String) message.obj;
            dum dumVarRemove = channelService2.a.remove(str3);
            if (dumVarRemove == null) {
                Log.e(str2, "Fail to remote app death, channel " + str3 + " not found");
                return;
            }
            int i4 = dumVarRemove.f;
            if (i4 == 1 || i4 == 2) {
                dumVarRemove.d(3, "Remote app died.", false, null);
            }
            Log.v(str2, dumVarRemove + "'s hap app died.");
            return;
        }
        if (i != 0) {
            if (i == 2) {
                ChannelService channelService3 = ChannelService.this;
                int i5 = ChannelService.d;
                channelService3.getClass();
                String string = message.getData().getString("idAtReceiver");
                dum dumVar = channelService3.a.get(string);
                if (dumVar == null) {
                    Log.e(str2, "Fail to handle receive message, channel " + string + " not found");
                    return;
                }
                dumVar.f11681e.obtainMessage(3, message.getData().getBundle("content")).sendToTarget();
                Log.v(str2, dumVar + " receive msg from hap app.");
                return;
            }
            if (i != 3) {
                ChannelService channelService4 = ChannelService.this;
                int i6 = ChannelService.d;
                channelService4.getClass();
                String str4 = "Unknown msg type:" + message.what;
                if (message.replyTo != null) {
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = -1;
                    messageObtain2.getData().putString(DBHealthReviewPlan.DESC, str4);
                    try {
                        message.replyTo.send(messageObtain2);
                    } catch (RemoteException e2) {
                        Log.e(str2, "Fail to handle unknown msg type.", e2);
                    }
                }
                Log.e(str2, str4);
                return;
            }
            ChannelService channelService5 = ChannelService.this;
            int i7 = ChannelService.d;
            channelService5.getClass();
            String string2 = message.getData().getString("idAtReceiver");
            dum dumVarRemove2 = channelService5.a.remove(string2);
            if (dumVarRemove2 == null) {
                Log.e(str2, "Fail to handle close, channel " + string2 + " not found");
                return;
            }
            dumVarRemove2.f11681e.obtainMessage(4, message.getData().getString(EngineConstant.REASON)).sendToTarget();
            Log.v(str2, dumVarRemove2 + " closed by hap app.");
            return;
        }
        ChannelService channelService6 = ChannelService.this;
        int i8 = ChannelService.d;
        channelService6.getClass();
        String string3 = message.getData().getString("idAtClient");
        String string4 = message.getData().getString(TraceConstants.KEY_PKG_NAME);
        String string5 = message.getData().getString("signature");
        Messenger messenger = message.replyTo;
        int i9 = message.getData().getInt("clientPid");
        String string6 = message.getData().getString("channelType", "default");
        if (messenger == null) {
            Log.e(str2, "Fail to handle open channel message, reply to is null.");
            return;
        }
        HapApplication hapApplication = new HapApplication(string4, string5);
        try {
            if (!channelService6.f20755c.a(message)) {
                str = "Untrusted client apk.";
            } else {
                if (HapChannelManager.get().isInitialized()) {
                    HapChannelManager.ChannelHandler channelHandler = HapChannelManager.get().getChannelHandler(string6);
                    if (channelHandler == null || !channelHandler.accept(hapApplication)) {
                        str = "Open request refused.";
                    } else {
                        str = "ok";
                        z = true;
                    }
                    if (z) {
                        try {
                            AndroidApplication androidApplication = new AndroidApplication(channelService6, channelService6.getPackageName(), new String[0]);
                            HandlerThread handlerThread = channelService6.b;
                            if (i9 == Process.myPid()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            dum dumVar2 = new dum(string3, androidApplication, hapApplication, handlerThread, z2, string6);
                            String str5 = dumVar2.f11683l;
                            messageObtain = Message.obtain();
                            messageObtain.what = 1;
                            messageObtain.getData().putBoolean("result", z);
                            messageObtain.getData().putString("message", str);
                            messageObtain.getData().putString("idAtServer", str5);
                            zkm zkmVar = new zkm(channelService6, dumVar2);
                            messenger.getBinder().linkToDeath(zkmVar, 0);
                            dumVar2.f11682j.putIfAbsent(new nqm(channelService6, dumVar2, messenger, zkmVar), "");
                            channelService6.a.put(dumVar2.f11683l, dumVar2);
                            dumVar2.f11681e.obtainMessage(0, message.replyTo).sendToTarget();
                        } catch (RemoteException e3) {
                            e = e3;
                            str2 = str2;
                            Log.e(str2, "Fail to ack open.", e);
                            return;
                        }
                    } else {
                        messageObtain = Message.obtain();
                        messageObtain.what = 1;
                        messageObtain.getData().putBoolean("result", z);
                        messageObtain.getData().putString("message", str);
                        messageObtain.getData().putString("idAtServer", "-1");
                    }
                    messenger.send(messageObtain);
                    return;
                }
                str = "Native app is not ready.";
            }
            if (z) {
                AndroidApplication androidApplication2 = new AndroidApplication(channelService6, channelService6.getPackageName(), new String[0]);
                HandlerThread handlerThread2 = channelService6.b;
                if (i9 == Process.myPid()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                dum dumVar3 = new dum(string3, androidApplication2, hapApplication, handlerThread2, z2, string6);
                String str6 = dumVar3.f11683l;
                messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.getData().putBoolean("result", z);
                messageObtain.getData().putString("message", str);
                messageObtain.getData().putString("idAtServer", str6);
                zkm zkmVar2 = new zkm(channelService6, dumVar3);
                messenger.getBinder().linkToDeath(zkmVar2, 0);
                dumVar3.f11682j.putIfAbsent(new nqm(channelService6, dumVar3, messenger, zkmVar2), "");
                channelService6.a.put(dumVar3.f11683l, dumVar3);
                dumVar3.f11681e.obtainMessage(0, message.replyTo).sendToTarget();
            } else {
                messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.getData().putBoolean("result", z);
                messageObtain.getData().putString("message", str);
                messageObtain.getData().putString("idAtServer", "-1");
            }
            messenger.send(messageObtain);
            return;
        } catch (RemoteException e4) {
            e = e4;
        }
        z = false;
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j2) {
        return super.sendMessageAtTime(message, j2);
    }
}

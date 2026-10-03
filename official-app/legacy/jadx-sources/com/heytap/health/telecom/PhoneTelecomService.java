package com.heytap.health.telecom;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.telecom.CallAudioState;
import androidx.annotation.Nullable;
import androidx.core.os.BundleCompat;
import com.heytap.health.base.base.BaseService;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.eqj;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.iqj;
import com.oplus.aiunit.vision.of5;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class PhoneTelecomService extends BaseService {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Messenger f6069l;
    public long i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6070j = false;
    public final Messenger k = new Messenger(new a(Looper.myLooper()));

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            PhoneTelecomService.f6069l = message.replyTo;
            if (PhoneTelecomService.this.i == 0 || System.currentTimeMillis() - PhoneTelecomService.this.i > 10000) {
                PhoneTelecomService.this.h();
                PhoneTelecomService.this.i = System.currentTimeMillis();
            } else {
                a7b.f("TelHealth.PhoneTelecomService", "sendWatchAudioSupport,Repeat sending");
            }
            Bundle data = message.getData();
            if (message.what == 1) {
                int i = data.getInt(of5.ARG_EVENT_ID);
                String string = data.getString("call_number");
                String string2 = data.getString("call_id");
                int i2 = data.getInt("call_subId");
                int i3 = data.getInt("disconnectCause");
                boolean zIsMuted = data.getBoolean("mute_state");
                CallAudioState callAudioState = (CallAudioState) BundleCompat.getParcelable(data, "call_audio_state", CallAudioState.class);
                if (callAudioState != null) {
                    zIsMuted = callAudioState.isMuted();
                }
                boolean z = zIsMuted;
                a7b.f("TelHealth.PhoneTelecomService", "mPhoneTelecomMessageReceiver.handleMessage() called with: eventId = [" + i + "], callId = [" + string2 + "], callSubId = [" + i2 + "], callDisconnectCause = [" + i3 + "], mute = [" + z + "], callAudioState = [" + callAudioState + "]");
                if (i3 > 0) {
                    PhoneTelecomService.this.i = 0L;
                }
                if (i3 == 1) {
                    a7b.f("TelHealth.PhoneTelecomService", "callDisconnectCause is ERROR, skip");
                    return;
                }
                if (PhoneTelecomService.this.f6070j && i == 6) {
                    return;
                }
                TelecomOnceApiProvider.l(iqj.b(i), string, i2, i3, false, z, "");
                if (i == 7) {
                    TelecomOnceApiProvider.k(callAudioState);
                }
            }
        }
    }

    public static void g(Message message) {
        try {
            Messenger messenger = f6069l;
            if (messenger != null) {
                messenger.send(message);
                a7b.f("TelHealth.PhoneTelecomService", "phoneTelecomMessageSender() send Success" + message.getData().getInt(of5.ARG_EVENT_ID));
            } else {
                a7b.f("TelHealth.PhoneTelecomService", "phoneTelecomMessageSender() send Failed");
            }
        } catch (RemoteException e2) {
            a7b.b("TelHealth.PhoneTelecomService", "phoneTelecomMessageSender() " + e2.getMessage());
        }
    }

    public final void h() {
        Message messageObtain = Message.obtain();
        Bundle bundle = new Bundle();
        HashMap map = new HashMap();
        this.f6070j = false;
        for (UserDeviceInfo userDeviceInfo : gl4.managerApi.getBoundDeviceInfos()) {
            boolean zP5 = eqj.a(userDeviceInfo.getBleMac()).P5();
            if (userDeviceInfo.isCurrTerminal() && zP5 && userDeviceInfo.isConnect()) {
                this.f6070j = true;
                map.put(userDeviceInfo.getBleMac(), 1);
            } else {
                map.put(userDeviceInfo.getBleMac(), 0);
            }
        }
        String string = new JSONObject(map).toString();
        a7b.f("TelHealth.PhoneTelecomService", "watchAudioSupport = " + string);
        bundle.putInt(of5.ARG_EVENT_ID, 107);
        bundle.putString("watch_audio_support", string);
        messageObtain.setData(bundle);
        messageObtain.what = 2;
        g(messageObtain);
    }

    public final void i(Bundle bundle) {
        if ((bundle != null ? bundle.getInt(of5.ARG_EVENT_ID, -1) : -1) == 108) {
            h();
        }
        Message messageObtain = Message.obtain();
        messageObtain.setData(bundle);
        messageObtain.what = 2;
        g(messageObtain);
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        int intExtra = -1;
        try {
            intExtra = intent.getIntExtra("version", -1);
        } catch (Exception e2) {
            a7b.b("TelHealth.PhoneTelecomService", "onBind() " + e2.getMessage());
        }
        a7b.f("TelHealth.PhoneTelecomService", "onBind() called with: intent = [" + intent + "], protocolVer = [" + intExtra + "]");
        return this.k.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.i = 0L;
    }

    @Override // com.heytap.health.base.base.BaseService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        a7b.f("TelHealth.PhoneTelecomService", "onStartCommand() called with: intent = [" + intent + "], flags = [" + i + "], startId = [" + i2 + "]");
        if (intent == null) {
            return 2;
        }
        try {
            i(intent.getBundleExtra(PhoneTelecomUtils.EXTRA_DATA_BUNDLE));
            return 2;
        } catch (Exception e2) {
            a7b.b("TelHealth.PhoneTelecomService", "onStartCommand() " + e2.getMessage());
            return 2;
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        a7b.f("TelHealth.PhoneTelecomService", "onUnbind() called with: intent = [" + intent + "]");
        return super.onUnbind(intent);
    }
}

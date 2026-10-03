package com.heytap.wearable.watch.game;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.databaseengine.apiv2.common.PermissionCheckException;
import com.heytap.databaseengine.apiv2.device.game.IDeviceGame;
import com.heytap.databaseengine.apiv2.device.game.callback.OnRemoteDataChangeListener;
import com.heytap.databaseengine.apiv2.device.game.callback.OnRemoteResponseListener;
import com.heytap.databaseengine.apiv2.device.game.callback.OnRequestGameStatusListener;
import com.heytap.databaseengine.apiv2.device.game.model.GameDataWrapper;
import com.heytap.databaseengine.apiv2.device.game.model.GameHealthData;
import com.heytap.databaseengine.apiv2.device.game.model.GameInfo;
import com.heytap.databaseengine.apiv2.device.game.model.Record;
import com.heytap.databaseengine.model.HeartRate;
import com.heytap.health.core.provider.auth.AuthScope;
import com.heytap.health.device_data_sync.data_sync.IDeviceWearStatusService;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.protocol.fitness.GameAssistantProto$GameRoundData;
import com.heytap.health.protocol.fitness.GameAssistantProto$GameWearSetting;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ajl;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.f5h;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ls2;
import com.oplus.aiunit.vision.o6h;
import com.oplus.aiunit.vision.ol4;
import com.oplus.aiunit.vision.q28;
import com.oplus.aiunit.vision.rdf;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.ul4;
import com.oplus.aiunit.vision.v0j;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.x5h;
import com.oplus.aiunit.vision.xvj;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.weatherservicesdk.data.Weather;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceGameImpl extends IDeviceGame.Stub implements com.heytap.wearable.watch.game.a.b, ul4.a, Handler.Callback {
    private static final int HANDLE_GAME_ROUND_START = 3;
    private static final int HANDLE_GAME_START = 2;
    private static final int HANDLE_TIMEOUT = 1;
    private static final int SHOCK_OPEN = 2;
    private static final String TAG = "GameHealth.DGI";
    private static final int WEARING = 4;
    private com.heytap.wearable.watch.game.a gameMessageManager;
    private volatile boolean isInit;
    private GameInfo mCurrGameInfo;
    private String mEndRoundPackageName;
    private xvj mPermissionChecker;
    private boolean mPlaying;
    private OnRequestGameStatusListener onRequestGameStatusListener;
    private final List<OnRemoteDataChangeListener> mListeners = new ArrayList();
    private final List<OnRemoteResponseListener> mRemoteResponseListeners = new ArrayList();
    private final int mDelayMillis = 300;
    private final Handler mHandler = new Handler(Looper.getMainLooper(), this);
    private final ajl wearingStatusListener = new ajl() { // from class: com.oplus.aiunit.vision.ug5
        @Override // com.oplus.aiunit.vision.ajl
        public final void a(String str, int i) {
            this.a.lambda$new$0(str, i);
        }
    };
    private final BroadcastReceiver receiver = new a();
    private final int mGameCount = 0;
    boolean shockIsClose = true;
    private final Context mContext = b78.a().getApplicationContext();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("action_game_end".equals(intent.getAction())) {
                DeviceGameImpl deviceGameImpl = DeviceGameImpl.this;
                deviceGameImpl.sendGameEndToDevice(deviceGameImpl.mCurrGameInfo);
            }
        }
    }

    private void baseEnd() {
        if (!GameModeUtil.kb(12)) {
            GameModeUtil.currGameStatus = 16;
        }
        if (GameModeUtil.kb(16)) {
            this.gameMessageManager.h("");
            resetConfig(false);
        }
        GameModeUtil.ub(false);
    }

    private void baseEndRound(GameInfo gameInfo) {
        if (this.mCurrGameInfo != null && gameInfo.getPackageName().equals(this.mCurrGameInfo.getPackageName())) {
            this.mCurrGameInfo = gameInfo;
            this.mPlaying = false;
            GameModeUtil.currGameStatus = 24;
        }
        this.mEndRoundPackageName = gameInfo.getPackageName();
        GameModeUtil.ub(true);
    }

    private void basePause() {
        GameModeUtil.yb(32);
        GameModeUtil.currGameStatus |= 64;
        GameModeUtil.ub(false);
    }

    private void baseResume() {
        GameModeUtil.yb(64);
        GameModeUtil.currGameStatus |= 32;
        GameModeUtil.ub(true);
    }

    private void baseStart(GameInfo gameInfo) {
        GameInfo gameInfo2 = this.mCurrGameInfo;
        if (gameInfo2 == null || !gameInfo2.getPackageName().equals(gameInfo.getPackageName()) || !GameModeUtil.kb(12)) {
            this.mCurrGameInfo = gameInfo;
            GameModeUtil.currGameStatus = 2;
            this.gameMessageManager.h(gameInfo.getPackageName());
        }
        GameModeUtil.ub(true);
    }

    private void baseStartRound(GameInfo gameInfo) {
        this.mCurrGameInfo = gameInfo;
        GameModeUtil.currGameStatus = 12;
        GameModeUtil.ub(true);
    }

    private void checkGameStatus() {
        GameInfo gameInfoOnRequestGameStatus;
        a7b.f(TAG, "checkGameStatus");
        OnRequestGameStatusListener onRequestGameStatusListener = this.onRequestGameStatusListener;
        if (onRequestGameStatusListener == null) {
            a7b.m(TAG, "checkGameStatus --> will not sync because onRequestGameStatusListener is null");
            return;
        }
        try {
            gameInfoOnRequestGameStatus = onRequestGameStatusListener.onRequestGameStatus();
            try {
                restoreGameStatus(gameInfoOnRequestGameStatus);
            } catch (RemoteException e2) {
                e = e2;
                a7b.b(TAG, e.getMessage());
                if (gl4.managerApi.isCurrentConnected()) {
                    sendGameEndToDevice(gameInfoOnRequestGameStatus);
                }
            }
        } catch (RemoteException e3) {
            e = e3;
            gameInfoOnRequestGameStatus = null;
        }
    }

    private void init() {
        AuthScope.init(this.mContext);
        this.mPermissionChecker = new xvj(this.mContext);
        com.heytap.wearable.watch.game.a aVarA = com.heytap.wearable.watch.game.a.a();
        this.gameMessageManager = aVarA;
        aVarA.j(this);
        this.gameMessageManager.i(new com.heytap.wearable.watch.game.a.InterfaceC0815a() { // from class: com.oplus.aiunit.vision.sg5
            @Override // com.heytap.wearable.watch.game.a.InterfaceC0815a
            public final void a(GameAssistantProto$GameWearSetting gameAssistantProto$GameWearSetting) {
                this.a.setLocaConfigForDevice(gameAssistantProto$GameWearSetting);
            }
        });
        gl4.devicePrimary.nodeApi.g(this);
        rdf.a(this.mContext, this.receiver, new IntentFilter("action_game_end"), 4);
        ((IDeviceWearStatusService) x0.d().b("/device_data_sync/data_sync/DeviceWearStatusService").navigation()).bb(this.wearingStatusListener);
        this.isInit = true;
    }

    private boolean isWearing(int i) {
        return (i & 4) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleMessage$2(boolean z, int i) {
        if (z && i == 100000 && GameModeUtil.kb(12)) {
            this.mHandler.sendEmptyMessageDelayed(3, 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(String str, int i) {
        boolean zMb = GameModeUtil.mb();
        boolean z = i == 1;
        a7b.f(TAG, "onWearingStatusChanged-> gameForeground: " + zMb + "; wearing: " + z + "; mac: " + v0j.b(str));
        if (zMb && z && TextUtils.equals(gl4.managerApi.getCurrentConnectId(), str)) {
            checkGameStatus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onPeerConnected$1(x5h x5hVar) throws Throwable {
        if (needSyncGameStatus()) {
            checkGameStatus();
        }
    }

    private boolean needSyncGameStatus() {
        if (!q28.b(gl4.managerApi.getCurrentConnectId()).E7()) {
            a7b.f(TAG, "needSyncGameStatus() is false cause current device does not support game mode");
            return false;
        }
        if (((IDeviceWearStatusService) x0.d().b("/device_data_sync/data_sync/DeviceWearStatusService").navigation()).H0() == 1) {
            return true;
        }
        a7b.f(TAG, "needSyncGameStatus() is false cause device is not wearing");
        return false;
    }

    private void resetConfig(boolean z) {
        if (z) {
            ls2.o(this.mContext, false);
        }
    }

    private void restoreGameStatus(GameInfo gameInfo) {
        if (gameInfo == null) {
            a7b.m(TAG, "restoreGameStatus-> info is null");
            return;
        }
        int status = gameInfo.getStatus();
        a7b.f(TAG, "restoreGameStatus-> status: " + status);
        if (status == 0) {
            a7b.f(TAG, "restoreGameStatus-> status is illegal");
        } else if (saveGameStatus(gameInfo, status)) {
            syncGameStatus2Device();
        }
    }

    private boolean saveGameStatus(GameInfo gameInfo, int i) {
        boolean z;
        if (i == 2) {
            baseStart(gameInfo);
        } else if (i != 12) {
            if (i == 16) {
                baseEnd();
            } else if (i != 24) {
                if (i != 32) {
                    if (i != 64) {
                        z = false;
                    } else {
                        basePause();
                    }
                    a7b.f(TAG, "[saveGameStatus] success: " + z);
                    return z;
                }
                baseResume();
            } else if (GameModeUtil.rb(gameInfo.getPackageName())) {
                baseEndRound(gameInfo);
            } else {
                a7b.f(TAG, "endRound-->not support");
            }
        } else if (GameModeUtil.rb(gameInfo.getPackageName())) {
            baseStartRound(gameInfo);
        } else {
            a7b.f(TAG, "startRound-->not support");
        }
        z = true;
        a7b.f(TAG, "[saveGameStatus] success: " + z);
        return z;
    }

    private void sendGameUpdateDataToDevice(GameInfo gameInfo, GameDataWrapper gameDataWrapper) {
        if (gameInfo == null || gameDataWrapper == null || !GameModeUtil.Cb(this.gameMessageManager.d())) {
            return;
        }
        String packageName = gameInfo.getPackageName();
        Integer numQ6 = GameModeUtil.Q6(packageName);
        if (numQ6.intValue() == 0) {
            a7b.f(TAG, "game not support");
            return;
        }
        String strQ6 = GameModeUtil.q6(numQ6.intValue());
        int iGb = GameModeUtil.gb(gameDataWrapper.getKillType(), packageName);
        if (iGb == 0) {
            return;
        }
        GameMessageSender.eb(strQ6, GameModeUtil.hb(iGb), iGb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocaConfigForDevice(GameAssistantProto$GameWearSetting gameAssistantProto$GameWearSetting) {
        int gameState = gameAssistantProto$GameWearSetting.getGameState();
        StringBuilder sb = new StringBuilder();
        sb.append("watch state:");
        sb.append(gameState);
        if (gameState == 1) {
            resetConfig(true);
            return;
        }
        int gameSettingNotifySw = gameAssistantProto$GameWearSetting.getGameSettingNotifySw();
        StringBuilder sb2 = new StringBuilder();
        if (shockIsOpen(gameSettingNotifySw)) {
            this.shockIsClose = true;
            sb2.append("4d震动开启,");
        } else {
            sb2.append("4d震动关闭,");
            this.shockIsClose = false;
        }
        boolean zIsWearing = isWearing(gameSettingNotifySw);
        if (zIsWearing) {
            sb2.append("佩戴中");
        } else {
            sb2.append("未佩戴");
        }
        GameModeUtil.wb(zIsWearing);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("config:");
        sb3.append(gameSettingNotifySw);
        sb3.append("      configChange: ");
        sb3.append((Object) sb2);
        GameMessageSender.q6(true);
    }

    private boolean shockIsOpen(int i) {
        return (i & 2) != 0;
    }

    private void syncGameStatus2Device() {
        a7b.f(TAG, "syncGameStatus2Device");
        if (!GameModeUtil.nb()) {
            a7b.f(TAG, "syncGameStatus2Device() cancel syncing game status because gamespace version is too low");
        } else if (GameModeUtil.mb()) {
            this.mHandler.sendEmptyMessageDelayed(2, 300L);
        }
    }

    @Override // com.heytap.wearable.watch.game.a.b
    public void deviceRoundData(GameAssistantProto$GameRoundData gameAssistantProto$GameRoundData) {
        this.mHandler.removeMessages(1);
        GameHealthData gameHealthData = new GameHealthData();
        int gameReportStartTime = gameAssistantProto$GameRoundData.getGameReportStartTime();
        if (!TextUtils.isEmpty(this.mEndRoundPackageName)) {
            gameHealthData.setPackageName(this.mEndRoundPackageName);
            this.mEndRoundPackageName = "";
        }
        gameHealthData.setStartTime(((long) gameReportStartTime) * 1000);
        gameHealthData.setStressAvg(gameAssistantProto$GameRoundData.getGameReportStressAvg());
        gameHealthData.setCalorie(gameAssistantProto$GameRoundData.getGameReportCalorie());
        LinkedList linkedList = new LinkedList();
        byte[] byteArray = gameAssistantProto$GameRoundData.getGameReportHrDetail().toByteArray();
        int gameReportHrInterval = gameAssistantProto$GameRoundData.getGameReportHrInterval();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int length = byteArray.length;
        int i = 1;
        int i2 = 0;
        while (i2 < length) {
            byte b = byteArray[i2];
            HeartRate heartRate = new HeartRate();
            heartRate.setHeartRateValue(b);
            long j2 = ((long) ((i * gameReportHrInterval) + gameReportStartTime)) * 1000;
            heartRate.setDataCreatedTimestamp(j2);
            linkedList.add(heartRate);
            i++;
            i2++;
            jCurrentTimeMillis = j2;
        }
        gameHealthData.setEndTime(jCurrentTimeMillis);
        gameHealthData.setHeartRateList(linkedList);
        StringBuilder sb = new StringBuilder();
        sb.append("mRemoteResponseListeners size:");
        sb.append(this.mRemoteResponseListeners.size());
        sb.append("\ndeviceRoundData: ");
        sb.append(gameHealthData);
        Iterator<OnRemoteResponseListener> it = this.mRemoteResponseListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onResponse(0, gameHealthData);
            } catch (RemoteException e2) {
                a7b.c(TAG, "exception: ", e2);
            }
        }
    }

    @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
    public int end(GameInfo gameInfo) throws RemoteException {
        a7b.f(TAG, "end-->" + gameInfo.toString());
        baseEnd();
        this.mHandler.removeMessages(2);
        a7b.f(TAG, "end-->" + getStatusStr());
        if (!gl4.managerApi.isCurrentConnected()) {
            return 2;
        }
        sendGameEndToDevice(gameInfo);
        return 0;
    }

    @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
    public void endRound(GameInfo gameInfo) throws RemoteException {
        a7b.f(TAG, "endRound-->" + gameInfo.toString());
        if (!GameModeUtil.rb(gameInfo.getPackageName())) {
            a7b.f(TAG, "endRound-->not support");
            return;
        }
        baseEndRound(gameInfo);
        a7b.f(TAG, "endRound-->" + getStatusStr());
        if (gl4.managerApi.isCurrentConnected()) {
            sendGameRoundEndToDevice();
            return;
        }
        a7b.f(TAG, "endRound-->DEVICE_DISCONNECT");
        Iterator<OnRemoteResponseListener> it = this.mRemoteResponseListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onResponse(2, new GameHealthData());
            } catch (RemoteException e2) {
                a7b.c(TAG, "exception: ", e2);
            }
        }
    }

    public String getStatusStr() {
        StringBuilder sb = new StringBuilder("currGameStatus:" + GameModeUtil.currGameStatus + "  ");
        if (GameModeUtil.kb(2)) {
            sb.append("game start-->");
        }
        if (GameModeUtil.kb(12)) {
            sb.append("game round start-->");
        }
        if (GameModeUtil.kb(64)) {
            sb.append("game pause-->");
        }
        if (GameModeUtil.kb(32)) {
            sb.append("game resume-->");
        }
        if (GameModeUtil.kb(24)) {
            sb.append("game round end-->");
        }
        if (GameModeUtil.kb(16)) {
            sb.append("game end-->");
        }
        return sb.toString();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        int i = message.what;
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("mRemoteResponseListeners sieze:");
            sb.append(this.mRemoteResponseListeners.size());
            sb.append("\nendRound-->isTimeOut");
            for (OnRemoteResponseListener onRemoteResponseListener : this.mRemoteResponseListeners) {
                try {
                    GameHealthData gameHealthData = new GameHealthData();
                    gameHealthData.setPackageName(message.obj.toString());
                    onRemoteResponseListener.onResponse(-1, gameHealthData);
                } catch (RemoteException e2) {
                    a7b.c(TAG, "exception: ", e2);
                }
            }
        } else if (i == 2) {
            sendGameStartToDevice(this.mCurrGameInfo, new GameMessageSender.a() { // from class: com.oplus.aiunit.vision.tg5
                @Override // com.heytap.wearable.watch.game.GameMessageSender.a
                public final void a(boolean z, int i2) {
                    this.a.lambda$handleMessage$2(z, i2);
                }
            });
        } else if (i == 3) {
            sendGameRoundStartToDevice(this.mCurrGameInfo);
        }
        return true;
    }

    @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
    public boolean isConnectGameDevice() throws RemoteException {
        List<UserDeviceInfo> boundDeviceInfos = gl4.managerApi.getBoundDeviceInfos();
        if (boundDeviceInfos == null || boundDeviceInfos.isEmpty()) {
            return false;
        }
        for (UserDeviceInfo userDeviceInfo : boundDeviceInfos) {
            StringBuilder sb = new StringBuilder();
            sb.append("isConnectGameDevice: ");
            sb.append(userDeviceInfo.getDeviceType());
            if (q28.b(userDeviceInfo.getMac()).E7()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
    public boolean isPlaying() throws RemoteException {
        return this.mPlaying;
    }

    public void onDestroy() {
        synchronized (DeviceGameImpl.class) {
            if (this.isInit) {
                this.mContext.unregisterReceiver(this.receiver);
            }
        }
        ((IDeviceWearStatusService) x0.d().b("/device_data_sync/data_sync/DeviceWearStatusService").navigation()).l7(this.wearingStatusListener);
        gl4.devicePrimary.nodeApi.d(this);
        this.mHandler.removeMessages(1);
        this.mHandler.removeMessages(2);
        this.mHandler.removeMessages(3);
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerConnected(@NotNull Node node) {
        a7b.f(TAG, "onPeerConnected-->currGameStatus:" + getStatusStr());
        f5h.e(new o6h() { // from class: com.oplus.aiunit.vision.vg5
            @Override // com.oplus.aiunit.vision.o6h
            public final void a(x5h x5hVar) throws Throwable {
                this.a.lambda$onPeerConnected$1(x5hVar);
            }
        }).y(su8.c()).v();
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerDisconnected(@NonNull Node node) {
        ls2.o(this.mContext, false);
    }

    @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
    public void onPermissionChanged(boolean z) throws RemoteException {
        StringBuilder sb = new StringBuilder();
        sb.append("onPermissionChanged granted: ");
        sb.append(z);
        com.heytap.wearable.watch.game.a aVar = this.gameMessageManager;
        if (aVar != null) {
            aVar.g(z);
        }
    }

    @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame.Stub, android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (!this.isInit) {
            synchronized (DeviceGameImpl.class) {
                if (!this.isInit) {
                    init();
                }
            }
        }
        if (this.mPermissionChecker.a("GAME_SPACE") || this.mPermissionChecker.a("GAME_SPACE_OPLUS")) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        a7b.b(TAG, "permission check fail");
        parcel2.writeException(new PermissionCheckException());
        return true;
    }

    @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
    public void pause(GameInfo gameInfo) throws RemoteException {
        a7b.f(TAG, "pause-->" + gameInfo.toString());
        basePause();
        this.mHandler.removeMessages(2);
        if (!gl4.managerApi.isCurrentConnected()) {
            a7b.f(TAG, "pause-->DEVICE_DISCONNECT");
            return;
        }
        a7b.f(TAG, "pause-->" + getStatusStr());
        sendGamePauseToDevice(gameInfo);
    }

    @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
    public void resume(GameInfo gameInfo) throws RemoteException {
        a7b.f(TAG, "resume-->" + gameInfo.toString());
        baseResume();
        a7b.f(TAG, "resumeRound-->" + getStatusStr());
        if (gl4.managerApi.isCurrentConnected()) {
            sendGameResumeToDevice(gameInfo);
        } else {
            a7b.f(TAG, "resume-->DEVICE_DISCONNECT");
        }
    }

    public void sendGameEndToDevice(GameInfo gameInfo) {
        if (gameInfo == null || !GameModeUtil.Cb(this.gameMessageManager.d())) {
            a7b.f(TAG, "sendGameEndToDevice-->not Send");
            return;
        }
        Integer numQ6 = GameModeUtil.Q6(gameInfo.getPackageName());
        if (numQ6.intValue() == 0) {
            a7b.f(TAG, "game not support");
        } else {
            GameMessageSender.fb(numQ6.intValue(), GameModeUtil.q6(numQ6.intValue()), 1, (int) (System.currentTimeMillis() / 1000), null);
        }
    }

    public void sendGamePauseToDevice(GameInfo gameInfo) {
        if (gameInfo == null || !GameModeUtil.Cb(this.gameMessageManager.d())) {
            a7b.f(TAG, "sendGamePauseToDevice-->not Send");
            return;
        }
        Integer numQ6 = GameModeUtil.Q6(gameInfo.getPackageName());
        if (numQ6.intValue() == 0) {
            a7b.f(TAG, "game not support");
        } else {
            GameMessageSender.db(numQ6.intValue(), GameModeUtil.q6(numQ6.intValue()), 3, (int) (System.currentTimeMillis() / 1000), 0);
        }
    }

    public void sendGameResumeToDevice(GameInfo gameInfo) {
        if (gameInfo == null || !GameModeUtil.Cb(this.gameMessageManager.d())) {
            a7b.f(TAG, "sendGameResumeToDevice-->not Send");
            return;
        }
        Integer numQ6 = GameModeUtil.Q6(gameInfo.getPackageName());
        if (numQ6.intValue() == 0) {
            a7b.f(TAG, "game not support");
        } else {
            GameMessageSender.db(numQ6.intValue(), GameModeUtil.q6(numQ6.intValue()), 2, (int) (System.currentTimeMillis() / 1000), 0);
        }
    }

    public void sendGameRoundEndToDevice() {
        if (!GameModeUtil.Cb(this.gameMessageManager.d())) {
            a7b.f(TAG, "sendGameRoundEndToDevice-->not Send");
            return;
        }
        Integer numQ6 = GameModeUtil.Q6(this.mEndRoundPackageName);
        if (numQ6.intValue() == 0) {
            a7b.f(TAG, "game not support");
            return;
        }
        GameMessageSender.db(numQ6.intValue(), GameModeUtil.q6(numQ6.intValue()), 1, (int) (System.currentTimeMillis() / 1000), 0);
        GameInfo gameInfo = this.mCurrGameInfo;
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(1, gameInfo == null ? "" : gameInfo.getPackageName()), 10000L);
    }

    public void sendGameRoundStartToDevice(GameInfo gameInfo) {
        boolean zCb = GameModeUtil.Cb(this.gameMessageManager.d());
        boolean z = gameInfo == null;
        if (z || !zCb) {
            a7b.f(TAG, "sendGameRoundStartToDevice->not Send   info:" + z + "    send:" + zCb);
            return;
        }
        Integer numQ6 = GameModeUtil.Q6(gameInfo.getPackageName());
        if (numQ6.intValue() == 0) {
            a7b.f(TAG, "game not support");
            return;
        }
        String strQ6 = GameModeUtil.q6(numQ6.intValue());
        Record record = gameInfo.getRecord();
        if (record == null) {
            a7b.m(TAG, "sendGameRoundStartToDevice-> not send because record is null");
        } else {
            GameMessageSender.db(numQ6.intValue(), strQ6, 0, (int) (record.getStartTime() / 1000), 0);
        }
    }

    public void sendGameStartToDevice(GameInfo gameInfo, GameMessageSender.a aVar) {
        boolean zCb = GameModeUtil.Cb(this.gameMessageManager.d());
        boolean z = gameInfo == null;
        if (!z && zCb) {
            Integer numQ6 = GameModeUtil.Q6(gameInfo.getPackageName());
            if (numQ6.intValue() == 0) {
                a7b.f(TAG, "game not support");
                return;
            } else {
                GameMessageSender.fb(numQ6.intValue(), GameModeUtil.q6(numQ6.intValue()), 0, (int) (gameInfo.getStartTime() / 1000), aVar);
                return;
            }
        }
        a7b.f(TAG, "sendGameStartToDevice-->not Send   info:" + z + "    send:" + zCb);
    }

    @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
    public void setOnRequestGameStatusListener(OnRequestGameStatusListener onRequestGameStatusListener) throws RemoteException {
        this.onRequestGameStatusListener = onRequestGameStatusListener;
    }

    @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
    public void setOnResponseListener(OnRemoteResponseListener onRemoteResponseListener) throws RemoteException {
        if (onRemoteResponseListener == null || this.mRemoteResponseListeners.contains(onRemoteResponseListener)) {
            return;
        }
        this.mRemoteResponseListeners.clear();
        this.mRemoteResponseListeners.add(onRemoteResponseListener);
    }

    @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
    public void setSendConfig(boolean z) throws RemoteException {
        com.heytap.wearable.watch.game.a aVar = this.gameMessageManager;
        if (aVar != null) {
            aVar.k(z);
        }
    }

    @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
    public void setVerifyGameSwitch(boolean z) throws RemoteException {
        com.heytap.wearable.watch.game.a aVar = this.gameMessageManager;
        if (aVar != null) {
            aVar.l(z);
        }
    }

    @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
    public boolean shouldCallForwarding() throws RemoteException {
        return isPlaying() && isWearing() && v9g.w().r("key_callforwar", false);
    }

    @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
    public int start(GameInfo gameInfo) throws RemoteException {
        a7b.f(TAG, "start-->" + gameInfo.toString());
        baseStart(gameInfo);
        a7b.f(TAG, "start-->" + getStatusStr());
        ol4 ol4Var = gl4.managerApi;
        if (!ol4Var.isCurrentConnected()) {
            return 2;
        }
        String currentConnectId = ol4Var.getCurrentConnectId();
        if (GameModeUtil.pb(currentConnectId)) {
            GameModeUtil.Ab(currentConnectId, false);
        }
        boolean z = ((IDeviceWearStatusService) x0.d().b("/device_data_sync/data_sync/DeviceWearStatusService").navigation()).H0() == 1;
        if (z) {
            sendGameStartToDevice(gameInfo, null);
        }
        this.mHandler.removeMessages(2);
        StringBuilder sb = new StringBuilder();
        sb.append("wearing: ");
        sb.append(z);
        return 0;
    }

    @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
    public int startRound(GameInfo gameInfo) throws RemoteException {
        a7b.f(TAG, "startRound-->" + gameInfo.toString());
        if (!GameModeUtil.rb(gameInfo.getPackageName())) {
            a7b.f(TAG, "startRound-->not support");
            return 0;
        }
        baseStartRound(gameInfo);
        a7b.f(TAG, "startRound-->" + getStatusStr());
        if (gl4.managerApi.isCurrentConnected()) {
            sendGameRoundStartToDevice(gameInfo);
            return 0;
        }
        a7b.f(TAG, "startRound-->DEVICE_DISCONNECT");
        return 2;
    }

    @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
    public int startWithListener(String str, OnRemoteDataChangeListener onRemoteDataChangeListener) throws RemoteException {
        if (onRemoteDataChangeListener == null || this.mListeners.contains(onRemoteDataChangeListener)) {
            return -1;
        }
        this.mPlaying = true;
        this.mListeners.clear();
        this.mListeners.add(onRemoteDataChangeListener);
        return 0;
    }

    @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
    public void updateData(GameInfo gameInfo, GameDataWrapper gameDataWrapper) throws RemoteException {
        StringBuilder sb = new StringBuilder();
        sb.append("updateData-->killType:");
        sb.append(gameDataWrapper.getKillType());
        sb.append(Weather.SEPARATOR);
        sb.append(gameInfo.toString());
        if (gl4.managerApi.isCurrentConnected() && this.shockIsClose && GameModeUtil.sb(gameInfo.getPackageName())) {
            sendGameUpdateDataToDevice(gameInfo, gameDataWrapper);
        }
    }

    @Override // com.heytap.databaseengine.apiv2.device.game.IDeviceGame
    public boolean isWearing() throws RemoteException {
        return GameModeUtil.sIsWearing;
    }
}

package com.heytap.databaseengine.apiv2.device.game;

import androidx.annotation.Keep;
import com.heytap.databaseengine.apiv2.common.callback.HCallBack;
import com.heytap.databaseengine.apiv2.device.game.model.GameData;
import com.heytap.databaseengine.apiv2.device.game.model.GameInfo;
import com.oplus.aiunit.vision.oid;
import com.oplus.aiunit.vision.qid;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public interface IGameApi {
    void end(GameInfo gameInfo, HCallBack hCallBack);

    void endRound(GameInfo gameInfo);

    void isConnectGameDevice(HCallBack hCallBack);

    void isPlaying(HCallBack hCallBack);

    void isWearing(HCallBack hCallBack);

    void onPermissionChanged(boolean z);

    void pause(GameInfo gameInfo);

    void resume(GameInfo gameInfo);

    void setOnRequestStatusListener(oid oidVar);

    void setOnResponseListener(qid qidVar);

    void setSendConfig(boolean z);

    void setVerifyGameSwitch(boolean z);

    boolean shouldCallForwarding();

    void start(GameInfo gameInfo, HCallBack hCallBack);

    void startRound(GameInfo gameInfo, HCallBack hCallBack);

    void updateData(GameInfo gameInfo, GameData gameData);
}

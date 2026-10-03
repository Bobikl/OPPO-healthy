package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBody;
import com.heytap.health.watch.watchface.proto.Proto$SyncEventMessage;
import com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessage;
import com.heytap.health.watch.watchface.proto.Proto$WfEntity;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class y31 extends r31 {
    public static final String TAG = "BaseGenV3DataManager";

    public y31(Proto$DeviceInfo proto$DeviceInfo) {
        super(proto$DeviceInfo);
    }

    public final boolean G(Proto$WatchFaceMessage proto$WatchFaceMessage) {
        Proto$SyncEventMessage syncEventMsg;
        List<Proto$WfEntity> watchFacesList;
        boolean z;
        try {
            List<BaseWatchFaceBean> list = this.a;
            if (list != null && !list.isEmpty()) {
                Proto$MessageEnhanceBody enhanceBody = proto$WatchFaceMessage.getEnhanceBody();
                if (enhanceBody != null && (syncEventMsg = enhanceBody.getSyncEventMsg()) != null && (watchFacesList = syncEventMsg.getWatchFacesList()) != null && !watchFacesList.isEmpty()) {
                    if (watchFacesList.size() != list.size()) {
                        ltl.a(TAG, "[isSyncDataUnchanged] newFaces.size() != currentFavorites.size() " + watchFacesList.size() + " " + list.size());
                        return false;
                    }
                    Iterator<Proto$WfEntity> it = watchFacesList.iterator();
                    do {
                        z = true;
                        if (!it.hasNext()) {
                            return true;
                        }
                        Proto$WfEntity next = it.next();
                        Iterator<BaseWatchFaceBean> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z = false;
                                break;
                            }
                            BaseWatchFaceBean next2 = it2.next();
                            if (TextUtils.equals(next2.getWfUnique(), next.getWfUnique())) {
                                if (TextUtils.equals(next2.getWfVersion(), next.getWfVersion()) && next2.isCurrent() == next.getIsCurrent() && next2.getCurrentStyleIndex() == next.getStyleIndex()) {
                                    break;
                                }
                                return false;
                            }
                        }
                    } while (z);
                    return false;
                }
                return false;
            }
            ltl.a(TAG, "[isSyncDataUnchanged] currentFavorites == null || currentFavorites.isEmpty() ");
            return false;
        } catch (Exception e2) {
            ltl.i(TAG, "[isSyncDataUnchanged] exception: " + e2.getMessage());
            return false;
        }
    }

    @Override // com.oplus.aiunit.vision.r31, com.oplus.aiunit.vision.i11
    public void w(Proto$WatchFaceMessage proto$WatchFaceMessage) {
        ltl.a(TAG, "[onGetHistoryWfMsg] message " + proto$WatchFaceMessage);
        if (proto$WatchFaceMessage.getHeader().getProtocolVersion() == 2) {
            E(proto$WatchFaceMessage, false);
        } else {
            ltl.b(TAG, "[onGetHistoryWfMsg] BaseGenV3DataManager is not support low version device! ");
        }
    }

    @Override // com.oplus.aiunit.vision.r31, com.oplus.aiunit.vision.i11
    public void z(Proto$WatchFaceMessage proto$WatchFaceMessage) {
        ltl.a(TAG, "[onGetSyncMsg] message " + proto$WatchFaceMessage);
        if (proto$WatchFaceMessage.getHeader().getProtocolVersion() != 2) {
            ltl.b(TAG, "[onGetSyncMsg] BaseGenV3DataManager is not support low version device! ");
            return;
        }
        boolean zC = msg.a().c();
        ltl.d(TAG, "[onGetSyncMsg] sellMode " + zC + " mSyncFinished " + this.f12341j);
        if (zC && this.f12341j && G(proto$WatchFaceMessage)) {
            ltl.d(TAG, "[onGetSyncMsg] sell mode: sync data unchanged, skip");
            eoi.b(i(), -1, 3);
        } else {
            this.b.setNewCreationInteractive(true);
            E(proto$WatchFaceMessage, true);
        }
    }
}

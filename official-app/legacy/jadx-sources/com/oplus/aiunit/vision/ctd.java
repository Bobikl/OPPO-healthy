package com.oplus.aiunit.vision;

import com.heytap.health.wallet.model.otherdevice.OtherDeviceCard;
import com.heytap.health.wallet.network.door.rsp.ODeviceCardRspVO;
import com.oppo.lib.common.R$string;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class ctd {
    public static List<OtherDeviceCard> b(String str, String str2, List<ODeviceCardRspVO> list, final String str3) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (drk.e(list)) {
            return arrayList;
        }
        Collections.sort(list, new Comparator() { // from class: com.oplus.aiunit.vision.btd
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ctd.c(str3, (ODeviceCardRspVO) obj, (ODeviceCardRspVO) obj2);
            }
        });
        ArrayList arrayList2 = new ArrayList();
        ODeviceCardRspVO oDeviceCardRspVO = list.get(0);
        if (!"6".equals(str3)) {
            oDeviceCardRspVO.setOtherDeviceCplc(str2);
        }
        boolean z2 = true;
        for (int i = 1; i < list.size(); i++) {
            ODeviceCardRspVO oDeviceCardRspVO2 = list.get(i);
            if ("6".equals(str3)) {
                z = oDeviceCardRspVO2.getFlowNo() != null && oDeviceCardRspVO2.getFlowNo().equals(oDeviceCardRspVO.getFlowNo());
            } else {
                z = oDeviceCardRspVO2.getAppCode() != null && oDeviceCardRspVO2.getAppCode().equals(oDeviceCardRspVO.getAppCode());
                oDeviceCardRspVO2.setOtherDeviceCplc(str2);
            }
            if (!z) {
                if (z2) {
                    arrayList2.add(OtherDeviceCard.createOtherDeviceCard(oDeviceCardRspVO, oDeviceCardRspVO2.getDeviceName(), oDeviceCardRspVO.getOtherDeviceCplc(), false, 2));
                }
                z2 = true;
                oDeviceCardRspVO = oDeviceCardRspVO2;
            } else if (z2) {
                OtherDeviceCard otherDeviceCard = new OtherDeviceCard();
                otherDeviceCard.setViewType(1);
                otherDeviceCard.setTitle(qz0.mContext.getResources().getString(R$string.wallet_multiple_same_move_title, oDeviceCardRspVO2.getDisplayName()));
                arrayList.add(otherDeviceCard);
                arrayList.add(OtherDeviceCard.createOtherDeviceCard(oDeviceCardRspVO, oDeviceCardRspVO.getDeviceName(), oDeviceCardRspVO.getOtherDeviceCplc(), true, 2));
                arrayList.add(OtherDeviceCard.createOtherDeviceCard(oDeviceCardRspVO2, oDeviceCardRspVO2.getDeviceName(), oDeviceCardRspVO2.getOtherDeviceCplc(), true, 2));
                z2 = false;
            } else {
                arrayList.add(OtherDeviceCard.createOtherDeviceCard(oDeviceCardRspVO2, oDeviceCardRspVO2.getDeviceName(), oDeviceCardRspVO2.getOtherDeviceCplc(), true, 2));
            }
        }
        if (z2) {
            arrayList2.add(OtherDeviceCard.createOtherDeviceCard(oDeviceCardRspVO, oDeviceCardRspVO.getDeviceName(), oDeviceCardRspVO.getOtherDeviceCplc(), false, 2));
        }
        if (arrayList.size() > 0) {
            OtherDeviceCard otherDeviceCard2 = new OtherDeviceCard();
            otherDeviceCard2.setViewType(4);
            arrayList.add(otherDeviceCard2);
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public static /* synthetic */ int c(String str, ODeviceCardRspVO oDeviceCardRspVO, ODeviceCardRspVO oDeviceCardRspVO2) {
        if ("6".equals(str)) {
            if (oDeviceCardRspVO2.getFlowNo() == null) {
                return 0;
            }
            return oDeviceCardRspVO2.getFlowNo().compareTo(oDeviceCardRspVO.getFlowNo());
        }
        if (oDeviceCardRspVO2.getAppCode() == null) {
            return 0;
        }
        return oDeviceCardRspVO2.getAppCode().compareTo(oDeviceCardRspVO.getAppCode());
    }
}

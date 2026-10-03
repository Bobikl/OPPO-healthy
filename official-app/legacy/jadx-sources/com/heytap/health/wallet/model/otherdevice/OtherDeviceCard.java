package com.heytap.health.wallet.model.otherdevice;

import androidx.annotation.Keep;
import com.heytap.health.wallet.network.door.rsp.ODeviceCardRspVO;
import com.heytap.health.wallet.network.door.rsp.UserAllDeviceCardDto;
import com.oplus.aiunit.vision.bek;
import com.oplus.aiunit.vision.kfg;
import com.oplus.aiunit.vision.qz0;
import com.oppo.lib.common.R$string;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class OtherDeviceCard {
    public static final String CLOUD = "CLOUD";
    public static final String SHIFT_ABLE = "SHIFT_ABLE";
    public static final String SHIFT_UNABLE = "SHIFT_UNABLE";
    private String btnText;
    private String cardType;
    private String content;
    private String deviceName;
    private String displayDesc;
    private String imgUrl;
    private boolean isRadioButton;
    private boolean isSelect;
    private ODeviceCardRspVO oDeviceCardRspVO;
    private String otherDeviceCplc;
    private String tips;
    private String title;
    private int viewType;

    public static OtherDeviceCard createOtherDeviceCard(ODeviceCardRspVO oDeviceCardRspVO, String str, String str2, boolean z, int i) {
        OtherDeviceCard otherDeviceCard = new OtherDeviceCard();
        otherDeviceCard.setViewType(i);
        otherDeviceCard.setTitle(oDeviceCardRspVO.getDisplayName());
        if (oDeviceCardRspVO.getBalance() != null) {
            otherDeviceCard.setContent(qz0.mContext.getResources().getString(R$string.rmb_logo, String.format(bek.b(), "%.2f", Float.valueOf(oDeviceCardRspVO.getBalance().longValue() / 100.0f))));
        }
        otherDeviceCard.setRadioButton(z);
        otherDeviceCard.setImgUrl(oDeviceCardRspVO.getIconUrl());
        otherDeviceCard.setCardType(oDeviceCardRspVO.getCardType());
        otherDeviceCard.setoDeviceCardRspVO(oDeviceCardRspVO);
        otherDeviceCard.setDeviceName(str);
        otherDeviceCard.setDisplayDesc(oDeviceCardRspVO.getDisplayDesc());
        otherDeviceCard.setOtherDeviceCplc(str2);
        otherDeviceCard.setTips(qz0.mContext.getResources().getString(R$string.wallet_support_move_in));
        return otherDeviceCard;
    }

    public String getBtnText() {
        return this.btnText;
    }

    public String getCardType() {
        return this.cardType;
    }

    public String getContent() {
        return this.content;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getDisplayDesc() {
        return this.displayDesc;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public String getOtherDeviceCplc() {
        return this.otherDeviceCplc;
    }

    public String getTips() {
        return this.tips;
    }

    public String getTitle() {
        return this.title;
    }

    public UserAllDeviceCardDto getUserAllDeviceCardDto() {
        UserAllDeviceCardDto userAllDeviceCardDto = new UserAllDeviceCardDto();
        ODeviceCardRspVO oDeviceCardRspVO = this.oDeviceCardRspVO;
        if (oDeviceCardRspVO == null) {
            return userAllDeviceCardDto;
        }
        userAllDeviceCardDto.setAbf(oDeviceCardRspVO.getAbf());
        userAllDeviceCardDto.setAid(this.oDeviceCardRspVO.getData());
        userAllDeviceCardDto.setAllowedShiftIn(SHIFT_ABLE.equals(this.oDeviceCardRspVO.getCardStatus()));
        userAllDeviceCardDto.setAppCode(this.oDeviceCardRspVO.getAppCode());
        userAllDeviceCardDto.setCardImg(this.oDeviceCardRspVO.getIconUrl());
        userAllDeviceCardDto.setCardName(this.oDeviceCardRspVO.getDisplayName());
        userAllDeviceCardDto.setNeedCollectPhone((this.oDeviceCardRspVO.getNeedParams() & 1) != 0);
        userAllDeviceCardDto.setShiftOutOrderNo(this.oDeviceCardRspVO.getFlowNo());
        userAllDeviceCardDto.setShiftTips(this.oDeviceCardRspVO.getCardStatusTip());
        userAllDeviceCardDto.setCardShiftDesc(null);
        userAllDeviceCardDto.setCardShiftDescDetail(null);
        if ("6".equals(this.cardType)) {
            userAllDeviceCardDto.setCardType(kfg.CARD_TYPE_ENTRANCE_2);
        } else if ("5".equals(this.cardType)) {
            userAllDeviceCardDto.setCardType(kfg.CARD_TYPE_TRANSIT_1);
        } else {
            userAllDeviceCardDto.setCardType(null);
        }
        userAllDeviceCardDto.setOtherDeviceCplc(this.otherDeviceCplc);
        userAllDeviceCardDto.setDeviceName(this.deviceName);
        return userAllDeviceCardDto;
    }

    public int getViewType() {
        return this.viewType;
    }

    public ODeviceCardRspVO getoDeviceCardRspVO() {
        return this.oDeviceCardRspVO;
    }

    public boolean isRadioButton() {
        return this.isRadioButton;
    }

    public boolean isSelect() {
        return this.isSelect;
    }

    public void setBtnText(String str) {
        this.btnText = str;
    }

    public void setCardType(String str) {
        this.cardType = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDisplayDesc(String str) {
        this.displayDesc = str;
    }

    public void setImgUrl(String str) {
        this.imgUrl = str;
    }

    public void setOtherDeviceCplc(String str) {
        this.otherDeviceCplc = str;
    }

    public void setRadioButton(boolean z) {
        this.isRadioButton = z;
    }

    public void setSelect(boolean z) {
        this.isSelect = z;
    }

    public void setTips(String str) {
        this.tips = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setViewType(int i) {
        this.viewType = i;
    }

    public void setoDeviceCardRspVO(ODeviceCardRspVO oDeviceCardRspVO) {
        this.oDeviceCardRspVO = oDeviceCardRspVO;
    }
}

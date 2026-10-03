package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.device.protocol.emergency.EmergencySettingProto$AutoEmergencyCall;
import com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyContactInfo;
import com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyContactInfoList;
import com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyESIMNumber;
import com.heytap.health.device.protocol.emergency.EmergencySettingProto$EmergencyMedicalCardInfo;
import com.heytap.wearable.emergency.api.bean.EmergencyContact;
import com.heytap.wearable.emergency.api.bean.MedicalCard;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes3.dex */
public class sk6 {
    public static MessageEvent a() {
        return new MessageEvent(31, 4, null);
    }

    public static MessageEvent b() {
        return new MessageEvent(31, 6, null);
    }

    public static MessageEvent c(boolean z) {
        return new MessageEvent(31, 1, EmergencySettingProto$AutoEmergencyCall.newBuilder().setSwitch(z).build().toByteArray());
    }

    public static MessageEvent d(EmergencyContact emergencyContact) {
        EmergencySettingProto$EmergencyContactInfo.Builder builderNewBuilder = EmergencySettingProto$EmergencyContactInfo.newBuilder();
        builderNewBuilder.setName(emergencyContact.getName()).setCustomRelationship(emergencyContact.getCustomRelationship()).setNumber(emergencyContact.getMobile());
        if (emergencyContact.getRelationshipType() != null) {
            builderNewBuilder.setRelationship(emergencyContact.getRelationshipType().intValue());
        }
        EmergencySettingProto$EmergencyContactInfoList.Builder builderNewBuilder2 = EmergencySettingProto$EmergencyContactInfoList.newBuilder();
        builderNewBuilder2.addEmergencyContactInfoList(builderNewBuilder.build());
        return new MessageEvent(31, 3, builderNewBuilder2.build().toByteArray());
    }

    public static MessageEvent e(String str) {
        EmergencySettingProto$EmergencyESIMNumber.Builder builderNewBuilder = EmergencySettingProto$EmergencyESIMNumber.newBuilder();
        builderNewBuilder.setNumber(str);
        return new MessageEvent(31, 7, builderNewBuilder.build().toByteArray());
    }

    public static MessageEvent f(MedicalCard medicalCard) {
        boolean zEqualsIgnoreCase = "M".equalsIgnoreCase(medicalCard.getUserInfo().getSex());
        String birthday = medicalCard.getUserInfo().getBirthday();
        if (TextUtils.isEmpty(birthday)) {
            birthday = UserInfo.BIRTHDAY_DEFAULT;
        }
        String strReplace = birthday.replace("-", "");
        if (strReplace.length() != 8) {
            a7b.b("EmergencyPresenter", "error birthday format with " + strReplace);
            return null;
        }
        int i = Byte.parseByte(strReplace.substring(6)) | (Short.parseShort(strReplace.substring(0, 4)) << 16) | (Byte.parseByte(strReplace.substring(4, 6)) << 8);
        int i2 = TextUtils.isEmpty(medicalCard.getUserInfo().getHeight()) ? Integer.parseInt(UserInfo.HEIGHT_DEFAULT) / 10 : Integer.parseInt(medicalCard.getUserInfo().getHeight()) / 10;
        int i3 = TextUtils.isEmpty(medicalCard.getUserInfo().getWeight()) ? Integer.parseInt("60000") / 1000 : Integer.parseInt(medicalCard.getUserInfo().getWeight()) / 1000;
        EmergencySettingProto$EmergencyMedicalCardInfo.Builder builderNewBuilder = EmergencySettingProto$EmergencyMedicalCardInfo.newBuilder();
        builderNewBuilder.setName(medicalCard.getName()).setGender(zEqualsIgnoreCase ? 1 : 0).setBirthday(i).setHeight(i2).setWeight(i3).setBloodType(medicalCard.getBloodType()).setMedicalHistory(medicalCard.getMedicalHistory()).setAllergicReaction(medicalCard.getAllergicReaction()).setMedicine(medicalCard.getMedicine());
        return new MessageEvent(31, 5, builderNewBuilder.build().toByteArray());
    }
}

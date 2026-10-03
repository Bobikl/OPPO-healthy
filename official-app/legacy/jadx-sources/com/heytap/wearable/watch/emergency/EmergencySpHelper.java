package com.heytap.wearable.watch.emergency;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.wearable.emergency.api.bean.EmergencyContact;
import com.heytap.wearable.emergency.api.bean.MedicalCard;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.sc8;
import com.oplus.aiunit.vision.u7m;
import com.oplus.aiunit.vision.v9g;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class EmergencySpHelper {
    public static final String KEY_EMERGENCY_CONTACT_INFO = "key_emergency_contact_info";
    public static final String KEY_EMERGENCY_MEDICAL_CARD_INFO = "key_emergency_medical_card_info";
    private static final String TAG = "EmergencySpHelper";

    @Nullable
    public static EmergencyContact getEmergencyContactInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            a7b.b(TAG, "getEmergencyContactInfo with empty mac");
            return null;
        }
        String strE = v9g.x("sp_name_emergency").E(KEY_EMERGENCY_CONTACT_INFO + str, "");
        if (TextUtils.isEmpty(strE)) {
            StringBuilder sb = new StringBuilder();
            sb.append("getEmergencyContactInfo returns null with mac is ");
            sb.append(str);
            return null;
        }
        try {
            strE = u7m.e(strE);
        } catch (Exception e2) {
            a7b.b(TAG, "getEmergencyContactInfo with exception: " + e2.getMessage());
        }
        return (EmergencyContact) sc8.a(strE, EmergencyContact.class);
    }

    public static MedicalCard getEmergencyMedicalCard(String str) {
        if (TextUtils.isEmpty(str)) {
            a7b.b(TAG, "getEmergencyMedicalCard with empty mac");
            return null;
        }
        String strE = v9g.x("sp_name_emergency").E(KEY_EMERGENCY_MEDICAL_CARD_INFO + str, "");
        if (TextUtils.isEmpty(strE)) {
            StringBuilder sb = new StringBuilder();
            sb.append("getEmergencyMedicalCard returns null with mac is ");
            sb.append(str);
            return null;
        }
        try {
            strE = u7m.e(strE);
        } catch (Exception e2) {
            a7b.b(TAG, "getEmergencyMedicalCard with exception: " + e2.getMessage());
        }
        return (MedicalCard) sc8.a(strE, MedicalCard.class);
    }

    public static void saveEmergencyContactInfo(String str, EmergencyContact emergencyContact) {
        if (TextUtils.isEmpty(str)) {
            a7b.b(TAG, "saveEmergencyContactInfo with empty mac");
            return;
        }
        String strG = sc8.g(emergencyContact);
        try {
            strG = u7m.a(strG);
        } catch (Exception e2) {
            a7b.b(TAG, "saveEmergencyContactInfo with exception: " + e2.getMessage());
        }
        v9g.x("sp_name_emergency").U(KEY_EMERGENCY_CONTACT_INFO + str, strG);
    }

    public static void saveEmergencyMedicalCardInfo(String str, MedicalCard medicalCard) {
        if (TextUtils.isEmpty(str)) {
            a7b.b(TAG, "saveEmergencyMedicalCardInfo with empty mac");
            return;
        }
        String strG = sc8.g(medicalCard);
        try {
            strG = u7m.a(strG);
        } catch (Exception e2) {
            a7b.b(TAG, "saveEmergencyMedicalCardInfo with exception: " + e2.getMessage());
        }
        v9g.x("sp_name_emergency").U(KEY_EMERGENCY_MEDICAL_CARD_INFO + str, strG);
    }

    public static void syncMedicalCard(UserInfo userInfo) {
        String currentConnectId = gl4.managerApi.getCurrentConnectId();
        MedicalCard emergencyMedicalCard = getEmergencyMedicalCard(currentConnectId);
        if (emergencyMedicalCard != null) {
            emergencyMedicalCard.setUserInfo(userInfo);
            saveEmergencyMedicalCardInfo(currentConnectId, emergencyMedicalCard);
        }
    }
}

package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengineservice.db.table.DBUserGoalInfo;
import com.heytap.databaseengineservice.db.table.DBUserInfo;

/* JADX INFO: loaded from: classes15.dex */
public class bt4 {
    public static void a(DBUserInfo dBUserInfo, int i, String str) {
        try {
            dBUserInfo.setBirthday(qa2.dbDataEncrypt.k0(dBUserInfo.getBirthday(), str, str.substring(0, 16), i));
        } catch (Exception e2) {
            cj4.b("DataEncryptDecryptUtil", "userInfo birthday crypt exception = " + e2.getMessage());
            if (2 == i) {
                if (TextUtils.isEmpty(dBUserInfo.getBirthday()) || !tvi.v(dBUserInfo.getBirthday().replace("-", ""))) {
                    dBUserInfo.setBirthday(UserInfo.BIRTHDAY_DEFAULT);
                } else {
                    dBUserInfo.setBirthday(dBUserInfo.getBirthday());
                }
            }
        }
    }

    public static void b(DBUserInfo dBUserInfo, int i, String str) {
        try {
            dBUserInfo.setHeight(qa2.dbDataEncrypt.k0(dBUserInfo.getHeight(), str, str.substring(0, 16), i));
        } catch (Exception e2) {
            cj4.b("DataEncryptDecryptUtil", "userInfo height crypt exception = " + e2.getMessage());
            if (2 == i) {
                if (tvi.v(dBUserInfo.getHeight())) {
                    dBUserInfo.setHeight(dBUserInfo.getHeight());
                } else {
                    dBUserInfo.setHeight(UserInfo.HEIGHT_DEFAULT);
                }
            }
        }
    }

    public static void c(DBUserInfo dBUserInfo, int i, String str) {
        try {
            dBUserInfo.setSex(qa2.dbDataEncrypt.k0(dBUserInfo.getSex(), str, str.substring(0, 16), i));
        } catch (Exception e2) {
            cj4.b("DataEncryptDecryptUtil", "userInfo sex crypt exception = " + e2.getMessage());
            if (2 == i) {
                dBUserInfo.setSex(UserInfo.SEX_FEMALE.equals(dBUserInfo.getSex()) ? dBUserInfo.getSex() : "M");
            }
        }
    }

    public static void d(DBUserInfo dBUserInfo, int i, String str) {
        try {
            dBUserInfo.setWeight(qa2.dbDataEncrypt.k0(dBUserInfo.getWeight(), str, str.substring(0, 16), i));
        } catch (Exception e2) {
            cj4.b("DataEncryptDecryptUtil", "userInfo weight crypt exception = " + e2.getMessage());
            if (2 == i) {
                if (tvi.v(dBUserInfo.getWeight())) {
                    dBUserInfo.setWeight(dBUserInfo.getWeight());
                } else {
                    dBUserInfo.setWeight("60000");
                }
            }
        }
    }

    public static void e(DBUserInfo dBUserInfo, int i, String str) {
        b(dBUserInfo, i, str);
        d(dBUserInfo, i, str);
        c(dBUserInfo, i, str);
        a(dBUserInfo, i, str);
    }

    public static void f(DBUserGoalInfo dBUserGoalInfo, int i) {
        if (dBUserGoalInfo == null || dBUserGoalInfo.getSsoid() == null) {
            return;
        }
        String strY = qa2.dbDataEncrypt.Y("DataEncryptDecryptUtil", dBUserGoalInfo.getSsoid() + "_" + dBUserGoalInfo.getType(), i);
        if (strY == null) {
            return;
        }
        try {
            dBUserGoalInfo.setValue(qa2.dbDataEncrypt.k0(dBUserGoalInfo.getValue(), strY, strY.substring(0, 16), i));
        } catch (Exception e2) {
            cj4.b("DataEncryptDecryptUtil", "userGoalInfo crypt exception = " + e2.getMessage() + ", type = " + dBUserGoalInfo.getType());
            if (2 == i) {
                dBUserGoalInfo.setValue(dBUserGoalInfo.getValue());
            }
        }
    }

    public static void g(DBUserInfo dBUserInfo, int i) {
        if (dBUserInfo == null || TextUtils.isEmpty(dBUserInfo.getSsoid())) {
            cj4.b("DataEncryptDecryptUtil", "user info is null or user id is null");
            return;
        }
        String strE = qa2.dbDataEncrypt.E("DataEncryptDecryptUtil", dBUserInfo.getSsoid(), i);
        if (strE == null) {
            return;
        }
        e(dBUserInfo, i, strE);
    }
}

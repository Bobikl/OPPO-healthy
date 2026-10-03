package com.heytap.usercenter.accountsdk;

import android.text.TextUtils;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.log.UCLogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountResult {
    private static final String ACCOUNT_NAME = "accountName";
    private static final String CAN_JUMP_TO_BIND = "canJump2Bind";
    private static final String CONST_AVATAR = "avatar";
    private static final String IS_NAME_MODIFIED = "isNameModified";
    private static final String IS_NEED_BIND = "isNeedBind";
    private static final String OLD_USER_NAME = "oldUserName";
    private static final String RESULT_CODE = "resultCode";
    private static final String RESULT_MSG = "resultMsg";
    private static final String TAG = "AccountResult";
    public String accountName;
    private String avatar;
    private boolean canJump2Bind;
    private boolean isNameModified;
    private boolean isNeedBind;
    private String oldUserName;
    private int resultCode;
    private String resultMsg;

    public AccountResult() {
    }

    public static AccountResult fromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        AccountResult accountResult = new AccountResult();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull("accountName") && jSONObject.get("accountName") != JSONObject.NULL) {
                accountResult.setAccountName(jSONObject.getString("accountName"));
            }
            if (!jSONObject.isNull(OLD_USER_NAME) && jSONObject.get(OLD_USER_NAME) != JSONObject.NULL) {
                accountResult.setOldUserName(jSONObject.getString(OLD_USER_NAME));
            }
            if (!jSONObject.isNull(IS_NEED_BIND) && jSONObject.get(IS_NEED_BIND) != JSONObject.NULL) {
                accountResult.setNeedBind(jSONObject.getBoolean(IS_NEED_BIND));
            }
            if (!jSONObject.isNull(CAN_JUMP_TO_BIND) && jSONObject.get(CAN_JUMP_TO_BIND) != JSONObject.NULL) {
                accountResult.setCanJump2Bind(jSONObject.getBoolean(CAN_JUMP_TO_BIND));
            }
            if (!jSONObject.isNull(IS_NAME_MODIFIED) && jSONObject.get(IS_NAME_MODIFIED) != JSONObject.NULL) {
                accountResult.setNameModified(jSONObject.getBoolean(IS_NAME_MODIFIED));
            }
            if (!jSONObject.isNull("resultCode") && jSONObject.get("resultCode") != JSONObject.NULL) {
                int i = jSONObject.getInt("resultCode");
                if (i < 30000000) {
                    i += 30000000;
                }
                accountResult.setResultCode(i);
            }
            if (!jSONObject.isNull("resultMsg") && jSONObject.get("resultMsg") != JSONObject.NULL) {
                accountResult.setResultMsg(jSONObject.getString("resultMsg"));
            }
            if (!jSONObject.isNull("avatar") && jSONObject.get("avatar") != JSONObject.NULL) {
                accountResult.setAvatar(jSONObject.getString("avatar"));
            }
        } catch (JSONException e2) {
            UCLogUtil.e(TAG, e2.toString());
        }
        return accountResult;
    }

    public static String toJson(AccountResult accountResult) {
        if (accountResult == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("accountName", accountResult.getAccountName());
            jSONObject.put(OLD_USER_NAME, accountResult.getOldUserName());
            jSONObject.put(IS_NEED_BIND, accountResult.isNeedBind());
            jSONObject.put(CAN_JUMP_TO_BIND, accountResult.isCanJump2Bind());
            jSONObject.put(IS_NAME_MODIFIED, accountResult.isNameModified());
            jSONObject.put("resultCode", accountResult.getResultCode());
            jSONObject.put("resultMsg", accountResult.getResultMsg());
            jSONObject.put("avatar", accountResult.getAvatar());
            return jSONObject.toString();
        } catch (JSONException e2) {
            UCLogUtil.e(e2.getMessage());
            return null;
        }
    }

    public String getAccountName() {
        return this.accountName;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getOldUserName() {
        return this.oldUserName;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public String getResultMsg() {
        return this.resultMsg;
    }

    public boolean isCanJump2Bind() {
        return this.canJump2Bind;
    }

    public boolean isNameModified() {
        return this.isNameModified;
    }

    public boolean isNeedBind() {
        return this.isNeedBind;
    }

    public void setAccountName(String str) {
        this.accountName = str;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setCanJump2Bind(boolean z) {
        this.canJump2Bind = z;
    }

    public void setNameModified(boolean z) {
        this.isNameModified = z;
    }

    public void setNeedBind(boolean z) {
        this.isNeedBind = z;
    }

    public void setOldUserName(String str) {
        this.oldUserName = str;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public void setResultMsg(String str) {
        this.resultMsg = str;
    }

    public String toString() {
        return "AccountResult{accountName='" + this.accountName + "', oldUserName='" + this.oldUserName + "', avatar='" + this.avatar + "', isNeedBind=" + this.isNeedBind + ", canJump2Bind=" + this.canJump2Bind + ", isNameModified=" + this.isNameModified + ", resultCode=" + this.resultCode + ", resultMsg='" + this.resultMsg + "'}";
    }

    public AccountResult(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.resultCode = i;
        this.resultMsg = str;
        this.accountName = str2;
        this.oldUserName = str3;
        this.avatar = str4;
        this.isNameModified = z3;
        this.isNeedBind = z;
        this.canJump2Bind = z2;
    }
}

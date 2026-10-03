package com.oplus.accountsdk.open.core.net.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcOpenLoginResult {
    public String accountName;
    public AccountTokenInfo accountToken;
    public String avatarUrl;
    public String countryCode;
    public String deviceId;
    public String firstName;

    @SerializedName(alternate = {"nameModified"}, value = "isNameModified")
    public boolean isNameModified;
    public boolean isNeedBind;
    public String lastName;
    public String loginUsername;
    public String primaryToken;

    @SerializedName(alternate = {"refreshTicket"}, value = SpeechConstant.KEY_USER_TOKEN)
    public String refreshTicket;
    public Map<String, String> secondaryTokenMap;
    public String ssoid;

    @SerializedName("realName")
    public String userFullName;
    public String userName;

    @Keep
    public static class AccountTokenInfo {
        public String accessToken;
        public String idToken;
        public String refreshToken;
    }
}

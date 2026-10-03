package com.heytap.databaseengineservice.sync.weight;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.h27;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class UserTagCloudBody {

    @SerializedName(h27.FAMILY_KEY_PUSH_FRIEND_AVATAR)
    private String avatar;

    @SerializedName("birthday")
    private String birthday;

    @SerializedName("createTime")
    private long createTime;

    @SerializedName(Fields.HEIGHT_FIELD)
    private String height;

    @SerializedName("sex")
    private String sex;

    @SerializedName("userName")
    private String userName;

    @SerializedName("userTagId")
    private String userTagId;

    public String getAvatar() {
        return this.avatar;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getHeight() {
        return this.height;
    }

    public String getSex() {
        return this.sex;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getUserTagId() {
        return this.userTagId;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public void setHeight(String str) {
        this.height = str;
    }

    public void setSex(String str) {
        this.sex = str;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public void setUserTagId(String str) {
        this.userTagId = str;
    }
}

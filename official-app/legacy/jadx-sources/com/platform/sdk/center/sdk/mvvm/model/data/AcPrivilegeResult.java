package com.platform.sdk.center.sdk.mvvm.model.data;

import com.google.gson.Gson;
import com.platform.usercenter.basic.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcPrivilegeResult {
    public String messageId;
    public String messageTitle;
    public List<PrivilegeInfo> privilegeList;

    @Keep
    public static class PrivilegeInfo {
        public String imgPath;
        public String introduction;
        public String title;

        public String getImgPath() {
            return this.imgPath;
        }

        public String getIntroduction() {
            return this.introduction;
        }

        public String getTitle() {
            return this.title;
        }

        public void setImgPath(String str) {
            this.imgPath = str;
        }

        public void setIntroduction(String str) {
            this.introduction = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getMessageTitle() {
        return this.messageTitle;
    }

    public List<PrivilegeInfo> getPrivilegeList() {
        return this.privilegeList;
    }

    public void setMessageId(String str) {
        this.messageId = str;
    }

    public void setMessageTitle(String str) {
        this.messageTitle = str;
    }

    public void setPrivilegeList(List<PrivilegeInfo> list) {
        this.privilegeList = list;
    }

    public String toString() {
        return "VIPPrivilegeResult{ info=" + new Gson().toJson(this) + '}';
    }
}

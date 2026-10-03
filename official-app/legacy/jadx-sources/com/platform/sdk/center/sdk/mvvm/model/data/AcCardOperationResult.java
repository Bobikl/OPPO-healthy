package com.platform.sdk.center.sdk.mvvm.model.data;

import com.platform.usercenter.account.proxy.entity.LinkDataAccount;
import com.platform.usercenter.basic.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcCardOperationResult {
    public String code;
    public OperationInfo info;
    public boolean isSuccess;
    public String msg;

    @Keep
    public static class OperationInfo {
        public List<LoginRemindListBean> remindList;

        @Keep
        public static class LoginRemindListBean {
            public String content;
            public int id;
            public LinkDataAccount linkInfo;
        }
    }
}

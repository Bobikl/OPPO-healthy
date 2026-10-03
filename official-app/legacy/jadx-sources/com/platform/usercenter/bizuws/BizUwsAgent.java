package com.platform.usercenter.bizuws;

import android.content.Context;
import androidx.annotation.NonNull;
import com.heytap.webpro.score.DomainScoreEntity;
import com.oplus.aiunit.vision.lja;
import com.oplus.aiunit.vision.rr9;
import com.platform.usercenter.bizuws.gray.UwsGrayHelper;
import com.platform.usercenter.bizuws.interceptor.BizUwsBasicInfoInterceptor;
import com.platform.usercenter.bizuws.interceptor.BizUwsHeaderInterceptor;
import com.platform.usercenter.bizuws.interceptor.BizUwsLinkInfoInterceptor;
import com.platform.usercenter.bizuws.interceptor.BizUwsLogInterceptor;
import com.platform.usercenter.bizuws.interceptor.BizUwsToastInterceptor;
import com.platform.usercenter.bizuws.utils.UwsSha256Util;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class BizUwsAgent {

    public static class Builder {
        private final lja.b mBuilder;

        public Builder(@NotNull Context context, @NotNull String str) {
            this.mBuilder = BizUwsAgent.buildJsBridgeManager(context, str);
        }

        public Builder addDomainScoreList(List<DomainScoreEntity> list) {
            this.mBuilder.a(list);
            return this;
        }

        public Builder addJsApiInterceptor(@NonNull rr9 rr9Var) {
            this.mBuilder.b(rr9Var);
            return this;
        }

        public void build() {
            this.mBuilder.c();
        }

        public Builder setDomainScoreListString(String str) {
            this.mBuilder.d(str);
            return this;
        }

        public Builder setGrayConfigValue(String str) {
            BizUwsAgent.setGrayConfigValue(str);
            return this;
        }

        public Builder setGrayWhiteListString(Set<String> set) {
            BizUwsAgent.setGrayWhiteListString(set);
            return this;
        }

        public Builder setSha256Salt(String str) {
            BizUwsAgent.setSha256Salt(str);
            return this;
        }
    }

    static {
        GeneratedRegister.init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static lja.b buildJsBridgeManager(@NotNull Context context, @NotNull String str) {
        return lja.a(context, str).b(new BizUwsBasicInfoInterceptor()).b(new BizUwsHeaderInterceptor()).b(new BizUwsLinkInfoInterceptor()).b(new BizUwsLogInterceptor()).b(new BizUwsToastInterceptor());
    }

    public static void setGrayConfigValue(String str) {
        UwsGrayHelper.setGrayConfigValue(str);
    }

    public static void setGrayWhiteListString(Set<String> set) {
        UwsGrayHelper.setGrayWhiteListString(set);
    }

    public static void setSha256Salt(String str) {
        UwsSha256Util.setSha256Salt(str);
    }
}

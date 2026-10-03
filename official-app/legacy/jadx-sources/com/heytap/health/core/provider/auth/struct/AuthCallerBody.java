package com.heytap.health.core.provider.auth.struct;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.heytap.health.core.provider.adapter.open.SportDataAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class AuthCallerBody {
    private boolean authorized;
    private String clientId;
    private int clientOrder;
    private int clientShowApp;
    private String clientUrl;
    private String openId;
    private List<ScopeBean> scope;
    private long updateTimestamp;

    @Keep
    public static class ScopeBean {
        private String code;
        private String description;
        private String name;
        private int operationCode;
        private boolean selected = true;

        public ScopeBean(String str) {
            this.code = str;
            this.name = str;
        }

        public static List<String> convertScopeBeanToSelectedScopeSet(List<ScopeBean> list) {
            ArrayList arrayList = new ArrayList();
            for (ScopeBean scopeBean : list) {
                if (scopeBean.selected) {
                    arrayList.add(scopeBean.code);
                    if ("READ_DAILY_ACTIVITY".equals(scopeBean.code)) {
                        arrayList.add(SportDataAdapter.READ_SCOPE);
                    }
                }
            }
            return arrayList;
        }

        public String getCode() {
            return this.code;
        }

        public String getDescription() {
            return this.description;
        }

        public String getName() {
            return this.name;
        }

        public int getOperationCode() {
            return this.operationCode;
        }

        public boolean isSelected() {
            return this.selected;
        }

        public void setCode(String str) {
            this.code = str;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setOperationCode(int i) {
            this.operationCode = i;
        }

        public void setSelected(boolean z) {
            this.selected = z;
        }

        @NonNull
        public String toString() {
            return "ScopeBean{code='" + this.code + "', name='" + this.name + "', operationCode=" + this.operationCode + ", description='" + this.description + "', selected=" + this.selected + '}';
        }
    }

    public String getClientId() {
        return this.clientId;
    }

    public int getClientOrder() {
        return this.clientOrder;
    }

    public int getClientShowApp() {
        return this.clientShowApp;
    }

    public String getClientUrl() {
        return this.clientUrl;
    }

    public String getOpenId() {
        return this.openId;
    }

    public List<ScopeBean> getScope() {
        return this.scope;
    }

    public long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public boolean isAuthorized() {
        return this.authorized;
    }

    public void setAuthorized(boolean z) {
        this.authorized = z;
    }

    public void setClientId(String str) {
        this.clientId = str;
    }

    public void setClientOrder(int i) {
        this.clientOrder = i;
    }

    public void setClientShowApp(int i) {
        this.clientShowApp = i;
    }

    public void setClientUrl(String str) {
        this.clientUrl = str;
    }

    public void setOpenId(String str) {
        this.openId = str;
    }

    public void setScope(List<ScopeBean> list) {
        this.scope = list;
    }

    public void setUpdateTimestamp(long j2) {
        this.updateTimestamp = j2;
    }

    @NonNull
    public String toString() {
        return "AuthCallerBody{clientShowApp=" + this.clientShowApp + ", clientId='" + this.clientId + "', authorized=" + this.authorized + ", updateTimestamp=" + this.updateTimestamp + ", scope=" + this.scope + ", openId='" + this.openId + "'}";
    }
}

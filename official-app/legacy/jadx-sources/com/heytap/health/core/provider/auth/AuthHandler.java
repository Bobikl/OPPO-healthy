package com.heytap.health.core.provider.auth;

import android.content.ContentProvider;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.health.core.provider.SportHealthProvider;
import com.heytap.health.core.provider.adapter.open.SportDataAdapter;
import com.heytap.health.core.provider.auth.struct.AuthCallerBody;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.f74;
import com.oplus.aiunit.vision.g3k;
import com.oplus.aiunit.vision.lig;
import com.oplus.aiunit.vision.lza;
import com.oplus.aiunit.vision.pee;
import com.oplus.aiunit.vision.tuj;
import com.oplus.aiunit.vision.uuj;
import com.oplus.aiunit.vision.v9g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
@Keep
public class AuthHandler {
    public static final String NOTIFICATION_USER_PERMISSION_AGREE = "content://com.heytap.health.sporthealthprovider/onUserPermissionGranted/agree";
    public static final String NOTIFICATION_USER_PERMISSION_CANCEL = "content://com.heytap.health.sporthealthprovider/onUserPermissionGranted/cancel";
    public static final int SDK_CALL_FAILED = 0;
    public static final int SDK_CALL_SUCCESS = 1;
    private static final String TAG = "ContentHandler";
    private final ContentProvider contentProvider;
    private final List<Scope> contentScopeList = new ArrayList();
    private final pee mPermissionChecker;

    @Keep
    public static class ResultCode {
        public static final int APP_INTERNAL_ERROR = 1002;
        public static final int APP_NEVER_LAUNCH = 1000;
        public static final int APP_NOT_LOGIN = 1001;
        public static final int AUTH_USER_CANCEL = 1102;
        public static final int AUTH_USER_GRANTED = 1101;
        public static final int AUTH_USER_HAS_GRANTED = 1103;
        public static final int CALL_METHOD_ERROR = 1003;
        public static final int HEALTH_ACTIVITY_RECOGNITION_PERMISSION_NOT_GRANTED = 1104;
        public static final int HEALTH_DATA_PARAMETER_ERROR = 1107;
        public static final int HEALTH_DATA_REQUEST_TIMED_OUT = 1105;
        public static final int HEALTH_DATA_REQUEST_UNKNOWN_ERROR = 1106;
    }

    @Keep
    public static class Scope {
        public String desc;
        public String read;
        public String write;

        public Scope(String str, String str2, String str3) {
            this.read = str;
            this.write = str2;
            this.desc = str3;
        }
    }

    public AuthHandler(ContentProvider contentProvider) {
        this.contentProvider = contentProvider;
        this.mPermissionChecker = new pee(contentProvider.getContext());
    }

    private Bundle getGrantScopeList(Bundle bundle) {
        String string = bundle.getString("packageName");
        Set hashSet = new HashSet();
        if (!v9g.x("health_share_preference_settings" + v9g.w().D("user_ssoid")).q("scope_migrate_status")) {
            hashSet = AuthScope.getCallerGrantScope(string);
        }
        if (hashSet == null) {
            hashSet = new HashSet();
        }
        List<String> listConvertScopeBeanToSelectedScopeSet = AuthCallerBody.ScopeBean.convertScopeBeanToSelectedScopeSet(tuj.j(string));
        hashSet.addAll(listConvertScopeBeanToSelectedScopeSet);
        StringBuilder sb = new StringBuilder();
        sb.append("callerscope: ");
        sb.append(hashSet);
        sb.append("\nauthSet: ");
        sb.append(listConvertScopeBeanToSelectedScopeSet);
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("grantScopeList", new ArrayList<>(hashSet));
        return bundle2;
    }

    private Bundle getScopeList(Bundle bundle) {
        Map<String, AuthCallerBody> mapI = tuj.i();
        Set<String> setKeySet = mapI.keySet();
        StringBuilder sb = new StringBuilder();
        sb.append("packageSet: ");
        sb.append(setKeySet);
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("authCallerMap:");
        sb2.append(mapI);
        for (String str : setKeySet) {
            JsonObject jsonObject = new JsonObject();
            AuthCallerBody authCallerBody = mapI.get(str);
            HashSet hashSet = new HashSet();
            if (authCallerBody != null) {
                Iterator<AuthCallerBody.ScopeBean> it = authCallerBody.getScope().iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().getCode());
                }
            }
            JsonArray jsonArray = new JsonArray();
            for (Scope scope : this.contentScopeList) {
                String str2 = scope.read;
                String str3 = scope.write;
                String str4 = scope.desc;
                JsonObject jsonObject2 = new JsonObject();
                if (authCallerBody != null) {
                    if (hashSet.contains(str2)) {
                        jsonObject2.addProperty("read", str2);
                    }
                    if (hashSet.contains(str3)) {
                        jsonObject2.addProperty("write", str3);
                    }
                }
                if (jsonObject2.size() != 0) {
                    jsonObject2.addProperty(DBHealthReviewPlan.DESC, str4);
                    jsonArray.add(jsonObject2);
                }
            }
            jsonObject.addProperty("packageName", str);
            jsonObject.add("scopes", jsonArray);
            arrayList.add(jsonObject.toString());
        }
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("scopeList", arrayList);
        return bundle2;
    }

    private Bundle hasPermission(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        String callingPackage = this.contentProvider.getCallingPackage();
        ArrayList<String> stringArrayList = bundle.getStringArrayList("scopes");
        if (stringArrayList == null || stringArrayList.size() == 0) {
            bundle2.putInt("code", 0);
            bundle2.putInt("subCode", 1003);
            bundle2.putString(DBHealthReviewPlan.DESC, "request scopes can not be null ...");
            return bundle2;
        }
        Bundle bundle3 = new Bundle();
        bundle2.putInt("code", 1);
        AuthScope.Configuration configuration = AuthScope.getCallerWhiteListConfigMap().get(callingPackage);
        if (configuration != null) {
            List<String> list = configuration.scopes;
            for (String str : stringArrayList) {
                if (list == null || list.size() == 0) {
                    bundle3.putBoolean(str, false);
                } else {
                    bundle3.putBoolean(str, list.contains(str));
                }
            }
        } else {
            Set<String> callerGrantScope = AuthScope.getCallerGrantScope(callingPackage);
            List<String> listConvertScopeBeanToSelectedScopeSet = AuthCallerBody.ScopeBean.convertScopeBeanToSelectedScopeSet(tuj.j(callingPackage));
            for (String str2 : stringArrayList) {
                String str3 = str2.equals(SportDataAdapter.READ_SCOPE) ? "READ_DAILY_ACTIVITY" : str2;
                if (callerGrantScope != null && callerGrantScope.size() != 0) {
                    bundle3.putBoolean(str2, callerGrantScope.contains(str2));
                } else if (listConvertScopeBeanToSelectedScopeSet.size() != 0) {
                    bundle3.putBoolean(str2, listConvertScopeBeanToSelectedScopeSet.contains(str3));
                } else {
                    bundle3.putBoolean(str2, false);
                }
            }
        }
        bundle2.putBundle("grantPermission", bundle3);
        return bundle2;
    }

    private Bundle onCheckScopeSupport(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("method", "checkScopeSupport");
        bundle2.putString("packageName", this.contentProvider.getCallingPackage());
        if (bundle == null || lza.a(bundle.getStringArrayList("scopes"))) {
            bundle2.putInt("code", 0);
            bundle2.putInt("subCode", 1003);
            bundle2.putString(DBHealthReviewPlan.DESC, "request scopes can not be null ...");
            return bundle2;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("scopes");
        Bundle bundle3 = new Bundle();
        try {
            Objects.requireNonNull(stringArrayList);
            for (String str : stringArrayList) {
                bundle3.putBoolean(str, false);
                for (Scope scope : this.contentScopeList) {
                    if (str.equalsIgnoreCase(scope.read) || str.equalsIgnoreCase(scope.write)) {
                        bundle3.putBoolean(str, true);
                        break;
                    }
                }
            }
            bundle2.putInt("code", 1);
            bundle2.putBundle("scopeSupportList", bundle3);
        } catch (Exception e2) {
            a7b.b(TAG, "onCheckScopeSupport Exception:" + e2.getMessage());
            bundle2.putInt("code", 0);
            bundle2.putInt("subCode", 1002);
            bundle2.putString(DBHealthReviewPlan.DESC, "Exception: " + e2.getMessage());
        }
        return bundle2;
    }

    private Bundle onRequestPermission(Bundle bundle) {
        String str;
        String str2;
        boolean z;
        String str3 = TAG;
        Bundle bundle2 = new Bundle();
        bundle2.putString("method", "requestPermission");
        bundle2.putString("packageName", this.contentProvider.getCallingPackage());
        if (bundle == null || lza.a(bundle.getStringArrayList("scopes"))) {
            bundle2.putInt("code", 0);
            bundle2.putInt("subCode", 1003);
            bundle2.putString(DBHealthReviewPlan.DESC, "request scopes can not be null ...");
            return bundle2;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("scopes");
        AuthScope.Configuration configuration = AuthScope.getCallerWhiteListConfigMap().get(this.contentProvider.getCallingPackage());
        if (configuration != null) {
            List<String> list = configuration.scopes;
            bundle2.putInt("code", 0);
            if (list == null || !list.containsAll(stringArrayList)) {
                bundle2.putInt("subCode", 1003);
                bundle2.putString(DBHealthReviewPlan.DESC, "request scopes may not be allowed, please check scopes or contact to health app ...");
            } else {
                bundle2.putInt("subCode", 1103);
                bundle2.putString(DBHealthReviewPlan.DESC, "permission has been granted, please do not request again ...");
            }
            return bundle2;
        }
        AuthScope.Configuration configuration2 = AuthScope.getCallerListConfigMap().get(this.contentProvider.getCallingPackage());
        AuthCallerBody authCallerBody = tuj.i().get(this.contentProvider.getCallingPackage());
        if (configuration2 == null && authCallerBody == null) {
            bundle2.putInt("code", 0);
            bundle2.putInt("subCode", 1003);
            bundle2.putString(DBHealthReviewPlan.DESC, this.contentProvider.getCallingPackage() + " is not config, please contact to health app ...");
            return bundle2;
        }
        List arrayList = new ArrayList();
        if (configuration2 != null) {
            arrayList = configuration2.scopes;
        }
        HashSet hashSet = new HashSet();
        if (authCallerBody != null) {
            Iterator<AuthCallerBody.ScopeBean> it = authCallerBody.getScope().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getCode());
            }
        }
        if (!arrayList.containsAll(stringArrayList) && !hashSet.containsAll(stringArrayList)) {
            bundle2.putInt("code", 0);
            bundle2.putInt("subCode", 1003);
            bundle2.putString(DBHealthReviewPlan.DESC, "request scopes may not be allowed, please check scopes or contact to health app ...");
            return bundle2;
        }
        Set callerGrantScope = AuthScope.getCallerGrantScope(this.contentProvider.getCallingPackage());
        Set hashSet2 = callerGrantScope;
        if (callerGrantScope == null) {
            hashSet2 = new HashSet();
        }
        List<String> listConvertScopeBeanToSelectedScopeSet = AuthCallerBody.ScopeBean.convertScopeBeanToSelectedScopeSet(tuj.j(this.contentProvider.getCallingPackage()));
        hashSet2.addAll(listConvertScopeBeanToSelectedScopeSet);
        Iterator<String> it2 = stringArrayList.iterator();
        Object obj = null;
        while (it2.hasNext()) {
            String next = it2.next();
            Iterator<Scope> it3 = this.contentScopeList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    str2 = str3;
                    z = false;
                    break;
                }
                Iterator<Scope> it4 = it3;
                Scope next2 = it3.next();
                str2 = str3;
                if (next.equals(next2.read) || next.equals(next2.write)) {
                    z = true;
                    break;
                }
                str3 = str2;
                it3 = it4;
            }
            if (!z) {
                bundle2.putInt("code", 0);
                bundle2.putInt("subCode", 1003);
                bundle2.putString(DBHealthReviewPlan.DESC, "request scopes may not support in this version of app ...");
                return bundle2;
            }
            if (hashSet2.size() != 0) {
                if (hashSet2.contains(next)) {
                    it2.remove();
                }
            } else if (listConvertScopeBeanToSelectedScopeSet.contains(next)) {
                it2.remove();
            }
            if (next.equals(obj)) {
                it2.remove();
            }
            obj = next;
            str3 = str2;
        }
        String str4 = str3;
        if (stringArrayList.size() == 0) {
            bundle2.putInt("code", 0);
            bundle2.putInt("subCode", 1103);
            bundle2.putString(DBHealthReviewPlan.DESC, "permission has been granted, please do not request again ...");
            return bundle2;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        try {
            for (Scope scope : this.contentScopeList) {
                JsonObject jsonObject = new JsonObject();
                String str5 = scope.read;
                String str6 = scope.write;
                String str7 = scope.desc;
                if (stringArrayList.contains(str5)) {
                    jsonObject.addProperty("read", str5);
                }
                if (stringArrayList.contains(str6)) {
                    jsonObject.addProperty("write", str6);
                }
                if (jsonObject.size() != 0) {
                    jsonObject.addProperty(DBHealthReviewPlan.DESC, str7);
                    arrayList2.add(jsonObject.toString());
                }
            }
            try {
                Intent intent = new Intent("com.heytap.health.sdk.AuthenticationActivity");
                intent.putExtra("packageName", this.contentProvider.getCallingPackage());
                intent.putStringArrayListExtra("scopes", arrayList2);
                bundle2.putInt("code", 1);
                bundle2.putParcelable("intent", intent);
            } catch (Exception e2) {
                str = str4;
                try {
                    a7b.b(str, "onRequestPermission e:" + e2.getMessage());
                } catch (Exception e3) {
                    e = e3;
                    a7b.b(str, "onRequestPermission Exception: " + e.getMessage());
                    bundle2.clear();
                    bundle2.putInt("code", 0);
                    bundle2.putInt("subCode", 1002);
                    bundle2.putString(DBHealthReviewPlan.DESC, "Exception: " + e.getMessage());
                }
            }
        } catch (Exception e4) {
            e = e4;
            str = str4;
            a7b.b(str, "onRequestPermission Exception: " + e.getMessage());
            bundle2.clear();
            bundle2.putInt("code", 0);
            bundle2.putInt("subCode", 1002);
            bundle2.putString(DBHealthReviewPlan.DESC, "Exception: " + e.getMessage());
        }
        return bundle2;
    }

    private void onUserPermissionGranted(Bundle bundle) {
        int i = bundle.getInt("code");
        String string = bundle.getString("packageName");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("scopes");
        if (i != 1101) {
            this.contentProvider.getContext().getContentResolver().notifyChange(Uri.parse(NOTIFICATION_USER_PERMISSION_CANCEL), null);
            return;
        }
        Set<String> callerGrantScope = AuthScope.getCallerGrantScope(string);
        if (stringArrayList != null && AuthScope.getCallerListConfigMap().get(string) != null) {
            if (callerGrantScope == null || callerGrantScope.size() == 0) {
                AuthScope.saveCallerGrantScope(string, new HashSet(stringArrayList));
            } else {
                callerGrantScope.addAll(stringArrayList);
                AuthScope.saveCallerGrantScope(string, callerGrantScope);
            }
        }
        new lig().a();
        this.contentProvider.getContext().getContentResolver().notifyChange(Uri.parse(NOTIFICATION_USER_PERMISSION_AGREE), null);
    }

    private void updateGrantScope(Bundle bundle) {
        String string = bundle.getString("packageName");
        String string2 = bundle.getString("scope");
        boolean z = bundle.getBoolean("isChecked");
        if (AuthScope.getCallerListConfigMap().get(string) != null) {
            Set callerGrantScope = AuthScope.getCallerGrantScope(string);
            if (callerGrantScope != null) {
                if (z) {
                    callerGrantScope.add(string2);
                }
                if (!z) {
                    callerGrantScope.remove(string2);
                }
            } else if (z) {
                callerGrantScope = new HashSet();
                callerGrantScope.add(string2);
            }
            if (callerGrantScope != null) {
                AuthScope.saveCallerGrantScope(string, callerGrantScope);
            }
        }
    }

    public void addContentScope(f74 f74Var) {
        String strG = f74Var.g();
        String strI = f74Var.i();
        String strC = f74Var.c();
        if (TextUtils.isEmpty(strG) && TextUtils.isEmpty(strI)) {
            return;
        }
        this.contentScopeList.add(new Scope(strG, strI, strC));
    }

    public void addThirdAuthSelector() {
        this.contentScopeList.addAll(uuj.a());
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        if (!SportHealthProvider.AUTHORITY.equalsIgnoreCase(str)) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        boolean z = !g3k.x();
        boolean zR = v9g.w().r("has_launched", false);
        if (!zR || !z) {
            bundle2.putInt("code", 0);
            bundle2.putInt("subCode", !zR ? 1000 : 1001);
            bundle2.putString(DBHealthReviewPlan.DESC, !zR ? "health app has never launched ..." : "please login health app first ...");
            bundle2.putParcelable("intent", this.contentProvider.getContext().getPackageManager().getLaunchIntentForPackage(this.contentProvider.getContext().getPackageName()));
            return bundle2;
        }
        if (!this.mPermissionChecker.h(this.contentProvider.getCallingPackage())) {
            return null;
        }
        if (str2.equalsIgnoreCase("requestPermission")) {
            return onRequestPermission(bundle);
        }
        if (str2.equalsIgnoreCase("checkScopeSupport")) {
            return onCheckScopeSupport(bundle);
        }
        if (str2.equalsIgnoreCase("onUserPermissionGranted")) {
            onUserPermissionGranted(bundle);
        } else {
            if (str2.equalsIgnoreCase("hasPermission")) {
                return hasPermission(bundle);
            }
            if (str2.equalsIgnoreCase("getScopeList")) {
                return getScopeList(bundle);
            }
            if (str2.equalsIgnoreCase("getGrantScopeList")) {
                return getGrantScopeList(bundle);
            }
            if (str2.equalsIgnoreCase("updateGrantScope")) {
                updateGrantScope(bundle);
            }
        }
        return null;
    }
}

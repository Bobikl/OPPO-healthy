package com.oplus.aiunit.vision;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.heytap.databaseengine.apiv3.data.DataPoint;
import com.heytap.databaseengine.apiv3.data.DataSet;
import com.heytap.databaseengine.apiv3.data.DataType;
import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengine.callback.ICommonListener;
import com.heytap.health.core.provider.adapter.open.SportDataAdapter;
import com.heytap.health.core.provider.auth.AuthorityScopeType;
import com.heytap.health.core.provider.auth.struct.AuthCallerBody;
import com.heytap.health.core.provider.auth.struct.PackageInfoBody;
import com.heytap.health.core.provider.auth.struct.WhiteCallerBody;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b!\u0010\"J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u001d\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u001e\u0010 \u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0002¨\u0006$"}, d2 = {"Lcom/oplus/aiunit/vision/bod;", "Lcom/oplus/aiunit/vision/fv9;", "Lcom/oplus/aiunit/vision/gv9;", "", "packageName", "", "scopeList", "", "f", "scope", "h", "pkgName", "Lcom/heytap/databaseengine/callback/ICommonListener;", "listener", "", "e", "d", "g", "j", "", "packageNames", "Lcom/heytap/databaseengine/apiv3/data/DataSet$b;", "i", "([Ljava/lang/String;)Lcom/heytap/databaseengine/apiv3/data/DataSet$b;", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "a", "Landroid/content/ContentValues;", "values", "b", "c", "k", "<init>", "()V", "Companion", "depend_release"}, k = 1, mv = {1, 8, 0})
public final class bod implements fv9, gv9 {
    @NotNull
    public Bundle a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle bundleG = SportDataAdapter.G(context);
        Intrinsics.checkNotNullExpressionValue(bundleG, "querySportData(context)");
        return bundleG;
    }

    public void b(@NotNull Context context, @NotNull ContentValues values) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(values, "values");
        SportDataAdapter.K(context, values);
    }

    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ja4.INSTANCE.b(context, Boolean.TRUE, false);
    }

    @NotNull
    public String d() {
        String read = AuthorityScopeType.getREAD();
        Intrinsics.checkNotNullExpressionValue(read, "getREAD()");
        return read;
    }

    public void e(@NotNull String pkgName, @NotNull ICommonListener listener) {
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        Intrinsics.checkNotNullParameter(listener, "listener");
        new q4e().a(pkgName, listener);
    }

    public boolean f(@NotNull String packageName, @NotNull List<String> scopeList) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(scopeList, "scopeList");
        return k(packageName, scopeList);
    }

    @NotNull
    public String g() {
        String write = AuthorityScopeType.getWRITE();
        Intrinsics.checkNotNullExpressionValue(write, "getWRITE()");
        return write;
    }

    public boolean h(@NotNull String scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        return AuthorityScopeType.authorityCheck(scope);
    }

    @NotNull
    public DataSet.b i(@NotNull String[] packageNames) {
        Intrinsics.checkNotNullParameter(packageNames, "packageNames");
        DataSet.b bVarBuilder = DataSet.builder(DataType.TYPE_USER_INFO);
        for (String str : packageNames) {
            AuthCallerBody authCallerBody = (AuthCallerBody) vyj.i().get(str);
            if (authCallerBody != null && !TextUtils.isEmpty(authCallerBody.getOpenId()) && authCallerBody.isAuthorized()) {
                bVarBuilder.a(DataPoint.builder(DataType.TYPE_USER_INFO).d(Element.ELEMENT_OPENID, authCallerBody.getOpenId()).a());
            }
        }
        Intrinsics.checkNotNullExpressionValue(bVarBuilder, "dataSetBuilder");
        return bVarBuilder;
    }

    @NotNull
    public String j() {
        String readProfile = AuthorityScopeType.getReadProfile();
        Intrinsics.checkNotNullExpressionValue(readProfile, "getReadProfile()");
        return readProfile;
    }

    public final boolean k(String packageName, List<String> scopeList) {
        oge ogeVar = new oge(e88.a());
        WhiteCallerBody.ConfigBean configBean = (WhiteCallerBody.ConfigBean) vyj.n().get(packageName);
        if (configBean != null) {
            sj4.a("OperationDelegate", packageName + " is in white list ...");
            if (ogeVar.b(packageName, configBean.getSha1())) {
                List scopes = configBean.getScopes();
                Intrinsics.checkNotNullExpressionValue(scopes, "configuration.scopes");
                scopeList.addAll(scopes);
                return true;
            }
            sj4.c("OperationDelegate", "checkCallerSha1Valid false");
        }
        sj4.a("OperationDelegate", packageName + " is not in white list ...");
        AuthCallerBody authCallerBody = (AuthCallerBody) vyj.i().get(packageName);
        if (authCallerBody == null) {
            sj4.a("OperationDelegate", packageName + " is not in caller list ...");
            return false;
        }
        String strD = fdg.x("sdkCallerClientIdList").D(authCallerBody.getClientId());
        Intrinsics.checkNotNullExpressionValue(strD, "getInstance(SPKeyConstan…(authCallerBody.clientId)");
        PackageInfoBody packageInfoBody = (PackageInfoBody) vd8.a(strD, PackageInfoBody.class);
        Objects.requireNonNull(packageInfoBody);
        if (!ogeVar.b(packageName, packageInfoBody.getSha1sums())) {
            return false;
        }
        for (AuthCallerBody.ScopeBean scopeBean : authCallerBody.getScope()) {
            if (scopeBean.isSelected()) {
                String code = scopeBean.getCode();
                Intrinsics.checkNotNullExpressionValue(code, "scopesBean.code");
                scopeList.add(code);
            }
        }
        return true;
    }
}

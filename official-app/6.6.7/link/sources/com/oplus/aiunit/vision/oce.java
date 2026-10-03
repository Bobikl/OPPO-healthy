package com.oplus.aiunit.vision;

import android.app.Activity;
import com.google.gson.Gson;
import com.oplus.pay.opensdk.deeplink.router.link.data.Link;
import com.oplus.pay.opensdk.deeplink.router.link.data.LinkDataAccount;
import com.oplus.smartenginehelper.ParserTag;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001$B\u0097\u0001\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012(\b\u0002\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0012\u0012(\b\u0002\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0012\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\"\u0010#J*\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u009d\u0001\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2(\b\u0002\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u00122(\b\u0002\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR4\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR4\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0011j\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/oce;", "Lcom/oplus/aiunit/vision/nva;", "Lcom/oplus/aiunit/vision/us9;", "fragment", "Lorg/json/JSONObject;", "jsonObject", "", "", "g", rde.KEY_COUNTRY_CODE, "userInfoJsonStr", "preToken", "appPackage", "Lcom/oplus/aiunit/vision/n2a;", "webViewCallback", "", "ignoreCheckHost", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "generalExtParam", "offlineExtParam", "", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/oplus/aiunit/vision/n2a;Ljava/lang/Boolean;Ljava/util/HashMap;Ljava/util/HashMap;)V", "c", "Ljava/lang/String;", "d", "e", "f", "Ljava/lang/Boolean;", "Ljava/util/HashMap;", "i", "j", "Lcom/oplus/aiunit/vision/n2a;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/oplus/aiunit/vision/n2a;)V", "a", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
public final class oce extends nva {

    @NotNull
    public final String c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;

    @Nullable
    public final String f;

    @Nullable
    public final Boolean g;

    @Nullable
    public final HashMap<String, String> h;

    @Nullable
    public final HashMap<String, String> i;

    @Nullable
    public final n2a j;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012(\b\u0002\u0010!\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001bj\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u001c\u0012(\b\u0002\u0010$\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001bj\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u001c\u0012\b\u0010*\u001a\u0004\u0018\u00010%¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\nR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R7\u0010!\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001bj\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R7\u0010$\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001bj\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u001c8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R\u0019\u0010*\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/oplus/aiunit/vision/oce$a;", "Lcom/oplus/aiunit/vision/w35;", "Landroid/app/Activity;", ParserTag.TAG_ACTIVITY, "", qmm.a.l, "", "a", "Ljava/lang/String;", "getCountryCode", "()Ljava/lang/String;", rde.KEY_COUNTRY_CODE, "b", "getUserInfoJsonStr", "userInfoJsonStr", "c", "getPreToken", "preToken", "d", "getAppPackage", "appPackage", "Lcom/oplus/aiunit/vision/n2a;", "e", "Lcom/oplus/aiunit/vision/n2a;", "getWebViewCallback", "()Lcom/oplus/aiunit/vision/n2a;", "webViewCallback", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "f", "Ljava/util/HashMap;", "getGeneralExtParam", "()Ljava/util/HashMap;", "generalExtParam", "g", "getOfflineExtParam", "offlineExtParam", "", "h", "Ljava/lang/Boolean;", "getIgnoreCheckHost", "()Ljava/lang/Boolean;", "ignoreCheckHost", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/oplus/aiunit/vision/n2a;Ljava/util/HashMap;Ljava/util/HashMap;Ljava/lang/Boolean;)V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements w35 {

        @NotNull
        public final String a;

        @Nullable
        public final String b;

        @Nullable
        public final String c;

        @Nullable
        public final String d;

        @Nullable
        public final n2a e;

        @Nullable
        public final HashMap<String, String> f;

        @Nullable
        public final HashMap<String, String> g;

        @Nullable
        public final Boolean h;

        public a(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable n2a n2aVar, @Nullable HashMap<String, String> map, @Nullable HashMap<String, String> map2, @Nullable Boolean bool) {
            Intrinsics.checkNotNullParameter(str, rde.KEY_COUNTRY_CODE);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = n2aVar;
            this.f = map;
            this.g = map2;
            this.h = bool;
        }

        @Override // com.oplus.aiunit.vision.w35
        public void a(@NotNull Activity activity, @NotNull String url) {
            Intrinsics.checkNotNullParameter(activity, ParserTag.TAG_ACTIVITY);
            Intrinsics.checkNotNullParameter(url, qmm.a.l);
            hrl.a("PayDeepLinkCallback paycontainer H5 url: " + url + ' ');
            gsl.INSTANCE.a(activity, this.a, url, this.b, this.e, this.c, this.d, this.h, (768 & 256) != 0 ? null : null, (768 & 512) != 0 ? null : null, (768 & 1024) != 0 ? null : this.f, (768 & 2048) != 0 ? null : this.g, new ws9[0]);
        }
    }

    public oce(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable HashMap<String, String> map, @Nullable HashMap<String, String> map2, @Nullable n2a n2aVar) {
        Intrinsics.checkNotNullParameter(str, rde.KEY_COUNTRY_CODE);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = bool;
        this.h = map;
        this.i = map2;
        this.j = n2aVar;
    }

    @Override // com.oplus.aiunit.vision.nva
    @Nullable
    public Map<String, String> g(@Nullable us9 fragment, @Nullable JSONObject jsonObject) {
        Activity activity;
        Gson gson = new Gson();
        try {
            h(this.c, this.d, this.e, this.f, this.j, this.g, this.h, this.i);
            Intrinsics.checkNotNull(jsonObject);
            try {
                List<LinkDataAccount.LinkDetail> linkDetail = ((LinkDataAccount) gson.fromJson(jsonObject.getString("linkInfo"), LinkDataAccount.class)).getLinkDetail();
                Link linkA = linkDetail != null ? jee.INSTANCE.a(linkDetail) : null;
                if (linkA != null && fragment != null && (activity = fragment.getActivity()) != null) {
                    x35.INSTANCE.c(activity, linkA);
                }
            } catch (Exception e) {
                hrl.b("e " + e.getMessage());
            }
            HashMap map = new HashMap();
            map.put("KEY", "TURE");
            return map;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void h(String countryCode, String userInfoJsonStr, String preToken, String appPackage, n2a webViewCallback, Boolean ignoreCheckHost, HashMap<String, String> generalExtParam, HashMap<String, String> offlineExtParam) {
        x35.INSTANCE.a(new a(countryCode, userInfoJsonStr, preToken, appPackage, webViewCallback, generalExtParam, offlineExtParam, ignoreCheckHost));
    }
}

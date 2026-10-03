package com.heytap.health.wallet.router;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.heytap.health.wallet.BaseActivity;
import com.heytap.store.base.core.util.app.HostDomainCenter;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.e1j;
import com.oplus.aiunit.vision.j7l;
import com.oplus.aiunit.vision.q50;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.x81;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes18.dex */
public class RouterActivity extends BaseActivity {
    public static final Set<String> s = new HashSet(Arrays.asList("heytaphealth", Const.Scheme.SCHEME_HTTPS, "http"));
    public static final Set<String> t = new HashSet(Arrays.asList("com.heytap.health"));
    public static final Set<String> u = new HashSet(Arrays.asList("/main/index", "/main/mine", "/main/cardPackageList", "/main/watchCardsUpdate", "/main/cardsetting/cardAutoSwitch/new", "/main/cardsetting/cardAutoSwitch/restock", "/main/FullScreenWeb", "/main/FixedToolbarScreenWeb", "/main/ToolbarScreenWeb", "/main/autoRepair", "/main/combinationCard/main", "/bus/cardList", "/bus/chooseCard", "/bus/recharge", "/bus/issue", "/bus/migrateInPending", "/bus/transRecord", "/entrance/index", "/bus/citySearch", "/entrance/bound/list", "/bus/batchMigrate/In", "/entrance/detail"));
    public static final Set<String> v = new HashSet(Arrays.asList(HostDomainCenter.HEYTAP_COM, HostDomainCenter.OPPO_COM, "oplus.com", "coloros.com"));
    public static final Pattern w = Pattern.compile(".*(<script|javascript:|data:|vbscript:|file:|intent:|#Intent).*", 2);

    public static String z7(Uri uri) {
        return uri == null ? "" : uri.getPath();
    }

    public final boolean A7(String str) {
        Set<String> set = u;
        if (set.contains(str)) {
            return true;
        }
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public final String B7(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strTrim = str.trim();
        while (strTrim.endsWith("/") && strTrim.length() > 1) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        return strTrim;
    }

    public final Bundle C7(Uri uri) {
        Bundle bundle = new Bundle();
        try {
            bundle.putBoolean("returnToWalletIndex", uri.getBooleanQueryParameter("returnToWalletIndex", j7l.v()));
        } catch (Exception e2) {
            t6b.i("RouterActivity", "Error parsing args: " + e2.getMessage());
        }
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    public final String D7(Uri uri) {
        String value;
        String strI7;
        String strG7;
        try {
            String strTrim = uri.toString().trim();
            if (strTrim.startsWith("http://") || strTrim.startsWith("https://")) {
                String strG8 = G7(strTrim);
                if (strG8 != null) {
                    value = new UrlQuerySanitizer(strG8).getValue("from");
                } else {
                    value = "";
                }
            } else if (!strTrim.startsWith(x81.SCHEMA_INNER)) {
                value = "";
            } else if ("/main/web".equals(z7(uri))) {
                String queryParameter = uri.getQueryParameter("url");
                if (TextUtils.isEmpty(queryParameter) || (strG7 = G7(queryParameter)) == null) {
                    value = "";
                } else {
                    value = new UrlQuerySanitizer(strG7).getValue("from");
                }
            } else {
                value = uri.getQueryParameter("from");
            }
            try {
                strI7 = I7(value);
            } catch (Exception e2) {
                e = e2;
                t6b.i("RouterActivity", "parseFromSafe error: " + e.getMessage());
                strI7 = value;
            }
        } catch (Exception e3) {
            e = e3;
            value = "";
        }
        return strI7 != null ? strI7 : "";
    }

    public final int E7(Uri uri) {
        int i = 0;
        try {
            i = uri.getBooleanQueryParameter("multiTask", false) ? 134742016 : 0;
            String queryParameter = uri.getQueryParameter("intntFlg");
            return !TextUtils.isEmpty(queryParameter) ? i | (e1j.s(queryParameter) & 1007157248) : i;
        } catch (Exception e2) {
            t6b.i("RouterActivity", "Error parsing intent flags: " + e2.getMessage());
            return i;
        }
    }

    public final boolean F7(Uri uri) {
        String scheme = uri.getScheme();
        String host = uri.getHost();
        String path = uri.getPath();
        if (v7(uri.toString())) {
            t6b.d("RouterActivity", "Dangerous content detected in URL");
            return false;
        }
        if (TextUtils.isEmpty(scheme) || !s.contains(scheme.toLowerCase())) {
            t6b.d("RouterActivity", "Invalid scheme: " + H7(scheme));
            return false;
        }
        if ("heytaphealth".equalsIgnoreCase(scheme)) {
            return K7(host, path);
        }
        if ("http".equalsIgnoreCase(scheme) || Const.Scheme.SCHEME_HTTPS.equalsIgnoreCase(scheme)) {
            return L7(uri);
        }
        return false;
    }

    public final String G7(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String strDecode = URLDecoder.decode(str, "UTF-8");
            if (v7(strDecode)) {
                return null;
            }
            return strDecode;
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public final String H7(String str) {
        if (TextUtils.isEmpty(str)) {
            return "[empty]";
        }
        if (str.length() <= 50) {
            return str;
        }
        return str.substring(0, 50) + "...[truncated]";
    }

    public final String I7(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strReplaceAll = str.replaceAll("[<>\"'&;]", "");
        return strReplaceAll.length() > 256 ? strReplaceAll.substring(0, 256) : strReplaceAll;
    }

    public final String J7(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strTrim = str.trim();
        if (v7(strTrim)) {
            t6b.d("RouterActivity", "Dangerous content in schemeUrl");
            return null;
        }
        if (strTrim.length() <= 2048) {
            return strTrim;
        }
        t6b.d("RouterActivity", "URL too long");
        return null;
    }

    public final boolean K7(String str, String str2) {
        if (TextUtils.isEmpty(str) || !t.contains(str)) {
            t6b.d("RouterActivity", "Invalid host: " + H7(str));
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            t6b.d("RouterActivity", "Empty path");
            return false;
        }
        String strB7 = B7(str2);
        if (A7(strB7)) {
            return true;
        }
        t6b.d("RouterActivity", "Path not in whitelist: " + H7(strB7));
        return false;
    }

    public final boolean L7(Uri uri) {
        String host = uri.getHost();
        if (TextUtils.isEmpty(host)) {
            return false;
        }
        String lowerCase = host.toLowerCase();
        for (String str : v) {
            if (lowerCase.equals(str)) {
                return true;
            }
            if (lowerCase.endsWith("." + str)) {
                return true;
            }
        }
        t6b.d("RouterActivity", "Web domain not allowed: " + H7(host));
        return false;
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        q50 q50Var;
        super.onCreate(bundle);
        try {
            t6b.b("RouterActivity", "onCreate - start routing");
            t6b.g("RouterActivity", getIntent());
            Uri uriY7 = y7();
            if (uriY7 == null) {
                t6b.i("RouterActivity", "Invalid or blocked URI, rejecting request");
                finish();
                return;
            }
            if (!F7(uriY7)) {
                t6b.i("RouterActivity", "Security check failed, rejecting request");
                finish();
                return;
            }
            int iE7 = E7(uriY7);
            String strD7 = D7(uriY7);
            Bundle bundleC7 = C7(uriY7);
            t6b.b("RouterActivity", "from = " + H7(strD7));
            String strW7 = w7(uriY7);
            if (TextUtils.isEmpty(strW7)) {
                t6b.i("RouterActivity", "Empty scheme URL after processing");
                finish();
                return;
            }
            if (uriY7.getBooleanQueryParameter("una", false)) {
                int i = q50.ENTER_SLIDE_ENTER;
                q50Var = new q50(i, i);
            } else {
                q50Var = null;
            }
            x81.g(this, strW7, bundleC7, -99999999, iE7, q50Var);
            finish();
        } catch (Exception e2) {
            t6b.d("RouterActivity", "Exception during routing: " + e2.getMessage());
        }
    }

    public final boolean v7(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return w.matcher(str).matches();
    }

    public final String w7(Uri uri) {
        if (uri == null) {
            return "";
        }
        String strTrim = uri.toString().trim();
        return v7(strTrim) ? "" : x7(strTrim);
    }

    public final String x7(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.contains("/bus/cardList") ? str.replace("/bus/cardList", "/main/cardPackageList") : str;
    }

    public final Uri y7() {
        Uri data = getIntent().getData();
        String stringExtra = getIntent().getStringExtra("schemeUrl");
        if (!TextUtils.isEmpty(stringExtra)) {
            String strJ7 = J7(stringExtra);
            if (strJ7 == null) {
                return null;
            }
            data = Uri.parse(strJ7);
        }
        if (data != null) {
            return data;
        }
        t6b.i("RouterActivity", "No URI provided");
        return null;
    }
}

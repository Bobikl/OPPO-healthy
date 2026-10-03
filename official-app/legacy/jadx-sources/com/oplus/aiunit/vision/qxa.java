package com.oplus.aiunit.vision;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import com.heytap.webview.extension.protocol.Const;

/* JADX INFO: loaded from: classes10.dex */
public class qxa implements pxa {
    @NonNull
    public static Uri b(@NonNull String str) {
        Uri uri = Uri.parse(str);
        return TextUtils.isEmpty(uri.getScheme()) ? uri.buildUpon().scheme(Const.Scheme.SCHEME_HTTPS).build() : uri;
    }

    @Override // com.oplus.aiunit.vision.pxa
    public void a(@NonNull View view, @NonNull String str) {
        Uri uriB = b(str);
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", uriB);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.w("LinkResolverDef", "Actvity was not found for the link: '" + str + "'");
        }
    }
}

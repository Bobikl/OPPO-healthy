package com.heytap.webpro.core;

import android.view.View;
import java.util.HashMap;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/webpro/core/WebProActivity;", "Lcom/heytap/webpro/core/AbstractWebExtActivity;", "()V", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public class WebProActivity extends AbstractWebExtActivity {
    private HashMap _$_findViewCache;

    @Override // com.heytap.webpro.core.AbstractWebExtActivity
    public void _$_clearFindViewByIdCache() {
        HashMap map = this._$_findViewCache;
        if (map != null) {
            map.clear();
        }
    }

    @Override // com.heytap.webpro.core.AbstractWebExtActivity
    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }
}

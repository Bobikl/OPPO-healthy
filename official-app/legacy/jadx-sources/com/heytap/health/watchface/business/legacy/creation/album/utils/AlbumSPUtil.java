package com.heytap.health.watchface.business.legacy.creation.album.utils;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.heytap.health.watchface.adaptation.common.ConfigHolder;
import com.heytap.health.watchface.business.legacy.creation.album.bean.AlbumItem;
import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageItem;
import com.oplus.aiunit.vision.kvi;
import com.oplus.aiunit.vision.ltl;
import com.oplus.aiunit.vision.n9g;
import com.oplus.aiunit.vision.ntl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class AlbumSPUtil {
    public static final String ALBUM_NAME = "Album/";
    public static final String TAG = "AlbumSPUtil";

    public static int a(Context context, ImageItem imageItem, kvi kviVar) {
        List<ImageItem> listH = h(context, kviVar);
        if (!listH.contains(imageItem)) {
            listH.add(imageItem);
        }
        m(context, listH, kviVar);
        return listH.size();
    }

    public static void b(Context context, ImageItem imageItem, kvi kviVar) {
        List<ImageItem> listI = i(context, kviVar);
        listI.add(imageItem);
        n(context, listI, kviVar);
        listI.size();
    }

    public static boolean c(Context context, kvi kviVar) {
        String strI = n9g.i(context, kviVar.b0(), "tag_album_current");
        ltl.a(TAG, "[checkIsSelectedCustomAlbum] current " + strI);
        return TextUtils.equals(strI, "Album/");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    public static boolean d(ConfigHolder configHolder) {
        int currentStyleIndex;
        String albumWfUnique = configHolder.getAlbumWfUnique();
        for (BaseWatchFaceBean baseWatchFaceBean : ntl.m().h()) {
            if (TextUtils.equals(baseWatchFaceBean.getWfUnique(), albumWfUnique)) {
                currentStyleIndex = baseWatchFaceBean.getCurrentStyleIndex();
                if (currentStyleIndex == 0) {
                    return true;
                }
                return false;
            }
        }
        currentStyleIndex = 0;
        if (currentStyleIndex == 0) {
            return true;
        }
        return false;
    }

    public static void e(Context context, kvi kviVar) {
        n(context, null, kviVar);
    }

    public static void f(Context context, List<ImageItem> list, kvi kviVar) {
        List<ImageItem> listH = h(context, kviVar);
        listH.removeAll(list);
        m(context, listH, kviVar);
    }

    public static List<ImageItem> g(Context context, String str, kvi kviVar) {
        ArrayList arrayList = new ArrayList();
        if (kviVar == null) {
            return arrayList;
        }
        String strC = n9g.c(context, kviVar.b0(), str);
        if (TextUtils.isEmpty(strC)) {
            return arrayList;
        }
        try {
            return (List) new Gson().fromJson(strC, new TypeToken<List<ImageItem>>() { // from class: com.heytap.health.watchface.business.legacy.creation.album.utils.AlbumSPUtil.1
            }.getType());
        } catch (Exception e2) {
            ltl.i(TAG, "[getImageItems] json error" + e2.getMessage());
            return arrayList;
        }
    }

    public static List<ImageItem> h(Context context, kvi kviVar) {
        return g(context, "tag_album_custom_selected_photos", kviVar);
    }

    public static List<ImageItem> i(Context context, kvi kviVar) {
        return g(context, "tag_album_memory_selected_photos", kviVar);
    }

    public static AlbumItem j(Context context, kvi kviVar) {
        String strC = n9g.c(context, kviVar.b0(), "tag_album_memory_item_flag");
        if (!TextUtils.isEmpty(strC)) {
            try {
                return (AlbumItem) new Gson().fromJson(strC, AlbumItem.class);
            } catch (Exception e2) {
                ltl.i(TAG, "[getSelectedMemoryAlbumInfo] json error" + e2.getMessage());
            }
        }
        return null;
    }

    public static void k(Context context, String str, kvi kviVar) {
        n9g.s(context, kviVar.b0(), "tag_album_current", str);
    }

    public static void l(Context context, String str, List<ImageItem> list, kvi kviVar) {
        String strB0 = kviVar.b0();
        if (list == null || list.size() == 0) {
            n9g.p(context, strB0, str, "");
        } else {
            n9g.p(context, strB0, str, new Gson().toJson(list));
        }
    }

    public static void m(Context context, List<ImageItem> list, kvi kviVar) {
        l(context, "tag_album_custom_selected_photos", list, kviVar);
    }

    public static void n(Context context, List<ImageItem> list, kvi kviVar) {
        l(context, "tag_album_memory_selected_photos", list, kviVar);
    }

    public static void o(Context context, long j2, kvi kviVar) {
        n9g.q(context, kviVar.b0(), "tag_album_memory_transmit_time", j2);
    }

    public static void p(Context context, AlbumItem albumItem, kvi kviVar) {
        String strB0 = kviVar.b0();
        if (albumItem != null) {
            n9g.p(context, strB0, "tag_album_memory_item_flag", new Gson().toJson(albumItem));
        } else {
            n9g.p(context, strB0, "tag_album_memory_item_flag", "");
        }
    }
}

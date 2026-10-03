package com.oplus.aiunit.vision;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.heytap.health.watchface.business.creation.category.outfits.bean.OutfitImgsConfig;
import com.heytap.health.watchface.business.creation.category.outfits.bean.OutfitTimeConfig;
import com.heytap.health.watchface.business.creation.category.outfits.bean.OutfitVideoConfig;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class qtd {
    public static final String IMGS = "imgs";
    public static final String IMGS_CONFIG = "imgs_config.json";
    public static final String TAG = "OutfitConfigUtil";
    public static final String TIMES = "times";
    public static final String TIMES_CONFIG = "times_config.json";
    public static final String VIDEOS = "videos";
    public static final String VIDEOS_CONFIG = "videos_config.json";

    public static OutfitImgsConfig a(String str, int i) throws Throwable {
        List listB = b(str + "imgs_config.json", OutfitImgsConfig.class);
        if (listB == null) {
            ltl.b(TAG, "[getImgsConfig] --> error, configs is null");
            return null;
        }
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            if (((OutfitImgsConfig) it.next()).getBackgroundCategory() != i) {
                it.remove();
            }
        }
        OutfitImgsConfig outfitImgsConfig = (OutfitImgsConfig) listB.get(0);
        if (outfitImgsConfig == null) {
            ltl.b(TAG, "[getImgsConfig] --> error, config is null");
        }
        ltl.a(TAG, "[getImgsConfig] --> imgsConfig=" + outfitImgsConfig);
        return outfitImgsConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a1: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:35:0x00a1 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.BufferedReader, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public static <T> List<T> b(String str, Class<T> cls) throws Throwable {
        InputStreamReader inputStreamReader;
        Closeable closeable;
        ?? bufferedReader;
        StringBuilder sb = new StringBuilder();
        Closeable closeable2 = null;
        try {
            try {
                str = new FileInputStream(new File((String) str));
                try {
                    inputStreamReader = new InputStreamReader(str);
                    try {
                        bufferedReader = new BufferedReader(inputStreamReader);
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                sb.append(line);
                            } catch (Exception e2) {
                                e = e2;
                                ltl.b(TAG, "[getOutfitConfig] --> " + e.getMessage());
                                nt9.a(bufferedReader, TAG);
                                nt9.a(inputStreamReader, TAG);
                                nt9.a(str, TAG);
                                return null;
                            }
                        }
                        String string = sb.toString();
                        ArrayList arrayList = new ArrayList();
                        Gson gson = new Gson();
                        Iterator<JsonElement> it = new JsonParser().parse(string).getAsJsonArray().iterator();
                        while (it.hasNext()) {
                            arrayList.add(gson.fromJson(it.next(), (Class) cls));
                        }
                        bufferedReader.close();
                        str.close();
                        nt9.a(bufferedReader, TAG);
                        nt9.a(inputStreamReader, TAG);
                        nt9.a(str, TAG);
                        return arrayList;
                    } catch (Exception e3) {
                        e = e3;
                        bufferedReader = 0;
                    } catch (Throwable th) {
                        th = th;
                        nt9.a(closeable2, TAG);
                        nt9.a(inputStreamReader, TAG);
                        nt9.a(str, TAG);
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    inputStreamReader = null;
                    str = str;
                    bufferedReader = inputStreamReader;
                    ltl.b(TAG, "[getOutfitConfig] --> " + e.getMessage());
                    nt9.a(bufferedReader, TAG);
                    nt9.a(inputStreamReader, TAG);
                    nt9.a(str, TAG);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamReader = null;
                }
            } catch (Throwable th3) {
                th = th3;
                closeable2 = closeable;
            }
        } catch (Exception e5) {
            e = e5;
            str = 0;
            inputStreamReader = null;
        } catch (Throwable th4) {
            th = th4;
            str = 0;
            inputStreamReader = null;
        }
    }

    public static List<OutfitTimeConfig> c(String str) {
        return b(str + "times_config.json", OutfitTimeConfig.class);
    }

    public static OutfitVideoConfig d(String str, int i) throws Throwable {
        List listB = b(str + "videos_config.json", OutfitVideoConfig.class);
        if (listB == null) {
            return null;
        }
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            if (((OutfitVideoConfig) it.next()).getBackgroundCategory() != i) {
                it.remove();
            }
        }
        OutfitVideoConfig outfitVideoConfig = (OutfitVideoConfig) listB.get(0);
        if (outfitVideoConfig == null) {
            ltl.b(TAG, "[getVideoConfig] --> error, config is null");
        }
        ltl.a(TAG, "[getVideoConfig] --> getVideoConfig=" + outfitVideoConfig);
        return (OutfitVideoConfig) listB.get(0);
    }
}

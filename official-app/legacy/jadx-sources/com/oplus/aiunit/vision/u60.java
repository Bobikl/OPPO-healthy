package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.watchface.business.creation.category.paint.bean.HandPaintAnimationPathBean;
import com.heytap.health.watchface.business.creation.category.paint.bean.HandPaintFrame;
import com.heytap.health.watchface.business.creation.category.paint.bean.HandPaintSilk;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes19.dex */
public class u60 {
    public static File a(Context context, String str, String str2) {
        File file = new File(b(context, str), str2 + ".png");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                ltl.b("AodSaveUtil", "create file error: " + e2.getMessage());
            }
        }
        return file;
    }

    public static String b(Context context, String str) {
        File filesDir = context.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(filesDir.getAbsolutePath());
        String str2 = File.separator;
        sb.append(str2);
        sb.append("WatchFace");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file.getAbsolutePath() + str2 + ybb.b(str));
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(file2.getAbsolutePath() + str2 + "aod");
        if (!file3.exists()) {
            file3.mkdirs();
        }
        return file3.getPath();
    }

    public static void c(String str, String str2) {
        ud4 ud4Var = new ud4();
        ud4Var.a = str;
        ud4Var.b = str2;
        ud4Var.f17423c = "";
        ud4Var.f17424e = "";
        ud4Var.h = 6;
        ud4Var.g = com.heytap.health.watchface.business.creation.db.a.a().k() - 1;
        ud4Var.d = a(b78.a(), str, UUID.randomUUID().toString().replaceAll("-", "")).getPath();
        com.heytap.health.watchface.business.creation.db.a.a().n(ud4Var);
    }

    public static void d(HandPaintAnimationPathBean handPaintAnimationPathBean, int i) {
        List<HandPaintSilk> list = handPaintAnimationPathBean.Silks;
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            List<HandPaintSilk> list2 = handPaintAnimationPathBean.Silks;
            ArrayList arrayList = new ArrayList();
            int size = list2.size();
            int i3 = 0;
            boolean z = false;
            while (i2 < size) {
                HandPaintSilk handPaintSilk = list2.get(i2);
                int i4 = handPaintSilk.TotalFrames;
                int i5 = handPaintSilk.Accelerate;
                int iCeil = (int) Math.ceil((((double) i4) * 1.0d) / ((double) i5));
                i3 += iCeil;
                if (!z) {
                    if (i3 > i) {
                        int i6 = (iCeil - (i3 - i)) * i5;
                        List<HandPaintFrame> list3 = handPaintSilk.Frames;
                        int size2 = list3.size();
                        int i7 = i6 + 1;
                        if (size2 > i7) {
                            list3.subList(i7, size2).clear();
                        }
                        handPaintSilk.TotalFrames = i6;
                        z = true;
                    }
                    arrayList.add(i2, handPaintSilk);
                }
                i2++;
            }
            handPaintAnimationPathBean.Silks = arrayList;
            i2 = i3;
        }
        if (handPaintAnimationPathBean.TotalFrameCount == 0) {
            handPaintAnimationPathBean.TotalFrameCount = i2;
        }
    }
}

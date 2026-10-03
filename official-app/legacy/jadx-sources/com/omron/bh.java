package com.omron;

import android.content.Context;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.heytap.store.base.core.http.HttpConst;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class bh {
    private final ba a;
    private Context b;

    public class a extends Thread {
        final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            super.run();
            bh bhVar = bh.this;
            int i = this.a;
            bhVar.b(i, (List<File>) bhVar.a(i));
        }
    }

    public class b implements av.b {
        final /* synthetic */ List a;
        final /* synthetic */ int b;

        public b(List list, int i) {
            this.a = list;
            this.b = i;
        }

        @Override // com.omron.av.b
        public void a(int i, String str) throws Throwable {
            ay.a(" UploadLogInfo()    请求返回res " + str, new Object[0]);
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i2 = jSONObject.getInt("code");
                jSONObject.getString("message");
                if (i2 == 200) {
                    ay.a("FileUploader文件上传-api请求成功:");
                    if (bl.h((File) this.a.get(0))) {
                        ay.a("FileUploader文件删除:（" + bb.a(this.b) + "）:" + ((File) this.a.get(0)).getName() + ";结果:" + ((File) this.a.get(0)).delete());
                    }
                    this.a.remove(0);
                    bh.this.b(this.b, (List<File>) this.a);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                e2.printStackTrace(new PrintStream(byteArrayOutputStream));
                ay.b(" uploadFileApi    " + byteArrayOutputStream.toString(), new Object[0]);
            }
        }

        @Override // com.omron.av.b
        public void b(int i, String str) {
        }
    }

    public bh(@NonNull ba baVar, Context context) {
        this.a = baVar;
        this.b = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(File file, File file2) {
        return (int) (file.lastModified() - file2.lastModified());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<File> a(int i) {
        ay.a("FileUploader获取文件列表-开始");
        File[] fileArrListFiles = new File(this.a.a() + bb.a(i)).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            ay.d("FileUploader获取文件列表-文件为空");
            return null;
        }
        Arrays.sort(fileArrListFiles, new Comparator() { // from class: com.oplus.aiunit.vision.pjm
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return com.omron.bh.a((File) obj, (File) obj2);
            }
        });
        return new ArrayList(Arrays.asList(fileArrListFiles).subList(0, Math.min(fileArrListFiles.length, this.a.c())));
    }

    @MainThread
    public void b(int i) {
        if (i == 2 || i == 1) {
            new a(i).start();
        } else {
            ay.d("FileUploader:日志级别异常");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, List<File> list) throws Throwable {
        if (list == null || list.size() == 0) {
            ay.a("FileUploader文件上传-文件列表为空");
        } else {
            a(i, list);
        }
    }

    private void a(int i, List<File> list) throws Throwable {
        ay.a("FileUploader文件上传-api请求-开始");
        if (i != 2 && i != 1) {
            ay.d("FileUploader文件上传-api请求-日志级别异常");
            return;
        }
        String strK = bl.k(list.get(0));
        if (TextUtils.isEmpty(strK)) {
            ay.d("FileUploader文件上传-api请求-文件为空");
            return;
        }
        HashMap map = new HashMap();
        if (i == 2) {
            map.put("errContent", strK);
        }
        if (i == 1) {
            map.put("runContent", strK);
        }
        String str = (String) o.a(this.b, "uuid", "");
        ay.a("upload() requestParam uuid:" + str, new Object[0]);
        map.put("uuid", str);
        map.put("source", "2");
        String string = new JSONObject(map).toString();
        String strValueOf = String.valueOf(o.a(this.b, HttpConst.APP_KEY, ""));
        av.a().a(209, new b(list, i), "https://sdkb.omronhealthcare.com.cn/api/v1/SdkLog/LogInfo", string, strValueOf, m.a(strValueOf.substring(0, 9) + "e2KaQnHVsp"));
    }
}

package com.oplus.aiunit.vision;

import com.customer.feedback.sdk.util.LogUtil;
import com.heytap.health.bitmap.BitmapProviderService;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class rwm {
    public static boolean feedbacka = true;
    public static final AtomicInteger feedbackb = new AtomicInteger(0);

    /* JADX WARN: Code duplicated, block: B:17:0x0045 A[PHI: r3
  0x0045: PHI (r3v1 boolean) = (r3v0 boolean), (r3v3 boolean) binds: [B:3:0x000f, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    public static File a(String str, boolean z) {
        File file;
        boolean zCreateNewFile;
        String strReplaceAll = str.replaceAll("\\\\", "/");
        int iLastIndexOf = strReplaceAll.lastIndexOf("/");
        boolean zMkdirs = true;
        if (iLastIndexOf > -1) {
            File file2 = new File(strReplaceAll.substring(0, iLastIndexOf));
            zMkdirs = file2.exists() ? true : file2.mkdirs();
            if (zMkdirs) {
                file = new File(strReplaceAll);
                try {
                    if (!file.exists()) {
                        zCreateNewFile = file.createNewFile();
                    } else if (z && (zMkdirs = file.delete())) {
                        zCreateNewFile = file.createNewFile();
                    }
                    zMkdirs = zCreateNewFile;
                } catch (IOException unused) {
                }
            } else {
                file = null;
            }
        } else {
            file = null;
        }
        if (zMkdirs) {
            return file;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x01f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x01eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x01c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x01bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x01b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x01cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x01e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x01d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01dc, code lost:
    
        if (r8 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f5, code lost:
    
        if (r8 != null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f7, code lost:
    
        r8.close();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(String str, long j2) throws Throwable {
        List list;
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        cxm cxmVar;
        cxm cxmVar2;
        int i;
        boolean z;
        String[] list2;
        List listSubList;
        String str2 = str + "/" + String.valueOf(j2) + "_" + feedbackb.getAndIncrement() + ".txt";
        LogUtil.d("FbLogFile", "logFromFile: Get the path to the temporary .txt file" + str2);
        cxm cxmVar3 = null;
        if (str != null) {
            File file = new File(str);
            if (file.exists() && file.isDirectory() && (list2 = file.list()) != null) {
                Arrays.sort(list2);
                ArrayList arrayList = new ArrayList();
                for (String str3 : list2) {
                    if (str3 != null && str3.startsWith("fblog")) {
                        arrayList.add(str.concat(str3));
                    }
                }
                int size = arrayList.size();
                list = arrayList;
                if (size <= 0) {
                    list = null;
                } else if (size > 1) {
                    listSubList = arrayList.subList(size - 2, size);
                    Collections.reverse(listSubList);
                }
            } else {
                list = null;
            }
        } else {
            list = null;
        }
        if (list == null) {
            list = listSubList;
            LogUtil.d("FbLogFile", "logFromFile ,fileAbsolutePaths is null");
            return null;
        }
        LogUtil.d("FbLogFile", "logFromFile ,fileAbsolutePaths size=" + list.size());
        File fileA = a(str2, true);
        if (fileA != null) {
            list = listSubList;
            try {
                if (fileA.exists()) {
                    try {
                        fileWriter = new FileWriter(fileA);
                        try {
                            bufferedWriter = new BufferedWriter(fileWriter);
                            try {
                                if (list.size() > 0) {
                                    File file2 = new File((String) list.get(0));
                                    if (file2.exists()) {
                                        cxmVar2 = new cxm(file2, Charset.defaultCharset());
                                    } else {
                                        cxmVar2 = 0;
                                    }
                                } else {
                                    cxmVar2 = 0;
                                }
                                if (cxmVar2 != 0) {
                                    loop1: while (true) {
                                        i = 0;
                                        do {
                                            try {
                                                String strG = cxmVar2.g();
                                                if (strG == null) {
                                                    z = false;
                                                    break loop1;
                                                }
                                                if (fileA.length() > BitmapProviderService.BITMAP_MAX_SIZE) {
                                                    z = true;
                                                    break loop1;
                                                }
                                                bufferedWriter.write(new lwm(strG).toString() + Weather.SEPARATOR);
                                                i++;
                                            } catch (FileNotFoundException unused) {
                                                if (cxmVar3 != null) {
                                                    try {
                                                        cxmVar3.f10283j.close();
                                                    } catch (IOException unused2) {
                                                    }
                                                }
                                                if (cxmVar2 != 0) {
                                                    try {
                                                        cxmVar2.f10283j.close();
                                                    } catch (IOException unused3) {
                                                    }
                                                }
                                                if (fileWriter != null) {
                                                    try {
                                                        fileWriter.close();
                                                    } catch (IOException unused4) {
                                                    }
                                                }
                                            } catch (IOException unused5) {
                                                if (cxmVar3 != null) {
                                                    try {
                                                        cxmVar3.f10283j.close();
                                                    } catch (IOException unused6) {
                                                    }
                                                }
                                                if (cxmVar2 != 0) {
                                                    try {
                                                        cxmVar2.f10283j.close();
                                                    } catch (IOException unused7) {
                                                    }
                                                }
                                                if (fileWriter != null) {
                                                    try {
                                                        fileWriter.close();
                                                    } catch (IOException unused8) {
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                cxmVar = cxmVar2;
                                                if (cxmVar3 != null) {
                                                    try {
                                                        cxmVar3.f10283j.close();
                                                    } catch (IOException unused9) {
                                                    }
                                                }
                                                if (cxmVar != 0) {
                                                    try {
                                                        cxmVar.f10283j.close();
                                                    } catch (IOException unused10) {
                                                    }
                                                }
                                                if (fileWriter != null) {
                                                    try {
                                                        fileWriter.close();
                                                    } catch (IOException unused11) {
                                                    }
                                                }
                                                if (bufferedWriter != null) {
                                                    throw th;
                                                }
                                                try {
                                                    bufferedWriter.close();
                                                    throw th;
                                                } catch (IOException unused12) {
                                                    throw th;
                                                }
                                            }
                                        } while (i % 20 != 0);
                                        bufferedWriter.flush();
                                    }
                                } else {
                                    i = 0;
                                    z = false;
                                }
                                if (!z && list.size() > 1) {
                                    File file3 = new File((String) list.get(1));
                                    cxmVar3 = file3.exists() ? new cxm(file3, Charset.defaultCharset()) : null;
                                    if (cxmVar3 != null) {
                                        while (true) {
                                            String strG2 = cxmVar3.g();
                                            if (strG2 == null || fileA.length() > BitmapProviderService.BITMAP_MAX_SIZE) {
                                                break;
                                            }
                                            bufferedWriter.write(new lwm(strG2).toString() + Weather.SEPARATOR);
                                            i++;
                                            if (i % 20 == 0) {
                                                bufferedWriter.flush();
                                                i = 0;
                                            }
                                        }
                                    }
                                }
                                bufferedWriter.flush();
                                if (cxmVar3 != null) {
                                    try {
                                        cxmVar3.f10283j.close();
                                    } catch (IOException unused13) {
                                    }
                                }
                                if (cxmVar2 != 0) {
                                    try {
                                        cxmVar2.f10283j.close();
                                    } catch (IOException unused14) {
                                    }
                                }
                                try {
                                    fileWriter.close();
                                } catch (IOException unused15) {
                                }
                                bufferedWriter.close();
                            } catch (FileNotFoundException unused16) {
                                cxmVar2 = 0;
                            } catch (IOException unused17) {
                                cxmVar2 = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                cxmVar = 0;
                            }
                        } catch (FileNotFoundException unused18) {
                            bufferedWriter = null;
                            cxmVar2 = bufferedWriter;
                            if (cxmVar3 != null) {
                                cxmVar3.f10283j.close();
                            }
                            if (cxmVar2 != 0) {
                                cxmVar2.f10283j.close();
                            }
                            if (fileWriter != null) {
                                fileWriter.close();
                            }
                        } catch (IOException unused19) {
                            bufferedWriter = null;
                            cxmVar2 = bufferedWriter;
                            if (cxmVar3 != null) {
                                cxmVar3.f10283j.close();
                            }
                            if (cxmVar2 != 0) {
                                cxmVar2.f10283j.close();
                            }
                            if (fileWriter != null) {
                                fileWriter.close();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedWriter = null;
                            cxmVar = bufferedWriter;
                            if (cxmVar3 != null) {
                                cxmVar3.f10283j.close();
                            }
                            if (cxmVar != 0) {
                                cxmVar.f10283j.close();
                            }
                            if (fileWriter != null) {
                                fileWriter.close();
                            }
                            if (bufferedWriter != null) {
                                throw th;
                            }
                            bufferedWriter.close();
                            throw th;
                        }
                    } catch (FileNotFoundException unused20) {
                        fileWriter = null;
                        bufferedWriter = null;
                    } catch (IOException unused21) {
                        fileWriter = null;
                        bufferedWriter = null;
                    } catch (Throwable th4) {
                        th = th4;
                        fileWriter = null;
                        bufferedWriter = null;
                    }
                }
            } catch (IOException unused22) {
            }
        }
        try {
            list = listSubList;
            return axm.a(str2, true);
        } catch (Exception e2) {
            LogUtil.e("FbLogFile", "exceptionInfo：" + e2.getMessage());
            return str2;
        }
    }

    public static void c(String str, String str2, String str3) throws Throwable {
        String[] list;
        String str4 = str2 + "fblog" + str3 + ".txt";
        if (feedbacka && str2 != null) {
            LogUtil.d("FbLogFile", "deleteFileMoreThan2Days");
            feedbacka = false;
            File file = new File(str2);
            if (file.isDirectory() && (list = file.list()) != null) {
                Arrays.sort(list);
                ArrayList arrayList = new ArrayList();
                for (String str5 : list) {
                    if (str5 != null && str5.startsWith("fblog")) {
                        arrayList.add(str5);
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size - 2; i++) {
                    String str6 = str2 + ((String) arrayList.get(i));
                    LogUtil.d("FbLogFile", "deleteFileByPath:" + str6);
                    if (str6 != null) {
                        File file2 = new File(str6);
                        if (file2.exists()) {
                            file2.delete();
                        }
                    }
                }
            }
        }
        File fileA = a(str4, false);
        if (fileA != null) {
            FileWriter fileWriter = null;
            try {
                try {
                    FileWriter fileWriter2 = new FileWriter(fileA, true);
                    try {
                        fileWriter2.write(str);
                        fileWriter2.flush();
                        fileWriter2.close();
                    } catch (IOException unused) {
                        fileWriter = fileWriter2;
                        if (fileWriter != null) {
                            fileWriter.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileWriter = fileWriter2;
                        if (fileWriter != null) {
                            try {
                                fileWriter.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}

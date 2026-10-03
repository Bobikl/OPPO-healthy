package com.tencent.mm.opensdk.channel.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.opensdk.constants.Build;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: com.tencent.mm.opensdk.channel.a.a$a, reason: collision with other inner class name */
    public static class C1008a {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f20289c;
        public long d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f20290e;
    }

    public static int a(Bundle bundle, String str, int i) {
        if (bundle == null) {
            return i;
        }
        try {
            return bundle.getInt(str, i);
        } catch (Exception e2) {
            Log.e("MicroMsg.IntentUtil", "getIntExtra exception:" + e2.getMessage());
            return i;
        }
    }

    public static Object a(int i, String str) {
        try {
            switch (i) {
                case 1:
                    return Integer.valueOf(str);
                case 2:
                    return Long.valueOf(str);
                case 3:
                    return str;
                case 4:
                    return Boolean.valueOf(str);
                case 5:
                    return Float.valueOf(str);
                case 6:
                    return Double.valueOf(str);
                default:
                    Log.e("MicroMsg.SDK.PluginProvider.Resolver", "unknown type");
                    return null;
            }
        } catch (Exception e2) {
            Log.e("MicroMsg.SDK.PluginProvider.Resolver", "resolveObj exception:" + e2.getMessage());
            return null;
        }
    }

    public static String a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getString(str);
        } catch (Exception e2) {
            Log.e("MicroMsg.IntentUtil", "getStringExtra exception:" + e2.getMessage());
            return null;
        }
    }

    public static boolean a(Context context, C1008a c1008a) {
        String str;
        String str2;
        if (context == null || c1008a == null) {
            str = "send fail, invalid argument";
        } else {
            if (!b.b(c1008a.b)) {
                if (b.b(c1008a.a)) {
                    str2 = null;
                } else {
                    str2 = c1008a.a + ".permission.MM_MESSAGE";
                }
                Intent intent = new Intent(c1008a.b);
                Bundle bundle = c1008a.f20290e;
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                String packageName = context.getPackageName();
                intent.putExtra(ConstantsAPI.SDK_VERSION, Build.SDK_INT);
                intent.putExtra(ConstantsAPI.APP_PACKAGE, packageName);
                intent.putExtra(ConstantsAPI.CONTENT, c1008a.f20289c);
                intent.putExtra(ConstantsAPI.APP_SUPORT_CONTENT_TYPE, c1008a.d);
                intent.putExtra(ConstantsAPI.CHECK_SUM, a(c1008a.f20289c, Build.SDK_INT, packageName));
                context.sendBroadcast(intent, str2);
                Log.d("MicroMsg.SDK.MMessage", "send mm message, intent=" + intent + ", perm=" + str2);
                return true;
            }
            str = "send fail, action is null";
        }
        Log.e("MicroMsg.SDK.MMessage", str);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x02e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x02a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x01f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x02c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0211 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x01d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x02a1: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:146:0x02a1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v84 */
    /* JADX WARN: Type inference failed for: r8v85 */
    public static byte[] a(String str, int i) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        ?? r8;
        ByteArrayOutputStream byteArrayOutputStream2;
        Object obj;
        ?? r3;
        Exception e2;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        IOException e3;
        HttpURLConnection httpURLConnection2;
        InputStream inputStream2;
        MalformedURLException e4;
        HttpURLConnection httpURLConnection3;
        InputStream inputStream3;
        ByteArrayOutputStream byteArrayOutputStream3;
        ByteArrayOutputStream byteArrayOutputStream4;
        ByteArrayOutputStream byteArrayOutputStream5;
        HttpURLConnection httpURLConnection4;
        HttpURLConnection httpURLConnection5;
        HttpURLConnection httpURLConnection6;
        ByteArrayOutputStream byteArrayOutputStream6 = null;
        byteArrayOutputStream6 = null;
        byteArrayOutputStream6 = null;
        ?? r1 = 0;
        if (str != null) {
            int length = str.length();
            try {
                if (length != 0) {
                    try {
                        HttpURLConnection httpURLConnection7 = (HttpURLConnection) new URL(str).openConnection();
                        try {
                            if (httpURLConnection7 == null) {
                                Log.e("MicroMsg.SDK.NetUtil", "open connection failed.");
                                if (httpURLConnection7 != null) {
                                    try {
                                        httpURLConnection7.disconnect();
                                    } catch (Throwable th) {
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th.getMessage());
                                    }
                                }
                                return null;
                            }
                            try {
                                httpURLConnection7.setRequestMethod("GET");
                                httpURLConnection7.setConnectTimeout(i);
                                httpURLConnection7.setReadTimeout(i);
                                if (httpURLConnection7.getResponseCode() >= 300) {
                                    Log.e("MicroMsg.SDK.NetUtil", "httpURLConnectionGet 300");
                                    try {
                                        httpURLConnection7.disconnect();
                                    } catch (Throwable th2) {
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th2.getMessage());
                                    }
                                    return null;
                                }
                                InputStream inputStream4 = httpURLConnection7.getInputStream();
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                                    try {
                                        byte[] bArr = new byte[1024];
                                        while (true) {
                                            int i2 = inputStream4.read(bArr);
                                            if (i2 == -1) {
                                                break;
                                            }
                                            byteArrayOutputStream7.write(bArr, 0, i2);
                                        }
                                        byte[] byteArray = byteArrayOutputStream7.toByteArray();
                                        Log.d("MicroMsg.SDK.NetUtil", "httpGet end");
                                        try {
                                            httpURLConnection7.disconnect();
                                        } catch (Throwable th3) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th3.getMessage());
                                        }
                                        try {
                                            inputStream4.close();
                                        } catch (Throwable th4) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th4.getMessage());
                                        }
                                        try {
                                            byteArrayOutputStream7.close();
                                        } catch (Throwable th5) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th5.getMessage());
                                        }
                                        return byteArray;
                                    } catch (MalformedURLException e5) {
                                        inputStream3 = inputStream4;
                                        e4 = e5;
                                        byteArrayOutputStream5 = byteArrayOutputStream7;
                                        httpURLConnection6 = httpURLConnection7;
                                    } catch (IOException e6) {
                                        inputStream2 = inputStream4;
                                        e3 = e6;
                                        byteArrayOutputStream4 = byteArrayOutputStream7;
                                        httpURLConnection5 = httpURLConnection7;
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e3.getMessage());
                                        if (httpURLConnection5 != null) {
                                            try {
                                                httpURLConnection5.disconnect();
                                            } catch (Throwable th6) {
                                                Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th6.getMessage());
                                            }
                                        }
                                        if (inputStream2 != null) {
                                            try {
                                                inputStream2.close();
                                            } catch (Throwable th7) {
                                                Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th7.getMessage());
                                            }
                                        }
                                        if (byteArrayOutputStream4 != null) {
                                            try {
                                                byteArrayOutputStream4.close();
                                            } catch (Throwable th8) {
                                                Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th8.getMessage());
                                            }
                                        }
                                        return null;
                                    } catch (Exception e7) {
                                        inputStream = inputStream4;
                                        e2 = e7;
                                        byteArrayOutputStream3 = byteArrayOutputStream7;
                                        httpURLConnection4 = httpURLConnection7;
                                        Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e2.getMessage());
                                        if (httpURLConnection4 != null) {
                                            try {
                                                httpURLConnection4.disconnect();
                                            } catch (Throwable th9) {
                                                Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th9.getMessage());
                                            }
                                        }
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Throwable th10) {
                                                Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th10.getMessage());
                                            }
                                        }
                                        if (byteArrayOutputStream3 != null) {
                                            try {
                                                byteArrayOutputStream3.close();
                                            } catch (Throwable th11) {
                                                Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th11.getMessage());
                                            }
                                        }
                                        return null;
                                    } catch (Throwable th12) {
                                        r3 = inputStream4;
                                        th = th12;
                                        byteArrayOutputStream6 = byteArrayOutputStream7;
                                        obj = httpURLConnection7;
                                        ?? r7 = r3;
                                        byteArrayOutputStream2 = byteArrayOutputStream6;
                                        r1 = r7;
                                        r8 = obj;
                                        if (r8 != 0) {
                                            try {
                                                r8.disconnect();
                                            } catch (Throwable th13) {
                                                Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th13.getMessage());
                                            }
                                        }
                                        if (r1 != 0) {
                                            try {
                                                r1.close();
                                            } catch (Throwable th14) {
                                                Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th14.getMessage());
                                            }
                                        }
                                        if (byteArrayOutputStream2 != null) {
                                            throw th;
                                        }
                                        try {
                                            byteArrayOutputStream2.close();
                                            throw th;
                                        } catch (Throwable th15) {
                                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th15.getMessage());
                                            throw th;
                                        }
                                    }
                                } catch (MalformedURLException e8) {
                                    inputStream3 = inputStream4;
                                    e4 = e8;
                                    httpURLConnection3 = httpURLConnection7;
                                    byteArrayOutputStream5 = null;
                                    httpURLConnection6 = httpURLConnection3;
                                } catch (IOException e9) {
                                    inputStream2 = inputStream4;
                                    e3 = e9;
                                    httpURLConnection2 = httpURLConnection7;
                                    byteArrayOutputStream4 = null;
                                    httpURLConnection5 = httpURLConnection2;
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e3.getMessage());
                                    if (httpURLConnection5 != null) {
                                        httpURLConnection5.disconnect();
                                    }
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                    }
                                    if (byteArrayOutputStream4 != null) {
                                        byteArrayOutputStream4.close();
                                    }
                                    return null;
                                } catch (Exception e10) {
                                    inputStream = inputStream4;
                                    e2 = e10;
                                    httpURLConnection = httpURLConnection7;
                                    byteArrayOutputStream3 = null;
                                    httpURLConnection4 = httpURLConnection;
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e2.getMessage());
                                    if (httpURLConnection4 != null) {
                                        httpURLConnection4.disconnect();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                    if (byteArrayOutputStream3 != null) {
                                        byteArrayOutputStream3.close();
                                    }
                                    return null;
                                } catch (Throwable th16) {
                                    r3 = inputStream4;
                                    th = th16;
                                    obj = httpURLConnection7;
                                }
                            } catch (MalformedURLException e11) {
                                e4 = e11;
                                inputStream3 = null;
                                httpURLConnection3 = httpURLConnection7;
                            } catch (IOException e12) {
                                e3 = e12;
                                inputStream2 = null;
                                httpURLConnection2 = httpURLConnection7;
                            } catch (Exception e13) {
                                e2 = e13;
                                inputStream = null;
                                httpURLConnection = httpURLConnection7;
                            } catch (Throwable th17) {
                                th = th17;
                                r3 = 0;
                                obj = httpURLConnection7;
                            }
                            byteArrayOutputStream5 = null;
                            httpURLConnection6 = httpURLConnection3;
                            Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + e4.getMessage());
                            if (httpURLConnection6 != null) {
                                try {
                                    httpURLConnection6.disconnect();
                                } catch (Throwable th18) {
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th18.getMessage());
                                }
                            }
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                } catch (Throwable th19) {
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th19.getMessage());
                                }
                            }
                            if (byteArrayOutputStream5 != null) {
                                try {
                                    byteArrayOutputStream5.close();
                                } catch (Throwable th20) {
                                    Log.e("MicroMsg.SDK.NetUtil", "httpGet ex:" + th20.getMessage());
                                }
                            }
                            return null;
                        } catch (MalformedURLException e14) {
                            e4 = e14;
                            inputStream3 = null;
                            byteArrayOutputStream5 = null;
                            httpURLConnection6 = httpURLConnection7;
                        } catch (IOException e15) {
                            e3 = e15;
                            inputStream2 = null;
                            byteArrayOutputStream4 = null;
                            httpURLConnection5 = httpURLConnection7;
                        } catch (Exception e16) {
                            e2 = e16;
                            inputStream = null;
                            byteArrayOutputStream3 = null;
                            httpURLConnection4 = httpURLConnection7;
                        } catch (Throwable th21) {
                            th = th21;
                            byteArrayOutputStream2 = null;
                            r8 = httpURLConnection7;
                            if (r8 != 0) {
                                r8.disconnect();
                            }
                            if (r1 != 0) {
                                r1.close();
                            }
                            if (byteArrayOutputStream2 != null) {
                                throw th;
                            }
                            byteArrayOutputStream2.close();
                            throw th;
                        }
                    } catch (MalformedURLException e17) {
                        e4 = e17;
                        httpURLConnection3 = null;
                        inputStream3 = null;
                    } catch (IOException e18) {
                        e3 = e18;
                        httpURLConnection2 = null;
                        inputStream2 = null;
                    } catch (Exception e19) {
                        e2 = e19;
                        httpURLConnection = null;
                        inputStream = null;
                    } catch (Throwable th22) {
                        th = th22;
                        obj = null;
                        r3 = 0;
                    }
                }
            } catch (Throwable th23) {
                th = th23;
                byteArrayOutputStream6 = byteArrayOutputStream;
                r3 = length;
                obj = str;
            }
        }
        Log.e("MicroMsg.SDK.NetUtil", "httpGet, url is null");
        return null;
    }

    public static byte[] a(String str, int i, String str2) {
        String str3;
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        byte[] bytes = stringBuffer.toString().substring(1, 9).getBytes();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr2 = new char[bArrDigest.length * 2];
            int i2 = 0;
            for (byte b : bArrDigest) {
                int i3 = i2 + 1;
                cArr2[i2] = cArr[(b >>> 4) & 15];
                i2 = i3 + 1;
                cArr2[i3] = cArr[b & 15];
            }
            str3 = new String(cArr2);
        } catch (Exception unused) {
            str3 = null;
        }
        return str3.getBytes();
    }
}

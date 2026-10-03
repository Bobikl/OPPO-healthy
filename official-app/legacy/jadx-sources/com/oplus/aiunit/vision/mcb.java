package com.oplus.aiunit.vision;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes17.dex */
public class mcb {
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:78:0x0111  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0116 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public static int a(Context context, String str, long j2, long j3, long j4) throws Throwable {
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        if (context == 0 || TextUtils.isEmpty(str)) {
            return 20;
        }
        Cursor cursorQuery = null;
        try {
            try {
                try {
                    Uri uri = Uri.parse(String.format("content://com.tencent.mm.sdk.comm.provider/setWechatSportStep?appid=%s", str));
                    try {
                        a7b.f("MMOpenApiCaller", "start acquire provider");
                        contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            try {
                                cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, null, null, new String[]{"" + j3, "" + j2, "" + j4}, null);
                            } catch (RemoteException unused) {
                                a7b.b("MMOpenApiCaller", "RemoteException");
                            }
                        }
                        a7b.f("MMOpenApiCaller", "end acquire provider");
                    } catch (RemoteException unused2) {
                        contentProviderClientAcquireUnstableContentProviderClient = null;
                    }
                    if (cursorQuery == null) {
                        a7b.f("MMOpenApiCaller", "mmCursor == null");
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            return 16;
                        }
                        try {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                            return 16;
                        } catch (Exception unused3) {
                            a7b.f("MMOpenApiCaller", "providerClient.close() exception");
                            return 16;
                        }
                    }
                    if (!cursorQuery.moveToFirst()) {
                        a7b.f("MMOpenApiCaller", "mmCursor.moveToFirst() false");
                        cursorQuery.close();
                        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                            return 18;
                        }
                        try {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                            return 18;
                        } catch (Exception unused4) {
                            a7b.f("MMOpenApiCaller", "providerClient.close() exception");
                            return 18;
                        }
                    }
                    if (cursorQuery.getColumnCount() != 0) {
                        int i = cursorQuery.getInt(cursorQuery.getColumnIndex("retCode"));
                        cursorQuery.close();
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            try {
                                contentProviderClientAcquireUnstableContentProviderClient.close();
                            } catch (Exception unused5) {
                                a7b.f("MMOpenApiCaller", "providerClient.close() exception");
                            }
                        }
                        return i;
                    }
                    cursorQuery.close();
                    if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                        return 17;
                    }
                    try {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                        return 17;
                    } catch (Exception unused6) {
                        a7b.f("MMOpenApiCaller", "providerClient.close() exception");
                        return 17;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (0 != 0) {
                        cursorQuery.close();
                    }
                    if (context != 0) {
                        try {
                            context.close();
                        } catch (Exception unused7) {
                            a7b.f("MMOpenApiCaller", "providerClient.close() exception");
                        }
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                a7b.f("MMOpenApiCaller", e.getMessage());
                if (0 != 0) {
                    cursorQuery.close();
                    if (context != 0) {
                        return 19;
                    }
                    try {
                        context.close();
                        return 19;
                    } catch (Exception unused8) {
                        a7b.f("MMOpenApiCaller", "providerClient.close() exception");
                        return 19;
                    }
                }
                if (0 != 0) {
                    cursorQuery.close();
                }
                if (context != 0) {
                    return 21;
                }
                try {
                    context.close();
                    return 21;
                } catch (Exception unused9) {
                    a7b.f("MMOpenApiCaller", "providerClient.close() exception");
                    return 21;
                }
            }
        } catch (Exception e3) {
            e = e3;
            context = 0;
            a7b.f("MMOpenApiCaller", e.getMessage());
            if (0 != 0) {
                cursorQuery.close();
                if (context != 0) {
                    return 19;
                }
                context.close();
                return 19;
            }
            if (0 != 0) {
                cursorQuery.close();
            }
            if (context != 0) {
                return 21;
            }
            context.close();
            return 21;
        } catch (Throwable th2) {
            th = th2;
            context = 0;
            if (0 != 0) {
                cursorQuery.close();
            }
            if (context != 0) {
                context.close();
            }
            throw th;
        }
    }
}

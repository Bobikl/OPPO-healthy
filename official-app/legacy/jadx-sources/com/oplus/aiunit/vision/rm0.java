package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes19.dex */
public class rm0 {
    public static String a(Context context) {
        Cursor cursorQuery = null;
        Context contextCreatePackageContext = null;
        cursorQuery = null;
        if (k(context)) {
            try {
                contextCreatePackageContext = context.createPackageContext(uvg.k(), 2);
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
            }
            return contextCreatePackageContext != null ? contextCreatePackageContext.getSharedPreferences("USER_INFO", 4).getString("USER_INFO_UNAME", "") : "";
        }
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse(mek.i()), null, null, null, null);
                cursorQuery.moveToFirst();
                String string = cursorQuery.getString(1);
                try {
                    cursorQuery.close();
                    return string;
                } catch (Exception unused) {
                    return string;
                }
            } catch (Exception unused2) {
                return "";
            }
        } catch (Exception unused3) {
            cursorQuery.close();
            return "";
        } catch (Throwable th) {
            try {
                cursorQuery.close();
            } catch (Exception unused4) {
            }
            throw th;
        }
    }

    public static String b(Context context, String str) {
        if (l(context) && g(context, str)) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(uvg.k(), 2);
                return contextCreatePackageContext != null ? contextCreatePackageContext.getSharedPreferences("APP_LOGIN_RECORD_INFO", 4).getString("NameWhenOneAccount", "") : "";
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
                return "";
            }
        }
        try {
            Context contextCreatePackageContext2 = context.createPackageContext(uvg.k(), 2);
            return contextCreatePackageContext2 != null ? contextCreatePackageContext2.getSharedPreferences("USER_NAME_INFO", 4).getString(str, "") : "";
        } catch (PackageManager.NameNotFoundException e3) {
            e3.printStackTrace();
            return "";
        }
    }

    public static String c(Context context) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse(mek.j()), null, null, null, null);
                cursorQuery.moveToFirst();
                String string = cursorQuery.getString(0);
                if (TextUtils.isEmpty(string)) {
                    try {
                        cursorQuery.close();
                    } catch (Exception unused) {
                    }
                    return "";
                }
                try {
                    cursorQuery.close();
                } catch (Exception unused2) {
                }
                return string;
            } catch (Exception unused3) {
                return "";
            }
        } catch (Exception unused4) {
            cursorQuery.close();
            return "";
        } catch (Throwable th) {
            try {
                cursorQuery.close();
            } catch (Exception unused5) {
            }
            throw th;
        }
    }

    public static String d(Context context) {
        Cursor cursorQuery = null;
        Context contextCreatePackageContext = null;
        cursorQuery = null;
        if (k(context)) {
            try {
                contextCreatePackageContext = context.createPackageContext(uvg.k(), 2);
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
            }
            return contextCreatePackageContext != null ? contextCreatePackageContext.getSharedPreferences("USER_INFO", 4).getString("USER_INFO_TOKEN", "") : "";
        }
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse(mek.i()), null, null, null, null);
                cursorQuery.moveToFirst();
                String string = cursorQuery.getString(0);
                try {
                    cursorQuery.close();
                    return string;
                } catch (Exception unused) {
                    return string;
                }
            } catch (Exception unused2) {
                return "";
            }
        } catch (Exception unused3) {
            cursorQuery.close();
            return "";
        } catch (Throwable th) {
            try {
                cursorQuery.close();
            } catch (Exception unused4) {
            }
            throw th;
        }
    }

    public static String e(Context context, String str) {
        if (l(context) && g(context, str)) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(uvg.k(), 2);
                return contextCreatePackageContext != null ? contextCreatePackageContext.getSharedPreferences("APP_LOGIN_RECORD_INFO", 4).getString("TokenWhenOneAccount", "") : "";
            } catch (PackageManager.NameNotFoundException e2) {
                e2.printStackTrace();
                return "";
            }
        }
        try {
            Context contextCreatePackageContext2 = context.createPackageContext(uvg.k(), 2);
            return contextCreatePackageContext2 != null ? contextCreatePackageContext2.getSharedPreferences("USER_TOKEN_INFO", 4).getString(str, "") : "";
        } catch (PackageManager.NameNotFoundException e3) {
            e3.printStackTrace();
            return "";
        }
    }

    public static String f(Context context) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse(mek.j()), null, null, null, null);
                cursorQuery.moveToFirst();
                String string = cursorQuery.getString(1);
                if (TextUtils.isEmpty(string)) {
                    try {
                        cursorQuery.close();
                    } catch (Exception unused) {
                    }
                    return "0";
                }
                if (string.equals("-1")) {
                    try {
                        cursorQuery.close();
                    } catch (Exception unused2) {
                    }
                    return "0";
                }
                try {
                    cursorQuery.close();
                } catch (Exception unused3) {
                }
                return string;
            } catch (Exception unused4) {
            }
        } catch (Exception unused5) {
            cursorQuery.close();
            return "0";
        } catch (Throwable th) {
            try {
                cursorQuery.close();
            } catch (Exception unused6) {
            }
            throw th;
        }
        return "0";
    }

    public static boolean g(Context context, String str) {
        try {
            Context contextCreatePackageContext = context.createPackageContext(uvg.k(), 2);
            if (contextCreatePackageContext != null) {
                return contextCreatePackageContext.getSharedPreferences("APP_LOGIN_RECORD_INFO", 4).getBoolean(str, true);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return true;
        }
    }

    public static boolean h(Context context) {
        String strF = f(context);
        return (strF == null || strF.equals("0") || strF.equals("")) ? false : true;
    }

    public static boolean i(Context context) {
        String strD = d(context);
        return (strD == null || strD.equals("")) ? false : true;
    }

    public static boolean j(Context context, String str) {
        if (!l(context) || !g(context, str)) {
            String strE = e(context, str);
            return (strE == null || strE.equals("")) ? false : true;
        }
        Intent intent = new Intent(mek.m());
        intent.putExtra(mek.h(), str);
        intent.setPackage(uvg.k());
        context.sendBroadcast(intent);
        return true;
    }

    public static boolean k(Context context) {
        int iA;
        try {
            iA = nvg.a(context, uvg.k());
        } catch (Exception e2) {
            e2.printStackTrace();
            iA = 0;
        }
        return iA >= 210;
    }

    public static boolean l(Context context) {
        try {
            Context contextCreatePackageContext = context.createPackageContext(uvg.k(), 2);
            if (contextCreatePackageContext != null) {
                return contextCreatePackageContext.getSharedPreferences("APP_LOGIN_RECORD_INFO", 4).getBoolean("IsOneAccount", false);
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }
}

package com.lifesense.android.bluetooth.core.business.log.report;

import com.lifesense.android.bluetooth.core.tools.f;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    public a a;
    public String b = f.hourDateFormat.format(new Date(System.currentTimeMillis()));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8585c = 1;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f8586e;
    public String f;
    public String g;
    public boolean h;
    public int i;

    public b(a aVar, boolean z, String str, String str2) {
        a aVar2;
        this.a = aVar;
        this.d = z ? "  S" : "  F";
        if (a.Connect_State_Change == aVar || (aVar2 = a.Data_Parse) == aVar) {
            this.d = "  /";
            this.g = str2;
        } else {
            if (a.Enable_Character == aVar) {
                this.f8586e = str;
                return;
            }
            if (a.Gatt_Message == aVar) {
                this.f8586e = str2;
            } else if (a.Call_State_Changed == aVar || a.Message_Remind == aVar || aVar2 == aVar || a.Write_Push_Msg == aVar) {
                this.f = str;
                this.f8586e = str2;
                return;
            } else if (a.Receive_Data == aVar) {
                this.f8586e = str2;
                if (str == null || str.length() < 2) {
                    return;
                }
            } else {
                this.g = str2;
                if (str == null || str.length() < 2) {
                    return;
                }
            }
        }
        this.f = str;
    }

    public int a() {
        return this.f8585c;
    }

    public String b() {
        return this.g;
    }

    public a c() {
        return this.a;
    }

    public String d() {
        return this.f8586e;
    }

    public String e() {
        return this.f;
    }

    public String f() {
        return this.b;
    }

    public String g() {
        return this.d;
    }

    public String toString() {
        return "ActionEventInfo [eventType=" + this.a + ", startTime=" + this.b + ", count=" + this.f8585c + ", status=" + this.d + ", remark=" + this.f8586e + ", sourceData=" + this.f + ", dataType=" + this.g + ", isSuccess=" + this.h + ", eventCount=" + this.i + "]";
    }

    /* JADX WARN: Code duplicated, block: B:55:0x015a  */
    public String a(boolean z) {
        StringBuilder sb;
        String strE;
        StringBuffer stringBuffer = new StringBuffer();
        a aVarC = c();
        a aVar = a.Abnormal_Disconnect;
        if (aVarC == aVar && !z) {
            stringBuffer.append("\r\n");
        }
        a aVarC2 = c();
        a aVar2 = a.App_Message;
        if (aVarC2 == aVar2) {
            stringBuffer.append("\r\n");
        }
        if (a.Start_Service == c() && this.i > 1) {
            stringBuffer.append("\r\n");
        }
        stringBuffer.append("[" + f() + "]");
        stringBuffer.append("\t\t");
        stringBuffer.append(c().toString().replace("_", " "));
        if (c().a() >= 61440) {
            stringBuffer.append("\t");
        } else {
            stringBuffer.append("\t\t");
        }
        stringBuffer.append(g());
        stringBuffer.append("\t\t");
        if (b() == null || b().length() <= 0) {
            stringBuffer.append("  /");
        } else {
            stringBuffer.append("  " + b());
        }
        stringBuffer.append("\t\t");
        if (d() == null || d().length() <= 0) {
            if (c() == a.Start_Scan || c() == a.Connect_Device || c() == a.Cancel_Connection || c() == a.Close_Gatt) {
                sb = new StringBuilder();
                sb.append("  ");
                sb.append(a());
            } else {
                stringBuffer.append("  /");
            }
            stringBuffer.append("\t\t");
            if (e() != null || e().length() <= 0) {
                stringBuffer.append("  /");
            } else {
                if (c() == a.Write_Response || c() == a.Write_Call_Msg || c() == a.Write_Push_Msg) {
                    strE = ">>" + e();
                } else {
                    strE = e();
                }
                stringBuffer.append(strE);
            }
            if ((c() != aVar || c() == aVar2 || c() == a.Close_Gatt) && (c() != aVar || !z)) {
                stringBuffer.append("\r\n");
            }
            return stringBuffer.toString();
        }
        sb = new StringBuilder();
        sb.append(" ");
        sb.append(d());
        stringBuffer.append(sb.toString());
        stringBuffer.append("\t\t");
        if (e() != null) {
            stringBuffer.append("  /");
        } else {
            stringBuffer.append("  /");
        }
        if (c() != aVar) {
            stringBuffer.append("\r\n");
        } else {
            stringBuffer.append("\r\n");
        }
        return stringBuffer.toString();
    }

    public void a(int i) {
        this.i = i;
    }

    public void a(a aVar) {
        this.a = aVar;
    }
}

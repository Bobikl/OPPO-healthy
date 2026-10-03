package com.lifesense.plugin.ble.b.a;

import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public class b {
    private a a;
    private String b = com.lifesense.plugin.ble.c.d.hourDateFormat.format(new Date(System.currentTimeMillis()));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8686c = 1;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f8687e;
    private String f;
    private String g;
    private boolean h;
    private int i;

    public b(a aVar, boolean z, String str, String str2) {
        a aVar2;
        this.a = aVar;
        this.d = z ? "  S" : "  F";
        if (a.Connect_State_Change == aVar || (aVar2 = a.Data_Parse) == aVar) {
            this.d = "  /";
            this.g = str2;
        } else {
            if (a.Enable_Character == aVar) {
                this.f8687e = str;
                return;
            }
            if (a.Gatt_Message == aVar) {
                this.f8687e = str2;
            } else if (a.Call_State_Changed == aVar || a.Message_Remind == aVar || aVar2 == aVar || a.Write_Push_Msg == aVar) {
                this.f = str;
                this.f8687e = str2;
                return;
            } else if (a.Receive_Data == aVar) {
                this.f8687e = str2;
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

    public a a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public int c() {
        return this.f8686c;
    }

    public String d() {
        return this.d;
    }

    public String e() {
        return this.f8687e;
    }

    public String f() {
        return this.f;
    }

    public String g() {
        return this.g;
    }

    public String toString() {
        return "ActionEventInfo [eventType=" + this.a + ", startTime=" + this.b + ", count=" + this.f8686c + ", status=" + this.d + ", remark=" + this.f8687e + ", sourceData=" + this.f + ", dataType=" + this.g + ", isSuccess=" + this.h + ", eventCount=" + this.i + "]";
    }

    /* JADX WARN: Code duplicated, block: B:55:0x015a  */
    public String a(boolean z) {
        StringBuilder sb;
        String strF;
        StringBuffer stringBuffer = new StringBuffer();
        a aVarA = a();
        a aVar = a.Abnormal_Disconnect;
        if (aVarA == aVar && !z) {
            stringBuffer.append("\r\n");
        }
        a aVarA2 = a();
        a aVar2 = a.App_Message;
        if (aVarA2 == aVar2) {
            stringBuffer.append("\r\n");
        }
        if (a.Start_Service == a() && this.i > 1) {
            stringBuffer.append("\r\n");
        }
        stringBuffer.append("[" + b() + "]");
        stringBuffer.append("\t\t");
        stringBuffer.append(a().toString().replace("_", " "));
        if (a().a() >= 61440) {
            stringBuffer.append("\t");
        } else {
            stringBuffer.append("\t\t");
        }
        stringBuffer.append(d());
        stringBuffer.append("\t\t");
        if (g() == null || g().length() <= 0) {
            stringBuffer.append("  /");
        } else {
            stringBuffer.append("  " + g());
        }
        stringBuffer.append("\t\t");
        if (e() == null || e().length() <= 0) {
            if (a() == a.Start_Scan || a() == a.Connect_Device || a() == a.Cancel_Connection || a() == a.Close_Gatt) {
                sb = new StringBuilder();
                sb.append("  ");
                sb.append(c());
            } else {
                stringBuffer.append("  /");
            }
            stringBuffer.append("\t\t");
            if (f() != null || f().length() <= 0) {
                stringBuffer.append("  /");
            } else {
                if (a() == a.Write_Response || a() == a.Write_Call_Msg || a() == a.Write_Push_Msg) {
                    strF = ">>" + f();
                } else {
                    strF = f();
                }
                stringBuffer.append(strF);
            }
            if ((a() != aVar || a() == aVar2 || a() == a.Close_Gatt) && (a() != aVar || !z)) {
                stringBuffer.append("\r\n");
            }
            return stringBuffer.toString();
        }
        sb = new StringBuilder();
        sb.append(" ");
        sb.append(e());
        stringBuffer.append(sb.toString());
        stringBuffer.append("\t\t");
        if (f() != null) {
            stringBuffer.append("  /");
        } else {
            stringBuffer.append("  /");
        }
        if (a() != aVar) {
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

package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.TriggerEvent;
import io.netty.util.internal.StringUtil;
import io.protostuff.MapSchema;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes11.dex */
public class a5m extends m1 {
    public static final n1 BUSINESS_CATEGORY;
    public static final n1 C;
    public static final n1 CN;
    public static final n1 COUNTRY_OF_CITIZENSHIP;
    public static final n1 COUNTRY_OF_RESIDENCE;
    public static final n1 DATE_OF_BIRTH;
    public static final n1 DC;
    public static final n1 DMD_NAME;
    public static final n1 DN_QUALIFIER;
    public static final Hashtable DefaultLookUp;
    public static boolean DefaultReverse;
    public static final Hashtable DefaultSymbols;
    public static final n1 E;
    public static final n1 EmailAddress;
    public static final n1 GENDER;
    public static final n1 GENERATION;
    public static final n1 GIVENNAME;
    public static final n1 INITIALS;
    public static final n1 L;
    public static final n1 NAME;
    public static final n1 NAME_AT_BIRTH;
    public static final n1 O;
    public static final Hashtable OIDLookUp;
    public static final n1 OU;
    public static final n1 PLACE_OF_BIRTH;
    public static final n1 POSTAL_ADDRESS;
    public static final n1 POSTAL_CODE;
    public static final n1 PSEUDONYM;
    public static final Hashtable RFC1779Symbols;
    public static final Hashtable RFC2253Symbols;
    public static final n1 SERIALNUMBER;
    public static final n1 SN;
    public static final n1 ST;
    public static final n1 STREET;
    public static final n1 SURNAME;
    public static final Hashtable SymbolLookUp;
    public static final n1 T;
    public static final n1 TELEPHONE_NUMBER;
    public static final n1 UID;
    public static final n1 UNIQUE_IDENTIFIER;
    public static final n1 UnstructuredAddress;
    public static final n1 UnstructuredName;
    public static final Boolean o;
    public static final Boolean p;
    public Vector i = new Vector();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Vector f9201j = new Vector();
    public Vector k = new Vector();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s1 f9202l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9203n;

    static {
        n1 n1Var = new n1("2.5.4.6");
        C = n1Var;
        n1 n1Var2 = new n1("2.5.4.10");
        O = n1Var2;
        n1 n1Var3 = new n1("2.5.4.11");
        OU = n1Var3;
        n1 n1Var4 = new n1("2.5.4.12");
        T = n1Var4;
        n1 n1Var5 = new n1("2.5.4.3");
        CN = n1Var5;
        n1 n1Var6 = new n1("2.5.4.5");
        SN = n1Var6;
        n1 n1Var7 = new n1("2.5.4.9");
        STREET = n1Var7;
        SERIALNUMBER = n1Var6;
        n1 n1Var8 = new n1("2.5.4.7");
        L = n1Var8;
        n1 n1Var9 = new n1("2.5.4.8");
        ST = n1Var9;
        n1 n1Var10 = new n1("2.5.4.4");
        SURNAME = n1Var10;
        n1 n1Var11 = new n1("2.5.4.42");
        GIVENNAME = n1Var11;
        n1 n1Var12 = new n1("2.5.4.43");
        INITIALS = n1Var12;
        n1 n1Var13 = new n1("2.5.4.44");
        GENERATION = n1Var13;
        n1 n1Var14 = new n1("2.5.4.45");
        UNIQUE_IDENTIFIER = n1Var14;
        n1 n1Var15 = new n1("2.5.4.15");
        BUSINESS_CATEGORY = n1Var15;
        n1 n1Var16 = new n1("2.5.4.17");
        POSTAL_CODE = n1Var16;
        n1 n1Var17 = new n1("2.5.4.46");
        DN_QUALIFIER = n1Var17;
        n1 n1Var18 = new n1("2.5.4.65");
        PSEUDONYM = n1Var18;
        n1 n1Var19 = new n1("1.3.6.1.5.5.7.9.1");
        DATE_OF_BIRTH = n1Var19;
        n1 n1Var20 = new n1("1.3.6.1.5.5.7.9.2");
        PLACE_OF_BIRTH = n1Var20;
        n1 n1Var21 = new n1("1.3.6.1.5.5.7.9.3");
        GENDER = n1Var21;
        n1 n1Var22 = new n1("1.3.6.1.5.5.7.9.4");
        COUNTRY_OF_CITIZENSHIP = n1Var22;
        n1 n1Var23 = new n1("1.3.6.1.5.5.7.9.5");
        COUNTRY_OF_RESIDENCE = n1Var23;
        n1 n1Var24 = new n1("1.3.36.8.3.14");
        NAME_AT_BIRTH = n1Var24;
        n1 n1Var25 = new n1("2.5.4.16");
        POSTAL_ADDRESS = n1Var25;
        DMD_NAME = new n1("2.5.4.54");
        n1 n1Var26 = b5m.id_at_telephoneNumber;
        TELEPHONE_NUMBER = n1Var26;
        n1 n1Var27 = b5m.id_at_name;
        NAME = n1Var27;
        n1 n1Var28 = h1e.pkcs_9_at_emailAddress;
        EmailAddress = n1Var28;
        n1 n1Var29 = h1e.pkcs_9_at_unstructuredName;
        UnstructuredName = n1Var29;
        n1 n1Var30 = h1e.pkcs_9_at_unstructuredAddress;
        UnstructuredAddress = n1Var30;
        E = n1Var28;
        n1 n1Var31 = new n1("0.9.2342.19200300.100.1.25");
        DC = n1Var31;
        n1 n1Var32 = new n1("0.9.2342.19200300.100.1.1");
        UID = n1Var32;
        DefaultReverse = false;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        RFC2253Symbols = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        RFC1779Symbols = hashtable3;
        Hashtable hashtable4 = new Hashtable();
        DefaultLookUp = hashtable4;
        OIDLookUp = hashtable;
        SymbolLookUp = hashtable4;
        o = new Boolean(true);
        p = new Boolean(false);
        hashtable.put(n1Var, "C");
        hashtable.put(n1Var2, "O");
        hashtable.put(n1Var4, ExifInterface.GPS_DIRECTION_TRUE);
        hashtable.put(n1Var3, "OU");
        hashtable.put(n1Var5, "CN");
        hashtable.put(n1Var8, "L");
        hashtable.put(n1Var9, "ST");
        hashtable.put(n1Var6, "SERIALNUMBER");
        hashtable.put(n1Var28, ExifInterface.LONGITUDE_EAST);
        hashtable.put(n1Var31, "DC");
        hashtable.put(n1Var32, "UID");
        hashtable.put(n1Var7, "STREET");
        hashtable.put(n1Var10, "SURNAME");
        hashtable.put(n1Var11, "GIVENNAME");
        hashtable.put(n1Var12, "INITIALS");
        hashtable.put(n1Var13, "GENERATION");
        hashtable.put(n1Var30, "unstructuredAddress");
        hashtable.put(n1Var29, "unstructuredName");
        hashtable.put(n1Var14, "UniqueIdentifier");
        hashtable.put(n1Var17, "DN");
        hashtable.put(n1Var18, "Pseudonym");
        hashtable.put(n1Var25, "PostalAddress");
        hashtable.put(n1Var24, "NameAtBirth");
        hashtable.put(n1Var22, "CountryOfCitizenship");
        hashtable.put(n1Var23, "CountryOfResidence");
        hashtable.put(n1Var21, "Gender");
        hashtable.put(n1Var20, "PlaceOfBirth");
        hashtable.put(n1Var19, "DateOfBirth");
        hashtable.put(n1Var16, "PostalCode");
        hashtable.put(n1Var15, "BusinessCategory");
        hashtable.put(n1Var26, "TelephoneNumber");
        hashtable.put(n1Var27, "Name");
        hashtable2.put(n1Var, "C");
        hashtable2.put(n1Var2, "O");
        hashtable2.put(n1Var3, "OU");
        hashtable2.put(n1Var5, "CN");
        hashtable2.put(n1Var8, "L");
        hashtable2.put(n1Var9, "ST");
        hashtable2.put(n1Var7, "STREET");
        hashtable2.put(n1Var31, "DC");
        hashtable2.put(n1Var32, "UID");
        hashtable3.put(n1Var, "C");
        hashtable3.put(n1Var2, "O");
        hashtable3.put(n1Var3, "OU");
        hashtable3.put(n1Var5, "CN");
        hashtable3.put(n1Var8, "L");
        hashtable3.put(n1Var9, "ST");
        hashtable3.put(n1Var7, "STREET");
        hashtable4.put("c", n1Var);
        hashtable4.put("o", n1Var2);
        hashtable4.put("t", n1Var4);
        hashtable4.put("ou", n1Var3);
        hashtable4.put("cn", n1Var5);
        hashtable4.put(LogFieldKey.LEVEL_KEY, n1Var8);
        hashtable4.put("st", n1Var9);
        hashtable4.put(dj8.KEY_SN, n1Var6);
        hashtable4.put("serialnumber", n1Var6);
        hashtable4.put("street", n1Var7);
        hashtable4.put("emailaddress", n1Var28);
        hashtable4.put("dc", n1Var31);
        hashtable4.put(MapSchema.FIELD_NAME_ENTRY, n1Var28);
        hashtable4.put(TriggerEvent.EXTRA_UID, n1Var32);
        hashtable4.put("surname", n1Var10);
        hashtable4.put("givenname", n1Var11);
        hashtable4.put("initials", n1Var12);
        hashtable4.put("generation", n1Var13);
        hashtable4.put("unstructuredaddress", n1Var30);
        hashtable4.put("unstructuredname", n1Var29);
        hashtable4.put("uniqueidentifier", n1Var14);
        hashtable4.put("dn", n1Var17);
        hashtable4.put("pseudonym", n1Var18);
        hashtable4.put("postaladdress", n1Var25);
        hashtable4.put("nameofbirth", n1Var24);
        hashtable4.put("countryofcitizenship", n1Var22);
        hashtable4.put("countryofresidence", n1Var23);
        hashtable4.put("gender", n1Var21);
        hashtable4.put("placeofbirth", n1Var20);
        hashtable4.put("dateofbirth", n1Var19);
        hashtable4.put("postalcode", n1Var16);
        hashtable4.put("businesscategory", n1Var15);
        hashtable4.put("telephonenumber", n1Var26);
        hashtable4.put("name", n1Var27);
    }

    public a5m() {
    }

    public static a5m k(Object obj) {
        if (obj == null || (obj instanceof a5m)) {
            return (a5m) obj;
        }
        return obj instanceof x4m ? new a5m(s1.n(((x4m) obj).c())) : new a5m(s1.n(obj));
    }

    @Override // com.oplus.aiunit.vision.m1, com.oplus.aiunit.vision.f1
    public r1 c() {
        if (this.f9202l == null) {
            g1 g1Var = new g1();
            g1 g1Var2 = new g1();
            if (this.i.size() != 0) {
                new g1().a((n1) this.i.elementAt(0));
                throw null;
            }
            g1Var.a(new zj4(g1Var2));
            this.f9202l = new xj4(g1Var);
        }
        return this.f9202l;
    }

    @Override // com.oplus.aiunit.vision.m1
    public boolean equals(Object obj) {
        int i;
        int i2;
        int i3;
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a5m) && !(obj instanceof s1)) {
            return false;
        }
        if (c().equals(((f1) obj).c())) {
            return true;
        }
        try {
            a5m a5mVarK = k(obj);
            int size = this.i.size();
            if (size != a5mVarK.i.size()) {
                return false;
            }
            boolean[] zArr = new boolean[size];
            if (this.i.elementAt(0).equals(a5mVarK.i.elementAt(0))) {
                i3 = 1;
                i2 = size;
                i = 0;
            } else {
                i = size - 1;
                i2 = -1;
                i3 = -1;
            }
            while (i != i2) {
                n1 n1Var = (n1) this.i.elementAt(i);
                String str = (String) this.f9201j.elementAt(i);
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        z = false;
                        break;
                    }
                    if (!zArr[i4] && n1Var.equals((n1) a5mVarK.i.elementAt(i4)) && j(str, (String) a5mVarK.f9201j.elementAt(i4))) {
                        zArr[i4] = true;
                        z = true;
                        break;
                    }
                    i4++;
                }
                if (!z) {
                    return false;
                }
                i += i3;
            }
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public final void f(StringBuffer stringBuffer, Hashtable hashtable, n1 n1Var, String str) {
        String str2 = (String) hashtable.get(n1Var);
        if (str2 != null) {
            stringBuffer.append(str2);
        } else {
            stringBuffer.append(n1Var.q());
        }
        stringBuffer.append(kam.h);
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (length < length2 && stringBuffer.charAt(length) == ' ') {
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 <= length || stringBuffer.charAt(length2) != ' ') {
                break;
            } else {
                stringBuffer.insert(length2, '\\');
            }
        }
        while (length <= length2) {
            char cCharAt = stringBuffer.charAt(length);
            if (cCharAt != '\"' && cCharAt != '\\' && cCharAt != '+' && cCharAt != ',') {
                switch (cCharAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        length++;
                        break;
                }
            }
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
    }

    public final String g(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    public final String h(String str) {
        String strF = Strings.f(str.trim());
        if (strF.length() <= 0 || strF.charAt(0) != '#') {
            return strF;
        }
        f1 f1VarI = i(strF);
        return f1VarI instanceof x1 ? Strings.f(((x1) f1VarI).getString().trim()) : strF;
    }

    @Override // com.oplus.aiunit.vision.m1
    public int hashCode() {
        if (this.m) {
            return this.f9203n;
        }
        this.m = true;
        for (int i = 0; i != this.i.size(); i++) {
            String strL = l(h((String) this.f9201j.elementAt(i)));
            int iHashCode = this.f9203n ^ this.i.elementAt(i).hashCode();
            this.f9203n = iHashCode;
            this.f9203n = strL.hashCode() ^ iHashCode;
        }
        return this.f9203n;
    }

    public final r1 i(String str) {
        try {
            return r1.i(v79.a(str.substring(1)));
        } catch (IOException e2) {
            throw new IllegalStateException("unknown encoding in name: " + e2);
        }
    }

    public final boolean j(String str, String str2) {
        String strH = h(str);
        String strH2 = h(str2);
        return strH.equals(strH2) || l(strH).equals(l(strH2));
    }

    public final String l(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char cCharAt = str.charAt(0);
            stringBuffer.append(cCharAt);
            int i = 1;
            while (i < str.length()) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt != ' ' || cCharAt2 != ' ') {
                    stringBuffer.append(cCharAt2);
                }
                i++;
                cCharAt = cCharAt2;
            }
        }
        return stringBuffer.toString();
    }

    public String m(boolean z, Hashtable hashtable) {
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringBuffer2 = null;
        for (int i = 0; i < this.i.size(); i++) {
            if (((Boolean) this.k.elementAt(i)).booleanValue()) {
                stringBuffer2.append('+');
                f(stringBuffer2, hashtable, (n1) this.i.elementAt(i), (String) this.f9201j.elementAt(i));
            } else {
                stringBuffer2 = new StringBuffer();
                f(stringBuffer2, hashtable, (n1) this.i.elementAt(i), (String) this.f9201j.elementAt(i));
                vector.addElement(stringBuffer2);
            }
        }
        boolean z2 = true;
        if (z) {
            for (int size = vector.size() - 1; size >= 0; size--) {
                if (z2) {
                    z2 = false;
                } else {
                    stringBuffer.append(StringUtil.COMMA);
                }
                stringBuffer.append(vector.elementAt(size).toString());
            }
        } else {
            for (int i2 = 0; i2 < vector.size(); i2++) {
                if (z2) {
                    z2 = false;
                } else {
                    stringBuffer.append(StringUtil.COMMA);
                }
                stringBuffer.append(vector.elementAt(i2).toString());
            }
        }
        return stringBuffer.toString();
    }

    public String toString() {
        return m(DefaultReverse, DefaultSymbols);
    }

    public a5m(s1 s1Var) {
        this.f9202l = s1Var;
        Enumeration enumerationQ = s1Var.q();
        while (enumerationQ.hasMoreElements()) {
            u1 u1VarO = u1.o(((f1) enumerationQ.nextElement()).c());
            int i = 0;
            while (i < u1VarO.size()) {
                s1 s1VarN = s1.n(u1VarO.q(i).c());
                if (s1VarN.size() == 2) {
                    this.i.addElement(n1.s(s1VarN.p(0)));
                    f1 f1VarP = s1VarN.p(1);
                    if ((f1VarP instanceof x1) && !(f1VarP instanceof ek4)) {
                        String string = ((x1) f1VarP).getString();
                        if (string.length() > 0 && string.charAt(0) == '#') {
                            this.f9201j.addElement("\\" + string);
                        } else {
                            this.f9201j.addElement(string);
                        }
                    } else {
                        try {
                            this.f9201j.addElement("#" + g(v79.b(f1VarP.c().e("DER"))));
                        } catch (IOException unused) {
                            throw new IllegalArgumentException("cannot encode value");
                        }
                    }
                    this.k.addElement(i != 0 ? o : p);
                    i++;
                } else {
                    throw new IllegalArgumentException("badly sized pair");
                }
            }
        }
    }
}

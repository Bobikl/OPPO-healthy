package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.adobe.xmp.XMPException;
import com.coloros.sceneservice.dataprovider.bean.scene.SceneBankData;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public final class i6m implements h6m {
    public Map a = new HashMap();
    public Map b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f12398c = new HashMap();
    public Pattern d = Pattern.compile("[/*?\\[\\]]");

    public class a implements s5m {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f12399c;
        public final /* synthetic */ xz d;

        public a(String str, String str2, String str3, xz xzVar) {
            this.a = str;
            this.b = str2;
            this.f12399c = str3;
            this.d = xzVar;
        }

        @Override // com.oplus.aiunit.vision.s5m
        public String a() {
            return this.f12399c;
        }

        @Override // com.oplus.aiunit.vision.s5m
        public xz b() {
            return this.d;
        }

        @Override // com.oplus.aiunit.vision.s5m
        public String c() {
            return this.a;
        }

        @Override // com.oplus.aiunit.vision.s5m
        public String d() {
            return this.b;
        }

        public String toString() {
            return this.b + this.f12399c + " NS(" + this.a + "), FORM (" + b() + ")";
        }
    }

    public i6m() {
        try {
            g();
            f();
        } catch (XMPException unused) {
            throw new RuntimeException("The XMPSchemaRegistry cannot be initialized!");
        }
    }

    @Override // com.oplus.aiunit.vision.h6m
    public synchronized String a(String str) {
        return (String) this.a.get(str);
    }

    @Override // com.oplus.aiunit.vision.h6m
    public synchronized String b(String str, String str2) throws XMPException {
        k7e.e(str);
        k7e.c(str2);
        if (str2.charAt(str2.length() - 1) != ':') {
            str2 = str2 + ':';
        }
        if (!srk.g(str2.substring(0, str2.length() - 1))) {
            throw new XMPException("The prefix is a bad XML name", 201);
        }
        String str3 = (String) this.a.get(str);
        String str4 = (String) this.b.get(str2);
        if (str3 != null) {
            return str3;
        }
        if (str4 != null) {
            String str5 = str2;
            int i = 1;
            while (this.b.containsKey(str5)) {
                str5 = str2.substring(0, str2.length() - 1) + "_" + i + "_:";
                i++;
            }
            str2 = str5;
        }
        this.b.put(str2, str);
        this.a.put(str, str2);
        return str2;
    }

    @Override // com.oplus.aiunit.vision.h6m
    public synchronized String c(String str) {
        if (str != null) {
            if (!str.endsWith(":")) {
                str = str + ":";
            }
        }
        return (String) this.b.get(str);
    }

    @Override // com.oplus.aiunit.vision.h6m
    public synchronized s5m d(String str) {
        return (s5m) this.f12398c.get(str);
    }

    public synchronized void e(String str, String str2, String str3, String str4, xz xzVar) throws XMPException {
        k7e.e(str);
        k7e.d(str2);
        k7e.e(str3);
        k7e.d(str4);
        xz xzVar2 = xzVar != null ? new xz(a6m.p(xzVar.m(), null).d()) : new xz();
        if (this.d.matcher(str2).find() || this.d.matcher(str4).find()) {
            throw new XMPException("Alias and actual property names must be simple", 102);
        }
        String strA = a(str);
        String strA2 = a(str3);
        if (strA == null) {
            throw new XMPException("Alias namespace is not registered", 101);
        }
        if (strA2 == null) {
            throw new XMPException("Actual namespace is not registered", 101);
        }
        String str5 = strA + str2;
        if (this.f12398c.containsKey(str5)) {
            throw new XMPException("Alias is already existing", 4);
        }
        if (this.f12398c.containsKey(strA2 + str4)) {
            throw new XMPException("Actual property is already an alias, use the base property", 4);
        }
        this.f12398c.put(str5, new a(str3, strA2, str4, xzVar2));
    }

    public final void f() throws XMPException {
        xz xzVarL = new xz().l(true);
        xz xzVarK = new xz().k(true);
        e("http://ns.adobe.com/xap/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", xzVarL);
        e("http://ns.adobe.com/xap/1.0/", "Authors", "http://purl.org/dc/elements/1.1/", "creator", null);
        e("http://ns.adobe.com/xap/1.0/", "Description", "http://purl.org/dc/elements/1.1/", iim.a.f, null);
        e("http://ns.adobe.com/xap/1.0/", "Format", "http://purl.org/dc/elements/1.1/", "format", null);
        e("http://ns.adobe.com/xap/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
        e("http://ns.adobe.com/xap/1.0/", "Locale", "http://purl.org/dc/elements/1.1/", "language", null);
        e("http://ns.adobe.com/xap/1.0/", SceneBankData.KEY_TITLE, "http://purl.org/dc/elements/1.1/", "title", null);
        e("http://ns.adobe.com/xap/1.0/rights/", ExifInterface.TAG_COPYRIGHT, "http://purl.org/dc/elements/1.1/", "rights", null);
        e("http://ns.adobe.com/pdf/1.3/", "Author", "http://purl.org/dc/elements/1.1/", "creator", xzVarL);
        e("http://ns.adobe.com/pdf/1.3/", "BaseURL", "http://ns.adobe.com/xap/1.0/", "BaseURL", null);
        e("http://ns.adobe.com/pdf/1.3/", "CreationDate", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
        e("http://ns.adobe.com/pdf/1.3/", "Creator", "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
        e("http://ns.adobe.com/pdf/1.3/", "ModDate", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
        e("http://ns.adobe.com/pdf/1.3/", "Subject", "http://purl.org/dc/elements/1.1/", iim.a.f, xzVarK);
        e("http://ns.adobe.com/pdf/1.3/", SceneBankData.KEY_TITLE, "http://purl.org/dc/elements/1.1/", "title", xzVarK);
        e("http://ns.adobe.com/photoshop/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", xzVarL);
        e("http://ns.adobe.com/photoshop/1.0/", "Caption", "http://purl.org/dc/elements/1.1/", iim.a.f, xzVarK);
        e("http://ns.adobe.com/photoshop/1.0/", ExifInterface.TAG_COPYRIGHT, "http://purl.org/dc/elements/1.1/", "rights", xzVarK);
        e("http://ns.adobe.com/photoshop/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", null);
        e("http://ns.adobe.com/photoshop/1.0/", "Marked", "http://ns.adobe.com/xap/1.0/rights/", "Marked", null);
        e("http://ns.adobe.com/photoshop/1.0/", SceneBankData.KEY_TITLE, "http://purl.org/dc/elements/1.1/", "title", xzVarK);
        e("http://ns.adobe.com/photoshop/1.0/", "WebStatement", "http://ns.adobe.com/xap/1.0/rights/", "WebStatement", null);
        e("http://ns.adobe.com/tiff/1.0/", ExifInterface.TAG_ARTIST, "http://purl.org/dc/elements/1.1/", "creator", xzVarL);
        e("http://ns.adobe.com/tiff/1.0/", ExifInterface.TAG_COPYRIGHT, "http://purl.org/dc/elements/1.1/", "rights", null);
        e("http://ns.adobe.com/tiff/1.0/", ExifInterface.TAG_DATETIME, "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
        e("http://ns.adobe.com/tiff/1.0/", ExifInterface.TAG_IMAGE_DESCRIPTION, "http://purl.org/dc/elements/1.1/", iim.a.f, null);
        e("http://ns.adobe.com/tiff/1.0/", ExifInterface.TAG_SOFTWARE, "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
        e("http://ns.adobe.com/png/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", xzVarL);
        e("http://ns.adobe.com/png/1.0/", ExifInterface.TAG_COPYRIGHT, "http://purl.org/dc/elements/1.1/", "rights", xzVarK);
        e("http://ns.adobe.com/png/1.0/", "CreationTime", "http://ns.adobe.com/xap/1.0/", "CreateDate", null);
        e("http://ns.adobe.com/png/1.0/", "Description", "http://purl.org/dc/elements/1.1/", iim.a.f, xzVarK);
        e("http://ns.adobe.com/png/1.0/", "ModificationTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", null);
        e("http://ns.adobe.com/png/1.0/", ExifInterface.TAG_SOFTWARE, "http://ns.adobe.com/xap/1.0/", "CreatorTool", null);
        e("http://ns.adobe.com/png/1.0/", SceneBankData.KEY_TITLE, "http://purl.org/dc/elements/1.1/", "title", xzVarK);
    }

    public final void g() throws XMPException {
        b("http://www.w3.org/XML/1998/namespace", SpeechConstant.RESULT_TYPE_XML);
        b("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf");
        b("http://purl.org/dc/elements/1.1/", "dc");
        b("http://iptc.org/std/Iptc4xmpCore/1.0/xmlns/", "Iptc4xmpCore");
        b("http://iptc.org/std/Iptc4xmpExt/2008-02-29/", "Iptc4xmpExt");
        b("http://ns.adobe.com/DICOM/", "DICOM");
        b("http://ns.useplus.org/ldf/xmp/1.0/", "plus");
        b("adobe:ns:meta/", "x");
        b("http://ns.adobe.com/iX/1.0/", "iX");
        b("http://ns.adobe.com/xap/1.0/", "xmp");
        b("http://ns.adobe.com/xap/1.0/rights/", "xmpRights");
        b("http://ns.adobe.com/xap/1.0/mm/", "xmpMM");
        b("http://ns.adobe.com/xap/1.0/bj/", "xmpBJ");
        b("http://ns.adobe.com/xmp/note/", "xmpNote");
        b("http://ns.adobe.com/pdf/1.3/", "pdf");
        b("http://ns.adobe.com/pdfx/1.3/", "pdfx");
        b("http://www.npes.org/pdfx/ns/id/", "pdfxid");
        b("http://www.aiim.org/pdfa/ns/schema#", "pdfaSchema");
        b("http://www.aiim.org/pdfa/ns/property#", "pdfaProperty");
        b("http://www.aiim.org/pdfa/ns/type#", "pdfaType");
        b("http://www.aiim.org/pdfa/ns/field#", "pdfaField");
        b("http://www.aiim.org/pdfa/ns/id/", "pdfaid");
        b("http://www.aiim.org/pdfa/ns/extension/", "pdfaExtension");
        b("http://ns.adobe.com/photoshop/1.0/", "photoshop");
        b("http://ns.adobe.com/album/1.0/", lo9.TAG_DEFAULT_CREATION_ALBUM);
        b("http://ns.adobe.com/exif/1.0/", "exif");
        b("http://cipa.jp/exif/1.0/", "exifEX");
        b("http://ns.adobe.com/exif/1.0/aux/", "aux");
        b("http://ns.adobe.com/tiff/1.0/", "tiff");
        b("http://ns.adobe.com/png/1.0/", "png");
        b("http://ns.adobe.com/jpeg/1.0/", "jpeg");
        b("http://ns.adobe.com/jp2k/1.0/", "jp2k");
        b("http://ns.adobe.com/camera-raw-settings/1.0/", "crs");
        b("http://ns.adobe.com/StockPhoto/1.0/", "bmsp");
        b("http://ns.adobe.com/creatorAtom/1.0/", "creatorAtom");
        b("http://ns.adobe.com/asf/1.0/", "asf");
        b("http://ns.adobe.com/xmp/wav/1.0/", SpeechConstant.AUDIO_FORMAT_WAV);
        b("http://ns.adobe.com/bwf/bext/1.0/", "bext");
        b("http://ns.adobe.com/riff/info/", "riffinfo");
        b("http://ns.adobe.com/xmp/1.0/Script/", "xmpScript");
        b("http://ns.adobe.com/TransformXMP/", "txmp");
        b("http://ns.adobe.com/swf/1.0/", "swf");
        b("http://ns.adobe.com/xmp/1.0/DynamicMedia/", "xmpDM");
        b("http://ns.adobe.com/xmp/transient/1.0/", "xmpx");
        b("http://ns.adobe.com/xap/1.0/t/", "xmpT");
        b("http://ns.adobe.com/xap/1.0/t/pg/", "xmpTPg");
        b("http://ns.adobe.com/xap/1.0/g/", "xmpG");
        b("http://ns.adobe.com/xap/1.0/g/img/", "xmpGImg");
        b("http://ns.adobe.com/xap/1.0/sType/Font#", "stFnt");
        b("http://ns.adobe.com/xap/1.0/sType/Dimensions#", "stDim");
        b("http://ns.adobe.com/xap/1.0/sType/ResourceEvent#", "stEvt");
        b("http://ns.adobe.com/xap/1.0/sType/ResourceRef#", "stRef");
        b("http://ns.adobe.com/xap/1.0/sType/Version#", "stVer");
        b("http://ns.adobe.com/xap/1.0/sType/Job#", "stJob");
        b("http://ns.adobe.com/xap/1.0/sType/ManifestItem#", "stMfs");
        b("http://ns.adobe.com/xmp/Identifier/qual/1.0/", "xmpidq");
    }
}

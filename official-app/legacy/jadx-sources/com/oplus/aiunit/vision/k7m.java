package com.oplus.aiunit.vision;

import android.util.Xml;
import com.heytap.webview.extension.protocol.Const;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes19.dex */
public class k7m {
    public static final String TAG = "XmlUtil";

    public static ivl a(File file) {
        boolean z;
        int next;
        ivl ivlVar = new ivl();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setInput(fileInputStream, "utf-8");
            do {
                next = xmlPullParserNewPullParser.next();
                if (next == 2) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (Const.Scheme.SCHEME_FILE.equals(name)) {
                        ivlVar.b(xmlPullParserNewPullParser.nextText());
                    } else if ("version".equals(name)) {
                        ivlVar.d(xmlPullParserNewPullParser.nextText());
                    } else if ("wf_unique".equals(name)) {
                        ivlVar.e(xmlPullParserNewPullParser.nextText());
                    } else if ("file_type".equals(name)) {
                        ivlVar.c(Integer.valueOf(xmlPullParserNewPullParser.nextText()).intValue());
                    }
                }
                z = true;
            } while (next != 1);
        } catch (IOException e2) {
            ltl.i(TAG, "[getXmlWfFileName] IOException " + e2.toString());
            z = false;
        } catch (ArrayIndexOutOfBoundsException e3) {
            ltl.i(TAG, "[getXmlWfFileName] ArrayIndexOutOfBoundsException " + e3.toString());
            z = false;
        } catch (NullPointerException e4) {
            ltl.i(TAG, "[getXmlWfFileName] NullPointerException " + e4.toString());
            z = false;
        } catch (NumberFormatException e5) {
            ltl.i(TAG, "[getXmlWfFileName] NumberFormatException " + e5.toString());
            z = false;
        } catch (XmlPullParserException e6) {
            ltl.i(TAG, "[getXmlWfFileName] XmlPullParserException " + e6.toString());
            z = false;
        }
        if (z) {
            return ivlVar;
        }
        return null;
    }
}

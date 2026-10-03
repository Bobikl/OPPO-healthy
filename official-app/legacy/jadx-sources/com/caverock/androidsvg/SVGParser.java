package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.util.Xml;
import androidx.core.internal.view.SupportMenu;
import com.client.platform.opensdk.pay.download.resource.Colors;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.eui;
import com.oplus.aiunit.vision.hca;
import com.oplus.aiunit.vision.kam;
import com.oplus.aiunit.vision.mla;
import com.oplus.aiunit.vision.ozc;
import com.oplus.aiunit.vision.s05;
import com.oplus.aiunit.vision.zz4;
import com.oplus.deviceui.BatteryView;
import com.oplus.smartenginehelper.entity.TextEntity;
import io.netty.util.internal.StringUtil;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.apache.commons.codec.language.Soundex;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes13.dex */
public class SVGParser {
    public static final int ENTITY_WATCH_BUFFER_SIZE = 4096;
    public static final String XML_STYLESHEET_ATTR_ALTERNATE = "alternate";
    public static final String XML_STYLESHEET_ATTR_ALTERNATE_NO = "no";
    public static final String XML_STYLESHEET_ATTR_HREF = "href";
    public static final String XML_STYLESHEET_ATTR_MEDIA = "media";
    public static final String XML_STYLESHEET_ATTR_MEDIA_ALL = "all";
    public static final String XML_STYLESHEET_ATTR_TYPE = "type";
    public int d;
    public SVG a = null;
    public SVG.h0 b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1475c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1476e = false;
    public SVGElem f = null;
    public StringBuilder g = null;
    public boolean h = false;
    public StringBuilder i = null;

    public enum SVGAttr {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;

        private static final Map<String, SVGAttr> cache = new HashMap();

        static {
            for (SVGAttr sVGAttr : values()) {
                if (sVGAttr == CLASS) {
                    cache.put("class", sVGAttr);
                } else {
                    if (sVGAttr != UNSUPPORTED) {
                        cache.put(sVGAttr.name().replace('_', Soundex.SILENT_MARKER), sVGAttr);
                    }
                }
            }
        }

        public static SVGAttr fromString(String str) {
            SVGAttr sVGAttr = cache.get(str);
            return sVGAttr != null ? sVGAttr : UNSUPPORTED;
        }
    }

    public enum SVGElem {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;

        private static final Map<String, SVGElem> cache = new HashMap();

        static {
            for (SVGElem sVGElem : values()) {
                if (sVGElem == SWITCH) {
                    cache.put("switch", sVGElem);
                } else if (sVGElem != UNSUPPORTED) {
                    cache.put(sVGElem.name(), sVGElem);
                }
            }
        }

        public static SVGElem fromString(String str) {
            SVGElem sVGElem = cache.get(str);
            return sVGElem != null ? sVGElem : UNSUPPORTED;
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[SVGAttr.values().length];
            b = iArr;
            try {
                iArr[SVGAttr.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[SVGAttr.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[SVGAttr.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[SVGAttr.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[SVGAttr.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[SVGAttr.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[SVGAttr.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[SVGAttr.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[SVGAttr.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[SVGAttr.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[SVGAttr.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[SVGAttr.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[SVGAttr.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[SVGAttr.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[SVGAttr.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[SVGAttr.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[SVGAttr.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[SVGAttr.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                b[SVGAttr.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                b[SVGAttr.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                b[SVGAttr.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                b[SVGAttr.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                b[SVGAttr.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                b[SVGAttr.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                b[SVGAttr.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                b[SVGAttr.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                b[SVGAttr.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                b[SVGAttr.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                b[SVGAttr.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                b[SVGAttr.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                b[SVGAttr.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                b[SVGAttr.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                b[SVGAttr.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                b[SVGAttr.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                b[SVGAttr.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                b[SVGAttr.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                b[SVGAttr.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                b[SVGAttr.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                b[SVGAttr.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                b[SVGAttr.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                b[SVGAttr.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                b[SVGAttr.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                b[SVGAttr.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                b[SVGAttr.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                b[SVGAttr.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                b[SVGAttr.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                b[SVGAttr.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                b[SVGAttr.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                b[SVGAttr.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                b[SVGAttr.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                b[SVGAttr.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                b[SVGAttr.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                b[SVGAttr.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                b[SVGAttr.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                b[SVGAttr.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                b[SVGAttr.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                b[SVGAttr.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                b[SVGAttr.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                b[SVGAttr.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                b[SVGAttr.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                b[SVGAttr.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                b[SVGAttr.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                b[SVGAttr.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                b[SVGAttr.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                b[SVGAttr.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                b[SVGAttr.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                b[SVGAttr.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                b[SVGAttr.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                b[SVGAttr.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                b[SVGAttr.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                b[SVGAttr.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                b[SVGAttr.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                b[SVGAttr.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                b[SVGAttr.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                b[SVGAttr.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                b[SVGAttr.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                b[SVGAttr.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                b[SVGAttr.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                b[SVGAttr.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                b[SVGAttr.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                b[SVGAttr.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                b[SVGAttr.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                b[SVGAttr.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                b[SVGAttr.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                b[SVGAttr.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                b[SVGAttr.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                b[SVGAttr.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                b[SVGAttr.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                b[SVGAttr.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[SVGElem.values().length];
            a = iArr2;
            try {
                iArr2[SVGElem.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                a[SVGElem.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                a[SVGElem.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                a[SVGElem.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                a[SVGElem.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                a[SVGElem.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                a[SVGElem.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                a[SVGElem.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                a[SVGElem.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                a[SVGElem.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                a[SVGElem.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                a[SVGElem.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                a[SVGElem.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                a[SVGElem.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                a[SVGElem.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                a[SVGElem.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                a[SVGElem.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                a[SVGElem.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                a[SVGElem.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                a[SVGElem.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                a[SVGElem.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                a[SVGElem.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                a[SVGElem.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                a[SVGElem.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                a[SVGElem.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                a[SVGElem.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                a[SVGElem.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                a[SVGElem.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                a[SVGElem.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                a[SVGElem.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                a[SVGElem.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    public static class b {
        public static final Map<String, PreserveAspectRatio.Alignment> a;

        static {
            HashMap map = new HashMap(10);
            a = map;
            map.put(SpeechConstant.ENGINE_TYPE_NONE, PreserveAspectRatio.Alignment.none);
            map.put("xMinYMin", PreserveAspectRatio.Alignment.xMinYMin);
            map.put("xMidYMin", PreserveAspectRatio.Alignment.xMidYMin);
            map.put("xMaxYMin", PreserveAspectRatio.Alignment.xMaxYMin);
            map.put("xMinYMid", PreserveAspectRatio.Alignment.xMinYMid);
            map.put("xMidYMid", PreserveAspectRatio.Alignment.xMidYMid);
            map.put("xMaxYMid", PreserveAspectRatio.Alignment.xMaxYMid);
            map.put("xMinYMax", PreserveAspectRatio.Alignment.xMinYMax);
            map.put("xMidYMax", PreserveAspectRatio.Alignment.xMidYMax);
            map.put("xMaxYMax", PreserveAspectRatio.Alignment.xMaxYMax);
        }

        public static PreserveAspectRatio.Alignment a(String str) {
            return a.get(str);
        }
    }

    public static class c {
        public static final Map<String, Integer> a;

        static {
            HashMap map = new HashMap(47);
            a = map;
            map.put("aliceblue", -984833);
            map.put("antiquewhite", -332841);
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            map.put("azure", -983041);
            map.put("beige", -657956);
            map.put("bisque", -6972);
            map.put("black", -16777216);
            map.put("blanchedalmond", -5171);
            map.put("blue", -16776961);
            map.put("blueviolet", -7722014);
            map.put("brown", -5952982);
            map.put("burlywood", -2180985);
            map.put("cadetblue", -10510688);
            map.put("chartreuse", -8388864);
            map.put("chocolate", -2987746);
            map.put("coral", -32944);
            map.put("cornflowerblue", -10185235);
            map.put("cornsilk", -1828);
            map.put("crimson", -2354116);
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            map.put("darkcyan", -16741493);
            map.put("darkgoldenrod", -4684277);
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            map.put("darkmagenta", -7667573);
            map.put("darkolivegreen", -11179217);
            map.put("darkorange", -29696);
            map.put("darkorchid", -6737204);
            map.put("darkred", -7667712);
            map.put("darksalmon", -1468806);
            map.put("darkseagreen", -7357297);
            map.put("darkslateblue", -12042869);
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            map.put("deeppink", -60269);
            map.put("deepskyblue", -16728065);
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            map.put("floralwhite", -1296);
            map.put("forestgreen", -14513374);
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            map.put("ghostwhite", -460545);
            map.put("gold", -10496);
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            map.put("green", -16744448);
            map.put("greenyellow", -5374161);
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            map.put("hotpink", -38476);
            map.put("indianred", -3318692);
            map.put("indigo", -11861886);
            map.put("ivory", -16);
            map.put("khaki", -989556);
            map.put("lavender", -1644806);
            map.put("lavenderblush", -3851);
            map.put("lawngreen", -8586240);
            map.put("lemonchiffon", -1331);
            map.put("lightblue", -5383962);
            map.put("lightcoral", -1015680);
            map.put("lightcyan", -2031617);
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            map.put("lightpink", -18751);
            map.put("lightsalmon", -24454);
            map.put("lightseagreen", -14634326);
            map.put("lightskyblue", -7876870);
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            map.put("lime", -16711936);
            map.put("limegreen", -13447886);
            map.put("linen", -331546);
            map.put("magenta", -65281);
            map.put("maroon", -8388608);
            map.put("mediumaquamarine", -10039894);
            map.put("mediumblue", -16777011);
            map.put("mediumorchid", -4565549);
            map.put("mediumpurple", -7114533);
            map.put("mediumseagreen", -12799119);
            map.put("mediumslateblue", -8689426);
            map.put("mediumspringgreen", -16713062);
            map.put("mediumturquoise", -12004916);
            map.put("mediumvioletred", -3730043);
            map.put("midnightblue", -15132304);
            map.put("mintcream", -655366);
            map.put("mistyrose", -6943);
            map.put("moccasin", -6987);
            map.put("navajowhite", -8531);
            map.put("navy", -16777088);
            map.put("oldlace", -133658);
            map.put("olive", -8355840);
            map.put("olivedrab", -9728477);
            map.put("orange", -23296);
            map.put("orangered", -47872);
            map.put("orchid", -2461482);
            map.put("palegoldenrod", -1120086);
            map.put("palegreen", -6751336);
            map.put("paleturquoise", -5247250);
            map.put("palevioletred", -2396013);
            map.put("papayawhip", -4139);
            map.put("peachpuff", -9543);
            map.put("peru", -3308225);
            map.put("pink", -16181);
            map.put("plum", -2252579);
            map.put("powderblue", -5185306);
            map.put("purple", -8388480);
            map.put("rebeccapurple", -10079335);
            map.put("red", Integer.valueOf(SupportMenu.CATEGORY_MASK));
            map.put("rosybrown", -4419697);
            map.put("royalblue", -12490271);
            map.put("saddlebrown", -7650029);
            map.put("salmon", -360334);
            map.put("sandybrown", -744352);
            map.put("seagreen", -13726889);
            map.put("seashell", -2578);
            map.put("sienna", -6270419);
            map.put("silver", -4144960);
            map.put("skyblue", -7876885);
            map.put("slateblue", -9807155);
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            map.put("steelblue", -12156236);
            map.put("tan", -2968436);
            map.put("teal", -16744320);
            map.put("thistle", -2572328);
            map.put("tomato", -40121);
            map.put("turquoise", -12525360);
            map.put("violet", -1146130);
            map.put("wheat", -663885);
            map.put("white", -1);
            map.put("whitesmoke", Integer.valueOf(Colors.bg_window));
            map.put("yellow", -256);
            map.put("yellowgreen", -6632142);
            map.put("transparent", 0);
        }

        public static Integer a(String str) {
            return a.get(str);
        }
    }

    public static class d {
        public static final Map<String, SVG.o> a;

        static {
            HashMap map = new HashMap(9);
            a = map;
            SVG.Unit unit = SVG.Unit.pt;
            map.put("xx-small", new SVG.o(0.694f, unit));
            map.put("x-small", new SVG.o(0.833f, unit));
            map.put(BatteryView.STYLE_SMALL, new SVG.o(10.0f, unit));
            map.put("medium", new SVG.o(12.0f, unit));
            map.put("large", new SVG.o(14.4f, unit));
            map.put("x-large", new SVG.o(17.3f, unit));
            map.put("xx-large", new SVG.o(20.7f, unit));
            SVG.Unit unit2 = SVG.Unit.percent;
            map.put("smaller", new SVG.o(83.33f, unit2));
            map.put("larger", new SVG.o(120.0f, unit2));
        }

        public static SVG.o a(String str) {
            return a.get(str);
        }
    }

    public static class e {
        public static final Map<String, Integer> a;

        static {
            HashMap map = new HashMap(13);
            a = map;
            map.put("normal", 400);
            map.put(TextEntity.TYPEFACE_STYLE_BOLD, 700);
            map.put("bolder", 1);
            map.put("lighter", -1);
            map.put("100", 100);
            map.put("200", 200);
            map.put("300", 300);
            map.put("400", 400);
            map.put("500", 500);
            map.put("600", 600);
            map.put("700", 700);
            map.put("800", 800);
            map.put("900", 900);
        }

        public static Integer a(String str) {
            return a.get(str);
        }
    }

    public class f extends DefaultHandler2 {
        public f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            SVGParser.this.c1(new String(cArr, i, i2));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() throws SAXException {
            SVGParser.this.o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            SVGParser.this.p(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) throws SAXException {
            SVGParser.this.r(str, SVGParser.this.x0(new g(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() throws SAXException {
            SVGParser.this.W0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            SVGParser.this.X0(str, str2, str3, attributes);
        }

        public /* synthetic */ f(SVGParser sVGParser, a aVar) {
            this();
        }
    }

    public static class g {
        public String a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1477c;
        public int b = 0;
        public ozc d = new ozc();

        public g(String str) {
            this.f1477c = 0;
            String strTrim = str.trim();
            this.a = strTrim;
            this.f1477c = strTrim.length();
        }

        public void A() {
            while (true) {
                int i = this.b;
                if (i >= this.f1477c || !k(this.a.charAt(i))) {
                    return;
                } else {
                    this.b++;
                }
            }
        }

        public int a() {
            int i = this.b;
            int i2 = this.f1477c;
            if (i == i2) {
                return -1;
            }
            int i3 = i + 1;
            this.b = i3;
            if (i3 < i2) {
                return this.a.charAt(i3);
            }
            return -1;
        }

        public String b() {
            int i = this.b;
            while (!h() && !k(this.a.charAt(this.b))) {
                this.b++;
            }
            String strSubstring = this.a.substring(i, this.b);
            this.b = i;
            return strSubstring;
        }

        public Boolean c(Object obj) {
            if (obj == null) {
                return null;
            }
            z();
            return m();
        }

        public float d(float f) {
            if (Float.isNaN(f)) {
                return Float.NaN;
            }
            z();
            return n();
        }

        public float e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            z();
            return n();
        }

        public boolean f(char c2) {
            int i = this.b;
            boolean z = i < this.f1477c && this.a.charAt(i) == c2;
            if (z) {
                this.b++;
            }
            return z;
        }

        public boolean g(String str) {
            int length = str.length();
            int i = this.b;
            boolean z = i <= this.f1477c - length && this.a.substring(i, i + length).equals(str);
            if (z) {
                this.b += length;
            }
            return z;
        }

        public boolean h() {
            return this.b == this.f1477c;
        }

        public boolean i() {
            int i = this.b;
            if (i == this.f1477c) {
                return false;
            }
            char cCharAt = this.a.charAt(i);
            return (cCharAt >= 'a' && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z');
        }

        public boolean j(int i) {
            return i == 10 || i == 13;
        }

        public boolean k(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        public Integer l() {
            int i = this.b;
            if (i == this.f1477c) {
                return null;
            }
            String str = this.a;
            this.b = i + 1;
            return Integer.valueOf(str.charAt(i));
        }

        public Boolean m() {
            int i = this.b;
            if (i == this.f1477c) {
                return null;
            }
            char cCharAt = this.a.charAt(i);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        public float n() {
            float fB = this.d.b(this.a, this.b, this.f1477c);
            if (!Float.isNaN(fB)) {
                this.b = this.d.a();
            }
            return fB;
        }

        public String o() {
            if (h()) {
                return null;
            }
            int i = this.b;
            int iCharAt = this.a.charAt(i);
            while (true) {
                if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                    break;
                }
                iCharAt = a();
            }
            int i2 = this.b;
            while (k(iCharAt)) {
                iCharAt = a();
            }
            if (iCharAt == 40) {
                this.b++;
                return this.a.substring(i, i2);
            }
            this.b = i;
            return null;
        }

        public SVG.o p() {
            float fN = n();
            if (Float.isNaN(fN)) {
                return null;
            }
            SVG.Unit unitV = v();
            return unitV == null ? new SVG.o(fN, SVG.Unit.px) : new SVG.o(fN, unitV);
        }

        public String q() {
            if (h()) {
                return null;
            }
            int i = this.b;
            char cCharAt = this.a.charAt(i);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iA = a();
            while (iA != -1 && iA != cCharAt) {
                iA = a();
            }
            if (iA == -1) {
                this.b = i;
                return null;
            }
            int i2 = this.b + 1;
            this.b = i2;
            return this.a.substring(i + 1, i2 - 1);
        }

        public String r() {
            return t(StringUtil.SPACE, false);
        }

        public String s(char c2) {
            return t(c2, false);
        }

        public String t(char c2, boolean z) {
            if (h()) {
                return null;
            }
            char cCharAt = this.a.charAt(this.b);
            if ((!z && k(cCharAt)) || cCharAt == c2) {
                return null;
            }
            int i = this.b;
            int iA = a();
            while (iA != -1 && iA != c2 && (z || !k(iA))) {
                iA = a();
            }
            return this.a.substring(i, this.b);
        }

        public String u(char c2) {
            return t(c2, true);
        }

        public SVG.Unit v() {
            if (h()) {
                return null;
            }
            if (this.a.charAt(this.b) == '%') {
                this.b++;
                return SVG.Unit.percent;
            }
            int i = this.b;
            if (i > this.f1477c - 2) {
                return null;
            }
            try {
                SVG.Unit unitValueOf = SVG.Unit.valueOf(this.a.substring(i, i + 2).toLowerCase(Locale.US));
                this.b += 2;
                return unitValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public String w() {
            if (h()) {
                return null;
            }
            int i = this.b;
            char cCharAt = this.a.charAt(i);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                this.b = i;
                return null;
            }
            int iA = a();
            while (true) {
                if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                    break;
                }
                iA = a();
            }
            return this.a.substring(i, this.b);
        }

        public float x() {
            z();
            float fB = this.d.b(this.a, this.b, this.f1477c);
            if (!Float.isNaN(fB)) {
                this.b = this.d.a();
            }
            return fB;
        }

        public String y() {
            if (h()) {
                return null;
            }
            int i = this.b;
            this.b = this.f1477c;
            return this.a.substring(i);
        }

        public boolean z() {
            A();
            int i = this.b;
            if (i == this.f1477c || this.a.charAt(i) != ',') {
                return false;
            }
            this.b++;
            A();
            return true;
        }
    }

    public class h implements Attributes {
        public XmlPullParser a;

        public h(XmlPullParser xmlPullParser) {
            this.a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i) {
            return this.a.getAttributeName(i);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i) {
            String attributeName = this.a.getAttributeName(i);
            if (this.a.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return this.a.getAttributePrefix(i) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i) {
            return this.a.getAttributeNamespace(i);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i) {
            return this.a.getAttributeValue(i);
        }
    }

    public static Set<String> A0(String str) {
        g gVar = new g(str);
        HashSet hashSet = new HashSet();
        while (!gVar.h()) {
            hashSet.add(gVar.r());
            gVar.A();
        }
        return hashSet;
    }

    public static SVG.o[] B0(String str) {
        SVG.o oVarP;
        g gVar = new g(str);
        gVar.A();
        if (gVar.h() || (oVarP = gVar.p()) == null || oVarP.i()) {
            return null;
        }
        float fA = oVarP.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(oVarP);
        while (!gVar.h()) {
            gVar.z();
            SVG.o oVarP2 = gVar.p();
            if (oVarP2 == null || oVarP2.i()) {
                return null;
            }
            arrayList.add(oVarP2);
            fA += oVarP2.a();
        }
        if (fA == 0.0f) {
            return null;
        }
        return (SVG.o[]) arrayList.toArray(new SVG.o[arrayList.size()]);
    }

    public static SVG.Style.LineCap C0(String str) {
        if ("butt".equals(str)) {
            return SVG.Style.LineCap.Butt;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineCap.Round;
        }
        if ("square".equals(str)) {
            return SVG.Style.LineCap.Square;
        }
        return null;
    }

    public static SVG.Style.LineJoin D0(String str) {
        if ("miter".equals(str)) {
            return SVG.Style.LineJoin.Miter;
        }
        if ("round".equals(str)) {
            return SVG.Style.LineJoin.Round;
        }
        if ("bevel".equals(str)) {
            return SVG.Style.LineJoin.Bevel;
        }
        return null;
    }

    public static void E0(SVG.j0 j0Var, String str) {
        g gVar = new g(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strS = gVar.s(':');
            gVar.A();
            if (!gVar.f(':')) {
                return;
            }
            gVar.A();
            String strU = gVar.u(';');
            if (strU == null) {
                return;
            }
            gVar.A();
            if (gVar.h() || gVar.f(';')) {
                if (j0Var.f == null) {
                    j0Var.f = new SVG.Style();
                }
                S0(j0Var.f, strS, strU);
                gVar.A();
            }
        }
    }

    public static Set<String> F0(String str) {
        g gVar = new g(str);
        HashSet hashSet = new HashSet();
        while (!gVar.h()) {
            String strR = gVar.r();
            int iIndexOf = strR.indexOf(45);
            if (iIndexOf != -1) {
                strR = strR.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strR, "", "").getLanguage());
            gVar.A();
        }
        return hashSet;
    }

    public static SVG.Style.TextAnchor G0(String str) {
        str.hashCode();
        switch (str) {
            case "middle":
                return SVG.Style.TextAnchor.Middle;
            case "end":
                return SVG.Style.TextAnchor.End;
            case "start":
                return SVG.Style.TextAnchor.Start;
            default:
                return null;
        }
    }

    public static SVG.Style.TextDecoration H0(String str) {
        str.hashCode();
        switch (str) {
            case "line-through":
                return SVG.Style.TextDecoration.LineThrough;
            case "underline":
                return SVG.Style.TextDecoration.Underline;
            case "none":
                return SVG.Style.TextDecoration.None;
            case "blink":
                return SVG.Style.TextDecoration.Blink;
            case "overline":
                return SVG.Style.TextDecoration.Overline;
            default:
                return null;
        }
    }

    public static SVG.Style.TextDirection I0(String str) {
        str.hashCode();
        if (str.equals("ltr")) {
            return SVG.Style.TextDirection.LTR;
        }
        if (str.equals("rtl")) {
            return SVG.Style.TextDirection.RTL;
        }
        return null;
    }

    public static SVG.Style.VectorEffect M0(String str) {
        str.hashCode();
        if (str.equals(SpeechConstant.ENGINE_TYPE_NONE)) {
            return SVG.Style.VectorEffect.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return SVG.Style.VectorEffect.NonScalingStroke;
        }
        return null;
    }

    public static SVG.b N0(String str) throws SVGParseException {
        g gVar = new g(str);
        gVar.A();
        float fN = gVar.n();
        gVar.z();
        float fN2 = gVar.n();
        gVar.z();
        float fN3 = gVar.n();
        gVar.z();
        float fN4 = gVar.n();
        if (Float.isNaN(fN) || Float.isNaN(fN2) || Float.isNaN(fN3) || Float.isNaN(fN4)) {
            throw new SVGParseException("Invalid viewBox definition - should have four numbers");
        }
        if (fN3 < 0.0f) {
            throw new SVGParseException("Invalid viewBox. width cannot be negative");
        }
        if (fN4 >= 0.0f) {
            return new SVG.b(fN, fN2, fN3, fN4);
        }
        throw new SVGParseException("Invalid viewBox. height cannot be negative");
    }

    public static void S0(SVG.Style style, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.b[SVGAttr.fromString(str).ordinal()]) {
                case 47:
                    SVG.m0 m0VarT0 = t0(str2);
                    style.f1451j = m0VarT0;
                    if (m0VarT0 != null) {
                        style.i |= 1;
                        return;
                    }
                    return;
                case 48:
                    SVG.Style.FillRule fillRuleE0 = e0(str2);
                    style.k = fillRuleE0;
                    if (fillRuleE0 != null) {
                        style.i |= 2;
                        return;
                    }
                    return;
                case 49:
                    Float fR0 = r0(str2);
                    style.f1452l = fR0;
                    if (fR0 != null) {
                        style.i |= 4;
                        return;
                    }
                    return;
                case 50:
                    SVG.m0 m0VarT1 = t0(str2);
                    style.m = m0VarT1;
                    if (m0VarT1 != null) {
                        style.i |= 8;
                        return;
                    }
                    return;
                case 51:
                    Float fR1 = r0(str2);
                    style.f1453n = fR1;
                    if (fR1 != null) {
                        style.i |= 16;
                        return;
                    }
                    return;
                case 52:
                    style.o = o0(str2);
                    style.i |= 32;
                    break;
                case 53:
                    SVG.Style.LineCap lineCapC0 = C0(str2);
                    style.p = lineCapC0;
                    if (lineCapC0 != null) {
                        style.i |= 64;
                        return;
                    }
                    return;
                case 54:
                    SVG.Style.LineJoin lineJoinD0 = D0(str2);
                    style.q = lineJoinD0;
                    if (lineJoinD0 != null) {
                        style.i |= 128;
                        return;
                    }
                    return;
                case 55:
                    style.r = Float.valueOf(f0(str2));
                    style.i |= 256;
                    break;
                case 56:
                    if (SpeechConstant.ENGINE_TYPE_NONE.equals(str2)) {
                        style.s = null;
                        style.i |= 512;
                        return;
                    }
                    SVG.o[] oVarArrB0 = B0(str2);
                    style.s = oVarArrB0;
                    if (oVarArrB0 != null) {
                        style.i |= 512;
                        return;
                    }
                    return;
                case 57:
                    style.t = o0(str2);
                    style.i |= 1024;
                    break;
                case 58:
                    style.u = r0(str2);
                    style.i |= 2048;
                    return;
                case 59:
                    style.v = b0(str2);
                    style.i |= 4096;
                    break;
                case 60:
                    h0(style, str2);
                    return;
                case 61:
                    List<String> listI0 = i0(str2);
                    style.w = listI0;
                    if (listI0 != null) {
                        style.i |= 8192;
                        return;
                    }
                    return;
                case 62:
                    SVG.o oVarJ0 = j0(str2);
                    style.x = oVarJ0;
                    if (oVarJ0 != null) {
                        style.i |= 16384;
                        return;
                    }
                    return;
                case 63:
                    Integer numL0 = l0(str2);
                    style.y = numL0;
                    if (numL0 != null) {
                        style.i |= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
                        return;
                    }
                    return;
                case 64:
                    SVG.Style.FontStyle fontStyleK0 = k0(str2);
                    style.z = fontStyleK0;
                    if (fontStyleK0 != null) {
                        style.i |= 65536;
                        return;
                    }
                    return;
                case 65:
                    SVG.Style.TextDecoration textDecorationH0 = H0(str2);
                    style.A = textDecorationH0;
                    if (textDecorationH0 != null) {
                        style.i |= PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
                        return;
                    }
                    return;
                case 66:
                    SVG.Style.TextDirection textDirectionI0 = I0(str2);
                    style.B = textDirectionI0;
                    if (textDirectionI0 != null) {
                        style.i |= 68719476736L;
                        return;
                    }
                    return;
                case 67:
                    SVG.Style.TextAnchor textAnchorG0 = G0(str2);
                    style.C = textAnchorG0;
                    if (textAnchorG0 != null) {
                        style.i |= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        return;
                    }
                    return;
                case 68:
                    Boolean boolS0 = s0(str2);
                    style.D = boolS0;
                    if (boolS0 != null) {
                        style.i |= 524288;
                        return;
                    }
                    return;
                case 69:
                    String strM0 = m0(str2, str);
                    style.F = strM0;
                    style.G = strM0;
                    style.H = strM0;
                    style.i |= 14680064;
                    return;
                case 70:
                    style.F = m0(str2, str);
                    style.i |= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
                    return;
                case 71:
                    style.G = m0(str2, str);
                    style.i |= 4194304;
                    return;
                case 72:
                    style.H = m0(str2, str);
                    style.i |= 8388608;
                    return;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            style.I = Boolean.valueOf(!str2.equals(SpeechConstant.ENGINE_TYPE_NONE));
                            style.i |= 16777216;
                            return;
                        }
                        return;
                    }
                    return;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            style.J = Boolean.valueOf(str2.equals("visible"));
                            style.i |= zz4.JOURNAL_SIZE_LIMIT_LOW;
                            return;
                        }
                        return;
                    }
                    return;
                case 75:
                    if (!str2.equals("currentColor")) {
                        try {
                            style.K = b0(str2);
                        } catch (SVGParseException e2) {
                            Log.w("SVGParser", e2.getMessage());
                            return;
                        }
                        break;
                    } else {
                        style.K = SVG.g.a();
                    }
                    style.i |= zz4.JOURNAL_SIZE_LIMIT_HIGH;
                    return;
                case 76:
                    style.L = r0(str2);
                    style.i |= 134217728;
                    return;
                case 77:
                    SVG.c cVarA0 = a0(str2);
                    style.E = cVarA0;
                    if (cVarA0 != null) {
                        style.i |= 1048576;
                        return;
                    }
                    return;
                case 78:
                    style.M = m0(str2, str);
                    style.i |= s05.MIN;
                    return;
                case 79:
                    style.N = e0(str2);
                    style.i |= 536870912;
                    return;
                case 80:
                    style.O = m0(str2, str);
                    style.i |= 1073741824;
                    return;
                case 81:
                    if (!str2.equals("currentColor")) {
                        try {
                            style.P = b0(str2);
                        } catch (SVGParseException e3) {
                            Log.w("SVGParser", e3.getMessage());
                            return;
                        }
                        break;
                    } else {
                        style.P = SVG.g.a();
                    }
                    style.i |= 2147483648L;
                    return;
                case 82:
                    style.Q = r0(str2);
                    style.i |= eui.MIN_CAP_LIMIT;
                    return;
                case 83:
                    if (!str2.equals("currentColor")) {
                        try {
                            style.R = b0(str2);
                        } catch (SVGParseException e4) {
                            Log.w("SVGParser", e4.getMessage());
                            return;
                        }
                        break;
                    } else {
                        style.R = SVG.g.a();
                    }
                    style.i |= 8589934592L;
                    return;
                case 84:
                    style.S = r0(str2);
                    style.i |= 17179869184L;
                    return;
                case 85:
                    SVG.Style.VectorEffect vectorEffectM0 = M0(str2);
                    style.T = vectorEffectM0;
                    if (vectorEffectM0 != null) {
                        style.i |= 34359738368L;
                        return;
                    }
                    return;
                case 86:
                    SVG.Style.RenderQuality renderQualityY0 = y0(str2);
                    style.U = renderQualityY0;
                    if (renderQualityY0 != null) {
                        style.i |= 137438953472L;
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (SVGParseException unused) {
        }
    }

    public static SVG.c a0(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        g gVar = new g(str.substring(5));
        gVar.A();
        SVG.o oVarQ0 = q0(gVar);
        gVar.z();
        SVG.o oVarQ1 = q0(gVar);
        gVar.z();
        SVG.o oVarQ2 = q0(gVar);
        gVar.z();
        SVG.o oVarQ3 = q0(gVar);
        gVar.A();
        if (gVar.f(')') || gVar.h()) {
            return new SVG.c(oVarQ0, oVarQ1, oVarQ2, oVarQ3);
        }
        return null;
    }

    public static SVG.f b0(String str) throws SVGParseException {
        if (str.charAt(0) == '#') {
            hca hcaVarB = hca.b(str, 1, str.length());
            if (hcaVarB == null) {
                throw new SVGParseException("Bad hex colour value: " + str);
            }
            int iA = hcaVarB.a();
            if (iA == 4) {
                int iD = hcaVarB.d();
                int i = iD & 3840;
                int i2 = iD & 240;
                int i3 = iD & 15;
                return new SVG.f(i3 | (i << 8) | (-16777216) | (i << 12) | (i2 << 8) | (i2 << 4) | (i3 << 4));
            }
            if (iA == 5) {
                int iD2 = hcaVarB.d();
                int i4 = 61440 & iD2;
                int i5 = iD2 & 3840;
                int i6 = iD2 & 240;
                int i7 = iD2 & 15;
                return new SVG.f((i7 << 24) | (i7 << 28) | (i4 << 8) | (i4 << 4) | (i5 << 4) | i5 | i6 | (i6 >> 4));
            }
            if (iA == 7) {
                return new SVG.f(hcaVarB.d() | (-16777216));
            }
            if (iA == 9) {
                return new SVG.f((hcaVarB.d() >>> 8) | (hcaVarB.d() << 24));
            }
            throw new SVGParseException("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (!zStartsWith && !lowerCase.startsWith("rgb(")) {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
                return c0(lowerCase);
            }
            g gVar = new g(str.substring(zStartsWith2 ? 5 : 4));
            gVar.A();
            float fN = gVar.n();
            float fD = gVar.d(fN);
            if (!Float.isNaN(fD)) {
                gVar.f('%');
            }
            float fD2 = gVar.d(fD);
            if (!Float.isNaN(fD2)) {
                gVar.f('%');
            }
            if (!zStartsWith2) {
                gVar.A();
                if (!Float.isNaN(fD2) && gVar.f(')')) {
                    return new SVG.f(s(fN, fD, fD2) | (-16777216));
                }
                throw new SVGParseException("Bad hsl() colour value: " + str);
            }
            float fD3 = gVar.d(fD2);
            gVar.A();
            if (!Float.isNaN(fD3) && gVar.f(')')) {
                return new SVG.f((j(fD3 * 256.0f) << 24) | s(fN, fD, fD2));
            }
            throw new SVGParseException("Bad hsla() colour value: " + str);
        }
        g gVar2 = new g(str.substring(zStartsWith ? 5 : 4));
        gVar2.A();
        float fN2 = gVar2.n();
        if (!Float.isNaN(fN2) && gVar2.f('%')) {
            fN2 = (fN2 * 256.0f) / 100.0f;
        }
        float fD4 = gVar2.d(fN2);
        if (!Float.isNaN(fD4) && gVar2.f('%')) {
            fD4 = (fD4 * 256.0f) / 100.0f;
        }
        float fD5 = gVar2.d(fD4);
        if (!Float.isNaN(fD5) && gVar2.f('%')) {
            fD5 = (fD5 * 256.0f) / 100.0f;
        }
        if (!zStartsWith) {
            gVar2.A();
            if (!Float.isNaN(fD5) && gVar2.f(')')) {
                return new SVG.f((j(fN2) << 16) | (-16777216) | (j(fD4) << 8) | j(fD5));
            }
            throw new SVGParseException("Bad rgb() colour value: " + str);
        }
        float fD6 = gVar2.d(fD5);
        gVar2.A();
        if (!Float.isNaN(fD6) && gVar2.f(')')) {
            return new SVG.f((j(fD6 * 256.0f) << 24) | (j(fN2) << 16) | (j(fD4) << 8) | j(fD5));
        }
        throw new SVGParseException("Bad rgba() colour value: " + str);
    }

    public static SVG.f c0(String str) throws SVGParseException {
        Integer numA = c.a(str);
        if (numA != null) {
            return new SVG.f(numA.intValue());
        }
        throw new SVGParseException("Invalid colour keyword: " + str);
    }

    public static SVG.m0 d0(String str) {
        str.hashCode();
        if (str.equals(SpeechConstant.ENGINE_TYPE_NONE)) {
            return SVG.f.k;
        }
        if (str.equals("currentColor")) {
            return SVG.g.a();
        }
        try {
            return b0(str);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static SVG.Style.FillRule e0(String str) {
        if ("nonzero".equals(str)) {
            return SVG.Style.FillRule.NonZero;
        }
        if ("evenodd".equals(str)) {
            return SVG.Style.FillRule.EvenOdd;
        }
        return null;
    }

    public static float f0(String str) throws SVGParseException {
        int length = str.length();
        if (length != 0) {
            return g0(str, 0, length);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    public static float g0(String str, int i, int i2) throws SVGParseException {
        float fB = new ozc().b(str, i, i2);
        if (!Float.isNaN(fB)) {
            return fB;
        }
        throw new SVGParseException("Invalid float value: " + str);
    }

    public static void h0(SVG.Style style, String str) {
        String strS;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            g gVar = new g(str);
            Integer numA = null;
            SVG.Style.FontStyle fontStyleK0 = null;
            String str2 = null;
            while (true) {
                strS = gVar.s(mla.SEPARATOR);
                gVar.A();
                if (strS != null) {
                    if (numA != null && fontStyleK0 != null) {
                        break;
                    }
                    if (!strS.equals("normal") && (numA != null || (numA = e.a(strS)) == null)) {
                        if (fontStyleK0 != null || (fontStyleK0 = k0(strS)) == null) {
                            if (str2 != null || !strS.equals("small-caps")) {
                                break;
                            } else {
                                str2 = strS;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            SVG.o oVarJ0 = j0(strS);
            if (gVar.f(mla.SEPARATOR)) {
                gVar.A();
                String strR = gVar.r();
                if (strR != null) {
                    try {
                        o0(strR);
                    } catch (SVGParseException unused) {
                        return;
                    }
                }
                gVar.A();
            }
            style.w = i0(gVar.y());
            style.x = oVarJ0;
            style.y = Integer.valueOf(numA == null ? 400 : numA.intValue());
            if (fontStyleK0 == null) {
                fontStyleK0 = SVG.Style.FontStyle.Normal;
            }
            style.z = fontStyleK0;
            style.i |= 122880;
        }
    }

    public static List<String> i0(String str) {
        g gVar = new g(str);
        ArrayList arrayList = null;
        do {
            String strQ = gVar.q();
            if (strQ == null) {
                strQ = gVar.u(StringUtil.COMMA);
            }
            if (strQ == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strQ);
            gVar.z();
        } while (!gVar.h());
        return arrayList;
    }

    public static int j(float f2) {
        if (f2 < 0.0f) {
            return 0;
        }
        if (f2 > 255.0f) {
            return 255;
        }
        return Math.round(f2);
    }

    public static SVG.o j0(String str) {
        try {
            SVG.o oVarA = d.a(str);
            return oVarA == null ? o0(str) : oVarA;
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static SVG.Style.FontStyle k0(String str) {
        str.hashCode();
        switch (str) {
            case "oblique":
                return SVG.Style.FontStyle.Oblique;
            case "italic":
                return SVG.Style.FontStyle.Italic;
            case "normal":
                return SVG.Style.FontStyle.Normal;
            default:
                return null;
        }
    }

    public static Integer l0(String str) {
        return e.a(str);
    }

    public static String m0(String str, String str2) {
        if (!str.equals(SpeechConstant.ENGINE_TYPE_NONE) && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static SVG.o o0(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length value (empty string)");
        }
        int length = str.length();
        SVG.Unit unitValueOf = SVG.Unit.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            unitValueOf = SVG.Unit.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                unitValueOf = SVG.Unit.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new SVG.o(g0(str, 0, length), unitValueOf);
        } catch (NumberFormatException e2) {
            throw new SVGParseException("Invalid length value: " + str, e2);
        }
    }

    public static List<SVG.o> p0(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        g gVar = new g(str);
        gVar.A();
        while (!gVar.h()) {
            float fN = gVar.n();
            if (Float.isNaN(fN)) {
                throw new SVGParseException("Invalid length list value: " + gVar.b());
            }
            SVG.Unit unitV = gVar.v();
            if (unitV == null) {
                unitV = SVG.Unit.px;
            }
            arrayList.add(new SVG.o(fN, unitV));
            gVar.z();
        }
        return arrayList;
    }

    public static SVG.o q0(g gVar) {
        return gVar.g("auto") ? new SVG.o(0.0f) : gVar.p();
    }

    public static Float r0(String str) {
        try {
            float fF0 = f0(str);
            float f2 = 0.0f;
            if (fF0 < 0.0f) {
                fF0 = f2;
            } else {
                f2 = 1.0f;
                if (fF0 > 1.0f) {
                    fF0 = f2;
                }
            }
            return Float.valueOf(fF0);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static int s(float f2, float f3, float f4) {
        float f5 = 0.0f;
        float f6 = f2 % 360.0f;
        if (f2 < 0.0f) {
            f6 += 360.0f;
        }
        float f7 = f6 / 60.0f;
        float f8 = f3 / 100.0f;
        float f9 = f4 / 100.0f;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        } else if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        if (f9 >= 0.0f) {
            f5 = f9 > 1.0f ? 1.0f : f9;
        }
        float f10 = f5 <= 0.5f ? (f8 + 1.0f) * f5 : (f5 + f8) - (f8 * f5);
        float f11 = (f5 * 2.0f) - f10;
        return j(t(f11, f10, f7 - 2.0f) * 256.0f) | (j(t(f11, f10, f7 + 2.0f) * 256.0f) << 16) | (j(t(f11, f10, f7) * 256.0f) << 8);
    }

    public static Boolean s0(String str) {
        str.hashCode();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    public static float t(float f2, float f3, float f4) {
        float f5;
        if (f4 < 0.0f) {
            f4 += 6.0f;
        }
        if (f4 >= 6.0f) {
            f4 -= 6.0f;
        }
        if (f4 < 1.0f) {
            f5 = (f3 - f2) * f4;
        } else {
            if (f4 < 3.0f) {
                return f3;
            }
            if (f4 >= 4.0f) {
                return f2;
            }
            f5 = (f3 - f2) * (4.0f - f4);
        }
        return f5 + f2;
    }

    public static SVG.m0 t0(String str) {
        if (!str.startsWith("url(")) {
            return d0(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new SVG.t(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new SVG.t(strTrim, strTrim2.length() > 0 ? d0(strTrim2) : null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0282  */
    /* JADX WARN: Code duplicated, block: B:117:0x027b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x028a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x027c  */
    public static SVG.v u0(String str) {
        float fD;
        float fD2;
        float f2;
        float f3;
        g gVar = new g(str);
        SVG.v vVar = new SVG.v();
        if (gVar.h()) {
            return vVar;
        }
        int iIntValue = gVar.l().intValue();
        int i = 109;
        if (iIntValue != 77 && iIntValue != 109) {
            return vVar;
        }
        int iIntValue2 = iIntValue;
        float f4 = 0.0f;
        float fN = 0.0f;
        float f5 = 0.0f;
        float fD3 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (true) {
            gVar.A();
            switch (iIntValue2) {
                case 65:
                case 97:
                    float fN2 = gVar.n();
                    float fD4 = gVar.d(fN2);
                    float fD5 = gVar.d(fD4);
                    Boolean boolC = gVar.c(Float.valueOf(fD5));
                    Boolean boolC2 = gVar.c(boolC);
                    float fE = gVar.e(boolC2);
                    float fD6 = gVar.d(fE);
                    if (!Float.isNaN(fD6) && fN2 >= 0.0f && fD4 >= 0.0f) {
                        if (iIntValue2 == 97) {
                            fE += f4;
                            fD6 += f5;
                        }
                        vVar.b(fN2, fD4, fD5, boolC.booleanValue(), boolC2.booleanValue(), fE, fD6);
                        f4 = fE;
                        fN = f4;
                        f5 = fD6;
                        fD3 = f5;
                        gVar.z();
                        if (gVar.h()) {
                            if (gVar.i()) {
                                iIntValue2 = gVar.l().intValue();
                            }
                            i = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 67:
                case 99:
                    float fN3 = gVar.n();
                    float fD7 = gVar.d(fN3);
                    float fD8 = gVar.d(fD7);
                    float fD9 = gVar.d(fD8);
                    fD = gVar.d(fD9);
                    fD2 = gVar.d(fD);
                    if (!Float.isNaN(fD2)) {
                        if (iIntValue2 == 99) {
                            fD += f4;
                            fD2 += f5;
                            fN3 += f4;
                            fD7 += f5;
                            fD8 += f4;
                            fD9 += f5;
                        }
                        f2 = fD8;
                        f3 = fD9;
                        vVar.cubicTo(fN3, fD7, f2, f3, fD, fD2);
                        fN = f2;
                        f4 = fD;
                        fD3 = f3;
                        f5 = fD2;
                        gVar.z();
                        if (gVar.h()) {
                            if (gVar.i()) {
                                iIntValue2 = gVar.l().intValue();
                            }
                            i = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 72:
                case 104:
                    float fN4 = gVar.n();
                    if (!Float.isNaN(fN4)) {
                        if (iIntValue2 == 104) {
                            fN4 += f4;
                        }
                        f4 = fN4;
                        vVar.lineTo(f4, f5);
                        fN = f4;
                        gVar.z();
                        if (gVar.h()) {
                            if (gVar.i()) {
                                iIntValue2 = gVar.l().intValue();
                            }
                            i = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 76:
                case 108:
                    float fN5 = gVar.n();
                    float fD10 = gVar.d(fN5);
                    if (!Float.isNaN(fD10)) {
                        if (iIntValue2 == 108) {
                            fN5 += f4;
                            fD10 += f5;
                        }
                        f4 = fN5;
                        f5 = fD10;
                        vVar.lineTo(f4, f5);
                        fN = f4;
                        fD3 = f5;
                        gVar.z();
                        if (gVar.h()) {
                            if (gVar.i()) {
                                iIntValue2 = gVar.l().intValue();
                            }
                            i = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 77:
                case 109:
                    float fN6 = gVar.n();
                    float fD11 = gVar.d(fN6);
                    if (!Float.isNaN(fD11)) {
                        if (iIntValue2 == i && !vVar.f()) {
                            fN6 += f4;
                            fD11 += f5;
                        }
                        f4 = fN6;
                        f5 = fD11;
                        vVar.moveTo(f4, f5);
                        fN = f4;
                        f6 = fN;
                        fD3 = f5;
                        f7 = fD3;
                        iIntValue2 = iIntValue2 != i ? 76 : 108;
                        gVar.z();
                        if (gVar.h()) {
                            if (gVar.i()) {
                                iIntValue2 = gVar.l().intValue();
                            }
                            i = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 81:
                case 113:
                    fN = gVar.n();
                    fD3 = gVar.d(fN);
                    float fD12 = gVar.d(fD3);
                    float fD13 = gVar.d(fD12);
                    if (!Float.isNaN(fD13)) {
                        if (iIntValue2 == 113) {
                            fD12 += f4;
                            fD13 += f5;
                            fN += f4;
                            fD3 += f5;
                        }
                        f4 = fD12;
                        f5 = fD13;
                        vVar.a(fN, fD3, f4, f5);
                        gVar.z();
                        if (gVar.h()) {
                            if (gVar.i()) {
                                iIntValue2 = gVar.l().intValue();
                            }
                            i = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 83:
                case 115:
                    float f8 = (f4 * 2.0f) - fN;
                    float f9 = (2.0f * f5) - fD3;
                    float fN7 = gVar.n();
                    float fD14 = gVar.d(fN7);
                    fD = gVar.d(fD14);
                    fD2 = gVar.d(fD);
                    if (!Float.isNaN(fD2)) {
                        if (iIntValue2 == 115) {
                            fD += f4;
                            fD2 += f5;
                            fN7 += f4;
                            fD14 += f5;
                        }
                        f2 = fN7;
                        f3 = fD14;
                        vVar.cubicTo(f8, f9, f2, f3, fD, fD2);
                        fN = f2;
                        f4 = fD;
                        fD3 = f3;
                        f5 = fD2;
                        gVar.z();
                        if (gVar.h()) {
                            if (gVar.i()) {
                                iIntValue2 = gVar.l().intValue();
                            }
                            i = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 84:
                case 116:
                    fN = (f4 * 2.0f) - fN;
                    fD3 = (2.0f * f5) - fD3;
                    float fN8 = gVar.n();
                    float fD15 = gVar.d(fN8);
                    if (!Float.isNaN(fD15)) {
                        if (iIntValue2 == 116) {
                            fN8 += f4;
                            fD15 += f5;
                        }
                        f4 = fN8;
                        f5 = fD15;
                        vVar.a(fN, fD3, f4, f5);
                        gVar.z();
                        if (gVar.h()) {
                            if (gVar.i()) {
                                iIntValue2 = gVar.l().intValue();
                            }
                            i = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 86:
                case 118:
                    float fN9 = gVar.n();
                    if (!Float.isNaN(fN9)) {
                        if (iIntValue2 == 118) {
                            fN9 += f5;
                        }
                        f5 = fN9;
                        vVar.lineTo(f4, f5);
                        fD3 = f5;
                        gVar.z();
                        if (gVar.h()) {
                            if (gVar.i()) {
                                iIntValue2 = gVar.l().intValue();
                            }
                            i = 109;
                        }
                    } else {
                        Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                    }
                    break;
                case 90:
                case 122:
                    vVar.close();
                    f4 = f6;
                    fN = f4;
                    f5 = f7;
                    fD3 = f5;
                    gVar.z();
                    if (gVar.h()) {
                        if (gVar.i()) {
                            iIntValue2 = gVar.l().intValue();
                        }
                        i = 109;
                    }
                    break;
                default:
                    break;
            }
            return vVar;
        }
    }

    public static PreserveAspectRatio v0(String str) throws SVGParseException {
        PreserveAspectRatio.Scale scale;
        g gVar = new g(str);
        gVar.A();
        String strR = gVar.r();
        if ("defer".equals(strR)) {
            gVar.A();
            strR = gVar.r();
        }
        PreserveAspectRatio.Alignment alignmentA = b.a(strR);
        gVar.A();
        if (gVar.h()) {
            scale = null;
        } else {
            String strR2 = gVar.r();
            strR2.hashCode();
            if (strR2.equals("meet")) {
                scale = PreserveAspectRatio.Scale.meet;
            } else {
                if (!strR2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: " + str);
                }
                scale = PreserveAspectRatio.Scale.slice;
            }
        }
        return new PreserveAspectRatio(alignmentA, scale);
    }

    public static void w0(SVG.n0 n0Var, String str) throws SVGParseException {
        n0Var.o = v0(str);
    }

    public static SVG.Style.RenderQuality y0(String str) {
        str.hashCode();
        switch (str) {
            case "optimizeQuality":
                return SVG.Style.RenderQuality.optimizeQuality;
            case "auto":
                return SVG.Style.RenderQuality.auto;
            case "optimizeSpeed":
                return SVG.Style.RenderQuality.optimizeSpeed;
            default:
                return null;
        }
    }

    public static Set<String> z0(String str) {
        g gVar = new g(str);
        HashSet hashSet = new HashSet();
        while (!gVar.h()) {
            String strR = gVar.r();
            if (strR.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strR.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            gVar.A();
        }
        return hashSet;
    }

    public final void A(SVG.d dVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 12:
                    dVar.o = o0(strTrim);
                    break;
                case 13:
                    dVar.p = o0(strTrim);
                    break;
                case 14:
                    SVG.o oVarO0 = o0(strTrim);
                    dVar.q = oVarO0;
                    if (oVarO0.i()) {
                        throw new SVGParseException("Invalid <circle> element. r cannot be negative");
                    }
                    break;
                    break;
            }
        }
    }

    public final void B(SVG.e eVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(strTrim)) {
                    eVar.p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute clipPathUnits");
                    }
                    eVar.p = Boolean.TRUE;
                }
            }
        }
    }

    public final void C(SVG.e0 e0Var, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 21:
                    e0Var.g(z0(strTrim));
                    break;
                case 22:
                    e0Var.j(strTrim);
                    break;
                case 23:
                    e0Var.d(F0(strTrim));
                    break;
                case 24:
                    e0Var.i(A0(strTrim));
                    break;
                case 25:
                    List<String> listI0 = i0(strTrim);
                    e0Var.b(listI0 != null ? new HashSet(listI0) : new HashSet(0));
                    break;
            }
        }
    }

    public final void D(SVG.j0 j0Var, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                j0Var.f1465c = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    j0Var.d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(strTrim)) {
                        j0Var.d = Boolean.TRUE;
                        return;
                    }
                    throw new SVGParseException("Invalid value for \"xml:space\" attribute: " + strTrim);
                }
            }
        }
    }

    public final void E(SVG.i iVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 10:
                    SVG.o oVarO0 = o0(strTrim);
                    iVar.q = oVarO0;
                    if (oVarO0.i()) {
                        throw new SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                    break;
                case 11:
                    SVG.o oVarO1 = o0(strTrim);
                    iVar.r = oVarO1;
                    if (oVarO1.i()) {
                        throw new SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                    break;
                case 12:
                    iVar.o = o0(strTrim);
                    break;
                case 13:
                    iVar.p = o0(strTrim);
                    break;
            }
        }
    }

    public final void F(SVG.j jVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 != 6) {
                switch (i2) {
                    case 32:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new SVGParseException("Invalid value for attribute gradientUnits");
                            }
                            jVar.i = Boolean.TRUE;
                        } else {
                            jVar.i = Boolean.FALSE;
                        }
                        break;
                    case 33:
                        jVar.f1463j = J0(strTrim);
                        break;
                    case 34:
                        try {
                            jVar.k = SVG.GradientSpread.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new SVGParseException("Invalid spreadMethod attribute. \"" + strTrim + "\" is not a valid value.");
                        }
                        break;
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                jVar.f1464l = strTrim;
            }
        }
    }

    public final void G(SVG.n nVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                nVar.q = o0(strTrim);
            } else if (i2 == 2) {
                nVar.r = o0(strTrim);
            } else if (i2 == 3) {
                SVG.o oVarO0 = o0(strTrim);
                nVar.s = oVarO0;
                if (oVarO0.i()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                SVG.o oVarO1 = o0(strTrim);
                nVar.t = oVarO1;
                if (oVarO1.i()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i2 != 6) {
                if (i2 == 7) {
                    w0(nVar, strTrim);
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                nVar.p = strTrim;
            }
        }
    }

    public final void H(SVG.p pVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    pVar.o = o0(strTrim);
                    break;
                case 16:
                    pVar.p = o0(strTrim);
                    break;
                case 17:
                    pVar.q = o0(strTrim);
                    break;
                case 18:
                    pVar.r = o0(strTrim);
                    break;
            }
        }
    }

    public final void I(SVG.k0 k0Var, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    k0Var.m = o0(strTrim);
                    break;
                case 16:
                    k0Var.f1468n = o0(strTrim);
                    break;
                case 17:
                    k0Var.o = o0(strTrim);
                    break;
                case 18:
                    k0Var.p = o0(strTrim);
                    break;
            }
        }
    }

    public final void J(SVG.q qVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            switch (a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()]) {
                case 26:
                    qVar.r = o0(strTrim);
                    break;
                case 27:
                    qVar.s = o0(strTrim);
                    break;
                case 28:
                    SVG.o oVarO0 = o0(strTrim);
                    qVar.t = oVarO0;
                    if (oVarO0.i()) {
                        throw new SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                    break;
                case 29:
                    SVG.o oVarO1 = o0(strTrim);
                    qVar.u = oVarO1;
                    if (oVarO1.i()) {
                        throw new SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                    break;
                case 30:
                    if (!"strokeWidth".equals(strTrim)) {
                        if (!"userSpaceOnUse".equals(strTrim)) {
                            throw new SVGParseException("Invalid value for attribute markerUnits");
                        }
                        qVar.q = true;
                    } else {
                        qVar.q = false;
                    }
                    break;
                case 31:
                    if ("auto".equals(strTrim)) {
                        qVar.v = Float.valueOf(Float.NaN);
                    } else {
                        qVar.v = Float.valueOf(f0(strTrim));
                    }
                    break;
            }
        }
    }

    public final Matrix J0(String str) throws SVGParseException {
        Matrix matrix = new Matrix();
        g gVar = new g(str);
        gVar.A();
        while (!gVar.h()) {
            String strO = gVar.o();
            if (strO == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: " + str);
            }
            switch (strO) {
                case "matrix":
                    gVar.A();
                    float fN = gVar.n();
                    gVar.z();
                    float fN2 = gVar.n();
                    gVar.z();
                    float fN3 = gVar.n();
                    gVar.z();
                    float fN4 = gVar.n();
                    gVar.z();
                    float fN5 = gVar.n();
                    gVar.z();
                    float fN6 = gVar.n();
                    gVar.A();
                    if (Float.isNaN(fN6) || !gVar.f(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fN, fN3, fN5, fN2, fN4, fN6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    gVar.A();
                    float fN7 = gVar.n();
                    float fX = gVar.x();
                    float fX2 = gVar.x();
                    gVar.A();
                    if (Float.isNaN(fN7) || !gVar.f(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fX)) {
                        matrix.preRotate(fN7);
                    } else {
                        if (Float.isNaN(fX2)) {
                            throw new SVGParseException("Invalid transform list: " + str);
                        }
                        matrix.preRotate(fN7, fX, fX2);
                    }
                    break;
                    break;
                case "scale":
                    gVar.A();
                    float fN8 = gVar.n();
                    float fX3 = gVar.x();
                    gVar.A();
                    if (Float.isNaN(fN8) || !gVar.f(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX3)) {
                        matrix.preScale(fN8, fX3);
                    } else {
                        matrix.preScale(fN8, fN8);
                    }
                    break;
                    break;
                case "skewX":
                    gVar.A();
                    float fN9 = gVar.n();
                    gVar.A();
                    if (Float.isNaN(fN9) || !gVar.f(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fN9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    gVar.A();
                    float fN10 = gVar.n();
                    gVar.A();
                    if (Float.isNaN(fN10) || !gVar.f(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fN10)));
                    break;
                    break;
                case "translate":
                    gVar.A();
                    float fN11 = gVar.n();
                    float fX4 = gVar.x();
                    gVar.A();
                    if (Float.isNaN(fN11) || !gVar.f(')')) {
                        throw new SVGParseException("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX4)) {
                        matrix.preTranslate(fN11, fX4);
                    } else {
                        matrix.preTranslate(fN11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new SVGParseException("Invalid transform list fn: " + strO + ")");
            }
            if (gVar.h()) {
                return matrix;
            }
            gVar.z();
        }
        return matrix;
    }

    public final void K(SVG.r rVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                rVar.q = o0(strTrim);
            } else if (i2 == 2) {
                rVar.r = o0(strTrim);
            } else if (i2 == 3) {
                SVG.o oVarO0 = o0(strTrim);
                rVar.s = oVarO0;
                if (oVarO0.i()) {
                    throw new SVGParseException("Invalid <mask> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                SVG.o oVarO1 = o0(strTrim);
                rVar.t = oVarO1;
                if (oVarO1.i()) {
                    throw new SVGParseException("Invalid <mask> element. height cannot be negative");
                }
            } else if (i2 != 43) {
                if (i2 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(strTrim)) {
                    rVar.p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SVGParseException("Invalid value for attribute maskContentUnits");
                    }
                    rVar.p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                rVar.o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new SVGParseException("Invalid value for attribute maskUnits");
                }
                rVar.o = Boolean.TRUE;
            }
        }
    }

    public final void K0(InputStream inputStream) throws SVGParseException {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            f fVar = new f(this, null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e2) {
            throw new SVGParseException("Stream error", e2);
        } catch (ParserConfigurationException e3) {
            throw new SVGParseException("XML parser problem", e3);
        } catch (SAXException e4) {
            throw new SVGParseException("SVG parse error", e4);
        }
    }

    public final void L(SVG.u uVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 8) {
                uVar.o = u0(strTrim);
            } else if (i2 != 9) {
                continue;
            } else {
                Float fValueOf = Float.valueOf(f0(strTrim));
                uVar.p = fValueOf;
                if (fValueOf.floatValue() < 0.0f) {
                    throw new SVGParseException("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    public final void L0(InputStream inputStream, boolean z) throws SVGParseException {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                h hVar = new h(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        W0();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        g gVar = new g(xmlPullParserNewPullParser.getText());
                        r(gVar.r(), x0(gVar));
                    } else if (eventType == 10) {
                        if (z && this.a.p() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                K0(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        X0(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, hVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        p(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        e1(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        c1(xmlPullParserNewPullParser.getText());
                    }
                }
                o();
            } catch (IOException e2) {
                throw new SVGParseException("Stream error", e2);
            }
        } catch (XmlPullParserException e3) {
            throw new SVGParseException("XML parser problem", e3);
        }
    }

    public final void M(SVG.x xVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                xVar.t = o0(strTrim);
            } else if (i2 == 2) {
                xVar.u = o0(strTrim);
            } else if (i2 == 3) {
                SVG.o oVarO0 = o0(strTrim);
                xVar.v = oVarO0;
                if (oVarO0.i()) {
                    throw new SVGParseException("Invalid <pattern> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                SVG.o oVarO1 = o0(strTrim);
                xVar.w = oVarO1;
                if (oVarO1.i()) {
                    throw new SVGParseException("Invalid <pattern> element. height cannot be negative");
                }
            } else if (i2 != 6) {
                switch (i2) {
                    case 40:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new SVGParseException("Invalid value for attribute patternUnits");
                            }
                            xVar.q = Boolean.TRUE;
                        } else {
                            xVar.q = Boolean.FALSE;
                        }
                        break;
                    case 41:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new SVGParseException("Invalid value for attribute patternContentUnits");
                            }
                            xVar.r = Boolean.TRUE;
                        } else {
                            xVar.r = Boolean.FALSE;
                        }
                        break;
                    case 42:
                        xVar.s = J0(strTrim);
                        break;
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                xVar.x = strTrim;
            }
        }
    }

    public final void N(SVG.y yVar, Attributes attributes, String str) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.points) {
                g gVar = new g(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                gVar.A();
                while (!gVar.h()) {
                    float fN = gVar.n();
                    if (Float.isNaN(fN)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    gVar.z();
                    float fN2 = gVar.n();
                    if (Float.isNaN(fN2)) {
                        throw new SVGParseException("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    gVar.z();
                    arrayList.add(Float.valueOf(fN));
                    arrayList.add(Float.valueOf(fN2));
                }
                yVar.o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    yVar.o[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    public final void O(SVG.o0 o0Var, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 35) {
                o0Var.p = o0(strTrim);
            } else if (i2 != 36) {
                switch (i2) {
                    case 12:
                        o0Var.m = o0(strTrim);
                        break;
                    case 13:
                        o0Var.f1470n = o0(strTrim);
                        break;
                    case 14:
                        SVG.o oVarO0 = o0(strTrim);
                        o0Var.o = oVarO0;
                        if (oVarO0.i()) {
                            throw new SVGParseException("Invalid <radialGradient> element. r cannot be negative");
                        }
                        break;
                        break;
                }
            } else {
                o0Var.q = o0(strTrim);
            }
        }
    }

    public final void O0(Attributes attributes) throws SVGParseException {
        l("<path>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.u uVar = new SVG.u();
        uVar.a = this.a;
        uVar.b = this.b;
        D(uVar, attributes);
        S(uVar, attributes);
        W(uVar, attributes);
        C(uVar, attributes);
        L(uVar, attributes);
        this.b.h(uVar);
    }

    public final void P(SVG.a0 a0Var, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                a0Var.o = o0(strTrim);
            } else if (i2 == 2) {
                a0Var.p = o0(strTrim);
            } else if (i2 == 3) {
                SVG.o oVarO0 = o0(strTrim);
                a0Var.q = oVarO0;
                if (oVarO0.i()) {
                    throw new SVGParseException("Invalid <rect> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                SVG.o oVarO1 = o0(strTrim);
                a0Var.r = oVarO1;
                if (oVarO1.i()) {
                    throw new SVGParseException("Invalid <rect> element. height cannot be negative");
                }
            } else if (i2 == 10) {
                SVG.o oVarO2 = o0(strTrim);
                a0Var.s = oVarO2;
                if (oVarO2.i()) {
                    throw new SVGParseException("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i2 != 11) {
                continue;
            } else {
                SVG.o oVarO3 = o0(strTrim);
                a0Var.t = oVarO3;
                if (oVarO3.i()) {
                    throw new SVGParseException("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    public final void P0(Attributes attributes) throws SVGParseException {
        l("<pattern>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.x xVar = new SVG.x();
        xVar.a = this.a;
        xVar.b = this.b;
        D(xVar, attributes);
        S(xVar, attributes);
        C(xVar, attributes);
        Y(xVar, attributes);
        M(xVar, attributes);
        this.b.h(xVar);
        this.b = xVar;
    }

    public final void Q(SVG.d0 d0Var, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                d0Var.q = o0(strTrim);
            } else if (i2 == 2) {
                d0Var.r = o0(strTrim);
            } else if (i2 == 3) {
                SVG.o oVarO0 = o0(strTrim);
                d0Var.s = oVarO0;
                if (oVarO0.i()) {
                    throw new SVGParseException("Invalid <svg> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                SVG.o oVarO1 = o0(strTrim);
                d0Var.t = oVarO1;
                if (oVarO1.i()) {
                    throw new SVGParseException("Invalid <svg> element. height cannot be negative");
                }
            } else if (i2 == 5) {
                d0Var.u = strTrim;
            }
        }
    }

    public final void Q0(Attributes attributes) throws SVGParseException {
        l("<polygon>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.y zVar = new SVG.z();
        zVar.a = this.a;
        zVar.b = this.b;
        D(zVar, attributes);
        S(zVar, attributes);
        W(zVar, attributes);
        C(zVar, attributes);
        N(zVar, attributes, "polygon");
        this.b.h(zVar);
    }

    public final void R(SVG.c0 c0Var, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 37) {
                c0Var.h = n0(strTrim);
            }
        }
    }

    public final void R0(Attributes attributes) throws SVGParseException {
        l("<polyline>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.y yVar = new SVG.y();
        yVar.a = this.a;
        yVar.b = this.b;
        D(yVar, attributes);
        S(yVar, attributes);
        W(yVar, attributes);
        C(yVar, attributes);
        N(yVar, attributes, "polyline");
        this.b.h(yVar);
    }

    public final void S(SVG.j0 j0Var, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
                if (i2 == 45) {
                    E0(j0Var, strTrim);
                } else if (i2 != 46) {
                    if (j0Var.f1466e == null) {
                        j0Var.f1466e = new SVG.Style();
                    }
                    S0(j0Var.f1466e, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    j0Var.g = CSSParser.f(strTrim);
                }
            }
        }
    }

    public final void T(SVG.s0 s0Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()] == 6 && ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i)))) {
                s0Var.o = strTrim;
            }
        }
    }

    public final void T0(Attributes attributes) throws SVGParseException {
        l("<radialGradient>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.o0 o0Var = new SVG.o0();
        o0Var.a = this.a;
        o0Var.b = this.b;
        D(o0Var, attributes);
        S(o0Var, attributes);
        F(o0Var, attributes);
        O(o0Var, attributes);
        this.b.h(o0Var);
        this.b = o0Var;
    }

    public final void U(SVG.x0 x0Var, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 != 6) {
                if (i2 == 39) {
                    x0Var.p = o0(strTrim);
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                x0Var.o = strTrim;
            }
        }
    }

    public final void U0(Attributes attributes) throws SVGParseException {
        l("<rect>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.a0 a0Var = new SVG.a0();
        a0Var.a = this.a;
        a0Var.b = this.b;
        D(a0Var, attributes);
        S(a0Var, attributes);
        W(a0Var, attributes);
        C(a0Var, attributes);
        P(a0Var, attributes);
        this.b.h(a0Var);
    }

    public final void V(SVG.y0 y0Var, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                y0Var.o = p0(strTrim);
            } else if (i2 == 2) {
                y0Var.p = p0(strTrim);
            } else if (i2 == 19) {
                y0Var.q = p0(strTrim);
            } else if (i2 == 20) {
                y0Var.r = p0(strTrim);
            }
        }
    }

    public final void V0(Attributes attributes) throws SVGParseException {
        l("<solidColor>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.b0 b0Var = new SVG.b0();
        b0Var.a = this.a;
        b0Var.b = this.b;
        D(b0Var, attributes);
        S(b0Var, attributes);
        this.b.h(b0Var);
        this.b = b0Var;
    }

    public final void W(SVG.m mVar, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.transform) {
                mVar.k(J0(attributes.getValue(i)));
            }
        }
    }

    public final void W0() {
        this.a = new SVG();
    }

    public final void X(SVG.b1 b1Var, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                b1Var.q = o0(strTrim);
            } else if (i2 == 2) {
                b1Var.r = o0(strTrim);
            } else if (i2 == 3) {
                SVG.o oVarO0 = o0(strTrim);
                b1Var.s = oVarO0;
                if (oVarO0.i()) {
                    throw new SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                SVG.o oVarO1 = o0(strTrim);
                b1Var.t = oVarO1;
                if (oVarO1.i()) {
                    throw new SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i2 == 6 && ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i)))) {
                b1Var.p = strTrim;
            }
        }
    }

    public final void X0(String str, String str2, String str3, Attributes attributes) throws SVGParseException {
        if (this.f1475c) {
            this.d++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            SVGElem sVGElemFromString = SVGElem.fromString(str2);
            switch (a.a[sVGElemFromString.ordinal()]) {
                case 1:
                    a1(attributes);
                    break;
                case 2:
                case 3:
                    q(attributes);
                    break;
                case 4:
                    m(attributes);
                    break;
                case 5:
                    i1(attributes);
                    break;
                case 6:
                    O0(attributes);
                    break;
                case 7:
                    U0(attributes);
                    break;
                case 8:
                    i(attributes);
                    break;
                case 9:
                    n(attributes);
                    break;
                case 10:
                    v(attributes);
                    break;
                case 11:
                    R0(attributes);
                    break;
                case 12:
                    Q0(attributes);
                    break;
                case 13:
                    d1(attributes);
                    break;
                case 14:
                    h1(attributes);
                    break;
                case 15:
                    g1(attributes);
                    break;
                case 16:
                    k1(attributes);
                    break;
                case 17:
                    b1(attributes);
                    break;
                case 18:
                    x(attributes);
                    break;
                case 19:
                    w(attributes);
                    break;
                case 20:
                    T0(attributes);
                    break;
                case 21:
                    Y0(attributes);
                    break;
                case 22:
                case 23:
                    this.f1476e = true;
                    this.f = sVGElemFromString;
                    break;
                case 24:
                    k(attributes);
                    break;
                case 25:
                    f1(attributes);
                    break;
                case 26:
                    P0(attributes);
                    break;
                case 27:
                    u(attributes);
                    break;
                case 28:
                    j1(attributes);
                    break;
                case 29:
                    y(attributes);
                    break;
                case 30:
                    Z0(attributes);
                    break;
                case 31:
                    V0(attributes);
                    break;
                default:
                    this.f1475c = true;
                    this.d = 1;
                    break;
            }
        }
    }

    public final void Y(SVG.p0 p0Var, Attributes attributes) throws SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 7) {
                w0(p0Var, strTrim);
            } else if (i2 == 87) {
                p0Var.p = N0(strTrim);
            }
        }
    }

    public final void Y0(Attributes attributes) throws SVGParseException {
        l("<stop>", new Object[0]);
        SVG.h0 h0Var = this.b;
        if (h0Var == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(h0Var instanceof SVG.j)) {
            throw new SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        SVG.c0 c0Var = new SVG.c0();
        c0Var.a = this.a;
        c0Var.b = this.b;
        D(c0Var, attributes);
        S(c0Var, attributes);
        R(c0Var, attributes);
        this.b.h(c0Var);
        this.b = c0Var;
    }

    public final void Z(String str) {
        this.a.a(new CSSParser(CSSParser.MediaType.screen, CSSParser.Source.Document).d(str));
    }

    public final void Z0(Attributes attributes) throws SVGParseException {
        l("<style>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int i2 = a.b[SVGAttr.fromString(attributes.getLocalName(i)).ordinal()];
            if (i2 == 88) {
                zEquals = strTrim.equals("text/css");
            } else if (i2 == 89) {
                str = strTrim;
            }
        }
        if (zEquals && CSSParser.b(str, CSSParser.MediaType.screen)) {
            this.h = true;
        } else {
            this.f1475c = true;
            this.d = 1;
        }
    }

    public final void a1(Attributes attributes) throws SVGParseException {
        l("<svg>", new Object[0]);
        SVG.d0 d0Var = new SVG.d0();
        d0Var.a = this.a;
        d0Var.b = this.b;
        D(d0Var, attributes);
        S(d0Var, attributes);
        C(d0Var, attributes);
        Y(d0Var, attributes);
        Q(d0Var, attributes);
        SVG.h0 h0Var = this.b;
        if (h0Var == null) {
            this.a.z(d0Var);
        } else {
            h0Var.h(d0Var);
        }
        this.b = d0Var;
    }

    public final void b1(Attributes attributes) throws SVGParseException {
        l("<symbol>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.p0 r0Var = new SVG.r0();
        r0Var.a = this.a;
        r0Var.b = this.b;
        D(r0Var, attributes);
        S(r0Var, attributes);
        C(r0Var, attributes);
        Y(r0Var, attributes);
        this.b.h(r0Var);
        this.b = r0Var;
    }

    public final void c1(String str) throws SVGParseException {
        if (this.f1475c) {
            return;
        }
        if (this.f1476e) {
            if (this.g == null) {
                this.g = new StringBuilder(str.length());
            }
            this.g.append(str);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(str.length());
            }
            this.i.append(str);
        } else if (this.b instanceof SVG.w0) {
            h(str);
        }
    }

    public final void d1(Attributes attributes) throws SVGParseException {
        l("<text>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.u0 u0Var = new SVG.u0();
        u0Var.a = this.a;
        u0Var.b = this.b;
        D(u0Var, attributes);
        S(u0Var, attributes);
        W(u0Var, attributes);
        C(u0Var, attributes);
        V(u0Var, attributes);
        this.b.h(u0Var);
        this.b = u0Var;
    }

    public final void e1(char[] cArr, int i, int i2) throws SVGParseException {
        if (this.f1475c) {
            return;
        }
        if (this.f1476e) {
            if (this.g == null) {
                this.g = new StringBuilder(i2);
            }
            this.g.append(cArr, i, i2);
        } else if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
        } else if (this.b instanceof SVG.w0) {
            h(new String(cArr, i, i2));
        }
    }

    public final void f1(Attributes attributes) throws SVGParseException {
        l("<textPath>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.x0 x0Var = new SVG.x0();
        x0Var.a = this.a;
        x0Var.b = this.b;
        D(x0Var, attributes);
        S(x0Var, attributes);
        C(x0Var, attributes);
        U(x0Var, attributes);
        this.b.h(x0Var);
        this.b = x0Var;
        SVG.h0 h0Var = x0Var.b;
        if (h0Var instanceof SVG.z0) {
            x0Var.n((SVG.z0) h0Var);
        } else {
            x0Var.n(((SVG.v0) h0Var).c());
        }
    }

    public final void g1(Attributes attributes) throws SVGParseException {
        l("<tref>", new Object[0]);
        SVG.h0 h0Var = this.b;
        if (h0Var == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(h0Var instanceof SVG.w0)) {
            throw new SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        SVG.s0 s0Var = new SVG.s0();
        s0Var.a = this.a;
        s0Var.b = this.b;
        D(s0Var, attributes);
        S(s0Var, attributes);
        C(s0Var, attributes);
        T(s0Var, attributes);
        this.b.h(s0Var);
        SVG.h0 h0Var2 = s0Var.b;
        if (h0Var2 instanceof SVG.z0) {
            s0Var.n((SVG.z0) h0Var2);
        } else {
            s0Var.n(((SVG.v0) h0Var2).c());
        }
    }

    public final void h(String str) throws SVGParseException {
        SVG.f0 f0Var = (SVG.f0) this.b;
        int size = f0Var.i.size();
        SVG.l0 l0Var = size == 0 ? null : f0Var.i.get(size - 1);
        if (!(l0Var instanceof SVG.a1)) {
            this.b.h(new SVG.a1(str));
            return;
        }
        StringBuilder sb = new StringBuilder();
        SVG.a1 a1Var = (SVG.a1) l0Var;
        sb.append(a1Var.f1454c);
        sb.append(str);
        a1Var.f1454c = sb.toString();
    }

    public final void h1(Attributes attributes) throws SVGParseException {
        l("<tspan>", new Object[0]);
        SVG.h0 h0Var = this.b;
        if (h0Var == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(h0Var instanceof SVG.w0)) {
            throw new SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        SVG.t0 t0Var = new SVG.t0();
        t0Var.a = this.a;
        t0Var.b = this.b;
        D(t0Var, attributes);
        S(t0Var, attributes);
        C(t0Var, attributes);
        V(t0Var, attributes);
        this.b.h(t0Var);
        this.b = t0Var;
        SVG.h0 h0Var2 = t0Var.b;
        if (h0Var2 instanceof SVG.z0) {
            t0Var.n((SVG.z0) h0Var2);
        } else {
            t0Var.n(((SVG.v0) h0Var2).c());
        }
    }

    public final void i(Attributes attributes) throws SVGParseException {
        l("<circle>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.d dVar = new SVG.d();
        dVar.a = this.a;
        dVar.b = this.b;
        D(dVar, attributes);
        S(dVar, attributes);
        W(dVar, attributes);
        C(dVar, attributes);
        A(dVar, attributes);
        this.b.h(dVar);
    }

    public final void i1(Attributes attributes) throws SVGParseException {
        l("<use>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.b1 b1Var = new SVG.b1();
        b1Var.a = this.a;
        b1Var.b = this.b;
        D(b1Var, attributes);
        S(b1Var, attributes);
        W(b1Var, attributes);
        C(b1Var, attributes);
        X(b1Var, attributes);
        this.b.h(b1Var);
        this.b = b1Var;
    }

    public final void j1(Attributes attributes) throws SVGParseException {
        l("<view>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.p0 c1Var = new SVG.c1();
        c1Var.a = this.a;
        c1Var.b = this.b;
        D(c1Var, attributes);
        C(c1Var, attributes);
        Y(c1Var, attributes);
        this.b.h(c1Var);
        this.b = c1Var;
    }

    public final void k(Attributes attributes) throws SVGParseException {
        l("<clipPath>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.e eVar = new SVG.e();
        eVar.a = this.a;
        eVar.b = this.b;
        D(eVar, attributes);
        S(eVar, attributes);
        W(eVar, attributes);
        C(eVar, attributes);
        B(eVar, attributes);
        this.b.h(eVar);
        this.b = eVar;
    }

    public final void k1(Attributes attributes) throws SVGParseException {
        l("<switch>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.q0 q0Var = new SVG.q0();
        q0Var.a = this.a;
        q0Var.b = this.b;
        D(q0Var, attributes);
        S(q0Var, attributes);
        W(q0Var, attributes);
        C(q0Var, attributes);
        this.b.h(q0Var);
        this.b = q0Var;
    }

    public final void l(String str, Object... objArr) {
    }

    public final void m(Attributes attributes) throws SVGParseException {
        l("<defs>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.h hVar = new SVG.h();
        hVar.a = this.a;
        hVar.b = this.b;
        D(hVar, attributes);
        S(hVar, attributes);
        W(hVar, attributes);
        this.b.h(hVar);
        this.b = hVar;
    }

    public final void n(Attributes attributes) throws SVGParseException {
        l("<ellipse>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.i iVar = new SVG.i();
        iVar.a = this.a;
        iVar.b = this.b;
        D(iVar, attributes);
        S(iVar, attributes);
        W(iVar, attributes);
        C(iVar, attributes);
        E(iVar, attributes);
        this.b.h(iVar);
    }

    public final Float n0(String str) throws SVGParseException {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z = false;
        }
        try {
            float fG0 = g0(str, 0, length);
            float f2 = 100.0f;
            if (z) {
                fG0 /= 100.0f;
            }
            if (fG0 < 0.0f) {
                f2 = 0.0f;
            } else if (fG0 <= 100.0f) {
                f2 = fG0;
            }
            return Float.valueOf(f2);
        } catch (NumberFormatException e2) {
            throw new SVGParseException("Invalid offset value in <stop>: " + str, e2);
        }
    }

    public final void o() {
    }

    public final void p(String str, String str2, String str3) throws SVGParseException {
        if (this.f1475c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.f1475c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i2 = a.a[SVGElem.fromString(str2).ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 4 && i2 != 5 && i2 != 13 && i2 != 14) {
                switch (i2) {
                    case 22:
                    case 23:
                        this.f1476e = false;
                        StringBuilder sb = this.g;
                        if (sb != null) {
                            SVGElem sVGElem = this.f;
                            if (sVGElem == SVGElem.title) {
                                this.a.A(sb.toString());
                            } else if (sVGElem == SVGElem.desc) {
                                this.a.v(sb.toString());
                            }
                            this.g.setLength(0);
                        }
                        break;
                    case 30:
                        StringBuilder sb2 = this.i;
                        if (sb2 != null) {
                            this.h = false;
                            Z(sb2.toString());
                            this.i.setLength(0);
                        }
                        break;
                }
                return;
            }
            this.b = ((SVG.l0) this.b).b;
        }
    }

    public final void q(Attributes attributes) throws SVGParseException {
        l("<g>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.l lVar = new SVG.l();
        lVar.a = this.a;
        lVar.b = this.b;
        D(lVar, attributes);
        S(lVar, attributes);
        W(lVar, attributes);
        C(lVar, attributes);
        this.b.h(lVar);
        this.b = lVar;
    }

    public final void r(String str, Map<String, String> map) {
        if (str.equals("xml-stylesheet")) {
            SVG.k();
        }
    }

    public final void u(Attributes attributes) throws SVGParseException {
        l("<image>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.n nVar = new SVG.n();
        nVar.a = this.a;
        nVar.b = this.b;
        D(nVar, attributes);
        S(nVar, attributes);
        W(nVar, attributes);
        C(nVar, attributes);
        G(nVar, attributes);
        this.b.h(nVar);
        this.b = nVar;
    }

    public final void v(Attributes attributes) throws SVGParseException {
        l("<line>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.p pVar = new SVG.p();
        pVar.a = this.a;
        pVar.b = this.b;
        D(pVar, attributes);
        S(pVar, attributes);
        W(pVar, attributes);
        C(pVar, attributes);
        H(pVar, attributes);
        this.b.h(pVar);
    }

    public final void w(Attributes attributes) throws SVGParseException {
        l("<linearGradient>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.k0 k0Var = new SVG.k0();
        k0Var.a = this.a;
        k0Var.b = this.b;
        D(k0Var, attributes);
        S(k0Var, attributes);
        F(k0Var, attributes);
        I(k0Var, attributes);
        this.b.h(k0Var);
        this.b = k0Var;
    }

    public final void x(Attributes attributes) throws SVGParseException {
        l("<marker>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.q qVar = new SVG.q();
        qVar.a = this.a;
        qVar.b = this.b;
        D(qVar, attributes);
        S(qVar, attributes);
        C(qVar, attributes);
        Y(qVar, attributes);
        J(qVar, attributes);
        this.b.h(qVar);
        this.b = qVar;
    }

    public final Map<String, String> x0(g gVar) {
        HashMap map = new HashMap();
        gVar.A();
        String strS = gVar.s(kam.h);
        while (strS != null) {
            gVar.f(kam.h);
            map.put(strS, gVar.q());
            gVar.A();
            strS = gVar.s(kam.h);
        }
        return map;
    }

    public final void y(Attributes attributes) throws SVGParseException {
        l("<mask>", new Object[0]);
        if (this.b == null) {
            throw new SVGParseException("Invalid document. Root element must be <svg>");
        }
        SVG.r rVar = new SVG.r();
        rVar.a = this.a;
        rVar.b = this.b;
        D(rVar, attributes);
        S(rVar, attributes);
        C(rVar, attributes);
        K(rVar, attributes);
        this.b.h(rVar);
        this.b = rVar;
    }

    public SVG z(InputStream inputStream, boolean z) throws SVGParseException {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            L0(inputStream, z);
            return this.a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }
}

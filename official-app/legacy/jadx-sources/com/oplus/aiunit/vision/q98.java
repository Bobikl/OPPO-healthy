package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Environment;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.map.model.TrackPoint;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/q98;", "", "Landroid/content/Context;", "context", "", "Lcom/heytap/sports/map/model/TrackPoint;", "points", "", "a", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGps2Gpx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Gps2Gpx.kt\ncom/heytap/sports/record/util/Gps2Gpx\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n1855#2,2:98\n*S KotlinDebug\n*F\n+ 1 Gps2Gpx.kt\ncom/heytap/sports/record/util/Gps2Gpx\n*L\n74#1:98,2\n*E\n"})
public final class q98 {
    public static final int $stable = 0;

    @NotNull
    public final String a(@NotNull Context context, @NotNull List<TrackPoint> points) throws TransformerException, IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(points, "points");
        if (points.isEmpty()) {
            return "";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        File file = new File(context.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS), points.get(0).getTimeStamp() + "track.gpx");
        Document documentNewDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element elementCreateElement = documentNewDocument.createElement("gpx");
        elementCreateElement.setAttribute("creator", "Heytap Health");
        elementCreateElement.setAttribute("version", "1.1");
        documentNewDocument.appendChild(elementCreateElement);
        Element elementCreateElement2 = documentNewDocument.createElement("metadata");
        elementCreateElement.appendChild(elementCreateElement2);
        Element elementCreateElement3 = documentNewDocument.createElement("name");
        elementCreateElement3.setTextContent("Track");
        elementCreateElement2.appendChild(elementCreateElement3);
        Element elementCreateElement4 = documentNewDocument.createElement("extensions");
        elementCreateElement.appendChild(elementCreateElement4);
        Element elementCreateElement5 = documentNewDocument.createElement(ClickApiEntity.TIME);
        elementCreateElement5.setTextContent(simpleDateFormat.format(new Date(points.get(0).getTimeStamp())));
        elementCreateElement4.appendChild(elementCreateElement5);
        Node nodeCreateElement = documentNewDocument.createElement("trk");
        elementCreateElement.appendChild(nodeCreateElement);
        Node nodeCreateElement2 = documentNewDocument.createElement("trkseg");
        nodeCreateElement.appendChild(nodeCreateElement2);
        for (TrackPoint trackPoint : points) {
            Element elementCreateElement6 = documentNewDocument.createElement("trkpt");
            elementCreateElement6.setAttribute("lat", String.valueOf(trackPoint.getLatitude()));
            elementCreateElement6.setAttribute("lon", String.valueOf(trackPoint.getLongitude()));
            nodeCreateElement2.appendChild(elementCreateElement6);
            Element elementCreateElement7 = documentNewDocument.createElement(ClickApiEntity.TIME);
            elementCreateElement7.setTextContent(simpleDateFormat.format(new Date(trackPoint.getTimeStamp())));
            elementCreateElement6.appendChild(elementCreateElement7);
        }
        Transformer transformerNewTransformer = TransformerFactory.newInstance().newTransformer();
        transformerNewTransformer.setOutputProperty("indent", "yes");
        transformerNewTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
        transformerNewTransformer.transform(new DOMSource(documentNewDocument), new StreamResult(file));
        String canonicalPath = file.getCanonicalPath();
        Intrinsics.checkNotNullExpressionValue(canonicalPath, "gpxFile.canonicalPath");
        return canonicalPath;
    }
}

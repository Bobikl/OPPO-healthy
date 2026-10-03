package com.oplus.aiunit.vision;

import com.adobe.xmp.XMPException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: classes12.dex */
public class y5m {
    public static final Object a = new Object();
    public static DocumentBuilderFactory b = a();

    public static DocumentBuilderFactory a() {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
        documentBuilderFactoryNewInstance.setIgnoringComments(true);
        try {
            documentBuilderFactoryNewInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            documentBuilderFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            documentBuilderFactoryNewInstance.setFeature("http://xerces.apache.org/xerces2-j/features.html#disallow-doctype-decl", false);
            documentBuilderFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            documentBuilderFactoryNewInstance.setFeature("http://xerces.apache.org/xerces2-j/features.html#external-parameter-entities", false);
            documentBuilderFactoryNewInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            documentBuilderFactoryNewInstance.setXIncludeAware(false);
            documentBuilderFactoryNewInstance.setExpandEntityReferences(false);
        } catch (Exception unused) {
        }
        return documentBuilderFactoryNewInstance;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    public static Object[] b(Node node, boolean z, Object[] objArr) {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if (7 == nodeItem.getNodeType()) {
                ProcessingInstruction processingInstruction = (ProcessingInstruction) nodeItem;
                if ("xpacket".equals(processingInstruction.getTarget())) {
                    if (objArr != null) {
                        objArr[2] = processingInstruction.getData();
                    }
                } else if (3 != nodeItem.getNodeType() && 7 != nodeItem.getNodeType()) {
                    String namespaceURI = nodeItem.getNamespaceURI();
                    String localName = nodeItem.getLocalName();
                    if (("xmpmeta".equals(localName) || "xapmeta".equals(localName)) && "adobe:ns:meta/".equals(namespaceURI)) {
                        return b(nodeItem, false, objArr);
                    }
                    if (!z && "RDF".equals(localName) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                        if (objArr != null) {
                            objArr[0] = nodeItem;
                            objArr[1] = a;
                        }
                        return objArr;
                    }
                    Object[] objArrB = b(nodeItem, z, objArr);
                    if (objArrB != null) {
                        return objArrB;
                    }
                }
            } else if (3 != nodeItem.getNodeType()) {
                continue;
            }
        }
        return null;
    }

    public static v5m c(Object obj, z7e z7eVar) throws XMPException {
        k7e.b(obj);
        if (z7eVar == null) {
            z7eVar = new z7e();
        }
        Object[] objArrB = b(e(obj, z7eVar), z7eVar.l(), new Object[3]);
        if (objArrB == null || objArrB[1] != a) {
            return new x5m();
        }
        x5m x5mVarI = a8e.i((Node) objArrB[0]);
        x5mVarI.d((String) objArrB[2]);
        return !z7eVar.k() ? b6m.h(x5mVarI, z7eVar) : x5mVarI;
    }

    public static Document d(InputSource inputSource) throws XMPException {
        try {
            DocumentBuilder documentBuilderNewDocumentBuilder = b.newDocumentBuilder();
            documentBuilderNewDocumentBuilder.setErrorHandler(null);
            return documentBuilderNewDocumentBuilder.parse(inputSource);
        } catch (IOException e2) {
            throw new XMPException("Error reading the XML-file", 204, e2);
        } catch (ParserConfigurationException e3) {
            throw new XMPException("XML Parser not correctly configured", 0, e3);
        } catch (SAXException e4) {
            throw new XMPException("XML parsing failure", 201, e4);
        }
    }

    public static Document e(Object obj, z7e z7eVar) throws XMPException {
        if (obj instanceof InputStream) {
            return g((InputStream) obj, z7eVar);
        }
        return obj instanceof byte[] ? f(new bd2((byte[]) obj), z7eVar) : h((String) obj, z7eVar);
    }

    public static Document f(bd2 bd2Var, z7e z7eVar) throws XMPException {
        InputSource inputSource = new InputSource(bd2Var.f());
        try {
            if (z7eVar.i()) {
                try {
                    b.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
                } catch (Throwable unused) {
                }
            }
            return d(inputSource);
        } catch (XMPException e2) {
            if (e2.getErrorCode() != 201 && e2.getErrorCode() != 204) {
                throw e2;
            }
            if (z7eVar.h()) {
                bd2Var = yta.a(bd2Var);
            }
            if (!z7eVar.j()) {
                return d(new InputSource(bd2Var.f()));
            }
            try {
                return d(new InputSource(new rq7(new InputStreamReader(bd2Var.f(), bd2Var.g()))));
            } catch (UnsupportedEncodingException unused2) {
                throw new XMPException("Unsupported Encoding", 9, e2);
            }
        }
    }

    public static Document g(InputStream inputStream, z7e z7eVar) throws XMPException {
        if (!z7eVar.h() && !z7eVar.j()) {
            return d(new InputSource(inputStream));
        }
        try {
            return f(new bd2(inputStream), z7eVar);
        } catch (IOException e2) {
            throw new XMPException("Error reading the XML-file", 204, e2);
        }
    }

    public static Document h(String str, z7e z7eVar) throws XMPException {
        new InputSource(new StringReader(str));
        try {
            if (z7eVar.i()) {
                try {
                    b.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
                } catch (Throwable unused) {
                }
            }
            return d(new InputSource(new StringReader(str)));
        } catch (XMPException e2) {
            if (e2.getErrorCode() == 201 && z7eVar.j()) {
                return d(new InputSource(new rq7(new StringReader(str))));
            }
            throw e2;
        }
    }
}

package com.oplus.aiunit.vision;

import com.adobe.xmp.XMPException;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes12.dex */
public class a8e {
    public static final String DEFAULT_PREFIX = "_dflt";
    public static final int RDFTERM_ABOUT = 3;
    public static final int RDFTERM_ABOUT_EACH = 10;
    public static final int RDFTERM_ABOUT_EACH_PREFIX = 11;
    public static final int RDFTERM_BAG_ID = 12;
    public static final int RDFTERM_DATATYPE = 7;
    public static final int RDFTERM_DESCRIPTION = 8;
    public static final int RDFTERM_FIRST_CORE = 1;
    public static final int RDFTERM_FIRST_OLD = 10;
    public static final int RDFTERM_FIRST_SYNTAX = 1;
    public static final int RDFTERM_ID = 2;
    public static final int RDFTERM_LAST_CORE = 7;
    public static final int RDFTERM_LAST_OLD = 12;
    public static final int RDFTERM_LAST_SYNTAX = 9;
    public static final int RDFTERM_LI = 9;
    public static final int RDFTERM_NODE_ID = 6;
    public static final int RDFTERM_OTHER = 0;
    public static final int RDFTERM_PARSE_TYPE = 4;
    public static final int RDFTERM_RDF = 1;
    public static final int RDFTERM_RESOURCE = 5;

    public static z5m a(x5m x5mVar, z5m z5mVar, Node node, String str, boolean z) throws XMPException {
        h6m h6mVarA = w5m.a();
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI == null) {
            throw new XMPException("XML namespace required for all elements and attributes", 202);
        }
        if ("http://purl.org/dc/1.1/".equals(namespaceURI)) {
            namespaceURI = "http://purl.org/dc/elements/1.1/";
        }
        String strA = h6mVarA.a(namespaceURI);
        if (strA == null) {
            strA = h6mVarA.b(namespaceURI, node.getPrefix() != null ? node.getPrefix() : DEFAULT_PREFIX);
        }
        String str2 = strA + node.getLocalName();
        bze bzeVar = new bze();
        boolean z2 = false;
        if (z) {
            z5mVar = a6m.i(x5mVar.c(), namespaceURI, DEFAULT_PREFIX, true);
            z5mVar.g0(false);
            if (h6mVarA.d(str2) != null) {
                x5mVar.c().e0(true);
                z5mVar.e0(true);
                z2 = true;
            }
        }
        boolean zEquals = "rdf:li".equals(str2);
        boolean zEquals2 = "rdf:value".equals(str2);
        z5m z5mVar2 = new z5m(str2, str, bzeVar);
        z5mVar2.d0(z2);
        if (zEquals2) {
            z5mVar.b(1, z5mVar2);
        } else {
            z5mVar.d(z5mVar2);
        }
        if (zEquals2) {
            if (z || !z5mVar.I().q()) {
                throw new XMPException("Misplaced rdf:value element", 202);
            }
            z5mVar.f0(true);
        }
        if (zEquals) {
            if (!z5mVar.I().i()) {
                throw new XMPException("Misplaced rdf:li element", 202);
            }
            z5mVar2.h0("[]");
        }
        return z5mVar2;
    }

    public static z5m b(z5m z5mVar, String str, String str2) throws XMPException {
        if ("xml:lang".equals(str)) {
            str2 = srk.h(str2);
        }
        z5m z5mVar2 = new z5m(str, str2, null);
        z5mVar.e(z5mVar2);
        return z5mVar2;
    }

    public static void c(z5m z5mVar) throws XMPException {
        z5m z5mVarP = z5mVar.p(1);
        if (z5mVarP.I().h()) {
            if (z5mVar.I().h()) {
                throw new XMPException("Redundant xml:lang for rdf:value element", 203);
            }
            z5m z5mVarK = z5mVarP.K(1);
            z5mVarP.a0(z5mVarK);
            z5mVar.e(z5mVarK);
        }
        for (int i = 1; i <= z5mVarP.M(); i++) {
            z5mVar.e(z5mVarP.K(i));
        }
        for (int i2 = 2; i2 <= z5mVar.E(); i2++) {
            z5mVar.e(z5mVar.p(i2));
        }
        z5mVar.f0(false);
        z5mVar.I().B(false);
        z5mVar.I().r(z5mVarP.I());
        z5mVar.k0(z5mVarP.O());
        z5mVar.Z();
        Iterator itV = z5mVarP.V();
        while (itV.hasNext()) {
            z5mVar.d((z5m) itV.next());
        }
    }

    public static int d(Node node) {
        String localName = node.getLocalName();
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI == null && (("about".equals(localName) || alf.ID.equals(localName)) && (node instanceof Attr) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Attr) node).getOwnerElement().getNamespaceURI()))) {
            namespaceURI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        }
        if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
            return 0;
        }
        if ("li".equals(localName)) {
            return 9;
        }
        if ("parseType".equals(localName)) {
            return 4;
        }
        if ("Description".equals(localName)) {
            return 8;
        }
        if ("about".equals(localName)) {
            return 3;
        }
        if ("resource".equals(localName)) {
            return 5;
        }
        if ("RDF".equals(localName)) {
            return 1;
        }
        if (alf.ID.equals(localName)) {
            return 2;
        }
        if ("nodeID".equals(localName)) {
            return 6;
        }
        if ("datatype".equals(localName)) {
            return 7;
        }
        if ("aboutEach".equals(localName)) {
            return 10;
        }
        if ("aboutEachPrefix".equals(localName)) {
            return 11;
        }
        return "bagID".equals(localName) ? 12 : 0;
    }

    public static boolean e(int i) {
        return 1 <= i && i <= 7;
    }

    public static boolean f(int i) {
        return 10 <= i && i <= 12;
    }

    public static boolean g(int i) {
        if (i == 8 || f(i)) {
            return false;
        }
        return !e(i);
    }

    public static boolean h(Node node) {
        if (node.getNodeType() != 3) {
            return false;
        }
        String nodeValue = node.getNodeValue();
        for (int i = 0; i < nodeValue.length(); i++) {
            if (!Character.isWhitespace(nodeValue.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static x5m i(Node node) throws XMPException {
        x5m x5mVar = new x5m();
        u(x5mVar, node);
        return x5mVar;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:89:0x014e  */
    public static void j(x5m x5mVar, z5m z5mVar, Node node, boolean z) throws XMPException {
        boolean z2;
        int i;
        Node nodeItem;
        String nodeName;
        if (node.hasChildNodes()) {
            throw new XMPException("Nested content not allowed with rdf:resource or property attributes", 202);
        }
        Node node2 = null;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        for (int i2 = 0; i2 < node.getAttributes().getLength(); i2++) {
            Node nodeItem2 = node.getAttributes().item(i2);
            if (!"xmlns".equals(nodeItem2.getPrefix()) && (nodeItem2.getPrefix() != null || !"xmlns".equals(nodeItem2.getNodeName()))) {
                int iD = d(nodeItem2);
                if (iD != 0) {
                    if (iD == 2) {
                        continue;
                    } else if (iD != 5) {
                        if (iD != 6) {
                            throw new XMPException("Unrecognized attribute of empty property element", 202);
                        }
                        if (z4) {
                            throw new XMPException("Empty property element can't have both rdf:resource and rdf:nodeID", 202);
                        }
                        z6 = true;
                    } else {
                        if (z6) {
                            throw new XMPException("Empty property element can't have both rdf:resource and rdf:nodeID", 202);
                        }
                        if (z3) {
                            throw new XMPException("Empty property element can't have both rdf:value and rdf:resource", 203);
                        }
                        if (!z3) {
                            node2 = nodeItem2;
                        }
                        z4 = true;
                    }
                } else if ("value".equals(nodeItem2.getLocalName()) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(nodeItem2.getNamespaceURI())) {
                    if (z4) {
                        throw new XMPException("Empty property element can't have both rdf:value and rdf:resource", 203);
                    }
                    node2 = nodeItem2;
                    z3 = true;
                } else if (!"xml:lang".equals(nodeItem2.getNodeName())) {
                    z5 = true;
                }
            }
        }
        z5m z5mVarA = a(x5mVar, z5mVar, node, "", z);
        if (!z3 && !z4) {
            if (z5) {
                z5mVarA.I().B(true);
                z2 = true;
            }
            for (i = 0; i < node.getAttributes().getLength(); i++) {
                nodeItem = node.getAttributes().item(i);
                if (nodeItem == node2 && !"xmlns".equals(nodeItem.getPrefix()) && (nodeItem.getPrefix() != null || !"xmlns".equals(nodeItem.getNodeName()))) {
                    int iD2 = d(nodeItem);
                    if (iD2 == 0) {
                        nodeName = nodeItem.getNodeName();
                        if (!z2) {
                            b(z5mVarA, nodeName, nodeItem.getNodeValue());
                        } else if ("xml:lang".equals(nodeName)) {
                            b(z5mVarA, "xml:lang", nodeItem.getNodeValue());
                        } else {
                            a(x5mVar, z5mVarA, nodeItem, nodeItem.getNodeValue(), false);
                        }
                    } else if (iD2 != 2) {
                        if (iD2 == 5) {
                            nodeName = "rdf:resource";
                            b(z5mVarA, nodeName, nodeItem.getNodeValue());
                        } else if (iD2 != 6) {
                            throw new XMPException("Unrecognized attribute of empty property element", 202);
                        }
                    }
                }
            }
        }
        z5mVarA.k0(node2 != null ? node2.getNodeValue() : "");
        if (!z3) {
            z5mVarA.I().C(true);
        }
        z2 = false;
        while (i < node.getAttributes().getLength()) {
            nodeItem = node.getAttributes().item(i);
            if (nodeItem == node2) {
            }
        }
    }

    public static void k(x5m x5mVar, z5m z5mVar, Node node, boolean z) throws XMPException {
        z5m z5mVarA = a(x5mVar, z5mVar, node, null, z);
        for (int i = 0; i < node.getAttributes().getLength(); i++) {
            Node nodeItem = node.getAttributes().item(i);
            if (!"xmlns".equals(nodeItem.getPrefix()) && (nodeItem.getPrefix() != null || !"xmlns".equals(nodeItem.getNodeName()))) {
                String namespaceURI = nodeItem.getNamespaceURI();
                String localName = nodeItem.getLocalName();
                if ("xml:lang".equals(nodeItem.getNodeName())) {
                    b(z5mVarA, "xml:lang", nodeItem.getNodeValue());
                } else if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI) || (!alf.ID.equals(localName) && !"datatype".equals(localName))) {
                    throw new XMPException("Invalid attribute for literal property element", 202);
                }
            }
        }
        String str = "";
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); i2++) {
            Node nodeItem2 = node.getChildNodes().item(i2);
            if (nodeItem2.getNodeType() != 3) {
                throw new XMPException("Invalid child of literal property element", 202);
            }
            str = str + nodeItem2.getNodeValue();
        }
        z5mVarA.k0(str);
    }

    public static void l(x5m x5mVar, z5m z5mVar, Node node, boolean z) throws XMPException {
        int iD = d(node);
        if (iD != 8 && iD != 0) {
            throw new XMPException("Node element must be rdf:Description or typed node", 202);
        }
        if (z && iD == 0) {
            throw new XMPException("Top level typed node not allowed", 203);
        }
        m(x5mVar, z5mVar, node, z);
        t(x5mVar, z5mVar, node, z);
    }

    public static void m(x5m x5mVar, z5m z5mVar, Node node, boolean z) throws XMPException {
        int i = 0;
        for (int i2 = 0; i2 < node.getAttributes().getLength(); i2++) {
            Node nodeItem = node.getAttributes().item(i2);
            if (!"xmlns".equals(nodeItem.getPrefix()) && (nodeItem.getPrefix() != null || !"xmlns".equals(nodeItem.getNodeName()))) {
                int iD = d(nodeItem);
                if (iD == 0) {
                    a(x5mVar, z5mVar, nodeItem, nodeItem.getNodeValue(), z);
                } else {
                    if (iD != 6 && iD != 2 && iD != 3) {
                        throw new XMPException("Invalid nodeElement attribute", 202);
                    }
                    if (i > 0) {
                        throw new XMPException("Mutally exclusive about, ID, nodeID attributes", 202);
                    }
                    i++;
                    if (z && iD == 3) {
                        if (z5mVar.H() == null || z5mVar.H().length() <= 0) {
                            z5mVar.h0(nodeItem.getNodeValue());
                        } else if (!z5mVar.H().equals(nodeItem.getNodeValue())) {
                            throw new XMPException("Mismatched top level rdf:about values", 203);
                        }
                    }
                }
            }
        }
    }

    public static void n(x5m x5mVar, z5m z5mVar, Node node) throws XMPException {
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            Node nodeItem = node.getChildNodes().item(i);
            if (!h(nodeItem)) {
                l(x5mVar, z5mVar, nodeItem, true);
            }
        }
    }

    public static void o() throws XMPException {
        throw new XMPException("ParseTypeCollection property element not allowed", 203);
    }

    public static void p() throws XMPException {
        throw new XMPException("ParseTypeLiteral property element not allowed", 203);
    }

    public static void q() throws XMPException {
        throw new XMPException("ParseTypeOther property element not allowed", 203);
    }

    public static void r(x5m x5mVar, z5m z5mVar, Node node, boolean z) throws XMPException {
        z5m z5mVarA = a(x5mVar, z5mVar, node, "", z);
        z5mVarA.I().B(true);
        for (int i = 0; i < node.getAttributes().getLength(); i++) {
            Node nodeItem = node.getAttributes().item(i);
            if (!"xmlns".equals(nodeItem.getPrefix()) && (nodeItem.getPrefix() != null || !"xmlns".equals(nodeItem.getNodeName()))) {
                String localName = nodeItem.getLocalName();
                String namespaceURI = nodeItem.getNamespaceURI();
                if ("xml:lang".equals(nodeItem.getNodeName())) {
                    b(z5mVarA, "xml:lang", nodeItem.getNodeValue());
                } else if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI) || (!alf.ID.equals(localName) && !"parseType".equals(localName))) {
                    throw new XMPException("Invalid attribute for ParseTypeResource property element", 202);
                }
            }
        }
        t(x5mVar, z5mVarA, node, false);
        if (z5mVarA.G()) {
            c(z5mVarA);
        }
    }

    public static void s(x5m x5mVar, z5m z5mVar, Node node, boolean z) throws XMPException {
        if (!g(d(node))) {
            throw new XMPException("Invalid property element name", 202);
        }
        NamedNodeMap attributes = node.getAttributes();
        ArrayList arrayList = null;
        for (int i = 0; i < attributes.getLength(); i++) {
            Node nodeItem = attributes.item(i);
            if ("xmlns".equals(nodeItem.getPrefix()) || (nodeItem.getPrefix() == null && "xmlns".equals(nodeItem.getNodeName()))) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(nodeItem.getNodeName());
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                attributes.removeNamedItem((String) it.next());
            }
        }
        if (attributes.getLength() <= 3) {
            for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                Node nodeItem2 = attributes.item(i2);
                String localName = nodeItem2.getLocalName();
                String namespaceURI = nodeItem2.getNamespaceURI();
                String nodeValue = nodeItem2.getNodeValue();
                if (!"xml:lang".equals(nodeItem2.getNodeName()) || (alf.ID.equals(localName) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI))) {
                    if ("datatype".equals(localName) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                        k(x5mVar, z5mVar, node, z);
                        return;
                    }
                    if (!"parseType".equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                        j(x5mVar, z5mVar, node, z);
                        return;
                    }
                    if ("Literal".equals(nodeValue)) {
                        p();
                        return;
                    }
                    if ("Resource".equals(nodeValue)) {
                        r(x5mVar, z5mVar, node, z);
                        return;
                    } else if ("Collection".equals(nodeValue)) {
                        o();
                        return;
                    } else {
                        q();
                        return;
                    }
                }
            }
            if (node.hasChildNodes()) {
                for (int i3 = 0; i3 < node.getChildNodes().getLength(); i3++) {
                    if (node.getChildNodes().item(i3).getNodeType() != 3) {
                        v(x5mVar, z5mVar, node, z);
                        return;
                    }
                }
                k(x5mVar, z5mVar, node, z);
                return;
            }
        }
        j(x5mVar, z5mVar, node, z);
    }

    public static void t(x5m x5mVar, z5m z5mVar, Node node, boolean z) throws XMPException {
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            Node nodeItem = node.getChildNodes().item(i);
            if (!h(nodeItem)) {
                if (nodeItem.getNodeType() != 1) {
                    throw new XMPException("Expected property element node not found", 202);
                }
                s(x5mVar, z5mVar, nodeItem, z);
            }
        }
    }

    public static void u(x5m x5mVar, Node node) throws XMPException {
        if (!node.hasAttributes()) {
            throw new XMPException("Invalid attributes of rdf:RDF element", 202);
        }
        n(x5mVar, x5mVar.c(), node);
    }

    public static void v(x5m x5mVar, z5m z5mVar, Node node, boolean z) throws XMPException {
        if (z && "iX:changes".equals(node.getNodeName())) {
            return;
        }
        z5m z5mVarA = a(x5mVar, z5mVar, node, "", z);
        for (int i = 0; i < node.getAttributes().getLength(); i++) {
            Node nodeItem = node.getAttributes().item(i);
            if (!"xmlns".equals(nodeItem.getPrefix()) && (nodeItem.getPrefix() != null || !"xmlns".equals(nodeItem.getNodeName()))) {
                String localName = nodeItem.getLocalName();
                String namespaceURI = nodeItem.getNamespaceURI();
                if ("xml:lang".equals(nodeItem.getNodeName())) {
                    b(z5mVarA, "xml:lang", nodeItem.getNodeValue());
                } else if (!alf.ID.equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                    throw new XMPException("Invalid attribute for resource property element", 202);
                }
            }
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < node.getChildNodes().getLength(); i2++) {
            Node nodeItem2 = node.getChildNodes().item(i2);
            if (!h(nodeItem2)) {
                if (nodeItem2.getNodeType() != 1 || z2) {
                    if (!z2) {
                        throw new XMPException("Children of resource property element must be XML elements", 202);
                    }
                    throw new XMPException("Invalid child of resource property element", 202);
                }
                boolean zEquals = "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(nodeItem2.getNamespaceURI());
                String localName2 = nodeItem2.getLocalName();
                if (zEquals && "Bag".equals(localName2)) {
                    z5mVarA.I().s(true);
                } else if (zEquals && "Seq".equals(localName2)) {
                    z5mVarA.I().s(true).v(true);
                } else if (zEquals && "Alt".equals(localName2)) {
                    z5mVarA.I().s(true).v(true).u(true);
                } else {
                    z5mVarA.I().B(true);
                    if (!zEquals && !"Description".equals(localName2)) {
                        String namespaceURI2 = nodeItem2.getNamespaceURI();
                        if (namespaceURI2 == null) {
                            throw new XMPException("All XML elements must be in a namespace", 203);
                        }
                        b(z5mVarA, "rdf:type", namespaceURI2 + ':' + localName2);
                    }
                }
                l(x5mVar, z5mVarA, nodeItem2, false);
                if (z5mVarA.G()) {
                    c(z5mVarA);
                } else if (z5mVarA.I().k()) {
                    a6m.d(z5mVarA);
                }
                z2 = true;
            }
        }
        if (!z2) {
            throw new XMPException("Missing child of resource property element", 202);
        }
    }
}

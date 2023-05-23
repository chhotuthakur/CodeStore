package com.frbandro.codestore;

public class CodeModel {
    
    String id,xmlcode,javacode;

    public CodeModel() {
    }

    public CodeModel(String id, String xmlcode, String javacode) {
        this.id = id;
        this.xmlcode = xmlcode;
        this.javacode = javacode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getXmlcode() {
        return xmlcode;
    }

    public void setXmlcode(String xmlcode) {
        this.xmlcode = xmlcode;
    }

    public String getJavacode() {
        return javacode;
    }

    public void setJavacode(String javacode) {
        this.javacode = javacode;
    }
}

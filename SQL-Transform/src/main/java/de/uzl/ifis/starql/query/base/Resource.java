package de.uzl.ifis.starql.query.base;

public class Resource {
private String ResourceType = "";
private String ResourceIri = "";

public Resource(String nType, String nIri){
	ResourceType = nType;
	ResourceIri = nIri;
}

public String getResourceType() {
	return ResourceType;
}
public void setResourceType(String resourceType) {
	ResourceType = resourceType;
}
public String getResourceIri() {
	return ResourceIri;
}
public void setResourceIri(String resourceIri) {
	ResourceIri = resourceIri;
}

}

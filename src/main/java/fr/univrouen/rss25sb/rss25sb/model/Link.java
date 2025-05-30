package fr.univrouen.rss25sb.rss25sb.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Link {
    private String rel;
    private String type;
    private String href;

    // Getters and setters
    public String getRel() { return rel; }
    public void setRel(String rel) { this.rel = rel; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public String getHref() { return href; }
    public void setHref(String href) { this.href = href; }
}
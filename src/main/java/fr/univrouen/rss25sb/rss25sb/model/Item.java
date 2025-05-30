package fr.univrouen.rss25sb.rss25sb.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String guid;
    private String title;

    // Spécification du nom de la colonne pour éviter les conflits de nom
    @ElementCollection
    @CollectionTable(name = "item_categories", joinColumns = @JoinColumn(name = "item_id"))
    private List<Category> categories;

    private String published;
    private String updated;

    // Utilisation de @Embedded pour l'image et le contenu, sans duplication de colonne
    @Embedded
    private Image image;

    @Embedded
    private Content content;

    // Idem pour les auteurs et les contributeurs
    @ElementCollection
    @CollectionTable(name = "item_authors", joinColumns = @JoinColumn(name = "item_id"))
    private List<Person> authors;

    @ElementCollection
    @CollectionTable(name = "item_contributors", joinColumns = @JoinColumn(name = "item_id"))
    private List<Person> contributors;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getGuid() { return guid; }
    public void setGuid(String guid) { this.guid = guid; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public List<Category> getCategories() { return categories; }
    public void setCategories(List<Category> categories) { this.categories = categories; }

    public String getPublished() { return published; }
    public void setPublished(String published) { this.published = published; }

    public String getUpdated() { return updated; }
    public void setUpdated(String updated) { this.updated = updated; }

    public Image getImage() { return image; }
    public void setImage(Image image) { this.image = image; }

    public Content getContent() { return content; }
    public void setContent(Content content) { this.content = content; }

    public List<Person> getAuthors() { return authors; }
    public void setAuthors(List<Person> authors) { this.authors = authors; }

    public List<Person> getContributors() { return contributors; }
    public void setContributors(List<Person> contributors) { this.contributors = contributors; }
}

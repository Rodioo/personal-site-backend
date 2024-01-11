package com.antonio_falcescu.personal_site_backend.project;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String platform;

    @Column(name = "short_description")
    private String shortDescription;

    @Column(name = "long_description")
    private String longDescription;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_at")
    private Date createdAt;

    @Temporal(TemporalType.DATE)
    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "cover_image_path")
    private String coverImagePath;

    @Column(name = "git_link")
    private String gitLink;
    @Column(name = "app_link")
    private String appLink;

    private String stack;

    public Project(
            String title, String platform, String shortDescription, String longDescription,
            Date createdAt, Date updatedAt, String coverImagePath, String gitLink, String appLink, String stack
    ) {
        this.title = title;
        this.platform = platform;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.coverImagePath = coverImagePath;
        this.gitLink = gitLink;
        this.appLink = appLink;
        this.stack = stack;
    }
}

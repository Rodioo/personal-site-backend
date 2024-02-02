package com.antonio_falcescu.personal_site_backend.article;

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
@Table(name = "articles")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String topic;
    private String link;

    @Column(name = "cover_image_path")
    private String coverImagePath;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_at")
    private Date createdAt;
}

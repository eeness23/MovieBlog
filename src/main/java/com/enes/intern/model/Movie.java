package com.enes.intern.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter

public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @NonNull
    private String name;

    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date publishYear;

    @NonNull
    @Lob
    private String description;

    @Transient
    private MultipartFile image;

    private String imageName;

    @ManyToMany
    @JoinTable(
            name = "Movie_Cast",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "cast_id")
    )

    @JsonIgnore
    private Set<Cast> casts;

    @ManyToMany
    @JoinTable(
            name = "Movie_Category",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )

    @JsonIgnore
    private Set<Category> categories;

    @ManyToMany(mappedBy = "movies",fetch = FetchType.EAGER)
    @JsonBackReference
    private Set<Collection> collections;

    @ManyToOne
    @JsonIgnore
    private Language language;

    public void addCast(Cast cast){
        if(casts==null){
            casts=new HashSet<>();
        }
        casts.add(cast);
    }
}

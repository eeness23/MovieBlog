package com.enes.intern.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;


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

    @OneToOne
    private Image image;

    @ManyToMany
    @JoinTable(
            name = "Movie_Cast",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "cast_id")
    )
    private Set<Cast> casts;

    @ManyToMany
    @JoinTable(
            name = "Movie_Category",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> categories;

    @ManyToMany(mappedBy = "movies")
    private Set<Collection> collections;

    @ManyToOne
    private Language language;

    public void addCast(Cast cast){
        if(casts==null){
            casts=new HashSet<>();
        }
        casts.add(cast);
    }
}

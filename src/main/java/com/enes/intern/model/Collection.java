package com.enes.intern.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Collection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    @ManyToMany
    @JoinTable(
            name = "Collection_User",
            joinColumns = @JoinColumn(name = "collection_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "user_id",referencedColumnName = "id")
    )
    @JsonManagedReference
    private Set<User> users;

    @ManyToMany
    @JoinTable(
            name = "Collection_Movies",
            joinColumns = @JoinColumn(name = "collection_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id")
    )
    @JsonManagedReference
    private Set<Movie> movies;

    public void addMovie(Movie movie){
        if(movies==null){
            movies=new HashSet<>();
        }
        movies.add(movie);
    }
    public void addUser(User user){
        if(users==null){
            users=new HashSet<>();
        }
        users.add(user);
        if(user.getCollections()==null){
            Set<Collection> collections = new HashSet<>();
            collections.add(this);
            user.setCollections(collections);
        }else{
            Set<Collection> collections = user.getCollections();
            collections.add(this);
            user.setCollections(collections);
        }
    }

}

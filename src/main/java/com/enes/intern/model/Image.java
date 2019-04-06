package com.enes.intern.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    private String modifiedFileName;

    private String fileExtension;

    @OneToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

}

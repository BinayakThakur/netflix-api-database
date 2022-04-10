package com.needle.model;

import lombok.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Component
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EnableJpaRepositories
@Entity(name = "netflix")
public class Netflix  implements Serializable {
    @Column
    @Id
    public @Getter @Setter
    String SHOW_ID;
    @Column(length = 15000)
    public @Getter @Setter
    String TYPE_;
    @Column(length = 15000)
    public @Getter @Setter
    String TITLE;
    @Column(length = 15000)
    public @Getter @Setter
    String DIRECTOR;
    @Column(length = 15000)
    public @Getter @Setter
    String CAST_;
    @Column(length = 15000)
    public @Getter @Setter
    String COUNTRY;
    @Column(length = 15000)
    public @Getter @Setter
    String DATE_ADDED;
    @Column(length = 15000)
    public @Getter @Setter
    String RELEASE_YEAR;
    @Column(length = 15000)
    public @Getter @Setter
    String RATING;
    @Column(length = 15000)
    public @Getter @Setter
    String DURATION;
    @Column(length = 15000)
    public @Getter @Setter
    String LISTED_IN;
    @Column(length = 15000)
    public @Getter @Setter
    String DESCRIPTION;
}

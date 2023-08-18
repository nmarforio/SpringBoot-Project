package com.okta.developer.jugtours.model;

// Lombok is an annotation processor that work on complie-time to add code into your class, usefull to avoid a lot of code like @Setter and @Getter or @Data

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.time.Instant;
import java.util.Set;

@Data // generate constructor with required arguments, ToString method and Hascode and equals implementation, check non-transient Field
@NoArgsConstructor
@AllArgsConstructor
@Builder // Build complex object with the whatever value available
@Entity
public class Event {

    @Id
    @GeneratedValue
    private Long id;
    private Instant date;
    private String title;
    private String description;
    @ManyToMany
    private Set<User> attendees;
}

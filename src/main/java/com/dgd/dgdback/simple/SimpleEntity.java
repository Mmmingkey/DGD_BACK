package com.dgd.dgdback.simple;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="test", schema = "scm_dgd")
@Getter
@Setter
public class SimpleEntity {
    public SimpleEntity(String just){
        this.just = just;
    };
    public SimpleEntity() {}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer testId;
    @Column(name="just")
    private String just;
}

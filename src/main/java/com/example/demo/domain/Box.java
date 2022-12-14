package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Box {

    @Id
    private Integer id;

    @Column(name = "contained_in")
    private Integer contained;
}

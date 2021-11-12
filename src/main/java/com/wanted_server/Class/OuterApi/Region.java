package com.wanted_server.Class.OuterApi;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
@Getter
@NoArgsConstructor
@Setter
public class Region {

    @Column(name = "region_id")
    @Id
    Long id;
    String region_name;
}


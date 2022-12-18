package com.guillerdev97.artists.persistance.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Timestamp;

@MappedSuperclass
@Data
public class HiddenData implements Serializable {
    private static final long serialVersionUID = -6067509018111355224L;

    @CreationTimestamp
    @Column(name = "create_date")
    private Timestamp createDate;

    @Column(name = "update_date")
    private Timestamp updateDate;
}

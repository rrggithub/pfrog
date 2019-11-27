package com.org.data.application.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Order implements Serializable {
    @Id
    private long id;
    @Temporal(TemporalType.DATE)
    private Date date;
}

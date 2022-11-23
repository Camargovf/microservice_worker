package org.camargovf.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tb_worker") //javax interface
public class Worker implements Serializable {
    private static final long serialVersionUID = 1L; // Serializable transformado em bytes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double dailyIncome;

}

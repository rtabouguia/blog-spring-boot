/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blog.api.blog.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import lombok.*;
/**
 *
 * @author RAISA
 */ 
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name= "t_category")
public class TCategory implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String title;
    private String description;
    private Date date_ajout;
 
}

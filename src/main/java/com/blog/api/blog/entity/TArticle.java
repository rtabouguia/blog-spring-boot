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
@Table(name = "t_article")
public class TArticle implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String Title;
    private String Description;
    private Date save;
    
    @ManyToOne
    @JoinColumn(name= "fk_category")
    private TCategory fk_category;
    
    @ManyToOne
    @JoinColumn(name= "fk_user")
    private TUser fk_user;
    
    
}

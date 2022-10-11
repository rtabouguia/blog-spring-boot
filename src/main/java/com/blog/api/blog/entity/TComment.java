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
public class TComment implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @ManyToOne
    private TUser fk_user;
    
    @ManyToOne
    @JoinColumn(name= "fk_article")
    private TArticle fk_article;
    
    private String commentaire;
    
    private Date publication;
}

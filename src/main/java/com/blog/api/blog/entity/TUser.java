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
@Table(name = "t_user")
public class TUser implements Serializable {
    
    @Id
     @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String username;
    private String firstname;
    private String lastname;
    private Date inscription;
    private Date age;
     
    @ManyToOne
    @JoinColumn(name = "fk_pays")
   private TPays fk_pays;
    
}

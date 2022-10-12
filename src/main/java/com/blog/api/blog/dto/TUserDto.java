/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blog.api.blog.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import lombok.*;

/**
 *
 * @author RAISA
 * DTo: Data Acces Object constitue des objets qui vont contenir les données
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class TUserDto {
    
    @JsonProperty("id")
     private Long id;
    
    @JsonProperty("username")
    private String username;
    
    @JsonProperty("firstname")
    private String firstname;
    
     @JsonProperty("lastname")
    private String lastname;
      @JsonProperty("inscription")
      
    private Date inscription;
      
     @JsonProperty("age")
    private Date age;

   @JsonProperty("fk_pays")
   private TPaysDto fk_pays;
}

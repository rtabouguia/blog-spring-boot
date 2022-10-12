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
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class TArticleDto {
    
    @JsonProperty("id")
    private Long id;
    
     @JsonProperty("title")
    private String title;
     
      @JsonProperty("description")
    private String description;
      
       @JsonProperty("save")
    private Date save;
    
    @JsonProperty("fk_category")
    private TCategoryDto fk_category;
    
     @JsonProperty("fk_user")
    private TUserDto fk_user;
}

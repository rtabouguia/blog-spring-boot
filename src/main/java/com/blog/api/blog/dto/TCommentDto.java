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
public class TCommentDto {
    
    @JsonProperty("id")
      private Long id;
    
      @JsonProperty("fk_user")
    private TUserDto fk_user;
    
   @JsonProperty("fk_article")
    private TArticleDto fk_article;
    
     @JsonProperty("commentaire")
    private String commentaire;
    
    @JsonProperty("publication")
    private Date publication;
}

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
public class TCategoryDto {
    @JsonProperty("id")
     private Long id;
    
     @JsonProperty("title")
    private String title;
     
      @JsonProperty("description")
    private String description;
      
     @JsonProperty("date_ajout")
    private Date date_ajout;
}

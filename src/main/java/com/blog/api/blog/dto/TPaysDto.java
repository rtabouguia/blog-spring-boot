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
public class TPaysDto {
    
    @JsonProperty("id")
     private Long id;
    
    @JsonProperty("nom")
    private String nom;
    
    @JsonProperty("description")
    private String description;
    
    @JsonProperty("ajout")
    private Date ajout;
}
